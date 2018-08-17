package defpackage;

import g.k;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class g<K, V> implements Iterable<Entry<K, V>> {
    private j<K, V> a;
    private j<K, V> b;
    private WeakHashMap<m<K, V>, Boolean> c = new WeakHashMap();
    private int d = 0;

    public final int a() {
        return this.d;
    }

    protected j<K, V> a(K k) {
        j<K, V> jVar = this.a;
        while (jVar != null && !jVar.a.equals(k)) {
            jVar = jVar.c;
        }
        return jVar;
    }

    public V a(K k, V v) {
        j a = a((Object) k);
        if (a != null) {
            return a.b;
        }
        b(k, v);
        return null;
    }

    protected final j<K, V> b(K k, V v) {
        j<K, V> jVar = new j(k, v);
        this.d++;
        j jVar2 = this.b;
        if (jVar2 == null) {
            this.a = jVar;
            this.b = this.a;
            return jVar;
        }
        jVar2.c = jVar;
        jVar.d = jVar2;
        this.b = jVar;
        return jVar;
    }

    public V b(K k) {
        j a = a((Object) k);
        if (a == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            for (m a_ : this.c.keySet()) {
                a_.a_(a);
            }
        }
        j jVar = a.d;
        if (jVar != null) {
            jVar.c = a.c;
        } else {
            this.a = a.c;
        }
        jVar = a.c;
        if (jVar != null) {
            jVar.d = a.d;
        } else {
            this.b = a.d;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final Iterator<Entry<K, V>> b() {
        Iterator iVar = new i(this.b, this.a);
        this.c.put(iVar, Boolean.FALSE);
        return iVar;
    }

    public final k c() {
        k kVar = new k();
        this.c.put(kVar, Boolean.FALSE);
        return kVar;
    }

    public final Entry<K, V> d() {
        return this.a;
    }

    public final Entry<K, V> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.d != gVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Iterator<Entry<K, V>> iterator() {
        Iterator hVar = new h(this.a, this.b);
        this.c.put(hVar, Boolean.FALSE);
        return hVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
