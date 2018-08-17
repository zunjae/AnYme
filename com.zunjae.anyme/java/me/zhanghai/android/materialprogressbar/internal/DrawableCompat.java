package me.zhanghai.android.materialprogressbar.internal;

import android.graphics.PorterDuff.Mode;
import mehdi.sakout.fancybuttons.R;

public class DrawableCompat {
    public static Mode parseTintMode(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case R.styleable.FancyButtonsAttrs_fb_iconColor /*14*/:
                return Mode.MULTIPLY;
            case R.styleable.FancyButtonsAttrs_fb_iconFont /*15*/:
                return Mode.SCREEN;
            case R.styleable.FancyButtonsAttrs_fb_iconPaddingBottom /*16*/:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
