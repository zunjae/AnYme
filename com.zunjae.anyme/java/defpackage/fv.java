package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

final class fv implements Callback {
    private fv() {
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((ft) message.obj).d();
        return true;
    }
}
