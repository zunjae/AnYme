package com.mikepenz.materialdrawer;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.mikepenz.fastadapter.v;
import defpackage.acm;
import defpackage.adx;
import defpackage.aed;
import defpackage.ael;
import defpackage.aem;
import defpackage.afg;
import defpackage.afi;
import java.util.List;

public final class o {
    protected final t a;
    private p b;
    private q c;
    private List<afi> d;
    private Bundle e;

    protected o(t tVar) {
        this.a = tVar;
    }

    private void a(int i, boolean z) {
        if (z && i >= 0) {
            afi afi = (afi) this.a.X.b(i);
            if (afi instanceof aed) {
                aed aed = (aed) afi;
                if (aed.m() != null) {
                    aed.m().onItemClick(null, i, afi);
                }
            }
            p pVar = this.a.aj;
            if (pVar != null) {
                pVar.onItemClick(null, i, afi);
            }
        }
        this.a.i();
    }

    private void a(q qVar) {
        this.a.ak = qVar;
    }

    private void a(List<afi> list) {
        this.a.d().a((List) list);
    }

    protected final t a() {
        return this.a;
    }

    public final void a(long j) {
        acm acm = (acm) this.a.X.a(acm.class);
        if (acm != null) {
            acm.g();
            acm.a(j);
            Pair a = this.a.X.a(j);
            if (a != null) {
                Integer num = (Integer) a.second;
                a(num != null ? num.intValue() : -1, true);
            }
        }
    }

    public final void a(long j, adx adx) {
        Pair a = this.a.X.a(j);
        afi afi = a != null ? (afi) a.first : null;
        if (afi instanceof afg) {
            afg afg = (afg) afi;
            afg.a(adx);
            Object obj = (afi) afg;
            int a2 = ad.a(this.a, obj.c());
            if (this.a.b(a2)) {
                this.a.d().a(a2, obj);
            }
        }
    }

    public final void a(View view, boolean z, boolean z2) {
        v e;
        Object[] objArr;
        this.a.e().a();
        if (z) {
            e = this.a.e();
            objArr = new afi[]{new ael().b(view).d(z2).a(null).a(aem.a)};
        } else {
            e = this.a.e();
            objArr = new afi[]{new ael().b(view).d(z2).a(null).a(aem.c)};
        }
        e.a(objArr);
        RecyclerView recyclerView = this.a.V;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, this.a.V.getPaddingRight(), this.a.V.getPaddingBottom());
    }

    public final void a(p pVar) {
        this.a.aj = pVar;
    }

    public final void a(p pVar, q qVar, List<afi> list, int i) {
        if (!f()) {
            t tVar = this.a;
            this.b = tVar.aj;
            this.c = tVar.ak;
            this.e = tVar.X.b(new Bundle());
            this.a.ab.c();
            this.d = e();
        }
        a(pVar);
        a(qVar);
        a((List) list);
        t tVar2 = this.a;
        if (tVar2.V != null) {
            acm acm = (acm) tVar2.X.a(acm.class);
            if (acm != null) {
                acm.g();
                acm.a(i);
                a(i, false);
            }
        }
        tVar2 = this.a;
        if (!tVar2.ae) {
            View view = tVar2.N;
            if (view != null) {
                view.setVisibility(8);
            }
            view = this.a.P;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public final void b() {
        t tVar = this.a;
        DrawerLayout drawerLayout = tVar.q;
        if (drawerLayout != null && tVar.r != null) {
            drawerLayout.openDrawer(tVar.x.intValue());
        }
    }

    public final void b(long j) {
        this.a.Z.b(j);
    }

    public final void c() {
        t tVar = this.a;
        DrawerLayout drawerLayout = tVar.q;
        if (drawerLayout != null) {
            drawerLayout.closeDrawer(tVar.x.intValue());
        }
    }

    public final boolean d() {
        t tVar = this.a;
        DrawerLayout drawerLayout = tVar.q;
        return (drawerLayout == null || tVar.r == null) ? false : drawerLayout.isDrawerOpen(tVar.x.intValue());
    }

    public final List<afi> e() {
        return this.a.d().d();
    }

    public final boolean f() {
        if (this.b == null && this.d == null) {
            if (this.e == null) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        if (f()) {
            a(this.b);
            a(this.c);
            a(this.d);
            this.a.X.a(this.e);
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.a.V.smoothScrollToPosition(0);
            View view = this.a.N;
            if (view != null) {
                view.setVisibility(0);
            }
            view = this.a.P;
            if (view != null) {
                view.setVisibility(0);
            }
            a aVar = this.a.y;
            if (aVar != null) {
                f fVar = aVar.a;
                if (fVar != null) {
                    fVar.o = false;
                }
            }
        }
    }
}
