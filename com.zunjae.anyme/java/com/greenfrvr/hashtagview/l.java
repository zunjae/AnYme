package com.greenfrvr.hashtagview;

import android.view.View;
import android.widget.TextView;

final class l<T> implements Comparable<l> {
    protected T a;
    protected View b;
    protected float c;
    protected boolean d;

    public l(T t) {
        this.a = t;
    }

    private void a(CharSequence charSequence) {
        ((TextView) this.b.findViewById(R.id.text)).setText(charSequence);
    }

    final void a(int i, int i2, int i3, int i4) {
        TextView textView = (TextView) this.b.findViewById(R.id.text);
        if (this.d) {
            i = i2;
        }
        if (this.d) {
            i3 = i4;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, i3, 0);
        this.b.setSelected(this.d);
        this.b.invalidate();
    }

    final void a(h<T> hVar) {
        if (hVar instanceof g) {
            if (this.d) {
                a(((g) hVar).b(this.a));
                return;
            }
            a(hVar.a(this.a));
        }
    }

    final void b(int i, int i2, int i3, int i4) {
        this.d ^= 1;
        a(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        l lVar = (l) obj;
        float f = this.c;
        float f2 = lVar.c;
        return f == f2 ? 0 : f < f2 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && this.a.equals(((l) obj).a);
    }

    public final String toString() {
        return String.format("Item data: title - %s, width - %f", new Object[]{this.a.toString(), Float.valueOf(this.c)});
    }
}
