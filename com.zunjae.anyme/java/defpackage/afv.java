package defpackage;

import android.content.Context;

public class afv {
    private int a = Integer.MIN_VALUE;
    private int b = Integer.MIN_VALUE;
    private int c = Integer.MIN_VALUE;

    public final int a(Context context) {
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i = this.b;
        return i != Integer.MIN_VALUE ? (int) afz.a((float) i, context) : this.c != Integer.MIN_VALUE ? context.getResources().getDimensionPixelSize(this.c) : 0;
    }

    public final void b(int i) {
        this.b = i;
    }
}
