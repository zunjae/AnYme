package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public final class bky {
    final baz a;
    final bbz b;
    final List<bjr> c;
    final List<bjp> d;
    @Nullable
    final Executor e;
    final boolean f;
    private final Map<Method, blb<?, ?>> g = new ConcurrentHashMap();

    bky(baz baz, bbz bbz, List<bjr> list, List<bjp> list2, @Nullable Executor executor, boolean z) {
        this.a = baz;
        this.b = bbz;
        this.c = list;
        this.d = list2;
        this.e = executor;
        this.f = z;
    }

    public final <T> bjq<T, String> a(Type type, Annotation[] annotationArr) {
        bld.a((Object) type, "type == null");
        bld.a((Object) annotationArr, "annotations == null");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i);
        }
        return bjl.a;
    }

    public final <T> bjq<T, bcp> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        bld.a((Object) type, "type == null");
        bld.a((Object) annotationArr, "parameterAnnotations == null");
        bld.a((Object) annotationArr2, "methodAnnotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            bjq<T, bcp> a = ((bjr) this.c.get(i)).a(type);
            if (a != null) {
                return a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Could not locate RequestBody converter for ");
        stringBuilder.append(type);
        stringBuilder.append(".\n");
        stringBuilder.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            stringBuilder.append("\n   * ");
            stringBuilder.append(((bjr) this.c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final blb<?, ?> a(Method method) {
        blb<?, ?> blb___ = (blb) this.g.get(method);
        if (blb___ != null) {
            return blb___;
        }
        blb<?, ?> blb___2;
        synchronized (this.g) {
            blb___2 = (blb) this.g.get(method);
            if (blb___2 == null) {
                blb___2 = new blc(this, method).a();
                this.g.put(method, blb___2);
            }
        }
        return blb___2;
    }

    public final <T> T a(Class<T> cls) {
        bld.a((Class) cls);
        if (this.f) {
            bkr a = bkr.a();
            for (Method method : cls.getDeclaredMethods()) {
                if (!a.a(method)) {
                    a(method);
                }
            }
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new bkz(this, cls));
    }
}
