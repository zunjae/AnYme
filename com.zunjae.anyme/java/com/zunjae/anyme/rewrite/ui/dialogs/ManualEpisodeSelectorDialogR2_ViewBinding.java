package com.zunjae.anyme.rewrite.ui.dialogs;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;
import mehdi.sakout.fancybuttons.FancyButton;

public final class ManualEpisodeSelectorDialogR2_ViewBinding implements Unbinder {
    private ManualEpisodeSelectorDialogR2 b;
    private View c;

    public ManualEpisodeSelectorDialogR2_ViewBinding(ManualEpisodeSelectorDialogR2 manualEpisodeSelectorDialogR2, View view) {
        this.b = manualEpisodeSelectorDialogR2;
        manualEpisodeSelectorDialogR2.inputEpisode = (EditText) ct.a(view, (int) R.id.episodePickerManuallyEnter, "field 'inputEpisode'", EditText.class);
        View a = ct.a(view, R.id.episodePickerSaveButton, "field 'saveButton' and method 'saveButtonClick'");
        manualEpisodeSelectorDialogR2.saveButton = (FancyButton) ct.b(a, R.id.episodePickerSaveButton, "field 'saveButton'", FancyButton.class);
        this.c = a;
        a.setOnClickListener(new a(this, manualEpisodeSelectorDialogR2));
        manualEpisodeSelectorDialogR2.manualContainer = (LinearLayout) ct.a(view, (int) R.id.episodePickerManuallyViewGroup, "field 'manualContainer'", LinearLayout.class);
    }

    public final void a() {
        ManualEpisodeSelectorDialogR2 manualEpisodeSelectorDialogR2 = this.b;
        if (manualEpisodeSelectorDialogR2 != null) {
            this.b = null;
            manualEpisodeSelectorDialogR2.inputEpisode = null;
            manualEpisodeSelectorDialogR2.saveButton = null;
            manualEpisodeSelectorDialogR2.manualContainer = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
