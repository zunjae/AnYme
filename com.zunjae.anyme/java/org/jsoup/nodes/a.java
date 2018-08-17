package org.jsoup.nodes;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

final class a extends AbstractMap<String, String> {
    final /* synthetic */ Attributes a;

    private a(Attributes attributes) {
        this.a = attributes;
        if (attributes.a == null) {
            attributes.a = new LinkedHashMap(2);
        }
    }

    public final Set<Entry<String, String>> entrySet() {
        return new c();
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj2;
        String a = "data-".concat(String.valueOf((String) obj));
        Object value = this.a.hasKey(a) ? ((Attribute) this.a.a.get(a)).getValue() : null;
        this.a.a.put(a, new Attribute(a, str));
        return value;
    }
}
