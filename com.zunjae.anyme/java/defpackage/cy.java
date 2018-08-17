package defpackage;

import android.graphics.Typeface;
import android.support.v4.util.SimpleArrayMap;

public final class cy {
    private static final SimpleArrayMap<String, Typeface> a = new SimpleArrayMap();

    public static android.graphics.Typeface a(android.content.Context r4, java.lang.String r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = a;
        monitor-enter(r0);
        r1 = a;	 Catch:{ all -> 0x0033 }
        r1 = r1.containsKey(r5);	 Catch:{ all -> 0x0033 }
        if (r1 != 0) goto L_0x0029;
    L_0x000b:
        r4 = r4.getAssets();	 Catch:{ RuntimeException -> 0x0026 }
        r1 = "fonts/%s";	 Catch:{ RuntimeException -> 0x0026 }
        r2 = 1;	 Catch:{ RuntimeException -> 0x0026 }
        r2 = new java.lang.Object[r2];	 Catch:{ RuntimeException -> 0x0026 }
        r3 = 0;	 Catch:{ RuntimeException -> 0x0026 }
        r2[r3] = r5;	 Catch:{ RuntimeException -> 0x0026 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ RuntimeException -> 0x0026 }
        r4 = android.graphics.Typeface.createFromAsset(r4, r1);	 Catch:{ RuntimeException -> 0x0026 }
        r1 = a;	 Catch:{ RuntimeException -> 0x0026 }
        r1.put(r5, r4);	 Catch:{ RuntimeException -> 0x0026 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        return r4;	 Catch:{ all -> 0x0033 }
    L_0x0026:
        r4 = 0;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        return r4;	 Catch:{ all -> 0x0033 }
    L_0x0029:
        r4 = a;	 Catch:{ all -> 0x0033 }
        r4 = r4.get(r5);	 Catch:{ all -> 0x0033 }
        r4 = (android.graphics.Typeface) r4;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        return r4;	 Catch:{ all -> 0x0033 }
    L_0x0033:
        r4 = move-exception;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.a(android.content.Context, java.lang.String):android.graphics.Typeface");
    }
}
