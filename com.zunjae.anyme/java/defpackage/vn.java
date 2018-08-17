package defpackage;

import java.io.Serializable;
import javax.annotation.Nullable;

final class vn<K, V> extends us<K, V> implements Serializable {
    private final K a;
    private final V b;

    vn(@Nullable K k, @Nullable V v) {
        this.a = k;
        this.b = v;
    }

    public final K getKey() {
        return this.a;
    }

    public final V getValue() {
        return this.b;
    }
}
