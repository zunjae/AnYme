package com.zunjae.anyme.activities.settings;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class CustomizeActivity_ViewBinding implements Unbinder {
    private CustomizeActivity b;
    private View c;
    private View d;

    public CustomizeActivity_ViewBinding(CustomizeActivity customizeActivity, View view) {
        this.b = customizeActivity;
        customizeActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        customizeActivity.seekBarColumns = (SeekBar) ct.a(view, (int) R.id.seekBarColumns, "field 'seekBarColumns'", SeekBar.class);
        customizeActivity.seekBarColumnsValue = (TextView) ct.a(view, (int) R.id.seekBarColumnsValue, "field 'seekBarColumnsValue'", TextView.class);
        customizeActivity.seekBarImageHeight = (SeekBar) ct.a(view, (int) R.id.seekBarImageHeight, "field 'seekBarImageHeight'", SeekBar.class);
        customizeActivity.seekBarImageHeightValues = (TextView) ct.a(view, (int) R.id.seekBarImageHeightValue, "field 'seekBarImageHeightValues'", TextView.class);
        View a = ct.a(view, R.id.resetButton, "field 'resetButton' and method 'onResetButtonClicked'");
        customizeActivity.resetButton = (Button) ct.b(a, R.id.resetButton, "field 'resetButton'", Button.class);
        this.c = a;
        a.setOnClickListener(new c(this, customizeActivity));
        a = ct.a(view, R.id.saveButton, "field 'saveButton' and method 'onSaveButtonClicked'");
        customizeActivity.saveButton = (Button) ct.b(a, R.id.saveButton, "field 'saveButton'", Button.class);
        this.d = a;
        a.setOnClickListener(new d(this, customizeActivity));
        customizeActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        CustomizeActivity customizeActivity = this.b;
        if (customizeActivity != null) {
            this.b = null;
            customizeActivity.toolbar = null;
            customizeActivity.seekBarColumns = null;
            customizeActivity.seekBarColumnsValue = null;
            customizeActivity.seekBarImageHeight = null;
            customizeActivity.seekBarImageHeightValues = null;
            customizeActivity.resetButton = null;
            customizeActivity.saveButton = null;
            customizeActivity.recyclerView = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
