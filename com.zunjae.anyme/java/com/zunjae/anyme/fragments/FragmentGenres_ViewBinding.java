package com.zunjae.anyme.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class FragmentGenres_ViewBinding implements Unbinder {
    private FragmentGenres b;

    public FragmentGenres_ViewBinding(FragmentGenres fragmentGenres, View view) {
        this.b = fragmentGenres;
        fragmentGenres.recyclerViewGenre = (RecyclerView) ct.a(view, (int) R.id.recyclerViewGenres, "field 'recyclerViewGenre'", RecyclerView.class);
    }

    public final void a() {
        FragmentGenres fragmentGenres = this.b;
        if (fragmentGenres != null) {
            this.b = null;
            fragmentGenres.recyclerViewGenre = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
