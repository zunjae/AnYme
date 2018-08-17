package com.zunjae.anyme.activities.browsers;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import defpackage.ant;
import defpackage.aoc;
import java.util.HashMap;

public final class RyuAnimeBrowser extends AbstractAnimeBrowser {
    private aoc k = new aoc();

    private static int f(java.lang.String r1) {
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
        r0 = "episode-";	 Catch:{ Exception -> 0x0017 }
        r1 = r1.split(r0);	 Catch:{ Exception -> 0x0017 }
        r0 = 1;	 Catch:{ Exception -> 0x0017 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x0017 }
        r0 = "-";	 Catch:{ Exception -> 0x0017 }
        r1 = r1.split(r0);	 Catch:{ Exception -> 0x0017 }
        r0 = 0;	 Catch:{ Exception -> 0x0017 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x0017 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x0017 }
        return r1;
    L_0x0017:
        r1 = -1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.RyuAnimeBrowser.f(java.lang.String):int");
    }

    public final void a(WebView webView) {
    }

    public final void b(WebView webView) {
        g();
    }

    public final ant c() {
        return new aoc();
    }

    public final boolean c(String str) {
        return str.contains("ryuanime.com/anime/") && !str.contains("/watch/");
    }

    public final boolean d(String str) {
        return str.contains("ryuanime.com/anime/watch/");
    }

    public final void e(String str) {
        a(f(str));
    }

    protected final HashMap<String, String> f() {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("https://www1.ryuanime.com/", this.k.a(this.d.d(), this.d.g()));
        return hashMap;
    }
}
