package defpackage;

import android.os.MessageQueue.IdleHandler;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

final class ff implements IdleHandler {
    private final Map<eg, WeakReference<fn<?>>> a;
    private final ReferenceQueue<fn<?>> b;

    public ff(Map<eg, WeakReference<fn<?>>> map, ReferenceQueue<fn<?>> referenceQueue) {
        this.a = map;
        this.b = referenceQueue;
    }

    public final boolean queueIdle() {
        fg fgVar = (fg) this.b.poll();
        if (fgVar != null) {
            this.a.remove(fgVar.a);
        }
        return true;
    }
}
