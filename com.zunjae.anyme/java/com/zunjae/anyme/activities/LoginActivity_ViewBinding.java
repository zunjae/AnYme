package com.zunjae.anyme.activities;

import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public final class LoginActivity_ViewBinding implements Unbinder {
    private LoginActivity b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;

    public LoginActivity_ViewBinding(LoginActivity loginActivity, View view) {
        this.b = loginActivity;
        View a = ct.a(view, R.id.setupLoginButton, "field 'loginButton' and method 'onLoginButtonClicked'");
        loginActivity.loginButton = (FancyButton) ct.b(a, R.id.setupLoginButton, "field 'loginButton'", FancyButton.class);
        this.c = a;
        a.setOnClickListener(new b(this, loginActivity));
        loginActivity.setupInputUsername = (TextView) ct.a(view, (int) R.id.setupInputUsername, "field 'setupInputUsername'", TextView.class);
        loginActivity.setupInputPassword = (TextView) ct.a(view, (int) R.id.setupInputPassword, "field 'setupInputPassword'", TextView.class);
        a = ct.a(view, R.id.setupRegisterButton, "field 'registerButton' and method 'onCreateAccountButtonClicked'");
        loginActivity.registerButton = (FancyButton) ct.b(a, R.id.setupRegisterButton, "field 'registerButton'", FancyButton.class);
        this.d = a;
        a.setOnClickListener(new c(this, loginActivity));
        loginActivity.appName = (TextView) ct.a(view, (int) R.id.setupActivityAppName, "field 'appName'", TextView.class);
        a = ct.a(view, R.id.activitySetupShowPassword, "field 'showPasswordCheckBox' and method 'onShowPasswordCheckBoxClicked'");
        loginActivity.showPasswordCheckBox = (CheckBox) ct.b(a, R.id.activitySetupShowPassword, "field 'showPasswordCheckBox'", CheckBox.class);
        this.e = a;
        a.setOnClickListener(new d(this, loginActivity));
        a = ct.a(view, R.id.useKissAnimeTextView, "field 'useKissAnimeLight' and method 'onKissAnimeTextViewClick'");
        loginActivity.useKissAnimeLight = (TextView) ct.b(a, R.id.useKissAnimeTextView, "field 'useKissAnimeLight'", TextView.class);
        this.f = a;
        a.setOnClickListener(new e(this, loginActivity));
        a = ct.a(view, R.id.cantLoginText, "field 'cantLoginText' and method 'onCantLoginTextClicked'");
        loginActivity.cantLoginText = (TextView) ct.b(a, R.id.cantLoginText, "field 'cantLoginText'", TextView.class);
        this.g = a;
        a.setOnClickListener(new f(this, loginActivity));
        a = ct.a(view, R.id.setupForgotPassword, "method 'onForgotPasswordClicked'");
        this.h = a;
        a.setOnClickListener(new g(this, loginActivity));
        Resources resources = view.getContext().getResources();
        loginActivity.bMalRegisterLink = resources.getString(R.string.mal_register_url);
        loginActivity.bMalForgotPasswordLink = resources.getString(R.string.mal_forgot_password_url);
        loginActivity.bEmptyTextWarning = resources.getString(R.string.setup_forgot_text);
        loginActivity.bOkayMessage = resources.getString(R.string.global_accept_message);
        loginActivity.bInvalidLoginMessage = resources.getString(R.string.setup_incorrect_login_message);
        loginActivity.bLoadingTextMessage = resources.getString(R.string.global_loading_please_wait);
        loginActivity.bIncorrectLoginMessage = resources.getString(R.string.setup_incorrect_login_title);
        loginActivity.bNoInternetConnectionMessage = resources.getString(R.string.global_no_internet);
        loginActivity.bWarningTitleMessage = resources.getString(R.string.global_warning_title);
    }

    public final void a() {
        LoginActivity loginActivity = this.b;
        if (loginActivity != null) {
            this.b = null;
            loginActivity.loginButton = null;
            loginActivity.setupInputUsername = null;
            loginActivity.setupInputPassword = null;
            loginActivity.registerButton = null;
            loginActivity.appName = null;
            loginActivity.showPasswordCheckBox = null;
            loginActivity.useKissAnimeLight = null;
            loginActivity.cantLoginText = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
