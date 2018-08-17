package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.b;
import android.support.v7.widget.Toolbar;
import android.view.View;

final class w extends b {
    final /* synthetic */ t c;

    w(t tVar, Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this.c = tVar;
        super(activity, drawerLayout, toolbar, i, i2);
    }

    public final void onDrawerClosed(View view) {
        super.onDrawerClosed(view);
    }

    public final void onDrawerOpened(View view) {
        super.onDrawerOpened(view);
    }

    public final void onDrawerSlide(View view, float f) {
        if (this.c.A) {
            super.onDrawerSlide(view, f);
        } else {
            super.onDrawerSlide(view, 0.0f);
        }
    }
}
