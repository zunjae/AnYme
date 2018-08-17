package com.zunjae.anyme.dialogs.animeDialog;

import android.view.View;
import android.widget.RadioButton;
import defpackage.cr;
import defpackage.ct;

final class d extends cr {
    final /* synthetic */ MiscSettingsDialog b;
    final /* synthetic */ MiscSettingsDialog_ViewBinding c;

    d(MiscSettingsDialog_ViewBinding miscSettingsDialog_ViewBinding, MiscSettingsDialog miscSettingsDialog) {
        this.c = miscSettingsDialog_ViewBinding;
        this.b = miscSettingsDialog;
    }

    public final void a(View view) {
        this.b.onRadioButtonClicked((RadioButton) ct.a((Object) view, "doClick", "onRadioButtonClicked", RadioButton.class));
    }
}
