package com.zunjae.anyme.dialogs;

import android.view.View;
import defpackage.cr;

final class f extends cr {
    final /* synthetic */ MakeAccountDialog b;
    final /* synthetic */ MakeAccountDialog_ViewBinding c;

    f(MakeAccountDialog_ViewBinding makeAccountDialog_ViewBinding, MakeAccountDialog makeAccountDialog) {
        this.c = makeAccountDialog_ViewBinding;
        this.b = makeAccountDialog;
    }

    public final void a(View view) {
        this.b.onCloseButtonClick();
    }
}
