package com.zunjae.anyme.activities;

import android.view.View;
import defpackage.cr;

final class f extends cr {
    final /* synthetic */ LoginActivity b;
    final /* synthetic */ LoginActivity_ViewBinding c;

    f(LoginActivity_ViewBinding loginActivity_ViewBinding, LoginActivity loginActivity) {
        this.c = loginActivity_ViewBinding;
        this.b = loginActivity;
    }

    public final void a(View view) {
        this.b.onCantLoginTextClicked();
    }
}
