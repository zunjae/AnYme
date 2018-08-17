package com.zunjae.anyme.activities;

import android.view.View;
import defpackage.cr;

final class g extends cr {
    final /* synthetic */ LoginActivity b;
    final /* synthetic */ LoginActivity_ViewBinding c;

    g(LoginActivity_ViewBinding loginActivity_ViewBinding, LoginActivity loginActivity) {
        this.c = loginActivity_ViewBinding;
        this.b = loginActivity;
    }

    public final void a(View view) {
        this.b.onForgotPasswordClicked();
    }
}
