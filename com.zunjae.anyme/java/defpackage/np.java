package defpackage;

import java.util.Queue;

public final class np {
    private static final np b = new np();
    private final Queue<byte[]> a = nw.a(0);

    private np() {
    }

    public static np a() {
        return b;
    }

    public final boolean a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.a) {
            if (this.a.size() < 32) {
                z = true;
                this.a.offer(bArr);
            }
        }
        return z;
    }

    public final byte[] b() {
        byte[] bArr;
        synchronized (this.a) {
            bArr = (byte[]) this.a.poll();
        }
        return bArr == null ? new byte[65536] : bArr;
    }
}
