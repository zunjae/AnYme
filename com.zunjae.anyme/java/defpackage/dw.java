package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class dw {
    private static final String a = "dw";
    private static final Config b = Config.ARGB_8888;
    private int[] c;
    private ByteBuffer d;
    private final byte[] e = new byte[256];
    private short[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private int[] j;
    private int k;
    private byte[] l;
    private dz m;
    private dx n;
    private Bitmap o;
    private boolean p;
    private int q;

    public dw(dx dxVar) {
        this.n = dxVar;
        this.m = new dz();
    }

    private Bitmap a(dy dyVar, dy dyVar2) {
        int i;
        int i2;
        byte[] bArr;
        int h;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr2;
        int i25;
        byte b;
        dz dzVar;
        dy dyVar3 = dyVar;
        dy dyVar4 = dyVar2;
        dz dzVar2 = this.m;
        int i26 = dzVar2.f;
        int i27 = dzVar2.g;
        int[] iArr = this.j;
        int i28 = 3;
        if (dyVar4 != null) {
            i = dyVar4.g;
            if (i > 0) {
                if (i == 2) {
                    Arrays.fill(iArr, !dyVar3.f ? dzVar2.l : 0);
                } else if (i == 3) {
                    Bitmap bitmap = r0.o;
                    if (bitmap != null) {
                        bitmap.getPixels(iArr, 0, i26, 0, 0, i26, i27);
                        if (dyVar3 != null) {
                            r0.d.position(dyVar3.j);
                        }
                        if (dyVar3 != null) {
                            dzVar2 = r0.m;
                            i2 = dzVar2.f * dzVar2.g;
                        } else {
                            i2 = dyVar3.d * dyVar3.c;
                        }
                        bArr = r0.i;
                        if (bArr == null || bArr.length < i2) {
                            r0.i = new byte[i2];
                        }
                        if (r0.f == null) {
                            r0.f = new short[4096];
                        }
                        if (r0.g == null) {
                            r0.g = new byte[4096];
                        }
                        if (r0.h == null) {
                            r0.h = new byte[4097];
                        }
                        h = h();
                        i3 = 1 << h;
                        i4 = i3 + 1;
                        i5 = i3 + 2;
                        h++;
                        i6 = (1 << h) - 1;
                        for (i7 = 0; i7 < i3; i7++) {
                            r0.f[i7] = (short) 0;
                            r0.g[i7] = (byte) i7;
                        }
                        i = -1;
                        i8 = h;
                        i9 = i5;
                        i10 = i6;
                        i11 = 0;
                        i7 = 0;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        i16 = -1;
                        i17 = 0;
                        i18 = 0;
                        while (true) {
                            i19 = 8;
                            if (i11 >= i2) {
                                break;
                            }
                            if (i7 == 0) {
                                i7 = i();
                                if (i7 <= 0) {
                                    break;
                                }
                                i15 = 0;
                            }
                            i14 += (r0.e[i15] & 255) << i13;
                            i15++;
                            i7 += i;
                            i20 = h;
                            i28 = i8;
                            i = i16;
                            h = i17;
                            i21 = i9;
                            int i29 = i12;
                            i12 = i11;
                            i11 = i13 + 8;
                            i13 = i29;
                            while (i11 >= i28) {
                                i22 = i5;
                                i5 = i14 & i10;
                                i14 >>= i28;
                                i11 -= i28;
                                if (i5 == i3) {
                                    if (i5 <= i21) {
                                        i23 = i11;
                                        r0.q = 3;
                                    } else {
                                        i23 = i11;
                                        if (i5 != i4) {
                                            if (i != -1) {
                                                h = i18 + 1;
                                                r0.h[i18] = r0.g[i5];
                                                i18 = h;
                                                i = i5;
                                                h = i;
                                                i5 = i22;
                                                i11 = i23;
                                            } else {
                                                if (i5 < i21) {
                                                    i8 = i18 + 1;
                                                    r0.h[i18] = (byte) h;
                                                    h = i;
                                                } else {
                                                    h = i5;
                                                    i8 = i18;
                                                }
                                                while (h >= i3) {
                                                    i16 = i8 + 1;
                                                    i24 = i3;
                                                    r0.h[i8] = r0.g[h];
                                                    h = r0.f[h];
                                                    i8 = i16;
                                                    i3 = i24;
                                                }
                                                i24 = i3;
                                                bArr2 = r0.g;
                                                h = bArr2[h] & 255;
                                                i16 = i8 + 1;
                                                i25 = i4;
                                                b = (byte) h;
                                                r0.h[i8] = b;
                                                if (i21 < 4096) {
                                                    r0.f[i21] = (short) i;
                                                    bArr2[i21] = b;
                                                    i21++;
                                                    if ((i21 & i10) == 0) {
                                                        if (i21 < 4096) {
                                                            i28++;
                                                            i10 += i21;
                                                        }
                                                        i18 = i16;
                                                        while (i18 > 0) {
                                                            i18--;
                                                            i3 = i13 + 1;
                                                            r0.i[i13] = r0.h[i18];
                                                            i12++;
                                                            i13 = i3;
                                                        }
                                                        i = i5;
                                                        i5 = i22;
                                                        i11 = i23;
                                                        i3 = i24;
                                                        i4 = i25;
                                                    }
                                                }
                                                i18 = i16;
                                                while (i18 > 0) {
                                                    i18--;
                                                    i3 = i13 + 1;
                                                    r0.i[i13] = r0.h[i18];
                                                    i12++;
                                                    i13 = i3;
                                                }
                                                i = i5;
                                                i5 = i22;
                                                i11 = i23;
                                                i3 = i24;
                                                i4 = i25;
                                            }
                                        }
                                    }
                                    i16 = i;
                                    i17 = h;
                                    i9 = i21;
                                    i8 = i28;
                                    i11 = i12;
                                    i12 = i13;
                                    h = i20;
                                    i5 = i22;
                                    i13 = i23;
                                    i3 = i3;
                                    i4 = i4;
                                    break;
                                }
                                i10 = i6;
                                i28 = i20;
                                i5 = i22;
                                i21 = i5;
                                i = -1;
                            }
                            i23 = i11;
                            i16 = i;
                            i17 = h;
                            i9 = i21;
                            i8 = i28;
                            i11 = i12;
                            i12 = i13;
                            h = i20;
                            i13 = i23;
                            i = -1;
                            i28 = 3;
                        }
                        r0.q = i28;
                        for (i = i12; i < i2; i++) {
                            r0.i[i] = (byte) 0;
                        }
                        i = 0;
                        h = 1;
                        i21 = 0;
                        while (true) {
                            i2 = dyVar3.d;
                            if (i >= i2) {
                                if (dyVar3.e) {
                                    i2 = i21;
                                    i21 = i;
                                } else {
                                    if (i21 >= i2) {
                                        h++;
                                        switch (h) {
                                            case tw.b /*2*/:
                                                i21 = 4;
                                                break;
                                            case f.c /*3*/:
                                                i21 = 2;
                                                i19 = 4;
                                                break;
                                            case mh.d /*4*/:
                                                i21 = 1;
                                                i19 = 2;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    i2 = i21 + i19;
                                }
                                i21 += dyVar3.b;
                                dzVar = r0.m;
                                if (i21 < dzVar.g) {
                                    i11 = dzVar.f;
                                    i21 *= i11;
                                    i3 = dyVar3.a + i21;
                                    i4 = dyVar3.c + i3;
                                    if (i21 + i11 < i4) {
                                        i4 = i21 + i11;
                                    }
                                    i11 = dyVar3.c * i;
                                    while (i3 < i4) {
                                        i6 = i11 + 1;
                                        i11 = r0.c[r0.i[i11] & 255];
                                        if (i11 != 0) {
                                            iArr[i3] = i11;
                                        }
                                        i3++;
                                        i11 = i6;
                                    }
                                }
                                i++;
                                i21 = i2;
                            } else {
                                if (r0.p) {
                                    int i30 = dyVar3.g;
                                    if (i30 == 0 || i30 == 1) {
                                        if (r0.o == null) {
                                            r0.o = j();
                                        }
                                        r0.o.setPixels(iArr, 0, i26, 0, 0, i26, i27);
                                    }
                                }
                                Bitmap j = j();
                                j.setPixels(iArr, 0, i26, 0, 0, i26, i27);
                                return j;
                            }
                        }
                    }
                }
            }
        }
        if (dyVar3 != null) {
            r0.d.position(dyVar3.j);
        }
        if (dyVar3 != null) {
            i2 = dyVar3.d * dyVar3.c;
        } else {
            dzVar2 = r0.m;
            i2 = dzVar2.f * dzVar2.g;
        }
        bArr = r0.i;
        r0.i = new byte[i2];
        if (r0.f == null) {
            r0.f = new short[4096];
        }
        if (r0.g == null) {
            r0.g = new byte[4096];
        }
        if (r0.h == null) {
            r0.h = new byte[4097];
        }
        h = h();
        i3 = 1 << h;
        i4 = i3 + 1;
        i5 = i3 + 2;
        h++;
        i6 = (1 << h) - 1;
        for (i7 = 0; i7 < i3; i7++) {
            r0.f[i7] = (short) 0;
            r0.g[i7] = (byte) i7;
        }
        i = -1;
        i8 = h;
        i9 = i5;
        i10 = i6;
        i11 = 0;
        i7 = 0;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        i16 = -1;
        i17 = 0;
        i18 = 0;
        while (true) {
            i19 = 8;
            if (i11 >= i2) {
                break;
            }
            if (i7 == 0) {
                i7 = i();
                if (i7 <= 0) {
                    break;
                }
                i15 = 0;
            }
            i14 += (r0.e[i15] & 255) << i13;
            i15++;
            i7 += i;
            i20 = h;
            i28 = i8;
            i = i16;
            h = i17;
            i21 = i9;
            int i292 = i12;
            i12 = i11;
            i11 = i13 + 8;
            i13 = i292;
            while (i11 >= i28) {
                i22 = i5;
                i5 = i14 & i10;
                i14 >>= i28;
                i11 -= i28;
                if (i5 == i3) {
                    if (i5 <= i21) {
                        i23 = i11;
                        if (i5 != i4) {
                            if (i != -1) {
                                if (i5 < i21) {
                                    h = i5;
                                    i8 = i18;
                                } else {
                                    i8 = i18 + 1;
                                    r0.h[i18] = (byte) h;
                                    h = i;
                                }
                                while (h >= i3) {
                                    i16 = i8 + 1;
                                    i24 = i3;
                                    r0.h[i8] = r0.g[h];
                                    h = r0.f[h];
                                    i8 = i16;
                                    i3 = i24;
                                }
                                i24 = i3;
                                bArr2 = r0.g;
                                h = bArr2[h] & 255;
                                i16 = i8 + 1;
                                i25 = i4;
                                b = (byte) h;
                                r0.h[i8] = b;
                                if (i21 < 4096) {
                                    r0.f[i21] = (short) i;
                                    bArr2[i21] = b;
                                    i21++;
                                    if ((i21 & i10) == 0) {
                                        if (i21 < 4096) {
                                            i28++;
                                            i10 += i21;
                                        }
                                        i18 = i16;
                                        while (i18 > 0) {
                                            i18--;
                                            i3 = i13 + 1;
                                            r0.i[i13] = r0.h[i18];
                                            i12++;
                                            i13 = i3;
                                        }
                                        i = i5;
                                        i5 = i22;
                                        i11 = i23;
                                        i3 = i24;
                                        i4 = i25;
                                    }
                                }
                                i18 = i16;
                                while (i18 > 0) {
                                    i18--;
                                    i3 = i13 + 1;
                                    r0.i[i13] = r0.h[i18];
                                    i12++;
                                    i13 = i3;
                                }
                                i = i5;
                                i5 = i22;
                                i11 = i23;
                                i3 = i24;
                                i4 = i25;
                            } else {
                                h = i18 + 1;
                                r0.h[i18] = r0.g[i5];
                                i18 = h;
                                i = i5;
                                h = i;
                                i5 = i22;
                                i11 = i23;
                            }
                        }
                    } else {
                        i23 = i11;
                        r0.q = 3;
                    }
                    i16 = i;
                    i17 = h;
                    i9 = i21;
                    i8 = i28;
                    i11 = i12;
                    i12 = i13;
                    h = i20;
                    i5 = i22;
                    i13 = i23;
                    i3 = i3;
                    i4 = i4;
                    break;
                }
                i10 = i6;
                i28 = i20;
                i5 = i22;
                i21 = i5;
                i = -1;
            }
            i23 = i11;
            i16 = i;
            i17 = h;
            i9 = i21;
            i8 = i28;
            i11 = i12;
            i12 = i13;
            h = i20;
            i13 = i23;
            i = -1;
            i28 = 3;
        }
        r0.q = i28;
        for (i = i12; i < i2; i++) {
            r0.i[i] = (byte) 0;
        }
        i = 0;
        h = 1;
        i21 = 0;
        while (true) {
            i2 = dyVar3.d;
            if (i >= i2) {
                if (r0.p) {
                    int i302 = dyVar3.g;
                    if (r0.o == null) {
                        r0.o = j();
                    }
                    r0.o.setPixels(iArr, 0, i26, 0, 0, i26, i27);
                }
                Bitmap j2 = j();
                j2.setPixels(iArr, 0, i26, 0, 0, i26, i27);
                return j2;
            }
            if (dyVar3.e) {
                i2 = i21;
                i21 = i;
            } else {
                if (i21 >= i2) {
                    h++;
                    switch (h) {
                        case tw.b /*2*/:
                            i21 = 4;
                            break;
                        case f.c /*3*/:
                            i21 = 2;
                            i19 = 4;
                            break;
                        case mh.d /*4*/:
                            i21 = 1;
                            i19 = 2;
                            break;
                        default:
                            break;
                    }
                }
                i2 = i21 + i19;
            }
            i21 += dyVar3.b;
            dzVar = r0.m;
            if (i21 < dzVar.g) {
                i11 = dzVar.f;
                i21 *= i11;
                i3 = dyVar3.a + i21;
                i4 = dyVar3.c + i3;
                if (i21 + i11 < i4) {
                    i4 = i21 + i11;
                }
                i11 = dyVar3.c * i;
                while (i3 < i4) {
                    i6 = i11 + 1;
                    i11 = r0.c[r0.i[i11] & 255];
                    if (i11 != 0) {
                        iArr[i3] = i11;
                    }
                    i3++;
                    i11 = i6;
                }
            }
            i++;
            i21 = i2;
        }
    }

    @TargetApi(12)
    private static void a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
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
        r1 = this;
        r0 = r1.d;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0009 }
        r0 = r0 & 255;
        goto L_0x000d;
    L_0x0009:
        r0 = 1;
        r1.q = r0;
        r0 = 0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.h():int");
    }

    private int i() {
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
        r5 = this;
        r0 = r5.h();
        r1 = 0;
        if (r0 <= 0) goto L_0x0017;
    L_0x0007:
        if (r1 >= r0) goto L_0x0017;
    L_0x0009:
        r2 = r0 - r1;
        r3 = r5.d;	 Catch:{ Exception -> 0x0014 }
        r4 = r5.e;	 Catch:{ Exception -> 0x0014 }
        r3.get(r4, r1, r2);	 Catch:{ Exception -> 0x0014 }
        r1 = r1 + r2;
        goto L_0x0007;
    L_0x0014:
        r0 = 1;
        r5.q = r0;
    L_0x0017:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.i():int");
    }

    private Bitmap j() {
        dx dxVar = this.n;
        dz dzVar = this.m;
        Bitmap a = dxVar.a(dzVar.f, dzVar.g, b);
        if (a == null) {
            dz dzVar2 = this.m;
            a = Bitmap.createBitmap(dzVar2.f, dzVar2.g, b);
        }
        dw.a(a);
        return a;
    }

    public final int a(int i) {
        if (i >= 0) {
            dz dzVar = this.m;
            if (i < dzVar.c) {
                return ((dy) dzVar.e.get(i)).i;
            }
        }
        return -1;
    }

    public final void a() {
        this.k = (this.k + 1) % this.m.c;
    }

    public final void a(dz dzVar, byte[] bArr) {
        this.m = dzVar;
        this.l = bArr;
        this.q = 0;
        this.k = -1;
        this.d = ByteBuffer.wrap(bArr);
        this.d.rewind();
        this.d.order(ByteOrder.LITTLE_ENDIAN);
        this.p = false;
        for (dy dyVar : dzVar.e) {
            if (dyVar.g == 3) {
                this.p = true;
                break;
            }
        }
        int i = dzVar.f;
        int i2 = dzVar.g;
        this.i = new byte[(i * i2)];
        this.j = new int[(i * i2)];
    }

    public final int b() {
        if (this.m.c > 0) {
            int i = this.k;
            if (i >= 0) {
                return a(i);
            }
        }
        return -1;
    }

    public final int c() {
        return this.m.c;
    }

    public final int d() {
        return this.k;
    }

    public final int e() {
        return this.m.m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap f() {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.m;	 Catch:{ all -> 0x00b4 }
        r0 = r0.c;	 Catch:{ all -> 0x00b4 }
        r1 = 3;
        r2 = 1;
        if (r0 <= 0) goto L_0x000d;
    L_0x0009:
        r0 = r8.k;	 Catch:{ all -> 0x00b4 }
        if (r0 >= 0) goto L_0x002f;
    L_0x000d:
        r0 = a;	 Catch:{ all -> 0x00b4 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00b4 }
        if (r0 == 0) goto L_0x002d;
    L_0x0015:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b4 }
        r3 = "unable to decode frame, frameCount=";
        r0.<init>(r3);	 Catch:{ all -> 0x00b4 }
        r3 = r8.m;	 Catch:{ all -> 0x00b4 }
        r3 = r3.c;	 Catch:{ all -> 0x00b4 }
        r0.append(r3);	 Catch:{ all -> 0x00b4 }
        r3 = " framePointer=";
        r0.append(r3);	 Catch:{ all -> 0x00b4 }
        r3 = r8.k;	 Catch:{ all -> 0x00b4 }
        r0.append(r3);	 Catch:{ all -> 0x00b4 }
    L_0x002d:
        r8.q = r2;	 Catch:{ all -> 0x00b4 }
    L_0x002f:
        r0 = r8.q;	 Catch:{ all -> 0x00b4 }
        r3 = 0;
        if (r0 == r2) goto L_0x009e;
    L_0x0034:
        r0 = r8.q;	 Catch:{ all -> 0x00b4 }
        r4 = 2;
        if (r0 != r4) goto L_0x003a;
    L_0x0039:
        goto L_0x009e;
    L_0x003a:
        r0 = 0;
        r8.q = r0;	 Catch:{ all -> 0x00b4 }
        r1 = r8.m;	 Catch:{ all -> 0x00b4 }
        r1 = r1.e;	 Catch:{ all -> 0x00b4 }
        r4 = r8.k;	 Catch:{ all -> 0x00b4 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x00b4 }
        r1 = (defpackage.dy) r1;	 Catch:{ all -> 0x00b4 }
        r4 = r8.k;	 Catch:{ all -> 0x00b4 }
        r4 = r4 - r2;
        if (r4 < 0) goto L_0x0059;
    L_0x004e:
        r5 = r8.m;	 Catch:{ all -> 0x00b4 }
        r5 = r5.e;	 Catch:{ all -> 0x00b4 }
        r4 = r5.get(r4);	 Catch:{ all -> 0x00b4 }
        r4 = (defpackage.dy) r4;	 Catch:{ all -> 0x00b4 }
        goto L_0x005a;
    L_0x0059:
        r4 = r3;
    L_0x005a:
        r5 = r1.k;	 Catch:{ all -> 0x00b4 }
        if (r5 != 0) goto L_0x0065;
    L_0x005e:
        r5 = r8.m;	 Catch:{ all -> 0x00b4 }
        r5 = r5.a;	 Catch:{ all -> 0x00b4 }
        r8.c = r5;	 Catch:{ all -> 0x00b4 }
        goto L_0x0075;
    L_0x0065:
        r5 = r1.k;	 Catch:{ all -> 0x00b4 }
        r8.c = r5;	 Catch:{ all -> 0x00b4 }
        r5 = r8.m;	 Catch:{ all -> 0x00b4 }
        r5 = r5.j;	 Catch:{ all -> 0x00b4 }
        r6 = r1.h;	 Catch:{ all -> 0x00b4 }
        if (r5 != r6) goto L_0x0075;
    L_0x0071:
        r5 = r8.m;	 Catch:{ all -> 0x00b4 }
        r5.l = r0;	 Catch:{ all -> 0x00b4 }
    L_0x0075:
        r5 = r1.f;	 Catch:{ all -> 0x00b4 }
        if (r5 == 0) goto L_0x0086;
    L_0x0079:
        r5 = r8.c;	 Catch:{ all -> 0x00b4 }
        r6 = r1.h;	 Catch:{ all -> 0x00b4 }
        r5 = r5[r6];	 Catch:{ all -> 0x00b4 }
        r6 = r8.c;	 Catch:{ all -> 0x00b4 }
        r7 = r1.h;	 Catch:{ all -> 0x00b4 }
        r6[r7] = r0;	 Catch:{ all -> 0x00b4 }
        r0 = r5;
    L_0x0086:
        r5 = r8.c;	 Catch:{ all -> 0x00b4 }
        if (r5 != 0) goto L_0x008e;
    L_0x008a:
        r8.q = r2;	 Catch:{ all -> 0x00b4 }
        monitor-exit(r8);
        return r3;
    L_0x008e:
        r2 = r8.a(r1, r4);	 Catch:{ all -> 0x00b4 }
        r3 = r1.f;	 Catch:{ all -> 0x00b4 }
        if (r3 == 0) goto L_0x009c;
    L_0x0096:
        r3 = r8.c;	 Catch:{ all -> 0x00b4 }
        r1 = r1.h;	 Catch:{ all -> 0x00b4 }
        r3[r1] = r0;	 Catch:{ all -> 0x00b4 }
    L_0x009c:
        monitor-exit(r8);
        return r2;
    L_0x009e:
        r0 = a;	 Catch:{ all -> 0x00b4 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00b4 }
        if (r0 == 0) goto L_0x00b2;
    L_0x00a6:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b4 }
        r1 = "Unable to decode frame, status=";
        r0.<init>(r1);	 Catch:{ all -> 0x00b4 }
        r1 = r8.q;	 Catch:{ all -> 0x00b4 }
        r0.append(r1);	 Catch:{ all -> 0x00b4 }
    L_0x00b2:
        monitor-exit(r8);
        return r3;
    L_0x00b4:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.f():android.graphics.Bitmap");
    }

    public final void g() {
        this.m = null;
        this.l = null;
        this.i = null;
        this.j = null;
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            this.n.a(bitmap);
        }
        this.o = null;
        this.d = null;
    }
}
