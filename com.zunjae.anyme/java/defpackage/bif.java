package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public abstract class bif<E> implements Serializable, Collection<E> {
    private Collection<E> a;

    protected bif(Collection<E> collection) {
        if (collection != null) {
            this.a = collection;
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    protected final Collection<E> a() {
        return this.a;
    }

    public boolean add(E e) {
        return this.a.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(collection);
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.a.iterator();
    }

    public boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.a.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.a.retainAll(collection);
    }

    public int size() {
        return this.a.size();
    }

    public Object[] toArray() {
        return this.a.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.a.toArray(tArr);
    }

    public String toString() {
        return this.a.toString();
    }
}
