package com.mikepenz.materialdrawer;

import android.support.v7.app.b;
import android.view.View;
import android.view.View.OnClickListener;

final class v implements OnClickListener {
    final /* synthetic */ t a;

    v(t tVar) {
        this.a = tVar;
    }

    public final void onClick(View view) {
        boolean a;
        t tVar = this.a;
        if (tVar.al != null) {
            b bVar = tVar.C;
            if (!(bVar == null || bVar.c())) {
                a = this.a.al.a();
                if (!a) {
                    tVar = this.a;
                    if (tVar.q.isDrawerOpen(tVar.x.intValue())) {
                        tVar = this.a;
                        tVar.q.openDrawer(tVar.x.intValue());
                    } else {
                        tVar = this.a;
                        tVar.q.closeDrawer(tVar.x.intValue());
                    }
                }
            }
        }
        a = false;
        if (a) {
            tVar = this.a;
            if (tVar.q.isDrawerOpen(tVar.x.intValue())) {
                tVar = this.a;
                tVar.q.openDrawer(tVar.x.intValue());
            } else {
                tVar = this.a;
                tVar.q.closeDrawer(tVar.x.intValue());
            }
        }
    }
}
