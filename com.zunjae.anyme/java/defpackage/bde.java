package defpackage;

import org.jsoup.helper.HttpConnection;

public final class bde implements bcb {
    final bdm a;

    public bde(bdm bdm) {
        this.a = bdm;
    }

    private static bcs a(bcs bcs) {
        return (bcs == null || bcs.g() == null) ? bcs : bcs.h().a(null).a();
    }

    private static boolean a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static boolean b(String str) {
        if (!("Content-Length".equalsIgnoreCase(str) || HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(str))) {
            if (!"Content-Type".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final bcs intercept(bcc bcc) {
        bct b;
        bdm bdm = this.a;
        bcs a = bdm != null ? bdm.a() : null;
        bdh a2 = new bdi(System.currentTimeMillis(), bcc.a(), a).a();
        bcn bcn = a2.a;
        bcs bcs = a2.b;
        if (a != null && bcs == null) {
            bdb.a(a.g());
        }
        if (bcn == null && bcs == null) {
            b = new bct().a(bcc.a()).a(bck.HTTP_1_1).a(504).a("Unsatisfiable Request (only-if-cached)").a(bdb.c).a(-1).b(System.currentTimeMillis());
        } else if (bcn == null) {
            b = bcs.h().b(bde.a(bcs));
        } else {
            try {
                bcs a3 = bcc.a(bcn);
                if (a3 == null) {
                }
                if (bcs != null) {
                    if (a3.b() == 304) {
                        bct h = bcs.h();
                        bbx f = bcs.f();
                        bbx f2 = a3.f();
                        bby bby = new bby();
                        int a4 = f.a();
                        for (int i = 0; i < a4; i++) {
                            String a5 = f.a(i);
                            String b2 = f.b(i);
                            if (!("Warning".equalsIgnoreCase(a5) && b2.startsWith("1")) && (bde.b(a5) || !bde.a(a5) || f2.a(a5) == null)) {
                                bcz.a.a(bby, a5, b2);
                            }
                        }
                        int a6 = f2.a();
                        for (int i2 = 0; i2 < a6; i2++) {
                            String a7 = f2.a(i2);
                            if (!bde.b(a7) && bde.a(a7)) {
                                bcz.a.a(bby, a7, f2.b(i2));
                            }
                        }
                        a = h.a(bby.a()).a(a3.k()).b(a3.l()).b(bde.a(bcs)).a(bde.a(a3)).a();
                        a3.g().close();
                        return a;
                    }
                    bdb.a(bcs.g());
                }
                a3 = a3.h().b(bde.a(bcs)).a(bde.a(a3)).a();
                if (this.a != null) {
                    if (bec.b(a3) && bdh.a(a3, bcn)) {
                        bdg b3 = this.a.b();
                        if (b3 == null) {
                            return a3;
                        }
                        bhy a8 = b3.a();
                        if (a8 == null) {
                            return a3;
                        }
                        b = a3.h().a(new bef(a3.a("Content-Type"), a3.g().b(), bho.a(new bdf(this, a3.g().c(), b3, bho.a(a8)))));
                    } else {
                        String b4 = bcn.b();
                        if (!(b4.equals("POST") || b4.equals("PATCH") || b4.equals("PUT") || b4.equals("DELETE"))) {
                            b4.equals("MOVE");
                        }
                    }
                }
                return a3;
            } finally {
                if (a != null) {
                    bdb.a(a.g());
                }
            }
        }
        return b.a();
    }
}
