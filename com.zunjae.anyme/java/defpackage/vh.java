package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;
import ut.vf;

class vh extends vf implements List<V> {
    final /* synthetic */ ut g;

    vh(ut utVar, K k, List<V> list, @Nullable vf vfVar) {
        this.g = utVar;
        super(utVar, k, list, vfVar);
    }

    public void add(int i, V v) {
        a();
        boolean isEmpty = this.c.isEmpty();
        ((List) this.c).add(i, v);
        this.g.b = this.g.b + 1;
        if (isEmpty) {
            c();
        }
    }

    public boolean addAll(int i, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.c).addAll(i, collection);
        if (addAll) {
            ut.a(this.g, this.c.size() - size);
            if (size == 0) {
                c();
            }
        }
        return addAll;
    }

    public V get(int i) {
        a();
        return ((List) this.c).get(i);
    }

    public int indexOf(Object obj) {
        a();
        return ((List) this.c).indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        a();
        return ((List) this.c).lastIndexOf(obj);
    }

    public ListIterator<V> listIterator() {
        a();
        return new vi(this);
    }

    public ListIterator<V> listIterator(int i) {
        a();
        return new vi(this, i);
    }

    public V remove(int i) {
        a();
        V remove = ((List) this.c).remove(i);
        this.g.b = this.g.b - 1;
        b();
        return remove;
    }

    public V set(int i, V v) {
        a();
        return ((List) this.c).set(i, v);
    }

    public List<V> subList(int i, int i2) {
        a();
        ut utVar = this.g;
        Object obj = this.b;
        List subList = ((List) this.c).subList(i, i2);
        vf vfVar = this.d;
        if (vfVar == null) {
            vfVar = this;
        }
        return utVar.a(obj, subList, vfVar);
    }
}
