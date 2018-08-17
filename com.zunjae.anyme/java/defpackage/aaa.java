package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class aaa extends wz<AtomicIntegerArray> {
    aaa() {
    }

    private static AtomicIntegerArray b(abn abn) {
        List arrayList = new ArrayList();
        abn.a();
        while (abn.e()) {
            try {
                arrayList.add(Integer.valueOf(abn.m()));
            } catch (Throwable e) {
                throw new wv(e);
            }
        }
        abn.b();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    public final /* synthetic */ Object a(abn abn) {
        return aaa.b(abn);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        abq.b();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            abq.a((long) atomicIntegerArray.get(i));
        }
        abq.c();
    }
}
