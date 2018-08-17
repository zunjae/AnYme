package com.zunjae.anyme.adapters.pickers;

import android.view.View;
import android.view.View.OnClickListener;
import defpackage.alr;

final class g implements OnClickListener {
    final /* synthetic */ alr a;
    final /* synthetic */ StreamHostPickerAdapter b;

    g(StreamHostPickerAdapter streamHostPickerAdapter, alr alr) {
        this.b = streamHostPickerAdapter;
        this.a = alr;
    }

    public final void onClick(View view) {
        this.b.c.onSiteClicked(this.a);
    }
}
