package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import defpackage.tw;

public enum h {
    START,
    CENTER,
    END;
    
    private static final boolean HAS_RTL = false;

    @SuppressLint({"RtlHardcoded"})
    public final int getGravityInt() {
        switch (i.a[ordinal()]) {
            case tw.a /*1*/:
                return HAS_RTL ? 8388611 : 3;
            case tw.b /*2*/:
                return 1;
            case f.c /*3*/:
                return HAS_RTL ? 8388613 : 5;
            default:
                throw new IllegalStateException("Invalid gravity constant");
        }
    }

    @TargetApi(17)
    public final int getTextAlignment() {
        switch (i.a[ordinal()]) {
            case tw.b /*2*/:
                return 4;
            case f.c /*3*/:
                return 6;
            default:
                return 5;
        }
    }
}
