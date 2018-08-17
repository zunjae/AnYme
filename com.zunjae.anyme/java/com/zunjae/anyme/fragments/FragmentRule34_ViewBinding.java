package com.zunjae.anyme.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentRule34_ViewBinding implements Unbinder {
    private FragmentRule34 b;

    public FragmentRule34_ViewBinding(FragmentRule34 fragmentRule34, View view) {
        this.b = fragmentRule34;
        fragmentRule34.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        FragmentRule34 fragmentRule34 = this.b;
        if (fragmentRule34 != null) {
            this.b = null;
            fragmentRule34.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
