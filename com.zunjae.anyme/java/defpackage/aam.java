package defpackage;

import java.net.URL;

final class aam extends wz<URL> {
    aam() {
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        String h = abn.h();
        return "null".equals(h) ? null : new URL(h);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        URL url = (URL) obj;
        abq.b(url == null ? null : url.toExternalForm());
    }
}
