package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.afollestad.materialdialogs.h;

public final class g {
    private static g w;
    public boolean a = false;
    public int b = 0;
    public int c = 0;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public ColorStateList f = null;
    public int g = 0;
    public int h = 0;
    public Drawable i = null;
    public int j = 0;
    public int k = 0;
    public ColorStateList l = null;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public h r;
    public h s;
    public h t;
    public h u;
    public h v;

    public g() {
        h hVar = h.START;
        this.r = hVar;
        this.s = hVar;
        this.t = h.END;
        hVar = h.START;
        this.u = hVar;
        this.v = hVar;
    }

    public static g a(boolean z) {
        if (w == null && z) {
            w = new g();
        }
        return w;
    }
}
