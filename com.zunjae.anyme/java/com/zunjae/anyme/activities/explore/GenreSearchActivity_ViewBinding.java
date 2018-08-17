package com.zunjae.anyme.activities.explore;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class GenreSearchActivity_ViewBinding implements Unbinder {
    private GenreSearchActivity b;

    public GenreSearchActivity_ViewBinding(GenreSearchActivity genreSearchActivity, View view) {
        this.b = genreSearchActivity;
        genreSearchActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        genreSearchActivity.tabLayout = (TabLayout) ct.a(view, (int) R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
        genreSearchActivity.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
    }

    public final void a() {
        GenreSearchActivity genreSearchActivity = this.b;
        if (genreSearchActivity != null) {
            this.b = null;
            genreSearchActivity.toolbar = null;
            genreSearchActivity.tabLayout = null;
            genreSearchActivity.viewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
