package defpackage;

final class ed {
    protected int a;
    protected byte[] b;
    protected int c;
    protected int d;
    protected int[][] e;
    protected int[] f = new int[256];
    protected int[] g = new int[256];
    protected int[] h = new int[256];
    protected int[] i = new int[32];

    public ed(byte[] bArr, int i, int i2) {
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = new int[256][];
        for (i = 0; i < 256; i++) {
            int[][] iArr = this.e;
            iArr[i] = new int[4];
            int[] iArr2 = iArr[i];
            int i3 = (i << 12) / 256;
            iArr2[2] = i3;
            iArr2[1] = i3;
            iArr2[0] = i3;
            this.h[i] = 256;
            this.g[i] = 0;
        }
    }

    public final int a(int i, int i2, int i3) {
        int i4 = this.f[i2];
        int i5 = i4 - 1;
        int i6 = -1;
        int i7 = 1000;
        while (true) {
            if (i4 >= 256) {
                if (i5 < 0) {
                    return i6;
                }
            }
            if (i4 < 256) {
                int[] iArr = this.e[i4];
                int i8 = iArr[1] - i2;
                if (i8 >= i7) {
                    i4 = 256;
                } else {
                    i4++;
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    int i9 = iArr[0] - i;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    i8 += i9;
                    if (i8 < i7) {
                        i9 = iArr[2] - i3;
                        if (i9 < 0) {
                            i9 = -i9;
                        }
                        i8 += i9;
                        if (i8 < i7) {
                            i6 = iArr[3];
                            i7 = i8;
                        }
                    }
                }
            }
            if (i5 >= 0) {
                int[] iArr2 = this.e[i5];
                int i10 = i2 - iArr2[1];
                if (i10 >= i7) {
                    i5 = -1;
                } else {
                    i5--;
                    if (i10 < 0) {
                        i10 = -i10;
                    }
                    int i11 = iArr2[0] - i;
                    if (i11 < 0) {
                        i11 = -i11;
                    }
                    i10 += i11;
                    if (i10 < i7) {
                        int i12 = iArr2[2] - i3;
                        if (i12 < 0) {
                            i12 = -i12;
                        }
                        i12 += i10;
                        if (i12 < i7) {
                            i6 = iArr2[3];
                            i7 = i12;
                        }
                    }
                }
            }
        }
    }

    public final byte[] a() {
        int i;
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (i = 0; i < 256; i++) {
            iArr[this.e[i][3]] = i;
        }
        i = 0;
        int i2 = 0;
        while (i < 256) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            int[][] iArr2 = this.e;
            bArr[i2] = (byte) iArr2[i3][0];
            i2 = i4 + 1;
            bArr[i4] = (byte) iArr2[i3][1];
            i4 = i2 + 1;
            bArr[i2] = (byte) iArr2[i3][2];
            i++;
            i2 = i4;
        }
        return bArr;
    }

    public final void b() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 256) {
            int i4;
            int[] iArr = this.e[i];
            int i5 = i + 1;
            int i6 = i;
            int i7 = iArr[1];
            for (i4 = i5; i4 < 256; i4++) {
                int[] iArr2 = this.e[i4];
                if (iArr2[1] < i7) {
                    i7 = iArr2[1];
                    i6 = i4;
                }
            }
            int[] iArr3 = this.e[i6];
            if (i != i6) {
                i4 = iArr3[0];
                iArr3[0] = iArr[0];
                iArr[0] = i4;
                i4 = iArr3[1];
                iArr3[1] = iArr[1];
                iArr[1] = i4;
                i6 = iArr3[2];
                iArr3[2] = iArr[2];
                iArr[2] = i6;
                i6 = iArr3[3];
                iArr3[3] = iArr[3];
                iArr[3] = i6;
            }
            if (i7 != i2) {
                this.f[i2] = (i3 + i) >> 1;
                while (true) {
                    i2++;
                    if (i2 >= i7) {
                        break;
                    }
                    this.f[i2] = i;
                }
                i3 = i;
                i2 = i7;
            }
            i = i5;
        }
        this.f[i2] = (i3 + 255) >> 1;
        for (i2++; i2 < 256; i2++) {
            this.f[i2] = 255;
        }
    }

    public final void c() {
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
        r28 = this;
        r0 = r28;
        r1 = r0.c;
        r2 = 1509; // 0x5e5 float:2.115E-42 double:7.455E-321;
        r3 = 1;
        if (r1 >= r2) goto L_0x000b;
    L_0x0009:
        r0.d = r3;
    L_0x000b:
        r1 = r0.d;
        r4 = r1 + -1;
        r5 = 3;
        r4 = r4 / r5;
        r4 = r4 + 30;
        r0.a = r4;
        r4 = r0.b;
        r6 = r0.c;
        r1 = r1 * 3;
        r1 = r6 / r1;
        r7 = r1 / 100;
        r8 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r10 = 0;
    L_0x0022:
        r11 = 32;
        r12 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r13 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r10 >= r11) goto L_0x003a;
    L_0x002a:
        r11 = r0.i;
        r14 = r10 * r10;
        r14 = 1024 - r14;
        r14 = r14 * 256;
        r14 = r14 / r13;
        r14 = r14 * 1024;
        r11[r10] = r14;
        r10 = r10 + 1;
        goto L_0x0022;
    L_0x003a:
        r10 = r0.c;
        if (r10 >= r2) goto L_0x0040;
    L_0x003e:
        r2 = 3;
        goto L_0x0054;
    L_0x0040:
        r5 = r10 % 499;
        if (r5 == 0) goto L_0x0047;
    L_0x0044:
        r2 = 1497; // 0x5d9 float:2.098E-42 double:7.396E-321;
        goto L_0x0054;
    L_0x0047:
        r5 = r10 % 491;
        if (r5 == 0) goto L_0x004e;
    L_0x004b:
        r2 = 1473; // 0x5c1 float:2.064E-42 double:7.28E-321;
        goto L_0x0054;
    L_0x004e:
        r10 = r10 % 487;
        if (r10 == 0) goto L_0x0054;
    L_0x0052:
        r2 = 1461; // 0x5b5 float:2.047E-42 double:7.22E-321;
    L_0x0054:
        r14 = r7;
        r5 = 0;
        r7 = 0;
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r10 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
    L_0x005b:
        if (r5 >= r1) goto L_0x0204;
    L_0x005d:
        r15 = r7 + 0;
        r15 = r4[r15];
        r15 = r15 & 255;
        r15 = r15 << 4;
        r16 = r7 + 1;
        r13 = r4[r16];
        r13 = r13 & 255;
        r13 = r13 << 4;
        r16 = r7 + 2;
        r3 = r4[r16];
        r3 = r3 & 255;
        r3 = r3 << 4;
        r16 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r22 = r1;
        r23 = r4;
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r9 = 0;
        r16 = -1;
        r21 = -1;
    L_0x0087:
        r24 = 2;
        if (r9 >= r12) goto L_0x00db;
    L_0x008b:
        r12 = r0.e;
        r12 = r12[r9];
        r19 = 0;
        r25 = r12[r19];
        r26 = r10;
        r10 = r25 - r15;
        if (r10 >= 0) goto L_0x009a;
    L_0x0099:
        r10 = -r10;
    L_0x009a:
        r18 = 1;
        r25 = r12[r18];
        r27 = r14;
        r14 = r25 - r13;
        if (r14 >= 0) goto L_0x00a5;
    L_0x00a4:
        r14 = -r14;
    L_0x00a5:
        r10 = r10 + r14;
        r12 = r12[r24];
        r12 = r12 - r3;
        if (r12 >= 0) goto L_0x00ac;
    L_0x00ab:
        r12 = -r12;
    L_0x00ac:
        r10 = r10 + r12;
        if (r10 >= r1) goto L_0x00b2;
    L_0x00af:
        r16 = r9;
        r1 = r10;
    L_0x00b2:
        r12 = r0.g;
        r12 = r12[r9];
        r12 = r12 >> 12;
        r10 = r10 - r12;
        if (r10 >= r4) goto L_0x00be;
    L_0x00bb:
        r21 = r9;
        r4 = r10;
    L_0x00be:
        r10 = r0.h;
        r12 = r10[r9];
        r12 = r12 >> 10;
        r14 = r10[r9];
        r14 = r14 - r12;
        r10[r9] = r14;
        r10 = r0.g;
        r14 = r10[r9];
        r12 = r12 << 10;
        r14 = r14 + r12;
        r10[r9] = r14;
        r9 = r9 + 1;
        r10 = r26;
        r14 = r27;
        r12 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        goto L_0x0087;
    L_0x00db:
        r26 = r10;
        r27 = r14;
        r1 = r0.h;
        r4 = r1[r16];
        r4 = r4 + 64;
        r1[r16] = r4;
        r1 = r0.g;
        r4 = r1[r16];
        r9 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = r4 - r9;
        r1[r16] = r4;
        r1 = r0.e;
        r1 = r1[r21];
        r4 = 0;
        r9 = r1[r4];
        r10 = r1[r4];
        r10 = r10 - r15;
        r10 = r10 * r8;
        r12 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r10 = r10 / r12;
        r9 = r9 - r10;
        r1[r4] = r9;
        r4 = 1;
        r9 = r1[r4];
        r10 = r1[r4];
        r10 = r10 - r13;
        r10 = r10 * r8;
        r10 = r10 / r12;
        r9 = r9 - r10;
        r1[r4] = r9;
        r4 = r1[r24];
        r9 = r1[r24];
        r9 = r9 - r3;
        r9 = r9 * r8;
        r9 = r9 / r12;
        r4 = r4 - r9;
        r1[r24] = r4;
        if (r11 == 0) goto L_0x01b6;
    L_0x011b:
        r9 = r21 - r11;
        r1 = -1;
        if (r9 >= r1) goto L_0x0121;
    L_0x0120:
        goto L_0x0122;
    L_0x0121:
        r1 = r9;
    L_0x0122:
        r4 = r21 + r11;
        r9 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r4 <= r9) goto L_0x012a;
    L_0x0128:
        r4 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
    L_0x012a:
        r9 = r21 + 1;
        r21 = r21 + -1;
        r10 = r21;
        r14 = 1;
    L_0x0131:
        if (r9 < r4) goto L_0x0135;
    L_0x0133:
        if (r10 <= r1) goto L_0x01b6;
    L_0x0135:
        r12 = r0.i;
        r16 = r14 + 1;
        r12 = r12[r14];
        if (r9 >= r4) goto L_0x0173;
    L_0x013d:
        r14 = r0.e;
        r17 = r9 + 1;
        r9 = r14[r9];
        r14 = 0;
        r19 = r9[r14];	 Catch:{ Exception -> 0x0171 }
        r20 = r9[r14];	 Catch:{ Exception -> 0x0171 }
        r20 = r20 - r15;	 Catch:{ Exception -> 0x0171 }
        r20 = r20 * r12;	 Catch:{ Exception -> 0x0171 }
        r21 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;	 Catch:{ Exception -> 0x0171 }
        r20 = r20 / r21;	 Catch:{ Exception -> 0x0171 }
        r19 = r19 - r20;	 Catch:{ Exception -> 0x0171 }
        r9[r14] = r19;	 Catch:{ Exception -> 0x0171 }
        r14 = 1;	 Catch:{ Exception -> 0x0171 }
        r18 = r9[r14];	 Catch:{ Exception -> 0x0171 }
        r20 = r9[r14];	 Catch:{ Exception -> 0x0171 }
        r20 = r20 - r13;	 Catch:{ Exception -> 0x0171 }
        r20 = r20 * r12;	 Catch:{ Exception -> 0x0171 }
        r20 = r20 / r21;	 Catch:{ Exception -> 0x0171 }
        r18 = r18 - r20;	 Catch:{ Exception -> 0x0171 }
        r9[r14] = r18;	 Catch:{ Exception -> 0x0171 }
        r14 = r9[r24];	 Catch:{ Exception -> 0x0171 }
        r20 = r9[r24];	 Catch:{ Exception -> 0x0171 }
        r20 = r20 - r3;	 Catch:{ Exception -> 0x0171 }
        r20 = r20 * r12;	 Catch:{ Exception -> 0x0171 }
        r20 = r20 / r21;	 Catch:{ Exception -> 0x0171 }
        r14 = r14 - r20;	 Catch:{ Exception -> 0x0171 }
        r9[r24] = r14;	 Catch:{ Exception -> 0x0171 }
    L_0x0171:
        r9 = r17;
    L_0x0173:
        if (r10 <= r1) goto L_0x01ae;
    L_0x0175:
        r14 = r0.e;
        r17 = r10 + -1;
        r10 = r14[r10];
        r19 = 0;
        r14 = r10[r19];	 Catch:{ Exception -> 0x01a9 }
        r20 = r10[r19];	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 - r15;	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 * r12;	 Catch:{ Exception -> 0x01a9 }
        r21 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 / r21;	 Catch:{ Exception -> 0x01a9 }
        r14 = r14 - r20;	 Catch:{ Exception -> 0x01a9 }
        r10[r19] = r14;	 Catch:{ Exception -> 0x01a9 }
        r14 = 1;	 Catch:{ Exception -> 0x01a9 }
        r18 = r10[r14];	 Catch:{ Exception -> 0x01a9 }
        r20 = r10[r14];	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 - r13;	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 * r12;	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 / r21;	 Catch:{ Exception -> 0x01a9 }
        r18 = r18 - r20;	 Catch:{ Exception -> 0x01a9 }
        r10[r14] = r18;	 Catch:{ Exception -> 0x01a9 }
        r14 = r10[r24];	 Catch:{ Exception -> 0x01a9 }
        r20 = r10[r24];	 Catch:{ Exception -> 0x01a9 }
        r20 = r20 - r3;	 Catch:{ Exception -> 0x01a9 }
        r12 = r12 * r20;	 Catch:{ Exception -> 0x01a9 }
        r12 = r12 / r21;	 Catch:{ Exception -> 0x01a9 }
        r14 = r14 - r12;	 Catch:{ Exception -> 0x01a9 }
        r10[r24] = r14;	 Catch:{ Exception -> 0x01a9 }
    L_0x01a9:
        r14 = r16;
        r10 = r17;
        goto L_0x01b2;
    L_0x01ae:
        r19 = 0;
        r14 = r16;
    L_0x01b2:
        r12 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        goto L_0x0131;
    L_0x01b6:
        r19 = 0;
        r7 = r7 + r2;
        if (r7 < r6) goto L_0x01be;
    L_0x01bb:
        r1 = r0.c;
        r7 = r7 - r1;
    L_0x01be:
        r5 = r5 + 1;
        if (r27 != 0) goto L_0x01c4;
    L_0x01c2:
        r14 = 1;
        goto L_0x01c6;
    L_0x01c4:
        r14 = r27;
    L_0x01c6:
        r1 = r5 % r14;
        if (r1 != 0) goto L_0x01f7;
    L_0x01ca:
        r1 = r0.a;
        r1 = r8 / r1;
        r8 = r8 - r1;
        r10 = r26 / 30;
        r10 = r26 - r10;
        r9 = r10 >> 6;
        r1 = 1;
        if (r9 > r1) goto L_0x01da;
    L_0x01d8:
        r11 = 0;
        goto L_0x01db;
    L_0x01da:
        r11 = r9;
    L_0x01db:
        r3 = 0;
    L_0x01dc:
        if (r3 >= r11) goto L_0x01f2;
    L_0x01de:
        r4 = r0.i;
        r9 = r11 * r11;
        r12 = r3 * r3;
        r12 = r9 - r12;
        r13 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r12 = r12 * 256;
        r12 = r12 / r9;
        r12 = r12 * r8;
        r4[r3] = r12;
        r3 = r3 + 1;
        goto L_0x01dc;
    L_0x01f2:
        r1 = r22;
        r4 = r23;
        goto L_0x01fd;
    L_0x01f7:
        r1 = r22;
        r4 = r23;
        r10 = r26;
    L_0x01fd:
        r3 = 1;
        r12 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r13 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        goto L_0x005b;
    L_0x0204:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.c():void");
    }

    public final void d() {
        for (int i = 0; i < 256; i++) {
            int[][] iArr = this.e;
            int[] iArr2 = iArr[i];
            iArr2[0] = iArr2[0] >> 4;
            iArr2 = iArr[i];
            iArr2[1] = iArr2[1] >> 4;
            iArr2 = iArr[i];
            iArr2[2] = iArr2[2] >> 4;
            iArr[i][3] = i;
        }
    }
}
