package org.jsoup.parser;

enum i extends a {
    i(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.b((a) this);
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean process(org.jsoup.parser.aa r7, org.jsoup.parser.HtmlTreeBuilder r8) {
        /*
        r6 = this;
        r0 = org.jsoup.parser.r.a;
        r1 = r7.a;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x0176;
            case 2: goto L_0x0172;
            case 3: goto L_0x00d0;
            case 4: goto L_0x0041;
            case 5: goto L_0x0028;
            case 6: goto L_0x0013;
            default: goto L_0x000e;
        };
    L_0x000e:
        r7 = r6.anythingElse(r7, r8);
        return r7;
    L_0x0013:
        r7 = r8.y();
        r7 = r7.nodeName();
        r0 = "html";
        r7 = r7.equals(r0);
        if (r7 != 0) goto L_0x017b;
    L_0x0023:
        r8.b(r6);
        goto L_0x017b;
    L_0x0028:
        r7 = (org.jsoup.parser.ab) r7;
        r0 = r7.h();
        r2 = org.jsoup.parser.a.nullString;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x003c;
    L_0x0038:
        r8.b(r6);
        return r1;
    L_0x003c:
        r8.a(r7);
        goto L_0x017b;
    L_0x0041:
        r0 = r7;
        r0 = (org.jsoup.parser.af) r0;
        r0 = r0.l();
        r2 = "optgroup";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0098;
    L_0x0050:
        r7 = r8.y();
        r7 = r7.nodeName();
        r0 = "option";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0083;
    L_0x0060:
        r7 = r8.y();
        r7 = r8.e(r7);
        if (r7 == 0) goto L_0x0083;
    L_0x006a:
        r7 = r8.y();
        r7 = r8.e(r7);
        r7 = r7.nodeName();
        r0 = "optgroup";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0083;
    L_0x007e:
        r7 = "option";
        r8.m(r7);
    L_0x0083:
        r7 = r8.y();
        r7 = r7.nodeName();
        r0 = "optgroup";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0023;
    L_0x0093:
        r8.i();
        goto L_0x017b;
    L_0x0098:
        r2 = "option";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00b1;
    L_0x00a0:
        r7 = r8.y();
        r7 = r7.nodeName();
        r0 = "option";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0023;
    L_0x00b0:
        goto L_0x0093;
    L_0x00b1:
        r2 = "select";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00cb;
    L_0x00b9:
        r7 = r8.i(r0);
        if (r7 != 0) goto L_0x00c3;
    L_0x00bf:
        r8.b(r6);
        return r1;
    L_0x00c3:
        r8.c(r0);
        r8.n();
        goto L_0x017b;
    L_0x00cb:
        r7 = r6.anythingElse(r7, r8);
        return r7;
    L_0x00d0:
        r0 = r7;
        r0 = (org.jsoup.parser.ag) r0;
        r2 = r0.l();
        r3 = "html";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x00e6;
    L_0x00df:
        r7 = InBody;
        r7 = r8.a(r0, r7);
        return r7;
    L_0x00e6:
        r3 = "option";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x00f8;
    L_0x00ee:
        r7 = "option";
    L_0x00f0:
        r8.m(r7);
    L_0x00f3:
        r8.a(r0);
        goto L_0x017b;
    L_0x00f8:
        r3 = "optgroup";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0126;
    L_0x0100:
        r7 = r8.y();
        r7 = r7.nodeName();
        r1 = "option";
        r7 = r7.equals(r1);
        if (r7 == 0) goto L_0x0113;
    L_0x0110:
        r7 = "option";
        goto L_0x00f0;
    L_0x0113:
        r7 = r8.y();
        r7 = r7.nodeName();
        r1 = "optgroup";
        r7 = r7.equals(r1);
        if (r7 == 0) goto L_0x00f3;
    L_0x0123:
        r7 = "optgroup";
        goto L_0x00f0;
    L_0x0126:
        r3 = "select";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0138;
    L_0x012e:
        r8.b(r6);
        r7 = "select";
        r7 = r8.m(r7);
        return r7;
    L_0x0138:
        r3 = "input";
        r4 = "keygen";
        r5 = "textarea";
        r3 = new java.lang.String[]{r3, r4, r5};
        r3 = org.jsoup.helper.StringUtil.in(r2, r3);
        if (r3 == 0) goto L_0x015e;
    L_0x0148:
        r8.b(r6);
        r7 = "select";
        r7 = r8.i(r7);
        if (r7 != 0) goto L_0x0154;
    L_0x0153:
        return r1;
    L_0x0154:
        r7 = "select";
        r8.m(r7);
        r7 = r8.a(r0);
        return r7;
    L_0x015e:
        r0 = "script";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x016d;
    L_0x0166:
        r0 = InHead;
        r7 = r8.a(r7, r0);
        return r7;
    L_0x016d:
        r7 = r6.anythingElse(r7, r8);
        return r7;
    L_0x0172:
        r8.b(r6);
        return r1;
    L_0x0176:
        r7 = (org.jsoup.parser.ac) r7;
        r8.a(r7);
    L_0x017b:
        r7 = 1;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.i.process(org.jsoup.parser.aa, org.jsoup.parser.HtmlTreeBuilder):boolean");
    }
}
