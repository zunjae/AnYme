package defpackage;

import java.util.Arrays;

public final class bh extends bs {
    protected ao ac = new ao();
    int ad;
    int ae;
    int af;
    int ag;
    int ah = 0;
    int ai = 0;
    ay[] aj = new ay[4];
    ay[] ak = new ay[4];
    int al = 0;
    private boolean an = false;
    private bq ao;
    private int ap = 3;
    private boolean aq = false;
    private boolean ar = false;

    private void N() {
        int size = this.am.size();
        b();
        for (int i = 0; i < size; i++) {
            ((be) this.am.get(i)).b();
        }
    }

    public final int G() {
        return this.ap;
    }

    public final boolean H() {
        return this.aq;
    }

    public final boolean I() {
        return this.ar;
    }

    public final void J() {
        int i;
        Exception e;
        int i2;
        be beVar;
        Object obj;
        int i3 = this.H;
        int i4 = this.I;
        int max = Math.max(0, n());
        int max2 = Math.max(0, p());
        this.aq = false;
        this.ar = false;
        if (this.C != null) {
            if (r1.ao == null) {
                r1.ao = new bq(r1);
            }
            r1.ao.a(r1);
            f(r1.ad);
            g(r1.ae);
            C();
            a(r1.ac.e());
        } else {
            r1.H = 0;
            r1.I = 0;
        }
        if (r1.ap != 0) {
            if (!s(8)) {
                N();
            }
            if (!s(8)) {
                b(r1.ap);
            }
            L();
            r1.ac.c = true;
        } else {
            r1.ac.c = false;
        }
        int[] iArr = r1.B;
        int i5 = iArr[1];
        int i6 = iArr[0];
        r1.ah = 0;
        r1.ai = 0;
        int size = r1.am.size();
        for (i = 0; i < size; i++) {
            be beVar2 = (be) r1.am.get(i);
            if (beVar2 instanceof bs) {
                ((bs) beVar2).J();
            }
        }
        i = 0;
        Object obj2 = 1;
        Object obj3 = null;
        while (obj2 != null) {
            Object obj4;
            int size2;
            int i7;
            int i8;
            boolean[] zArr;
            int i9;
            boolean z;
            int i10 = i + 1;
            Object obj5;
            try {
                r1.ac.b();
                b(r1.ac);
                i = 0;
                while (i < size) {
                    try {
                        ((be) r1.am.get(i)).b(r1.ac);
                        i++;
                    } catch (Exception e2) {
                        e = e2;
                        obj4 = obj2;
                    }
                }
                ao aoVar = r1.ac;
                a(aoVar);
                size2 = r1.am.size();
                i7 = 0;
                while (i7 < size2) {
                    int i11;
                    be beVar3 = (be) r1.am.get(i7);
                    if (beVar3 instanceof bh) {
                        i8 = beVar3.B[0];
                        i11 = size2;
                        size2 = beVar3.B[1];
                        obj5 = obj2;
                        try {
                            if (i8 == bg.b) {
                                beVar3.q(bg.a);
                            }
                            if (size2 == bg.b) {
                                beVar3.r(bg.a);
                            }
                            beVar3.a(aoVar);
                            if (i8 == bg.b) {
                                beVar3.q(i8);
                            }
                            if (size2 == bg.b) {
                                beVar3.r(size2);
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } else {
                        i11 = size2;
                        obj5 = obj2;
                        bl.a(r1, aoVar, beVar3);
                        beVar3.a(aoVar);
                    }
                    i7++;
                    size2 = i11;
                    obj2 = obj5;
                }
                obj5 = obj2;
                if (r1.ah > 0) {
                    ax.a(r1, aoVar, 0);
                }
                if (r1.ai > 0) {
                    ax.a(r1, aoVar, 1);
                }
                try {
                    r1.ac.d();
                    obj4 = 1;
                } catch (Exception e4) {
                    e = e4;
                    obj4 = 1;
                    e.printStackTrace();
                    System.out.println("EXCEPTION : ".concat(String.valueOf(e)));
                    if (obj4 == null) {
                        zArr = bl.a;
                        i2 = 0;
                        zArr[2] = false;
                        F();
                        size2 = r1.am.size();
                        i9 = 0;
                        while (i9 < size2) {
                            beVar2 = (be) r1.am.get(i9);
                            beVar2.F();
                            if (beVar2.B[i2] == bg.c) {
                            }
                            i7 = 1;
                            zArr[2] = true;
                            i9++;
                            i2 = 0;
                        }
                    } else {
                        F();
                        for (i = 0; i < size; i++) {
                            beVar = (be) r1.am.get(i);
                            if (beVar.B[0] == bg.c) {
                            }
                            if (beVar.B[1] == bg.c) {
                            }
                        }
                    }
                    i8 = 2;
                    if (i10 < 8) {
                    }
                    obj4 = obj3;
                    obj = null;
                    i8 = Math.max(r1.M, n());
                    if (i8 > n()) {
                        h(i8);
                        r1.B[0] = bg.a;
                        obj = 1;
                        obj4 = 1;
                    }
                    i8 = Math.max(r1.N, p());
                    if (i8 > p()) {
                        i(i8);
                        z = true;
                        r1.B[1] = bg.a;
                        obj = 1;
                        obj4 = 1;
                    } else {
                        z = true;
                    }
                    if (obj4 == null) {
                        r1.aq = z;
                        r1.B[0] = bg.a;
                        h(max);
                        obj = 1;
                        obj4 = 1;
                        r1.ar = z;
                        r1.B[z] = bg.a;
                        i(max2);
                        obj2 = 1;
                        obj3 = 1;
                        i = i10;
                    }
                    obj2 = obj;
                    obj3 = obj4;
                    i = i10;
                }
            } catch (Exception e5) {
                e = e5;
                obj5 = obj2;
                obj4 = obj5;
                e.printStackTrace();
                System.out.println("EXCEPTION : ".concat(String.valueOf(e)));
                if (obj4 == null) {
                    F();
                    for (i = 0; i < size; i++) {
                        beVar = (be) r1.am.get(i);
                        if (beVar.B[0] == bg.c) {
                        }
                        if (beVar.B[1] == bg.c) {
                        }
                    }
                } else {
                    zArr = bl.a;
                    i2 = 0;
                    zArr[2] = false;
                    F();
                    size2 = r1.am.size();
                    i9 = 0;
                    while (i9 < size2) {
                        beVar2 = (be) r1.am.get(i9);
                        beVar2.F();
                        if (beVar2.B[i2] == bg.c) {
                        }
                        i7 = 1;
                        zArr[2] = true;
                        i9++;
                        i2 = 0;
                    }
                }
                i8 = 2;
                if (i10 < 8) {
                }
                obj4 = obj3;
                obj = null;
                i8 = Math.max(r1.M, n());
                if (i8 > n()) {
                    h(i8);
                    r1.B[0] = bg.a;
                    obj = 1;
                    obj4 = 1;
                }
                i8 = Math.max(r1.N, p());
                if (i8 > p()) {
                    z = true;
                } else {
                    i(i8);
                    z = true;
                    r1.B[1] = bg.a;
                    obj = 1;
                    obj4 = 1;
                }
                if (obj4 == null) {
                    r1.aq = z;
                    r1.B[0] = bg.a;
                    h(max);
                    obj = 1;
                    obj4 = 1;
                    r1.ar = z;
                    r1.B[z] = bg.a;
                    i(max2);
                    obj2 = 1;
                    obj3 = 1;
                    i = i10;
                }
                obj2 = obj;
                obj3 = obj4;
                i = i10;
            }
            if (obj4 == null) {
                F();
                while (i < size) {
                    beVar = (be) r1.am.get(i);
                    if (beVar.B[0] == bg.c || beVar.n() >= beVar.o()) {
                        if (beVar.B[1] == bg.c && beVar.p() < beVar.q()) {
                            i8 = 2;
                            bl.a[2] = true;
                            break;
                        }
                    } else {
                        i8 = 2;
                        bl.a[2] = true;
                        break;
                    }
                }
            }
            zArr = bl.a;
            i2 = 0;
            zArr[2] = false;
            F();
            size2 = r1.am.size();
            i9 = 0;
            while (i9 < size2) {
                beVar2 = (be) r1.am.get(i9);
                beVar2.F();
                if (beVar2.B[i2] == bg.c || beVar2.n() >= beVar2.o()) {
                    i7 = 1;
                } else {
                    i7 = 1;
                    zArr[2] = true;
                }
                if (beVar2.B[i7] == bg.c && beVar2.p() < beVar2.q()) {
                    zArr[2] = true;
                }
                i9++;
                i2 = 0;
            }
            i8 = 2;
            if (i10 < 8 || !bl.a[r4]) {
                obj4 = obj3;
                obj = null;
            } else {
                i8 = 0;
                i9 = 0;
                for (i = 0; i < size; i++) {
                    beVar2 = (be) r1.am.get(i);
                    i8 = Math.max(i8, beVar2.H + beVar2.n());
                    i9 = Math.max(i9, beVar2.I + beVar2.p());
                }
                i = Math.max(r1.M, i8);
                i8 = Math.max(r1.N, i9);
                if (i6 != bg.b || n() >= i) {
                    obj = null;
                } else {
                    h(i);
                    r1.B[0] = bg.b;
                    obj = 1;
                    obj3 = 1;
                }
                if (i5 != bg.b || p() >= i8) {
                    obj4 = obj3;
                } else {
                    i(i8);
                    r1.B[1] = bg.b;
                    obj = 1;
                    obj4 = 1;
                }
            }
            i8 = Math.max(r1.M, n());
            if (i8 > n()) {
                h(i8);
                r1.B[0] = bg.a;
                obj = 1;
                obj4 = 1;
            }
            i8 = Math.max(r1.N, p());
            if (i8 > p()) {
                i(i8);
                z = true;
                r1.B[1] = bg.a;
                obj = 1;
                obj4 = 1;
            } else {
                z = true;
            }
            if (obj4 == null) {
                if (r1.B[0] == bg.b && max > 0 && n() > max) {
                    r1.aq = z;
                    r1.B[0] = bg.a;
                    h(max);
                    obj = 1;
                    obj4 = 1;
                }
                if (r1.B[z] == bg.b && max2 > 0 && p() > max2) {
                    r1.ar = z;
                    r1.B[z] = bg.a;
                    i(max2);
                    obj2 = 1;
                    obj3 = 1;
                    i = i10;
                }
            }
            obj2 = obj;
            obj3 = obj4;
            i = i10;
        }
        if (r1.C != null) {
            i = Math.max(r1.M, n());
            i3 = Math.max(r1.N, p());
            r1.ao.b(r1);
            h((i + r1.ad) + r1.af);
            i((i3 + r1.ae) + r1.ag);
        } else {
            r1.H = i3;
            r1.I = i4;
        }
        if (obj3 != null) {
            iArr = r1.B;
            iArr[0] = i6;
            iArr[1] = i5;
        }
        a(r1.ac.e());
        be beVar4 = r1.C;
        be beVar5 = (bh) r1;
        while (beVar4 != null) {
            be beVar6 = beVar4.C;
            if (beVar4 instanceof bh) {
                beVar5 = (bh) beVar4;
            }
            beVar4 = beVar6;
        }
        if (r1 == beVar5) {
            B();
        }
    }

    public final void K() {
        N();
        b(this.ap);
    }

    public final void L() {
        bn a = a(bd.LEFT).a();
        bn a2 = a(bd.TOP).a();
        a.a(null, 0.0f);
        a2.a(null, 0.0f);
    }

    public final void a(int i) {
        this.ap = i;
    }

    final void a(be beVar, int i) {
        ay[] ayVarArr;
        if (i == 0) {
            i = this.ah + 1;
            ayVarArr = this.ak;
            if (i >= ayVarArr.length) {
                this.ak = (ay[]) Arrays.copyOf(ayVarArr, ayVarArr.length * 2);
            }
            this.ak[this.ah] = new ay(beVar, 0, this.an);
            this.ah++;
            return;
        }
        if (i == 1) {
            i = this.ai + 1;
            ayVarArr = this.aj;
            if (i >= ayVarArr.length) {
                this.aj = (ay[]) Arrays.copyOf(ayVarArr, ayVarArr.length * 2);
            }
            this.aj[this.ai] = new ay(beVar, 1, this.an);
            this.ai++;
        }
    }

    public final void a(boolean z) {
        this.an = z;
    }

    public final void b(int i) {
        super.b(i);
        int size = this.am.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((be) this.am.get(i2)).b(i);
        }
    }

    public final void e(int i, int i2) {
        if (this.B[0] != bg.b) {
            bo boVar = this.c;
            if (boVar != null) {
                boVar.a(i);
            }
        }
        if (this.B[1] != bg.b) {
            bo boVar2 = this.d;
            if (boVar2 != null) {
                boVar2.a(i2);
            }
        }
    }

    public final void f() {
        this.ac.b();
        this.ad = 0;
        this.af = 0;
        this.ae = 0;
        this.ag = 0;
        super.f();
    }

    public final boolean s(int i) {
        return (this.ap & i) == i;
    }
}
