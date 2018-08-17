package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;

public final class ava {
    private final Application a;
    private avb b;

    public ava(Context context) {
        this.a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.b = new avb(this.a);
        }
    }

    public final void a() {
        avb avb = this.b;
        if (avb != null) {
            avb.a(avb);
        }
    }

    public final boolean a(avd avd) {
        avb avb = this.b;
        return avb != null && avb.a(avb, avd);
    }
}
