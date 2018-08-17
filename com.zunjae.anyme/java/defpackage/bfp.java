package defpackage;

import java.io.Closeable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class bfp implements Closeable {
    static final Logger a = Logger.getLogger(bex.class.getName());
    final bev b = new bev(this.d);
    private final bhh c;
    private final bfq d = new bfq(this.c);
    private final boolean e;

    bfp(bhh bhh, boolean z) {
        this.c = bhh;
        this.e = z;
    }

    private static int a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw bex.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(s2));
    }

    static int a(bhh bhh) {
        return (bhh.h() & 255) | (((bhh.h() & 255) << 16) | ((bhh.h() & 255) << 8));
    }

    private List<bet> a(int i, short s, byte b, int i2) {
        bfq bfq = this.d;
        bfq.d = i;
        bfq.a = i;
        bfq.e = s;
        bfq.b = b;
        bfq.c = i2;
        this.b.a();
        return this.b.b();
    }

    private void a() {
        this.c.j();
        this.c.h();
    }

    public final void a(bfr bfr) {
        if (!this.e) {
            bhi d = this.c.d((long) bex.a.g());
            if (a.isLoggable(Level.FINE)) {
                a.fine(bdb.a("<< CONNECTION %s", d.e()));
            }
            if (!bex.a.equals(d)) {
                throw bex.b("Expected a connection header but was %s", d.a());
            }
        } else if (!a(true, bfr)) {
            throw bex.b("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public final boolean a(boolean r11, defpackage.bfr r12) {
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
        r10 = this;
        r0 = 0;
        r1 = r10.c;	 Catch:{ IOException -> 0x02b2 }
        r2 = 9;	 Catch:{ IOException -> 0x02b2 }
        r1.a(r2);	 Catch:{ IOException -> 0x02b2 }
        r1 = r10.c;
        r1 = defpackage.bfp.a(r1);
        r2 = 1;
        if (r1 < 0) goto L_0x02a3;
    L_0x0011:
        r3 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r1 > r3) goto L_0x02a3;
    L_0x0015:
        r4 = r10.c;
        r4 = r4.h();
        r4 = r4 & 255;
        r4 = (byte) r4;
        r5 = 4;
        if (r11 == 0) goto L_0x0033;
    L_0x0021:
        if (r4 != r5) goto L_0x0024;
    L_0x0023:
        goto L_0x0033;
    L_0x0024:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Byte.valueOf(r4);
        r11[r0] = r12;
        r12 = "Expected a SETTINGS frame but was %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x0033:
        r11 = r10.c;
        r11 = r11.h();
        r11 = r11 & 255;
        r11 = (byte) r11;
        r6 = r10.c;
        r6 = r6.j();
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r6 = r6 & r7;
        r8 = a;
        r9 = java.util.logging.Level.FINE;
        r8 = r8.isLoggable(r9);
        if (r8 == 0) goto L_0x0059;
    L_0x0050:
        r8 = a;
        r9 = defpackage.bex.a(r2, r6, r1, r4, r11);
        r8.fine(r9);
    L_0x0059:
        r8 = 8;
        switch(r4) {
            case 0: goto L_0x0263;
            case 1: goto L_0x022f;
            case 2: goto L_0x020d;
            case 3: goto L_0x01d1;
            case 4: goto L_0x0148;
            case 5: goto L_0x011a;
            case 6: goto L_0x00e9;
            case 7: goto L_0x009c;
            case 8: goto L_0x0066;
            default: goto L_0x005e;
        };
    L_0x005e:
        r11 = r10.c;
        r0 = (long) r1;
    L_0x0061:
        r11.h(r0);
        goto L_0x02a2;
    L_0x0066:
        if (r1 != r5) goto L_0x008d;
    L_0x0068:
        r11 = r10.c;
        r11 = r11.j();
        r3 = (long) r11;
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = r3 & r7;
        r7 = 0;
        r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r11 == 0) goto L_0x007e;
    L_0x0079:
        r12.a(r6, r3);
        goto L_0x02a2;
    L_0x007e:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Long.valueOf(r3);
        r11[r0] = r12;
        r12 = "windowSizeIncrement was 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x008d:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "TYPE_WINDOW_UPDATE length !=4: %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x009c:
        if (r1 < r8) goto L_0x00da;
    L_0x009e:
        if (r6 != 0) goto L_0x00d1;
    L_0x00a0:
        r11 = r10.c;
        r11 = r11.j();
        r3 = r10.c;
        r3 = r3.j();
        r1 = r1 - r8;
        r4 = defpackage.bes.fromHttp2(r3);
        if (r4 == 0) goto L_0x00c2;
    L_0x00b3:
        r0 = defpackage.bhi.b;
        if (r1 <= 0) goto L_0x00bd;
    L_0x00b7:
        r0 = r10.c;
        r3 = (long) r1;
        r0.d(r3);
    L_0x00bd:
        r12.a(r11);
        goto L_0x02a2;
    L_0x00c2:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r3);
        r11[r0] = r12;
        r12 = "TYPE_GOAWAY unexpected error code: %d";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x00d1:
        r11 = new java.lang.Object[r0];
        r12 = "TYPE_GOAWAY streamId != 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x00da:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "TYPE_GOAWAY length < 8: %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x00e9:
        if (r1 != r8) goto L_0x010b;
    L_0x00eb:
        if (r6 != 0) goto L_0x0102;
    L_0x00ed:
        r1 = r10.c;
        r1 = r1.j();
        r3 = r10.c;
        r3 = r3.j();
        r11 = r11 & r2;
        if (r11 == 0) goto L_0x00fd;
    L_0x00fc:
        r0 = 1;
    L_0x00fd:
        r12.a(r0, r1, r3);
        goto L_0x02a2;
    L_0x0102:
        r11 = new java.lang.Object[r0];
        r12 = "TYPE_PING streamId != 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x010b:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "TYPE_PING length != 8: %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x011a:
        if (r6 == 0) goto L_0x013f;
    L_0x011c:
        r3 = r11 & 8;
        if (r3 == 0) goto L_0x0129;
    L_0x0120:
        r0 = r10.c;
        r0 = r0.h();
        r0 = r0 & 255;
        r0 = (short) r0;
    L_0x0129:
        r3 = r10.c;
        r3 = r3.j();
        r3 = r3 & r7;
        r1 = r1 + -4;
        r1 = defpackage.bfp.a(r1, r11, r0);
        r11 = r10.a(r1, r0, r11, r6);
        r12.a(r3, r11);
        goto L_0x02a2;
    L_0x013f:
        r11 = new java.lang.Object[r0];
        r12 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x0148:
        if (r6 != 0) goto L_0x01c8;
    L_0x014a:
        r11 = r11 & r2;
        if (r11 == 0) goto L_0x015a;
    L_0x014d:
        if (r1 != 0) goto L_0x0151;
    L_0x014f:
        goto L_0x02a2;
    L_0x0151:
        r11 = new java.lang.Object[r0];
        r12 = "FRAME_SIZE_ERROR ack frame should be empty!";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x015a:
        r11 = r1 % 6;
        if (r11 != 0) goto L_0x01b9;
    L_0x015e:
        r11 = new bgb;
        r11.<init>();
        r4 = 0;
    L_0x0164:
        if (r4 >= r1) goto L_0x01b4;
    L_0x0166:
        r6 = r10.c;
        r6 = r6.i();
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r7;
        r7 = r10.c;
        r7 = r7.j();
        switch(r6) {
            case 1: goto L_0x01ae;
            case 2: goto L_0x01a0;
            case 3: goto L_0x019e;
            case 4: goto L_0x0191;
            case 5: goto L_0x017a;
            default: goto L_0x0179;
        };
    L_0x0179:
        goto L_0x01ae;
    L_0x017a:
        if (r7 < r3) goto L_0x0182;
    L_0x017c:
        r8 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        if (r7 > r8) goto L_0x0182;
    L_0x0181:
        goto L_0x01ae;
    L_0x0182:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r7);
        r11[r0] = r12;
        r12 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x0191:
        r6 = 7;
        if (r7 < 0) goto L_0x0195;
    L_0x0194:
        goto L_0x01ae;
    L_0x0195:
        r11 = new java.lang.Object[r0];
        r12 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x019e:
        r6 = 4;
        goto L_0x01ae;
    L_0x01a0:
        if (r7 == 0) goto L_0x01ae;
    L_0x01a2:
        if (r7 != r2) goto L_0x01a5;
    L_0x01a4:
        goto L_0x01ae;
    L_0x01a5:
        r11 = new java.lang.Object[r0];
        r12 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x01ae:
        r11.a(r6, r7);
        r4 = r4 + 6;
        goto L_0x0164;
    L_0x01b4:
        r12.a(r11);
        goto L_0x02a2;
    L_0x01b9:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "TYPE_SETTINGS length %% 6 != 0: %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x01c8:
        r11 = new java.lang.Object[r0];
        r12 = "TYPE_SETTINGS streamId != 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x01d1:
        if (r1 != r5) goto L_0x01fe;
    L_0x01d3:
        if (r6 == 0) goto L_0x01f5;
    L_0x01d5:
        r11 = r10.c;
        r11 = r11.j();
        r1 = defpackage.bes.fromHttp2(r11);
        if (r1 == 0) goto L_0x01e6;
    L_0x01e1:
        r12.a(r6, r1);
        goto L_0x02a2;
    L_0x01e6:
        r12 = new java.lang.Object[r2];
        r11 = java.lang.Integer.valueOf(r11);
        r12[r0] = r11;
        r11 = "TYPE_RST_STREAM unexpected error code: %d";
        r11 = defpackage.bex.b(r11, r12);
        throw r11;
    L_0x01f5:
        r11 = new java.lang.Object[r0];
        r12 = "TYPE_RST_STREAM streamId == 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x01fe:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "TYPE_RST_STREAM length: %d != 4";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x020d:
        r11 = 5;
        if (r1 != r11) goto L_0x0220;
    L_0x0210:
        if (r6 == 0) goto L_0x0217;
    L_0x0212:
        r10.a();
        goto L_0x02a2;
    L_0x0217:
        r11 = new java.lang.Object[r0];
        r12 = "TYPE_PRIORITY streamId == 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x0220:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "TYPE_PRIORITY length: %d != 5";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x022f:
        if (r6 == 0) goto L_0x025a;
    L_0x0231:
        r3 = r11 & 1;
        if (r3 == 0) goto L_0x0237;
    L_0x0235:
        r3 = 1;
        goto L_0x0238;
    L_0x0237:
        r3 = 0;
    L_0x0238:
        r4 = r11 & 8;
        if (r4 == 0) goto L_0x0245;
    L_0x023c:
        r0 = r10.c;
        r0 = r0.h();
        r0 = r0 & 255;
        r0 = (short) r0;
    L_0x0245:
        r4 = r11 & 32;
        if (r4 == 0) goto L_0x024e;
    L_0x0249:
        r10.a();
        r1 = r1 + -5;
    L_0x024e:
        r1 = defpackage.bfp.a(r1, r11, r0);
        r11 = r10.a(r1, r0, r11, r6);
        r12.a(r3, r6, r11);
        goto L_0x02a2;
    L_0x025a:
        r11 = new java.lang.Object[r0];
        r12 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x0263:
        if (r6 == 0) goto L_0x0299;
    L_0x0265:
        r3 = r11 & 1;
        if (r3 == 0) goto L_0x026b;
    L_0x0269:
        r3 = 1;
        goto L_0x026c;
    L_0x026b:
        r3 = 0;
    L_0x026c:
        r4 = r11 & 32;
        if (r4 == 0) goto L_0x0272;
    L_0x0270:
        r4 = 1;
        goto L_0x0273;
    L_0x0272:
        r4 = 0;
    L_0x0273:
        if (r4 != 0) goto L_0x0290;
    L_0x0275:
        r4 = r11 & 8;
        if (r4 == 0) goto L_0x0282;
    L_0x0279:
        r0 = r10.c;
        r0 = r0.h();
        r0 = r0 & 255;
        r0 = (short) r0;
    L_0x0282:
        r11 = defpackage.bfp.a(r1, r11, r0);
        r1 = r10.c;
        r12.a(r3, r6, r1, r11);
        r11 = r10.c;
        r0 = (long) r0;
        goto L_0x0061;
    L_0x0290:
        r11 = new java.lang.Object[r0];
        r12 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x0299:
        r11 = new java.lang.Object[r0];
        r12 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x02a2:
        return r2;
    L_0x02a3:
        r11 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r1);
        r11[r0] = r12;
        r12 = "FRAME_SIZE_ERROR: %s";
        r11 = defpackage.bex.b(r12, r11);
        throw r11;
    L_0x02b2:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfp.a(boolean, bfr):boolean");
    }

    public final void close() {
        this.c.close();
    }
}
