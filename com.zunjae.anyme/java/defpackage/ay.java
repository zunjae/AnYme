package defpackage;

import java.util.ArrayList;

public final class ay {
    protected be a;
    protected be b;
    protected be c;
    protected be d;
    protected be e;
    protected be f;
    protected be g;
    protected ArrayList<be> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    private int o;
    private boolean p = false;
    private boolean q;

    public ay(be beVar, int i, boolean z) {
        this.a = beVar;
        this.o = i;
        this.p = z;
    }

    public final void a() {
        if (!this.q) {
            int i = this.o * 2;
            boolean z = false;
            be beVar = this.a;
            Object obj = null;
            while (obj == null) {
                be beVar2;
                this.i++;
                be[] beVarArr = beVar.Z;
                int i2 = this.o;
                be beVar3 = null;
                beVarArr[i2] = null;
                beVar.Y[i2] = null;
                if (beVar.j() != 8) {
                    if (this.b == null) {
                        this.b = beVar;
                    }
                    beVar2 = this.d;
                    if (beVar2 != null) {
                        beVar2.Z[this.o] = beVar;
                    }
                    this.d = beVar;
                    int[] iArr = beVar.B;
                    int i3 = this.o;
                    if (iArr[i3] == bg.c) {
                        iArr = beVar.g;
                        if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                            Object obj2;
                            this.j++;
                            float[] fArr = beVar.X;
                            i3 = this.o;
                            float f = fArr[i3];
                            if (f > 0.0f) {
                                this.k += fArr[i3];
                            }
                            int i4 = this.o;
                            if (beVar.j() != 8 && beVar.B[i4] == bg.c) {
                                int[] iArr2 = beVar.g;
                                if (iArr2[i4] == 0 || iArr2[i4] == 3) {
                                    obj2 = 1;
                                    if (obj2 != null) {
                                        if (f >= 0.0f) {
                                            this.l = true;
                                        } else {
                                            this.m = true;
                                        }
                                        if (this.h == null) {
                                            this.h = new ArrayList();
                                        }
                                        this.h.add(beVar);
                                    }
                                    if (this.f == null) {
                                        this.f = beVar;
                                    }
                                    beVar2 = this.g;
                                    if (beVar2 != null) {
                                        beVar2.Y[this.o] = beVar;
                                    }
                                    this.g = beVar;
                                }
                            }
                            obj2 = null;
                            if (obj2 != null) {
                                if (f >= 0.0f) {
                                    this.m = true;
                                } else {
                                    this.l = true;
                                }
                                if (this.h == null) {
                                    this.h = new ArrayList();
                                }
                                this.h.add(beVar);
                            }
                            if (this.f == null) {
                                this.f = beVar;
                            }
                            beVar2 = this.g;
                            if (beVar2 != null) {
                                beVar2.Y[this.o] = beVar;
                            }
                            this.g = beVar;
                        }
                    }
                }
                az azVar = beVar.z[i + 1].c;
                if (azVar != null) {
                    beVar2 = azVar.a;
                    az[] azVarArr = beVar2.z;
                    if (azVarArr[i].c != null) {
                        if (azVarArr[i].c.a == beVar) {
                            beVar3 = beVar2;
                        }
                    }
                }
                if (beVar3 != null) {
                    beVar = beVar3;
                } else {
                    obj = 1;
                }
            }
            this.c = beVar;
            be beVar4 = (this.o == 0 && this.p) ? this.c : this.a;
            this.e = beVar4;
            if (this.m && this.l) {
                z = true;
            }
            this.n = z;
        }
        this.q = true;
    }
}
