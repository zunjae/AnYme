package com.zunjae.anyme.dialogs;

import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public final class ADMWarningDialog_ViewBinding implements Unbinder {
    private ADMWarningDialog b;
    private View c;

    public ADMWarningDialog_ViewBinding(ADMWarningDialog aDMWarningDialog, View view) {
        this.b = aDMWarningDialog;
        view = ct.a(view, R.id.saveAndUpdate, "field 'saveAndUpdateButton' and method 'onSaveAndUpdateButtonClicked'");
        aDMWarningDialog.saveAndUpdateButton = (FancyButton) ct.b(view, R.id.saveAndUpdate, "field 'saveAndUpdateButton'", FancyButton.class);
        this.c = view;
        view.setOnClickListener(new a(this, aDMWarningDialog));
    }

    public final void a() {
        ADMWarningDialog aDMWarningDialog = this.b;
        if (aDMWarningDialog != null) {
            this.b = null;
            aDMWarningDialog.saveAndUpdateButton = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
