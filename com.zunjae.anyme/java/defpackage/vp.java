package defpackage;

import java.util.NoSuchElementException;

final class vp extends vu<Object> {
    vp() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }
}
