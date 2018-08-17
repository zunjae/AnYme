package com.zunjae.anyme.activities;

import android.content.Context;
import android.os.Bundle;
import com.zunjae.anyme.activities.browsers.BasicWebViewBrowser;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import defpackage.arn;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class MalActivity extends AbstractActivity {
    private void c(String str) {
        startActivity(BasicWebViewBrowser.a(this.b, str));
    }

    private static int d(java.lang.String r1) {
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
        r0 = "/";	 Catch:{ Exception -> 0x000e }
        r1 = r1.split(r0);	 Catch:{ Exception -> 0x000e }
        r0 = 4;	 Catch:{ Exception -> 0x000e }
        r1 = r1[r0];	 Catch:{ Exception -> 0x000e }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x000e }
        return r1;
    L_0x000e:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.MalActivity.d(java.lang.String):int");
    }

    private static java.lang.String e(java.lang.String r2) {
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
        r0 = "/";	 Catch:{ Exception -> 0x001e }
        r2 = r2.split(r0);	 Catch:{ Exception -> 0x001e }
        r0 = 5;	 Catch:{ Exception -> 0x001e }
        r2 = r2[r0];	 Catch:{ Exception -> 0x001e }
        r0 = "_";	 Catch:{ Exception -> 0x001e }
        r1 = " ";	 Catch:{ Exception -> 0x001e }
        r2 = r2.replace(r0, r1);	 Catch:{ Exception -> 0x001e }
        r0 = "  ";	 Catch:{ Exception -> 0x001e }
        r1 = " ";	 Catch:{ Exception -> 0x001e }
        r2 = r2.replace(r0, r1);	 Catch:{ Exception -> 0x001e }
        r2 = r2.trim();	 Catch:{ Exception -> 0x001e }
        return r2;
    L_0x001e:
        r2 = "";
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.MalActivity.e(java.lang.String):java.lang.String");
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String dataString = getIntent().getDataString();
        if (dataString.toLowerCase().matches("^.*myanimelist\\.net/anime/[0-9]{1,8}.*$")) {
            int d = d(dataString);
            String e = e(dataString);
            if (d > 0) {
                arn arn = new arn((long) d, e, BuildConfig.FLAVOR);
                Context context = this.b;
                context.startActivity(AnimeInfoActivityR2.a(context, arn));
                finish();
            }
        }
        c(dataString);
        finish();
    }
}
