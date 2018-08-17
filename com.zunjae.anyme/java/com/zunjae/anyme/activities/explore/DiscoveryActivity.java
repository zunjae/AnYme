package com.zunjae.anyme.activities.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.fragments.FragmentGenres;
import com.zunjae.zpagerwrapper.a;
import defpackage.aji;
import defpackage.aul;

public final class DiscoveryActivity extends AbstractActivity {
    private final String c = getClass().getSimpleName();
    @BindView
    TabLayout tabLayout;
    @BindView
    ViewPager viewPager;

    public static Intent a(Context context) {
        Intent intent = new Intent(context, DiscoveryActivity.class);
        intent.putExtra("viewPagerPosition", 1);
        return intent;
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_discover);
        ButterKnife.a(this);
        c((Toolbar) findViewById(R.id.toolbar));
        new a(this.viewPager, new aji(getSupportFragmentManager())).a(this.tabLayout);
        this.viewPager.setCurrentItem(getIntent().getIntExtra("viewPagerPosition", 0));
        a((int) R.id.fragmentContainerFrameLayout, (Fragment) FragmentGenres.a());
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_discover, menu);
        new aul(this.b).c(menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_search) {
            startActivity(new Intent(this, FastAnimeSearchActivity.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
