package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class ll implements li {
    private final Context a;
    private final lj b;
    private boolean c;
    private boolean d;
    private final BroadcastReceiver e = new lm(this);

    public ll(Context context, lj ljVar) {
        this.a = context.getApplicationContext();
        this.b = ljVar;
    }

    private static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void a_() {
    }

    public final void b() {
        if (!this.d) {
            this.c = ll.b(this.a);
            this.a.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        }
    }

    public final void c() {
        if (this.d) {
            this.a.unregisterReceiver(this.e);
            this.d = false;
        }
    }
}
