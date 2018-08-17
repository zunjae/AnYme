package com.mikepenz.materialdrawer;

import android.view.View;
import defpackage.afi;
import defpackage.afj;

final class m implements p {
    final /* synthetic */ f a;

    m(f fVar) {
        this.a = fVar;
    }

    public final boolean onItemClick(View view, int i, afi afi) {
        boolean onProfileChanged;
        Boolean bool;
        o oVar;
        boolean a = (afi != null && (afi instanceof afj) && afi.f()) ? this.a.a((afj) afi) : false;
        f fVar = this.a;
        if (fVar.L) {
            fVar.Y.a(null);
        }
        fVar = this.a;
        if (!(!fVar.L || fVar.Y == null || view == null || view.getContext() == null)) {
            fVar = this.a;
            view.getContext();
            fVar.i();
        }
        o oVar2 = this.a.Y;
        if (!(oVar2 == null || oVar2.a() == null || this.a.Y.a().ap == null)) {
            this.a.Y.a().ap.a();
        }
        if (afi != null && (afi instanceof afj)) {
            c cVar = this.a.W;
            if (cVar != null) {
                onProfileChanged = cVar.onProfileChanged(view, (afj) afi, a);
                bool = this.a.K;
                if (bool != null) {
                    onProfileChanged = onProfileChanged && !bool.booleanValue();
                }
                oVar = this.a.Y;
                if (!(oVar == null || r4)) {
                    oVar.a.h();
                }
                return true;
            }
        }
        onProfileChanged = false;
        bool = this.a.K;
        if (bool != null) {
            if (!onProfileChanged) {
            }
        }
        oVar = this.a.Y;
        oVar.a.h();
        return true;
    }
}
