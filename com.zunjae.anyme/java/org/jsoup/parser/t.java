package org.jsoup.parser;

enum t extends a {
    t(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, da daVar) {
        daVar.m("head");
        return daVar.a(aaVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean process(org.jsoup.parser.aa r10, org.jsoup.parser.HtmlTreeBuilder r11) {
        /*
        r9 = this;
        r0 = org.jsoup.parser.a.isWhitespace(r10);
        r1 = 1;
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r10 = (org.jsoup.parser.ab) r10;
        r11.a(r10);
        return r1;
    L_0x000d:
        r0 = org.jsoup.parser.r.a;
        r2 = r10.a;
        r2 = r2.ordinal();
        r0 = r0[r2];
        r2 = 0;
        switch(r0) {
            case 1: goto L_0x00fe;
            case 2: goto L_0x00fa;
            case 3: goto L_0x0052;
            case 4: goto L_0x0020;
            default: goto L_0x001b;
        };
    L_0x001b:
        r10 = r9.anythingElse(r10, r11);
        return r10;
    L_0x0020:
        r0 = r10;
        r0 = (org.jsoup.parser.af) r0;
        r0 = r0.l();
        r3 = "head";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0039;
    L_0x002f:
        r11.i();
        r10 = AfterHead;
    L_0x0034:
        r11.a(r10);
        goto L_0x0103;
    L_0x0039:
        r1 = "body";
        r3 = "html";
        r4 = "br";
        r1 = new java.lang.String[]{r1, r3, r4};
        r0 = org.jsoup.helper.StringUtil.in(r0, r1);
        if (r0 == 0) goto L_0x004e;
    L_0x0049:
        r10 = r9.anythingElse(r10, r11);
        return r10;
    L_0x004e:
        r11.b(r9);
        return r2;
    L_0x0052:
        r0 = r10;
        r0 = (org.jsoup.parser.ag) r0;
        r3 = r0.l();
        r4 = "html";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x0068;
    L_0x0061:
        r0 = InBody;
        r10 = r0.process(r10, r11);
        return r10;
    L_0x0068:
        r4 = "base";
        r5 = "basefont";
        r6 = "bgsound";
        r7 = "command";
        r8 = "link";
        r4 = new java.lang.String[]{r4, r5, r6, r7, r8};
        r4 = org.jsoup.helper.StringUtil.in(r3, r4);
        if (r4 == 0) goto L_0x0095;
    L_0x007c:
        r10 = r11.b(r0);
        r0 = "base";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0088:
        r0 = "href";
        r0 = r10.hasAttr(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0090:
        r11.a(r10);
        goto L_0x0103;
    L_0x0095:
        r4 = "meta";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x00a1;
    L_0x009d:
        r11.b(r0);
        goto L_0x0103;
    L_0x00a1:
        r4 = "title";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x00ad;
    L_0x00a9:
        org.jsoup.parser.a.handleRcData(r0, r11);
        goto L_0x0103;
    L_0x00ad:
        r4 = "noframes";
        r5 = "style";
        r4 = new java.lang.String[]{r4, r5};
        r4 = org.jsoup.helper.StringUtil.in(r3, r4);
        if (r4 == 0) goto L_0x00bf;
    L_0x00bb:
        org.jsoup.parser.a.handleRawtext(r0, r11);
        goto L_0x0103;
    L_0x00bf:
        r4 = "noscript";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x00ce;
    L_0x00c7:
        r11.a(r0);
        r10 = InHeadNoscript;
        goto L_0x0034;
    L_0x00ce:
        r4 = "script";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x00e9;
    L_0x00d6:
        r10 = r11.c;
        r2 = org.jsoup.parser.ak.ScriptData;
        r10.a(r2);
        r11.c();
        r10 = Text;
        r11.a(r10);
        r11.a(r0);
        goto L_0x0103;
    L_0x00e9:
        r0 = "head";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x00f5;
    L_0x00f1:
        r11.b(r9);
        return r2;
    L_0x00f5:
        r10 = r9.anythingElse(r10, r11);
        return r10;
    L_0x00fa:
        r11.b(r9);
        return r2;
    L_0x00fe:
        r10 = (org.jsoup.parser.ac) r10;
        r11.a(r10);
    L_0x0103:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.t.process(org.jsoup.parser.aa, org.jsoup.parser.HtmlTreeBuilder):boolean");
    }
}
