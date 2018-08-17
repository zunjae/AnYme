package com.zunjae.anyme.dialogs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class CastDialog_ViewBinding implements Unbinder {
    private CastDialog b;

    public CastDialog_ViewBinding(CastDialog castDialog, View view) {
        this.b = castDialog;
        castDialog.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        castDialog.rememberCastingAppCheckbox = (CheckBox) ct.a(view, (int) R.id.rememberCastingApp, "field 'rememberCastingAppCheckbox'", CheckBox.class);
    }

    public final void a() {
        CastDialog castDialog = this.b;
        if (castDialog != null) {
            this.b = null;
            castDialog.recyclerView = null;
            castDialog.rememberCastingAppCheckbox = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
