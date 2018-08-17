package com.zunjae.anyme.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentTheme_ViewBinding implements Unbinder {
    private FragmentTheme b;

    public FragmentTheme_ViewBinding(FragmentTheme fragmentTheme, View view) {
        this.b = fragmentTheme;
        fragmentTheme.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        FragmentTheme fragmentTheme = this.b;
        if (fragmentTheme != null) {
            this.b = null;
            fragmentTheme.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
