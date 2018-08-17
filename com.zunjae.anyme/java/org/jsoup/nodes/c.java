package org.jsoup.nodes;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class c extends AbstractSet<Entry<String, String>> {
    final /* synthetic */ a a;

    private c(a aVar) {
        this.a = aVar;
    }

    public final Iterator<Entry<String, String>> iterator() {
        return new b(this.a);
    }

    public final int size() {
        int i = 0;
        while (new b(this.a).hasNext()) {
            i++;
        }
        return i;
    }
}
