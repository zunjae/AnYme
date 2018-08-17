package com.zunjae.anyme.dialogs;

import android.view.View;
import android.widget.Spinner;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public final class SubscribeAnimeDialog_ViewBinding implements Unbinder {
    private SubscribeAnimeDialog b;
    private View c;

    public SubscribeAnimeDialog_ViewBinding(SubscribeAnimeDialog subscribeAnimeDialog, View view) {
        this.b = subscribeAnimeDialog;
        subscribeAnimeDialog.numberPicker = (Spinner) ct.a(view, (int) R.id.numberPicker, "field 'numberPicker'", Spinner.class);
        view = ct.a(view, R.id.notifyButton, "field 'notifyButton' and method 'onNotifyButtonClicked'");
        subscribeAnimeDialog.notifyButton = (FancyButton) ct.b(view, R.id.notifyButton, "field 'notifyButton'", FancyButton.class);
        this.c = view;
        view.setOnClickListener(new h(this, subscribeAnimeDialog));
    }

    public final void a() {
        SubscribeAnimeDialog subscribeAnimeDialog = this.b;
        if (subscribeAnimeDialog != null) {
            this.b = null;
            subscribeAnimeDialog.numberPicker = null;
            subscribeAnimeDialog.notifyButton = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
