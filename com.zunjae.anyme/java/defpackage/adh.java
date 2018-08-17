package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;

public final class adh {
    private final Context a;
    private final TypedArray b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public adh(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    private static adf a(adf adf, Context context) {
        return adf == null ? new adf(context) : adf;
    }

    private adf a(adf adf, boolean z) {
        adf = adh.b(adf);
        String string = this.b.getString(this.c);
        if (!TextUtils.isEmpty(string)) {
            adf = adh.a(adf, this.a).a(string);
        }
        ColorStateList colorStateList = this.b.getColorStateList(this.e);
        if (colorStateList != null) {
            adf = adh.a(adf, this.a).a(colorStateList);
        }
        int dimensionPixelSize = this.b.getDimensionPixelSize(this.d, -1);
        if (dimensionPixelSize != -1) {
            adf = adh.a(adf, this.a).h(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getDimensionPixelSize(this.f, -1);
        if (dimensionPixelSize != -1) {
            adf = adh.a(adf, this.a).e(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getColor(this.g, Integer.MIN_VALUE);
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            adf = adh.a(adf, this.a).j(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getDimensionPixelSize(this.h, -1);
        if (dimensionPixelSize != -1) {
            adf = adh.a(adf, this.a).n(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getColor(this.i, Integer.MIN_VALUE);
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            adf = adh.a(adf, this.a).l(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getDimensionPixelSize(this.j, -1);
        if (dimensionPixelSize != -1) {
            adf = adh.a(adf, this.a).m(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getColor(this.k, Integer.MIN_VALUE);
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            adf = adh.a(adf, this.a).i(dimensionPixelSize);
        }
        dimensionPixelSize = this.b.getDimensionPixelSize(this.l, -1);
        if (dimensionPixelSize != -1) {
            adf = adh.a(adf, this.a).o(dimensionPixelSize);
        }
        return z ? adh.a(adf, this.a) : adf;
    }

    private static adf b(adf adf) {
        return adf != null ? adf.a() : null;
    }

    public final adf a() {
        return a(null, true);
    }

    public final adf a(adf adf) {
        return a(adf, false);
    }

    public final adh a(int i) {
        this.c = i;
        return this;
    }

    public final adf b() {
        return a(null, false);
    }

    public final adh b(int i) {
        this.d = i;
        return this;
    }

    public final adh c(int i) {
        this.e = i;
        return this;
    }

    public final adh d(int i) {
        this.f = i;
        return this;
    }

    public final adh e(int i) {
        this.g = i;
        return this;
    }

    public final adh f(int i) {
        this.h = i;
        return this;
    }

    public final adh g(int i) {
        this.i = i;
        return this;
    }

    public final adh h(int i) {
        this.j = i;
        return this;
    }

    public final adh i(int i) {
        this.k = i;
        return this;
    }

    public final adh j(int i) {
        this.l = i;
        return this;
    }
}
