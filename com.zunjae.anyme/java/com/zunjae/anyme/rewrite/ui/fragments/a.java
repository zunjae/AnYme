package com.zunjae.anyme.rewrite.ui.fragments;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;

final class a extends OnScrollListener {
    final /* synthetic */ FragmentAnimeListR2 a;

    a(FragmentAnimeListR2 fragmentAnimeListR2) {
        this.a = fragmentAnimeListR2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.a.i = ((GridLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
    }
}
