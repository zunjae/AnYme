package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class axo extends Handler {
    public axo() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        axn axn = (axn) message.obj;
        if (message.what == 1) {
            axi.b(axn.a);
        }
    }
}
