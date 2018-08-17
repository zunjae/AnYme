package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.Nullable;

class vf extends AbstractCollection<V> {
    final K b;
    Collection<V> c;
    final ut.vf d;
    final Collection<V> e;
    final /* synthetic */ ut f;

    vf(ut utVar, @Nullable K k, Collection<V> collection, @Nullable ut.vf vfVar) {
        this.f = utVar;
        this.b = k;
        this.c = collection;
        this.d = vfVar;
        this.e = vfVar == null ? null : vfVar.c;
    }

    final void a() {
        vf vfVar = this.d;
        if (vfVar != null) {
            vfVar.a();
            if (this.d.c != this.e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.c.isEmpty()) {
            Collection collection = (Collection) this.f.a.get(this.b);
            if (collection != null) {
                this.c = collection;
            }
        }
    }

    public boolean add(V v) {
        a();
        boolean isEmpty = this.c.isEmpty();
        boolean add = this.c.add(v);
        if (add) {
            this.f.b = this.f.b + 1;
            if (isEmpty) {
                c();
            }
        }
        return add;
    }

    public boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.c.addAll(collection);
        if (addAll) {
            ut.a(this.f, this.c.size() - size);
            if (size == 0) {
                c();
            }
        }
        return addAll;
    }

    final void b() {
        vf vfVar = this;
        while (true) {
            vf vfVar2 = vfVar.d;
            if (vfVar2 == null) {
                break;
            }
            vfVar = vfVar2;
        }
        if (vfVar.c.isEmpty()) {
            vfVar.f.a.remove(vfVar.b);
        }
    }

    final void c() {
        vf vfVar = this;
        while (true) {
            vf vfVar2 = vfVar.d;
            if (vfVar2 != null) {
                vfVar = vfVar2;
            } else {
                vfVar.f.a.put(vfVar.b, vfVar.c);
                return;
            }
        }
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.c.clear();
            ut.b(this.f, size);
            b();
        }
    }

    public boolean contains(Object obj) {
        a();
        return this.c.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        a();
        return this.c.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.c.equals(obj);
    }

    public int hashCode() {
        a();
        return this.c.hashCode();
    }

    public Iterator<V> iterator() {
        a();
        return new vg(this);
    }

    public boolean remove(Object obj) {
        a();
        boolean remove = this.c.remove(obj);
        if (remove) {
            this.f.b = this.f.b - 1;
            b();
        }
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.c.removeAll(collection);
        if (removeAll) {
            ut.a(this.f, this.c.size() - size);
            b();
        }
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        uq.a((Object) collection);
        int size = size();
        boolean retainAll = this.c.retainAll(collection);
        if (retainAll) {
            ut.a(this.f, this.c.size() - size);
            b();
        }
        return retainAll;
    }

    public int size() {
        a();
        return this.c.size();
    }

    public String toString() {
        a();
        return this.c.toString();
    }
}
