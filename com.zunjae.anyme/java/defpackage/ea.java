package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class ea {
    private final byte[] a = new byte[256];
    private ByteBuffer b;
    private dz c;
    private int d = 0;

    private int[] a(int r10) {
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
        r9 = this;
        r0 = r10 * 3;
        r0 = new byte[r0];
        r1 = r9.b;	 Catch:{ BufferUnderflowException -> 0x0033 }
        r1.get(r0);	 Catch:{ BufferUnderflowException -> 0x0033 }
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ BufferUnderflowException -> 0x0033 }
        r1 = new int[r1];	 Catch:{ BufferUnderflowException -> 0x0033 }
        r2 = 0;
        r3 = 0;
    L_0x000f:
        if (r2 >= r10) goto L_0x003a;
    L_0x0011:
        r4 = r3 + 1;
        r3 = r0[r3];	 Catch:{ BufferUnderflowException -> 0x0035 }
        r3 = r3 & 255;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r5 = r4 + 1;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r4 = r0[r4];	 Catch:{ BufferUnderflowException -> 0x0035 }
        r4 = r4 & 255;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r6 = r5 + 1;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r5 = r0[r5];	 Catch:{ BufferUnderflowException -> 0x0035 }
        r5 = r5 & 255;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r7 = r2 + 1;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r8 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r3 = r3 << 16;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r3 = r3 | r8;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r4 = r4 << 8;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r3 = r3 | r4;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r3 = r3 | r5;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r1[r2] = r3;	 Catch:{ BufferUnderflowException -> 0x0035 }
        r3 = r6;
        r2 = r7;
        goto L_0x000f;
    L_0x0033:
        r10 = 0;
        r1 = r10;
    L_0x0035:
        r10 = r9.c;
        r0 = 1;
        r10.b = r0;
    L_0x003a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.a(int):int[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r9 = this;
        r0 = 0;
        r1 = 1;
        r2 = 0;
    L_0x0003:
        if (r2 != 0) goto L_0x014b;
    L_0x0005:
        r3 = r9.i();
        if (r3 != 0) goto L_0x014b;
    L_0x000b:
        r3 = r9.h();
        r4 = 33;
        if (r3 == r4) goto L_0x00bd;
    L_0x0013:
        r4 = 44;
        if (r3 == r4) goto L_0x0022;
    L_0x0017:
        r4 = 59;
        if (r3 == r4) goto L_0x0020;
    L_0x001b:
        r3 = r9.c;
        r3.b = r1;
        goto L_0x0003;
    L_0x0020:
        r2 = 1;
        goto L_0x0003;
    L_0x0022:
        r3 = r9.c;
        r4 = r3.d;
        if (r4 != 0) goto L_0x002f;
    L_0x0028:
        r4 = new dy;
        r4.<init>();
        r3.d = r4;
    L_0x002f:
        r3 = r9.c;
        r3 = r3.d;
        r4 = r9.b;
        r4 = r4.getShort();
        r3.a = r4;
        r3 = r9.c;
        r3 = r3.d;
        r4 = r9.b;
        r4 = r4.getShort();
        r3.b = r4;
        r3 = r9.c;
        r3 = r3.d;
        r4 = r9.b;
        r4 = r4.getShort();
        r3.c = r4;
        r3 = r9.c;
        r3 = r3.d;
        r4 = r9.b;
        r4 = r4.getShort();
        r3.d = r4;
        r3 = r9.h();
        r4 = r3 & 128;
        if (r4 == 0) goto L_0x0069;
    L_0x0067:
        r4 = 1;
        goto L_0x006a;
    L_0x0069:
        r4 = 0;
    L_0x006a:
        r5 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r7 = r3 & 7;
        r7 = r7 + r1;
        r7 = (double) r7;
        r5 = java.lang.Math.pow(r5, r7);
        r5 = (int) r5;
        r6 = r9.c;
        r6 = r6.d;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x007f;
    L_0x007d:
        r3 = 1;
        goto L_0x0080;
    L_0x007f:
        r3 = 0;
    L_0x0080:
        r6.e = r3;
        if (r4 == 0) goto L_0x008f;
    L_0x0084:
        r3 = r9.c;
        r3 = r3.d;
        r4 = r9.a(r5);
    L_0x008c:
        r3.k = r4;
        goto L_0x0095;
    L_0x008f:
        r3 = r9.c;
        r3 = r3.d;
        r4 = 0;
        goto L_0x008c;
    L_0x0095:
        r3 = r9.c;
        r3 = r3.d;
        r4 = r9.b;
        r4 = r4.position();
        r3.j = r4;
        r9.h();
        r9.f();
        r3 = r9.i();
        if (r3 != 0) goto L_0x0003;
    L_0x00ad:
        r3 = r9.c;
        r4 = r3.c;
        r4 = r4 + r1;
        r3.c = r4;
        r4 = r3.e;
        r3 = r3.d;
        r4.add(r3);
        goto L_0x0003;
    L_0x00bd:
        r3 = r9.h();
        if (r3 == r1) goto L_0x00ca;
    L_0x00c3:
        r4 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        if (r3 == r4) goto L_0x00fe;
    L_0x00c7:
        switch(r3) {
            case 254: goto L_0x00ca;
            case 255: goto L_0x00cf;
            default: goto L_0x00ca;
        };
    L_0x00ca:
        r9.f();
        goto L_0x0003;
    L_0x00cf:
        r9.g();
        r3 = "";
        r4 = r3;
        r3 = 0;
    L_0x00d6:
        r5 = 11;
        if (r3 >= r5) goto L_0x00f1;
    L_0x00da:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r4);
        r4 = r9.a;
        r4 = r4[r3];
        r4 = (char) r4;
        r5.append(r4);
        r4 = r5.toString();
        r3 = r3 + 1;
        goto L_0x00d6;
    L_0x00f1:
        r3 = "NETSCAPE2.0";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x00ca;
    L_0x00f9:
        r9.d();
        goto L_0x0003;
    L_0x00fe:
        r3 = r9.c;
        r4 = new dy;
        r4.<init>();
        r3.d = r4;
        r9.h();
        r3 = r9.h();
        r4 = r9.c;
        r4 = r4.d;
        r5 = r3 & 28;
        r5 = r5 >> 2;
        r4.g = r5;
        r5 = r4.g;
        if (r5 != 0) goto L_0x011e;
    L_0x011c:
        r4.g = r1;
    L_0x011e:
        r4 = r9.c;
        r4 = r4.d;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x0128;
    L_0x0126:
        r3 = 1;
        goto L_0x0129;
    L_0x0128:
        r3 = 0;
    L_0x0129:
        r4.f = r3;
        r3 = r9.b;
        r3 = r3.getShort();
        r4 = 3;
        r5 = 10;
        if (r3 >= r4) goto L_0x0138;
    L_0x0136:
        r3 = 10;
    L_0x0138:
        r4 = r9.c;
        r4 = r4.d;
        r3 = r3 * 10;
        r4.i = r3;
        r3 = r9.h();
        r4.h = r3;
        r9.h();
        goto L_0x0003;
    L_0x014b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.c():void");
    }

    private void d() {
        do {
            g();
            byte[] bArr = this.a;
            if (bArr[0] == (byte) 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!i());
    }

    private void e() {
        int i;
        boolean z = false;
        String str = BuildConfig.FLAVOR;
        for (i = 0; i < 6; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append((char) h());
            str = stringBuilder.toString();
        }
        if (str.startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            i = h();
            dz dzVar = this.c;
            if ((i & 128) != 0) {
                z = true;
            }
            dzVar.h = z;
            dz dzVar2 = this.c;
            dzVar2.i = 2 << (i & 7);
            dzVar2.j = h();
            this.c.k = h();
            if (this.c.h && !i()) {
                dz dzVar3 = this.c;
                dzVar3.a = a(dzVar3.i);
                dzVar3 = this.c;
                dzVar3.l = dzVar3.a[dzVar3.j];
            }
            return;
        }
        this.c.b = 1;
    }

    private void f() {
        int h;
        do {
            h = h();
            ByteBuffer byteBuffer = this.b;
            byteBuffer.position(byteBuffer.position() + h);
        } while (h > 0);
    }

    private int g() {
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
        r0 = r4.h();
        r4.d = r0;
        r0 = r4.d;
        r1 = 0;
        if (r0 <= 0) goto L_0x0047;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        r2 = r4.d;	 Catch:{ Exception -> 0x001d }
        if (r1 >= r2) goto L_0x0047;	 Catch:{ Exception -> 0x001d }
    L_0x0010:
        r2 = r4.d;	 Catch:{ Exception -> 0x001d }
        r0 = r2 - r1;	 Catch:{ Exception -> 0x001d }
        r2 = r4.b;	 Catch:{ Exception -> 0x001d }
        r3 = r4.a;	 Catch:{ Exception -> 0x001d }
        r2.get(r3, r1, r0);	 Catch:{ Exception -> 0x001d }
        r1 = r1 + r0;
        goto L_0x000c;
    L_0x001d:
        r2 = "GifHeaderParser";
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);
        if (r2 == 0) goto L_0x0042;
    L_0x0026:
        r2 = new java.lang.StringBuilder;
        r3 = "Error Reading Block n: ";
        r2.<init>(r3);
        r2.append(r1);
        r3 = " count: ";
        r2.append(r3);
        r2.append(r0);
        r0 = " blockSize: ";
        r2.append(r0);
        r0 = r4.d;
        r2.append(r0);
    L_0x0042:
        r0 = r4.c;
        r2 = 1;
        r0.b = r2;
    L_0x0047:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.g():int");
    }

    private int h() {
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
        r0 = r2.b;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0009 }
        r0 = r0 & 255;
        goto L_0x000f;
    L_0x0009:
        r0 = r2.c;
        r1 = 1;
        r0.b = r1;
        r0 = 0;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.h():int");
    }

    private boolean i() {
        return this.c.b != 0;
    }

    public final ea a(byte[] bArr) {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new dz();
        this.d = 0;
        if (bArr != null) {
            this.b = ByteBuffer.wrap(bArr);
            this.b.rewind();
            this.b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.b = null;
            this.c.b = 2;
        }
        return this;
    }

    public final void a() {
        this.b = null;
        this.c = null;
    }

    public final dz b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (i()) {
            return this.c;
        } else {
            e();
            if (!i()) {
                c();
                dz dzVar = this.c;
                if (dzVar.c < 0) {
                    dzVar.b = 1;
                }
            }
            return this.c;
        }
    }
}
