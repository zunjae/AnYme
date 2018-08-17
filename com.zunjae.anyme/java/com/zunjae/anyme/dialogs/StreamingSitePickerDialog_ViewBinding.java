package com.zunjae.anyme.dialogs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class StreamingSitePickerDialog_ViewBinding implements Unbinder {
    private StreamingSitePickerDialog b;

    public StreamingSitePickerDialog_ViewBinding(StreamingSitePickerDialog streamingSitePickerDialog, View view) {
        this.b = streamingSitePickerDialog;
        streamingSitePickerDialog.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        streamingSitePickerDialog.rememberStreamingApp = (CheckBox) ct.a(view, (int) R.id.rememberStreamingApp, "field 'rememberStreamingApp'", CheckBox.class);
    }

    public final void a() {
        StreamingSitePickerDialog streamingSitePickerDialog = this.b;
        if (streamingSitePickerDialog != null) {
            this.b = null;
            streamingSitePickerDialog.recyclerView = null;
            streamingSitePickerDialog.rememberStreamingApp = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
