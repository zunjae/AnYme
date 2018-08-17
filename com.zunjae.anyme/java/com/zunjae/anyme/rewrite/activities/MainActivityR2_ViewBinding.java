package com.zunjae.anyme.rewrite.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class MainActivityR2_ViewBinding implements Unbinder {
    private MainActivityR2 b;

    public MainActivityR2_ViewBinding(MainActivityR2 mainActivityR2, View view) {
        this.b = mainActivityR2;
        mainActivityR2.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
        mainActivityR2.tabLayout = (TabLayout) ct.a(view, (int) R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
        mainActivityR2.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
    }

    public final void a() {
        MainActivityR2 mainActivityR2 = this.b;
        if (mainActivityR2 != null) {
            this.b = null;
            mainActivityR2.viewPager = null;
            mainActivityR2.tabLayout = null;
            mainActivityR2.toolbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
