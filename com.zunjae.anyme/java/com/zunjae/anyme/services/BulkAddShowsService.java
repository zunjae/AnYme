package com.zunjae.anyme.services;

import android.app.IntentService;

public class BulkAddShowsService extends IntentService {
    public static boolean a;
    private final String b = getClass().getSimpleName();

    public BulkAddShowsService() {
        super("BulkDeleteAnimeService");
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    protected void onHandleIntent(android.content.Intent r12) {
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
        r11 = this;
        r0 = "relatedAnimeV2s";
        r12 = r12.getParcelableArrayListExtra(r0);
        if (r12 == 0) goto L_0x009d;
    L_0x0008:
        r0 = new ast;
        r1 = r11.getApplication();
        r0.<init>(r1);
        r1 = r12.iterator();
        r2 = 0;
        r3 = 0;
    L_0x0017:
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x0090;
    L_0x001d:
        r4 = r1.next();
        r4 = (defpackage.amg) r4;
        r5 = r12.size();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = r5 - r3;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = r5 * 2500;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = r5 / 1000;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r6 = defpackage.aui.a();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r7 = new amq;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r8 = "Adding %s to your Plan To Watch...\n\nETA: %d seconds";	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r9 = 2;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r10 = r4.b();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r9[r2] = r10;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r10 = 1;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r9[r10] = r5;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = java.lang.String.format(r8, r9);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r7.<init>(r5);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r6.d(r7);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = r4.d();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = r5.intValue();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = defpackage.atj.a(r5);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        if (r5 < r6) goto L_0x007d;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
    L_0x005e:
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        if (r5 >= r6) goto L_0x007d;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
    L_0x0062:
        r5 = r4.d();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = r5.intValue();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r5 = (long) r5;	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r7 = r4.b();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r4 = r4.h();	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r4 = defpackage.are.a(r5, r7, r4);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        r0.b(r4);	 Catch:{ Exception -> 0x007d, all -> 0x007b }
        goto L_0x007d;
    L_0x007b:
        r12 = move-exception;
        throw r12;
    L_0x007d:
        r3 = r3 + 1;
        r4 = r12.size();
        if (r3 == r4) goto L_0x0017;
    L_0x0085:
        r4 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        java.lang.Thread.sleep(r4);	 Catch:{ InterruptedException -> 0x008b }
        goto L_0x0017;
    L_0x008b:
        r4 = move-exception;
        r4.printStackTrace();
        goto L_0x0017;
    L_0x0090:
        r12 = defpackage.aui.a();
        r0 = new amr;
        r0.<init>();
        r12.d(r0);
        return;
    L_0x009d:
        r12 = new java.lang.NullPointerException;
        r0 = "Incorrectly set the arguments";
        r12.<init>(r0);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.services.BulkAddShowsService.onHandleIntent(android.content.Intent):void");
    }
}
