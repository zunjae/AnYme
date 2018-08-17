package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

abstract class BaseIndeterminateProgressDrawable extends BaseProgressDrawable implements Animatable {
    protected Animator[] mAnimators;

    @SuppressLint({"NewApi"})
    public BaseIndeterminateProgressDrawable(Context context) {
        setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, -16777216, context));
    }

    private boolean isStarted() {
        for (Animator isStarted : this.mAnimators) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (isStarted()) {
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        for (Animator isRunning : this.mAnimators) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (!isStarted()) {
            for (Animator start : this.mAnimators) {
                start.start();
            }
            invalidateSelf();
        }
    }

    public void stop() {
        for (Animator end : this.mAnimators) {
            end.end();
        }
    }
}
