package org.jsoup.nodes;

import java.util.Iterator;
import java.util.Map.Entry;

final class b implements Iterator<Entry<String, String>> {
    final /* synthetic */ a a;
    private Iterator<Attribute> b;
    private Attribute c;

    private b(a aVar) {
        this.a = aVar;
        this.b = this.a.a.a.values().iterator();
    }

    public final boolean hasNext() {
        while (this.b.hasNext()) {
            this.c = (Attribute) this.b.next();
            if (this.c.a()) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        return new Attribute(this.c.getKey().substring(5), this.c.getValue());
    }

    public final void remove() {
        this.a.a.a.remove(this.c.getKey());
    }
}
