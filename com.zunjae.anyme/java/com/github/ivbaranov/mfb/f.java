package com.github.ivbaranov.mfb;

import android.content.res.Resources;
import android.util.TypedValue;

public final class f {
    public static int a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
