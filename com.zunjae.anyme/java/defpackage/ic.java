package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ic implements hv {
    private final Map<String, List<ib>> c;
    private volatile Map<String, String> d;

    ic(Map<String, List<ib>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    Map hashMap = new HashMap();
                    for (Entry entry : this.c.entrySet()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        List list = (List) entry.getValue();
                        for (int i = 0; i < list.size(); i++) {
                            stringBuilder.append(((ib) list.get(i)).a());
                            if (i != list.size() - 1) {
                                stringBuilder.append(',');
                            }
                        }
                        hashMap.put(entry.getKey(), stringBuilder.toString());
                    }
                    this.d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic)) {
            return false;
        }
        return this.c.equals(((ic) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LazyHeaders{headers=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
