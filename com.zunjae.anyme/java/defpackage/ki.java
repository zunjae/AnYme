package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

final class ki implements Callback {
    final /* synthetic */ kf a;

    private ki(kf kfVar) {
        this.a = kfVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.a((kg) message.obj);
            return true;
        }
        if (i == 2) {
            de.a((kg) message.obj);
        }
        return false;
    }
}
