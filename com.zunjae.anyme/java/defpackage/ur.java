package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

abstract class ur<K, V> extends ut<K, V> implements vr<K, V> {
    protected ur(Map<K, Collection<V>> map) {
        super(map);
    }

    abstract List<V> a();

    public List<V> a(@Nullable K k) {
        return (List) super.b((Object) k);
    }

    public boolean a(@Nullable K k, @Nullable V v) {
        return super.a((Object) k, (Object) v);
    }

    /* synthetic */ Collection b() {
        return a();
    }

    public final /* synthetic */ Collection b(Object obj) {
        return a(obj);
    }

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }
}
