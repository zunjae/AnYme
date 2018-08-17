package defpackage;

import android.content.Context;

public final class lk {
    public static li a(Context context, lj ljVar) {
        return (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null) != null ? new ll(context, ljVar) : new lq();
    }
}
