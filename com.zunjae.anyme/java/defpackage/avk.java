package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

final class avk implements Callable<Map<String, avr>> {
    final String a;

    avk(String str) {
        this.a = str;
    }

    private static defpackage.avr a(java.util.zip.ZipEntry r5, java.util.zip.ZipFile r6) {
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
        r0 = 0;
        r6 = r6.getInputStream(r5);	 Catch:{ IOException -> 0x0051, all -> 0x004e }
        r1 = new java.util.Properties;	 Catch:{ IOException -> 0x0052 }
        r1.<init>();	 Catch:{ IOException -> 0x0052 }
        r1.load(r6);	 Catch:{ IOException -> 0x0052 }
        r2 = "fabric-identifier";	 Catch:{ IOException -> 0x0052 }
        r2 = r1.getProperty(r2);	 Catch:{ IOException -> 0x0052 }
        r3 = "fabric-version";	 Catch:{ IOException -> 0x0052 }
        r3 = r1.getProperty(r3);	 Catch:{ IOException -> 0x0052 }
        r4 = "fabric-build-type";	 Catch:{ IOException -> 0x0052 }
        r1 = r1.getProperty(r4);	 Catch:{ IOException -> 0x0052 }
        r4 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IOException -> 0x0052 }
        if (r4 != 0) goto L_0x0034;	 Catch:{ IOException -> 0x0052 }
    L_0x0025:
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ IOException -> 0x0052 }
        if (r4 != 0) goto L_0x0034;	 Catch:{ IOException -> 0x0052 }
    L_0x002b:
        r4 = new avr;	 Catch:{ IOException -> 0x0052 }
        r4.<init>(r2, r3, r1);	 Catch:{ IOException -> 0x0052 }
        defpackage.awj.b(r6);
        return r4;
    L_0x0034:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x0052 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0052 }
        r3 = "Invalid format of fabric file,";	 Catch:{ IOException -> 0x0052 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0052 }
        r3 = r5.getName();	 Catch:{ IOException -> 0x0052 }
        r2.append(r3);	 Catch:{ IOException -> 0x0052 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0052 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0052 }
        throw r1;	 Catch:{ IOException -> 0x0052 }
    L_0x004c:
        r5 = move-exception;
        goto L_0x0067;
    L_0x004e:
        r5 = move-exception;
        r6 = r0;
        goto L_0x0067;
    L_0x0051:
        r6 = r0;
    L_0x0052:
        defpackage.avf.c();	 Catch:{ all -> 0x004c }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r2 = "Error when parsing fabric properties ";	 Catch:{ all -> 0x004c }
        r1.<init>(r2);	 Catch:{ all -> 0x004c }
        r5 = r5.getName();	 Catch:{ all -> 0x004c }
        r1.append(r5);	 Catch:{ all -> 0x004c }
        defpackage.awj.b(r6);
        return r0;
    L_0x0067:
        defpackage.awj.b(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: avk.a(java.util.zip.ZipEntry, java.util.zip.ZipFile):avr");
    }

    private static java.util.Map<java.lang.String, defpackage.avr> a() {
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
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "com.google.android.gms.ads.AdView";	 Catch:{ Exception -> 0x001f }
        java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x001f }
        r1 = new avr;	 Catch:{ Exception -> 0x001f }
        r2 = "com.google.firebase.firebase-ads";	 Catch:{ Exception -> 0x001f }
        r3 = "0.0.0";	 Catch:{ Exception -> 0x001f }
        r4 = "binary";	 Catch:{ Exception -> 0x001f }
        r1.<init>(r2, r3, r4);	 Catch:{ Exception -> 0x001f }
        r2 = r1.a();	 Catch:{ Exception -> 0x001f }
        r0.put(r2, r1);	 Catch:{ Exception -> 0x001f }
        defpackage.avf.c();	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avk.a():java.util.Map<java.lang.String, avr>");
    }

    private java.util.Map<java.lang.String, defpackage.avr> b() {
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
        r8 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = new java.util.zip.ZipFile;
        r2 = r8.a;
        r1.<init>(r2);
        r2 = r1.entries();
    L_0x0010:
        r3 = r2.hasMoreElements();
        if (r3 == 0) goto L_0x005a;
    L_0x0016:
        r3 = r2.nextElement();
        r3 = (java.util.zip.ZipEntry) r3;
        r4 = r3.getName();
        r5 = "fabric/";
        r4 = r4.startsWith(r5);
        if (r4 == 0) goto L_0x0010;
    L_0x0028:
        r4 = r3.getName();
        r4 = r4.length();
        r5 = 7;
        if (r4 <= r5) goto L_0x0010;
    L_0x0033:
        r3 = defpackage.avk.a(r3, r1);
        if (r3 == 0) goto L_0x0010;
    L_0x0039:
        r4 = r3.a();
        r0.put(r4, r3);
        defpackage.avf.c();
        r4 = "Found kit:[%s] version:[%s]";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.a();
        r5[r6] = r7;
        r6 = 1;
        r3 = r3.b();
        r5[r6] = r3;
        java.lang.String.format(r4, r5);
        goto L_0x0010;
    L_0x005a:
        r1.close();	 Catch:{ IOException -> 0x005d }
    L_0x005d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avk.b():java.util.Map<java.lang.String, avr>");
    }

    public final /* synthetic */ Object call() {
        Map hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(avk.a());
        hashMap.putAll(b());
        avf.c();
        new StringBuilder("finish scanning in ").append(SystemClock.elapsedRealtime() - elapsedRealtime);
        return hashMap;
    }
}
