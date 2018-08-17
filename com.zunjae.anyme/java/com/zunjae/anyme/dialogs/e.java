package com.zunjae.anyme.dialogs;

import android.view.View;
import defpackage.cr;

final class e extends cr {
    final /* synthetic */ MakeAccountDialog b;
    final /* synthetic */ MakeAccountDialog_ViewBinding c;

    e(MakeAccountDialog_ViewBinding makeAccountDialog_ViewBinding, MakeAccountDialog makeAccountDialog) {
        this.c = makeAccountDialog_ViewBinding;
        this.b = makeAccountDialog;
    }

    public final void a(View view) {
        this.b.onExplanationButtonClicked();
    }
}
