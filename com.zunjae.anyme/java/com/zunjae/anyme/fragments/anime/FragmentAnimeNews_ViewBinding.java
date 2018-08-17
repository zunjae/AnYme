package com.zunjae.anyme.fragments.anime;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeNews_ViewBinding implements Unbinder {
    private FragmentAnimeNews b;

    public FragmentAnimeNews_ViewBinding(FragmentAnimeNews fragmentAnimeNews, View view) {
        this.b = fragmentAnimeNews;
        fragmentAnimeNews.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        fragmentAnimeNews.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        fragmentAnimeNews.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
    }

    public final void a() {
        FragmentAnimeNews fragmentAnimeNews = this.b;
        if (fragmentAnimeNews != null) {
            this.b = null;
            fragmentAnimeNews.recyclerView = null;
            fragmentAnimeNews.swipeRefreshLayout = null;
            fragmentAnimeNews.errorMessage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
