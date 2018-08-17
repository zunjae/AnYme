package defpackage;

import java.util.Iterator;

public final class bih<E> implements bie, Iterator<E> {
    private final Iterator<? extends E> a;

    private bih(Iterator<? extends E> it) {
        this.a = it;
    }

    public static <E> Iterator<E> a(Iterator<? extends E> it) {
        if (it != null) {
            return it instanceof bie ? it : new bih(it);
        } else {
            throw new NullPointerException("Iterator must not be null");
        }
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final E next() {
        return this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
