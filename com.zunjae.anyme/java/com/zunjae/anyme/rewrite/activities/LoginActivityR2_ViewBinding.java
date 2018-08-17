package com.zunjae.anyme.rewrite.activities;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class LoginActivityR2_ViewBinding implements Unbinder {
    private LoginActivityR2 b;
    private View c;
    private View d;

    public LoginActivityR2_ViewBinding(LoginActivityR2 loginActivityR2, View view) {
        this.b = loginActivityR2;
        loginActivityR2.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
        View a = ct.a(view, R.id.loginButton, "field 'loginButton' and method 'onLoginButtonClicked'");
        loginActivityR2.loginButton = (Button) ct.b(a, R.id.loginButton, "field 'loginButton'", Button.class);
        this.c = a;
        a.setOnClickListener(new c(this, loginActivityR2));
        view = ct.a(view, R.id.registerButton, "method 'onCreateAccountButtonClicked'");
        this.d = view;
        view.setOnClickListener(new d(this, loginActivityR2));
    }

    public final void a() {
        LoginActivityR2 loginActivityR2 = this.b;
        if (loginActivityR2 != null) {
            this.b = null;
            loginActivityR2.viewPager = null;
            loginActivityR2.loginButton = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
