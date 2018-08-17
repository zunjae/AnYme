package com.zunjae.zpagerwrapper;

import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public final class a {
    private final ViewPager a;

    public a(ViewPager viewPager, PagerAdapter pagerAdapter) {
        this.a = viewPager;
        int currentItem = viewPager.getCurrentItem();
        this.a.setAdapter(pagerAdapter);
        this.a.setCurrentItem(currentItem);
    }

    public final a a(TabLayout tabLayout) {
        tabLayout.setupWithViewPager(this.a);
        this.a.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));
        return this;
    }
}
