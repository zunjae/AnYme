package com.zunjae.anyme.services;

import android.app.IntentService;

public class HHCustomJSService extends IntentService {
    private final String a = getClass().getSimpleName();

    public HHCustomJSService() {
        super("HHCustomJSService");
    }

    protected void onHandleIntent(android.content.Intent r2) {
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
        r1 = this;
        r2 = r1.getApplication();
        r0 = defpackage.ano.b(r2);	 Catch:{ Exception -> 0x0011 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ Exception -> 0x0011 }
    L_0x000a:
        r0 = defpackage.ajp.a();	 Catch:{ Exception -> 0x0011 }
        defpackage.ano.a(r2, r0);	 Catch:{ Exception -> 0x0011 }
    L_0x0011:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.services.HHCustomJSService.onHandleIntent(android.content.Intent):void");
    }
}
