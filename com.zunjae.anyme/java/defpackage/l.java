package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

abstract class l<K, V> implements Iterator<Entry<K, V>>, m<K, V> {
    j<K, V> a;
    j<K, V> b;

    l(j<K, V> jVar, j<K, V> jVar2) {
        this.a = jVar2;
        this.b = jVar;
    }

    private j<K, V> a() {
        j jVar = this.b;
        j jVar2 = this.a;
        if (jVar != jVar2) {
            if (jVar2 != null) {
                return a(jVar);
            }
        }
        return null;
    }

    abstract j<K, V> a(j<K, V> jVar);

    public final void a_(j<K, V> jVar) {
        if (this.a == jVar && jVar == this.b) {
            this.b = null;
            this.a = null;
        }
        j<K, V> jVar2 = this.a;
        if (jVar2 == jVar) {
            this.a = b(jVar2);
        }
        if (this.b == jVar) {
            this.b = a();
        }
    }

    abstract j<K, V> b(j<K, V> jVar);

    public boolean hasNext() {
        return this.b != null;
    }

    public /* synthetic */ Object next() {
        j jVar = this.b;
        this.b = a();
        return jVar;
    }
}
