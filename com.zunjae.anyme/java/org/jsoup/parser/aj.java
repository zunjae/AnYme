package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.helper.Validate;

final class aj {
    private static final char[] h;
    StringBuilder a = new StringBuilder(1024);
    ah b;
    ag c = new ag();
    af d = new af();
    ab e = new ab();
    ad f = new ad();
    ac g = new ac();
    private final CharacterReader i;
    private final ParseErrorList j;
    private ak k = ak.Data;
    private aa l;
    private boolean m = false;
    private String n = null;
    private StringBuilder o = new StringBuilder(1024);
    private String p;
    private boolean q = true;
    private final int[] r = new int[1];
    private final int[] s = new int[2];

    static {
        char[] cArr = new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'};
        h = cArr;
        Arrays.sort(cArr);
    }

    aj(CharacterReader characterReader, ParseErrorList parseErrorList) {
        this.i = characterReader;
        this.j = parseErrorList;
    }

    private void b(String str) {
        if (this.j.a()) {
            this.j.add(new ParseError(this.i.pos(), "Invalid character reference: %s", str));
        }
    }

    private void c(String str) {
        if (this.j.a()) {
            this.j.add(new ParseError(this.i.pos(), str));
        }
    }

    final aa a() {
        if (!this.q) {
            c("Self closing flag not acknowledged");
            this.q = true;
        }
        while (!this.m) {
            this.k.read(this, this.i);
        }
        if (this.o.length() > 0) {
            String stringBuilder = this.o.toString();
            StringBuilder stringBuilder2 = this.o;
            stringBuilder2.delete(0, stringBuilder2.length());
            this.n = null;
            return this.e.a(stringBuilder);
        }
        stringBuilder = this.n;
        if (stringBuilder != null) {
            aa a = this.e.a(stringBuilder);
            this.n = null;
            return a;
        }
        this.m = false;
        return this.l;
    }

    final ah a(boolean z) {
        this.b = z ? this.c.h() : this.d.h();
        return this.b;
    }

    final void a(char c) {
        a(String.valueOf(c));
    }

    final void a(String str) {
        if (this.n == null) {
            this.n = str;
            return;
        }
        if (this.o.length() == 0) {
            this.o.append(this.n);
        }
        this.o.append(str);
    }

    final void a(aa aaVar) {
        Validate.isFalse(this.m, "There is an unread token pending!");
        this.l = aaVar;
        this.m = true;
        ai aiVar = aaVar.a;
        if (aiVar == ai.StartTag) {
            ag agVar = (ag) aaVar;
            this.p = agVar.b;
            if (agVar.d) {
                this.q = false;
            }
            return;
        }
        if (aiVar == ai.EndTag && ((af) aaVar).e != null) {
            c("Attributes incorrectly present on end tag");
        }
    }

    final void a(ak akVar) {
        this.k = akVar;
    }

    final void a(int[] iArr) {
        a(new String(iArr, 0, iArr.length));
    }

    final int[] a(java.lang.Character r7, boolean r8) {
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
        r6 = this;
        r0 = r6.i;
        r0 = r0.isEmpty();
        r1 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        if (r7 == 0) goto L_0x0019;
    L_0x000c:
        r7 = r7.charValue();
        r0 = r6.i;
        r0 = r0.current();
        if (r7 != r0) goto L_0x0019;
    L_0x0018:
        return r1;
    L_0x0019:
        r7 = r6.i;
        r0 = h;
        r7 = r7.c(r0);
        if (r7 == 0) goto L_0x0024;
    L_0x0023:
        return r1;
    L_0x0024:
        r7 = r6.r;
        r0 = r6.i;
        r0.c();
        r0 = r6.i;
        r2 = "#";
        r0 = r0.b(r2);
        r2 = 0;
        if (r0 == 0) goto L_0x009f;
    L_0x0036:
        r8 = r6.i;
        r0 = "X";
        r8 = r8.c(r0);
        if (r8 == 0) goto L_0x0047;
    L_0x0040:
        r0 = r6.i;
        r0 = r0.i();
        goto L_0x004d;
    L_0x0047:
        r0 = r6.i;
        r0 = r0.j();
    L_0x004d:
        r3 = r0.length();
        if (r3 != 0) goto L_0x005e;
    L_0x0053:
        r7 = "numeric reference with no numerals";
        r6.b(r7);
    L_0x0058:
        r7 = r6.i;
        r7.d();
        return r1;
    L_0x005e:
        r1 = r6.i;
        r3 = ";";
        r1 = r1.b(r3);
        if (r1 != 0) goto L_0x006d;
    L_0x0068:
        r1 = "missing semicolon";
        r6.b(r1);
    L_0x006d:
        if (r8 == 0) goto L_0x0072;
    L_0x006f:
        r8 = 16;
        goto L_0x0074;
    L_0x0072:
        r8 = 10;
    L_0x0074:
        r1 = -1;
        r8 = java.lang.Integer.valueOf(r0, r8);	 Catch:{ NumberFormatException -> 0x007e }
        r8 = r8.intValue();	 Catch:{ NumberFormatException -> 0x007e }
        goto L_0x007f;
    L_0x007e:
        r8 = -1;
    L_0x007f:
        if (r8 == r1) goto L_0x0094;
    L_0x0081:
        r0 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r8 < r0) goto L_0x008b;
    L_0x0086:
        r0 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r8 <= r0) goto L_0x0094;
    L_0x008b:
        r0 = 1114111; // 0x10ffff float:1.561202E-39 double:5.50444E-318;
        if (r8 <= r0) goto L_0x0091;
    L_0x0090:
        goto L_0x0094;
    L_0x0091:
        r7[r2] = r8;
        return r7;
    L_0x0094:
        r8 = "character outside of valid range";
        r6.b(r8);
        r8 = 65533; // 0xfffd float:9.1831E-41 double:3.23776E-319;
        r7[r2] = r8;
        return r7;
    L_0x009f:
        r0 = r6.i;
        r0 = r0.h();
        r3 = r6.i;
        r4 = 59;
        r3 = r3.a(r4);
        r4 = org.jsoup.nodes.Entities.isBaseNamedEntity(r0);
        r5 = 1;
        if (r4 != 0) goto L_0x00bf;
    L_0x00b4:
        r4 = org.jsoup.nodes.Entities.isNamedEntity(r0);
        if (r4 == 0) goto L_0x00bd;
    L_0x00ba:
        if (r3 == 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00bf;
    L_0x00bd:
        r4 = 0;
        goto L_0x00c0;
    L_0x00bf:
        r4 = 1;
    L_0x00c0:
        if (r4 != 0) goto L_0x00d7;
    L_0x00c2:
        r7 = r6.i;
        r7.d();
        if (r3 == 0) goto L_0x00d6;
    L_0x00c9:
        r7 = "invalid named referenece '%s'";
        r8 = new java.lang.Object[r5];
        r8[r2] = r0;
        r7 = java.lang.String.format(r7, r8);
        r6.b(r7);
    L_0x00d6:
        return r1;
    L_0x00d7:
        if (r8 == 0) goto L_0x00f9;
    L_0x00d9:
        r8 = r6.i;
        r8 = r8.k();
        if (r8 != 0) goto L_0x0058;
    L_0x00e1:
        r8 = r6.i;
        r8 = r8.l();
        if (r8 != 0) goto L_0x0058;
    L_0x00e9:
        r8 = r6.i;
        r3 = 3;
        r3 = new char[r3];
        r3 = {61, 45, 95};
        r8 = r8.b(r3);
        if (r8 == 0) goto L_0x00f9;
    L_0x00f7:
        goto L_0x0058;
    L_0x00f9:
        r8 = r6.i;
        r1 = ";";
        r8 = r8.b(r1);
        if (r8 != 0) goto L_0x0108;
    L_0x0103:
        r8 = "missing semicolon";
        r6.b(r8);
    L_0x0108:
        r8 = r6.s;
        r8 = org.jsoup.nodes.Entities.codepointsForName(r0, r8);
        if (r8 != r5) goto L_0x0117;
    L_0x0110:
        r8 = r6.s;
        r8 = r8[r2];
        r7[r2] = r8;
        return r7;
    L_0x0117:
        r7 = 2;
        if (r8 != r7) goto L_0x011d;
    L_0x011a:
        r7 = r6.s;
        return r7;
    L_0x011d:
        r7 = "Unexpected characters returned for ";
        r8 = java.lang.String.valueOf(r0);
        r7 = r7.concat(r8);
        org.jsoup.helper.Validate.fail(r7);
        r7 = r6.s;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.aj.a(java.lang.Character, boolean):int[]");
    }

    final String b(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        while (!this.i.isEmpty()) {
            stringBuilder.append(this.i.consumeTo('&'));
            if (this.i.a('&')) {
                this.i.a();
                int[] a = a(null, z);
                if (a != null) {
                    if (a.length != 0) {
                        stringBuilder.appendCodePoint(a[0]);
                        if (a.length == 2) {
                            stringBuilder.appendCodePoint(a[1]);
                        }
                    }
                }
                stringBuilder.append('&');
            }
        }
        return stringBuilder.toString();
    }

    final void b() {
        this.q = true;
    }

    final void b(ak akVar) {
        this.i.advance();
        this.k = akVar;
    }

    final void c() {
        this.b.j();
        a(this.b);
    }

    final void c(ak akVar) {
        if (this.j.a()) {
            this.j.add(new ParseError(this.i.pos(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.i.current()), akVar));
        }
    }

    final void d() {
        a(this.g);
    }

    final void d(ak akVar) {
        if (this.j.a()) {
            this.j.add(new ParseError(this.i.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", akVar));
        }
    }

    final void e() {
        this.f.a();
    }

    final void f() {
        a(this.f);
    }

    final boolean g() {
        return this.p != null && this.b.k().equalsIgnoreCase(this.p);
    }

    final String h() {
        String str = this.p;
        return str == null ? null : str;
    }
}
