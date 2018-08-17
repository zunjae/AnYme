package defpackage;

import java.util.Queue;

final class kp {
    private final Queue<ea> a = nw.a(0);

    kp() {
    }

    public final synchronized ea a(byte[] bArr) {
        ea eaVar;
        eaVar = (ea) this.a.poll();
        if (eaVar == null) {
            eaVar = new ea();
        }
        return eaVar.a(bArr);
    }

    public final synchronized void a(ea eaVar) {
        eaVar.a();
        this.a.offer(eaVar);
    }
}
