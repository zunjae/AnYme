package defpackage;

import android.database.sqlite.SQLiteException;

public abstract class q {
    public final int a;

    public q(int i) {
        this.a = i;
    }

    private static void a(java.lang.String r2) {
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
        r0 = ":memory:";
        r0 = r2.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0008:
        r0 = r2.trim();
        r0 = r0.length();
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x002a;
    L_0x0013:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x002a }
        r1 = 16;	 Catch:{ Exception -> 0x002a }
        if (r0 < r1) goto L_0x0022;	 Catch:{ Exception -> 0x002a }
    L_0x0019:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x002a }
        r0.<init>(r2);	 Catch:{ Exception -> 0x002a }
        android.database.sqlite.SQLiteDatabase.deleteDatabase(r0);	 Catch:{ Exception -> 0x002a }
        return;
    L_0x0022:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x002a }
        r0.<init>(r2);	 Catch:{ Exception -> 0x002a }
        r0.delete();	 Catch:{ Exception -> 0x002a }
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a(java.lang.String):void");
    }

    public static void c(defpackage.o r2) {
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
        r0 = new java.lang.StringBuilder;
        r1 = "Corruption reported by sqlite on database: ";
        r0.<init>(r1);
        r1 = r2.f();
        r0.append(r1);
        r0 = r2.e();
        if (r0 != 0) goto L_0x001c;
    L_0x0014:
        r2 = r2.f();
        defpackage.q.a(r2);
        return;
    L_0x001c:
        r0 = 0;
        r1 = r2.g();	 Catch:{ SQLiteException -> 0x0025, all -> 0x0023 }
        r0 = r1;
        goto L_0x0025;
    L_0x0023:
        r1 = move-exception;
        goto L_0x0029;
    L_0x0025:
        r2.close();	 Catch:{ IOException -> 0x004b, all -> 0x0023 }
        goto L_0x004b;
    L_0x0029:
        if (r0 == 0) goto L_0x0043;
    L_0x002b:
        r2 = r0.iterator();
    L_0x002f:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0035:
        r0 = r2.next();
        r0 = (android.util.Pair) r0;
        r0 = r0.second;
        r0 = (java.lang.String) r0;
        defpackage.q.a(r0);
        goto L_0x002f;
    L_0x0043:
        r2 = r2.f();
        defpackage.q.a(r2);
    L_0x004a:
        throw r1;
    L_0x004b:
        if (r0 == 0) goto L_0x0014;
    L_0x004d:
        r2 = r0.iterator();
    L_0x0051:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0065;
    L_0x0057:
        r0 = r2.next();
        r0 = (android.util.Pair) r0;
        r0 = r0.second;
        r0 = (java.lang.String) r0;
        defpackage.q.a(r0);
        goto L_0x0051;
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c(o):void");
    }

    public abstract void a(o oVar);

    public abstract void a(o oVar, int i, int i2);

    public void b(o oVar) {
    }

    public void b(o oVar, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("Can't downgrade database from version ");
        stringBuilder.append(i);
        stringBuilder.append(" to ");
        stringBuilder.append(i2);
        throw new SQLiteException(stringBuilder.toString());
    }
}
