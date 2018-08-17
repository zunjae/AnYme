package com.mikepenz.materialdrawer;

import android.os.Handler;
import android.view.View;
import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.u;
import defpackage.acg;
import defpackage.aed;
import defpackage.afi;
import defpackage.afl;

final class z implements acg<afi> {
    final /* synthetic */ t a;

    z(t tVar) {
        this.a = tVar;
    }

    public final /* synthetic */ boolean a(View view, u uVar, int i) {
        boolean onItemClick;
        t tVar;
        p pVar;
        ae aeVar;
        afi afi = (afi) uVar;
        if (afi == null || !(afi instanceof afl) || afi.f()) {
            this.a.i();
            this.a.b = -1;
        }
        if (afi instanceof aed) {
            aed aed = (aed) afi;
            if (aed.m() != null) {
                onItemClick = aed.m().onItemClick(view, i, afi);
                tVar = this.a;
                pVar = tVar.aj;
                if (pVar != null) {
                    if (tVar.ai <= 0) {
                        new Handler().postDelayed(new aa(this, view, i, afi), (long) this.a.ai);
                    } else {
                        onItemClick = pVar.onItemClick(view, i, afi);
                    }
                }
                if (!onItemClick) {
                    aeVar = this.a.ap;
                    if (aeVar != null) {
                        if (afi.f()) {
                            onItemClick = true;
                        } else {
                            aeVar.a(afi.c());
                            onItemClick = false;
                        }
                    }
                }
                if (!(afi instanceof n) && afi.b() != null) {
                    return true;
                }
                if (!onItemClick) {
                    this.a.h();
                }
                return onItemClick;
            }
        }
        onItemClick = false;
        tVar = this.a;
        pVar = tVar.aj;
        if (pVar != null) {
            if (tVar.ai <= 0) {
                onItemClick = pVar.onItemClick(view, i, afi);
            } else {
                new Handler().postDelayed(new aa(this, view, i, afi), (long) this.a.ai);
            }
        }
        if (onItemClick) {
            aeVar = this.a.ap;
            if (aeVar != null) {
                if (afi.f()) {
                    onItemClick = true;
                } else {
                    aeVar.a(afi.c());
                    onItemClick = false;
                }
            }
        }
        if (!(afi instanceof n)) {
        }
        if (onItemClick) {
            this.a.h();
        }
        return onItemClick;
    }
}
