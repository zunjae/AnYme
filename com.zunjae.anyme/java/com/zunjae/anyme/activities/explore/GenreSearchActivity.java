package com.zunjae.anyme.activities.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.zpagerwrapper.a;
import defpackage.ajk;
import defpackage.aml;

public final class GenreSearchActivity extends AbstractActivity {
    private final String c = getClass().getSimpleName();
    @BindView
    TabLayout tabLayout;
    @BindView
    Toolbar toolbar;
    @BindView
    ViewPager viewPager;

    public static Intent a(Context context, aml aml) {
        Intent intent = new Intent(context, GenreSearchActivity.class);
        intent.putExtra("animeGenre", aml);
        return intent;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_genre);
        ButterKnife.a(this);
        aml aml = (aml) getIntent().getParcelableExtra("animeGenre");
        a(this.toolbar, "Genre Search", aml.a(), true);
        new a(this.viewPager, new ajk(getSupportFragmentManager(), aml)).a(this.tabLayout);
        this.viewPager.setOffscreenPageLimit(4);
    }
}
