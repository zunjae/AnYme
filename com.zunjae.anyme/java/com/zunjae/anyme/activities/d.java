package com.zunjae.anyme.activities;

import android.view.View;
import android.widget.CheckBox;
import defpackage.cr;
import defpackage.ct;

final class d extends cr {
    final /* synthetic */ LoginActivity b;
    final /* synthetic */ LoginActivity_ViewBinding c;

    d(LoginActivity_ViewBinding loginActivity_ViewBinding, LoginActivity loginActivity) {
        this.c = loginActivity_ViewBinding;
        this.b = loginActivity;
    }

    public final void a(View view) {
        this.b.onShowPasswordCheckBoxClicked((CheckBox) ct.a((Object) view, "doClick", "onShowPasswordCheckBoxClicked", CheckBox.class));
    }
}
