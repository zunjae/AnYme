package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.io.OutputStream;

public final class eb {
    private int a;
    private int b;
    private Integer c = null;
    private int d;
    private int e = -1;
    private int f = 0;
    private boolean g = false;
    private OutputStream h;
    private Bitmap i;
    private byte[] j;
    private byte[] k;
    private int l;
    private byte[] m;
    private boolean[] n = new boolean[256];
    private int o = 7;
    private int p = -1;
    private boolean q = false;
    private boolean r = true;
    private boolean s = false;
    private int t = 10;
    private boolean u;

    private void a(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.h.write((byte) str.charAt(i));
        }
    }

    private int b(int i) {
        if (this.m == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        i = Color.blue(i);
        int length = this.m.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 16777216;
        while (i2 < length) {
            byte[] bArr = this.m;
            int i5 = i2 + 1;
            i2 = red - (bArr[i2] & 255);
            int i6 = i5 + 1;
            i5 = green - (bArr[i5] & 255);
            int i7 = i - (bArr[i6] & 255);
            i2 = ((i2 * i2) + (i5 * i5)) + (i7 * i7);
            i7 = i6 / 3;
            if (this.n[i7] && i2 < r5) {
                i4 = i2;
                i3 = i7;
            }
            i2 = i6 + 1;
        }
        return i3;
    }

    private void b() {
        byte[] bArr = this.j;
        int length = bArr.length;
        int i = length / 3;
        this.k = new byte[i];
        ed edVar = new ed(bArr, length, this.t);
        edVar.c();
        edVar.d();
        edVar.b();
        this.m = edVar.a();
        length = 0;
        while (true) {
            byte[] bArr2 = this.m;
            if (length >= bArr2.length) {
                break;
            }
            byte b = bArr2[length];
            int i2 = length + 2;
            bArr2[length] = bArr2[i2];
            bArr2[i2] = b;
            this.n[length / 3] = false;
            length += 3;
        }
        length = 0;
        int i3 = 0;
        while (length < i) {
            byte[] bArr3 = this.j;
            i2 = i3 + 1;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            i3 = edVar.a(bArr3[i3] & 255, bArr3[i2] & 255, bArr3[i4] & 255);
            this.n[i3] = true;
            this.k[length] = (byte) i3;
            length++;
            i3 = i5;
        }
        this.j = null;
        this.l = 8;
        this.o = 7;
        Integer num = this.c;
        if (num != null) {
            this.d = b(num.intValue());
            return;
        }
        if (this.u) {
            this.d = b(0);
        }
    }

    private void c() {
        OutputStream outputStream = this.h;
        byte[] bArr = this.m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.m.length;
        for (int i = 0; i < length; i++) {
            this.h.write(0);
        }
    }

    private void c(int i) {
        this.h.write(i & 255);
        this.h.write((i >> 8) & 255);
    }

    public final void a(int i) {
        this.f = Math.round(((float) i) / 10.0f);
    }

    public final boolean a() {
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
        r4 = this;
        r0 = r4.g;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r4.g = r1;
        r0 = 1;
        r2 = r4.h;	 Catch:{ IOException -> 0x0020 }
        r3 = 59;	 Catch:{ IOException -> 0x0020 }
        r2.write(r3);	 Catch:{ IOException -> 0x0020 }
        r2 = r4.h;	 Catch:{ IOException -> 0x0020 }
        r2.flush();	 Catch:{ IOException -> 0x0020 }
        r2 = r4.q;	 Catch:{ IOException -> 0x0020 }
        if (r2 == 0) goto L_0x001e;	 Catch:{ IOException -> 0x0020 }
    L_0x0019:
        r2 = r4.h;	 Catch:{ IOException -> 0x0020 }
        r2.close();	 Catch:{ IOException -> 0x0020 }
    L_0x001e:
        r2 = 1;
        goto L_0x0021;
    L_0x0020:
        r2 = 0;
    L_0x0021:
        r4.d = r1;
        r3 = 0;
        r4.h = r3;
        r4.i = r3;
        r4.j = r3;
        r4.k = r3;
        r4.m = r3;
        r4.q = r1;
        r4.r = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.a():boolean");
    }

    public final boolean a(android.graphics.Bitmap r14) {
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
        r13 = this;
        r0 = 0;
        if (r14 == 0) goto L_0x01b2;
    L_0x0003:
        r1 = r13.g;
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        goto L_0x01b2;
    L_0x0009:
        r1 = 1;
        r2 = r13.s;	 Catch:{ IOException -> 0x01b2 }
        r3 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;	 Catch:{ IOException -> 0x01b2 }
        if (r2 != 0) goto L_0x0034;	 Catch:{ IOException -> 0x01b2 }
    L_0x0010:
        r2 = r14.getWidth();	 Catch:{ IOException -> 0x01b2 }
        r4 = r14.getHeight();	 Catch:{ IOException -> 0x01b2 }
        r5 = r13.g;	 Catch:{ IOException -> 0x01b2 }
        if (r5 == 0) goto L_0x0020;	 Catch:{ IOException -> 0x01b2 }
    L_0x001c:
        r5 = r13.r;	 Catch:{ IOException -> 0x01b2 }
        if (r5 == 0) goto L_0x0034;	 Catch:{ IOException -> 0x01b2 }
    L_0x0020:
        r13.a = r2;	 Catch:{ IOException -> 0x01b2 }
        r13.b = r4;	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.a;	 Catch:{ IOException -> 0x01b2 }
        if (r2 > 0) goto L_0x002c;	 Catch:{ IOException -> 0x01b2 }
    L_0x0028:
        r2 = 320; // 0x140 float:4.48E-43 double:1.58E-321;	 Catch:{ IOException -> 0x01b2 }
        r13.a = r2;	 Catch:{ IOException -> 0x01b2 }
    L_0x002c:
        r2 = r13.b;	 Catch:{ IOException -> 0x01b2 }
        if (r2 > 0) goto L_0x0032;	 Catch:{ IOException -> 0x01b2 }
    L_0x0030:
        r13.b = r3;	 Catch:{ IOException -> 0x01b2 }
    L_0x0032:
        r13.s = r1;	 Catch:{ IOException -> 0x01b2 }
    L_0x0034:
        r13.i = r14;	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.i;	 Catch:{ IOException -> 0x01b2 }
        r10 = r14.getWidth();	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.i;	 Catch:{ IOException -> 0x01b2 }
        r11 = r14.getHeight();	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.a;	 Catch:{ IOException -> 0x01b2 }
        if (r10 != r14) goto L_0x004a;	 Catch:{ IOException -> 0x01b2 }
    L_0x0046:
        r14 = r13.b;	 Catch:{ IOException -> 0x01b2 }
        if (r11 == r14) goto L_0x0060;	 Catch:{ IOException -> 0x01b2 }
    L_0x004a:
        r14 = r13.a;	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.b;	 Catch:{ IOException -> 0x01b2 }
        r4 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x01b2 }
        r14 = android.graphics.Bitmap.createBitmap(r14, r2, r4);	 Catch:{ IOException -> 0x01b2 }
        r2 = new android.graphics.Canvas;	 Catch:{ IOException -> 0x01b2 }
        r2.<init>(r14);	 Catch:{ IOException -> 0x01b2 }
        r4 = 0;	 Catch:{ IOException -> 0x01b2 }
        r5 = 0;	 Catch:{ IOException -> 0x01b2 }
        r2.drawBitmap(r14, r5, r5, r4);	 Catch:{ IOException -> 0x01b2 }
        r13.i = r14;	 Catch:{ IOException -> 0x01b2 }
    L_0x0060:
        r14 = r10 * r11;	 Catch:{ IOException -> 0x01b2 }
        r14 = new int[r14];	 Catch:{ IOException -> 0x01b2 }
        r4 = r13.i;	 Catch:{ IOException -> 0x01b2 }
        r6 = 0;	 Catch:{ IOException -> 0x01b2 }
        r8 = 0;	 Catch:{ IOException -> 0x01b2 }
        r9 = 0;	 Catch:{ IOException -> 0x01b2 }
        r5 = r14;	 Catch:{ IOException -> 0x01b2 }
        r7 = r10;	 Catch:{ IOException -> 0x01b2 }
        r4.getPixels(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ IOException -> 0x01b2 }
        r2 = r14.length;	 Catch:{ IOException -> 0x01b2 }
        r4 = 3;	 Catch:{ IOException -> 0x01b2 }
        r2 = r2 * 3;	 Catch:{ IOException -> 0x01b2 }
        r2 = new byte[r2];	 Catch:{ IOException -> 0x01b2 }
        r13.j = r2;	 Catch:{ IOException -> 0x01b2 }
        r13.u = r0;	 Catch:{ IOException -> 0x01b2 }
        r2 = r14.length;	 Catch:{ IOException -> 0x01b2 }
        r5 = 0;	 Catch:{ IOException -> 0x01b2 }
        r6 = 0;	 Catch:{ IOException -> 0x01b2 }
        r7 = 0;	 Catch:{ IOException -> 0x01b2 }
    L_0x007c:
        r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ IOException -> 0x01b2 }
        if (r5 >= r2) goto L_0x00a7;	 Catch:{ IOException -> 0x01b2 }
    L_0x0080:
        r9 = r14[r5];	 Catch:{ IOException -> 0x01b2 }
        if (r9 != 0) goto L_0x0086;	 Catch:{ IOException -> 0x01b2 }
    L_0x0084:
        r6 = r6 + 1;	 Catch:{ IOException -> 0x01b2 }
    L_0x0086:
        r10 = r13.j;	 Catch:{ IOException -> 0x01b2 }
        r11 = r7 + 1;	 Catch:{ IOException -> 0x01b2 }
        r12 = r9 & 255;	 Catch:{ IOException -> 0x01b2 }
        r12 = (byte) r12;	 Catch:{ IOException -> 0x01b2 }
        r10[r7] = r12;	 Catch:{ IOException -> 0x01b2 }
        r7 = r13.j;	 Catch:{ IOException -> 0x01b2 }
        r10 = r11 + 1;	 Catch:{ IOException -> 0x01b2 }
        r12 = r9 >> 8;	 Catch:{ IOException -> 0x01b2 }
        r12 = r12 & r8;	 Catch:{ IOException -> 0x01b2 }
        r12 = (byte) r12;	 Catch:{ IOException -> 0x01b2 }
        r7[r11] = r12;	 Catch:{ IOException -> 0x01b2 }
        r7 = r13.j;	 Catch:{ IOException -> 0x01b2 }
        r11 = r10 + 1;	 Catch:{ IOException -> 0x01b2 }
        r9 = r9 >> 16;	 Catch:{ IOException -> 0x01b2 }
        r8 = r8 & r9;	 Catch:{ IOException -> 0x01b2 }
        r8 = (byte) r8;	 Catch:{ IOException -> 0x01b2 }
        r7[r10] = r8;	 Catch:{ IOException -> 0x01b2 }
        r5 = r5 + 1;
        r7 = r11;
        goto L_0x007c;
    L_0x00a7:
        r6 = r6 * 100;
        r5 = (double) r6;
        r9 = (double) r2;
        java.lang.Double.isNaN(r5);
        java.lang.Double.isNaN(r9);
        r5 = r5 / r9;
        r9 = 4616189618054758400; // 0x4010000000000000 float:0.0 double:4.0;
        r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r14 <= 0) goto L_0x00ba;
    L_0x00b8:
        r14 = 1;
        goto L_0x00bb;
    L_0x00ba:
        r14 = 0;
    L_0x00bb:
        r13.u = r14;	 Catch:{ IOException -> 0x01b2 }
        r14 = "AnimatedGifEncoder";	 Catch:{ IOException -> 0x01b2 }
        r14 = android.util.Log.isLoggable(r14, r4);	 Catch:{ IOException -> 0x01b2 }
        if (r14 == 0) goto L_0x00d4;	 Catch:{ IOException -> 0x01b2 }
    L_0x00c5:
        r14 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01b2 }
        r2 = "got pixels for frame with ";	 Catch:{ IOException -> 0x01b2 }
        r14.<init>(r2);	 Catch:{ IOException -> 0x01b2 }
        r14.append(r5);	 Catch:{ IOException -> 0x01b2 }
        r2 = "% transparent pixels";	 Catch:{ IOException -> 0x01b2 }
        r14.append(r2);	 Catch:{ IOException -> 0x01b2 }
    L_0x00d4:
        r13.b();	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.r;	 Catch:{ IOException -> 0x01b2 }
        r2 = 33;	 Catch:{ IOException -> 0x01b2 }
        if (r14 == 0) goto L_0x012a;	 Catch:{ IOException -> 0x01b2 }
    L_0x00dd:
        r14 = r13.a;	 Catch:{ IOException -> 0x01b2 }
        r13.c(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.b;	 Catch:{ IOException -> 0x01b2 }
        r13.c(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r5 = r13.o;	 Catch:{ IOException -> 0x01b2 }
        r3 = r3 | r5;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r3);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r0);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r0);	 Catch:{ IOException -> 0x01b2 }
        r13.c();	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.e;	 Catch:{ IOException -> 0x01b2 }
        if (r14 < 0) goto L_0x012a;	 Catch:{ IOException -> 0x01b2 }
    L_0x0100:
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r8);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r3 = 11;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r3);	 Catch:{ IOException -> 0x01b2 }
        r14 = "NETSCAPE2.0";	 Catch:{ IOException -> 0x01b2 }
        r13.a(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r4);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r1);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.e;	 Catch:{ IOException -> 0x01b2 }
        r13.c(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r0);	 Catch:{ IOException -> 0x01b2 }
    L_0x012a:
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r2 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r2 = 4;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.c;	 Catch:{ IOException -> 0x01b2 }
        r2 = 2;	 Catch:{ IOException -> 0x01b2 }
        if (r14 != 0) goto L_0x0148;	 Catch:{ IOException -> 0x01b2 }
    L_0x0141:
        r14 = r13.u;	 Catch:{ IOException -> 0x01b2 }
        if (r14 != 0) goto L_0x0148;	 Catch:{ IOException -> 0x01b2 }
    L_0x0145:
        r14 = 0;	 Catch:{ IOException -> 0x01b2 }
        r3 = 0;	 Catch:{ IOException -> 0x01b2 }
        goto L_0x014a;	 Catch:{ IOException -> 0x01b2 }
    L_0x0148:
        r14 = 2;	 Catch:{ IOException -> 0x01b2 }
        r3 = 1;	 Catch:{ IOException -> 0x01b2 }
    L_0x014a:
        r4 = r13.p;	 Catch:{ IOException -> 0x01b2 }
        if (r4 < 0) goto L_0x0152;	 Catch:{ IOException -> 0x01b2 }
    L_0x014e:
        r14 = r13.p;	 Catch:{ IOException -> 0x01b2 }
        r14 = r14 & 7;	 Catch:{ IOException -> 0x01b2 }
    L_0x0152:
        r14 = r14 << r2;	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14 = r14 | r0;	 Catch:{ IOException -> 0x01b2 }
        r14 = r14 | r0;	 Catch:{ IOException -> 0x01b2 }
        r14 = r14 | r3;	 Catch:{ IOException -> 0x01b2 }
        r2.write(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.f;	 Catch:{ IOException -> 0x01b2 }
        r13.c(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.d;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r0);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r2 = 44;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
        r13.c(r0);	 Catch:{ IOException -> 0x01b2 }
        r13.c(r0);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.a;	 Catch:{ IOException -> 0x01b2 }
        r13.c(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.b;	 Catch:{ IOException -> 0x01b2 }
        r13.c(r14);	 Catch:{ IOException -> 0x01b2 }
        r14 = r13.r;	 Catch:{ IOException -> 0x01b2 }
        if (r14 == 0) goto L_0x018d;	 Catch:{ IOException -> 0x01b2 }
    L_0x0187:
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r0);	 Catch:{ IOException -> 0x01b2 }
        goto L_0x0196;	 Catch:{ IOException -> 0x01b2 }
    L_0x018d:
        r14 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.o;	 Catch:{ IOException -> 0x01b2 }
        r2 = r2 | 128;	 Catch:{ IOException -> 0x01b2 }
        r14.write(r2);	 Catch:{ IOException -> 0x01b2 }
    L_0x0196:
        r14 = r13.r;	 Catch:{ IOException -> 0x01b2 }
        if (r14 != 0) goto L_0x019d;	 Catch:{ IOException -> 0x01b2 }
    L_0x019a:
        r13.c();	 Catch:{ IOException -> 0x01b2 }
    L_0x019d:
        r14 = new ec;	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.a;	 Catch:{ IOException -> 0x01b2 }
        r3 = r13.b;	 Catch:{ IOException -> 0x01b2 }
        r4 = r13.k;	 Catch:{ IOException -> 0x01b2 }
        r5 = r13.l;	 Catch:{ IOException -> 0x01b2 }
        r14.<init>(r2, r3, r4, r5);	 Catch:{ IOException -> 0x01b2 }
        r2 = r13.h;	 Catch:{ IOException -> 0x01b2 }
        r14.a(r2);	 Catch:{ IOException -> 0x01b2 }
        r13.r = r0;	 Catch:{ IOException -> 0x01b2 }
        r0 = 1;
    L_0x01b2:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.a(android.graphics.Bitmap):boolean");
    }

    public final boolean a(java.io.OutputStream r3) {
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
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 1;
        r2.q = r0;
        r2.h = r3;
        r3 = "GIF89a";	 Catch:{ IOException -> 0x000f }
        r2.a(r3);	 Catch:{ IOException -> 0x000f }
        r0 = 1;
    L_0x000f:
        r2.g = r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.a(java.io.OutputStream):boolean");
    }
}
