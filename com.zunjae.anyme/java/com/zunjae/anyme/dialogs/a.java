package com.zunjae.anyme.dialogs;

import android.view.View;
import defpackage.cr;

final class a extends cr {
    final /* synthetic */ ADMWarningDialog b;
    final /* synthetic */ ADMWarningDialog_ViewBinding c;

    a(ADMWarningDialog_ViewBinding aDMWarningDialog_ViewBinding, ADMWarningDialog aDMWarningDialog) {
        this.c = aDMWarningDialog_ViewBinding;
        this.b = aDMWarningDialog;
    }

    public final void a(View view) {
        this.b.onSaveAndUpdateButtonClicked();
    }
}
