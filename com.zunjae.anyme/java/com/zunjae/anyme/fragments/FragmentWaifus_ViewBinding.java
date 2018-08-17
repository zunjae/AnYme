package com.zunjae.anyme.fragments;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentWaifus_ViewBinding implements Unbinder {
    private FragmentWaifus b;

    public FragmentWaifus_ViewBinding(FragmentWaifus fragmentWaifus, View view) {
        this.b = fragmentWaifus;
        fragmentWaifus.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        fragmentWaifus.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fragmentWaifus.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
        fragmentWaifus.sortOrderSpinner = (Spinner) ct.a(view, (int) R.id.sortOrderSpinner, "field 'sortOrderSpinner'", Spinner.class);
    }

    public final void a() {
        FragmentWaifus fragmentWaifus = this.b;
        if (fragmentWaifus != null) {
            this.b = null;
            fragmentWaifus.recyclerView = null;
            fragmentWaifus.swipeRefreshLayout = null;
            fragmentWaifus.errorMessage = null;
            fragmentWaifus.sortOrderSpinner = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
