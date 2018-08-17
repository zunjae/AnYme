package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class lm extends BroadcastReceiver {
    final /* synthetic */ ll a;

    lm(ll llVar) {
        this.a = llVar;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean a = this.a.c;
        this.a.c = ll.b(context);
        if (a != this.a.c) {
            this.a.b.a(this.a.c);
        }
    }
}
