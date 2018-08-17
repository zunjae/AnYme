package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;

final class za<E> extends wz<Collection<E>> {
    private final wz<E> a;
    private final yn<? extends Collection<E>> b;

    public za(we weVar, Type type, wz<E> wzVar, yn<? extends Collection<E>> ynVar) {
        this.a = new zx(weVar, wzVar, type);
        this.b = ynVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        Collection collection = (Collection) this.b.a();
        abn.a();
        while (abn.e()) {
            collection.add(this.a.a(abn));
        }
        abn.b();
        return collection;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            abq.f();
            return;
        }
        abq.b();
        for (Object a : collection) {
            this.a.a(abq, a);
        }
        abq.c();
    }
}
