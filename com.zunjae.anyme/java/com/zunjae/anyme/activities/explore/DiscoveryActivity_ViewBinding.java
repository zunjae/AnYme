package com.zunjae.anyme.activities.explore;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class DiscoveryActivity_ViewBinding implements Unbinder {
    private DiscoveryActivity b;

    public DiscoveryActivity_ViewBinding(DiscoveryActivity discoveryActivity, View view) {
        this.b = discoveryActivity;
        discoveryActivity.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
        discoveryActivity.tabLayout = (TabLayout) ct.a(view, (int) R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
    }

    public final void a() {
        DiscoveryActivity discoveryActivity = this.b;
        if (discoveryActivity != null) {
            this.b = null;
            discoveryActivity.viewPager = null;
            discoveryActivity.tabLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
