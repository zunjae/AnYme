package com.mikepenz.fastadapter.expandable;

import android.support.v4.util.ArraySet;
import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.u;
import com.mikepenz.fastadapter.y;
import defpackage.acr;

final class b implements acr<Item> {
    ArraySet<u> a = new ArraySet();
    final /* synthetic */ int[] b;
    final /* synthetic */ a c;

    b(a aVar, int[] iArr) {
        this.c = aVar;
        this.b = iArr;
    }

    public final boolean a(Item item, int i) {
        if (i == -1) {
            return false;
        }
        if (this.a.size() > 0 && (item instanceof y)) {
            u h = ((y) item).h();
            if (h == null || !this.a.contains(h)) {
                return true;
            }
        }
        if (item instanceof n) {
            n nVar = (n) item;
            if (nVar.a()) {
                nVar.a(false);
                if (nVar.b() != null) {
                    int[] iArr = this.b;
                    iArr[0] = iArr[0] + nVar.b().size();
                    this.a.add(item);
                }
            }
        }
        return false;
    }
}
