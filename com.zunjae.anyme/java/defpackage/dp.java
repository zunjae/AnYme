package defpackage;

import java.util.concurrent.Callable;

final class dp implements Callable<Void> {
    final /* synthetic */ do a;

    dp(do doVar) {
        this.a = doVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Void a() {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = r3.a;	 Catch:{ all -> 0x0027 }
        r1 = r1.j;	 Catch:{ all -> 0x0027 }
        r2 = 0;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        return r2;
    L_0x000e:
        r1 = r3.a;	 Catch:{ all -> 0x0027 }
        r1.g();	 Catch:{ all -> 0x0027 }
        r1 = r3.a;	 Catch:{ all -> 0x0027 }
        r1 = r1.e();	 Catch:{ all -> 0x0027 }
        if (r1 == 0) goto L_0x0025;
    L_0x001b:
        r1 = r3.a;	 Catch:{ all -> 0x0027 }
        r1.d();	 Catch:{ all -> 0x0027 }
        r1 = r3.a;	 Catch:{ all -> 0x0027 }
        r1.l = 0;	 Catch:{ all -> 0x0027 }
    L_0x0025:
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        return r2;
    L_0x0027:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.a():java.lang.Void");
    }

    public final /* synthetic */ Object call() {
        return a();
    }
}
