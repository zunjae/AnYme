package defpackage;

public final class bl {
    static boolean[] a = new boolean[3];

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(int r17, defpackage.be r18) {
        /*
        r0 = r18;
        r18.g();
        r1 = r0.r;
        r1 = r1.a();
        r2 = r0.s;
        r2 = r2.a();
        r3 = r0.t;
        r3 = r3.a();
        r4 = r0.u;
        r4 = r4.a();
        r5 = 8;
        r6 = r17 & 8;
        r7 = 0;
        r8 = 1;
        if (r6 != r5) goto L_0x0027;
    L_0x0025:
        r6 = 1;
        goto L_0x0028;
    L_0x0027:
        r6 = 0;
    L_0x0028:
        r9 = r0.B;
        r9 = r9[r7];
        r10 = defpackage.bg.c;
        if (r9 != r10) goto L_0x0038;
    L_0x0030:
        r9 = defpackage.bl.a(r0, r7);
        if (r9 == 0) goto L_0x0038;
    L_0x0036:
        r9 = 1;
        goto L_0x0039;
    L_0x0038:
        r9 = 0;
    L_0x0039:
        r10 = r1.g;
        r11 = 3;
        r12 = 4;
        r13 = 0;
        r14 = -1;
        r15 = 2;
        if (r10 == r12) goto L_0x0173;
    L_0x0042:
        r10 = r3.g;
        if (r10 == r12) goto L_0x0173;
    L_0x0046:
        r10 = r0.B;
        r10 = r10[r7];
        r7 = defpackage.bg.a;
        if (r10 == r7) goto L_0x00d1;
    L_0x004e:
        if (r9 == 0) goto L_0x0058;
    L_0x0050:
        r7 = r18.j();
        if (r7 != r5) goto L_0x0058;
    L_0x0056:
        goto L_0x00d1;
    L_0x0058:
        if (r9 == 0) goto L_0x0173;
    L_0x005a:
        r7 = r18.n();
        r1.g = r8;
        r3.g = r8;
        r9 = r0.r;
        r9 = r9.c;
        if (r9 != 0) goto L_0x0072;
    L_0x0068:
        r9 = r0.t;
        r9 = r9.c;
        if (r9 != 0) goto L_0x0072;
    L_0x006e:
        if (r6 == 0) goto L_0x00f0;
    L_0x0070:
        goto L_0x00e3;
    L_0x0072:
        r9 = r0.r;
        r9 = r9.c;
        if (r9 == 0) goto L_0x0081;
    L_0x0078:
        r9 = r0.t;
        r9 = r9.c;
        if (r9 != 0) goto L_0x0081;
    L_0x007e:
        if (r6 == 0) goto L_0x00f0;
    L_0x0080:
        goto L_0x00e3;
    L_0x0081:
        r9 = r0.r;
        r9 = r9.c;
        if (r9 != 0) goto L_0x0091;
    L_0x0087:
        r9 = r0.t;
        r9 = r9.c;
        if (r9 == 0) goto L_0x0091;
    L_0x008d:
        if (r6 == 0) goto L_0x012e;
    L_0x008f:
        goto L_0x0122;
    L_0x0091:
        r9 = r0.r;
        r9 = r9.c;
        if (r9 == 0) goto L_0x0173;
    L_0x0097:
        r9 = r0.t;
        r9 = r9.c;
        if (r9 == 0) goto L_0x0173;
    L_0x009d:
        if (r6 == 0) goto L_0x00ad;
    L_0x009f:
        r9 = r18.h();
        r9.a(r1);
        r9 = r18.h();
        r9.a(r3);
    L_0x00ad:
        r9 = r0.F;
        r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r9 != 0) goto L_0x00bf;
    L_0x00b3:
        r1.g = r11;
        r3.g = r11;
        r1.b(r3, r13);
        r3.b(r1, r13);
        goto L_0x0173;
    L_0x00bf:
        r1.g = r15;
        r3.g = r15;
        r9 = -r7;
        r9 = (float) r9;
        r1.b(r3, r9);
        r9 = (float) r7;
        r3.b(r1, r9);
        r0.h(r7);
        goto L_0x0173;
    L_0x00d1:
        r7 = r0.r;
        r7 = r7.c;
        if (r7 != 0) goto L_0x00f5;
    L_0x00d7:
        r7 = r0.t;
        r7 = r7.c;
        if (r7 != 0) goto L_0x00f5;
    L_0x00dd:
        r1.g = r8;
        r3.g = r8;
        if (r6 == 0) goto L_0x00ec;
    L_0x00e3:
        r7 = r18.h();
        r3.a(r1, r8, r7);
        goto L_0x0173;
    L_0x00ec:
        r7 = r18.n();
    L_0x00f0:
        r3.b(r1, r7);
        goto L_0x0173;
    L_0x00f5:
        r7 = r0.r;
        r7 = r7.c;
        if (r7 == 0) goto L_0x0108;
    L_0x00fb:
        r7 = r0.t;
        r7 = r7.c;
        if (r7 != 0) goto L_0x0108;
    L_0x0101:
        r1.g = r8;
        r3.g = r8;
        if (r6 == 0) goto L_0x00ec;
    L_0x0107:
        goto L_0x00e3;
    L_0x0108:
        r7 = r0.r;
        r7 = r7.c;
        if (r7 != 0) goto L_0x0133;
    L_0x010e:
        r7 = r0.t;
        r7 = r7.c;
        if (r7 == 0) goto L_0x0133;
    L_0x0114:
        r1.g = r8;
        r3.g = r8;
        r7 = r18.n();
        r7 = -r7;
        r1.b(r3, r7);
        if (r6 == 0) goto L_0x012a;
    L_0x0122:
        r7 = r18.h();
        r1.a(r3, r14, r7);
        goto L_0x0173;
    L_0x012a:
        r7 = r18.n();
    L_0x012e:
        r7 = -r7;
        r1.b(r3, r7);
        goto L_0x0173;
    L_0x0133:
        r7 = r0.r;
        r7 = r7.c;
        if (r7 == 0) goto L_0x0173;
    L_0x0139:
        r7 = r0.t;
        r7 = r7.c;
        if (r7 == 0) goto L_0x0173;
    L_0x013f:
        r1.g = r15;
        r3.g = r15;
        if (r6 == 0) goto L_0x0162;
    L_0x0145:
        r7 = r18.h();
        r7.a(r1);
        r7 = r18.h();
        r7.a(r3);
        r7 = r18.h();
        r1.b(r3, r14, r7);
        r7 = r18.h();
        r3.b(r1, r8, r7);
        goto L_0x0173;
    L_0x0162:
        r7 = r18.n();
        r7 = -r7;
        r7 = (float) r7;
        r1.b(r3, r7);
        r7 = r18.n();
        r7 = (float) r7;
        r3.b(r1, r7);
    L_0x0173:
        r1 = r0.B;
        r1 = r1[r8];
        r3 = defpackage.bg.c;
        if (r1 != r3) goto L_0x0184;
    L_0x017b:
        r1 = defpackage.bl.a(r0, r8);
        if (r1 == 0) goto L_0x0184;
    L_0x0181:
        r16 = 1;
        goto L_0x0186;
    L_0x0184:
        r16 = 0;
    L_0x0186:
        r1 = r2.g;
        if (r1 == r12) goto L_0x0333;
    L_0x018a:
        r1 = r4.g;
        if (r1 == r12) goto L_0x0333;
    L_0x018e:
        r1 = r0.B;
        r1 = r1[r8];
        r3 = defpackage.bg.a;
        if (r1 == r3) goto L_0x0247;
    L_0x0196:
        if (r16 == 0) goto L_0x01a0;
    L_0x0198:
        r1 = r18.j();
        if (r1 != r5) goto L_0x01a0;
    L_0x019e:
        goto L_0x0247;
    L_0x01a0:
        if (r16 == 0) goto L_0x0333;
    L_0x01a2:
        r1 = r18.p();
        r2.g = r8;
        r4.g = r8;
        r3 = r0.s;
        r3 = r3.c;
        if (r3 != 0) goto L_0x01c4;
    L_0x01b0:
        r3 = r0.u;
        r3 = r3.c;
        if (r3 != 0) goto L_0x01c4;
    L_0x01b6:
        if (r6 == 0) goto L_0x01c0;
    L_0x01b8:
        r0 = r18.i();
        r4.a(r2, r8, r0);
        return;
    L_0x01c0:
        r4.b(r2, r1);
        return;
    L_0x01c4:
        r3 = r0.s;
        r3 = r3.c;
        if (r3 == 0) goto L_0x01de;
    L_0x01ca:
        r3 = r0.u;
        r3 = r3.c;
        if (r3 != 0) goto L_0x01de;
    L_0x01d0:
        if (r6 == 0) goto L_0x01da;
    L_0x01d2:
        r0 = r18.i();
        r4.a(r2, r8, r0);
        return;
    L_0x01da:
        r4.b(r2, r1);
        return;
    L_0x01de:
        r3 = r0.s;
        r3 = r3.c;
        if (r3 != 0) goto L_0x01f9;
    L_0x01e4:
        r3 = r0.u;
        r3 = r3.c;
        if (r3 == 0) goto L_0x01f9;
    L_0x01ea:
        if (r6 == 0) goto L_0x01f4;
    L_0x01ec:
        r0 = r18.i();
        r2.a(r4, r14, r0);
        return;
    L_0x01f4:
        r0 = -r1;
        r2.b(r4, r0);
        return;
    L_0x01f9:
        r3 = r0.s;
        r3 = r3.c;
        if (r3 == 0) goto L_0x0333;
    L_0x01ff:
        r3 = r0.u;
        r3 = r3.c;
        if (r3 == 0) goto L_0x0333;
    L_0x0205:
        if (r6 == 0) goto L_0x0215;
    L_0x0207:
        r3 = r18.i();
        r3.a(r2);
        r3 = r18.h();
        r3.a(r4);
    L_0x0215:
        r3 = r0.F;
        r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r3 != 0) goto L_0x0226;
    L_0x021b:
        r2.g = r11;
        r4.g = r11;
        r2.b(r4, r13);
        r4.b(r2, r13);
        return;
    L_0x0226:
        r2.g = r15;
        r4.g = r15;
        r3 = -r1;
        r3 = (float) r3;
        r2.b(r4, r3);
        r3 = (float) r1;
        r4.b(r2, r3);
        r0.i(r1);
        r1 = r0.L;
        if (r1 <= 0) goto L_0x0333;
    L_0x023a:
        r1 = r0.v;
        r1 = r1.a();
        r0 = r0.L;
        r1.a(r2, r0);
        goto L_0x0333;
    L_0x0247:
        r1 = r0.s;
        r1 = r1.c;
        if (r1 != 0) goto L_0x0281;
    L_0x024d:
        r1 = r0.u;
        r1 = r1.c;
        if (r1 != 0) goto L_0x0281;
    L_0x0253:
        r2.g = r8;
        r4.g = r8;
        if (r6 == 0) goto L_0x0261;
    L_0x0259:
        r1 = r18.i();
        r4.a(r2, r8, r1);
        goto L_0x0268;
    L_0x0261:
        r1 = r18.p();
        r4.b(r2, r1);
    L_0x0268:
        r1 = r0.v;
        r3 = r1.c;
        if (r3 == 0) goto L_0x0333;
    L_0x026e:
        r1 = r1.a();
        r1.g = r8;
        r1 = r0.v;
        r1 = r1.a();
        r0 = r0.L;
        r0 = -r0;
        r2.a(r1, r0);
        return;
    L_0x0281:
        r1 = r0.s;
        r1 = r1.c;
        if (r1 == 0) goto L_0x02b2;
    L_0x0287:
        r1 = r0.u;
        r1 = r1.c;
        if (r1 != 0) goto L_0x02b2;
    L_0x028d:
        r2.g = r8;
        r4.g = r8;
        if (r6 == 0) goto L_0x029b;
    L_0x0293:
        r1 = r18.i();
        r4.a(r2, r8, r1);
        goto L_0x02a2;
    L_0x029b:
        r1 = r18.p();
        r4.b(r2, r1);
    L_0x02a2:
        r1 = r0.L;
        if (r1 <= 0) goto L_0x0333;
    L_0x02a6:
        r1 = r0.v;
        r1 = r1.a();
        r0 = r0.L;
        r1.a(r2, r0);
        return;
    L_0x02b2:
        r1 = r0.s;
        r1 = r1.c;
        if (r1 != 0) goto L_0x02e4;
    L_0x02b8:
        r1 = r0.u;
        r1 = r1.c;
        if (r1 == 0) goto L_0x02e4;
    L_0x02be:
        r2.g = r8;
        r4.g = r8;
        if (r6 == 0) goto L_0x02cc;
    L_0x02c4:
        r1 = r18.i();
        r2.a(r4, r14, r1);
        goto L_0x02d4;
    L_0x02cc:
        r1 = r18.p();
        r1 = -r1;
        r2.b(r4, r1);
    L_0x02d4:
        r1 = r0.L;
        if (r1 <= 0) goto L_0x0333;
    L_0x02d8:
        r1 = r0.v;
        r1 = r1.a();
        r0 = r0.L;
        r1.a(r2, r0);
        return;
    L_0x02e4:
        r1 = r0.s;
        r1 = r1.c;
        if (r1 == 0) goto L_0x0333;
    L_0x02ea:
        r1 = r0.u;
        r1 = r1.c;
        if (r1 == 0) goto L_0x0333;
    L_0x02f0:
        r2.g = r15;
        r4.g = r15;
        if (r6 == 0) goto L_0x0313;
    L_0x02f6:
        r1 = r18.i();
        r2.b(r4, r14, r1);
        r1 = r18.i();
        r4.b(r2, r8, r1);
        r1 = r18.i();
        r1.a(r2);
        r1 = r18.h();
        r1.a(r4);
        goto L_0x0324;
    L_0x0313:
        r1 = r18.p();
        r1 = -r1;
        r1 = (float) r1;
        r2.b(r4, r1);
        r1 = r18.p();
        r1 = (float) r1;
        r4.b(r2, r1);
    L_0x0324:
        r1 = r0.L;
        if (r1 <= 0) goto L_0x0333;
    L_0x0328:
        r1 = r0.v;
        r1 = r1.a();
        r0 = r0.L;
        r1.a(r2, r0);
    L_0x0333:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.a(int, be):void");
    }

    static void a(bh bhVar, ao aoVar, be beVar) {
        if (bhVar.B[0] != bg.b && beVar.B[0] == bg.d) {
            int i = beVar.r.d;
            int n = bhVar.n() - beVar.t.d;
            Object obj = beVar.r;
            obj.f = aoVar.a(obj);
            obj = beVar.t;
            obj.f = aoVar.a(obj);
            aoVar.a(beVar.r.f, i);
            aoVar.a(beVar.t.f, n);
            beVar.a = 2;
            beVar.c(i, n);
        }
        if (bhVar.B[1] != bg.b && beVar.B[1] == bg.d) {
            i = beVar.s.d;
            int p = bhVar.p() - beVar.u.d;
            Object obj2 = beVar.s;
            obj2.f = aoVar.a(obj2);
            obj2 = beVar.u;
            obj2.f = aoVar.a(obj2);
            aoVar.a(beVar.s.f, i);
            aoVar.a(beVar.u.f, p);
            if (beVar.L > 0 || beVar.j() == 8) {
                obj2 = beVar.v;
                obj2.f = aoVar.a(obj2);
                aoVar.a(beVar.v.f, beVar.L + i);
            }
            beVar.b = 2;
            beVar.d(i, p);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(defpackage.ao r22, int r23, int r24, defpackage.ay r25) {
        /*
        r0 = r22;
        r1 = r25;
        r2 = r1.a;
        r3 = r1.c;
        r4 = r1.b;
        r5 = r1.d;
        r6 = r1.e;
        r1 = r1.k;
        r7 = defpackage.bg.b;
        r7 = 2;
        r9 = 1;
        if (r23 != 0) goto L_0x002c;
    L_0x0016:
        r10 = r6.T;
        if (r10 != 0) goto L_0x001c;
    L_0x001a:
        r10 = 1;
        goto L_0x001d;
    L_0x001c:
        r10 = 0;
    L_0x001d:
        r11 = r6.T;
        if (r11 != r9) goto L_0x0023;
    L_0x0021:
        r11 = 1;
        goto L_0x0024;
    L_0x0023:
        r11 = 0;
    L_0x0024:
        r6 = r6.T;
        if (r6 != r7) goto L_0x002a;
    L_0x0028:
        r6 = 1;
        goto L_0x003f;
    L_0x002a:
        r6 = 0;
        goto L_0x003f;
    L_0x002c:
        r10 = r6.U;
        if (r10 != 0) goto L_0x0032;
    L_0x0030:
        r10 = 1;
        goto L_0x0033;
    L_0x0032:
        r10 = 0;
    L_0x0033:
        r11 = r6.U;
        if (r11 != r9) goto L_0x0039;
    L_0x0037:
        r11 = 1;
        goto L_0x003a;
    L_0x0039:
        r11 = 0;
    L_0x003a:
        r6 = r6.U;
        if (r6 != r7) goto L_0x002a;
    L_0x003e:
        goto L_0x0028;
    L_0x003f:
        r13 = r2;
        r7 = 0;
        r9 = 0;
        r12 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0045:
        if (r12 != 0) goto L_0x00e9;
    L_0x0047:
        r8 = r13.j();
        r16 = r12;
        r12 = 8;
        if (r8 == r12) goto L_0x0083;
    L_0x0051:
        r7 = r7 + 1;
        if (r23 != 0) goto L_0x005c;
    L_0x0055:
        r8 = r13.n();
    L_0x0059:
        r8 = (float) r8;
        r14 = r14 + r8;
        goto L_0x0061;
    L_0x005c:
        r8 = r13.p();
        goto L_0x0059;
    L_0x0061:
        if (r13 == r4) goto L_0x006d;
    L_0x0063:
        r8 = r13.z;
        r8 = r8[r24];
        r8 = r8.d();
        r8 = (float) r8;
        r14 = r14 + r8;
    L_0x006d:
        r8 = r13.z;
        r8 = r8[r24];
        r8 = r8.d();
        r8 = (float) r8;
        r15 = r15 + r8;
        r8 = r13.z;
        r17 = r24 + 1;
        r8 = r8[r17];
        r8 = r8.d();
        r8 = (float) r8;
        r15 = r15 + r8;
    L_0x0083:
        r8 = r13.j();
        if (r8 == r12) goto L_0x00b4;
    L_0x0089:
        r8 = r13.B;
        r8 = r8[r23];
        r12 = defpackage.bg.c;
        if (r8 != r12) goto L_0x00b4;
    L_0x0091:
        r9 = r9 + 1;
        if (r23 != 0) goto L_0x00a5;
    L_0x0095:
        r8 = r13.e;
        if (r8 == 0) goto L_0x009b;
    L_0x0099:
        r8 = 0;
        return r8;
    L_0x009b:
        r8 = 0;
        r12 = r13.h;
        if (r12 != 0) goto L_0x00a4;
    L_0x00a0:
        r12 = r13.i;
        if (r12 == 0) goto L_0x00b4;
    L_0x00a4:
        return r8;
    L_0x00a5:
        r8 = 0;
        r12 = r13.f;
        if (r12 == 0) goto L_0x00ab;
    L_0x00aa:
        return r8;
    L_0x00ab:
        r12 = r13.k;
        if (r12 != 0) goto L_0x00b3;
    L_0x00af:
        r12 = r13.l;
        if (r12 == 0) goto L_0x00b4;
    L_0x00b3:
        return r8;
    L_0x00b4:
        r8 = r13.z;
        r12 = r24 + 1;
        r8 = r8[r12];
        r8 = r8.c;
        if (r8 == 0) goto L_0x00d6;
    L_0x00be:
        r8 = r8.a;
        r12 = r8.z;
        r19 = r7;
        r7 = r12[r24];
        r7 = r7.c;
        if (r7 == 0) goto L_0x00d8;
    L_0x00ca:
        r7 = r12[r24];
        r7 = r7.c;
        r7 = r7.a;
        if (r7 == r13) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00d8;
    L_0x00d3:
        r18 = r8;
        goto L_0x00da;
    L_0x00d6:
        r19 = r7;
    L_0x00d8:
        r18 = 0;
    L_0x00da:
        if (r18 == 0) goto L_0x00e4;
    L_0x00dc:
        r12 = r16;
        r13 = r18;
        r7 = r19;
        goto L_0x0045;
    L_0x00e4:
        r7 = r19;
        r12 = 1;
        goto L_0x0045;
    L_0x00e9:
        r8 = r2.z;
        r8 = r8[r24];
        r8 = r8.a();
        r3 = r3.z;
        r12 = r24 + 1;
        r3 = r3[r12];
        r3 = r3.a();
        r20 = r2;
        r2 = r8.c;
        if (r2 == 0) goto L_0x032e;
    L_0x0101:
        r0 = r3.c;
        if (r0 != 0) goto L_0x0107;
    L_0x0105:
        goto L_0x032e;
    L_0x0107:
        r2 = r2.i;
        r21 = r1;
        r1 = 1;
        if (r2 == r1) goto L_0x0114;
    L_0x010e:
        r0 = r0.i;
        if (r0 == r1) goto L_0x0114;
    L_0x0112:
        r0 = 0;
        return r0;
    L_0x0114:
        r0 = 0;
        if (r9 <= 0) goto L_0x011a;
    L_0x0117:
        if (r9 == r7) goto L_0x011a;
    L_0x0119:
        return r0;
    L_0x011a:
        if (r6 != 0) goto L_0x0123;
    L_0x011c:
        if (r10 != 0) goto L_0x0123;
    L_0x011e:
        if (r11 == 0) goto L_0x0121;
    L_0x0120:
        goto L_0x0123;
    L_0x0121:
        r0 = 0;
        goto L_0x013c;
    L_0x0123:
        if (r4 == 0) goto L_0x012f;
    L_0x0125:
        r0 = r4.z;
        r0 = r0[r24];
        r0 = r0.d();
        r0 = (float) r0;
        goto L_0x0130;
    L_0x012f:
        r0 = 0;
    L_0x0130:
        if (r5 == 0) goto L_0x013c;
    L_0x0132:
        r1 = r5.z;
        r1 = r1[r12];
        r1 = r1.d();
        r1 = (float) r1;
        r0 = r0 + r1;
    L_0x013c:
        r1 = r8.c;
        r1 = r1.f;
        r2 = r3.c;
        r2 = r2.f;
        r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r3 >= 0) goto L_0x014b;
    L_0x0148:
        r2 = r2 - r1;
    L_0x0149:
        r2 = r2 - r14;
        goto L_0x014e;
    L_0x014b:
        r2 = r1 - r2;
        goto L_0x0149;
    L_0x014e:
        r16 = 1;
        if (r9 <= 0) goto L_0x0204;
    L_0x0152:
        if (r9 != r7) goto L_0x0204;
    L_0x0154:
        r3 = r13.C;
        if (r3 == 0) goto L_0x0162;
    L_0x0158:
        r3 = r3.B;
        r3 = r3[r23];
        r6 = defpackage.bg.b;
        if (r3 != r6) goto L_0x0162;
    L_0x0160:
        r3 = 0;
        return r3;
    L_0x0162:
        r2 = r2 + r14;
        r2 = r2 - r15;
        if (r10 == 0) goto L_0x0168;
    L_0x0166:
        r15 = r15 - r0;
        r2 = r2 - r15;
    L_0x0168:
        if (r10 == 0) goto L_0x0184;
    L_0x016a:
        r0 = r4.z;
        r0 = r0[r12];
        r0 = r0.d();
        r0 = (float) r0;
        r1 = r1 + r0;
        r0 = r4.Z;
        r0 = r0[r23];
        if (r0 == 0) goto L_0x0184;
    L_0x017a:
        r0 = r0.z;
        r0 = r0[r24];
        r0 = r0.d();
        r0 = (float) r0;
        r1 = r1 + r0;
    L_0x0184:
        if (r4 == 0) goto L_0x0202;
    L_0x0186:
        r0 = defpackage.ao.g;
        if (r0 == 0) goto L_0x019c;
    L_0x018a:
        r6 = r0.B;
        r6 = r6 - r16;
        r0.B = r6;
        r6 = r0.s;
        r6 = r6 + r16;
        r0.s = r6;
        r6 = r0.y;
        r6 = r6 + r16;
        r0.y = r6;
    L_0x019c:
        r0 = r4.Z;
        r0 = r0[r23];
        if (r0 != 0) goto L_0x01a9;
    L_0x01a2:
        if (r4 != r5) goto L_0x01a5;
    L_0x01a4:
        goto L_0x01a9;
    L_0x01a5:
        r6 = 0;
        r13 = r22;
        goto L_0x0200;
    L_0x01a9:
        r3 = (float) r9;
        r3 = r2 / r3;
        r6 = 0;
        r7 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1));
        if (r7 <= 0) goto L_0x01b9;
    L_0x01b1:
        r3 = r4.X;
        r3 = r3[r23];
        r3 = r3 * r2;
        r3 = r3 / r21;
    L_0x01b9:
        r7 = r4.z;
        r7 = r7[r24];
        r7 = r7.d();
        r7 = (float) r7;
        r1 = r1 + r7;
        r7 = r4.z;
        r7 = r7[r24];
        r7 = r7.a();
        r10 = r8.e;
        r7.a(r10, r1);
        r7 = r4.z;
        r7 = r7[r12];
        r7 = r7.a();
        r10 = r8.e;
        r1 = r1 + r3;
        r7.a(r10, r1);
        r3 = r4.z;
        r3 = r3[r24];
        r3 = r3.a();
        r13 = r22;
        r3.a(r13);
        r3 = r4.z;
        r3 = r3[r12];
        r3 = r3.a();
        r3.a(r13);
        r3 = r4.z;
        r3 = r3[r12];
        r3 = r3.d();
        r3 = (float) r3;
        r1 = r1 + r3;
    L_0x0200:
        r4 = r0;
        goto L_0x0184;
    L_0x0202:
        r0 = 1;
        return r0;
    L_0x0204:
        r13 = r22;
        r3 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r3 >= 0) goto L_0x020c;
    L_0x020a:
        r3 = 0;
        return r3;
    L_0x020c:
        if (r6 == 0) goto L_0x028d;
    L_0x020e:
        r2 = r2 - r0;
        r0 = r20;
        r0 = r0.P;
        r2 = r2 * r0;
        r1 = r1 + r2;
    L_0x0216:
        if (r4 == 0) goto L_0x028a;
    L_0x0218:
        r0 = defpackage.ao.g;
        if (r0 == 0) goto L_0x022e;
    L_0x021c:
        r2 = r0.B;
        r2 = r2 - r16;
        r0.B = r2;
        r2 = r0.s;
        r2 = r2 + r16;
        r0.s = r2;
        r2 = r0.y;
        r2 = r2 + r16;
        r0.y = r2;
    L_0x022e:
        r0 = r4.Z;
        r0 = r0[r23];
        if (r0 != 0) goto L_0x0236;
    L_0x0234:
        if (r4 != r5) goto L_0x0288;
    L_0x0236:
        if (r23 != 0) goto L_0x023e;
    L_0x0238:
        r2 = r4.n();
    L_0x023c:
        r2 = (float) r2;
        goto L_0x0243;
    L_0x023e:
        r2 = r4.p();
        goto L_0x023c;
    L_0x0243:
        r3 = r4.z;
        r3 = r3[r24];
        r3 = r3.d();
        r3 = (float) r3;
        r1 = r1 + r3;
        r3 = r4.z;
        r3 = r3[r24];
        r3 = r3.a();
        r6 = r8.e;
        r3.a(r6, r1);
        r3 = r4.z;
        r3 = r3[r12];
        r3 = r3.a();
        r6 = r8.e;
        r1 = r1 + r2;
        r3.a(r6, r1);
        r2 = r4.z;
        r2 = r2[r24];
        r2 = r2.a();
        r2.a(r13);
        r2 = r4.z;
        r2 = r2[r12];
        r2 = r2.a();
        r2.a(r13);
        r2 = r4.z;
        r2 = r2[r12];
        r2 = r2.d();
        r2 = (float) r2;
        r1 = r1 + r2;
    L_0x0288:
        r4 = r0;
        goto L_0x0216;
    L_0x028a:
        r0 = 1;
        goto L_0x032d;
    L_0x028d:
        if (r10 != 0) goto L_0x0291;
    L_0x028f:
        if (r11 == 0) goto L_0x028a;
    L_0x0291:
        if (r10 == 0) goto L_0x0295;
    L_0x0293:
        r2 = r2 - r0;
        goto L_0x0298;
    L_0x0295:
        if (r11 == 0) goto L_0x0298;
    L_0x0297:
        goto L_0x0293;
    L_0x0298:
        r0 = r7 + 1;
        r0 = (float) r0;
        r0 = r2 / r0;
        if (r11 == 0) goto L_0x02ab;
    L_0x029f:
        r3 = 1;
        if (r7 <= r3) goto L_0x02a8;
    L_0x02a2:
        r0 = r7 + -1;
        r0 = (float) r0;
    L_0x02a5:
        r0 = r2 / r0;
        goto L_0x02ab;
    L_0x02a8:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x02a5;
    L_0x02ab:
        r2 = r1 + r0;
        if (r11 == 0) goto L_0x02bc;
    L_0x02af:
        r3 = 1;
        if (r7 <= r3) goto L_0x02bc;
    L_0x02b2:
        r2 = r4.z;
        r2 = r2[r24];
        r2 = r2.d();
        r2 = (float) r2;
        r2 = r2 + r1;
    L_0x02bc:
        if (r10 == 0) goto L_0x02ca;
    L_0x02be:
        if (r4 == 0) goto L_0x02ca;
    L_0x02c0:
        r1 = r4.z;
        r1 = r1[r24];
        r1 = r1.d();
        r1 = (float) r1;
        r2 = r2 + r1;
    L_0x02ca:
        if (r4 == 0) goto L_0x028a;
    L_0x02cc:
        r1 = defpackage.ao.g;
        if (r1 == 0) goto L_0x02e2;
    L_0x02d0:
        r6 = r1.B;
        r6 = r6 - r16;
        r1.B = r6;
        r6 = r1.s;
        r6 = r6 + r16;
        r1.s = r6;
        r6 = r1.y;
        r6 = r6 + r16;
        r1.y = r6;
    L_0x02e2:
        r1 = r4.Z;
        r1 = r1[r23];
        if (r1 != 0) goto L_0x02ea;
    L_0x02e8:
        if (r4 != r5) goto L_0x032b;
    L_0x02ea:
        if (r23 != 0) goto L_0x02f2;
    L_0x02ec:
        r3 = r4.n();
    L_0x02f0:
        r3 = (float) r3;
        goto L_0x02f7;
    L_0x02f2:
        r3 = r4.p();
        goto L_0x02f0;
    L_0x02f7:
        r6 = r4.z;
        r6 = r6[r24];
        r6 = r6.a();
        r7 = r8.e;
        r6.a(r7, r2);
        r6 = r4.z;
        r6 = r6[r12];
        r6 = r6.a();
        r7 = r8.e;
        r9 = r2 + r3;
        r6.a(r7, r9);
        r6 = r4.z;
        r6 = r6[r24];
        r6 = r6.a();
        r6.a(r13);
        r4 = r4.z;
        r4 = r4[r12];
        r4 = r4.a();
        r4.a(r13);
        r3 = r3 + r0;
        r2 = r2 + r3;
    L_0x032b:
        r4 = r1;
        goto L_0x02ca;
    L_0x032d:
        return r0;
    L_0x032e:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.a(ao, int, int, ay):boolean");
    }

    private static boolean a(be beVar, int i) {
        int[] iArr = beVar.B;
        if (iArr[i] != bg.c) {
            return false;
        }
        int i2 = 1;
        if (beVar.F != 0.0f) {
            if (i != 0) {
                i2 = 0;
            }
            return iArr[i2] == bg.c ? false : false;
        } else {
            if (i == 0) {
                return beVar.e == 0 && beVar.h == 0 && beVar.i == 0;
            } else {
                if (beVar.f == 0 && beVar.k == 0) {
                    if (beVar.l != 0) {
                    }
                }
                return false;
            }
        }
    }
}
