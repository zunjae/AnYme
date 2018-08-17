package com.zunjae.anyme.rewrite.ui.fragments;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import com.l4digital.fastscroll.FastScroller;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeListR2_ViewBinding implements Unbinder {
    private FragmentAnimeListR2 b;
    private View c;
    private View d;
    private View e;

    public FragmentAnimeListR2_ViewBinding(FragmentAnimeListR2 fragmentAnimeListR2, View view) {
        this.b = fragmentAnimeListR2;
        fragmentAnimeListR2.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        fragmentAnimeListR2.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        View a = ct.a(view, R.id.searchForNotFoundFilteredAnime, "field 'textSearchForAnime' and method 'onSearchForTextClicked'");
        fragmentAnimeListR2.textSearchForAnime = (TextView) ct.b(a, R.id.searchForNotFoundFilteredAnime, "field 'textSearchForAnime'", TextView.class);
        this.c = a;
        a.setOnClickListener(new c(this, fragmentAnimeListR2));
        fragmentAnimeListR2.viewGroupNoAnime = (ViewGroup) ct.a(view, (int) R.id.viewGroupNoAnimeHere, "field 'viewGroupNoAnime'", ViewGroup.class);
        fragmentAnimeListR2.fastScroller = (FastScroller) ct.a(view, (int) R.id.fastScroller, "field 'fastScroller'", FastScroller.class);
        a = ct.a(view, R.id.findNewAnimeButton, "method 'onFindNewAnimeButtonClicked'");
        this.d = a;
        a.setOnClickListener(new d(this, fragmentAnimeListR2));
        view = ct.a(view, R.id.addAnimeToProfile, "method 'onFindSeasonalAnimeClicked'");
        this.e = view;
        view.setOnClickListener(new e(this, fragmentAnimeListR2));
    }

    public final void a() {
        FragmentAnimeListR2 fragmentAnimeListR2 = this.b;
        if (fragmentAnimeListR2 != null) {
            this.b = null;
            fragmentAnimeListR2.recyclerView = null;
            fragmentAnimeListR2.swipeRefreshLayout = null;
            fragmentAnimeListR2.textSearchForAnime = null;
            fragmentAnimeListR2.viewGroupNoAnime = null;
            fragmentAnimeListR2.fastScroller = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
