package com.zunjae.anyme.activities.explore;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class CategoryItemsActivity_ViewBinding implements Unbinder {
    private CategoryItemsActivity b;

    public CategoryItemsActivity_ViewBinding(CategoryItemsActivity categoryItemsActivity, View view) {
        this.b = categoryItemsActivity;
        categoryItemsActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        categoryItemsActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        categoryItemsActivity.swipeRefreshLayout = (SwipeRefreshLayout) ct.a(view, (int) R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        categoryItemsActivity.errorMessage = (TextView) ct.a(view, (int) R.id.errorMessage, "field 'errorMessage'", TextView.class);
    }

    public final void a() {
        CategoryItemsActivity categoryItemsActivity = this.b;
        if (categoryItemsActivity != null) {
            this.b = null;
            categoryItemsActivity.toolbar = null;
            categoryItemsActivity.recyclerView = null;
            categoryItemsActivity.swipeRefreshLayout = null;
            categoryItemsActivity.errorMessage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
