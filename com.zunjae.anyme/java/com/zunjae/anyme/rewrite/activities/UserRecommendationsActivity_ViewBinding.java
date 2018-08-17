package com.zunjae.anyme.rewrite.activities;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class UserRecommendationsActivity_ViewBinding implements Unbinder {
    private UserRecommendationsActivity b;

    public UserRecommendationsActivity_ViewBinding(UserRecommendationsActivity userRecommendationsActivity, View view) {
        this.b = userRecommendationsActivity;
        userRecommendationsActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        userRecommendationsActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        userRecommendationsActivity.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        userRecommendationsActivity.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
    }

    public final void a() {
        UserRecommendationsActivity userRecommendationsActivity = this.b;
        if (userRecommendationsActivity != null) {
            this.b = null;
            userRecommendationsActivity.toolbar = null;
            userRecommendationsActivity.recyclerView = null;
            userRecommendationsActivity.swipeRefreshLayout = null;
            userRecommendationsActivity.errorMessage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
