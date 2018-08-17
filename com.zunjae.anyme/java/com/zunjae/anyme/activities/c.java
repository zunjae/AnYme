package com.zunjae.anyme.activities;

import android.view.View;
import defpackage.cr;

final class c extends cr {
    final /* synthetic */ LoginActivity b;
    final /* synthetic */ LoginActivity_ViewBinding c;

    c(LoginActivity_ViewBinding loginActivity_ViewBinding, LoginActivity loginActivity) {
        this.c = loginActivity_ViewBinding;
        this.b = loginActivity;
    }

    public final void a(View view) {
        this.b.onCreateAccountButtonClicked();
    }
}
