package com.zunjae.anyme.activities.explore;

import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;

final class h implements OnRefreshListener {
    final /* synthetic */ CategoryItemsActivity a;

    h(CategoryItemsActivity categoryItemsActivity) {
        this.a = categoryItemsActivity;
    }

    public final void onRefresh() {
        this.a.c();
    }
}
