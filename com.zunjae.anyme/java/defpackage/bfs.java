package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class bfs {
    static final /* synthetic */ boolean i = true;
    long a = 0;
    long b;
    final int c;
    final bfa d;
    final bft e;
    final bfv f = new bfv(this);
    final bfv g = new bfv(this);
    bes h = null;
    private final List<bet> j;
    private List<bet> k;
    private boolean l;
    private final bfu m;

    bfs(int i, bfa bfa, boolean z, boolean z2, List<bet> list) {
        if (bfa == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.c = i;
            this.d = bfa;
            this.b = (long) bfa.l.d();
            this.m = new bfu(this, (long) bfa.k.d());
            this.e = new bft(this);
            this.m.b = z2;
            this.e.b = z;
            this.j = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    private boolean d(bes bes) {
        if (!i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            if (this.h != null) {
                return false;
            } else if (this.m.b && this.e.b) {
                return false;
            } else {
                this.h = bes;
                notifyAll();
                this.d.b(this.c);
                return i;
            }
        }
    }

    final void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void a(bes bes) {
        if (d(bes)) {
            this.d.b(this.c, bes);
        }
    }

    final void a(bhh bhh, int i) {
        if (!i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        this.m.a(bhh, (long) i);
    }

    final void a(List<bet> list) {
        if (!i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            boolean z = i;
            this.l = i;
            if (this.k == null) {
                this.k = list;
                z = a();
                notifyAll();
            } else {
                List arrayList = new ArrayList();
                arrayList.addAll(this.k);
                arrayList.add(null);
                arrayList.addAll(list);
                this.k = arrayList;
            }
        }
        if (!z) {
            this.d.b(this.c);
        }
    }

    public final synchronized boolean a() {
        return this.h != null ? false : ((this.m.b || this.m.a) && ((this.e.b || this.e.a) && this.l)) ? false : i;
    }

    public final void b(bes bes) {
        if (d(bes)) {
            this.d.a(this.c, bes);
        }
    }

    public final boolean b() {
        return this.d.a == ((this.c & 1) == 1 ? i : false) ? i : false;
    }

    public final synchronized List<bet> c() {
        List<bet> list;
        if (b()) {
            this.f.c();
            while (this.k == null && this.h == null) {
                try {
                    i();
                } finally {
                    this.f.b();
                }
            }
            list = this.k;
            if (list != null) {
                this.k = null;
            } else {
                throw new bgc(this.h);
            }
        }
        throw new IllegalStateException("servers cannot read response headers");
        return list;
    }

    final synchronized void c(bes bes) {
        if (this.h == null) {
            this.h = bes;
            notifyAll();
        }
    }

    public final bhz d() {
        return this.m;
    }

    public final bhy e() {
        synchronized (this) {
            if (!this.l) {
                if (!b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.e;
    }

    final void f() {
        if (!i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            this.m.b = i;
            boolean a = a();
            notifyAll();
        }
        if (!a) {
            this.d.b(this.c);
        }
    }

    final void g() {
        if (!i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            Object obj = (!this.m.b && this.m.a && (this.e.b || this.e.a)) ? 1 : null;
            boolean a = a();
        }
        if (obj != null) {
            a(bes.CANCEL);
            return;
        }
        if (!a) {
            this.d.b(this.c);
        }
    }

    final void h() {
        bft bft = this.e;
        if (bft.a) {
            throw new IOException("stream closed");
        } else if (bft.b) {
            throw new IOException("stream finished");
        } else {
            bes bes = this.h;
            if (bes != null) {
                throw new bgc(bes);
            }
        }
    }

    final void i() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r1 = this;
        r1.wait();	 Catch:{ InterruptedException -> 0x0004 }
        return;
    L_0x0004:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r0 = new java.io.InterruptedIOException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfs.i():void");
    }
}
