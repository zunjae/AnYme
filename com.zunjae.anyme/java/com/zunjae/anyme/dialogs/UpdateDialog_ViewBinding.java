package com.zunjae.anyme.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class UpdateDialog_ViewBinding implements Unbinder {
    private UpdateDialog b;
    private View c;
    private View d;

    public UpdateDialog_ViewBinding(UpdateDialog updateDialog, View view) {
        this.b = updateDialog;
        updateDialog.shortDescriptionText = (TextView) ct.a(view, (int) R.id.shortDescription, "field 'shortDescriptionText'", TextView.class);
        updateDialog.versionDifference = (TextView) ct.a(view, (int) R.id.versionDifference, "field 'versionDifference'", TextView.class);
        View a = ct.a(view, R.id.updateButton, "method 'onUpdateButtonClicked'");
        this.c = a;
        a.setOnClickListener(new i(this, updateDialog));
        view = ct.a(view, R.id.readChangelogButton, "method 'onReadChangelogButtonClicked'");
        this.d = view;
        view.setOnClickListener(new j(this, updateDialog));
    }

    public final void a() {
        UpdateDialog updateDialog = this.b;
        if (updateDialog != null) {
            this.b = null;
            updateDialog.shortDescriptionText = null;
            updateDialog.versionDifference = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
