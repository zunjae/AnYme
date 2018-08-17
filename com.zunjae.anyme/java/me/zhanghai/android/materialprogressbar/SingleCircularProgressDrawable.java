package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import defpackage.tw;
import mehdi.sakout.fancybuttons.R;

class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    SingleCircularProgressDrawable(int i) {
        float f;
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                f = START_ANGLE_MAX_NORMAL;
                break;
            case tw.a /*1*/:
                f = SWEEP_ANGLE_MAX;
                break;
            default:
                throw new IllegalArgumentException("Invalid value for style");
        }
        this.mStartAngleMax = f;
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    protected void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level != 0) {
            float f = ((float) level) / 10000.0f;
            float f2 = this.mStartAngleMax * f;
            f *= SWEEP_ANGLE_MAX;
            drawRing(canvas, paint, f2, f);
            if (this.mShowBackground) {
                drawRing(canvas, paint, f2, f);
            }
        }
    }

    protected boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    public void setShowBackground(boolean z) {
        if (this.mShowBackground != z) {
            this.mShowBackground = z;
            invalidateSelf();
        }
    }
}
