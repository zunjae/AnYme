package defpackage;

import java.util.List;
import java.util.ListIterator;
import ut$vf.vg;

final class vi extends vg implements ListIterator<V> {
    final /* synthetic */ vh d;

    vi(vh vhVar) {
        this.d = vhVar;
        super(vhVar);
    }

    public vi(vh vhVar, int i) {
        this.d = vhVar;
        super(vhVar, ((List) vhVar.c).listIterator(i));
    }

    private ListIterator<V> b() {
        a();
        return (ListIterator) this.a;
    }

    public final void add(V v) {
        boolean isEmpty = this.d.isEmpty();
        b().add(v);
        this.d.g.b = this.d.g.b + 1;
        if (isEmpty) {
            this.d.c();
        }
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final V previous() {
        return b().previous();
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public final void set(V v) {
        b().set(v);
    }
}
