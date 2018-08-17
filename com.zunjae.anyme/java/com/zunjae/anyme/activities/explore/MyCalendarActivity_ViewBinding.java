package com.zunjae.anyme.activities.explore;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class MyCalendarActivity_ViewBinding implements Unbinder {
    private MyCalendarActivity b;

    public MyCalendarActivity_ViewBinding(MyCalendarActivity myCalendarActivity, View view) {
        this.b = myCalendarActivity;
        myCalendarActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        myCalendarActivity.tabLayout = (TabLayout) ct.a(view, (int) R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
        myCalendarActivity.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
    }

    public final void a() {
        MyCalendarActivity myCalendarActivity = this.b;
        if (myCalendarActivity != null) {
            this.b = null;
            myCalendarActivity.toolbar = null;
            myCalendarActivity.tabLayout = null;
            myCalendarActivity.viewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
