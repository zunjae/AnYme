package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class sz extends BroadcastReceiver {
    final /* synthetic */ sx a;

    sz(sx sxVar) {
        this.a = sxVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.h = false;
    }
}
