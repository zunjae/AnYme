package com.zunjae.anyme.adapters.pickers;

import android.view.View;
import android.view.View.OnClickListener;
import defpackage.alf;

final class c implements OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ alf b;
    final /* synthetic */ CastPickerAdapter c;

    c(CastPickerAdapter castPickerAdapter, boolean z, alf alf) {
        this.c = castPickerAdapter;
        this.a = z;
        this.b = alf;
    }

    public final void onClick(View view) {
        if (this.a) {
            this.c.c.a(this.b);
        } else {
            this.c.c.b(this.b);
        }
    }
}
