package com.zunjae.anyme.rewrite.activities;

import android.view.View;
import defpackage.cr;

final class d extends cr {
    final /* synthetic */ LoginActivityR2 b;
    final /* synthetic */ LoginActivityR2_ViewBinding c;

    d(LoginActivityR2_ViewBinding loginActivityR2_ViewBinding, LoginActivityR2 loginActivityR2) {
        this.c = loginActivityR2_ViewBinding;
        this.b = loginActivityR2;
    }

    public final void a(View view) {
        this.b.onCreateAccountButtonClicked();
    }
}
