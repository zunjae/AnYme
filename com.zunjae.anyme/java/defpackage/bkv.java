package defpackage;

import javax.annotation.Nullable;

final class bkv {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String b;
    private final bbz c;
    @Nullable
    private String d;
    @Nullable
    private bca e;
    private final bco f = new bco();
    @Nullable
    private bcd g;
    private final boolean h;
    @Nullable
    private bcf i;
    @Nullable
    private bbv j;
    @Nullable
    private bcp k;

    bkv(String str, bbz bbz, @Nullable String str2, @Nullable bbx bbx, @Nullable bcd bcd, boolean z, boolean z2, boolean z3) {
        this.b = str;
        this.c = bbz;
        this.d = str2;
        this.g = bcd;
        this.h = z;
        if (bbx != null) {
            this.f.a(bbx);
        }
        if (z2) {
            this.j = new bbv();
            return;
        }
        if (z3) {
            this.i = new bcf();
            this.i.a(bce.e);
        }
    }

    private static String a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1) {
                if (!z) {
                    if (codePointAt != 47) {
                        if (codePointAt == 37) {
                        }
                    }
                }
                i += Character.charCount(codePointAt);
            }
            bhd bhd = new bhd();
            bhd.a(str, 0, i);
            bhd bhd2 = null;
            while (i < length) {
                int codePointAt2 = str.codePointAt(i);
                if (!(z && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13))) {
                    if (codePointAt2 >= 32 && codePointAt2 < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt2) == -1) {
                        if (!z) {
                            if (codePointAt2 != 47) {
                                if (codePointAt2 == 37) {
                                }
                            }
                        }
                        bhd.a(codePointAt2);
                    }
                    if (bhd2 == null) {
                        bhd2 = new bhd();
                    }
                    bhd2.a(codePointAt2);
                    while (!bhd2.e()) {
                        int h = bhd2.h() & 255;
                        bhd.b(37);
                        bhd.b(a[(h >> 4) & 15]);
                        bhd.b(a[h & 15]);
                    }
                }
                i += Character.charCount(codePointAt2);
            }
            return bhd.o();
        }
        return str;
    }

    final bcn a() {
        bbz b;
        bca bca = this.e;
        if (bca != null) {
            b = bca.b();
        } else {
            b = this.c.c(this.d);
            if (b == null) {
                StringBuilder stringBuilder = new StringBuilder("Malformed URL. Base: ");
                stringBuilder.append(this.c);
                stringBuilder.append(", Relative: ");
                stringBuilder.append(this.d);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        bcp bcp = this.k;
        if (bcp == null) {
            bbv bbv = this.j;
            if (bbv != null) {
                bcp = bbv.a();
            } else {
                bcf bcf = this.i;
                if (bcf != null) {
                    bcp = bcf.a();
                } else if (this.h) {
                    bcp = bcp.a(new byte[0]);
                }
            }
        }
        bcd bcd = this.g;
        if (bcd != null) {
            if (bcp != null) {
                bcp = new bkw(bcp, bcd);
            } else {
                this.f.b("Content-Type", bcd.toString());
            }
        }
        return this.f.a(b).a(this.b, bcp).a();
    }

    final void a(bbx bbx, bcp bcp) {
        this.i.a(bbx, bcp);
    }

    final void a(bcg bcg) {
        this.i.a(bcg);
    }

    final void a(bcp bcp) {
        this.k = bcp;
    }

    final void a(Object obj) {
        this.d = obj.toString();
    }

    final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            bcd b = bcd.b(str2);
            if (b != null) {
                this.g = b;
                return;
            } else {
                throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)));
            }
        }
        this.f.b(str, str2);
    }

    final void a(String str, String str2, boolean z) {
        String str3 = this.d;
        if (str3 != null) {
            StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append(str);
            stringBuilder.append("}");
            this.d = str3.replace(stringBuilder.toString(), bkv.a(str2, z));
            return;
        }
        throw new AssertionError();
    }

    final void b(String str, @Nullable String str2, boolean z) {
        String str3 = this.d;
        if (str3 != null) {
            this.e = this.c.d(str3);
            if (this.e != null) {
                this.d = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Malformed URL. Base: ");
                stringBuilder.append(this.c);
                stringBuilder.append(", Relative: ");
                stringBuilder.append(this.d);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (z) {
            this.e.b(str, str2);
        } else {
            this.e.a(str, str2);
        }
    }

    final void c(String str, String str2, boolean z) {
        if (z) {
            this.j.b(str, str2);
        } else {
            this.j.a(str, str2);
        }
    }
}
