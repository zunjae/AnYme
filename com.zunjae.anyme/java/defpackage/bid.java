package defpackage;

import java.util.ArrayList;
import java.util.Collection;

public final class bid {
    public static final Collection a = big.a(new ArrayList());

    public static boolean a(Collection<?> collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static <C> boolean a(Collection<C> collection, Iterable<? extends C> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            z |= collection.add(add);
        }
        return z;
    }

    public static boolean b(Collection<?> collection) {
        return !bid.a(collection);
    }
}
