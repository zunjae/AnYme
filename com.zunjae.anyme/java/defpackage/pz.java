package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

final class pz {
    private static final AtomicLong a = new AtomicLong(0);
    private static String b;

    public pz(aww aww) {
        r0 = new byte[10];
        long time = new Date().getTime();
        long j = time / 1000;
        time %= 1000;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        r0[0] = array[0];
        r0[1] = array[1];
        r0[2] = array[2];
        r0[3] = array[3];
        byte[] a = pz.a(time);
        r0[4] = a[0];
        r0[5] = a[1];
        a = pz.a(a.incrementAndGet());
        r0[6] = a[0];
        r0[7] = a[1];
        a = pz.a((long) Integer.valueOf(Process.myPid()).shortValue());
        r0[8] = a[0];
        r0[9] = a[1];
        String a2 = awj.a(aww.b());
        String a3 = awj.a(r0);
        b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a3.substring(0, 12), a3.substring(12, 16), a3.subSequence(16, 20), a2.substring(0, 12)}).toUpperCase(Locale.US);
    }

    private static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return b;
    }
}
