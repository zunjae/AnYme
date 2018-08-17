package com.zunjae.anyme.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentLiveChart_ViewBinding implements Unbinder {
    private FragmentLiveChart b;

    public FragmentLiveChart_ViewBinding(FragmentLiveChart fragmentLiveChart, View view) {
        this.b = fragmentLiveChart;
        fragmentLiveChart.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        FragmentLiveChart fragmentLiveChart = this.b;
        if (fragmentLiveChart != null) {
            this.b = null;
            fragmentLiveChart.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
