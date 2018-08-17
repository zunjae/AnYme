package com.zunjae.anyme.fragments.anime;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeGenre_ViewBinding implements Unbinder {
    private FragmentAnimeGenre b;

    public FragmentAnimeGenre_ViewBinding(FragmentAnimeGenre fragmentAnimeGenre, View view) {
        this.b = fragmentAnimeGenre;
        fragmentAnimeGenre.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fragmentAnimeGenre.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
        fragmentAnimeGenre.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        FragmentAnimeGenre fragmentAnimeGenre = this.b;
        if (fragmentAnimeGenre != null) {
            this.b = null;
            fragmentAnimeGenre.swipeRefreshLayout = null;
            fragmentAnimeGenre.errorMessage = null;
            fragmentAnimeGenre.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
