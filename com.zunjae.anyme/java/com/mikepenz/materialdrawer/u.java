package com.mikepenz.materialdrawer;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.widget.DrawerLayout.SimpleDrawerListener;

final class u extends SimpleDrawerListener {
    boolean a = false;
    final /* synthetic */ SharedPreferences b;
    final /* synthetic */ t c;

    u(t tVar, SharedPreferences sharedPreferences) {
        this.c = tVar;
        this.b = sharedPreferences;
    }

    public final void onDrawerStateChanged(int i) {
        if (i == 1) {
            this.a = true;
            return;
        }
        if (i == 0) {
            if (this.a) {
                t tVar = this.c;
                if (tVar.q.isDrawerOpen(tVar.x.intValue())) {
                    Editor edit = this.b.edit();
                    edit.putBoolean("navigation_drawer_dragged_open", true);
                    edit.apply();
                    return;
                }
            }
            this.a = false;
        }
    }
}
