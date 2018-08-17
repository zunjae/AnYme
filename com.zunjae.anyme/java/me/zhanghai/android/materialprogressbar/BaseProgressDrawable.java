package me.zhanghai.android.materialprogressbar;

abstract class BaseProgressDrawable extends BasePaintDrawable implements IntrinsicPaddingDrawable {
    protected boolean mUseIntrinsicPadding = true;

    BaseProgressDrawable() {
    }

    public boolean getUseIntrinsicPadding() {
        return this.mUseIntrinsicPadding;
    }

    public void setUseIntrinsicPadding(boolean z) {
        if (this.mUseIntrinsicPadding != z) {
            this.mUseIntrinsicPadding = z;
            invalidateSelf();
        }
    }
}
