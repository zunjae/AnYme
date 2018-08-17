package com.zunjae.anyme.fragments.anime;

import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;

final class i implements OnRefreshListener {
    final /* synthetic */ FragmentAnimeNews a;

    i(FragmentAnimeNews fragmentAnimeNews) {
        this.a = fragmentAnimeNews;
    }

    public final void onRefresh() {
        if (this.a.c != null) {
            this.a.c.e();
        }
        this.a.a();
    }
}
