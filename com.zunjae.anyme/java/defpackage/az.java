package defpackage;

import mehdi.sakout.fancybuttons.R;

public final class az {
    final be a;
    final bd b;
    az c;
    public int d = 0;
    int e = -1;
    au f;
    private bn g = new bn(this);
    private int h = bc.a;
    private int i = bb.a;
    private int j = 0;

    public az(be beVar, bd bdVar) {
        this.a = beVar;
        this.b = bdVar;
    }

    private boolean a(az azVar) {
        if (azVar == null) {
            return false;
        }
        bd bdVar = azVar.b;
        bd bdVar2 = this.b;
        if (bdVar == bdVar2) {
            return bdVar2 != bd.BASELINE || (azVar.a.x() && this.a.x());
        } else {
            boolean z;
            switch (ba.a[bdVar2.ordinal()]) {
                case tw.a /*1*/:
                    return (bdVar == bd.BASELINE || bdVar == bd.CENTER_X || bdVar == bd.CENTER_Y) ? false : true;
                case tw.b /*2*/:
                case f.c /*3*/:
                    if (bdVar != bd.LEFT) {
                        if (bdVar != bd.RIGHT) {
                            z = false;
                            if (azVar.a instanceof bi) {
                                if (!z) {
                                    if (bdVar == bd.CENTER_X) {
                                        z = false;
                                    }
                                }
                                z = true;
                            }
                            return z;
                        }
                    }
                    z = true;
                    if (azVar.a instanceof bi) {
                        if (z) {
                            if (bdVar == bd.CENTER_X) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    return z;
                case mh.d /*4*/:
                case mh.e /*5*/:
                    if (bdVar != bd.TOP) {
                        if (bdVar != bd.BOTTOM) {
                            z = false;
                            if (azVar.a instanceof bi) {
                                if (!z) {
                                    if (bdVar == bd.CENTER_Y) {
                                        z = false;
                                    }
                                }
                                z = true;
                            }
                            return z;
                        }
                    }
                    z = true;
                    if (azVar.a instanceof bi) {
                        if (z) {
                            if (bdVar == bd.CENTER_Y) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    return z;
                case mh.f /*6*/:
                case mh.g /*7*/:
                case mh.h /*8*/:
                case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                    return false;
                default:
                    throw new AssertionError(this.b.name());
            }
        }
    }

    public final bn a() {
        return this.g;
    }

    public final boolean a(az azVar, int i, int i2, int i3) {
        return a(azVar, i, -1, i2, i3, false);
    }

    public final boolean a(az azVar, int i, int i2, int i3, int i4, boolean z) {
        if (azVar == null) {
            this.c = null;
            this.d = 0;
            this.e = -1;
            this.h = bc.a;
            this.j = 2;
            return true;
        } else if (!z && !a(azVar)) {
            return false;
        } else {
            this.c = azVar;
            if (i > 0) {
                this.d = i;
            } else {
                this.d = 0;
            }
            this.e = i2;
            this.h = i3;
            this.j = i4;
            return true;
        }
    }

    public final au b() {
        return this.f;
    }

    public final void c() {
        au auVar = this.f;
        if (auVar == null) {
            this.f = new au(av.a);
        } else {
            auVar.b();
        }
    }

    public final int d() {
        if (this.a.j() == 8) {
            return 0;
        }
        if (this.e >= 0) {
            az azVar = this.c;
            if (azVar != null && azVar.a.j() == 8) {
                return this.e;
            }
        }
        return this.d;
    }

    public final int e() {
        return this.h;
    }

    public final az f() {
        return this.c;
    }

    public final int g() {
        return this.j;
    }

    public final void h() {
        this.c = null;
        this.d = 0;
        this.e = -1;
        this.h = bc.b;
        this.j = 0;
        this.i = bb.a;
        this.g.b();
    }

    public final boolean i() {
        return this.c != null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.k());
        stringBuilder.append(":");
        stringBuilder.append(this.b.toString());
        return stringBuilder.toString();
    }
}
