package defpackage;

import java.util.ArrayList;
import mehdi.sakout.fancybuttons.R;

public final class aw extends bk {
    private int ae = 0;
    private ArrayList<bn> af = new ArrayList(4);
    private boolean ag = true;

    public final void a(int i) {
        this.ae = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ao r11) {
        /*
        r10 = this;
        r0 = r10.z;
        r1 = r10.r;
        r2 = 0;
        r0[r2] = r1;
        r1 = r10.s;
        r3 = 2;
        r0[r3] = r1;
        r1 = r10.t;
        r4 = 1;
        r0[r4] = r1;
        r1 = r10.u;
        r5 = 3;
        r0[r5] = r1;
        r0 = 0;
    L_0x0017:
        r1 = r10.z;
        r6 = r1.length;
        if (r0 >= r6) goto L_0x0029;
    L_0x001c:
        r6 = r1[r0];
        r1 = r1[r0];
        r1 = r11.a(r1);
        r6.f = r1;
        r0 = r0 + 1;
        goto L_0x0017;
    L_0x0029:
        r0 = r10.ae;
        if (r0 < 0) goto L_0x012a;
    L_0x002d:
        r6 = 4;
        if (r0 >= r6) goto L_0x012a;
    L_0x0030:
        r0 = r1[r0];
        r1 = 0;
    L_0x0033:
        r6 = r10.ad;
        if (r1 >= r6) goto L_0x0067;
    L_0x0037:
        r6 = r10.ac;
        r6 = r6[r1];
        r7 = r10.ag;
        if (r7 != 0) goto L_0x0045;
    L_0x003f:
        r7 = r6.a();
        if (r7 == 0) goto L_0x0064;
    L_0x0045:
        r7 = r10.ae;
        if (r7 == 0) goto L_0x004b;
    L_0x0049:
        if (r7 != r4) goto L_0x0055;
    L_0x004b:
        r7 = r6.D();
        r8 = defpackage.bg.c;
        if (r7 != r8) goto L_0x0055;
    L_0x0053:
        r1 = 1;
        goto L_0x0068;
    L_0x0055:
        r7 = r10.ae;
        if (r7 == r3) goto L_0x005b;
    L_0x0059:
        if (r7 != r5) goto L_0x0064;
    L_0x005b:
        r6 = r6.E();
        r7 = defpackage.bg.c;
        if (r6 != r7) goto L_0x0064;
    L_0x0063:
        goto L_0x0053;
    L_0x0064:
        r1 = r1 + 1;
        goto L_0x0033;
    L_0x0067:
        r1 = 0;
    L_0x0068:
        r6 = r10.ae;
        if (r6 == 0) goto L_0x007a;
    L_0x006c:
        if (r6 != r4) goto L_0x006f;
    L_0x006e:
        goto L_0x007a;
    L_0x006f:
        r6 = r10.C;
        r6 = r6.E();
        r7 = defpackage.bg.b;
        if (r6 != r7) goto L_0x0085;
    L_0x0079:
        goto L_0x0084;
    L_0x007a:
        r6 = r10.C;
        r6 = r6.D();
        r7 = defpackage.bg.b;
        if (r6 != r7) goto L_0x0085;
    L_0x0084:
        r1 = 0;
    L_0x0085:
        r6 = 0;
    L_0x0086:
        r7 = r10.ad;
        if (r6 >= r7) goto L_0x00bd;
    L_0x008a:
        r7 = r10.ac;
        r7 = r7[r6];
        r8 = r10.ag;
        if (r8 != 0) goto L_0x0098;
    L_0x0092:
        r8 = r7.a();
        if (r8 == 0) goto L_0x00ba;
    L_0x0098:
        r8 = r7.z;
        r9 = r10.ae;
        r8 = r8[r9];
        r8 = r11.a(r8);
        r7 = r7.z;
        r9 = r10.ae;
        r7 = r7[r9];
        r7.f = r8;
        if (r9 == 0) goto L_0x00b5;
    L_0x00ac:
        if (r9 != r3) goto L_0x00af;
    L_0x00ae:
        goto L_0x00b5;
    L_0x00af:
        r7 = r0.f;
        r11.a(r7, r8, r1);
        goto L_0x00ba;
    L_0x00b5:
        r7 = r0.f;
        r11.b(r7, r8, r1);
    L_0x00ba:
        r6 = r6 + 1;
        goto L_0x0086;
    L_0x00bd:
        r0 = r10.ae;
        r6 = 5;
        r7 = 6;
        if (r0 != 0) goto L_0x00de;
    L_0x00c3:
        r0 = r10.t;
        r0 = r0.f;
        r3 = r10.r;
        r3 = r3.f;
        r11.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x012a;
    L_0x00d0:
        r0 = r10.r;
        r0 = r0.f;
        r1 = r10.C;
        r1 = r1.t;
    L_0x00d8:
        r1 = r1.f;
        r11.c(r0, r1, r2, r6);
        return;
    L_0x00de:
        if (r0 != r4) goto L_0x00f6;
    L_0x00e0:
        r0 = r10.r;
        r0 = r0.f;
        r3 = r10.t;
        r3 = r3.f;
        r11.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x012a;
    L_0x00ed:
        r0 = r10.r;
        r0 = r0.f;
        r1 = r10.C;
        r1 = r1.r;
        goto L_0x00d8;
    L_0x00f6:
        if (r0 != r3) goto L_0x010e;
    L_0x00f8:
        r0 = r10.u;
        r0 = r0.f;
        r3 = r10.s;
        r3 = r3.f;
        r11.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x012a;
    L_0x0105:
        r0 = r10.s;
        r0 = r0.f;
        r1 = r10.C;
        r1 = r1.u;
        goto L_0x00d8;
    L_0x010e:
        if (r0 != r5) goto L_0x012a;
    L_0x0110:
        r0 = r10.s;
        r0 = r0.f;
        r3 = r10.u;
        r3 = r3.f;
        r11.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x012a;
    L_0x011d:
        r0 = r10.s;
        r0 = r0.f;
        r1 = r10.C;
        r1 = r1.s;
        r1 = r1.f;
        r11.c(r0, r1, r2, r6);
    L_0x012a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.a(ao):void");
    }

    public final void a(boolean z) {
        this.ag = z;
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        super.b();
        this.af.clear();
    }

    public final void b(int i) {
        be beVar = this.C;
        if (beVar != null && ((bh) beVar).s(2)) {
            az azVar;
            az azVar2;
            be beVar2;
            az azVar3;
            bn bnVar;
            switch (this.ae) {
                case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                    azVar = this.r;
                    break;
                case tw.a /*1*/:
                    azVar = this.t;
                    break;
                case tw.b /*2*/:
                    azVar = this.s;
                    break;
                case f.c /*3*/:
                    azVar = this.u;
                    break;
                default:
                    return;
            }
            bp a = azVar.a();
            a.g = 5;
            int i2 = this.ae;
            if (i2 != 0) {
                if (i2 != 1) {
                    this.r.a().a(null, 0.0f);
                    azVar2 = this.t;
                    azVar2.a().a(null, 0.0f);
                    this.af.clear();
                    for (i2 = 0; i2 < this.ad; i2++) {
                        beVar2 = this.ac[i2];
                        if (!this.ag || beVar2.a()) {
                            switch (this.ae) {
                                case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                                    azVar3 = beVar2.r;
                                    break;
                                case tw.a /*1*/:
                                    azVar3 = beVar2.t;
                                    break;
                                case tw.b /*2*/:
                                    azVar3 = beVar2.s;
                                    break;
                                case f.c /*3*/:
                                    azVar3 = beVar2.u;
                                    break;
                                default:
                                    bnVar = null;
                                    break;
                            }
                            bnVar = azVar3.a();
                            if (bnVar != null) {
                                this.af.add(bnVar);
                                bnVar.a(a);
                            }
                        }
                    }
                }
            }
            this.s.a().a(null, 0.0f);
            azVar2 = this.u;
            azVar2.a().a(null, 0.0f);
            this.af.clear();
            for (i2 = 0; i2 < this.ad; i2++) {
                beVar2 = this.ac[i2];
                if (this.ag) {
                }
                switch (this.ae) {
                    case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                        azVar3 = beVar2.r;
                        break;
                    case tw.a /*1*/:
                        azVar3 = beVar2.t;
                        break;
                    case tw.b /*2*/:
                        azVar3 = beVar2.s;
                        break;
                    case f.c /*3*/:
                        azVar3 = beVar2.u;
                        break;
                    default:
                        bnVar = null;
                        break;
                }
                bnVar = azVar3.a();
                if (bnVar != null) {
                    this.af.add(bnVar);
                    bnVar.a(a);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        r8 = this;
        r0 = r8.ae;
        r1 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x0018;
            case 1: goto L_0x0010;
            case 2: goto L_0x000d;
            case 3: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        return;
    L_0x000a:
        r0 = r8.u;
        goto L_0x0012;
    L_0x000d:
        r0 = r8.s;
        goto L_0x001a;
    L_0x0010:
        r0 = r8.t;
    L_0x0012:
        r0 = r0.a();
        r1 = 0;
        goto L_0x001e;
    L_0x0018:
        r0 = r8.r;
    L_0x001a:
        r0 = r0.a();
    L_0x001e:
        r2 = r8.af;
        r2 = r2.size();
        r3 = 0;
        r4 = 0;
    L_0x0026:
        if (r4 >= r2) goto L_0x0052;
    L_0x0028:
        r5 = r8.af;
        r5 = r5.get(r4);
        r5 = (defpackage.bn) r5;
        r6 = r5.i;
        r7 = 1;
        if (r6 == r7) goto L_0x0036;
    L_0x0035:
        return;
    L_0x0036:
        r6 = r8.ae;
        if (r6 == 0) goto L_0x0045;
    L_0x003a:
        r7 = 2;
        if (r6 != r7) goto L_0x003e;
    L_0x003d:
        goto L_0x0045;
    L_0x003e:
        r6 = r5.f;
        r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r7 <= 0) goto L_0x004f;
    L_0x0044:
        goto L_0x004b;
    L_0x0045:
        r6 = r5.f;
        r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r7 >= 0) goto L_0x004f;
    L_0x004b:
        r1 = r5.e;
        r3 = r1;
        r1 = r6;
    L_0x004f:
        r4 = r4 + 1;
        goto L_0x0026;
    L_0x0052:
        r2 = defpackage.ao.a();
        if (r2 == 0) goto L_0x0063;
    L_0x0058:
        r2 = defpackage.ao.a();
        r4 = r2.z;
        r6 = 1;
        r4 = r4 + r6;
        r2.z = r4;
    L_0x0063:
        r0.e = r3;
        r0.f = r1;
        r0.e();
        r0 = r8.ae;
        switch(r0) {
            case 0: goto L_0x0080;
            case 1: goto L_0x007d;
            case 2: goto L_0x007a;
            case 3: goto L_0x0070;
            default: goto L_0x006f;
        };
    L_0x006f:
        return;
    L_0x0070:
        r0 = r8.s;
    L_0x0072:
        r0 = r0.a();
        r0.a(r3, r1);
        return;
    L_0x007a:
        r0 = r8.u;
        goto L_0x0072;
    L_0x007d:
        r0 = r8.r;
        goto L_0x0072;
    L_0x0080:
        r0 = r8.t;
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.c():void");
    }
}
