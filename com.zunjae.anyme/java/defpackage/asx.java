package defpackage;

import android.os.AsyncTask;

final class asx extends AsyncTask<Void, Void, Void> {
    private final int a = 15000;
    private final String b = "https://gist.githubusercontent.com/zunjae/3f058f1b2f7690ef0f7a38b49d1083cd/raw";
    private final aoh c;

    asx(aoh aoh) {
        this.c = aoh;
    }

    private java.lang.Void a() {
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
        r8 = this;
        r0 = 0;
        r1 = new bco;	 Catch:{ Exception -> 0x0089 }
        r1.<init>();	 Catch:{ Exception -> 0x0089 }
        r2 = "https://gist.githubusercontent.com/zunjae/3f058f1b2f7690ef0f7a38b49d1083cd/raw";	 Catch:{ Exception -> 0x0089 }
        r1 = r1.a(r2);	 Catch:{ Exception -> 0x0089 }
        r2 = "User-Agent";	 Catch:{ Exception -> 0x0089 }
        r3 = "Mozilla/5.0";	 Catch:{ Exception -> 0x0089 }
        r1 = r1.a(r2, r3);	 Catch:{ Exception -> 0x0089 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0089 }
        r2 = defpackage.atp.a();	 Catch:{ Exception -> 0x0089 }
        r1 = r2.a(r1);	 Catch:{ Exception -> 0x0089 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0089 }
        r2 = r1.c();	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        if (r2 != 0) goto L_0x0030;
    L_0x002a:
        if (r1 == 0) goto L_0x002f;
    L_0x002c:
        r1.close();	 Catch:{ Exception -> 0x0089 }
    L_0x002f:
        return r0;
    L_0x0030:
        r2 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r2.<init>();	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r4 = r1.g();	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r4 = r4.e();	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r3.<init>(r4);	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r4 = "ids";	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r3 = r3.getJSONArray(r4);	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r4 = 0;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
    L_0x0049:
        r5 = r3.length();	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        if (r4 >= r5) goto L_0x0064;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
    L_0x004f:
        r5 = new arr;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r6 = r3.get(r4);	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r6 = (java.lang.Integer) r6;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r6 = r6.intValue();	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r5.<init>(r6);	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r2.add(r5);	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r4 = r4 + 1;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        goto L_0x0049;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
    L_0x0064:
        r3 = r8.c;	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        r3.d(r2);	 Catch:{ Throwable -> 0x0072, all -> 0x006f }
        if (r1 == 0) goto L_0x006e;
    L_0x006b:
        r1.close();	 Catch:{ Exception -> 0x0089 }
    L_0x006e:
        return r0;
    L_0x006f:
        r2 = move-exception;
        r3 = r0;
        goto L_0x0078;
    L_0x0072:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0074 }
    L_0x0074:
        r3 = move-exception;
        r7 = r3;
        r3 = r2;
        r2 = r7;
    L_0x0078:
        if (r1 == 0) goto L_0x0088;
    L_0x007a:
        if (r3 == 0) goto L_0x0085;
    L_0x007c:
        r1.close();	 Catch:{ Throwable -> 0x0080 }
        goto L_0x0088;
    L_0x0080:
        r1 = move-exception;
        r3.addSuppressed(r1);	 Catch:{ Exception -> 0x0089 }
        goto L_0x0088;	 Catch:{ Exception -> 0x0089 }
    L_0x0085:
        r1.close();	 Catch:{ Exception -> 0x0089 }
    L_0x0088:
        throw r2;	 Catch:{ Exception -> 0x0089 }
    L_0x0089:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: asx.a():java.lang.Void");
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
