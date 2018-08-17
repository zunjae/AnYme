package defpackage;

import java.util.Iterator;

public abstract class vu<E> implements Iterator<E> {
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
