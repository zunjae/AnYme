package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zj<K, V> extends wz<Map<K, V>> {
    final /* synthetic */ zi a;
    private final wz<K> b;
    private final wz<V> c;
    private final yn<? extends Map<K, V>> d;

    public zj(zi ziVar, we weVar, Type type, wz<K> wzVar, Type type2, wz<V> wzVar2, yn<? extends Map<K, V>> ynVar) {
        this.a = ziVar;
        this.b = new zx(weVar, wzVar, type);
        this.c = new zx(weVar, wzVar2, type2);
        this.d = ynVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        abp f = abn.f();
        if (f == abp.NULL) {
            abn.j();
            return null;
        }
        Map map = (Map) this.d.a();
        Object a;
        if (f == abp.BEGIN_ARRAY) {
            abn.a();
            while (abn.e()) {
                abn.a();
                a = this.b.a(abn);
                if (map.put(a, this.c.a(abn)) == null) {
                    abn.b();
                } else {
                    throw new wv("duplicate key: ".concat(String.valueOf(a)));
                }
            }
            abn.b();
        } else {
            abn.c();
            while (abn.e()) {
                yd.a.a(abn);
                a = this.b.a(abn);
                if (map.put(a, this.c.a(abn)) != null) {
                    throw new wv("duplicate key: ".concat(String.valueOf(a)));
                }
            }
            abn.d();
        }
        return map;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            abq.f();
        } else if (this.a.a) {
            List arrayList = new ArrayList(map.size());
            List arrayList2 = new ArrayList(map.size());
            int i = 0;
            int i2 = 0;
            for (Entry entry : map.entrySet()) {
                int i3;
                wo a = this.b.a(entry.getKey());
                arrayList.add(a);
                arrayList2.add(entry.getValue());
                if (!(a instanceof wm)) {
                    if (!(a instanceof wr)) {
                        i3 = 0;
                        i2 |= i3;
                    }
                }
                i3 = 1;
                i2 |= i3;
            }
            int size;
            if (i2 != 0) {
                abq.b();
                size = arrayList.size();
                while (i < size) {
                    abq.b();
                    yp.a((wo) arrayList.get(i), abq);
                    this.c.a(abq, arrayList2.get(i));
                    abq.c();
                    i++;
                }
                abq.c();
                return;
            }
            abq.d();
            size = arrayList.size();
            while (i < size) {
                String valueOf;
                wo woVar = (wo) arrayList.get(i);
                if (woVar instanceof wt) {
                    wt g = woVar.g();
                    if (g.i()) {
                        valueOf = String.valueOf(g.a());
                    } else if (g.h()) {
                        valueOf = Boolean.toString(g.f());
                    } else if (g.j()) {
                        valueOf = g.b();
                    } else {
                        throw new AssertionError();
                    }
                } else if (woVar instanceof wq) {
                    valueOf = "null";
                } else {
                    throw new AssertionError();
                }
                abq.a(valueOf);
                this.c.a(abq, arrayList2.get(i));
                i++;
            }
            abq.e();
        } else {
            abq.d();
            for (Entry entry2 : map.entrySet()) {
                abq.a(String.valueOf(entry2.getKey()));
                this.c.a(abq, entry2.getValue());
            }
            abq.e();
        }
    }
}
