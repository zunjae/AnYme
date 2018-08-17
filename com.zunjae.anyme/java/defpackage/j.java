package defpackage;

import java.util.Map.Entry;

final class j<K, V> implements Entry<K, V> {
    final K a;
    final V b;
    j<K, V> c;
    j<K, V> d;

    j(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b.equals(jVar.b);
    }

    public final K getKey() {
        return this.a;
    }

    public final V getValue() {
        return this.b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
