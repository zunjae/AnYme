package com.zunjae.anyme.rewrite.activities;

import android.arch.lifecycle.as;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.activities.browsers.UserLoginBrowser;
import com.zunjae.anyme.activities.explore.DiscoveryActivity;
import com.zunjae.anyme.activities.explore.LocalAnimeSearchActivity;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import com.zunjae.zpagerwrapper.a;
import defpackage.adx;
import defpackage.aiv;
import defpackage.amu;
import defpackage.anp;
import defpackage.anq;
import defpackage.aof;
import defpackage.ary;
import defpackage.ast;
import defpackage.atq;
import defpackage.aui;
import defpackage.aul;
import defpackage.auo;
import defpackage.aux;
import java.util.List;

public final class MainActivityR2 extends AbstractActivity {
    final int c = 2000;
    private Snackbar d;
    private AnimeViewModel e;
    private KanonViewModel f;
    private aof g;
    private boolean h = false;
    private atq i;
    @BindView
    TabLayout tabLayout;
    @BindView
    Toolbar toolbar;
    @BindView
    ViewPager viewPager;

    private void a(int i, int i2) {
        this.e.b(i).observe(this, new -$$Lambda$MainActivityR2$Y-d_WxrKV5hKDwPtMYaUYnzhZ5Y(this, i2));
    }

    private /* synthetic */ void a(int i, Integer num) {
        if (num != null) {
            this.tabLayout.getTabAt(i).setText(String.format("%s (%d)", new Object[]{this.g.a(i), num}));
        }
    }

    private /* synthetic */ void a(View view) {
        onUserRefresh(null);
    }

    private /* synthetic */ void a(Integer num) {
        if (num != null) {
            atq atq = this.i;
            atq.a().a(9, new adx(String.valueOf(num)));
        }
    }

    private /* synthetic */ void a(List list) {
        if (list != null) {
            this.i.a(list);
        }
    }

    private void a(boolean z) {
        this.e.a().t();
        g gVar = new g(this, this);
        gVar.a(z);
        gVar.f();
        this.e.a().s();
    }

    private /* synthetic */ void b(Integer num) {
        if (num != null && num.intValue() > 0) {
            Snackbar make = Snackbar.make(findViewById(R.id.myCoordinator), Html.fromHtml(String.format("<font color=\"#ffffff\">%s</font>", new Object[]{"Your account is not fully synced with MyAnimeList yet"})), -2);
            make.setAction(Html.fromHtml("<font color=\"#ffffff\">Sync Now</font>"), new -$$Lambda$MainActivityR2$Bf3pBn_vu-xrmylnPHHztbscS-M(this));
            make.setActionTextColor(ContextCompat.getColor(this.b, 17170443));
            make.show();
        }
    }

    private /* synthetic */ void c() {
        this.h = false;
    }

    private /* synthetic */ void c(Integer num) {
        if (num != null) {
            atq atq = this.i;
            atq.a().a(4, new adx(String.valueOf(num)));
        }
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10 && i2 == 5) {
            recreate();
        }
    }

    public final void onBackPressed() {
        if (this.h) {
            ActivityCompat.finishAffinity(this);
            super.onBackPressed();
        } else if (this.i.a() == null || !this.i.a().d()) {
            this.i.a().b();
            this.h = true;
            Toast.makeText(this, "Press BACK again to exit", 0).show();
            new Handler().postDelayed(new -$$Lambda$MainActivityR2$RWmmeFFMYqer1BlLZ5l3YFSFsGI(this), 2000);
        } else {
            this.i.a().c();
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auo auo = new auo("MainActivityR2");
        setContentView(R.layout.activity_mainr2);
        ButterKnife.a(this);
        b(this.toolbar);
        this.i = new atq(this, this.toolbar);
        this.e = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.f = (KanonViewModel) as.a(this).a(KanonViewModel.class);
        this.g = new aof(getSupportFragmentManager());
        new a(this.viewPager, this.g).a(this.tabLayout);
        this.viewPager.setOffscreenPageLimit(3);
        a(false);
        a(1, 0);
        a(6, 1);
        a(3, 2);
        a(2, 3);
        a(4, 4);
        a(0, 5);
        this.e.d().observe(this, new -$$Lambda$MainActivityR2$uvjeY586UDcQYoBQmpl1JvPfGS0(this));
        this.e.f().observe(this, new -$$Lambda$MainActivityR2$HsV3SYuDZ1Uk_cEB1QAxGetLjrA(this));
        this.e.n().observe(this, new e(this));
        this.e.j().observe(this, new -$$Lambda$MainActivityR2$fmh5TeUoRQanm6x8Ok0KF3lY6Fk(this));
        this.e.l().observe(this, new -$$Lambda$MainActivityR2$BESdbgxAX06aRBh-M3ZK3kp5_kA(this));
        this.tabLayout.addOnTabSelectedListener(new f(this));
        if (aux.b("preference_key_auto_loadV2", true)) {
            new h(this, this).f();
        }
        auo.a();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_mainr2, menu);
        new aul(this.b).a(menu);
        menu.findItem(R.id.item_lastupdated_asc).setVisible(false);
        menu.findItem(R.id.item_lastupdated_desc).setVisible(false);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case R.id.actionbar_discover /*2131296285*/:
                intent = new Intent(this, DiscoveryActivity.class);
                break;
            case R.id.actionbar_refresh /*2131296286*/:
                onUserRefresh(null);
                break;
            case R.id.actionbar_search /*2131296287*/:
                intent = new Intent(this, LocalAnimeSearchActivity.class);
                break;
            default:
                aui a;
                Object ary;
                switch (itemId) {
                    case R.id.item_episodes_asc /*2131296488*/:
                        ast.a(4);
                        a = aui.a();
                        ary = new ary();
                        break;
                    case R.id.item_episodes_desc /*2131296489*/:
                        ast.a(5);
                        a = aui.a();
                        ary = new ary();
                        break;
                    default:
                        switch (itemId) {
                            case R.id.item_lastupdated_asc /*2131296491*/:
                                ast.a(6);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_lastupdated_desc /*2131296492*/:
                                ast.a(7);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_names_asc /*2131296493*/:
                                ast.a(0);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_names_desc /*2131296494*/:
                                ast.a(1);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_next_release_day_asc /*2131296495*/:
                                ast.a(10);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_next_release_day_desc /*2131296496*/:
                                ast.a(11);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_progress_asc /*2131296497*/:
                                ast.a(8);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_progress_desc /*2131296498*/:
                                ast.a(9);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_score_asc /*2131296499*/:
                                ast.a(2);
                                a = aui.a();
                                ary = new ary();
                                break;
                            case R.id.item_score_desc /*2131296500*/:
                                ast.a(3);
                                a = aui.a();
                                ary = new ary();
                                break;
                            default:
                                switch (itemId) {
                                    case R.id.item_start_date_asc /*2131296502*/:
                                        ast.a(12);
                                        a = aui.a();
                                        ary = new ary();
                                        break;
                                    case R.id.item_start_date_desc /*2131296503*/:
                                        ast.a(13);
                                        a = aui.a();
                                        ary = new ary();
                                        break;
                                    default:
                                        break;
                                }
                        }
                }
                a.c(ary);
                break;
        }
        startActivity(intent);
        return super.onOptionsItemSelected(menuItem);
    }

    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    protected final void onResume() {
        super.onResume();
        if (anp.c()) {
            startActivity(UserLoginBrowser.a(this.b, anq.c().a(), anq.c().b()));
        }
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        aui.a().a((Object) this);
    }

    public final void onStop() {
        super.onStop();
        aui.a().b((Object) this);
    }

    @aiv
    public final void onUserRefresh(amu amu) {
        new h(this, this).f();
        a(true);
    }
}
