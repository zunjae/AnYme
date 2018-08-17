package com.zunjae.anyme.fragments.anime;

import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;

final class g implements OnRefreshListener {
    final /* synthetic */ FragmentAnimeGenre a;

    g(FragmentAnimeGenre fragmentAnimeGenre) {
        this.a = fragmentAnimeGenre;
    }

    public final void onRefresh() {
        this.a.a(true);
    }
}
