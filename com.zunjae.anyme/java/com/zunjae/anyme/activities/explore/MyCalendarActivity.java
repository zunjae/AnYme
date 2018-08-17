package com.zunjae.anyme.activities.explore;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.zpagerwrapper.a;
import defpackage.ajl;
import defpackage.mh;
import defpackage.tw;
import java.util.Calendar;

public final class MyCalendarActivity extends AbstractActivity {
    private final String c = MyCalendarActivity.class.getSimpleName();
    private ajl d;
    @BindView
    TabLayout tabLayout;
    @BindView
    Toolbar toolbar;
    @BindView
    ViewPager viewPager;

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_livechart);
        ButterKnife.a(this);
        c(this.toolbar);
        this.viewPager.addOnPageChangeListener(new t(this));
        this.d = new ajl(getSupportFragmentManager());
        new a(this.viewPager, this.d).a(this.tabLayout);
        this.viewPager.setCurrentItem(this.d.a("My Shows"));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_livechart, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_all) {
            int i = Calendar.getInstance().get(7);
            ajl ajl = this.d;
            if (ajl != null) {
                ViewPager viewPager;
                String str;
                switch (i) {
                    case tw.a /*1*/:
                        viewPager = this.viewPager;
                        str = "Sunday";
                        break;
                    case tw.b /*2*/:
                        viewPager = this.viewPager;
                        str = "Monday";
                        break;
                    case f.c /*3*/:
                        viewPager = this.viewPager;
                        str = "Tuesday";
                        break;
                    case mh.d /*4*/:
                        viewPager = this.viewPager;
                        str = "Wednesday";
                        break;
                    case mh.e /*5*/:
                        viewPager = this.viewPager;
                        str = "Thursday";
                        break;
                    case mh.f /*6*/:
                        viewPager = this.viewPager;
                        str = "Friday";
                        break;
                    case mh.g /*7*/:
                        viewPager = this.viewPager;
                        str = "Saturday";
                        break;
                    default:
                        break;
                }
                viewPager.setCurrentItem(ajl.a(str));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
