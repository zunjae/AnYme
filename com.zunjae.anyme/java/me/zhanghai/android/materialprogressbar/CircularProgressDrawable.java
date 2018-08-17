package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

public class CircularProgressDrawable extends BaseProgressLayerDrawable<SingleCircularProgressDrawable, CircularProgressBackgroundDrawable> {
    public CircularProgressDrawable(int i, Context context) {
        super(new Drawable[]{new CircularProgressBackgroundDrawable(), new SingleCircularProgressDrawable(i), new SingleCircularProgressDrawable(i)}, context);
    }

    public /* bridge */ /* synthetic */ boolean getShowBackground() {
        return super.getShowBackground();
    }

    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    public /* bridge */ /* synthetic */ void setShowBackground(boolean z) {
        super.setShowBackground(z);
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }
}
