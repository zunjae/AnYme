package com.mikepenz.fastadapter;

import android.view.View;
import defpackage.aca;

final class c extends aca<Item> {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    public final void a(View view, int i, b<Item> bVar, Item item) {
        if (bVar.d(i) != null && item != null && item.d()) {
            boolean z = false;
            boolean z2 = item instanceof m;
            if (z2) {
                m mVar = (m) item;
                if (mVar.a() != null) {
                    z = mVar.a().a(view, item, i);
                }
            }
            if (!(z || bVar.k == null)) {
                z = bVar.k.a(view, item, i);
            }
            for (i iVar : bVar.f.values()) {
                if (z) {
                    break;
                }
                z = iVar.a(view, i, item);
            }
            if (!z && z2) {
                m mVar2 = (m) item;
                if (mVar2.b() != null) {
                    z = mVar2.b().a(view, item, i);
                }
            }
            if (!z && bVar.l != null) {
                bVar.l.a(view, item, i);
            }
        }
    }
}
