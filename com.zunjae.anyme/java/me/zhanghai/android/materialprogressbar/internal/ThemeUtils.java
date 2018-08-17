package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i, int i2, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            i2 = obtainStyledAttributes.getColor(0, i2);
            return i2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i, float f, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            f = obtainStyledAttributes.getFloat(0, f);
            return f;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
