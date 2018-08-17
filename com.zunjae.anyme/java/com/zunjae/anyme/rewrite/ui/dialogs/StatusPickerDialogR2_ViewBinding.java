package com.zunjae.anyme.rewrite.ui.dialogs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class StatusPickerDialogR2_ViewBinding implements Unbinder {
    private StatusPickerDialogR2 b;

    public StatusPickerDialogR2_ViewBinding(StatusPickerDialogR2 statusPickerDialogR2, View view) {
        this.b = statusPickerDialogR2;
        statusPickerDialogR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        StatusPickerDialogR2 statusPickerDialogR2 = this.b;
        if (statusPickerDialogR2 != null) {
            this.b = null;
            statusPickerDialogR2.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
