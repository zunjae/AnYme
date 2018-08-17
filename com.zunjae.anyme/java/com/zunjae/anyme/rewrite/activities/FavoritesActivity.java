package com.zunjae.anyme.rewrite.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.zpagerwrapper.a;
import defpackage.ajj;
import defpackage.aui;

public final class FavoritesActivity extends AbstractActivity {
    @BindView
    TabLayout tabLayout;
    @BindView
    Toolbar toolbar;
    @BindView
    ViewPager viewPager;

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_favorites);
        ButterKnife.a(this);
        c(this.toolbar);
        new a(this.viewPager, new ajj(getSupportFragmentManager())).a(this.tabLayout);
        this.viewPager.setOffscreenPageLimit(2);
    }

    public final void onStart() {
        super.onStart();
        aui.a().a((Object) this);
    }

    public final void onStop() {
        super.onStop();
        aui.a().b((Object) this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @defpackage.aiv
    public final void onTabCountReceived(defpackage.asa r5) {
        /*
        r4 = this;
        r0 = r5.a();
        r1 = 0;
        r2 = 1;
        switch(r0) {
            case 6: goto L_0x0033;
            case 7: goto L_0x0022;
            case 8: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x004b;
    L_0x000a:
        r0 = r4.tabLayout;
        r0 = r0.getTabAt(r2);
        r3 = "Waifus (%s)";
        r2 = new java.lang.Object[r2];
        r5 = r5.b();
        r2[r1] = r5;
    L_0x001a:
        r5 = java.lang.String.format(r3, r2);
        r0.setText(r5);
        return;
    L_0x0022:
        r0 = r4.tabLayout;
        r0 = r0.getTabAt(r1);
        r3 = "Highly Rated (%s)";
        r2 = new java.lang.Object[r2];
        r5 = r5.b();
        r2[r1] = r5;
        goto L_0x001a;
    L_0x0033:
        r0 = r4.tabLayout;
        r3 = 2;
        r0 = r0.getTabAt(r3);
        r3 = "Favorites (%s)";
        r2 = new java.lang.Object[r2];
        r5 = r5.b();
        r2[r1] = r5;
        r5 = java.lang.String.format(r3, r2);
        r0.setText(r5);
    L_0x004b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.activities.FavoritesActivity.onTabCountReceived(asa):void");
    }
}
