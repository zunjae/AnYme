package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public class al implements ap {
    au a = null;
    float b = 0.0f;
    boolean c = false;
    public final ak d;
    boolean e = false;

    public al(am amVar) {
        this.d = new ak(this, amVar);
    }

    public final al a(float f, float f2, float f3, au auVar, au auVar2, au auVar3, au auVar4) {
        this.b = 0.0f;
        if (f2 != 0.0f) {
            if (f != f3) {
                if (f == 0.0f) {
                    this.d.a(auVar, 1.0f);
                    this.d.a(auVar2, -1.0f);
                } else if (f3 == 0.0f) {
                    this.d.a(auVar3, 1.0f);
                    this.d.a(auVar4, -1.0f);
                } else {
                    f = (f / f2) / (f3 / f2);
                    this.d.a(auVar, 1.0f);
                    this.d.a(auVar2, -1.0f);
                    this.d.a(auVar4, f);
                    this.d.a(auVar3, -f);
                }
                return this;
            }
        }
        this.d.a(auVar, 1.0f);
        this.d.a(auVar2, -1.0f);
        this.d.a(auVar4, 1.0f);
        this.d.a(auVar3, -1.0f);
        return this;
    }

    public final al a(ao aoVar, int i) {
        this.d.a(aoVar.a(i), 1.0f);
        this.d.a(aoVar.a(i), -1.0f);
        return this;
    }

    public final al a(au auVar, au auVar2, au auVar3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.b = (float) i;
        }
        if (obj == null) {
            this.d.a(auVar, -1.0f);
            this.d.a(auVar2, 1.0f);
            this.d.a(auVar3, 1.0f);
        } else {
            this.d.a(auVar, 1.0f);
            this.d.a(auVar2, -1.0f);
            this.d.a(auVar3, -1.0f);
        }
        return this;
    }

    public final al a(au auVar, au auVar2, au auVar3, au auVar4, float f) {
        this.d.a(auVar, -1.0f);
        this.d.a(auVar2, 1.0f);
        this.d.a(auVar3, f);
        this.d.a(auVar4, -f);
        return this;
    }

    public final au a(boolean[] zArr) {
        return this.d.a(zArr, null);
    }

    public final void a() {
        this.d.a();
        this.a = null;
        this.b = 0.0f;
    }

    public final void a(ap apVar) {
        if (apVar instanceof al) {
            al alVar = (al) apVar;
            this.a = null;
            this.d.a();
            int i = 0;
            while (true) {
                ak akVar = alVar.d;
                if (i < akVar.a) {
                    this.d.a(akVar.a(i), alVar.d.b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    final boolean a(au auVar) {
        return this.d.a(auVar);
    }

    public final al b(au auVar, au auVar2, au auVar3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.b = (float) i;
        }
        if (obj == null) {
            this.d.a(auVar, -1.0f);
            this.d.a(auVar2, 1.0f);
            this.d.a(auVar3, -1.0f);
        } else {
            this.d.a(auVar, 1.0f);
            this.d.a(auVar2, -1.0f);
            this.d.a(auVar3, 1.0f);
        }
        return this;
    }

    public final al b(au auVar, au auVar2, au auVar3, au auVar4, float f) {
        this.d.a(auVar3, 0.5f);
        this.d.a(auVar4, 0.5f);
        this.d.a(auVar, -0.5f);
        this.d.a(auVar2, -0.5f);
        this.b = -f;
        return this;
    }

    public final au b() {
        return this.a;
    }

    final void b(au auVar) {
        au auVar2 = this.a;
        if (auVar2 != null) {
            this.d.a(auVar2, -1.0f);
            this.a = null;
        }
        float a = this.d.a(auVar, true) * -1.0f;
        this.a = auVar;
        if (a != 1.0f) {
            this.b /= a;
            this.d.a(a);
        }
    }

    public void c(au auVar) {
        int i = auVar.c;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(auVar, f);
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        Object obj;
        String str = BuildConfig.FLAVOR;
        if (this.a == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.a);
        }
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" = ");
        str = stringBuilder.toString();
        if (this.b != 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.b);
            stringBuilder2 = stringBuilder.toString();
            obj = 1;
        } else {
            stringBuilder2 = str;
            obj = null;
        }
        int i = this.d.a;
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder stringBuilder3;
            au a = this.d.a(i2);
            if (a != null) {
                float b = this.d.b(i2);
                if (b != 0.0f) {
                    String auVar = a.toString();
                    if (obj == null) {
                        if (b < 0.0f) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder2 = "- ";
                        }
                        if (b == 1.0f) {
                            stringBuilder3 = new StringBuilder();
                        } else {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder3.append(b);
                            stringBuilder2 = " ";
                        }
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(auVar);
                        stringBuilder2 = stringBuilder3.toString();
                        obj = 1;
                    } else if (b > 0.0f) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(" + ");
                        stringBuilder2 = stringBuilder3.toString();
                        if (b == 1.0f) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder3.append(b);
                            stringBuilder2 = " ";
                        } else {
                            stringBuilder3 = new StringBuilder();
                        }
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(auVar);
                        stringBuilder2 = stringBuilder3.toString();
                        obj = 1;
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder2 = " - ";
                    }
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder2 = stringBuilder3.toString();
                    b *= -1.0f;
                    if (b == 1.0f) {
                        stringBuilder3 = new StringBuilder();
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(b);
                        stringBuilder2 = " ";
                    }
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(auVar);
                    stringBuilder2 = stringBuilder3.toString();
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            return stringBuilder2;
        }
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("0.0");
        return stringBuilder3.toString();
    }
}
