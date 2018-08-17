package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.nodes.Element;

enum w extends a {
    w(String str, int i) {
        super(str, i);
    }

    final boolean anyOtherEndTag(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        String l = ((af) aaVar).l();
        ArrayList j = htmlTreeBuilder.j();
        int size = j.size() - 1;
        while (size >= 0) {
            Element element = (Element) j.get(size);
            if (element.nodeName().equals(l)) {
                htmlTreeBuilder.j(l);
                if (!l.equals(htmlTreeBuilder.y().nodeName())) {
                    htmlTreeBuilder.b((a) this);
                }
                htmlTreeBuilder.c(l);
                return true;
            } else if (HtmlTreeBuilder.g(element)) {
                htmlTreeBuilder.b((a) this);
                return false;
            } else {
                size--;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean process(org.jsoup.parser.aa r14, org.jsoup.parser.HtmlTreeBuilder r15) {
        /*
        r13 = this;
        r0 = org.jsoup.parser.r.a;
        r1 = r14.a;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case 1: goto L_0x086c;
            case 2: goto L_0x0868;
            case 3: goto L_0x0319;
            case 4: goto L_0x0041;
            case 5: goto L_0x0011;
            default: goto L_0x000f;
        };
    L_0x000f:
        goto L_0x0871;
    L_0x0011:
        r14 = (org.jsoup.parser.ab) r14;
        r0 = r14.h();
        r3 = org.jsoup.parser.a.nullString;
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0025;
    L_0x0021:
        r15.b(r13);
        return r2;
    L_0x0025:
        r0 = r15.e();
        if (r0 == 0) goto L_0x0039;
    L_0x002b:
        r0 = org.jsoup.parser.a.isWhitespace(r14);
        if (r0 == 0) goto L_0x0039;
    L_0x0031:
        r15.u();
        r15.a(r14);
        goto L_0x0871;
    L_0x0039:
        r15.u();
        r15.a(r14);
        goto L_0x0362;
    L_0x0041:
        r0 = r14;
        r0 = (org.jsoup.parser.af) r0;
        r3 = r0.l();
        r4 = org.jsoup.parser.z.p;
        r4 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r4 == 0) goto L_0x0173;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        r4 = 8;
        if (r0 >= r4) goto L_0x0871;
    L_0x0057:
        r4 = r15.k(r3);
        if (r4 != 0) goto L_0x0062;
    L_0x005d:
        r14 = r13.anyOtherEndTag(r14, r15);
        return r14;
    L_0x0062:
        r5 = r15.c(r4);
        if (r5 != 0) goto L_0x006f;
    L_0x0068:
        r15.b(r13);
    L_0x006b:
        r15.i(r4);
        return r1;
    L_0x006f:
        r5 = r4.nodeName();
        r5 = r15.e(r5);
        if (r5 != 0) goto L_0x007d;
    L_0x0079:
        r15.b(r13);
        return r2;
    L_0x007d:
        r5 = r15.y();
        if (r5 == r4) goto L_0x0086;
    L_0x0083:
        r15.b(r13);
    L_0x0086:
        r5 = r15.j();
        r6 = r5.size();
        r7 = 0;
        r10 = r7;
        r8 = 0;
        r9 = 0;
    L_0x0092:
        if (r8 >= r6) goto L_0x00b8;
    L_0x0094:
        r11 = 64;
        if (r8 >= r11) goto L_0x00b8;
    L_0x0098:
        r11 = r5.get(r8);
        r11 = (org.jsoup.nodes.Element) r11;
        if (r11 != r4) goto L_0x00ab;
    L_0x00a0:
        r9 = r8 + -1;
        r9 = r5.get(r9);
        r9 = (org.jsoup.nodes.Element) r9;
        r10 = r9;
        r9 = 1;
        goto L_0x00b5;
    L_0x00ab:
        if (r9 == 0) goto L_0x00b5;
    L_0x00ad:
        r12 = org.jsoup.parser.HtmlTreeBuilder.g(r11);
        if (r12 == 0) goto L_0x00b5;
    L_0x00b3:
        r7 = r11;
        goto L_0x00b8;
    L_0x00b5:
        r8 = r8 + 1;
        goto L_0x0092;
    L_0x00b8:
        if (r7 != 0) goto L_0x00c2;
    L_0x00ba:
        r14 = r4.nodeName();
        r15.c(r14);
        goto L_0x006b;
    L_0x00c2:
        r6 = r7;
        r8 = r6;
        r5 = 0;
    L_0x00c5:
        r9 = 3;
        if (r5 >= r9) goto L_0x0108;
    L_0x00c8:
        r9 = r15.c(r6);
        if (r9 == 0) goto L_0x00d2;
    L_0x00ce:
        r6 = r15.e(r6);
    L_0x00d2:
        r9 = r15.j(r6);
        if (r9 != 0) goto L_0x00dc;
    L_0x00d8:
        r15.d(r6);
        goto L_0x0105;
    L_0x00dc:
        if (r6 == r4) goto L_0x0108;
    L_0x00de:
        r9 = new org.jsoup.nodes.Element;
        r11 = r6.nodeName();
        r12 = org.jsoup.parser.ParseSettings.preserveCase;
        r11 = org.jsoup.parser.Tag.valueOf(r11, r12);
        r12 = r15.g();
        r9.<init>(r11, r12);
        r15.c(r6, r9);
        r15.b(r6, r9);
        r6 = r8.parent();
        if (r6 == 0) goto L_0x0100;
    L_0x00fd:
        r8.remove();
    L_0x0100:
        r9.appendChild(r8);
        r6 = r9;
        r8 = r6;
    L_0x0105:
        r5 = r5 + 1;
        goto L_0x00c5;
    L_0x0108:
        r5 = r10.nodeName();
        r6 = org.jsoup.parser.z.q;
        r5 = org.jsoup.helper.StringUtil.inSorted(r5, r6);
        if (r5 == 0) goto L_0x0123;
    L_0x0116:
        r5 = r8.parent();
        if (r5 == 0) goto L_0x011f;
    L_0x011c:
        r8.remove();
    L_0x011f:
        r15.a(r8);
        goto L_0x012f;
    L_0x0123:
        r5 = r8.parent();
        if (r5 == 0) goto L_0x012c;
    L_0x0129:
        r8.remove();
    L_0x012c:
        r10.appendChild(r8);
    L_0x012f:
        r5 = new org.jsoup.nodes.Element;
        r6 = r4.tag();
        r8 = r15.g();
        r5.<init>(r6, r8);
        r6 = r5.attributes();
        r8 = r4.attributes();
        r6.addAll(r8);
        r6 = r7.childNodes();
        r8 = r7.childNodeSize();
        r8 = new org.jsoup.nodes.Node[r8];
        r6 = r6.toArray(r8);
        r6 = (org.jsoup.nodes.Node[]) r6;
        r8 = r6.length;
        r9 = 0;
    L_0x0159:
        if (r9 >= r8) goto L_0x0163;
    L_0x015b:
        r10 = r6[r9];
        r5.appendChild(r10);
        r9 = r9 + 1;
        goto L_0x0159;
    L_0x0163:
        r7.appendChild(r5);
        r15.i(r4);
        r15.d(r4);
        r15.a(r7, r5);
        r0 = r0 + 1;
        goto L_0x0053;
    L_0x0173:
        r4 = org.jsoup.parser.z.o;
        r4 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r4 == 0) goto L_0x01a0;
    L_0x017d:
        r14 = r15.e(r3);
        if (r14 != 0) goto L_0x0187;
    L_0x0183:
        r15.b(r13);
        return r2;
    L_0x0187:
        r15.t();
        r14 = r15.y();
        r14 = r14.nodeName();
        r14 = r14.equals(r3);
        if (r14 != 0) goto L_0x019b;
    L_0x0198:
        r15.b(r13);
    L_0x019b:
        r15.c(r3);
        goto L_0x0871;
    L_0x01a0:
        r4 = "span";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x01ad;
    L_0x01a8:
        r14 = r13.anyOtherEndTag(r14, r15);
        return r14;
    L_0x01ad:
        r4 = "li";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x01d1;
    L_0x01b5:
        r14 = r15.f(r3);
        if (r14 != 0) goto L_0x01bf;
    L_0x01bb:
        r15.b(r13);
        return r2;
    L_0x01bf:
        r15.j(r3);
        r14 = r15.y();
        r14 = r14.nodeName();
        r14 = r14.equals(r3);
        if (r14 != 0) goto L_0x019b;
    L_0x01d0:
        goto L_0x0198;
    L_0x01d1:
        r4 = "body";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x01ec;
    L_0x01d9:
        r14 = "body";
        r14 = r15.e(r14);
        if (r14 != 0) goto L_0x01e5;
    L_0x01e1:
        r15.b(r13);
        return r2;
    L_0x01e5:
        r14 = AfterBody;
    L_0x01e7:
        r15.a(r14);
        goto L_0x0871;
    L_0x01ec:
        r4 = "html";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x0201;
    L_0x01f4:
        r14 = "body";
        r14 = r15.m(r14);
        if (r14 == 0) goto L_0x0871;
    L_0x01fc:
        r14 = r15.a(r0);
        return r14;
    L_0x0201:
        r4 = "form";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x0236;
    L_0x0209:
        r14 = r15.p();
        r15.q();
        if (r14 == 0) goto L_0x0232;
    L_0x0212:
        r0 = r15.e(r3);
        if (r0 != 0) goto L_0x0219;
    L_0x0218:
        goto L_0x0232;
    L_0x0219:
        r15.t();
        r0 = r15.y();
        r0 = r0.nodeName();
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x022d;
    L_0x022a:
        r15.b(r13);
    L_0x022d:
        r15.d(r14);
        goto L_0x0871;
    L_0x0232:
        r15.b(r13);
        return r2;
    L_0x0236:
        r4 = "p";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x0262;
    L_0x023e:
        r14 = r15.g(r3);
        if (r14 != 0) goto L_0x024f;
    L_0x0244:
        r15.b(r13);
        r15.l(r3);
        r14 = r15.a(r0);
        return r14;
    L_0x024f:
        r15.j(r3);
        r14 = r15.y();
        r14 = r14.nodeName();
        r14 = r14.equals(r3);
        if (r14 != 0) goto L_0x019b;
    L_0x0260:
        goto L_0x0198;
    L_0x0262:
        r0 = org.jsoup.parser.z.f;
        r0 = org.jsoup.helper.StringUtil.inSorted(r3, r0);
        if (r0 == 0) goto L_0x0289;
    L_0x026c:
        r14 = r15.e(r3);
        if (r14 != 0) goto L_0x0276;
    L_0x0272:
        r15.b(r13);
        return r2;
    L_0x0276:
        r15.j(r3);
        r14 = r15.y();
        r14 = r14.nodeName();
        r14 = r14.equals(r3);
        if (r14 != 0) goto L_0x019b;
    L_0x0287:
        goto L_0x0198;
    L_0x0289:
        r0 = org.jsoup.parser.z.c;
        r0 = org.jsoup.helper.StringUtil.inSorted(r3, r0);
        if (r0 == 0) goto L_0x02be;
    L_0x0293:
        r14 = org.jsoup.parser.z.c;
        r14 = r15.b(r14);
        if (r14 != 0) goto L_0x02a1;
    L_0x029d:
        r15.b(r13);
        return r2;
    L_0x02a1:
        r15.j(r3);
        r14 = r15.y();
        r14 = r14.nodeName();
        r14 = r14.equals(r3);
        if (r14 != 0) goto L_0x02b5;
    L_0x02b2:
        r15.b(r13);
    L_0x02b5:
        r14 = org.jsoup.parser.z.c;
        r15.a(r14);
        goto L_0x0871;
    L_0x02be:
        r0 = "sarcasm";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x02cb;
    L_0x02c6:
        r14 = r13.anyOtherEndTag(r14, r15);
        return r14;
    L_0x02cb:
        r0 = org.jsoup.parser.z.h;
        r0 = org.jsoup.helper.StringUtil.inSorted(r3, r0);
        if (r0 == 0) goto L_0x0303;
    L_0x02d5:
        r14 = "name";
        r14 = r15.e(r14);
        if (r14 != 0) goto L_0x0871;
    L_0x02dd:
        r14 = r15.e(r3);
        if (r14 != 0) goto L_0x02e7;
    L_0x02e3:
        r15.b(r13);
        return r2;
    L_0x02e7:
        r15.t();
        r14 = r15.y();
        r14 = r14.nodeName();
        r14 = r14.equals(r3);
        if (r14 != 0) goto L_0x02fb;
    L_0x02f8:
        r15.b(r13);
    L_0x02fb:
        r15.c(r3);
        r15.v();
        goto L_0x0871;
    L_0x0303:
        r0 = "br";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0314;
    L_0x030b:
        r15.b(r13);
        r14 = "br";
        r15.l(r14);
        return r2;
    L_0x0314:
        r14 = r13.anyOtherEndTag(r14, r15);
        return r14;
    L_0x0319:
        r0 = r14;
        r0 = (org.jsoup.parser.ag) r0;
        r3 = r0.l();
        r4 = "a";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x0352;
    L_0x0328:
        r14 = "a";
        r14 = r15.k(r14);
        if (r14 == 0) goto L_0x0346;
    L_0x0330:
        r15.b(r13);
        r14 = "a";
        r15.m(r14);
        r14 = "a";
        r14 = r15.b(r14);
        if (r14 == 0) goto L_0x0346;
    L_0x0340:
        r15.i(r14);
        r15.d(r14);
    L_0x0346:
        r15.u();
    L_0x0349:
        r14 = r15.a(r0);
        r15.h(r14);
        goto L_0x0871;
    L_0x0352:
        r4 = org.jsoup.parser.z.i;
        r4 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r4 == 0) goto L_0x0367;
    L_0x035c:
        r15.u();
    L_0x035f:
        r15.b(r0);
    L_0x0362:
        r15.a(r2);
        goto L_0x0871;
    L_0x0367:
        r4 = org.jsoup.parser.z.b;
        r4 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r4 == 0) goto L_0x0383;
    L_0x0371:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x037e;
    L_0x0379:
        r14 = "p";
        r15.m(r14);
    L_0x037e:
        r15.a(r0);
        goto L_0x0871;
    L_0x0383:
        r4 = "span";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x038f;
    L_0x038b:
        r15.u();
        goto L_0x037e;
    L_0x038f:
        r4 = "li";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x03dd;
    L_0x0397:
        r15.a(r2);
        r14 = r15.j();
        r2 = r14.size();
        r2 = r2 - r1;
    L_0x03a3:
        if (r2 <= 0) goto L_0x03d4;
    L_0x03a5:
        r3 = r14.get(r2);
        r3 = (org.jsoup.nodes.Element) r3;
        r4 = r3.nodeName();
        r5 = "li";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x03bd;
    L_0x03b7:
        r14 = "li";
        r15.m(r14);
        goto L_0x03d4;
    L_0x03bd:
        r4 = org.jsoup.parser.HtmlTreeBuilder.g(r3);
        if (r4 == 0) goto L_0x03d1;
    L_0x03c3:
        r3 = r3.nodeName();
        r4 = org.jsoup.parser.z.e;
        r3 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r3 == 0) goto L_0x03d4;
    L_0x03d1:
        r2 = r2 + -1;
        goto L_0x03a3;
    L_0x03d4:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x037e;
    L_0x03dc:
        goto L_0x0379;
    L_0x03dd:
        r4 = "html";
        r4 = r3.equals(r4);
        if (r4 == 0) goto L_0x0416;
    L_0x03e5:
        r15.b(r13);
        r14 = r15.j();
        r14 = r14.get(r2);
        r14 = (org.jsoup.nodes.Element) r14;
        r15 = r0.e;
        r15 = r15.iterator();
    L_0x03f8:
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x0871;
    L_0x03fe:
        r0 = r15.next();
        r0 = (org.jsoup.nodes.Attribute) r0;
        r2 = r0.getKey();
        r2 = r14.hasAttr(r2);
        if (r2 != 0) goto L_0x03f8;
    L_0x040e:
        r2 = r14.attributes();
        r2.put(r0);
        goto L_0x03f8;
    L_0x0416:
        r4 = org.jsoup.parser.z.a;
        r4 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r4 == 0) goto L_0x0427;
    L_0x0420:
        r0 = InHead;
        r14 = r15.a(r14, r0);
        return r14;
    L_0x0427:
        r14 = "body";
        r14 = r3.equals(r14);
        r4 = 2;
        if (r14 == 0) goto L_0x0484;
    L_0x0430:
        r15.b(r13);
        r14 = r15.j();
        r3 = r14.size();
        if (r3 == r1) goto L_0x0483;
    L_0x043d:
        r3 = r14.size();
        if (r3 <= r4) goto L_0x0456;
    L_0x0443:
        r3 = r14.get(r1);
        r3 = (org.jsoup.nodes.Element) r3;
        r3 = r3.nodeName();
        r4 = "body";
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x0456;
    L_0x0455:
        goto L_0x0483;
    L_0x0456:
        r15.a(r2);
        r14 = r14.get(r1);
        r14 = (org.jsoup.nodes.Element) r14;
        r15 = r0.e;
        r15 = r15.iterator();
    L_0x0465:
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x0871;
    L_0x046b:
        r0 = r15.next();
        r0 = (org.jsoup.nodes.Attribute) r0;
        r2 = r0.getKey();
        r2 = r14.hasAttr(r2);
        if (r2 != 0) goto L_0x0465;
    L_0x047b:
        r2 = r14.attributes();
        r2.put(r0);
        goto L_0x0465;
    L_0x0483:
        return r2;
    L_0x0484:
        r14 = "frameset";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x04df;
    L_0x048c:
        r15.b(r13);
        r14 = r15.j();
        r3 = r14.size();
        if (r3 == r1) goto L_0x04de;
    L_0x0499:
        r3 = r14.size();
        if (r3 <= r4) goto L_0x04b2;
    L_0x049f:
        r3 = r14.get(r1);
        r3 = (org.jsoup.nodes.Element) r3;
        r3 = r3.nodeName();
        r4 = "body";
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x04b2;
    L_0x04b1:
        goto L_0x04de;
    L_0x04b2:
        r3 = r15.e();
        if (r3 != 0) goto L_0x04b9;
    L_0x04b8:
        return r2;
    L_0x04b9:
        r2 = r14.get(r1);
        r2 = (org.jsoup.nodes.Element) r2;
        r3 = r2.parent();
        if (r3 == 0) goto L_0x04c8;
    L_0x04c5:
        r2.remove();
    L_0x04c8:
        r2 = r14.size();
        if (r2 <= r1) goto L_0x04d7;
    L_0x04ce:
        r2 = r14.size();
        r2 = r2 - r1;
        r14.remove(r2);
        goto L_0x04c8;
    L_0x04d7:
        r15.a(r0);
        r14 = InFrameset;
        goto L_0x01e7;
    L_0x04de:
        return r2;
    L_0x04df:
        r14 = org.jsoup.parser.z.c;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x0510;
    L_0x04e9:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x04f6;
    L_0x04f1:
        r14 = "p";
        r15.m(r14);
    L_0x04f6:
        r14 = r15.y();
        r14 = r14.nodeName();
        r2 = org.jsoup.parser.z.c;
        r14 = org.jsoup.helper.StringUtil.inSorted(r14, r2);
        if (r14 == 0) goto L_0x037e;
    L_0x0508:
        r15.b(r13);
        r15.i();
        goto L_0x037e;
    L_0x0510:
        r14 = org.jsoup.parser.z.d;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x052c;
    L_0x051a:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x0527;
    L_0x0522:
        r14 = "p";
        r15.m(r14);
    L_0x0527:
        r15.a(r0);
        goto L_0x0362;
    L_0x052c:
        r14 = "form";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0550;
    L_0x0534:
        r14 = r15.p();
        if (r14 == 0) goto L_0x053e;
    L_0x053a:
        r15.b(r13);
        return r2;
    L_0x053e:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x054b;
    L_0x0546:
        r14 = "p";
        r15.m(r14);
    L_0x054b:
        r15.a(r0, r1);
        goto L_0x0871;
    L_0x0550:
        r14 = org.jsoup.parser.z.f;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x05a5;
    L_0x055a:
        r15.a(r2);
        r14 = r15.j();
        r2 = r14.size();
        r2 = r2 - r1;
    L_0x0566:
        if (r2 <= 0) goto L_0x059b;
    L_0x0568:
        r3 = r14.get(r2);
        r3 = (org.jsoup.nodes.Element) r3;
        r4 = r3.nodeName();
        r5 = org.jsoup.parser.z.f;
        r4 = org.jsoup.helper.StringUtil.inSorted(r4, r5);
        if (r4 == 0) goto L_0x0584;
    L_0x057c:
        r14 = r3.nodeName();
        r15.m(r14);
        goto L_0x059b;
    L_0x0584:
        r4 = org.jsoup.parser.HtmlTreeBuilder.g(r3);
        if (r4 == 0) goto L_0x0598;
    L_0x058a:
        r3 = r3.nodeName();
        r4 = org.jsoup.parser.z.e;
        r3 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r3 == 0) goto L_0x059b;
    L_0x0598:
        r2 = r2 + -1;
        goto L_0x0566;
    L_0x059b:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x037e;
    L_0x05a3:
        goto L_0x0379;
    L_0x05a5:
        r14 = "plaintext";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x05c6;
    L_0x05ad:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x05ba;
    L_0x05b5:
        r14 = "p";
        r15.m(r14);
    L_0x05ba:
        r15.a(r0);
        r14 = r15.c;
        r15 = org.jsoup.parser.ak.PLAINTEXT;
        r14.a(r15);
        goto L_0x0871;
    L_0x05c6:
        r14 = "button";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x05e8;
    L_0x05ce:
        r14 = "button";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x05e3;
    L_0x05d6:
        r15.b(r13);
        r14 = "button";
        r15.m(r14);
        r15.a(r0);
        goto L_0x0871;
    L_0x05e3:
        r15.u();
        goto L_0x0527;
    L_0x05e8:
        r14 = org.jsoup.parser.z.g;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x05f4;
    L_0x05f2:
        goto L_0x0346;
    L_0x05f4:
        r14 = "nobr";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0611;
    L_0x05fc:
        r15.u();
        r14 = "nobr";
        r14 = r15.e(r14);
        if (r14 == 0) goto L_0x0349;
    L_0x0607:
        r15.b(r13);
        r14 = "nobr";
        r15.m(r14);
        goto L_0x0346;
    L_0x0611:
        r14 = org.jsoup.parser.z.h;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x0626;
    L_0x061b:
        r15.u();
        r15.a(r0);
        r15.w();
        goto L_0x0362;
    L_0x0626:
        r14 = "table";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0651;
    L_0x062e:
        r14 = r15.f();
        r14 = r14.quirksMode();
        r3 = org.jsoup.nodes.Document.QuirksMode.quirks;
        if (r14 == r3) goto L_0x0647;
    L_0x063a:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x0647;
    L_0x0642:
        r14 = "p";
        r15.m(r14);
    L_0x0647:
        r15.a(r0);
        r15.a(r2);
        r14 = InTable;
        goto L_0x01e7;
    L_0x0651:
        r14 = "input";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0670;
    L_0x0659:
        r15.u();
        r14 = r15.b(r0);
        r0 = "type";
        r14 = r14.attr(r0);
        r0 = "hidden";
        r14 = r14.equalsIgnoreCase(r0);
        if (r14 != 0) goto L_0x0871;
    L_0x066e:
        goto L_0x0362;
    L_0x0670:
        r14 = org.jsoup.parser.z.j;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x067f;
    L_0x067a:
        r15.b(r0);
        goto L_0x0871;
    L_0x067f:
        r14 = "hr";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0696;
    L_0x0687:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x035f;
    L_0x068f:
        r14 = "p";
        r15.m(r14);
        goto L_0x035f;
    L_0x0696:
        r14 = "image";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x06b1;
    L_0x069e:
        r14 = "svg";
        r14 = r15.b(r14);
        if (r14 != 0) goto L_0x037e;
    L_0x06a6:
        r14 = "img";
        r14 = r0.a(r14);
        r14 = r15.a(r14);
        return r14;
    L_0x06b1:
        r14 = "isindex";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0759;
    L_0x06b9:
        r15.b(r13);
        r14 = r15.p();
        if (r14 == 0) goto L_0x06c3;
    L_0x06c2:
        return r2;
    L_0x06c3:
        r14 = r15.c;
        r14.b();
        r14 = "form";
        r15.l(r14);
        r14 = r0.e;
        r2 = "action";
        r14 = r14.hasKey(r2);
        if (r14 == 0) goto L_0x06e8;
    L_0x06d7:
        r14 = r15.p();
        r2 = "action";
        r3 = r0.e;
        r4 = "action";
        r3 = r3.get(r4);
        r14.attr(r2, r3);
    L_0x06e8:
        r14 = "hr";
        r15.l(r14);
        r14 = "label";
        r15.l(r14);
        r14 = r0.e;
        r2 = "prompt";
        r14 = r14.hasKey(r2);
        if (r14 == 0) goto L_0x0705;
    L_0x06fc:
        r14 = r0.e;
        r2 = "prompt";
        r14 = r14.get(r2);
        goto L_0x0707;
    L_0x0705:
        r14 = "This is a searchable index. Enter search keywords: ";
    L_0x0707:
        r2 = new org.jsoup.parser.ab;
        r2.<init>();
        r14 = r2.a(r14);
        r15.a(r14);
        r14 = new org.jsoup.nodes.Attributes;
        r14.<init>();
        r0 = r0.e;
        r0 = r0.iterator();
    L_0x071e:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x073c;
    L_0x0724:
        r2 = r0.next();
        r2 = (org.jsoup.nodes.Attribute) r2;
        r3 = r2.getKey();
        r4 = org.jsoup.parser.z.k;
        r3 = org.jsoup.helper.StringUtil.inSorted(r3, r4);
        if (r3 != 0) goto L_0x071e;
    L_0x0738:
        r14.put(r2);
        goto L_0x071e;
    L_0x073c:
        r0 = "name";
        r2 = "isindex";
        r14.put(r0, r2);
        r0 = "input";
        r15.processStartTag(r0, r14);
        r14 = "label";
        r15.m(r14);
        r14 = "hr";
        r15.l(r14);
        r14 = "form";
        r15.m(r14);
        goto L_0x0871;
    L_0x0759:
        r14 = "textarea";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0775;
    L_0x0761:
        r15.a(r0);
        r14 = r15.c;
        r0 = org.jsoup.parser.ak.Rcdata;
        r14.a(r0);
        r15.c();
        r15.a(r2);
        r14 = Text;
        goto L_0x01e7;
    L_0x0775:
        r14 = "xmp";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0795;
    L_0x077d:
        r14 = "p";
        r14 = r15.g(r14);
        if (r14 == 0) goto L_0x078a;
    L_0x0785:
        r14 = "p";
        r15.m(r14);
    L_0x078a:
        r15.u();
    L_0x078d:
        r15.a(r2);
    L_0x0790:
        org.jsoup.parser.a.handleRawtext(r0, r15);
        goto L_0x0871;
    L_0x0795:
        r14 = "iframe";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x079e;
    L_0x079d:
        goto L_0x078d;
    L_0x079e:
        r14 = "noembed";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x07a7;
    L_0x07a6:
        goto L_0x0790;
    L_0x07a7:
        r14 = "select";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x07ed;
    L_0x07af:
        r15.u();
        r15.a(r0);
        r15.a(r2);
        r14 = r15.b();
        r0 = InTable;
        r0 = r14.equals(r0);
        if (r0 != 0) goto L_0x07e9;
    L_0x07c4:
        r0 = InCaption;
        r0 = r14.equals(r0);
        if (r0 != 0) goto L_0x07e9;
    L_0x07cc:
        r0 = InTableBody;
        r0 = r14.equals(r0);
        if (r0 != 0) goto L_0x07e9;
    L_0x07d4:
        r0 = InRow;
        r0 = r14.equals(r0);
        if (r0 != 0) goto L_0x07e9;
    L_0x07dc:
        r0 = InCell;
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x07e5;
    L_0x07e4:
        goto L_0x07e9;
    L_0x07e5:
        r14 = InSelect;
        goto L_0x01e7;
    L_0x07e9:
        r14 = InSelectInTable;
        goto L_0x01e7;
    L_0x07ed:
        r14 = org.jsoup.parser.z.l;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x080e;
    L_0x07f7:
        r14 = r15.y();
        r14 = r14.nodeName();
        r2 = "option";
        r14 = r14.equals(r2);
        if (r14 == 0) goto L_0x038b;
    L_0x0807:
        r14 = "option";
        r15.m(r14);
        goto L_0x038b;
    L_0x080e:
        r14 = org.jsoup.parser.z.m;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x083d;
    L_0x0818:
        r14 = "ruby";
        r14 = r15.e(r14);
        if (r14 == 0) goto L_0x0871;
    L_0x0820:
        r15.t();
        r14 = r15.y();
        r14 = r14.nodeName();
        r2 = "ruby";
        r14 = r14.equals(r2);
        if (r14 != 0) goto L_0x037e;
    L_0x0833:
        r15.b(r13);
        r14 = "ruby";
        r15.d(r14);
        goto L_0x037e;
    L_0x083d:
        r14 = "math";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x0851;
    L_0x0845:
        r15.u();
        r15.a(r0);
        r14 = r15.c;
        r14.b();
        goto L_0x0871;
    L_0x0851:
        r14 = "svg";
        r14 = r3.equals(r14);
        if (r14 == 0) goto L_0x085a;
    L_0x0859:
        goto L_0x0845;
    L_0x085a:
        r14 = org.jsoup.parser.z.n;
        r14 = org.jsoup.helper.StringUtil.inSorted(r3, r14);
        if (r14 == 0) goto L_0x038b;
    L_0x0864:
        r15.b(r13);
        return r2;
    L_0x0868:
        r15.b(r13);
        return r2;
    L_0x086c:
        r14 = (org.jsoup.parser.ac) r14;
        r15.a(r14);
    L_0x0871:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.w.process(org.jsoup.parser.aa, org.jsoup.parser.HtmlTreeBuilder):boolean");
    }
}
