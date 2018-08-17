package com.zunjae.anyme.activities.explore;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class VideosActivity_ViewBinding implements Unbinder {
    private VideosActivity b;

    public VideosActivity_ViewBinding(VideosActivity videosActivity, View view) {
        this.b = videosActivity;
        videosActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        videosActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        videosActivity.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        videosActivity.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
    }

    public final void a() {
        VideosActivity videosActivity = this.b;
        if (videosActivity != null) {
            this.b = null;
            videosActivity.toolbar = null;
            videosActivity.recyclerView = null;
            videosActivity.swipeRefreshLayout = null;
            videosActivity.errorMessage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
