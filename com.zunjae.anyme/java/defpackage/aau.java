package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;

final class aau extends wz<Locale> {
    aau() {
    }

    public final /* synthetic */ Object a(abn abn) {
        String str = null;
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(abn.h(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        }
        return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Locale locale = (Locale) obj;
        abq.b(locale == null ? null : locale.toString());
    }
}
