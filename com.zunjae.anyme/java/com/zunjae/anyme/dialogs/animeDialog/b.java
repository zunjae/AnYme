package com.zunjae.anyme.dialogs.animeDialog;

import android.view.View;
import defpackage.cr;

final class b extends cr {
    final /* synthetic */ MiscSettingsDialog b;
    final /* synthetic */ MiscSettingsDialog_ViewBinding c;

    b(MiscSettingsDialog_ViewBinding miscSettingsDialog_ViewBinding, MiscSettingsDialog miscSettingsDialog) {
        this.c = miscSettingsDialog_ViewBinding;
        this.b = miscSettingsDialog;
    }

    public final void a(View view) {
        this.b.onSaveButtonClick();
    }
}
