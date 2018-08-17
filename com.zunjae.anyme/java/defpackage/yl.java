package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class yl<T> implements Iterator<T> {
    ym<K, V> b;
    ym<K, V> c = null;
    int d;
    final /* synthetic */ yf e;

    yl(yf yfVar) {
        this.e = yfVar;
        yfVar = this.e;
        this.b = yfVar.e.d;
        this.d = yfVar.d;
    }

    final ym<K, V> a() {
        ym<K, V> ymVar = this.b;
        yf yfVar = this.e;
        if (ymVar == yfVar.e) {
            throw new NoSuchElementException();
        } else if (yfVar.d == this.d) {
            this.b = ymVar.d;
            this.c = ymVar;
            return ymVar;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.b != this.e.e;
    }

    public final void remove() {
        ym ymVar = this.c;
        if (ymVar != null) {
            this.e.a(ymVar, true);
            this.c = null;
            this.d = this.e.d;
            return;
        }
        throw new IllegalStateException();
    }
}
