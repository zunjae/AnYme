package com.zunjae.anyme.activities.browsers;

import android.os.Bundle;
import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.b;
import defpackage.alb;
import defpackage.anh;
import defpackage.ant;
import defpackage.anv;
import defpackage.aux;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class AnimeHeavenBrowser extends AbstractAnimeBrowser {
    private final String k = AnimeHeavenBrowser.class.getSimpleName();

    private static int f(java.lang.String r2) {
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
        r0 = -1;
        r1 = "&e=";	 Catch:{ Exception -> 0x0017 }
        r1 = r2.contains(r1);	 Catch:{ Exception -> 0x0017 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ Exception -> 0x0017 }
    L_0x0009:
        r1 = "&e=";	 Catch:{ Exception -> 0x0017 }
        r2 = r2.split(r1);	 Catch:{ Exception -> 0x0017 }
        r1 = 1;	 Catch:{ Exception -> 0x0017 }
        r2 = r2[r1];	 Catch:{ Exception -> 0x0017 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ Exception -> 0x0017 }
        return r2;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.AnimeHeavenBrowser.f(java.lang.String):int");
    }

    public final void a(WebView webView) {
    }

    public final void b(WebView webView) {
        webView.setWebChromeClient(new b(this));
        webView.setWebViewClient(new a());
    }

    public final ant c() {
        return new anv();
    }

    public final boolean c(String str) {
        return str.contains("i.php?a=");
    }

    protected final ArrayList<anh> d() {
        ArrayList<anh> arrayList = new ArrayList();
        arrayList.add(new anh("i.php?a=", String.format("javascript: document.querySelector('%s').scrollIntoView();", new Object[]{"div[class=\"infoepboxmain\"]"})));
        arrayList.add(new anh("i.php?a=", "javascript: window.scrollBy(0, -40);"));
        arrayList.add(new anh(BuildConfig.FLAVOR, "body > div.slider"));
        arrayList.add(new anh("i.php?a=", anh.a("div[class=\"footer\"]")));
        arrayList.add(new anh("i.php?a=", anh.a("div[class=\"similarboxmain\"]")));
        return arrayList;
    }

    public final boolean d(String str) {
        return str.contains("watch.php?a=");
    }

    public final void e(String str) {
        a(f(str));
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!aux.b("KEY_DELETE_BROWSER_DATA", true)) {
            alb.a(this.b);
            aux.a("KEY_DELETE_BROWSER_DATA", true);
        }
    }
}
