package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public interface vt<K, V> {
    boolean a(@Nullable K k, @Nullable V v);

    Collection<V> b(@Nullable K k);

    boolean c();

    Set<K> e();

    Collection<V> f();

    Map<K, Collection<V>> g();
}
