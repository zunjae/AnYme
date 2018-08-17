package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class vq implements Iterator<Object> {
    vq() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new IllegalStateException();
    }
}
