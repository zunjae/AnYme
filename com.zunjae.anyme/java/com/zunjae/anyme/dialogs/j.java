package com.zunjae.anyme.dialogs;

import android.view.View;
import defpackage.cr;

final class j extends cr {
    final /* synthetic */ UpdateDialog b;
    final /* synthetic */ UpdateDialog_ViewBinding c;

    j(UpdateDialog_ViewBinding updateDialog_ViewBinding, UpdateDialog updateDialog) {
        this.c = updateDialog_ViewBinding;
        this.b = updateDialog;
    }

    public final void a(View view) {
        this.b.onReadChangelogButtonClicked();
    }
}
