package com.afollestad.materialdialogs;

import android.os.Build.VERSION;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Collections;
import java.util.List;

final class k implements OnGlobalLayoutListener {
    final /* synthetic */ j a;

    k(j jVar) {
        this.a = jVar;
    }

    public final void onGlobalLayout() {
        if (VERSION.SDK_INT < 16) {
            this.a.g.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            this.a.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        int i = this.a.r;
        if (i == w.b || i == w.c) {
            j jVar = this.a;
            if (jVar.r == w.b) {
                i = jVar.b.N;
                if (i < 0) {
                    return;
                }
            }
            List list = jVar.s;
            if (list != null) {
                if (list.size() != 0) {
                    Collections.sort(this.a.s);
                    i = ((Integer) this.a.s.get(0)).intValue();
                }
            }
            this.a.g.post(new l(this, i));
        }
    }
}
