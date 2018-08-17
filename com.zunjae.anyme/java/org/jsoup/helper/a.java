package org.jsoup.helper;

import java.util.Iterator;
import java.util.ListIterator;

final class a<E> implements Iterator<E> {
    final /* synthetic */ DescendableLinkedList a;
    private final ListIterator<E> b;

    private a(DescendableLinkedList descendableLinkedList, int i) {
        this.a = descendableLinkedList;
        this.b = descendableLinkedList.listIterator(i);
    }

    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    public final E next() {
        return this.b.previous();
    }

    public final void remove() {
        this.b.remove();
    }
}
