package com.mikepenz.fastadapter;

import android.view.View;
import defpackage.acd;

final class d extends acd<Item> {
    final /* synthetic */ b a;

    d(b bVar) {
        this.a = bVar;
    }

    public final boolean a(View view, int i, b<Item> bVar, Item item) {
        boolean z = false;
        if (bVar.d(i) == null || item == null || !item.d()) {
            return false;
        }
        if (bVar.m != null) {
            z = bVar.m.a(i);
        }
        for (i iVar : bVar.f.values()) {
            if (z) {
                break;
            }
            z = iVar.b(view, i, item);
        }
        return (z || bVar.n == null) ? z : bVar.n.a(i);
    }
}
