package com.zunjae.anyme.activities.browsers;

import defpackage.ajh;
import org.jsoup.helper.StringUtil;

final class l implements ajh {
    final /* synthetic */ SearchResultsBrowser a;

    l(SearchResultsBrowser searchResultsBrowser) {
        this.a = searchResultsBrowser;
    }

    public final void a(java.lang.String r4) {
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
        r3 = this;
        r0 = r3.a;
        r0 = r0.toolbar;
        r0.setSubtitle(r4);
        r0 = r3.a;
        r1 = -1;
        r0.m = r1;
        r0 = "myanimelist.net/anime/";
        r0 = r4.contains(r0);
        r1 = 8;
        if (r0 == 0) goto L_0x0043;
    L_0x0017:
        r0 = "/";
        r4 = r4.split(r0);
        r4 = java.util.Arrays.asList(r4);
        r0 = r4.size();
        r2 = 4;
        if (r0 <= r2) goto L_0x0043;
    L_0x0028:
        r4 = r4.get(r2);	 Catch:{ NumberFormatException -> 0x0043 }
        r4 = (java.lang.String) r4;	 Catch:{ NumberFormatException -> 0x0043 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0043 }
        false;	 Catch:{ NumberFormatException -> 0x0043 }
        r0 = r3.a;	 Catch:{ NumberFormatException -> 0x0043 }
        r0 = r0.addToPTWButton;	 Catch:{ NumberFormatException -> 0x0043 }
        r2 = 0;	 Catch:{ NumberFormatException -> 0x0043 }
        r0.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0043 }
        r0 = r3.a;	 Catch:{ NumberFormatException -> 0x0043 }
        r0.m = r4;	 Catch:{ NumberFormatException -> 0x0043 }
        return;
    L_0x0043:
        r4 = r3.a;
        r4 = r4.addToPTWButton;
        r4.setVisibility(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.l.a(java.lang.String):void");
    }

    public final void b(String str) {
        if (!StringUtil.isBlank(str)) {
            this.a.toolbar.setTitle(str);
        }
    }

    public final void c(String str) {
    }
}
