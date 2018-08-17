package defpackage;

import android.os.Handler;
import android.os.Looper;

public final class aui extends ail {
    private static aui a;
    private final Handler b = new Handler(Looper.getMainLooper());

    private aui() {
    }

    public static aui a() {
        if (a == null) {
            a = new aui();
        }
        return a;
    }

    public final void d(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.c(obj);
        } else {
            this.b.post(new auj(this, obj));
        }
    }
}
