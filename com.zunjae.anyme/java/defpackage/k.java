package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class k implements Iterator<Entry<K, V>>, m<K, V> {
    final /* synthetic */ g a;
    private j<K, V> b;
    private boolean c;

    private k(g gVar) {
        this.a = gVar;
        this.c = true;
    }

    public final void a_(j<K, V> jVar) {
        j<K, V> jVar2 = this.b;
        if (jVar == jVar2) {
            this.b = jVar2.d;
            this.c = this.b == null;
        }
    }

    public final boolean hasNext() {
        if (this.c) {
            return this.a.a != null;
        } else {
            j jVar = this.b;
            return (jVar == null || jVar.c == null) ? false : true;
        }
    }

    public final /* synthetic */ Object next() {
        j a;
        if (this.c) {
            this.c = false;
            a = this.a.a;
        } else {
            a = this.b;
            a = a != null ? a.c : null;
        }
        this.b = a;
        return this.b;
    }
}
