package com.zunjae.anyme.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import defpackage.ajm;
import defpackage.asp;

final class a implements OnClickListener {
    final /* synthetic */ asp a;
    final /* synthetic */ AllWaifusAdapter b;

    a(AllWaifusAdapter allWaifusAdapter, asp asp) {
        this.b = allWaifusAdapter;
        this.a = asp;
    }

    public final void onClick(View view) {
        ajm.a(this.b.b, this.a.d());
    }
}
