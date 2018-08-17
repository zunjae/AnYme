package com.zunjae.anyme.activities.misc;

import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public final class KanonExplanation_ViewBinding implements Unbinder {
    private KanonExplanation b;
    private View c;

    public KanonExplanation_ViewBinding(KanonExplanation kanonExplanation, View view) {
        this.b = kanonExplanation;
        view = ct.a(view, R.id.loginButton, "field 'loginButton' and method 'onJoinButtonClicked'");
        kanonExplanation.loginButton = (FancyButton) ct.b(view, R.id.loginButton, "field 'loginButton'", FancyButton.class);
        this.c = view;
        view.setOnClickListener(new f(this, kanonExplanation));
    }

    public final void a() {
        KanonExplanation kanonExplanation = this.b;
        if (kanonExplanation != null) {
            this.b = null;
            kanonExplanation.loginButton = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
