package com.zunjae.anyme.rewrite.ui.bls;

import android.app.Activity;
import com.zunjae.zasync.c;
import defpackage.anq;
import defpackage.arh;
import defpackage.asq;
import defpackage.ata;
import java.util.ArrayList;
import java.util.List;

final class q extends c<List<arh>> {
    final /* synthetic */ FragmentAnimeInfoExtendedBL a;
    private final List<arh> b;

    q(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, Activity activity, List<arh> list) {
        this.a = fragmentAnimeInfoExtendedBL;
        super(activity);
        this.b = list;
    }

    protected final /* synthetic */ void a(Object obj) {
        List list = (List) obj;
        super.a((Object) list);
        if (this.a.h != null && list != null) {
            this.a.h.a(list);
        }
    }

    public final /* synthetic */ Object b() {
        if (anq.a()) {
            ArrayList arrayList = new ArrayList();
            for (arh f : this.b) {
                arrayList.add(Integer.valueOf(f.f()));
            }
            this.a.f;
            List<asq> a = ata.a(arrayList);
            if (a != null) {
                for (asq asq : a) {
                    for (arh arh : this.b) {
                        if (arh.f() == asq.a) {
                            arh.a(true);
                        }
                    }
                }
            }
        }
        return this.b;
    }
}
