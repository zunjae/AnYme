package com.zunjae.anyme.rewrite.activities;

import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import defpackage.amw;
import defpackage.aui;

final class f implements OnTabSelectedListener {
    final /* synthetic */ MainActivityR2 a;

    f(MainActivityR2 mainActivityR2) {
        this.a = mainActivityR2;
    }

    public final void onTabReselected(Tab tab) {
        aui.a().c(new amw());
    }

    public final void onTabSelected(Tab tab) {
    }

    public final void onTabUnselected(Tab tab) {
    }
}
