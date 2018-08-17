package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;

final class wj extends wz<AtomicLongArray> {
    final /* synthetic */ wz a;

    wj(wz wzVar) {
        this.a = wzVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        List arrayList = new ArrayList();
        abn.a();
        while (abn.e()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(abn)).longValue()));
        }
        abn.b();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        abq.b();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.a.a(abq, Long.valueOf(atomicLongArray.get(i)));
        }
        abq.c();
    }
}
