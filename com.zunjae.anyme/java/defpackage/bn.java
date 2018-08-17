package defpackage;

public final class bn extends bp {
    az a;
    float b;
    bn c;
    float d;
    bn e;
    float f;
    int g = 0;
    private bn j;
    private float k;
    private bo l = null;
    private int m = 1;
    private bo n = null;
    private int o = 1;

    public bn(az azVar) {
        this.a = azVar;
    }

    private static String a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public final void a() {
        Object obj = 1;
        if (this.i != 1 && this.g != 4) {
            bn bnVar;
            float f;
            aq a;
            bn bnVar2;
            bn bnVar3;
            bo boVar = this.l;
            if (boVar != null) {
                if (boVar.i == 1) {
                    this.d = ((float) this.m) * boVar.a;
                } else {
                    return;
                }
            }
            boVar = this.n;
            if (boVar != null) {
                if (boVar.i == 1) {
                    this.k = ((float) this.o) * boVar.a;
                } else {
                    return;
                }
            }
            if (this.g == 1) {
                bnVar = this.c;
                if (bnVar == null || bnVar.i == 1) {
                    bnVar = this.c;
                    if (bnVar == null) {
                        this.e = this;
                        f = this.d;
                    } else {
                        this.e = bnVar.e;
                        f = bnVar.f + this.d;
                    }
                    this.f = f;
                    e();
                    return;
                }
            }
            if (this.g == 2) {
                bnVar = this.c;
                if (bnVar != null && bnVar.i == 1) {
                    bnVar = this.j;
                    if (bnVar != null) {
                        bnVar = bnVar.c;
                        if (bnVar != null && bnVar.i == 1) {
                            float f2;
                            int d;
                            int d2;
                            float f3;
                            float f4;
                            if (ao.a() != null) {
                                a = ao.a();
                                a.w++;
                            }
                            this.e = this.c.e;
                            bnVar = this.j;
                            bnVar.e = bnVar.c.e;
                            bd bdVar = this.a.b;
                            int i = 0;
                            if (bdVar != bd.RIGHT) {
                                if (bdVar != bd.BOTTOM) {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                f = this.c.f;
                                bnVar2 = this.j.c;
                            } else {
                                f = this.j.c.f;
                                bnVar2 = this.c;
                            }
                            f -= bnVar2.f;
                            az azVar = this.a;
                            bd bdVar2 = azVar.b;
                            if (bdVar2 != bd.LEFT) {
                                if (bdVar2 != bd.RIGHT) {
                                    f -= (float) azVar.a.p();
                                    f2 = this.a.a.Q;
                                    d = this.a.d();
                                    d2 = this.j.a.d();
                                    if (this.a.c != this.j.a.c) {
                                        f2 = 0.5f;
                                        d2 = 0;
                                    } else {
                                        i = d;
                                    }
                                    f3 = (float) i;
                                    f4 = (float) d2;
                                    f = (f - f3) - f4;
                                    if (obj == null) {
                                        bnVar3 = this.j;
                                        bnVar3.f = (bnVar3.c.f + f4) + (f * f2);
                                        this.f = (this.c.f - f3) - (f * (1.0f - f2));
                                    } else {
                                        this.f = (this.c.f + f3) + (f * f2);
                                        bnVar3 = this.j;
                                        bnVar3.f = (bnVar3.c.f - f4) - (f * (1.0f - f2));
                                    }
                                    e();
                                    this.j.e();
                                    return;
                                }
                            }
                            f -= (float) this.a.a.n();
                            f2 = this.a.a.P;
                            d = this.a.d();
                            d2 = this.j.a.d();
                            if (this.a.c != this.j.a.c) {
                                i = d;
                            } else {
                                f2 = 0.5f;
                                d2 = 0;
                            }
                            f3 = (float) i;
                            f4 = (float) d2;
                            f = (f - f3) - f4;
                            if (obj == null) {
                                this.f = (this.c.f + f3) + (f * f2);
                                bnVar3 = this.j;
                                bnVar3.f = (bnVar3.c.f - f4) - (f * (1.0f - f2));
                            } else {
                                bnVar3 = this.j;
                                bnVar3.f = (bnVar3.c.f + f4) + (f * f2);
                                this.f = (this.c.f - f3) - (f * (1.0f - f2));
                            }
                            e();
                            this.j.e();
                            return;
                        }
                    }
                }
            }
            if (this.g == 3) {
                bnVar = this.c;
                if (bnVar != null && bnVar.i == 1) {
                    bnVar = this.j;
                    if (bnVar != null) {
                        bnVar = bnVar.c;
                        if (bnVar != null && bnVar.i == 1) {
                            if (ao.a() != null) {
                                a = ao.a();
                                a.x++;
                            }
                            bnVar = this.c;
                            this.e = bnVar.e;
                            bnVar3 = this.j;
                            bnVar2 = bnVar3.c;
                            bnVar3.e = bnVar2.e;
                            this.f = bnVar.f + this.d;
                            bnVar3.f = bnVar2.f + bnVar3.d;
                            e();
                            this.j.e();
                            return;
                        }
                    }
                }
            }
            if (this.g == 5) {
                this.a.a.c();
            }
        }
    }

    final void a(ao aoVar) {
        au auVar = this.a.f;
        bn bnVar = this.e;
        if (bnVar == null) {
            aoVar.a(auVar, (int) this.f);
        } else {
            aoVar.c(auVar, aoVar.a(bnVar.a), (int) this.f, 6);
        }
    }

    public final void a(bn bnVar, float f) {
        if (this.i == 0 || !(this.e == bnVar || this.f == f)) {
            this.e = bnVar;
            this.f = f;
            if (this.i == 1) {
                d();
            }
            e();
        }
    }

    public final void a(bn bnVar, int i) {
        this.g = 1;
        this.c = bnVar;
        this.d = (float) i;
        this.c.a(this);
    }

    public final void a(bn bnVar, int i, bo boVar) {
        this.c = bnVar;
        this.c.a(this);
        this.l = boVar;
        this.m = i;
        this.l.a(this);
    }

    public final void b() {
        super.b();
        this.c = null;
        this.d = 0.0f;
        this.l = null;
        this.m = 1;
        this.n = null;
        this.o = 1;
        this.e = null;
        this.f = 0.0f;
        this.b = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.g = 0;
    }

    public final void b(bn bnVar, float f) {
        this.j = bnVar;
        this.k = f;
    }

    public final void b(bn bnVar, int i) {
        this.c = bnVar;
        this.d = (float) i;
        this.c.a(this);
    }

    public final void b(bn bnVar, int i, bo boVar) {
        this.j = bnVar;
        this.n = boVar;
        this.o = i;
    }

    public final float c() {
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        String str;
        if (this.i != 1) {
            stringBuilder = new StringBuilder("{ ");
            stringBuilder.append(this.a);
            str = " UNRESOLVED} type: ";
        } else if (this.e == this) {
            stringBuilder = new StringBuilder("[");
            stringBuilder.append(this.a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f);
            str = "]  type: ";
        } else {
            stringBuilder = new StringBuilder("[");
            stringBuilder.append(this.a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.e);
            stringBuilder.append(":");
            stringBuilder.append(this.f);
            str = "] type: ";
        }
        stringBuilder.append(str);
        stringBuilder.append(bn.a(this.g));
        return stringBuilder.toString();
    }
}
