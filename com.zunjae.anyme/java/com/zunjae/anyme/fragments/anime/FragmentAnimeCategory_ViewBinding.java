package com.zunjae.anyme.fragments.anime;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeCategory_ViewBinding implements Unbinder {
    private FragmentAnimeCategory b;

    public FragmentAnimeCategory_ViewBinding(FragmentAnimeCategory fragmentAnimeCategory, View view) {
        this.b = fragmentAnimeCategory;
        fragmentAnimeCategory.recyclerViewCategories = (RecyclerView) ct.a(view, (int) R.id.recyclerViewCategories, "field 'recyclerViewCategories'", RecyclerView.class);
    }

    public final void a() {
        FragmentAnimeCategory fragmentAnimeCategory = this.b;
        if (fragmentAnimeCategory != null) {
            this.b = null;
            fragmentAnimeCategory.recyclerViewCategories = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
