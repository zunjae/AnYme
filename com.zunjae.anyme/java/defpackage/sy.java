package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class sy extends BroadcastReceiver {
    final /* synthetic */ sx a;

    sy(sx sxVar) {
        this.a = sxVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.h = true;
    }
}
