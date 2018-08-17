package defpackage;

import java.util.List;
import org.jsoup.helper.HttpConnection;

public final class bdw implements bcb {
    private final bbl a;

    public bdw(bbl bbl) {
        this.a = bbl;
    }

    public final bcs intercept(bcc bcc) {
        Object obj;
        bcn a = bcc.a();
        bco e = a.e();
        bcp d = a.d();
        if (d != null) {
            String str;
            bcd a2 = d.a();
            if (a2 != null) {
                e.a("Content-Type", a2.toString());
            }
            long b = d.b();
            if (b != -1) {
                e.a("Content-Length", Long.toString(b));
                str = "Transfer-Encoding";
            } else {
                e.a("Transfer-Encoding", "chunked");
                str = "Content-Length";
            }
            e.b(str);
        }
        int i = 0;
        if (a.a("Host") == null) {
            e.a("Host", bdb.a(a.a(), false));
        }
        if (a.a("Connection") == null) {
            e.a("Connection", "Keep-Alive");
        }
        if (a.a("Accept-Encoding") == null && a.a("Range") == null) {
            e.a("Accept-Encoding", "gzip");
            obj = 1;
        } else {
            obj = null;
        }
        List a3 = this.a.a();
        if (!a3.isEmpty()) {
            String str2 = "Cookie";
            StringBuilder stringBuilder = new StringBuilder();
            int size = a3.size();
            while (i < size) {
                if (i > 0) {
                    stringBuilder.append("; ");
                }
                bbk bbk = (bbk) a3.get(i);
                stringBuilder.append(bbk.a());
                stringBuilder.append('=');
                stringBuilder.append(bbk.b());
                i++;
            }
            e.a(str2, stringBuilder.toString());
        }
        if (a.a("User-Agent") == null) {
            e.a("User-Agent", "okhttp/3.11.0");
        }
        bcs a4 = bcc.a(e.a());
        bec.a(this.a, a.a(), a4.f());
        bct a5 = a4.h().a(a);
        if (obj != null && "gzip".equalsIgnoreCase(a4.a(HttpConnection.CONTENT_ENCODING)) && bec.b(a4)) {
            bhz bhm = new bhm(a4.g().c());
            a5.a(a4.f().b().a(HttpConnection.CONTENT_ENCODING).a("Content-Length").a());
            a5.a(new bef(a4.a("Content-Type"), -1, bho.a(bhm)));
        }
        return a5.a();
    }
}
