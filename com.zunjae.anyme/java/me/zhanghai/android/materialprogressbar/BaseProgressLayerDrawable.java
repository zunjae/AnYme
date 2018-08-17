package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.graphics.ColorUtils;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

class BaseProgressLayerDrawable<ProgressDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable, BackgroundDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable> extends LayerDrawable implements IntrinsicPaddingDrawable, MaterialProgressDrawable, ShowBackgroundDrawable, TintableDrawable {
    private float mBackgroundAlpha;
    private BackgroundDrawableType mBackgroundDrawable = ((IntrinsicPaddingDrawable) getDrawable(0));
    private ProgressDrawableType mProgressDrawable;
    private ProgressDrawableType mSecondaryProgressDrawable;

    public BaseProgressLayerDrawable(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, 0.0f, context);
        setId(0, 16908288);
        setId(1, 16908303);
        this.mSecondaryProgressDrawable = (IntrinsicPaddingDrawable) getDrawable(1);
        setId(2, 16908301);
        this.mProgressDrawable = (IntrinsicPaddingDrawable) getDrawable(2);
        setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, -16777216, context));
    }

    public boolean getShowBackground() {
        return ((ShowBackgroundDrawable) this.mBackgroundDrawable).getShowBackground();
    }

    public boolean getUseIntrinsicPadding() {
        return this.mBackgroundDrawable.getUseIntrinsicPadding();
    }

    public void setShowBackground(boolean z) {
        if (((ShowBackgroundDrawable) this.mBackgroundDrawable).getShowBackground() != z) {
            ((ShowBackgroundDrawable) this.mBackgroundDrawable).setShowBackground(z);
            ((ShowBackgroundDrawable) this.mSecondaryProgressDrawable).setShowBackground(z ^ 1);
        }
    }

    @SuppressLint({"NewApi"})
    public void setTint(int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(i, Math.round(((float) Color.alpha(i)) * this.mBackgroundAlpha));
        ((TintableDrawable) this.mBackgroundDrawable).setTint(alphaComponent);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTint(alphaComponent);
        ((TintableDrawable) this.mProgressDrawable).setTint(i);
    }

    @SuppressLint({"NewApi"})
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList withAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                getClass().getSimpleName();
            }
            withAlpha = colorStateList.withAlpha(Math.round(this.mBackgroundAlpha * 255.0f));
        } else {
            withAlpha = null;
        }
        ((TintableDrawable) this.mBackgroundDrawable).setTintList(withAlpha);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTintList(withAlpha);
        ((TintableDrawable) this.mProgressDrawable).setTintList(colorStateList);
    }

    @SuppressLint({"NewApi"})
    public void setTintMode(Mode mode) {
        ((TintableDrawable) this.mBackgroundDrawable).setTintMode(mode);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTintMode(mode);
        ((TintableDrawable) this.mProgressDrawable).setTintMode(mode);
    }

    public void setUseIntrinsicPadding(boolean z) {
        this.mBackgroundDrawable.setUseIntrinsicPadding(z);
        this.mSecondaryProgressDrawable.setUseIntrinsicPadding(z);
        this.mProgressDrawable.setUseIntrinsicPadding(z);
    }
}
