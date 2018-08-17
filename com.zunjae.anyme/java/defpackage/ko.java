package defpackage;

import java.util.Queue;

final class ko {
    private final Queue<dw> a = nw.a(0);

    ko() {
    }

    public final synchronized dw a(dx dxVar) {
        dw dwVar;
        dwVar = (dw) this.a.poll();
        if (dwVar == null) {
            dwVar = new dw(dxVar);
        }
        return dwVar;
    }

    public final synchronized void a(dw dwVar) {
        dwVar.g();
        this.a.offer(dwVar);
    }
}
