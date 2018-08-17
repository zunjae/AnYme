package com.zunjae.anyme.rewrite.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FavoritesActivity_ViewBinding implements Unbinder {
    private FavoritesActivity b;

    public FavoritesActivity_ViewBinding(FavoritesActivity favoritesActivity, View view) {
        this.b = favoritesActivity;
        favoritesActivity.tabLayout = (TabLayout) ct.a(view, (int) R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
        favoritesActivity.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
        favoritesActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
    }

    public final void a() {
        FavoritesActivity favoritesActivity = this.b;
        if (favoritesActivity != null) {
            this.b = null;
            favoritesActivity.tabLayout = null;
            favoritesActivity.viewPager = null;
            favoritesActivity.toolbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
