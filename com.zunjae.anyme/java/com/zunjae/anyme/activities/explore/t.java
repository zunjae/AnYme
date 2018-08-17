package com.zunjae.anyme.activities.explore;

import android.support.v4.view.ViewPager.OnPageChangeListener;

final class t implements OnPageChangeListener {
    final /* synthetic */ MyCalendarActivity a;

    t(MyCalendarActivity myCalendarActivity) {
        this.a = myCalendarActivity;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.a.invalidateOptionsMenu();
    }

    public final void onPageSelected(int i) {
        this.a.invalidateOptionsMenu();
    }
}
