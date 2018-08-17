package com.zunjae.anyme.activities.explore;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class SongsActivity_ViewBinding implements Unbinder {
    private SongsActivity b;

    public SongsActivity_ViewBinding(SongsActivity songsActivity, View view) {
        this.b = songsActivity;
        songsActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        songsActivity.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        songsActivity.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
        songsActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    }

    public final void a() {
        SongsActivity songsActivity = this.b;
        if (songsActivity != null) {
            this.b = null;
            songsActivity.toolbar = null;
            songsActivity.swipeRefreshLayout = null;
            songsActivity.errorMessage = null;
            songsActivity.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
