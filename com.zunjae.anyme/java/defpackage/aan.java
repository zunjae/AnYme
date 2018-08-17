package defpackage;

import java.net.URI;

final class aan extends wz<URI> {
    aan() {
    }

    private static URI b(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        try {
            String h = abn.h();
            return "null".equals(h) ? null : new URI(h);
        } catch (Throwable e) {
            throw new wp(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return aan.b(abn);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        URI uri = (URI) obj;
        abq.b(uri == null ? null : uri.toASCIIString());
    }
}
