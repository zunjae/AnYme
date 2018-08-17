package defpackage;

import java.util.HashMap;
import java.util.Map;

final class gr {
    private final Map<eg, gs> a = new HashMap();
    private final gt b = new gt();

    gr() {
    }

    final void a(eg egVar) {
        gs gsVar;
        synchronized (this) {
            gsVar = (gs) this.a.get(egVar);
            if (gsVar == null) {
                gsVar = this.b.a();
                this.a.put(egVar, gsVar);
            }
            gsVar.b++;
        }
        gsVar.a.lock();
    }

    final void b(eg egVar) {
        gs gsVar;
        synchronized (this) {
            gsVar = (gs) this.a.get(egVar);
            if (gsVar != null) {
                if (gsVar.b > 0) {
                    int i = gsVar.b - 1;
                    gsVar.b = i;
                    if (i == 0) {
                        gs gsVar2 = (gs) this.a.remove(egVar);
                        if (gsVar2.equals(gsVar)) {
                            this.b.a(gsVar2);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("Removed the wrong lock, expected to remove: ");
                            stringBuilder.append(gsVar);
                            stringBuilder.append(", but actually removed: ");
                            stringBuilder.append(gsVar2);
                            stringBuilder.append(", key: ");
                            stringBuilder.append(egVar);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder("Cannot release a lock that is not held, key: ");
            stringBuilder2.append(egVar);
            stringBuilder2.append(", interestedThreads: ");
            stringBuilder2.append(gsVar == null ? 0 : gsVar.b);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        gsVar.a.unlock();
    }
}
