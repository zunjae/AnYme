package defpackage;

import java.util.Map.Entry;
import javax.annotation.Nullable;

abstract class us<K, V> implements Entry<K, V> {
    us() {
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            if (up.a(getKey(), entry.getKey()) && up.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getKey());
        stringBuilder.append("=");
        stringBuilder.append(getValue());
        return stringBuilder.toString();
    }
}
