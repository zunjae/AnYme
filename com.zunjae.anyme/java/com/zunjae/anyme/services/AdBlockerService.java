package com.zunjae.anyme.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

public class AdBlockerService extends IntentService {
    private final String a = "https://gist.githubusercontent.com/zunjae/300e80a3fd538f84876d693fa063484e/raw/";
    private String b;
    private int c;

    public AdBlockerService() {
        super("AdBlockerService");
    }

    public static Intent a(Context context, int i) {
        Intent intent = new Intent(context, AdBlockerService.class);
        intent.putExtra("newVersion", i);
        return intent;
    }

    protected void onHandleIntent(android.content.Intent r3) {
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
        r2 = this;
        r0 = r2.getApplication();
        r0 = r0.getResources();
        r1 = 2131689529; // 0x7f0f0039 float:1.9008076E38 double:1.053194564E-314;
        r0 = r0.getString(r1);
        r2.b = r0;
        r0 = "newVersion";
        r1 = 0;
        r3 = r3.getIntExtra(r0, r1);
        r2.c = r3;
        r3 = "https://gist.githubusercontent.com/zunjae/300e80a3fd538f84876d693fa063484e/raw/";	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = org.jsoup.Jsoup.connect(r3);	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r0 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r3.timeout(r0);	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r0 = r2.b;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r3.userAgent(r0);	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r3.get();	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r0 = defpackage.ato.a();	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r3.body();	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r3.text();	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r1 = defpackage.ald.class;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r0.a(r3, r1);	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = (defpackage.ald) r3;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = r3.a();	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        if (r3 == 0) goto L_0x005c;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
    L_0x004a:
        r0 = r3.size();	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        if (r0 <= 0) goto L_0x005c;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
    L_0x0050:
        r0 = r2.c;	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r1 = "@@AdBlocker_DAO";	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        defpackage.aux.a(r1, r3);	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        r3 = "@@AdBlocker_DAO_list_version";	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
        defpackage.aux.a(r3, r0);	 Catch:{ Exception -> 0x005c, all -> 0x0064 }
    L_0x005c:
        r3 = r2.getApplicationContext();
        defpackage.ajd.b(r3);
        return;
    L_0x0064:
        r3 = move-exception;
        r0 = r2.getApplicationContext();
        defpackage.ajd.b(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.services.AdBlockerService.onHandleIntent(android.content.Intent):void");
    }
}
