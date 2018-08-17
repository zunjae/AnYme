package com.zunjae.anyme.activities.misc;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class TroubleshootActivity_ViewBinding implements Unbinder {
    private TroubleshootActivity b;

    public TroubleshootActivity_ViewBinding(TroubleshootActivity troubleshootActivity, View view) {
        this.b = troubleshootActivity;
        troubleshootActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        troubleshootActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
    }

    public final void a() {
        TroubleshootActivity troubleshootActivity = this.b;
        if (troubleshootActivity != null) {
            this.b = null;
            troubleshootActivity.recyclerView = null;
            troubleshootActivity.toolbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
