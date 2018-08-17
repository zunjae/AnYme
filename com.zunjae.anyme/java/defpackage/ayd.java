package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class ayd implements axt<ayg>, ayc, ayg {
    private final List<ayg> a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference<Throwable> c = new AtomicReference(null);

    public static boolean b(java.lang.Object r3) {
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
        r0 = 0;
        r1 = r3;	 Catch:{ ClassCastException -> 0x0011 }
        r1 = (defpackage.axt) r1;	 Catch:{ ClassCastException -> 0x0011 }
        r2 = r3;	 Catch:{ ClassCastException -> 0x0011 }
        r2 = (defpackage.ayg) r2;	 Catch:{ ClassCastException -> 0x0011 }
        r3 = (defpackage.ayc) r3;	 Catch:{ ClassCastException -> 0x0011 }
        if (r1 == 0) goto L_0x0011;
    L_0x000b:
        if (r2 == 0) goto L_0x0011;
    L_0x000d:
        if (r3 == 0) goto L_0x0011;
    L_0x000f:
        r3 = 1;
        return r3;
    L_0x0011:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayd.b(java.lang.Object):boolean");
    }

    public int a() {
        return axw.b;
    }

    public final synchronized void a(ayg ayg) {
        this.a.add(ayg);
    }

    public final void a(Throwable th) {
        this.c.set(th);
    }

    public final synchronized void a(boolean z) {
        this.b.set(z);
    }

    public int compareTo(Object obj) {
        return axw.a(this, obj);
    }

    public final synchronized Collection<ayg> f() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final boolean g() {
        for (ayg i : f()) {
            if (!i.i()) {
                return false;
            }
        }
        return true;
    }

    public final boolean i() {
        return this.b.get();
    }
}
