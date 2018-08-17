package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class yx<E> extends wz<Object> {
    public static final xb a = new yy();
    private final Class<E> b;
    private final wz<E> c;

    public yx(we weVar, wz<E> wzVar, Class<E> cls) {
        this.c = new zx(weVar, wzVar, cls);
        this.b = cls;
    }

    public final Object a(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        List arrayList = new ArrayList();
        abn.a();
        while (abn.e()) {
            arrayList.add(this.c.a(abn));
        }
        abn.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void a(abq abq, Object obj) {
        if (obj == null) {
            abq.f();
            return;
        }
        abq.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(abq, Array.get(obj, i));
        }
        abq.c();
    }
}
