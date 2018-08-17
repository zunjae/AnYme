package defpackage;

import java.util.Arrays;
import java.util.HashMap;

public final class ao {
    public static aq g = null;
    private static int h = 1000;
    int a = 0;
    al[] b;
    public boolean c;
    int d;
    int e;
    final am f;
    private HashMap<String, au> i = null;
    private ap j;
    private int k = 32;
    private int l;
    private boolean[] m;
    private int n;
    private au[] o;
    private int p;
    private al[] q;
    private final ap r;

    public ao() {
        int i = this.k;
        this.l = i;
        this.b = null;
        this.c = false;
        this.m = new boolean[i];
        this.d = 1;
        this.e = 0;
        this.n = i;
        this.o = new au[h];
        this.p = 0;
        this.q = new al[i];
        this.b = new al[i];
        g();
        this.f = new am();
        this.j = new an(this.f);
        this.r = new al(this.f);
    }

    private final int a(ap apVar) {
        aq aqVar = g;
        if (aqVar != null) {
            aqVar.h++;
        }
        for (int i = 0; i < this.d; i++) {
            this.m[i] = false;
        }
        Object obj = null;
        int i2 = 0;
        while (obj == null) {
            aq aqVar2 = g;
            if (aqVar2 != null) {
                aqVar2.i++;
            }
            i2++;
            if (i2 >= this.d * 2) {
                return i2;
            }
            if (apVar.b() != null) {
                this.m[apVar.b().a] = true;
            }
            au a = apVar.a(this.m);
            if (a != null) {
                boolean[] zArr = this.m;
                int i3 = a.a;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.e; i5++) {
                    al alVar = this.b[i5];
                    if (!(alVar.a.f == av.a || alVar.e || !alVar.a(a))) {
                        float b = alVar.d.b(a);
                        if (b < 0.0f) {
                            float f2 = (-alVar.b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 >= 0) {
                    al alVar2 = this.b[i4];
                    alVar2.a.b = -1;
                    aq aqVar3 = g;
                    if (aqVar3 != null) {
                        aqVar3.j++;
                    }
                    alVar2.b(a);
                    a = alVar2.a;
                    a.b = i4;
                    a.c(alVar2);
                }
            }
            obj = 1;
        }
        return i2;
    }

    public static al a(ao aoVar, au auVar, au auVar2, au auVar3, float f, boolean z) {
        al c = aoVar.c();
        if (z) {
            c.a(aoVar, 0);
        }
        c.d.a(auVar, -1.0f);
        c.d.a(auVar2, 1.0f - f);
        c.d.a(auVar3, f);
        return c;
    }

    public static aq a() {
        return g;
    }

    private void a(al alVar, int i, int i2) {
        alVar.d.a(a(i2), (float) i);
    }

    public static int b(Object obj) {
        au b = ((az) obj).b();
        return b != null ? (int) (b.d + 0.5f) : 0;
    }

    private au b(int i) {
        au auVar = (au) this.f.b.a();
        if (auVar == null) {
            auVar = new au(i);
        } else {
            auVar.b();
        }
        auVar.f = i;
        i = this.p;
        int i2 = h;
        if (i >= i2) {
            h = i2 * 2;
            this.o = (au[]) Arrays.copyOf(this.o, h);
        }
        au[] auVarArr = this.o;
        i2 = this.p;
        this.p = i2 + 1;
        auVarArr[i2] = auVar;
        return auVar;
    }

    private final void b(al alVar) {
        if (this.e > 0) {
            alVar.d.a(alVar, this.b);
            if (alVar.d.a == 0) {
                alVar.e = true;
            }
        }
    }

    private final void c(al alVar) {
        al[] alVarArr = this.b;
        int i = this.e;
        if (alVarArr[i] != null) {
            this.f.a.a(alVarArr[i]);
        }
        alVarArr = this.b;
        i = this.e;
        alVarArr[i] = alVar;
        au auVar = alVar.a;
        auVar.b = i;
        this.e = i + 1;
        auVar.c(alVar);
    }

    private void f() {
        this.k *= 2;
        this.b = (al[]) Arrays.copyOf(this.b, this.k);
        am amVar = this.f;
        amVar.c = (au[]) Arrays.copyOf(amVar.c, this.k);
        int i = this.k;
        this.m = new boolean[i];
        this.l = i;
        this.n = i;
        aq aqVar = g;
        if (aqVar != null) {
            aqVar.d++;
            aqVar.p = Math.max(aqVar.p, (long) i);
            aq aqVar2 = g;
            aqVar2.D = aqVar2.p;
        }
    }

    private void g() {
        int i = 0;
        while (true) {
            al[] alVarArr = this.b;
            if (i < alVarArr.length) {
                Object obj = alVarArr[i];
                if (obj != null) {
                    this.f.a.a(obj);
                }
                this.b[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    private au h() {
        aq aqVar = g;
        if (aqVar != null) {
            aqVar.n++;
        }
        if (this.d + 1 >= this.l) {
            f();
        }
        au b = b(av.c);
        this.a++;
        this.d++;
        int i = this.a;
        b.a = i;
        this.f.c[i] = b;
        return b;
    }

    private void i() {
        for (int i = 0; i < this.e; i++) {
            al alVar = this.b[i];
            alVar.a.d = alVar.b;
        }
    }

    public final au a(int i) {
        aq aqVar = g;
        if (aqVar != null) {
            aqVar.m++;
        }
        if (this.d + 1 >= this.l) {
            f();
        }
        au b = b(av.d);
        this.a++;
        this.d++;
        int i2 = this.a;
        b.a = i2;
        b.c = i;
        this.f.c[i2] = b;
        this.j.c(b);
        return b;
    }

    public final au a(Object obj) {
        au auVar = null;
        if (obj == null) {
            return null;
        }
        if (this.d + 1 >= this.l) {
            f();
        }
        if (obj instanceof az) {
            az azVar = (az) obj;
            auVar = azVar.b();
            if (auVar == null) {
                azVar.c();
                auVar = azVar.b();
            }
            int i = auVar.a;
            if (i == -1 || i > this.a || this.f.c[i] == null) {
                if (auVar.a != -1) {
                    auVar.b();
                }
                this.a++;
                this.d++;
                i = this.a;
                auVar.a = i;
                auVar.f = av.a;
                this.f.c[i] = auVar;
            }
        }
        return auVar;
    }

    public final void a(al alVar) {
        if (alVar != null) {
            Object obj;
            aq aqVar = g;
            if (aqVar != null) {
                aqVar.f++;
                if (alVar.e) {
                    aqVar.g++;
                }
            }
            boolean z = true;
            if (this.e + 1 >= this.n || this.d + 1 >= this.l) {
                f();
            }
            if (alVar.e) {
                obj = null;
            } else {
                b(alVar);
                obj = (alVar.a == null && alVar.b == 0.0f && alVar.d.a == 0) ? 1 : null;
                if (obj == null) {
                    float f = alVar.b;
                    if (f < 0.0f) {
                        alVar.b = f * -1.0f;
                        alVar.d.b();
                    }
                    au c = alVar.d.c();
                    if (c == null) {
                        obj = 1;
                    } else {
                        alVar.b(c);
                        obj = null;
                    }
                    if (alVar.d.a == 0) {
                        alVar.e = true;
                    }
                    if (obj != null) {
                        aqVar = g;
                        if (aqVar != null) {
                            aqVar.o++;
                        }
                        if (this.d + 1 >= this.l) {
                            f();
                        }
                        c = b(av.c);
                        this.a++;
                        this.d++;
                        int i = this.a;
                        c.a = i;
                        this.f.c[i] = c;
                        alVar.a = c;
                        c(alVar);
                        this.r.a((ap) alVar);
                        a(this.r);
                        if (c.b == -1) {
                            if (alVar.a == c) {
                                c = alVar.d.a(null, c);
                                if (c != null) {
                                    aq aqVar2 = g;
                                    if (aqVar2 != null) {
                                        aqVar2.j++;
                                    }
                                    alVar.b(c);
                                }
                            }
                            if (!alVar.e) {
                                alVar.a.c(alVar);
                            }
                            this.e--;
                        }
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    au auVar = alVar.a;
                    if (auVar != null) {
                        if (auVar.f != av.a) {
                            if (alVar.b >= 0.0f) {
                            }
                        }
                        if (!z) {
                            return;
                        }
                    }
                    z = false;
                    if (z) {
                        return;
                    }
                }
                return;
            }
            if (obj == null) {
                c(alVar);
            }
        }
    }

    public final void a(au auVar, int i) {
        int i2 = auVar.b;
        al alVar;
        if (i2 != -1) {
            alVar = this.b[i2];
            if (alVar.e) {
                alVar.b = (float) i;
                return;
            } else if (alVar.d.a == 0) {
                alVar.e = true;
                alVar.b = (float) i;
                return;
            } else {
                ak akVar;
                float f;
                alVar = c();
                if (i < 0) {
                    alVar.b = (float) (i * -1);
                    akVar = alVar.d;
                    f = 1.0f;
                } else {
                    alVar.b = (float) i;
                    akVar = alVar.d;
                    f = -1.0f;
                }
                akVar.a(auVar, f);
                a(alVar);
                return;
            }
        }
        alVar = c();
        alVar.a = auVar;
        float f2 = (float) i;
        auVar.d = f2;
        alVar.b = f2;
        alVar.e = true;
        a(alVar);
    }

    public final void a(au auVar, au auVar2, int i, float f, au auVar3, au auVar4, int i2, int i3) {
        al c = c();
        if (auVar2 == auVar3) {
            c.d.a(auVar, 1.0f);
            c.d.a(auVar4, 1.0f);
            c.d.a(auVar2, -2.0f);
        } else {
            float f2;
            if (f == 0.5f) {
                c.d.a(auVar, 1.0f);
                c.d.a(auVar2, -1.0f);
                c.d.a(auVar3, -1.0f);
                c.d.a(auVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    f2 = (float) ((-i) + i2);
                }
            } else if (f <= 0.0f) {
                c.d.a(auVar, -1.0f);
                c.d.a(auVar2, 1.0f);
                f2 = (float) i;
            } else if (f >= 1.0f) {
                c.d.a(auVar3, -1.0f);
                c.d.a(auVar4, 1.0f);
                f2 = (float) i2;
            } else {
                float f3 = 1.0f - f;
                c.d.a(auVar, f3 * 1.0f);
                c.d.a(auVar2, f3 * -1.0f);
                c.d.a(auVar3, -1.0f * f);
                c.d.a(auVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                }
            }
            c.b = f2;
        }
        if (i3 != 6) {
            c.a(this, i3);
        }
        a(c);
    }

    public final void a(au auVar, au auVar2, int i, int i2) {
        al c = c();
        au h = h();
        h.c = 0;
        c.a(auVar, auVar2, h, i);
        if (i2 != 6) {
            a(c, (int) (c.d.b(h) * -1.0f), i2);
        }
        a(c);
    }

    public final void a(au auVar, au auVar2, au auVar3, au auVar4, float f) {
        al c = c();
        c.a(auVar, auVar2, auVar3, auVar4, f);
        a(c);
    }

    public final void a(au auVar, au auVar2, boolean z) {
        al c = c();
        au h = h();
        h.c = 0;
        c.a(auVar, auVar2, h, 0);
        if (z) {
            a(c, (int) (c.d.b(h) * -1.0f), 1);
        }
        a(c);
    }

    public final void a(be beVar, be beVar2, float f, int i) {
        be beVar3 = beVar;
        be beVar4 = beVar2;
        au a = a(beVar3.a(bd.LEFT));
        au a2 = a(beVar3.a(bd.TOP));
        au a3 = a(beVar3.a(bd.RIGHT));
        au a4 = a(beVar3.a(bd.BOTTOM));
        au a5 = a(beVar4.a(bd.LEFT));
        au a6 = a(beVar4.a(bd.TOP));
        au a7 = a(beVar4.a(bd.RIGHT));
        au a8 = a(beVar4.a(bd.BOTTOM));
        al c = c();
        double d = (double) f;
        double sin = Math.sin(d);
        au auVar = a3;
        double d2 = (double) i;
        Double.isNaN(d2);
        au auVar2 = a7;
        c.b(a2, a4, a6, a8, (float) (sin * d2));
        a(c);
        c = c();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        c.b(a, auVar, a5, auVar2, (float) (cos * d2));
        a(c);
    }

    public final void b() {
        am amVar;
        int i = 0;
        while (true) {
            amVar = this.f;
            au[] auVarArr = amVar.c;
            if (i >= auVarArr.length) {
                break;
            }
            au auVar = auVarArr[i];
            if (auVar != null) {
                auVar.b();
            }
            i++;
        }
        amVar.b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.f.c, null);
        HashMap hashMap = this.i;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.a = 0;
        this.j.a();
        this.d = 1;
        for (i = 0; i < this.e; i++) {
            this.b[i].c = false;
        }
        g();
        this.e = 0;
    }

    public final void b(au auVar, au auVar2, int i, int i2) {
        al c = c();
        au h = h();
        h.c = 0;
        c.b(auVar, auVar2, h, i);
        if (i2 != 6) {
            a(c, (int) (c.d.b(h) * -1.0f), i2);
        }
        a(c);
    }

    public final void b(au auVar, au auVar2, boolean z) {
        al c = c();
        au h = h();
        h.c = 0;
        c.b(auVar, auVar2, h, 0);
        if (z) {
            a(c, (int) (c.d.b(h) * -1.0f), 1);
        }
        a(c);
    }

    public final al c() {
        al alVar = (al) this.f.a.a();
        if (alVar == null) {
            alVar = new al(this.f);
        } else {
            alVar.a = null;
            alVar.d.a();
            alVar.b = 0.0f;
            alVar.e = false;
        }
        au.a();
        return alVar;
    }

    public final al c(au auVar, au auVar2, int i, int i2) {
        al c = c();
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            c.b = (float) i;
        }
        if (obj == null) {
            c.d.a(auVar, -1.0f);
            c.d.a(auVar2, 1.0f);
        } else {
            c.d.a(auVar, 1.0f);
            c.d.a(auVar2, -1.0f);
        }
        if (i2 != 6) {
            c.a(this, i2);
        }
        a(c);
        return c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        r17 = this;
        r0 = r17;
        r1 = g;
        r2 = 1;
        if (r1 == 0) goto L_0x000d;
    L_0x0008:
        r4 = r1.e;
        r4 = r4 + r2;
        r1.e = r4;
    L_0x000d:
        r1 = r0.c;
        r5 = 1;
        if (r1 == 0) goto L_0x003d;
    L_0x0012:
        r1 = g;
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r6 = r1.r;
        r6 = r6 + r2;
        r1.r = r6;
    L_0x001b:
        r1 = 0;
    L_0x001c:
        r6 = r0.e;
        if (r1 >= r6) goto L_0x002d;
    L_0x0020:
        r6 = r0.b;
        r6 = r6[r1];
        r6 = r6.e;
        if (r6 != 0) goto L_0x002a;
    L_0x0028:
        r1 = 0;
        goto L_0x002e;
    L_0x002a:
        r1 = r1 + 1;
        goto L_0x001c;
    L_0x002d:
        r1 = 1;
    L_0x002e:
        if (r1 == 0) goto L_0x003d;
    L_0x0030:
        r1 = g;
        if (r1 == 0) goto L_0x0039;
    L_0x0034:
        r4 = r1.q;
        r4 = r4 + r2;
        r1.q = r4;
    L_0x0039:
        r17.i();
        return;
    L_0x003d:
        r1 = r0.j;
        r6 = g;
        if (r6 == 0) goto L_0x0060;
    L_0x0043:
        r7 = r6.t;
        r7 = r7 + r2;
        r6.t = r7;
        r7 = r6.u;
        r9 = r0.d;
        r9 = (long) r9;
        r7 = java.lang.Math.max(r7, r9);
        r6.u = r7;
        r6 = g;
        r7 = r6.v;
        r9 = r0.e;
        r9 = (long) r9;
        r7 = java.lang.Math.max(r7, r9);
        r6.v = r7;
    L_0x0060:
        r6 = r1;
        r6 = (defpackage.al) r6;
        r0.b(r6);
        r6 = 0;
    L_0x0067:
        r7 = r0.e;
        r8 = 0;
        if (r6 >= r7) goto L_0x0085;
    L_0x006c:
        r7 = r0.b;
        r9 = r7[r6];
        r9 = r9.a;
        r9 = r9.f;
        r10 = defpackage.av.a;
        if (r9 == r10) goto L_0x0082;
    L_0x0078:
        r7 = r7[r6];
        r7 = r7.b;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x0082;
    L_0x0080:
        r6 = 1;
        goto L_0x0086;
    L_0x0082:
        r6 = r6 + 1;
        goto L_0x0067;
    L_0x0085:
        r6 = 0;
    L_0x0086:
        if (r6 == 0) goto L_0x012d;
    L_0x0088:
        r6 = 0;
        r7 = 0;
    L_0x008a:
        if (r6 != 0) goto L_0x012d;
    L_0x008c:
        r9 = g;
        if (r9 == 0) goto L_0x0095;
    L_0x0090:
        r10 = r9.k;
        r10 = r10 + r2;
        r9.k = r10;
    L_0x0095:
        r7 = r7 + r5;
        r9 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r10 = -1;
        r9 = 0;
        r11 = -1;
        r12 = -1;
        r13 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r14 = 0;
    L_0x00a1:
        r15 = r0.e;
        if (r9 >= r15) goto L_0x00f5;
    L_0x00a5:
        r15 = r0.b;
        r15 = r15[r9];
        r4 = r15.a;
        r4 = r4.f;
        r5 = defpackage.av.a;
        if (r4 == r5) goto L_0x00ee;
    L_0x00b1:
        r4 = r15.e;
        if (r4 != 0) goto L_0x00ee;
    L_0x00b5:
        r4 = r15.b;
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x00ee;
    L_0x00bb:
        r4 = 1;
    L_0x00bc:
        r5 = r0.d;
        if (r4 >= r5) goto L_0x00ee;
    L_0x00c0:
        r5 = r0.f;
        r5 = r5.c;
        r5 = r5[r4];
        r2 = r15.d;
        r2 = r2.b(r5);
        r3 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r3 <= 0) goto L_0x00e8;
    L_0x00d0:
        r3 = 0;
    L_0x00d1:
        r8 = 7;
        if (r3 >= r8) goto L_0x00e8;
    L_0x00d4:
        r8 = r5.e;
        r8 = r8[r3];
        r8 = r8 / r2;
        r16 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r16 >= 0) goto L_0x00df;
    L_0x00dd:
        if (r3 == r14) goto L_0x00e1;
    L_0x00df:
        if (r3 <= r14) goto L_0x00e5;
    L_0x00e1:
        r14 = r3;
        r12 = r4;
        r13 = r8;
        r11 = r9;
    L_0x00e5:
        r3 = r3 + 1;
        goto L_0x00d1;
    L_0x00e8:
        r4 = r4 + 1;
        r2 = 1;
        r8 = 0;
        goto L_0x00bc;
    L_0x00ee:
        r9 = r9 + 1;
        r2 = 1;
        r5 = 1;
        r8 = 0;
        goto L_0x00a1;
    L_0x00f5:
        if (r11 == r10) goto L_0x011e;
    L_0x00f7:
        r2 = r0.b;
        r2 = r2[r11];
        r3 = r2.a;
        r3.b = r10;
        r3 = g;
        if (r3 == 0) goto L_0x010b;
    L_0x0103:
        r4 = r3.j;
        r8 = 1;
        r4 = r4 + r8;
        r3.j = r4;
        goto L_0x010d;
    L_0x010b:
        r8 = 1;
    L_0x010d:
        r3 = r0.f;
        r3 = r3.c;
        r3 = r3[r12];
        r2.b(r3);
        r3 = r2.a;
        r3.b = r11;
        r3.c(r2);
        goto L_0x0121;
    L_0x011e:
        r8 = 1;
        r6 = 1;
    L_0x0121:
        r2 = r0.d;
        r2 = r2 / 2;
        if (r7 <= r2) goto L_0x0128;
    L_0x0127:
        r6 = 1;
    L_0x0128:
        r2 = r8;
        r5 = 1;
        r8 = 0;
        goto L_0x008a;
    L_0x012d:
        r0.a(r1);
        r17.i();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.d():void");
    }

    public final am e() {
        return this.f;
    }
}
