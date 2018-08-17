package com.zunjae.anyme.dialogs.animeDialog;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public class MiscSettingsDialog_ViewBinding implements Unbinder {
    private MiscSettingsDialog b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;

    public MiscSettingsDialog_ViewBinding(MiscSettingsDialog miscSettingsDialog, View view) {
        this.b = miscSettingsDialog;
        View a = ct.a(view, R.id.saveAndUpdate, "field 'saveAndUpdateButton' and method 'onSaveButtonClick'");
        miscSettingsDialog.saveAndUpdateButton = (FancyButton) ct.b(a, R.id.saveAndUpdate, "field 'saveAndUpdateButton'", FancyButton.class);
        this.c = a;
        a.setOnClickListener(new b(this, miscSettingsDialog));
        a = ct.a(view, R.id.skipIntro0, "field 'skipIntro0' and method 'onRadioButtonClicked'");
        miscSettingsDialog.skipIntro0 = (RadioButton) ct.b(a, R.id.skipIntro0, "field 'skipIntro0'", RadioButton.class);
        this.d = a;
        a.setOnClickListener(new c(this, miscSettingsDialog));
        a = ct.a(view, R.id.skipIntro30, "field 'skipIntro30' and method 'onRadioButtonClicked'");
        miscSettingsDialog.skipIntro30 = (RadioButton) ct.b(a, R.id.skipIntro30, "field 'skipIntro30'", RadioButton.class);
        this.e = a;
        a.setOnClickListener(new d(this, miscSettingsDialog));
        a = ct.a(view, R.id.skipIntro60, "field 'skipIntro60' and method 'onRadioButtonClicked'");
        miscSettingsDialog.skipIntro60 = (RadioButton) ct.b(a, R.id.skipIntro60, "field 'skipIntro60'", RadioButton.class);
        this.f = a;
        a.setOnClickListener(new e(this, miscSettingsDialog));
        a = ct.a(view, R.id.skipIntro90, "field 'skipIntro90' and method 'onRadioButtonClicked'");
        miscSettingsDialog.skipIntro90 = (RadioButton) ct.b(a, R.id.skipIntro90, "field 'skipIntro90'", RadioButton.class);
        this.g = a;
        a.setOnClickListener(new f(this, miscSettingsDialog));
        miscSettingsDialog.userInputAnimeSync = (EditText) ct.a(view, (int) R.id.userInputAnimeSync, "field 'userInputAnimeSync'", EditText.class);
    }

    public final void a() {
        MiscSettingsDialog miscSettingsDialog = this.b;
        if (miscSettingsDialog != null) {
            this.b = null;
            miscSettingsDialog.saveAndUpdateButton = null;
            miscSettingsDialog.skipIntro0 = null;
            miscSettingsDialog.skipIntro30 = null;
            miscSettingsDialog.skipIntro60 = null;
            miscSettingsDialog.skipIntro90 = null;
            miscSettingsDialog.userInputAnimeSync = null;
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
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
