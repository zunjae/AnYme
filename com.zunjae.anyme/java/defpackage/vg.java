package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class vg implements Iterator<V> {
    final Iterator<V> a;
    final Collection<V> b = this.c.c;
    final /* synthetic */ vf c;

    vg(vf vfVar) {
        this.c = vfVar;
        this.a = ut.a(vfVar.c);
    }

    vg(vf vfVar, Iterator<V> it) {
        this.c = vfVar;
        this.a = it;
    }

    final void a() {
        this.c.a();
        if (this.c.c != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    public V next() {
        a();
        return this.a.next();
    }

    public void remove() {
        this.a.remove();
        this.c.f.b = this.c.f.b - 1;
        this.c.b();
    }
}
