package defpackage;

final class bft implements bhy {
    static final /* synthetic */ boolean c = true;
    boolean a;
    boolean b;
    final /* synthetic */ bfs d;
    private final bhd e = new bhd();

    static {
        Class cls = bfs.class;
    }

    bft(bfs bfs) {
        this.d = bfs;
    }

    private void a(boolean z) {
        synchronized (this.d) {
            this.d.g.c();
            while (this.d.b <= 0 && !this.b && !this.a && this.d.h == null) {
                try {
                    this.d.i();
                } finally {
                    this.d.g.b();
                }
            }
            this.d.h();
            long min = Math.min(this.d.b, this.e.b());
            bfs bfs = this.d;
            bfs.b -= min;
        }
        this.d.g.c();
        try {
            bfa bfa = this.d.d;
            int i = this.d.c;
            boolean z2 = (z && min == this.e.b()) ? c : false;
            bfa.a(i, z2, this.e, min);
        } finally {
            this.d.g.b();
        }
    }

    public final bia a() {
        return this.d.g;
    }

    public final void a_(bhd bhd, long j) {
        if (!c) {
            if (Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
        }
        this.e.a_(bhd, j);
        while (this.e.b() >= 16384) {
            a(false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r8 = this;
        r0 = c;
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r0 = r8.d;
        r0 = java.lang.Thread.holdsLock(r0);
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0013;
    L_0x000d:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
    L_0x0013:
        r0 = r8.d;
        monitor-enter(r0);
        r1 = r8.a;	 Catch:{ all -> 0x0065 }
        if (r1 == 0) goto L_0x001c;
    L_0x001a:
        monitor-exit(r0);	 Catch:{ all -> 0x0065 }
        return;
    L_0x001c:
        monitor-exit(r0);	 Catch:{ all -> 0x0065 }
        r0 = r8.d;
        r0 = r0.e;
        r0 = r0.b;
        r1 = 1;
        if (r0 != 0) goto L_0x004d;
    L_0x0026:
        r0 = r8.e;
        r2 = r0.b();
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0040;
    L_0x0032:
        r0 = r8.e;
        r2 = r0.b();
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x004d;
    L_0x003c:
        r8.a(r1);
        goto L_0x0032;
    L_0x0040:
        r0 = r8.d;
        r2 = r0.d;
        r3 = r0.c;
        r4 = 1;
        r5 = 0;
        r6 = 0;
        r2.a(r3, r4, r5, r6);
    L_0x004d:
        r2 = r8.d;
        monitor-enter(r2);
        r8.a = r1;	 Catch:{ all -> 0x0062 }
        monitor-exit(r2);	 Catch:{ all -> 0x0062 }
        r0 = r8.d;
        r0 = r0.d;
        r0 = r0.o;
        r0.b();
        r0 = r8.d;
        r0.g();
        return;
    L_0x0062:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0062 }
        throw r0;
    L_0x0065:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0065 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bft.close():void");
    }

    public final void flush() {
        if (!c) {
            if (Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
        }
        synchronized (this.d) {
            this.d.h();
        }
        while (this.e.b() > 0) {
            a(false);
            this.d.d.o.b();
        }
    }
}
