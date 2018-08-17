package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

final class gt {
    private final Queue<gs> a;

    private gt() {
        this.a = new ArrayDeque();
    }

    final gs a() {
        gs gsVar;
        synchronized (this.a) {
            gsVar = (gs) this.a.poll();
        }
        return gsVar == null ? new gs() : gsVar;
    }

    final void a(gs gsVar) {
        synchronized (this.a) {
            if (this.a.size() < 10) {
                this.a.offer(gsVar);
            }
        }
    }
}
