package com.zunjae.anyme.rewrite.activities;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.anq;
import defpackage.arm;
import defpackage.atk;
import defpackage.aux;

final class g extends c<arm> {
    final /* synthetic */ MainActivityR2 a;

    g(MainActivityR2 mainActivityR2, Activity activity) {
        this.a = mainActivityR2;
        super(activity);
    }

    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((arm) obj);
    }

    public final /* synthetic */ Object b() {
        Object a = atk.a(anq.c().a());
        if (a != null) {
            aux.a("KEY_MALUSERPROFILE2", a);
        }
        return a;
    }

    protected final boolean c() {
        arm e = anq.e();
        return e != null && e.b() > System.currentTimeMillis();
    }

    protected final /* synthetic */ Object d() {
        return anq.e();
    }
}
