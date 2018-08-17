package defpackage;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

final class bli<T> implements bjq<T, bcp> {
    private static final bcd a = bcd.b("application/json; charset=UTF-8");
    private static final Charset b = Charset.forName("UTF-8");
    private final we c;
    private final wz<T> d;

    bli(we weVar, wz<T> wzVar) {
        this.c = weVar;
        this.d = wzVar;
    }

    public final /* synthetic */ Object a(Object obj) {
        bhd bhd = new bhd();
        abq a = this.c.a(new OutputStreamWriter(bhd.d(), b));
        this.d.a(a, obj);
        a.close();
        return bcp.a(a, bhd.n());
    }
}
