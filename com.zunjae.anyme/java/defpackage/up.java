package defpackage;

import javax.annotation.Nullable;

public final class up {
    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
