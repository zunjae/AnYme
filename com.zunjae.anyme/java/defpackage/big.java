package defpackage;

import java.util.Collection;
import java.util.Iterator;

public final class big<E> extends bif<E> implements bie {
    private big(Collection<? extends E> collection) {
        super(collection);
    }

    public static <T> Collection<T> a(Collection<? extends T> collection) {
        return collection instanceof bie ? collection : new big(collection);
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Iterator<E> iterator() {
        return bih.a(a().iterator());
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
}
