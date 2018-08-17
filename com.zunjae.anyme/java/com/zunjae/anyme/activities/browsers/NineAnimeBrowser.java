package com.zunjae.anyme.activities.browsers;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import defpackage.anh;
import defpackage.ant;
import defpackage.aob;
import java.util.ArrayList;

public final class NineAnimeBrowser extends AbstractAnimeBrowser {
    private static final String k = "NineAnimeBrowser";

    private static /* synthetic */ void a(android.webkit.WebView r2, java.lang.String r3) {
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
        r0 = "\"";	 Catch:{ Exception -> 0x001a }
        r1 = "";	 Catch:{ Exception -> 0x001a }
        r3 = r3.replace(r0, r1);	 Catch:{ Exception -> 0x001a }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x001a }
        r0 = 28;	 Catch:{ Exception -> 0x001a }
        if (r3 != r0) goto L_0x001a;	 Catch:{ Exception -> 0x001a }
    L_0x0010:
        r3 = "span[data-name=\"33\"]";	 Catch:{ Exception -> 0x001a }
        r3 = defpackage.anh.b(r3);	 Catch:{ Exception -> 0x001a }
        r0 = 0;	 Catch:{ Exception -> 0x001a }
        r2.evaluateJavascript(r3, r0);	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.NineAnimeBrowser.a(android.webkit.WebView, java.lang.String):void");
    }

    private /* synthetic */ void f(java.lang.String r3) {
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
        r2 = this;
        r0 = defpackage.bit.c(r3);
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r0 = "null";
        r0 = r3.equals(r0);
        if (r0 != 0) goto L_0x001d;
    L_0x000e:
        r0 = "\\D+";	 Catch:{ Exception -> 0x001d }
        r1 = "";	 Catch:{ Exception -> 0x001d }
        r3 = r3.replaceAll(r0, r1);	 Catch:{ Exception -> 0x001d }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x001d }
        r2.a(r3);	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.NineAnimeBrowser.f(java.lang.String):void");
    }

    public final void a(WebView webView) {
        webView.evaluateJavascript("javascript: document.querySelector('a[class=\"active\"]').getAttribute(\"data-base\")", new -$$Lambda$NineAnimeBrowser$opCGGRIyn8S46RUVjLINMSXsA4U(this));
    }

    public final void b(WebView webView) {
        g();
    }

    public final ant c() {
        return new aob();
    }

    @SuppressLint({"DefaultLocale"})
    protected final void c(WebView webView) {
        webView.evaluateJavascript(anh.b(String.format("a[data-base=\"%d\"]", new Object[]{Integer.valueOf(this.d.y() + 1)})), null);
    }

    public final boolean c(String str) {
        return str.matches("^.*9anime\\.[a-zA-Z]{1,4}/watch.*$") && !str.contains("adexchange");
    }

    protected final ArrayList<anh> d() {
        ArrayList<anh> arrayList = new ArrayList();
        arrayList.add(new anh(anh.a("span[data-name=\"28\"]")));
        arrayList.add(new anh(anh.a("div[class=\"widget info\"]")));
        arrayList.add(new anh(anh.a("div[class=\"widget comment\"]")));
        arrayList.add(new anh(anh.a("div[class=\"list-film\"]")));
        arrayList.add(new anh(anh.a("div[id=\"sidebar\"]")));
        arrayList.add(new anh(anh.a("div[id=\"footer\"]")));
        arrayList.add(new anh(anh.a("#controls")));
        return arrayList;
    }

    protected final void d(WebView webView) {
        super.d(webView);
        webView.evaluateJavascript("javascript: document.querySelector('span[class=\"tab active\"]').getAttribute(\"data-name\")", new -$$Lambda$NineAnimeBrowser$4ZQPCWhmybSZrV4RVdzuzvoGVKM(webView));
    }

    public final boolean d(String str) {
        return c(str);
    }

    public final void e(String str) {
    }
}
