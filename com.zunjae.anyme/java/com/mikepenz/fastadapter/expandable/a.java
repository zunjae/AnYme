package com.mikepenz.fastadapter.expandable;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.h;
import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.u;
import com.mikepenz.fastadapter.v;
import com.mikepenz.fastadapter.y;
import java.util.ArrayList;

public final class a<Item extends u> implements i<Item> {
    private b<Item> a;
    private boolean b = false;
    private SparseIntArray c = new SparseIntArray();

    private void a(int i, boolean z) {
        int[] iArr = new int[]{0};
        this.a.a(new b(this, iArr), i, true);
        h d = this.a.d(i);
        if (d != null && (d instanceof v)) {
            ((v) d).a(i + 1, iArr[0]);
        }
        if (z) {
            this.a.notifyItemChanged(i);
        }
    }

    private int[] a(int i) {
        ArrayList arrayList = new ArrayList();
        u b = this.a.b(i);
        int itemCount = this.a.getItemCount();
        int i2 = 0;
        while (i2 < itemCount) {
            u b2 = this.a.b(i2);
            if (b2 instanceof y) {
                b2 = ((y) b2).h();
                if (b2 instanceof n) {
                    n nVar = (n) b2;
                    if (nVar.a()) {
                        i2 += nVar.b().size();
                        if (b2 != b) {
                            arrayList.add(Integer.valueOf(this.a.b(b2)));
                        }
                    }
                }
            }
            i2++;
        }
        i = arrayList.size();
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    private void b(int i) {
        u b = this.a.b(i);
        if (b != null && (b instanceof n)) {
            n nVar = (n) b;
            if (!nVar.a() && nVar.b() != null && nVar.b().size() > 0) {
                h d = this.a.d(i);
                if (d != null && (d instanceof v)) {
                    ((v) d).a(i + 1, nVar.b());
                }
                nVar.a(true);
            }
        }
    }

    private int[] d() {
        ArrayList arrayList = new ArrayList();
        int itemCount = this.a.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            u b = this.a.b(i);
            if ((b instanceof n) && ((n) b).a()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        itemCount = arrayList.size();
        int[] iArr = new int[itemCount];
        for (int i2 = 0; i2 < itemCount; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public final void a() {
        c();
    }

    public final void a(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            u b = this.a.b(i);
            if ((b instanceof n) && ((n) b).a()) {
                a(i, false);
            }
        }
    }

    public final void a(Bundle bundle, String str) {
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("bundle_expanded".concat(String.valueOf(str)));
            int itemCount = this.a.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                String valueOf = String.valueOf(this.a.b(i).c());
                if (stringArrayList != null && stringArrayList.contains(valueOf)) {
                    b(i);
                    itemCount = this.a.getItemCount();
                }
            }
        }
    }

    public final boolean a(View view, int i, Item item) {
        boolean z = item instanceof n;
        if (z && ((n) item).b() != null) {
            u b = this.a.b(i);
            if ((b instanceof n) && ((n) b).a()) {
                a(i, false);
            } else {
                b(i);
            }
        }
        if (this.b && z) {
            n nVar = (n) item;
            if (nVar.b() != null && nVar.b().size() > 0) {
                int[] iArr;
                int length;
                u b2 = this.a.b(i);
                if (b2 instanceof y) {
                    u h = ((y) b2).h();
                    if (h instanceof n) {
                        ArrayList arrayList = new ArrayList();
                        for (u next : ((n) h).b()) {
                            if ((next instanceof n) && ((n) next).a() && next != b2) {
                                arrayList.add(Integer.valueOf(this.a.b(next)));
                            }
                        }
                        int size = arrayList.size();
                        int[] iArr2 = new int[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                        }
                        iArr = iArr2;
                        for (length = iArr.length - 1; length >= 0; length--) {
                            if (iArr[length] != i) {
                                a(iArr[length], true);
                            }
                        }
                    }
                }
                iArr = a(i);
                for (length = iArr.length - 1; length >= 0; length--) {
                    if (iArr[length] != i) {
                        a(iArr[length], true);
                    }
                }
            }
        }
        return false;
    }

    public final void b() {
        c();
    }

    public final void b(Bundle bundle, String str) {
        if (bundle != null) {
            ArrayList arrayList = new ArrayList();
            int itemCount = this.a.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                u b = this.a.b(i);
                if ((b instanceof n) && ((n) b).a()) {
                    arrayList.add(String.valueOf(b.c()));
                }
            }
            bundle.putStringArrayList("bundle_expanded".concat(String.valueOf(str)), arrayList);
        }
    }

    public final boolean b(View view, int i, Item item) {
        return false;
    }

    public final void c() {
        int[] d = d();
        for (int length = d.length - 1; length >= 0; length--) {
            a(d[length], false);
        }
    }
}
