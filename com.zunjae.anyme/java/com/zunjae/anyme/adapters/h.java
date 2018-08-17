package com.zunjae.anyme.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import defpackage.alo;
import defpackage.amv;
import defpackage.aui;
import defpackage.aux;

final class h implements OnClickListener {
    final /* synthetic */ alo a;
    final /* synthetic */ VideoHistoryAdapter b;

    h(VideoHistoryAdapter videoHistoryAdapter, alo alo) {
        this.b = videoHistoryAdapter;
        this.a = alo;
    }

    public final void onClick(View view) {
        aui.a().c(new amv(this.a));
        String a = this.b.b;
        alo alo = this.a;
        alo.a(System.currentTimeMillis());
        aux.a(a, alo, alo.class);
        this.b.c.dismiss();
    }
}
