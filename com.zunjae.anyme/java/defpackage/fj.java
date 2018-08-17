package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

final class fj implements Callback {
    private fj() {
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (1 != i) {
            if (2 != i) {
                return false;
            }
        }
        fh fhVar = (fh) message.obj;
        if (1 == message.what) {
            fh.a(fhVar);
        } else {
            fh.b(fhVar);
        }
        return true;
    }
}
