package com.zunjae.anyme.dialogs;

import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class MakeAccountDialog_ViewBinding implements Unbinder {
    private MakeAccountDialog b;
    private View c;
    private View d;
    private View e;
    private View f;

    public MakeAccountDialog_ViewBinding(MakeAccountDialog makeAccountDialog, View view) {
        this.b = makeAccountDialog;
        View a = ct.a(view, R.id.createAccountButton, "method 'onCreateAccountButtonClick'");
        this.c = a;
        a.setOnClickListener(new d(this, makeAccountDialog));
        a = ct.a(view, R.id.explainWhyButton, "method 'onExplanationButtonClicked'");
        this.d = a;
        a.setOnClickListener(new e(this, makeAccountDialog));
        a = ct.a(view, R.id.ignoreButton, "method 'onCloseButtonClick'");
        this.e = a;
        a.setOnClickListener(new f(this, makeAccountDialog));
        a = ct.a(view, R.id.loginButton, "method 'onLoginButtonClicked'");
        this.f = a;
        a.setOnClickListener(new g(this, makeAccountDialog));
        makeAccountDialog.bMalRegisterLink = view.getContext().getResources().getString(R.string.mal_register_url);
    }

    public final void a() {
        if (this.b != null) {
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
