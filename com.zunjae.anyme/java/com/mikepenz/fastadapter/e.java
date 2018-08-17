package com.mikepenz.fastadapter;

import defpackage.acl;
import java.util.Iterator;

final class e extends acl<Item> {
    final /* synthetic */ b a;

    e(b bVar) {
        this.a = bVar;
    }

    public final boolean a(int i, b<Item> bVar) {
        Iterator it = bVar.f.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        return (bVar.o == null || bVar.d(i) == null) ? false : bVar.o.a();
    }
}
