package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class tx {
    static final Map<String, String> a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final short[] b = new short[]{(short) 10, (short) 20, (short) 30, (short) 60, (short) 120, (short) 300};
    private final Object c = new Object();
    private final st d;
    private final String e;
    private final ua f;
    private final tz g;
    private Thread h;

    public tx(String str, st stVar, ua uaVar, tz tzVar) {
        if (stVar != null) {
            this.d = stVar;
            this.e = str;
            this.f = uaVar;
            this.g = tzVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    final List<tv> a() {
        avf.c();
        synchronized (this.c) {
            File[] a = this.f.a();
            File[] b = this.f.b();
            File[] c = this.f.c();
        }
        List<tv> linkedList = new LinkedList();
        if (a != null) {
            for (File file : a) {
                avf.c();
                new StringBuilder("Found crash report ").append(file.getPath());
                linkedList.add(new ue(file));
            }
        }
        Map hashMap = new HashMap();
        if (b != null) {
            for (File file2 : b) {
                String a2 = qp.a(file2);
                if (!hashMap.containsKey(a2)) {
                    hashMap.put(a2, new LinkedList());
                }
                ((List) hashMap.get(a2)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            avf.c();
            List list = (List) hashMap.get(str);
            linkedList.add(new tc(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (c != null) {
            for (File tmVar : c) {
                linkedList.add(new tm(tmVar));
            }
        }
        if (linkedList.isEmpty()) {
            avf.c();
        }
        return linkedList;
    }

    public final synchronized void a(float f, ub ubVar) {
        if (this.h != null) {
            avf.c();
            return;
        }
        this.h = new Thread(new uc(this, f, ubVar), "Crashlytics Report Uploader");
        this.h.start();
    }

    final boolean a(defpackage.tv r6) {
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
        r5 = this;
        r0 = r5.c;
        monitor-enter(r0);
        r1 = 0;
        r2 = new ss;	 Catch:{ Exception -> 0x0036 }
        r3 = r5.e;	 Catch:{ Exception -> 0x0036 }
        r2.<init>(r3, r6);	 Catch:{ Exception -> 0x0036 }
        r3 = r5.d;	 Catch:{ Exception -> 0x0036 }
        r2 = r3.a(r2);	 Catch:{ Exception -> 0x0036 }
        defpackage.avf.c();	 Catch:{ Exception -> 0x0036 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0036 }
        r4 = "Crashlytics report upload ";	 Catch:{ Exception -> 0x0036 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x0036 }
        if (r2 == 0) goto L_0x0020;	 Catch:{ Exception -> 0x0036 }
    L_0x001d:
        r4 = "complete: ";	 Catch:{ Exception -> 0x0036 }
        goto L_0x0022;	 Catch:{ Exception -> 0x0036 }
    L_0x0020:
        r4 = "FAILED: ";	 Catch:{ Exception -> 0x0036 }
    L_0x0022:
        r3.append(r4);	 Catch:{ Exception -> 0x0036 }
        r4 = r6.b();	 Catch:{ Exception -> 0x0036 }
        r3.append(r4);	 Catch:{ Exception -> 0x0036 }
        if (r2 == 0) goto L_0x0043;	 Catch:{ Exception -> 0x0036 }
    L_0x002e:
        r6.f();	 Catch:{ Exception -> 0x0036 }
        r6 = 1;
        r1 = 1;
        goto L_0x0043;
    L_0x0034:
        r6 = move-exception;
        goto L_0x0045;
    L_0x0036:
        defpackage.avf.c();	 Catch:{ all -> 0x0034 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r3 = "Error occurred sending report ";	 Catch:{ all -> 0x0034 }
        r2.<init>(r3);	 Catch:{ all -> 0x0034 }
        r2.append(r6);	 Catch:{ all -> 0x0034 }
    L_0x0043:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return r1;	 Catch:{ all -> 0x0034 }
    L_0x0045:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.a(tv):boolean");
    }
}
