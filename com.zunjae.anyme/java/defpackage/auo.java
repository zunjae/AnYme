package defpackage;

import java.util.concurrent.TimeUnit;

public final class auo {
    private final String a = "ZTimer";
    private final long b;
    private final String c;
    private long d;

    public auo(String str) {
        this.c = str;
        this.b = System.nanoTime();
    }

    public final void a() {
        this.d = System.nanoTime();
        TimeUnit.NANOSECONDS.toMillis(this.d - this.b);
    }
}
