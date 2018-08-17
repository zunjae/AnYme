package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class MaterialProgressBar extends ProgressBar {
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_DYNAMIC = 1;
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_NORMAL = 0;
    public static final int PROGRESS_STYLE_CIRCULAR = 0;
    public static final int PROGRESS_STYLE_HORIZONTAL = 1;
    private static final String TAG = "MaterialProgressBar";
    private int mProgressStyle;
    private TintInfo mProgressTintInfo = new TintInfo();
    private boolean mSuperInitialized = true;

    class TintInfo {
        public boolean mHasIndeterminateTint;
        public boolean mHasIndeterminateTintMode;
        public boolean mHasProgressBackgroundTint;
        public boolean mHasProgressBackgroundTintMode;
        public boolean mHasProgressTint;
        public boolean mHasProgressTintMode;
        public boolean mHasSecondaryProgressTint;
        public boolean mHasSecondaryProgressTintMode;
        public ColorStateList mIndeterminateTint;
        public Mode mIndeterminateTintMode;
        public ColorStateList mProgressBackgroundTint;
        public Mode mProgressBackgroundTintMode;
        public ColorStateList mProgressTint;
        public Mode mProgressTintMode;
        public ColorStateList mSecondaryProgressTint;
        public Mode mSecondaryProgressTintMode;

        private TintInfo() {
        }
    }

    public MaterialProgressBar(Context context) {
        super(context);
        init(null, PROGRESS_STYLE_CIRCULAR, PROGRESS_STYLE_CIRCULAR);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, PROGRESS_STYLE_CIRCULAR, PROGRESS_STYLE_CIRCULAR);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, PROGRESS_STYLE_CIRCULAR);
    }

    @TargetApi(21)
    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    private void applyIndeterminateTint() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if (tintInfo.mHasIndeterminateTint || tintInfo.mHasIndeterminateTintMode) {
                indeterminateDrawable.mutate();
                tintInfo = this.mProgressTintInfo;
                applyTintForDrawable(indeterminateDrawable, tintInfo.mIndeterminateTint, tintInfo.mHasIndeterminateTint, tintInfo.mIndeterminateTintMode, tintInfo.mHasIndeterminateTintMode);
            }
        }
    }

    private void applyPrimaryProgressTint() {
        if (getProgressDrawable() != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if (tintInfo.mHasProgressTint || tintInfo.mHasProgressTintMode) {
                Drawable tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908301, true);
                if (tintTargetFromProgressDrawable != null) {
                    tintInfo = this.mProgressTintInfo;
                    applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo.mProgressTint, tintInfo.mHasProgressTint, tintInfo.mProgressTintMode, tintInfo.mHasProgressTintMode);
                }
            }
        }
    }

    private void applyProgressBackgroundTint() {
        if (getProgressDrawable() != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if (tintInfo.mHasProgressBackgroundTint || tintInfo.mHasProgressBackgroundTintMode) {
                Drawable tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908288, false);
                if (tintTargetFromProgressDrawable != null) {
                    tintInfo = this.mProgressTintInfo;
                    applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo.mProgressBackgroundTint, tintInfo.mHasProgressBackgroundTint, tintInfo.mProgressBackgroundTintMode, tintInfo.mHasProgressBackgroundTintMode);
                }
            }
        }
    }

    private void applyProgressTints() {
        if (getProgressDrawable() != null) {
            applyPrimaryProgressTint();
            applyProgressBackgroundTint();
            applySecondaryProgressTint();
        }
    }

    private void applySecondaryProgressTint() {
        if (getProgressDrawable() != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if (tintInfo.mHasSecondaryProgressTint || tintInfo.mHasSecondaryProgressTintMode) {
                Drawable tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908303, false);
                if (tintTargetFromProgressDrawable != null) {
                    tintInfo = this.mProgressTintInfo;
                    applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo.mSecondaryProgressTint, tintInfo.mHasSecondaryProgressTint, tintInfo.mSecondaryProgressTintMode, tintInfo.mHasSecondaryProgressTintMode);
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void applyTintForDrawable(Drawable drawable, ColorStateList colorStateList, boolean z, Mode mode, boolean z2) {
        if (z || z2) {
            if (z) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintList(colorStateList);
                } else if (VERSION.SDK_INT >= 21) {
                    drawable.setTintList(colorStateList);
                }
            }
            if (z2) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintMode(mode);
                } else if (VERSION.SDK_INT >= 21) {
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    private void fixCanvasScalingAndColorFilterWhenHardwareAccelerated() {
        if (VERSION.SDK_INT < 21 && isHardwareAccelerated() && getLayerType() != PROGRESS_STYLE_HORIZONTAL) {
            setLayerType(PROGRESS_STYLE_HORIZONTAL, null);
        }
    }

    private Drawable getTintTargetFromProgressDrawable(int i, boolean z) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable findDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i) : null;
        if (findDrawableByLayerId == null && z) {
            findDrawableByLayerId = progressDrawable;
        }
        return findDrawableByLayerId;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(android.util.AttributeSet r9, int r10, int r11) {
        /*
        r8 = this;
        r0 = r8.getContext();
        r1 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar;
        r9 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r1, r10, r11);
        r10 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressStyle;
        r11 = 0;
        r10 = r9.getInt(r10, r11);
        r8.mProgressStyle = r10;
        r10 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_setBothDrawables;
        r10 = r9.getBoolean(r10, r11);
        r1 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_useIntrinsicPadding;
        r2 = 1;
        r1 = r9.getBoolean(r1, r2);
        r3 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_showProgressBackground;
        r4 = r8.mProgressStyle;
        if (r4 != r2) goto L_0x0028;
    L_0x0026:
        r4 = 1;
        goto L_0x0029;
    L_0x0028:
        r4 = 0;
    L_0x0029:
        r3 = r9.getBoolean(r3, r4);
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle;
        r11 = r9.getInt(r4, r11);
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressTint;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x0049;
    L_0x003b:
        r4 = r8.mProgressTintInfo;
        r5 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressTint;
        r5 = r9.getColorStateList(r5);
        r4.mProgressTint = r5;
        r4 = r8.mProgressTintInfo;
        r4.mHasProgressTint = r2;
    L_0x0049:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressTintMode;
        r4 = r9.hasValue(r4);
        r5 = 0;
        r6 = -1;
        if (r4 == 0) goto L_0x0065;
    L_0x0053:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressTintMode;
        r7 = r9.getInt(r7, r6);
        r7 = me.zhanghai.android.materialprogressbar.internal.DrawableCompat.parseTintMode(r7, r5);
        r4.mProgressTintMode = r7;
        r4 = r8.mProgressTintInfo;
        r4.mHasProgressTintMode = r2;
    L_0x0065:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_secondaryProgressTint;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x007b;
    L_0x006d:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_secondaryProgressTint;
        r7 = r9.getColorStateList(r7);
        r4.mSecondaryProgressTint = r7;
        r4 = r8.mProgressTintInfo;
        r4.mHasSecondaryProgressTint = r2;
    L_0x007b:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x0095;
    L_0x0083:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode;
        r7 = r9.getInt(r7, r6);
        r7 = me.zhanghai.android.materialprogressbar.internal.DrawableCompat.parseTintMode(r7, r5);
        r4.mSecondaryProgressTintMode = r7;
        r4 = r8.mProgressTintInfo;
        r4.mHasSecondaryProgressTintMode = r2;
    L_0x0095:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressBackgroundTint;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x00ab;
    L_0x009d:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressBackgroundTint;
        r7 = r9.getColorStateList(r7);
        r4.mProgressBackgroundTint = r7;
        r4 = r8.mProgressTintInfo;
        r4.mHasProgressBackgroundTint = r2;
    L_0x00ab:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x00c5;
    L_0x00b3:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode;
        r7 = r9.getInt(r7, r6);
        r7 = me.zhanghai.android.materialprogressbar.internal.DrawableCompat.parseTintMode(r7, r5);
        r4.mProgressBackgroundTintMode = r7;
        r4 = r8.mProgressTintInfo;
        r4.mHasProgressBackgroundTintMode = r2;
    L_0x00c5:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_indeterminateTint;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x00db;
    L_0x00cd:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_indeterminateTint;
        r7 = r9.getColorStateList(r7);
        r4.mIndeterminateTint = r7;
        r4 = r8.mProgressTintInfo;
        r4.mHasIndeterminateTint = r2;
    L_0x00db:
        r4 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_indeterminateTintMode;
        r4 = r9.hasValue(r4);
        if (r4 == 0) goto L_0x00f5;
    L_0x00e3:
        r4 = r8.mProgressTintInfo;
        r7 = me.zhanghai.android.materialprogressbar.R.styleable.MaterialProgressBar_mpb_indeterminateTintMode;
        r6 = r9.getInt(r7, r6);
        r5 = me.zhanghai.android.materialprogressbar.internal.DrawableCompat.parseTintMode(r6, r5);
        r4.mIndeterminateTintMode = r5;
        r4 = r8.mProgressTintInfo;
        r4.mHasIndeterminateTintMode = r2;
    L_0x00f5:
        r9.recycle();
        r9 = r8.mProgressStyle;
        switch(r9) {
            case 0: goto L_0x0137;
            case 1: goto L_0x0113;
            default: goto L_0x00fd;
        };
    L_0x00fd:
        r9 = new java.lang.IllegalArgumentException;
        r10 = new java.lang.StringBuilder;
        r11 = "Unknown progress style: ";
        r10.<init>(r11);
        r11 = r8.mProgressStyle;
        r10.append(r11);
        r10 = r10.toString();
        r9.<init>(r10);
        throw r9;
    L_0x0113:
        r9 = r8.isIndeterminate();
        if (r9 != 0) goto L_0x011b;
    L_0x0119:
        if (r10 == 0) goto L_0x0129;
    L_0x011b:
        r9 = r8.isInEditMode();
        if (r9 != 0) goto L_0x0129;
    L_0x0121:
        r9 = new me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
        r9.<init>(r0);
        r8.setIndeterminateDrawable(r9);
    L_0x0129:
        r9 = r8.isIndeterminate();
        if (r9 == 0) goto L_0x0131;
    L_0x012f:
        if (r10 == 0) goto L_0x015d;
    L_0x0131:
        r9 = new me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
        r9.<init>(r0);
        goto L_0x015a;
    L_0x0137:
        r9 = r8.isIndeterminate();
        if (r9 != 0) goto L_0x013f;
    L_0x013d:
        if (r10 == 0) goto L_0x014d;
    L_0x013f:
        r9 = r8.isInEditMode();
        if (r9 != 0) goto L_0x014d;
    L_0x0145:
        r9 = new me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
        r9.<init>(r0);
        r8.setIndeterminateDrawable(r9);
    L_0x014d:
        r9 = r8.isIndeterminate();
        if (r9 == 0) goto L_0x0155;
    L_0x0153:
        if (r10 == 0) goto L_0x015d;
    L_0x0155:
        r9 = new me.zhanghai.android.materialprogressbar.CircularProgressDrawable;
        r9.<init>(r11, r0);
    L_0x015a:
        r8.setProgressDrawable(r9);
    L_0x015d:
        r8.setUseIntrinsicPadding(r1);
        r8.setShowProgressBackground(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.zhanghai.android.materialprogressbar.MaterialProgressBar.init(android.util.AttributeSet, int, int):void");
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public ColorStateList getIndeterminateTintList() {
        return this.mProgressTintInfo.mIndeterminateTint;
    }

    public Mode getIndeterminateTintMode() {
        return this.mProgressTintInfo.mIndeterminateTintMode;
    }

    public ColorStateList getProgressBackgroundTintList() {
        return this.mProgressTintInfo.mProgressBackgroundTint;
    }

    public Mode getProgressBackgroundTintMode() {
        return this.mProgressTintInfo.mProgressBackgroundTintMode;
    }

    public int getProgressStyle() {
        return this.mProgressStyle;
    }

    public ColorStateList getProgressTintList() {
        return this.mProgressTintInfo.mProgressTint;
    }

    public Mode getProgressTintMode() {
        return this.mProgressTintInfo.mProgressTintMode;
    }

    public ColorStateList getSecondaryProgressTintList() {
        return this.mProgressTintInfo.mSecondaryProgressTint;
    }

    public Mode getSecondaryProgressTintMode() {
        return this.mProgressTintInfo.mSecondaryProgressTintMode;
    }

    public boolean getShowProgressBackground() {
        Drawable currentDrawable = getCurrentDrawable();
        return currentDrawable instanceof ShowBackgroundDrawable ? ((ShowBackgroundDrawable) currentDrawable).getShowBackground() : false;
    }

    public boolean getUseIntrinsicPadding() {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            return ((IntrinsicPaddingDrawable) currentDrawable).getUseIntrinsicPadding();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fixCanvasScalingAndColorFilterWhenHardwareAccelerated();
    }

    public synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        if (this.mSuperInitialized) {
            getCurrentDrawable();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyIndeterminateTint();
        }
    }

    public void setIndeterminateTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTint = colorStateList;
        tintInfo.mHasIndeterminateTint = true;
        applyIndeterminateTint();
    }

    public void setIndeterminateTintMode(Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTintMode = mode;
        tintInfo.mHasIndeterminateTintMode = true;
        applyIndeterminateTint();
    }

    public void setProgressBackgroundTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTint = colorStateList;
        tintInfo.mHasProgressBackgroundTint = true;
        applyProgressBackgroundTint();
    }

    public void setProgressBackgroundTintMode(Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTintMode = mode;
        tintInfo.mHasProgressBackgroundTintMode = true;
        applyProgressBackgroundTint();
    }

    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyProgressTints();
        }
    }

    public void setProgressTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTint = colorStateList;
        tintInfo.mHasProgressTint = true;
        applyPrimaryProgressTint();
    }

    public void setProgressTintMode(Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTintMode = mode;
        tintInfo.mHasProgressTintMode = true;
        applyPrimaryProgressTint();
    }

    public void setSecondaryProgressTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTint = colorStateList;
        tintInfo.mHasSecondaryProgressTint = true;
        applySecondaryProgressTint();
    }

    public void setSecondaryProgressTintMode(Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTintMode = mode;
        tintInfo.mHasSecondaryProgressTintMode = true;
        applySecondaryProgressTint();
    }

    public void setShowProgressBackground(boolean z) {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) currentDrawable).setShowBackground(z);
        }
        currentDrawable = getIndeterminateDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) currentDrawable).setShowBackground(z);
        }
    }

    public void setUseIntrinsicPadding(boolean z) {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) currentDrawable).setUseIntrinsicPadding(z);
        }
        currentDrawable = getIndeterminateDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) currentDrawable).setUseIntrinsicPadding(z);
        }
    }
}
