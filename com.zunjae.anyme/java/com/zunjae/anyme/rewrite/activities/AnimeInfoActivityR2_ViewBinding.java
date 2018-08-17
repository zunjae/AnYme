package com.zunjae.anyme.rewrite.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.leinardi.android.speeddial.SpeedDialView;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class AnimeInfoActivityR2_ViewBinding implements Unbinder {
    private AnimeInfoActivityR2 b;
    private View c;
    private View d;

    public AnimeInfoActivityR2_ViewBinding(AnimeInfoActivityR2 animeInfoActivityR2, View view) {
        this.b = animeInfoActivityR2;
        animeInfoActivityR2.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        animeInfoActivityR2.viewPager = (ViewPager) ct.a(view, (int) R.id.viewPager, "field 'viewPager'", ViewPager.class);
        animeInfoActivityR2.tabLayout = (TabLayout) ct.a(view, (int) R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
        animeInfoActivityR2.animePoster = (ImageView) ct.a(view, (int) R.id.backgroundImageAnimePoster, "field 'animePoster'", ImageView.class);
        View a = ct.a(view, R.id.animeCoverImage, "field 'coverImage' and method 'onAnimeCoverImageClicked'");
        animeInfoActivityR2.coverImage = (ImageView) ct.b(a, R.id.animeCoverImage, "field 'coverImage'", ImageView.class);
        this.c = a;
        a.setOnClickListener(new a(this, animeInfoActivityR2));
        animeInfoActivityR2.speedDialView = (SpeedDialView) ct.a(view, (int) R.id.speedDial, "field 'speedDialView'", SpeedDialView.class);
        view = ct.a(view, R.id.dropDownImage, "field 'dropDownImage' and method 'onDropDownImageClicked'");
        animeInfoActivityR2.dropDownImage = (ImageView) ct.b(view, R.id.dropDownImage, "field 'dropDownImage'", ImageView.class);
        this.d = view;
        view.setOnClickListener(new b(this, animeInfoActivityR2));
    }

    public final void a() {
        AnimeInfoActivityR2 animeInfoActivityR2 = this.b;
        if (animeInfoActivityR2 != null) {
            this.b = null;
            animeInfoActivityR2.toolbar = null;
            animeInfoActivityR2.viewPager = null;
            animeInfoActivityR2.tabLayout = null;
            animeInfoActivityR2.animePoster = null;
            animeInfoActivityR2.coverImage = null;
            animeInfoActivityR2.speedDialView = null;
            animeInfoActivityR2.dropDownImage = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
