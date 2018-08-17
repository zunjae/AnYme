package defpackage;

import java.net.ProtocolException;
import me.zhanghai.android.materialprogressbar.R;

public final class bdx implements bcb {
    private final boolean a;

    public bdx(boolean z) {
        this.a = z;
    }

    public final bcs intercept(bcc bcc) {
        bct h;
        bcu bcu;
        bee bee = (bee) bcc;
        bdz g = bee.g();
        bdu f = bee.f();
        bdp bdp = (bdp) bee.b();
        bcn a = bee.a();
        long currentTimeMillis = System.currentTimeMillis();
        g.a(a);
        bct bct = null;
        if (bed.a(a.b()) && a.d() != null) {
            if ("100-continue".equalsIgnoreCase(a.a("Expect"))) {
                g.a();
                bct = g.a(true);
            }
            if (bct == null) {
                bhg a2 = bho.a(new bdy(g.a(a, a.d().b())));
                a.d().a(a2);
                a2.close();
            } else if (!bdp.f()) {
                f.e();
            }
        }
        g.b();
        if (bct == null) {
            bct = g.a(false);
        }
        bcs a3 = bct.a(a).a(f.c().e()).a(currentTimeMillis).b(System.currentTimeMillis()).a();
        int b = a3.b();
        if (b == 100) {
            a3 = g.a(false).a(a).a(f.c().e()).a(currentTimeMillis).b(System.currentTimeMillis()).a();
            b = a3.b();
        }
        if (this.a && b == R.styleable.AppCompatTheme_textAppearanceSearchResultTitle) {
            h = a3.h();
            bcu = bdb.c;
        } else {
            h = a3.h();
            bcu = g.a(a3);
        }
        bcs a4 = h.a(bcu).a();
        if ("close".equalsIgnoreCase(a4.a().a("Connection")) || "close".equalsIgnoreCase(a4.a("Connection"))) {
            f.e();
        }
        if ((b != 204 && b != 205) || a4.g().b() <= 0) {
            return a4;
        }
        StringBuilder stringBuilder = new StringBuilder("HTTP ");
        stringBuilder.append(b);
        stringBuilder.append(" had non-zero Content-Length: ");
        stringBuilder.append(a4.g().b());
        throw new ProtocolException(stringBuilder.toString());
    }
}
