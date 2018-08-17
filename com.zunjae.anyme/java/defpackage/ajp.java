package defpackage;

import java.util.ArrayList;

public final class ajp {
    private static final String a = "ajp";

    public static java.lang.String a() {
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
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x000c }
        r1 = "https://gist.githubusercontent.com/zunjae/632ed2b5129b24e36e2f3421484f5936/raw/";	 Catch:{ Exception -> 0x000c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x000c }
        r0 = defpackage.bik.a(r0);	 Catch:{ Exception -> 0x000c }
        return r0;
    L_0x000c:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.a():java.lang.String");
    }

    public static java.util.ArrayList<defpackage.ama> a(defpackage.aml r9, int r10) {
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
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00a1 }
        r0.<init>();	 Catch:{ Exception -> 0x00a1 }
        r1 = "https://myanimelist.net/anime/genre/%d/%s?page=%d";	 Catch:{ Exception -> 0x00a1 }
        r2 = 3;	 Catch:{ Exception -> 0x00a1 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00a1 }
        r3 = 0;	 Catch:{ Exception -> 0x00a1 }
        r4 = r9.b();	 Catch:{ Exception -> 0x00a1 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x00a1 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00a1 }
        r3 = 1;	 Catch:{ Exception -> 0x00a1 }
        r9 = r9.a();	 Catch:{ Exception -> 0x00a1 }
        r2[r3] = r9;	 Catch:{ Exception -> 0x00a1 }
        r9 = 2;	 Catch:{ Exception -> 0x00a1 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x00a1 }
        r2[r9] = r10;	 Catch:{ Exception -> 0x00a1 }
        r9 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x00a1 }
        r9 = org.jsoup.Jsoup.connect(r9);	 Catch:{ Exception -> 0x00a1 }
        r10 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ Exception -> 0x00a1 }
        r9 = r9.userAgent(r10);	 Catch:{ Exception -> 0x00a1 }
        r9 = r9.get();	 Catch:{ Exception -> 0x00a1 }
        r10 = "div[class^=tile-unit]";	 Catch:{ Exception -> 0x00a1 }
        r9 = r9.select(r10);	 Catch:{ Exception -> 0x00a1 }
        r9 = r9.iterator();	 Catch:{ Exception -> 0x00a1 }
    L_0x003f:
        r10 = r9.hasNext();	 Catch:{ Exception -> 0x00a1 }
        if (r10 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x00a1 }
    L_0x0045:
        r10 = r9.next();	 Catch:{ Exception -> 0x00a1 }
        r10 = (org.jsoup.nodes.Element) r10;	 Catch:{ Exception -> 0x00a1 }
        r1 = "div[class=title]";	 Catch:{ Exception -> 0x00a1 }
        r1 = r10.select(r1);	 Catch:{ Exception -> 0x00a1 }
        r4 = r1.text();	 Catch:{ Exception -> 0x00a1 }
        r1 = "span[class='score icon-score di-ib mr4']";	 Catch:{ Exception -> 0x00a1 }
        r1 = r10.select(r1);	 Catch:{ Exception -> 0x00a1 }
        r6 = r1.text();	 Catch:{ Exception -> 0x00a1 }
        r1 = "data-bg";	 Catch:{ Exception -> 0x00a1 }
        r5 = r10.attr(r1);	 Catch:{ Exception -> 0x00a1 }
        r1 = "span[class='type di-ib mr4']";	 Catch:{ Exception -> 0x00a1 }
        r1 = r10.select(r1);	 Catch:{ Exception -> 0x00a1 }
        r7 = r1.text();	 Catch:{ Exception -> 0x00a1 }
        r1 = "span[class='member icon-member di-ib']";	 Catch:{ Exception -> 0x00a1 }
        r1 = r10.select(r1);	 Catch:{ Exception -> 0x00a1 }
        r8 = r1.text();	 Catch:{ Exception -> 0x00a1 }
        r1 = "a[class='thumb']";	 Catch:{ Exception -> 0x0094 }
        r10 = r10.select(r1);	 Catch:{ Exception -> 0x0094 }
        r1 = "href";	 Catch:{ Exception -> 0x0094 }
        r10 = r10.attr(r1);	 Catch:{ Exception -> 0x0094 }
        r1 = "/";	 Catch:{ Exception -> 0x0094 }
        r10 = r10.split(r1);	 Catch:{ Exception -> 0x0094 }
        r1 = 4;	 Catch:{ Exception -> 0x0094 }
        r10 = r10[r1];	 Catch:{ Exception -> 0x0094 }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ Exception -> 0x0094 }
        r3 = r10;
        goto L_0x0096;
    L_0x0094:
        r10 = -1;
        r3 = -1;
    L_0x0096:
        r10 = new ama;	 Catch:{ Exception -> 0x00a1 }
        r2 = r10;	 Catch:{ Exception -> 0x00a1 }
        r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x00a1 }
        r0.add(r10);	 Catch:{ Exception -> 0x00a1 }
        goto L_0x003f;
    L_0x00a0:
        return r0;
    L_0x00a1:
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.a(aml, int):java.util.ArrayList<ama>");
    }

    public static java.util.ArrayList<defpackage.ame> a(defpackage.are r10) {
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
        r0 = "https://myanimelist.net/anime/%d/anyme_app/news";	 Catch:{ Exception -> 0x0088 }
        r1 = 1;	 Catch:{ Exception -> 0x0088 }
        r2 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0088 }
        r3 = 0;	 Catch:{ Exception -> 0x0088 }
        r10 = r10.d();	 Catch:{ Exception -> 0x0088 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x0088 }
        r2[r3] = r10;	 Catch:{ Exception -> 0x0088 }
        r10 = java.lang.String.format(r0, r2);	 Catch:{ Exception -> 0x0088 }
        r10 = org.jsoup.Jsoup.connect(r10);	 Catch:{ Exception -> 0x0088 }
        r0 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ Exception -> 0x0088 }
        r10 = r10.userAgent(r0);	 Catch:{ Exception -> 0x0088 }
        r0 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x0088 }
        r10 = r10.timeout(r0);	 Catch:{ Exception -> 0x0088 }
        r10 = r10.ignoreContentType(r1);	 Catch:{ Exception -> 0x0088 }
        r10 = r10.get();	 Catch:{ Exception -> 0x0088 }
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0088 }
        r0.<init>();	 Catch:{ Exception -> 0x0088 }
        r1 = "a[class='box-unit3-btn di-box']";	 Catch:{ Exception -> 0x0088 }
        r10 = r10.select(r1);	 Catch:{ Exception -> 0x0088 }
        r10 = r10.iterator();	 Catch:{ Exception -> 0x0088 }
    L_0x003b:
        r1 = r10.hasNext();	 Catch:{ Exception -> 0x0088 }
        if (r1 == 0) goto L_0x0087;	 Catch:{ Exception -> 0x0088 }
    L_0x0041:
        r1 = r10.next();	 Catch:{ Exception -> 0x0088 }
        r1 = (org.jsoup.nodes.Element) r1;	 Catch:{ Exception -> 0x0088 }
        r2 = "img[data-src*=/r/130x130]";	 Catch:{ Exception -> 0x0088 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x0088 }
        r3 = "data-src";	 Catch:{ Exception -> 0x0088 }
        r6 = r2.attr(r3);	 Catch:{ Exception -> 0x0088 }
        r2 = "li[class='title']";	 Catch:{ Exception -> 0x0088 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x0088 }
        r5 = r2.text();	 Catch:{ Exception -> 0x0088 }
        r2 = "span[class='di-ib pr4']";	 Catch:{ Exception -> 0x0088 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x0088 }
        r7 = r2.text();	 Catch:{ Exception -> 0x0088 }
        r2 = "span[class='di-ib comment']";	 Catch:{ Exception -> 0x0088 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x0088 }
        r8 = r2.text();	 Catch:{ Exception -> 0x0088 }
        r2 = "a[href*=/myanimelist.net/news/]";	 Catch:{ Exception -> 0x0088 }
        r1 = r1.select(r2);	 Catch:{ Exception -> 0x0088 }
        r2 = "href";	 Catch:{ Exception -> 0x0088 }
        r9 = r1.attr(r2);	 Catch:{ Exception -> 0x0088 }
        r1 = new ame;	 Catch:{ Exception -> 0x0088 }
        r4 = r1;	 Catch:{ Exception -> 0x0088 }
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x0088 }
        r0.add(r1);	 Catch:{ Exception -> 0x0088 }
        goto L_0x003b;
    L_0x0087:
        return r0;
    L_0x0088:
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.a(are):java.util.ArrayList<ame>");
    }

    public static java.util.ArrayList<defpackage.amk> a(java.lang.String r2) {
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
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x001d }
        r0.<init>(r2);	 Catch:{ Exception -> 0x001d }
        r2 = defpackage.bik.a(r0);	 Catch:{ Exception -> 0x001d }
        r0 = new ajq;	 Catch:{ Exception -> 0x001d }
        r0.<init>();	 Catch:{ Exception -> 0x001d }
        r0 = r0.b();	 Catch:{ Exception -> 0x001d }
        r1 = defpackage.ato.a();	 Catch:{ Exception -> 0x001d }
        r2 = r1.a(r2, r0);	 Catch:{ Exception -> 0x001d }
        r2 = (java.util.ArrayList) r2;	 Catch:{ Exception -> 0x001d }
        return r2;
    L_0x001d:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.a(java.lang.String):java.util.ArrayList<amk>");
    }

    public static defpackage.amz b() {
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
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x0018 }
        r1 = "https://gist.githubusercontent.com/zunjae/e1f1db70166d6f6d68729e9e7c745bc7/raw";	 Catch:{ Exception -> 0x0018 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0018 }
        r0 = defpackage.bik.a(r0);	 Catch:{ Exception -> 0x0018 }
        r1 = defpackage.ato.a();	 Catch:{ Exception -> 0x0018 }
        r2 = defpackage.amz.class;	 Catch:{ Exception -> 0x0018 }
        r0 = r1.a(r0, r2);	 Catch:{ Exception -> 0x0018 }
        r0 = (defpackage.amz) r0;	 Catch:{ Exception -> 0x0018 }
        return r0;
    L_0x0018:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.b():amz");
    }

    public static java.util.ArrayList<defpackage.aly> b(defpackage.are r5) {
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
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = "https://myanimelist.net/anime/%d/anyme_app/video";	 Catch:{ Exception -> 0x006f }
        r2 = 1;	 Catch:{ Exception -> 0x006f }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x006f }
        r4 = 0;	 Catch:{ Exception -> 0x006f }
        r5 = r5.d();	 Catch:{ Exception -> 0x006f }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x006f }
        r3[r4] = r5;	 Catch:{ Exception -> 0x006f }
        r5 = java.lang.String.format(r1, r3);	 Catch:{ Exception -> 0x006f }
        r5 = org.jsoup.Jsoup.connect(r5);	 Catch:{ Exception -> 0x006f }
        r1 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ Exception -> 0x006f }
        r5 = r5.userAgent(r1);	 Catch:{ Exception -> 0x006f }
        r1 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x006f }
        r5 = r5.timeout(r1);	 Catch:{ Exception -> 0x006f }
        r5 = r5.ignoreContentType(r2);	 Catch:{ Exception -> 0x006f }
        r5 = r5.get();	 Catch:{ Exception -> 0x006f }
        r1 = "div[class='box-unit7 js-fancybox-video pt8 pb8']";	 Catch:{ Exception -> 0x006f }
        r5 = r5.select(r1);	 Catch:{ Exception -> 0x006f }
        r5 = r5.iterator();	 Catch:{ Exception -> 0x006f }
    L_0x003b:
        r1 = r5.hasNext();	 Catch:{ Exception -> 0x006f }
        if (r1 == 0) goto L_0x006e;	 Catch:{ Exception -> 0x006f }
    L_0x0041:
        r1 = r5.next();	 Catch:{ Exception -> 0x006f }
        r1 = (org.jsoup.nodes.Element) r1;	 Catch:{ Exception -> 0x006f }
        r2 = "data-id";	 Catch:{ Exception -> 0x006f }
        r2 = r1.attr(r2);	 Catch:{ Exception -> 0x006f }
        r3 = "data-title";	 Catch:{ Exception -> 0x006f }
        r3 = r1.attr(r3);	 Catch:{ Exception -> 0x006f }
        r4 = "div[class='icon-thumb users list h40 no-ti'";	 Catch:{ Exception -> 0x006f }
        r1 = r1.select(r4);	 Catch:{ Exception -> 0x006f }
        r4 = "img";	 Catch:{ Exception -> 0x006f }
        r1 = r1.select(r4);	 Catch:{ Exception -> 0x006f }
        r4 = "data-src";	 Catch:{ Exception -> 0x006f }
        r1 = r1.attr(r4);	 Catch:{ Exception -> 0x006f }
        r4 = new aly;	 Catch:{ Exception -> 0x006f }
        r4.<init>(r3, r1, r2);	 Catch:{ Exception -> 0x006f }
        r0.add(r4);	 Catch:{ Exception -> 0x006f }
        goto L_0x003b;
    L_0x006e:
        return r0;
    L_0x006f:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.b(are):java.util.ArrayList<aly>");
    }

    public static ArrayList<alt> b(String str) {
        return ajp.c(str);
    }

    private static java.util.ArrayList<defpackage.alt> c(java.lang.String r10) {
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
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00a0 }
        r0.<init>();	 Catch:{ Exception -> 0x00a0 }
        r1 = "https://myanimelist.net/anime.php?q=%s&show=%d";	 Catch:{ Exception -> 0x00a0 }
        r2 = 2;	 Catch:{ Exception -> 0x00a0 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00a0 }
        r3 = 0;	 Catch:{ Exception -> 0x00a0 }
        r2[r3] = r10;	 Catch:{ Exception -> 0x00a0 }
        r10 = 1;	 Catch:{ Exception -> 0x00a0 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x00a0 }
        r2[r10] = r3;	 Catch:{ Exception -> 0x00a0 }
        r10 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x00a0 }
        r10 = org.jsoup.Jsoup.connect(r10);	 Catch:{ Exception -> 0x00a0 }
        r1 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ Exception -> 0x00a0 }
        r10 = r10.userAgent(r1);	 Catch:{ Exception -> 0x00a0 }
        r10 = r10.get();	 Catch:{ Exception -> 0x00a0 }
        r1 = "div[class='box-unit1']";	 Catch:{ Exception -> 0x00a0 }
        r10 = r10.select(r1);	 Catch:{ Exception -> 0x00a0 }
        r10 = r10.iterator();	 Catch:{ Exception -> 0x00a0 }
    L_0x0030:
        r1 = r10.hasNext();	 Catch:{ Exception -> 0x00a0 }
        if (r1 == 0) goto L_0x009f;	 Catch:{ Exception -> 0x00a0 }
    L_0x0036:
        r1 = r10.next();	 Catch:{ Exception -> 0x00a0 }
        r1 = (org.jsoup.nodes.Element) r1;	 Catch:{ Exception -> 0x00a0 }
        r2 = "li[class='title']";	 Catch:{ Exception -> 0x00a0 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x00a0 }
        r5 = r2.text();	 Catch:{ Exception -> 0x00a0 }
        r2 = "dd[class='fn-grey5 fs12 fw-n pt8']";	 Catch:{ Exception -> 0x00a0 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x00a0 }
        r7 = r2.text();	 Catch:{ Exception -> 0x00a0 }
        r2 = "li[class='fn-grey5 fs12 fw-n']";	 Catch:{ Exception -> 0x00a0 }
        r2 = r1.select(r2);	 Catch:{ Exception -> 0x00a0 }
        r2 = r2.text();	 Catch:{ Exception -> 0x00a0 }
        r3 = "li[class='text mt8']";	 Catch:{ Exception -> 0x00a0 }
        r3 = r1.select(r3);	 Catch:{ Exception -> 0x00a0 }
        r8 = r3.text();	 Catch:{ Exception -> 0x00a0 }
        r3 = "img[data-src*='.jpg?s=']";	 Catch:{ Exception -> 0x00a0 }
        r3 = r1.select(r3);	 Catch:{ Exception -> 0x00a0 }
        r4 = "data-src";	 Catch:{ Exception -> 0x00a0 }
        r9 = r3.attr(r4);	 Catch:{ Exception -> 0x00a0 }
        r3 = "Score";	 Catch:{ Exception -> 0x00a0 }
        r4 = "Score: ";	 Catch:{ Exception -> 0x00a0 }
        r6 = r2.replace(r3, r4);	 Catch:{ Exception -> 0x00a0 }
        r2 = "a[class='box-unit1-btn di-box'";	 Catch:{ Exception -> 0x0093 }
        r1 = r1.select(r2);	 Catch:{ Exception -> 0x0093 }
        r2 = "href";	 Catch:{ Exception -> 0x0093 }
        r1 = r1.attr(r2);	 Catch:{ Exception -> 0x0093 }
        r2 = "/";	 Catch:{ Exception -> 0x0093 }
        r1 = r1.split(r2);	 Catch:{ Exception -> 0x0093 }
        r2 = 4;	 Catch:{ Exception -> 0x0093 }
        r1 = r1[r2];	 Catch:{ Exception -> 0x0093 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x0093 }
        r4 = r1;
        goto L_0x0095;
    L_0x0093:
        r1 = -1;
        r4 = -1;
    L_0x0095:
        r1 = new alt;	 Catch:{ Exception -> 0x00a0 }
        r3 = r1;	 Catch:{ Exception -> 0x00a0 }
        r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x00a0 }
        r0.add(r1);	 Catch:{ Exception -> 0x00a0 }
        goto L_0x0030;
    L_0x009f:
        return r0;
    L_0x00a0:
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajp.c(java.lang.String):java.util.ArrayList<alt>");
    }
}
