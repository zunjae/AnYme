package defpackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class bdi {
    final long a;
    final bcn b;
    final bcs c;
    private Date d;
    private String e;
    private Date f;
    private String g;
    private Date h;
    private long i;
    private long j;
    private String k;
    private int l = -1;

    public bdi(long j, bcn bcn, bcs bcs) {
        this.a = j;
        this.b = bcn;
        this.c = bcs;
        if (bcs != null) {
            this.i = bcs.k();
            this.j = bcs.l();
            bbx f = bcs.f();
            int a = f.a();
            for (int i = 0; i < a; i++) {
                String a2 = f.a(i);
                String b = f.b(i);
                if ("Date".equalsIgnoreCase(a2)) {
                    this.d = bea.a(b);
                    this.e = b;
                } else if ("Expires".equalsIgnoreCase(a2)) {
                    this.h = bea.a(b);
                } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                    this.f = bea.a(b);
                    this.g = b;
                } else if ("ETag".equalsIgnoreCase(a2)) {
                    this.k = b;
                } else if ("Age".equalsIgnoreCase(a2)) {
                    this.l = bec.b(b, -1);
                }
            }
        }
    }

    public final bdh a() {
        bdh bdh;
        if (this.c == null) {
            bdh = new bdh(r0.b, null);
        } else if (r0.b.g() && r0.c.e() == null) {
            bdh = new bdh(r0.b, null);
        } else if (bdh.a(r0.c, r0.b)) {
            baw f = r0.b.f();
            if (!f.a()) {
                Object obj;
                baw j;
                Date date;
                long j2;
                long max;
                int i;
                long j3;
                baw j4;
                long toMillis;
                bct h;
                Object obj2;
                bdh bdh2;
                String str;
                String str2;
                bby b;
                bcn bcn = r0.b;
                if (bcn.a("If-Modified-Since") == null) {
                    if (bcn.a("If-None-Match") == null) {
                        obj = null;
                        if (obj != null) {
                            j = r0.c.j();
                            if (j.j()) {
                                date = r0.d;
                                j2 = 0;
                                max = date == null ? Math.max(0, r0.j - date.getTime()) : 0;
                                i = r0.l;
                                if (i != -1) {
                                    max = Math.max(max, TimeUnit.SECONDS.toMillis((long) i));
                                }
                                j3 = r0.j;
                                max = (max + (j3 - r0.i)) + (r0.a - j3);
                                j4 = r0.c.j();
                                if (j4.c() == -1) {
                                    toMillis = TimeUnit.SECONDS.toMillis((long) j4.c());
                                } else {
                                    if (r0.h == null) {
                                        date = r0.d;
                                        toMillis = r0.h.getTime() - (date == null ? date.getTime() : r0.j);
                                        if (toMillis > 0) {
                                        }
                                    } else if (r0.f != null && r0.c.a().a().l() == null) {
                                        date = r0.d;
                                        toMillis = (date == null ? date.getTime() : r0.i) - r0.f.getTime();
                                        if (toMillis > 0) {
                                            toMillis /= 10;
                                        }
                                    }
                                    toMillis = 0;
                                }
                                if (f.c() != -1) {
                                    toMillis = Math.min(toMillis, TimeUnit.SECONDS.toMillis((long) f.c()));
                                }
                                j3 = f.h() == -1 ? TimeUnit.SECONDS.toMillis((long) f.h()) : 0;
                                if (!(j.f() || f.g() == -1)) {
                                    j2 = TimeUnit.SECONDS.toMillis((long) f.g());
                                }
                                if (!j.a()) {
                                    j3 += max;
                                    if (j3 < j2 + toMillis) {
                                        h = r0.c.h();
                                        if (j3 >= toMillis) {
                                            h.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (max > 86400000) {
                                            obj2 = (r0.c.j().c() == -1 || r0.h != null) ? null : 1;
                                            if (obj2 != null) {
                                                h.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                        }
                                        bdh2 = new bdh(null, h.a());
                                        bdh = bdh2;
                                    }
                                }
                                str = r0.k;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else if (r0.f != null) {
                                    str2 = "If-Modified-Since";
                                    str = r0.g;
                                } else if (r0.d == null) {
                                    str2 = "If-Modified-Since";
                                    str = r0.e;
                                } else {
                                    bdh = new bdh(r0.b, null);
                                }
                                b = r0.b.c().b();
                                bcz.a.a(b, str2, str);
                                bdh2 = new bdh(r0.b.e().a(b.a()).a(), r0.c);
                                bdh = bdh2;
                            } else {
                                bdh = new bdh(null, r0.c);
                            }
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    j = r0.c.j();
                    if (j.j()) {
                        date = r0.d;
                        j2 = 0;
                        if (date == null) {
                        }
                        i = r0.l;
                        if (i != -1) {
                            max = Math.max(max, TimeUnit.SECONDS.toMillis((long) i));
                        }
                        j3 = r0.j;
                        max = (max + (j3 - r0.i)) + (r0.a - j3);
                        j4 = r0.c.j();
                        if (j4.c() == -1) {
                            if (r0.h == null) {
                                date = r0.d;
                                if (date == null) {
                                }
                                toMillis = (date == null ? date.getTime() : r0.i) - r0.f.getTime();
                                if (toMillis > 0) {
                                    toMillis /= 10;
                                }
                            } else {
                                date = r0.d;
                                if (date == null) {
                                }
                                toMillis = r0.h.getTime() - (date == null ? date.getTime() : r0.j);
                                if (toMillis > 0) {
                                }
                            }
                            toMillis = 0;
                        } else {
                            toMillis = TimeUnit.SECONDS.toMillis((long) j4.c());
                        }
                        if (f.c() != -1) {
                            toMillis = Math.min(toMillis, TimeUnit.SECONDS.toMillis((long) f.c()));
                        }
                        if (f.h() == -1) {
                        }
                        j2 = TimeUnit.SECONDS.toMillis((long) f.g());
                        if (j.a()) {
                            j3 += max;
                            if (j3 < j2 + toMillis) {
                                h = r0.c.h();
                                if (j3 >= toMillis) {
                                    h.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (max > 86400000) {
                                    if (r0.c.j().c() == -1) {
                                    }
                                    if (obj2 != null) {
                                        h.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                bdh2 = new bdh(null, h.a());
                                bdh = bdh2;
                            }
                        }
                        str = r0.k;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else if (r0.f != null) {
                            str2 = "If-Modified-Since";
                            str = r0.g;
                        } else if (r0.d == null) {
                            bdh = new bdh(r0.b, null);
                        } else {
                            str2 = "If-Modified-Since";
                            str = r0.e;
                        }
                        b = r0.b.c().b();
                        bcz.a.a(b, str2, str);
                        bdh2 = new bdh(r0.b.e().a(b.a()).a(), r0.c);
                        bdh = bdh2;
                    } else {
                        bdh = new bdh(null, r0.c);
                    }
                }
            }
            bdh = new bdh(r0.b, null);
        } else {
            bdh = new bdh(r0.b, null);
        }
        return (bdh.a == null || !r0.b.f().i()) ? bdh : new bdh(null, null);
    }
}
