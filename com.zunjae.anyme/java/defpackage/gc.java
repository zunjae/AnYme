package defpackage;

import java.util.HashMap;
import java.util.Map;

final class gc<K extends gi, V> {
    private final gd<K, V> a = new gd();
    private final Map<K, gd<K, V>> b = new HashMap();

    gc() {
    }

    private static <K, V> void a(gd<K, V> gdVar) {
        gdVar.a.b = gdVar;
        gdVar.b.a = gdVar;
    }

    private static <K, V> void b(gd<K, V> gdVar) {
        gd gdVar2 = gdVar.b;
        gdVar2.a = gdVar.a;
        gdVar.a.b = gdVar2;
    }

    public final V a() {
        gd gdVar = this.a;
        while (true) {
            gdVar = gdVar.b;
            if (gdVar.equals(this.a)) {
                return null;
            }
            V a = gdVar.a();
            if (a != null) {
                return a;
            }
            gc.b(gdVar);
            this.b.remove(gdVar.c);
            ((gi) gdVar.c).a();
        }
    }

    public final V a(K k) {
        gd gdVar = (gd) this.b.get(k);
        if (gdVar == null) {
            gdVar = new gd(k);
            this.b.put(k, gdVar);
        } else {
            k.a();
        }
        gc.b(gdVar);
        gd gdVar2 = this.a;
        gdVar.b = gdVar2;
        gdVar.a = gdVar2.a;
        gc.a(gdVar);
        return gdVar.a();
    }

    public final void a(K k, V v) {
        gd gdVar = (gd) this.b.get(k);
        if (gdVar == null) {
            gdVar = new gd(k);
            gc.b(gdVar);
            gd gdVar2 = this.a;
            gdVar.b = gdVar2.b;
            gdVar.a = gdVar2;
            gc.a(gdVar);
            this.b.put(k, gdVar);
        } else {
            k.a();
        }
        gdVar.a((Object) v);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (gd gdVar = this.a.a; !gdVar.equals(this.a); gdVar = gdVar.a) {
            obj = 1;
            stringBuilder.append('{');
            stringBuilder.append(gdVar.c);
            stringBuilder.append(':');
            stringBuilder.append(gdVar.b());
            stringBuilder.append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }
}
