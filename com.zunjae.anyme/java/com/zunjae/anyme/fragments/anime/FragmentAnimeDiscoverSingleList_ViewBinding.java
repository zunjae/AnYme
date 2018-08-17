package com.zunjae.anyme.fragments.anime;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class FragmentAnimeDiscoverSingleList_ViewBinding implements Unbinder {
    private FragmentAnimeDiscoverSingleList b;

    public FragmentAnimeDiscoverSingleList_ViewBinding(FragmentAnimeDiscoverSingleList fragmentAnimeDiscoverSingleList, View view) {
        this.b = fragmentAnimeDiscoverSingleList;
        fragmentAnimeDiscoverSingleList.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        FragmentAnimeDiscoverSingleList fragmentAnimeDiscoverSingleList = this.b;
        if (fragmentAnimeDiscoverSingleList != null) {
            this.b = null;
            fragmentAnimeDiscoverSingleList.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
