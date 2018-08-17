package defpackage;

import android.annotation.SuppressLint;

@SuppressLint({"DefaultLocale"})
public class atj {
    private static final String a = "atj";

    public static int a(int i) {
        Object a = atj.a();
        if (bit.b(a)) {
            return -4;
        }
        return atj.a("https://myanimelist.net/ownlist/anime/add.json", ato.a().a((Object) new and(i, 6, 0, 0, a)));
    }

    public static int a(are are) {
        Object a = atj.a();
        if (bit.b(a)) {
            return -4;
        }
        return atj.a("https://myanimelist.net/ownlist/anime/edit.json", ato.a().a((Object) new and(are.d(), are.v(), are.r(), are.o(), a)));
    }

    private static int a(java.lang.String r2, java.lang.String r3) {
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
        r2 = org.jsoup.Jsoup.connect(r2);	 Catch:{ Exception -> 0x0046 }
        r0 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x0046 }
        r2 = r2.timeout(r0);	 Catch:{ Exception -> 0x0046 }
        r0 = "accept-encoding";	 Catch:{ Exception -> 0x0046 }
        r1 = "gzip, deflate, br";	 Catch:{ Exception -> 0x0046 }
        r2 = r2.header(r0, r1);	 Catch:{ Exception -> 0x0046 }
        r0 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36";	 Catch:{ Exception -> 0x0046 }
        r2 = r2.userAgent(r0);	 Catch:{ Exception -> 0x0046 }
        r0 = "cookie";	 Catch:{ Exception -> 0x0046 }
        r1 = defpackage.anp.d();	 Catch:{ Exception -> 0x0046 }
        r2 = r2.header(r0, r1);	 Catch:{ Exception -> 0x0046 }
        r0 = "Content-Type";	 Catch:{ Exception -> 0x0046 }
        r1 = "application/x-www-form-urlencoded; charset=UTF-8";	 Catch:{ Exception -> 0x0046 }
        r2 = r2.header(r0, r1);	 Catch:{ Exception -> 0x0046 }
        r2 = r2.requestBody(r3);	 Catch:{ Exception -> 0x0046 }
        r3 = org.jsoup.Connection.Method.POST;	 Catch:{ Exception -> 0x0046 }
        r2 = r2.method(r3);	 Catch:{ Exception -> 0x0046 }
        r3 = 1;	 Catch:{ Exception -> 0x0046 }
        r2 = r2.ignoreContentType(r3);	 Catch:{ Exception -> 0x0046 }
        r2 = r2.ignoreHttpErrors(r3);	 Catch:{ Exception -> 0x0046 }
        r2 = r2.execute();	 Catch:{ Exception -> 0x0046 }
        r2 = r2.statusCode();	 Catch:{ Exception -> 0x0046 }
        return r2;
    L_0x0046:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: atj.a(java.lang.String, java.lang.String):int");
    }

    private static java.lang.String a() {
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
        r0 = "https://myanimelist.net/about.php?go=support";	 Catch:{ Exception -> 0x003e }
        r0 = org.jsoup.Jsoup.connect(r0);	 Catch:{ Exception -> 0x003e }
        r1 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x003e }
        r0 = r0.timeout(r1);	 Catch:{ Exception -> 0x003e }
        r1 = "accept-encoding";	 Catch:{ Exception -> 0x003e }
        r2 = "gzip, deflate, br";	 Catch:{ Exception -> 0x003e }
        r0 = r0.header(r1, r2);	 Catch:{ Exception -> 0x003e }
        r1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36";	 Catch:{ Exception -> 0x003e }
        r0 = r0.userAgent(r1);	 Catch:{ Exception -> 0x003e }
        r1 = defpackage.anp.e();	 Catch:{ Exception -> 0x003e }
        if (r1 == 0) goto L_0x0029;	 Catch:{ Exception -> 0x003e }
    L_0x0020:
        r1 = "cookie";	 Catch:{ Exception -> 0x003e }
        r2 = defpackage.anp.d();	 Catch:{ Exception -> 0x003e }
        r0.header(r1, r2);	 Catch:{ Exception -> 0x003e }
    L_0x0029:
        r0 = r0.execute();	 Catch:{ Exception -> 0x003e }
        r0 = r0.parse();	 Catch:{ Exception -> 0x003e }
        r1 = "meta[name=csrf_token]";	 Catch:{ Exception -> 0x003e }
        r0 = r0.select(r1);	 Catch:{ Exception -> 0x003e }
        r1 = "content";	 Catch:{ Exception -> 0x003e }
        r0 = r0.attr(r1);	 Catch:{ Exception -> 0x003e }
        return r0;
    L_0x003e:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: atj.a():java.lang.String");
    }

    public static java.util.ArrayList<defpackage.are> a(java.lang.String r10) {
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
        r0 = defpackage.atj.a();
        r0 = defpackage.bit.b(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = "https://myanimelist.net/animelist/%s&view=tile&status=7";	 Catch:{ Exception -> 0x00f4 }
        r2 = 1;	 Catch:{ Exception -> 0x00f4 }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00f4 }
        r4 = 0;	 Catch:{ Exception -> 0x00f4 }
        r3[r4] = r10;	 Catch:{ Exception -> 0x00f4 }
        r10 = java.lang.String.format(r0, r3);	 Catch:{ Exception -> 0x00f4 }
        r10 = org.jsoup.Jsoup.connect(r10);	 Catch:{ Exception -> 0x00f4 }
        r0 = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.userAgent(r0);	 Catch:{ Exception -> 0x00f4 }
        r0 = "cookie";	 Catch:{ Exception -> 0x00f4 }
        r3 = defpackage.anp.d();	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.header(r0, r3);	 Catch:{ Exception -> 0x00f4 }
        r0 = "Content-Type";	 Catch:{ Exception -> 0x00f4 }
        r3 = "application/x-www-form-urlencoded; charset=UTF-8";	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.header(r0, r3);	 Catch:{ Exception -> 0x00f4 }
        r0 = "accept-encoding";	 Catch:{ Exception -> 0x00f4 }
        r3 = "gzip, deflate, br";	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.header(r0, r3);	 Catch:{ Exception -> 0x00f4 }
        r0 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.timeout(r0);	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.get();	 Catch:{ Exception -> 0x00f4 }
        r0 = "div#app";	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.select(r0);	 Catch:{ Exception -> 0x00f4 }
        r0 = "data-list";	 Catch:{ Exception -> 0x00f4 }
        r10 = r10.attr(r0);	 Catch:{ Exception -> 0x00f4 }
        r0 = new org.json.JSONObject;	 Catch:{ Exception -> 0x00f4 }
        r0.<init>(r10);	 Catch:{ Exception -> 0x00f4 }
        r10 = "items";	 Catch:{ Exception -> 0x00f4 }
        r10 = r0.getJSONObject(r10);	 Catch:{ Exception -> 0x00f4 }
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00f4 }
        r0.<init>();	 Catch:{ Exception -> 0x00f4 }
        r3 = r10.keys();	 Catch:{ Exception -> 0x00f4 }
    L_0x0066:
        r5 = r3.hasNext();	 Catch:{ Exception -> 0x00f4 }
        if (r5 == 0) goto L_0x00f3;	 Catch:{ Exception -> 0x00f4 }
    L_0x006c:
        r5 = r3.next();	 Catch:{ Exception -> 0x00f4 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x00f4 }
        r6 = r10.get(r5);	 Catch:{ Exception -> 0x00f4 }
        r6 = r6 instanceof org.json.JSONObject;	 Catch:{ Exception -> 0x00f4 }
        if (r6 == 0) goto L_0x0066;	 Catch:{ Exception -> 0x00f4 }
    L_0x007a:
        r5 = r10.getJSONObject(r5);	 Catch:{ Exception -> 0x00f4 }
        r6 = new are;	 Catch:{ Exception -> 0x0066 }
        r6.<init>();	 Catch:{ Exception -> 0x0066 }
        r7 = "id";	 Catch:{ Exception -> 0x0066 }
        r8 = 0;	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optLong(r7, r8);	 Catch:{ Exception -> 0x0066 }
        r6.a(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "title";	 Catch:{ Exception -> 0x0066 }
        r8 = "IDK?";	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optString(r7, r8);	 Catch:{ Exception -> 0x0066 }
        r6.a(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0066 }
        r8 = "https://myanimelist.cdn-dena.com";	 Catch:{ Exception -> 0x0066 }
        r7.<init>(r8);	 Catch:{ Exception -> 0x0066 }
        r8 = "image";	 Catch:{ Exception -> 0x0066 }
        r9 = "";	 Catch:{ Exception -> 0x0066 }
        r8 = r5.optString(r8, r9);	 Catch:{ Exception -> 0x0066 }
        r7.append(r8);	 Catch:{ Exception -> 0x0066 }
        r7 = r7.toString();	 Catch:{ Exception -> 0x0066 }
        r6.e(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "totalEpisodes";	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optInt(r7, r4);	 Catch:{ Exception -> 0x0066 }
        r6.b(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "userStatusId";	 Catch:{ Exception -> 0x0066 }
        r8 = -1;	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optInt(r7, r8);	 Catch:{ Exception -> 0x0066 }
        r6.h(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "score";	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optInt(r7, r4);	 Catch:{ Exception -> 0x0066 }
        r6.e(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "statusId";	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optInt(r7, r4);	 Catch:{ Exception -> 0x0066 }
        r6.c(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "reDoing";	 Catch:{ Exception -> 0x0066 }
        r7 = r5.optBoolean(r7, r4);	 Catch:{ Exception -> 0x0066 }
        if (r7 == 0) goto L_0x00e1;	 Catch:{ Exception -> 0x0066 }
    L_0x00df:
        r7 = 1;	 Catch:{ Exception -> 0x0066 }
        goto L_0x00e2;	 Catch:{ Exception -> 0x0066 }
    L_0x00e1:
        r7 = 0;	 Catch:{ Exception -> 0x0066 }
    L_0x00e2:
        r6.f(r7);	 Catch:{ Exception -> 0x0066 }
        r7 = "watchedEpisodes";	 Catch:{ Exception -> 0x0066 }
        r5 = r5.optInt(r7, r4);	 Catch:{ Exception -> 0x0066 }
        r6.d(r5);	 Catch:{ Exception -> 0x0066 }
        r0.add(r6);	 Catch:{ Exception -> 0x0066 }
        goto L_0x0066;
    L_0x00f3:
        return r0;
    L_0x00f4:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: atj.a(java.lang.String):java.util.ArrayList<are>");
    }

    public static int b(int i) {
        CharSequence a = atj.a();
        if (bit.b(a)) {
            return -4;
        }
        return atj.a(String.format("https://myanimelist.net/ownlist/anime/%d/delete", new Object[]{Integer.valueOf(i)}), "csrf_token=".concat(String.valueOf(a)));
    }
}
