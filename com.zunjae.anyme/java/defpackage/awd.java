package defpackage;

import android.content.Context;

final class awd implements awg {
    private final Context a;

    public awd(Context context) {
        this.a = context.getApplicationContext();
    }

    public final defpackage.avz a() {
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
        r5 = this;
        r0 = android.os.Looper.myLooper();
        r1 = android.os.Looper.getMainLooper();
        r2 = 0;
        if (r0 != r1) goto L_0x000f;
    L_0x000b:
        defpackage.avf.c();
        return r2;
    L_0x000f:
        r0 = r5.a;	 Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
        r1 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
        r3 = 0;	 Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
        r0.getPackageInfo(r1, r3);	 Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
        r0 = new awe;
        r0.<init>(r3);
        r1 = new android.content.Intent;
        r3 = "com.google.android.gms.ads.identifier.service.START";
        r1.<init>(r3);
        r3 = "com.google.android.gms";
        r1.setPackage(r3);
        r3 = r5.a;	 Catch:{ Throwable -> 0x0066 }
        r4 = 1;	 Catch:{ Throwable -> 0x0066 }
        r1 = r3.bindService(r1, r0, r4);	 Catch:{ Throwable -> 0x0066 }
        if (r1 == 0) goto L_0x0062;
    L_0x0035:
        r1 = new awf;	 Catch:{ Exception -> 0x0053 }
        r3 = r0.a();	 Catch:{ Exception -> 0x0053 }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0053 }
        r3 = new avz;	 Catch:{ Exception -> 0x0053 }
        r4 = r1.a();	 Catch:{ Exception -> 0x0053 }
        r1 = r1.b();	 Catch:{ Exception -> 0x0053 }
        r3.<init>(r4, r1);	 Catch:{ Exception -> 0x0053 }
        r1 = r5.a;	 Catch:{ Throwable -> 0x0066 }
        r1.unbindService(r0);	 Catch:{ Throwable -> 0x0066 }
        return r3;
    L_0x0051:
        r1 = move-exception;
        goto L_0x005c;
    L_0x0053:
        defpackage.avf.c();	 Catch:{ all -> 0x0051 }
        r1 = r5.a;	 Catch:{ Throwable -> 0x0066 }
        r1.unbindService(r0);	 Catch:{ Throwable -> 0x0066 }
        goto L_0x0069;	 Catch:{ Throwable -> 0x0066 }
    L_0x005c:
        r3 = r5.a;	 Catch:{ Throwable -> 0x0066 }
        r3.unbindService(r0);	 Catch:{ Throwable -> 0x0066 }
        throw r1;	 Catch:{ Throwable -> 0x0066 }
    L_0x0062:
        defpackage.avf.c();	 Catch:{ Throwable -> 0x0066 }
        goto L_0x0069;
    L_0x0066:
        defpackage.avf.c();
    L_0x0069:
        return r2;
    L_0x006a:
        defpackage.avf.c();
        return r2;
    L_0x006e:
        defpackage.avf.c();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: awd.a():avz");
    }
}
