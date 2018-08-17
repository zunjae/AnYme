package defpackage;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class ak {
    int a = 0;
    private final al b;
    private final am c;
    private int d = 8;
    private au e = null;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;

    ak(al alVar, am amVar) {
        int i = this.d;
        this.f = new int[i];
        this.g = new int[i];
        this.h = new float[i];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = alVar;
        this.c = amVar;
    }

    private static boolean c(au auVar) {
        return auVar.i <= 1;
    }

    public final float a(au auVar, boolean z) {
        if (this.e == auVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == auVar.a) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    auVar.b(this.b);
                }
                auVar.i--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    final au a(int i) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (i3 == i) {
                return this.c.c[this.f[i2]];
            }
            i2 = this.g[i2];
            i3++;
        }
        return null;
    }

    final au a(boolean[] zArr, au auVar) {
        int i = this.i;
        int i2 = 0;
        au auVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.a) {
            if (this.h[i] < 0.0f) {
                au auVar3 = this.c.c[this.f[i]];
                if ((zArr == null || !zArr[auVar3.a]) && auVar3 != auVar) {
                    int i3 = auVar3.f;
                    if (i3 == av.c || i3 == av.d) {
                        float f2 = this.h[i];
                        if (f2 < f) {
                            auVar2 = auVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.g[i];
            i2++;
        }
        return auVar2;
    }

    public final void a() {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            au auVar = this.c.c[this.f[i]];
            if (auVar != null) {
                auVar.b(this.b);
            }
            i = this.g[i];
            i2++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    final void a(float f) {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
            i2++;
        }
    }

    final void a(al alVar, al alVar2) {
        int i = this.i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.a) {
                int i3 = this.f[i];
                au auVar = alVar2.a;
                if (i3 == auVar.a) {
                    float f = this.h[i];
                    a(auVar, false);
                    ak akVar = alVar2.d;
                    i3 = akVar.i;
                    int i4 = 0;
                    while (i3 != -1 && i4 < akVar.a) {
                        a(this.c.c[akVar.f[i3]], akVar.h[i3] * f, false);
                        i3 = akVar.g[i3];
                        i4++;
                    }
                    alVar.b += alVar2.b * f;
                    i = this.i;
                } else {
                    i = this.g[i];
                    i2++;
                }
            }
            return;
        }
    }

    final void a(al alVar, al[] alVarArr) {
        int i = this.i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.a) {
                au auVar = this.c.c[this.f[i]];
                if (auVar.b != -1) {
                    float f = this.h[i];
                    a(auVar, true);
                    al alVar2 = alVarArr[auVar.b];
                    if (!alVar2.e) {
                        ak akVar = alVar2.d;
                        int i3 = akVar.i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < akVar.a) {
                            a(this.c.c[akVar.f[i3]], akVar.h[i3] * f, true);
                            i3 = akVar.g[i3];
                            i4++;
                        }
                    }
                    alVar.b += alVar2.b * f;
                    alVar2.a.b(alVar);
                    i = this.i;
                } else {
                    i = this.g[i];
                    i2++;
                }
            }
            return;
        }
    }

    public final void a(au auVar, float f) {
        if (f == 0.0f) {
            a(auVar, true);
            return;
        }
        int i = this.i;
        int i2;
        int[] iArr;
        if (i == -1) {
            this.i = 0;
            float[] fArr = this.h;
            int i3 = this.i;
            fArr[i3] = f;
            this.f[i3] = auVar.a;
            this.g[i3] = -1;
            auVar.i++;
            auVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
                i2 = this.j;
                iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                }
            }
            return;
        }
        int[] iArr2;
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.a) {
            int[] iArr3 = this.f;
            int i6 = iArr3[i];
            int i7 = auVar.a;
            if (i6 == i7) {
                this.h[i] = f;
                return;
            }
            if (iArr3[i] < i7) {
                i5 = i;
            }
            i = this.g[i];
            i4++;
        }
        i = this.j;
        i4 = i + 1;
        if (this.k) {
            iArr2 = this.f;
            if (iArr2[i] != -1) {
                i = iArr2.length;
            }
        } else {
            i = i4;
        }
        iArr2 = this.f;
        if (i >= iArr2.length && this.a < iArr2.length) {
            i4 = 0;
            while (true) {
                iArr3 = this.f;
                if (i4 >= iArr3.length) {
                    break;
                } else if (iArr3[i4] == -1) {
                    break;
                } else {
                    i4++;
                }
            }
            i = i4;
        }
        iArr2 = this.f;
        if (i >= iArr2.length) {
            i = iArr2.length;
            this.d *= 2;
            this.k = false;
            this.j = i - 1;
            this.h = Arrays.copyOf(this.h, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i] = auVar.a;
        this.h[i] = f;
        if (i5 != -1) {
            iArr = this.g;
            iArr[i] = iArr[i5];
            iArr[i5] = i;
        } else {
            this.g[i] = this.i;
            this.i = i;
        }
        auVar.i++;
        auVar.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.f.length) {
            this.k = true;
        }
        i2 = this.j;
        iArr = this.f;
        if (i2 >= iArr.length) {
            this.k = true;
            this.j = iArr.length - 1;
        }
    }

    final void a(au auVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.i;
            int i2;
            int i3;
            int[] iArr;
            if (i == -1) {
                this.i = 0;
                float[] fArr = this.h;
                i2 = this.i;
                fArr[i2] = f;
                this.f[i2] = auVar.a;
                this.g[i2] = -1;
                auVar.i++;
                auVar.a(this.b);
                this.a++;
                if (!this.k) {
                    this.j++;
                    i3 = this.j;
                    iArr = this.f;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                    }
                }
                return;
            }
            int[] iArr2;
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.a) {
                int[] iArr3 = this.f;
                int i6 = iArr3[i];
                int i7 = auVar.a;
                if (i6 == i7) {
                    float[] fArr2 = this.h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            iArr = this.g;
                            iArr[i5] = iArr[i];
                        }
                        if (z) {
                            auVar.b(this.b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        auVar.i--;
                        this.a--;
                    }
                    return;
                }
                if (iArr3[i] < i7) {
                    i5 = i;
                }
                i = this.g[i];
                i4++;
            }
            int i8 = this.j;
            i2 = i8 + 1;
            if (this.k) {
                iArr2 = this.f;
                if (iArr2[i8] != -1) {
                    i8 = iArr2.length;
                }
            } else {
                i8 = i2;
            }
            iArr2 = this.f;
            if (i8 >= iArr2.length && this.a < iArr2.length) {
                i2 = 0;
                while (true) {
                    int[] iArr4 = this.f;
                    if (i2 >= iArr4.length) {
                        break;
                    } else if (iArr4[i2] == -1) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i8 = i2;
            }
            iArr2 = this.f;
            if (i8 >= iArr2.length) {
                i8 = iArr2.length;
                this.d *= 2;
                this.k = false;
                this.j = i8 - 1;
                this.h = Arrays.copyOf(this.h, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i8] = auVar.a;
            this.h[i8] = f;
            if (i5 != -1) {
                iArr = this.g;
                iArr[i8] = iArr[i5];
                iArr[i5] = i8;
            } else {
                this.g[i8] = this.i;
                this.i = i8;
            }
            auVar.i++;
            auVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            i3 = this.j;
            iArr = this.f;
            if (i3 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
            }
        }
    }

    final boolean a(au auVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == auVar.a) {
                return true;
            }
            i = this.g[i];
            i2++;
        }
        return false;
    }

    final float b(int i) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float b(au auVar) {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == auVar.a) {
                return this.h[i];
            }
            i = this.g[i];
            i2++;
        }
        return 0.0f;
    }

    final void b() {
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.g[i];
            i2++;
        }
    }

    final au c() {
        int i = this.i;
        au auVar = null;
        int i2 = 0;
        au auVar2 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        while (i != -1 && i2 < this.a) {
            float[] fArr = this.h;
            float f3 = fArr[i];
            au auVar3 = this.c.c[this.f[i]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    fArr[i] = 0.0f;
                }
                if (f3 != 0.0f) {
                    if (auVar3.f == av.a) {
                        if (auVar != null) {
                            if (f > f3) {
                                if (!z && ak.c(auVar3)) {
                                    f = f3;
                                    auVar = auVar3;
                                    z = true;
                                }
                            }
                        }
                        z = ak.c(auVar3);
                        f = f3;
                        auVar = auVar3;
                    } else if (auVar == null && f3 < 0.0f) {
                        if (auVar2 != null) {
                            if (f2 > f3) {
                                if (!z2 && ak.c(auVar3)) {
                                    f2 = f3;
                                    auVar2 = auVar3;
                                    z2 = true;
                                }
                            }
                        }
                        z2 = ak.c(auVar3);
                        f2 = f3;
                        auVar2 = auVar3;
                    }
                }
                i = this.g[i];
                i2++;
            } else {
                if (f3 < 0.001f) {
                    fArr[i] = 0.0f;
                }
                if (f3 != 0.0f) {
                    if (auVar3.f == av.a) {
                        if (auVar2 != null) {
                            if (f2 > f3) {
                                f2 = f3;
                                auVar2 = auVar3;
                                z2 = true;
                            }
                        }
                        z2 = ak.c(auVar3);
                        f2 = f3;
                        auVar2 = auVar3;
                    } else {
                        if (auVar != null) {
                            if (f > f3) {
                                f = f3;
                                auVar = auVar3;
                                z = true;
                            }
                        }
                        z = ak.c(auVar3);
                        f = f3;
                        auVar = auVar3;
                    }
                }
                i = this.g[i];
                i2++;
            }
            auVar3.b(this.b);
            f3 = 0.0f;
            if (f3 != 0.0f) {
                if (auVar3.f == av.a) {
                    if (auVar != null) {
                        if (f > f3) {
                            f = f3;
                            auVar = auVar3;
                            z = true;
                        }
                    }
                    z = ak.c(auVar3);
                    f = f3;
                    auVar = auVar3;
                } else {
                    if (auVar2 != null) {
                        if (f2 > f3) {
                            f2 = f3;
                            auVar2 = auVar3;
                            z2 = true;
                        }
                    }
                    z2 = ak.c(auVar3);
                    f2 = f3;
                    auVar2 = auVar3;
                }
            }
            i = this.g[i];
            i2++;
        }
        return auVar != null ? auVar : auVar2;
    }

    public final String toString() {
        String str = BuildConfig.FLAVOR;
        int i = this.i;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.h[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.c.c[this.f[i]]);
            str = stringBuilder.toString();
            i = this.g[i];
            i2++;
        }
        return str;
    }
}
