package defpackage;

public final class atk {
    private static final String a = "atk";

    public static defpackage.arm a(java.lang.String r8) {
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
        r0 = "https://myanimelist.net/profile/%s";	 Catch:{ Exception -> 0x006d }
        r1 = 1;	 Catch:{ Exception -> 0x006d }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x006d }
        r2 = 0;	 Catch:{ Exception -> 0x006d }
        r1[r2] = r8;	 Catch:{ Exception -> 0x006d }
        r8 = java.lang.String.format(r0, r1);	 Catch:{ Exception -> 0x006d }
        r8 = org.jsoup.Jsoup.connect(r8);	 Catch:{ Exception -> 0x006d }
        r0 = "Mozilla/5.0";	 Catch:{ Exception -> 0x006d }
        r8 = r8.userAgent(r0);	 Catch:{ Exception -> 0x006d }
        r0 = "cookie";	 Catch:{ Exception -> 0x006d }
        r1 = defpackage.anp.d();	 Catch:{ Exception -> 0x006d }
        r8 = r8.header(r0, r1);	 Catch:{ Exception -> 0x006d }
        r0 = "Content-Type";	 Catch:{ Exception -> 0x006d }
        r1 = "application/x-www-form-urlencoded; charset=UTF-8";	 Catch:{ Exception -> 0x006d }
        r8 = r8.header(r0, r1);	 Catch:{ Exception -> 0x006d }
        r0 = "accept-encoding";	 Catch:{ Exception -> 0x006d }
        r1 = "gzip, deflate";	 Catch:{ Exception -> 0x006d }
        r8 = r8.header(r0, r1);	 Catch:{ Exception -> 0x006d }
        r0 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x006d }
        r8 = r8.timeout(r0);	 Catch:{ Exception -> 0x006d }
        r8 = r8.get();	 Catch:{ Exception -> 0x006d }
        r0 = "div[class=\"stat-score di-t w100 pt8\"]";	 Catch:{ Exception -> 0x006d }
        r0 = r8.select(r0);	 Catch:{ Exception -> 0x006d }
        r1 = "div[class=\"di-tc al pl8 fs12 fw-b\"]";	 Catch:{ Exception -> 0x006d }
        r1 = r0.select(r1);	 Catch:{ Exception -> 0x006d }
        r5 = r1.text();	 Catch:{ Exception -> 0x006d }
        r1 = "div[class=\"di-tc ar pr8 fs12 fw-b\"]";	 Catch:{ Exception -> 0x006d }
        r0 = r0.select(r1);	 Catch:{ Exception -> 0x006d }
        r4 = r0.text();	 Catch:{ Exception -> 0x006d }
        r0 = "input[type=\"hidden\"]";	 Catch:{ Exception -> 0x006d }
        r8 = r8.select(r0);	 Catch:{ Exception -> 0x006d }
        r0 = "value";	 Catch:{ Exception -> 0x006d }
        r3 = r8.attr(r0);	 Catch:{ Exception -> 0x006d }
        r8 = new arm;	 Catch:{ Exception -> 0x006d }
        r0 = 2;	 Catch:{ Exception -> 0x006d }
        r6 = com.zunjae.zasync.a.a(r0);	 Catch:{ Exception -> 0x006d }
        r2 = r8;	 Catch:{ Exception -> 0x006d }
        r2.<init>(r3, r4, r5, r6);	 Catch:{ Exception -> 0x006d }
        return r8;
    L_0x006d:
        r8 = 0;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: atk.a(java.lang.String):arm");
    }

    public static java.util.ArrayList<defpackage.arl> a() {
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
        r0 = 0;
        r1 = new bco;	 Catch:{ Exception -> 0x0097 }
        r1.<init>();	 Catch:{ Exception -> 0x0097 }
        r2 = "https://gist.githubusercontent.com/zunjae/1c00650560886339305d6dcc18a2bb73/raw/";	 Catch:{ Exception -> 0x0097 }
        r1 = r1.a(r2);	 Catch:{ Exception -> 0x0097 }
        r2 = "User-Agent";	 Catch:{ Exception -> 0x0097 }
        r3 = "Mozilla/5.0";	 Catch:{ Exception -> 0x0097 }
        r1 = r1.a(r2, r3);	 Catch:{ Exception -> 0x0097 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0097 }
        r2 = defpackage.atp.a();	 Catch:{ Exception -> 0x0097 }
        r1 = r2.a(r1);	 Catch:{ Exception -> 0x0097 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0097 }
        r2 = r1.c();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        if (r2 != 0) goto L_0x0030;
    L_0x002a:
        if (r1 == 0) goto L_0x002f;
    L_0x002c:
        r1.close();	 Catch:{ Exception -> 0x0097 }
    L_0x002f:
        return r0;
    L_0x0030:
        r2 = new atl;	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r2.<init>();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r2 = r2.b();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r3 = defpackage.ato.a();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r4 = r1.g();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r4 = r4.e();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r2 = r3.a(r4, r2);	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r2 = (java.util.ArrayList) r2;	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        if (r2 == 0) goto L_0x0077;	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
    L_0x004d:
        r3 = r2.iterator();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
    L_0x0051:
        r4 = r3.hasNext();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        if (r4 == 0) goto L_0x0077;	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
    L_0x0057:
        r4 = r3.next();	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r4 = (defpackage.arl) r4;	 Catch:{ Throwable -> 0x0080, all -> 0x007d }
        r5 = java.util.Calendar.getInstance();	 Catch:{ Exception -> 0x0051 }
        r6 = new java.util.Date;	 Catch:{ Exception -> 0x0051 }
        r7 = r4.b;	 Catch:{ Exception -> 0x0051 }
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0051 }
        r7 = r7 * r9;	 Catch:{ Exception -> 0x0051 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x0051 }
        r5.setTime(r6);	 Catch:{ Exception -> 0x0051 }
        r6 = 7;	 Catch:{ Exception -> 0x0051 }
        r5 = r5.get(r6);	 Catch:{ Exception -> 0x0051 }
        r4.g = r5;	 Catch:{ Exception -> 0x0051 }
        goto L_0x0051;
    L_0x0077:
        if (r1 == 0) goto L_0x007c;
    L_0x0079:
        r1.close();	 Catch:{ Exception -> 0x0097 }
    L_0x007c:
        return r2;
    L_0x007d:
        r2 = move-exception;
        r3 = r0;
        goto L_0x0086;
    L_0x0080:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0082 }
    L_0x0082:
        r3 = move-exception;
        r11 = r3;
        r3 = r2;
        r2 = r11;
    L_0x0086:
        if (r1 == 0) goto L_0x0096;
    L_0x0088:
        if (r3 == 0) goto L_0x0093;
    L_0x008a:
        r1.close();	 Catch:{ Throwable -> 0x008e }
        goto L_0x0096;
    L_0x008e:
        r1 = move-exception;
        r3.addSuppressed(r1);	 Catch:{ Exception -> 0x0097 }
        goto L_0x0096;	 Catch:{ Exception -> 0x0097 }
    L_0x0093:
        r1.close();	 Catch:{ Exception -> 0x0097 }
    L_0x0096:
        throw r2;	 Catch:{ Exception -> 0x0097 }
    L_0x0097:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: atk.a():java.util.ArrayList<arl>");
    }

    public static java.util.ArrayList<defpackage.arg> a(long r16) {
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
        r0 = "https://myanimelist.net/anime/%d/anyme_app/userrecs";
        r1 = 1;
        r2 = new java.lang.Object[r1];
        r3 = java.lang.Long.valueOf(r16);
        r4 = 0;
        r2[r4] = r3;
        r0 = java.lang.String.format(r0, r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = org.jsoup.Jsoup.connect(r0);	 Catch:{ IOException -> 0x00a6 }
        r3 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ IOException -> 0x00a6 }
        r0 = r0.userAgent(r3);	 Catch:{ IOException -> 0x00a6 }
        r0 = r0.ignoreContentType(r1);	 Catch:{ IOException -> 0x00a6 }
        r3 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ IOException -> 0x00a6 }
        r0 = r0.timeout(r3);	 Catch:{ IOException -> 0x00a6 }
        r0 = r0.get();	 Catch:{ IOException -> 0x00a6 }
        r3 = "div[class=\"box-unit1\"]";	 Catch:{ IOException -> 0x00a6 }
        r0 = r0.select(r3);	 Catch:{ IOException -> 0x00a6 }
        r0 = r0.iterator();	 Catch:{ IOException -> 0x00a6 }
        r14 = 1;	 Catch:{ IOException -> 0x00a6 }
    L_0x0038:
        r3 = r0.hasNext();	 Catch:{ IOException -> 0x00a6 }
        if (r3 == 0) goto L_0x00a5;	 Catch:{ IOException -> 0x00a6 }
    L_0x003e:
        r3 = r0.next();	 Catch:{ IOException -> 0x00a6 }
        r3 = (org.jsoup.nodes.Element) r3;	 Catch:{ IOException -> 0x00a6 }
        r4 = "img";	 Catch:{ IOException -> 0x00a6 }
        r4 = r3.select(r4);	 Catch:{ IOException -> 0x00a6 }
        r5 = "data-src";	 Catch:{ IOException -> 0x00a6 }
        r8 = r4.attr(r5);	 Catch:{ IOException -> 0x00a6 }
        r4 = "li[class=\"title\"]";	 Catch:{ IOException -> 0x00a6 }
        r4 = r3.select(r4);	 Catch:{ IOException -> 0x00a6 }
        r7 = r4.text();	 Catch:{ IOException -> 0x00a6 }
        r4 = "li[class=\"update\"]";	 Catch:{ IOException -> 0x00a6 }
        r4 = r3.select(r4);	 Catch:{ IOException -> 0x00a6 }
        r9 = r4.text();	 Catch:{ IOException -> 0x00a6 }
        r4 = "li[class=\"text\"]";	 Catch:{ IOException -> 0x00a6 }
        r4 = r3.select(r4);	 Catch:{ IOException -> 0x00a6 }
        r10 = r4.text();	 Catch:{ IOException -> 0x00a6 }
        r4 = "a[class=\"box-unit1-btn di-box\"]";	 Catch:{ IOException -> 0x00a6 }
        r4 = r3.select(r4);	 Catch:{ IOException -> 0x00a6 }
        r5 = "href";	 Catch:{ IOException -> 0x00a6 }
        r11 = r4.attr(r5);	 Catch:{ IOException -> 0x00a6 }
        r4 = "a[class=\"box-unit1-btn di-box\"]";	 Catch:{ IOException -> 0x00a6 }
        r3 = r3.select(r4);	 Catch:{ IOException -> 0x00a6 }
        r4 = "href";	 Catch:{ IOException -> 0x00a6 }
        r3 = r3.attr(r4);	 Catch:{ IOException -> 0x00a6 }
        r4 = "-";	 Catch:{ NumberFormatException -> 0x0093 }
        r3 = r3.split(r4);	 Catch:{ NumberFormatException -> 0x0093 }
        r3 = r3[r1];	 Catch:{ NumberFormatException -> 0x0093 }
        r3 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0093 }
        goto L_0x0095;
    L_0x0093:
        r3 = -1;
    L_0x0095:
        r4 = r3;
        r15 = new arg;	 Catch:{ IOException -> 0x00a6 }
        r3 = r15;	 Catch:{ IOException -> 0x00a6 }
        r6 = r14;	 Catch:{ IOException -> 0x00a6 }
        r12 = r16;	 Catch:{ IOException -> 0x00a6 }
        r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ IOException -> 0x00a6 }
        r2.add(r15);	 Catch:{ IOException -> 0x00a6 }
        r14 = r14 + 1;
        goto L_0x0038;
    L_0x00a5:
        return r2;
    L_0x00a6:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: atk.a(long):java.util.ArrayList<arg>");
    }

    public static java.util.ArrayList<defpackage.arh> b(long r5) {
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
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = "https://myanimelist.net/anime/%d/anyme_app/characters";	 Catch:{ Exception -> 0x0075 }
        r2 = 1;	 Catch:{ Exception -> 0x0075 }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0075 }
        r4 = 0;	 Catch:{ Exception -> 0x0075 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0075 }
        r3[r4] = r5;	 Catch:{ Exception -> 0x0075 }
        r5 = java.lang.String.format(r1, r3);	 Catch:{ Exception -> 0x0075 }
        r5 = org.jsoup.Jsoup.connect(r5);	 Catch:{ Exception -> 0x0075 }
        r6 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ Exception -> 0x0075 }
        r5 = r5.userAgent(r6);	 Catch:{ Exception -> 0x0075 }
        r5 = r5.ignoreContentType(r2);	 Catch:{ Exception -> 0x0075 }
        r6 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x0075 }
        r5 = r5.timeout(r6);	 Catch:{ Exception -> 0x0075 }
        r5 = r5.get();	 Catch:{ Exception -> 0x0075 }
        r6 = "div[class='characters']";	 Catch:{ Exception -> 0x0075 }
        r5 = r5.select(r6);	 Catch:{ Exception -> 0x0075 }
        r6 = "div[class='box-unit4 pl8 pr8 pt0 pb12 mb12 di-box']";	 Catch:{ Exception -> 0x0075 }
        r5 = r5.select(r6);	 Catch:{ Exception -> 0x0075 }
        r5 = r5.iterator();	 Catch:{ Exception -> 0x0075 }
    L_0x003d:
        r6 = r5.hasNext();	 Catch:{ Exception -> 0x0075 }
        if (r6 == 0) goto L_0x0074;	 Catch:{ Exception -> 0x0075 }
    L_0x0043:
        r6 = r5.next();	 Catch:{ Exception -> 0x0075 }
        r6 = (org.jsoup.nodes.Element) r6;	 Catch:{ Exception -> 0x0075 }
        r1 = "a[href*=/myanimelist.net/character/]";	 Catch:{ Exception -> 0x0075 }
        r1 = r6.select(r1);	 Catch:{ Exception -> 0x0075 }
        r1 = r1.text();	 Catch:{ Exception -> 0x0075 }
        r2 = "a[href*=/myanimelist.net/character/]";	 Catch:{ Exception -> 0x0075 }
        r2 = r6.select(r2);	 Catch:{ Exception -> 0x0075 }
        r3 = "href";	 Catch:{ Exception -> 0x0075 }
        r2 = r2.attr(r3);	 Catch:{ Exception -> 0x0075 }
        r3 = "img[src*=/images/characters/]";	 Catch:{ Exception -> 0x0075 }
        r6 = r6.select(r3);	 Catch:{ Exception -> 0x0075 }
        r3 = "src";	 Catch:{ Exception -> 0x0075 }
        r6 = r6.attr(r3);	 Catch:{ Exception -> 0x0075 }
        r3 = new arh;	 Catch:{ Exception -> 0x0075 }
        r3.<init>(r1, r2, r6);	 Catch:{ Exception -> 0x0075 }
        r0.add(r3);	 Catch:{ Exception -> 0x0075 }
        goto L_0x003d;
    L_0x0074:
        return r0;
    L_0x0075:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: atk.b(long):java.util.ArrayList<arh>");
    }
}
