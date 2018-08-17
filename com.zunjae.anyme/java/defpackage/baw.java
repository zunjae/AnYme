package defpackage;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class baw {
    public static final baw a;
    public static final baw b;
    @Nullable
    String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final int l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    static {
        bax bax = new bax();
        bax.a = true;
        a = bax.a();
        bax = new bax();
        bax.f = true;
        long toSeconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        bax.d = toSeconds > 2147483647L ? Integer.MAX_VALUE : (int) toSeconds;
        b = bax.a();
    }

    baw(bax bax) {
        this.d = bax.a;
        this.e = bax.b;
        this.f = bax.c;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = bax.d;
        this.l = bax.e;
        this.m = bax.f;
        this.n = bax.g;
        this.o = bax.h;
    }

    private baw(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = i3;
        this.l = i4;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.c = str;
    }

    public static baw a(bbx bbx) {
        bbx bbx2 = bbx;
        int a = bbx.a();
        Object obj = 1;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (int i5 = 0; i5 < a; i5++) {
            int i6;
            int a2;
            String trim;
            int a3;
            int a4;
            String trim2;
            String a5 = bbx2.a(i5);
            String b = bbx2.b(i5);
            if (a5.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = b;
                    i6 = 0;
                    while (i6 < b.length()) {
                        a2 = bec.a(b, i6, "=,;");
                        trim = b.substring(i6, a2).trim();
                        if (!(a2 == b.length() || b.charAt(a2) == ',')) {
                            if (b.charAt(a2) == ';') {
                                a3 = bec.a(b, a2 + 1);
                                if (a3 < b.length() || b.charAt(a3) != '\"') {
                                    a4 = bec.a(b, a3, ",;");
                                    trim2 = b.substring(a3, a4).trim();
                                } else {
                                    a3++;
                                    a4 = bec.a(b, a3, "\"");
                                    trim2 = b.substring(a3, a4);
                                    a4++;
                                }
                                if (!"no-cache".equalsIgnoreCase(trim)) {
                                    i6 = a4;
                                    z = true;
                                } else if ("no-store".equalsIgnoreCase(trim)) {
                                    if (!"max-age".equalsIgnoreCase(trim)) {
                                        i = bec.b(trim2, -1);
                                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                        i2 = bec.b(trim2, -1);
                                    } else if (!"private".equalsIgnoreCase(trim)) {
                                        i6 = a4;
                                        z3 = true;
                                    } else if (!"public".equalsIgnoreCase(trim)) {
                                        i6 = a4;
                                        z4 = true;
                                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                        i6 = a4;
                                        z5 = true;
                                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                        i3 = bec.b(trim2, Integer.MAX_VALUE);
                                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                        i4 = bec.b(trim2, -1);
                                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                        i6 = a4;
                                        z6 = true;
                                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                        i6 = a4;
                                        z7 = true;
                                    } else if ("immutable".equalsIgnoreCase(trim)) {
                                        z8 = true;
                                    }
                                    i6 = a4;
                                } else {
                                    i6 = a4;
                                    z2 = true;
                                }
                            }
                        }
                        a4 = a2 + 1;
                        trim2 = null;
                        if (!"no-cache".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            if (!"max-age".equalsIgnoreCase(trim)) {
                                i = bec.b(trim2, -1);
                            } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                i2 = bec.b(trim2, -1);
                            } else if (!"private".equalsIgnoreCase(trim)) {
                                i6 = a4;
                                z3 = true;
                            } else if (!"public".equalsIgnoreCase(trim)) {
                                i6 = a4;
                                z4 = true;
                            } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                i6 = a4;
                                z5 = true;
                            } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                i3 = bec.b(trim2, Integer.MAX_VALUE);
                            } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                i4 = bec.b(trim2, -1);
                            } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                i6 = a4;
                                z6 = true;
                            } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                i6 = a4;
                                z7 = true;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z8 = true;
                            }
                            i6 = a4;
                        } else {
                            i6 = a4;
                            z2 = true;
                        }
                    }
                }
            } else if (!a5.equalsIgnoreCase("Pragma")) {
            }
            obj = null;
            i6 = 0;
            while (i6 < b.length()) {
                a2 = bec.a(b, i6, "=,;");
                trim = b.substring(i6, a2).trim();
                if (b.charAt(a2) == ';') {
                    a3 = bec.a(b, a2 + 1);
                    if (a3 < b.length()) {
                    }
                    a4 = bec.a(b, a3, ",;");
                    trim2 = b.substring(a3, a4).trim();
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        i6 = a4;
                        z = true;
                    } else if ("no-store".equalsIgnoreCase(trim)) {
                        i6 = a4;
                        z2 = true;
                    } else {
                        if (!"max-age".equalsIgnoreCase(trim)) {
                            i = bec.b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = bec.b(trim2, -1);
                        } else if (!"private".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z3 = true;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z4 = true;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z5 = true;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = bec.b(trim2, Integer.MAX_VALUE);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = bec.b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z6 = true;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z7 = true;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z8 = true;
                        }
                        i6 = a4;
                    }
                } else {
                    a4 = a2 + 1;
                    trim2 = null;
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        i6 = a4;
                        z = true;
                    } else if ("no-store".equalsIgnoreCase(trim)) {
                        if (!"max-age".equalsIgnoreCase(trim)) {
                            i = bec.b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = bec.b(trim2, -1);
                        } else if (!"private".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z3 = true;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z4 = true;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z5 = true;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = bec.b(trim2, Integer.MAX_VALUE);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = bec.b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z6 = true;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            i6 = a4;
                            z7 = true;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z8 = true;
                        }
                        i6 = a4;
                    } else {
                        i6 = a4;
                        z2 = true;
                    }
                }
            }
        }
        return new baw(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, obj == null ? null : str);
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean f() {
        return this.j;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.l;
    }

    public final boolean i() {
        return this.m;
    }

    public final boolean j() {
        return this.o;
    }

    public final String toString() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.d) {
            stringBuilder.append("no-cache, ");
        }
        if (this.e) {
            stringBuilder.append("no-store, ");
        }
        if (this.f != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.f);
            stringBuilder.append(", ");
        }
        if (this.g != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.g);
            stringBuilder.append(", ");
        }
        if (this.h) {
            stringBuilder.append("private, ");
        }
        if (this.i) {
            stringBuilder.append("public, ");
        }
        if (this.j) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.k != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.k);
            stringBuilder.append(", ");
        }
        if (this.l != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.l);
            stringBuilder.append(", ");
        }
        if (this.m) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.n) {
            stringBuilder.append("no-transform, ");
        }
        if (this.o) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            str = stringBuilder.toString();
        }
        this.c = str;
        return str;
    }
}
