package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;

public final class ahk {
    private ahq a = new ahq();
    private ahm b = new ahm(this.a);
    private ahp c = new ahp();
    private ahl d = new ahl(this.a);

    public final ahq a() {
        if (this.a == null) {
            this.a = new ahq();
        }
        return this.a;
    }

    public final Pair<Integer, Integer> a(int i, int i2) {
        ahq ahq = this.a;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int r = ahq.r();
        int a = ahq.a();
        int g = ahq.g();
        int b = ahq.b();
        int c = ahq.c();
        int d = ahq.d();
        int e = ahq.e();
        int f = ahq.f();
        a *= 2;
        ahr s = ahq.s();
        int i3 = 0;
        if (r != 0) {
            r = ((a * r) + ((g * 2) * r)) + (b * (r - 1));
            a += g;
            if (s == ahr.HORIZONTAL) {
                int i4 = a;
                a = r;
                r = i4;
            }
        } else {
            r = 0;
            a = 0;
        }
        if (ahq.t() == ago.DROP) {
            if (s == ahr.HORIZONTAL) {
                r *= 2;
            } else {
                a *= 2;
            }
        }
        c += e;
        d += f;
        ahr ahr = ahr.HORIZONTAL;
        a += c;
        r += d;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(a, size) : a;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(r, size2) : r;
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i3 = size2;
        }
        ahq.b(size);
        ahq.a(i3);
        return new Pair(Integer.valueOf(size), Integer.valueOf(i3));
    }

    public final void a(agf agf) {
        this.b.a(agf);
    }

    public final void a(aho aho) {
        this.b.a(aho);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.d.a(context, attributeSet);
    }

    public final void a(Canvas canvas) {
        this.b.a(canvas);
    }

    public final void a(MotionEvent motionEvent) {
        this.b.a(motionEvent);
    }
}
