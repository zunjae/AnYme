package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendableLinkedList<E> extends LinkedList<E> {
    public Iterator<E> descendingIterator() {
        return new a(this, size(), (byte) 0);
    }

    public E peekLast() {
        return size() == 0 ? null : getLast();
    }

    public E pollLast() {
        return size() == 0 ? null : removeLast();
    }

    public void push(E e) {
        addFirst(e);
    }
}
