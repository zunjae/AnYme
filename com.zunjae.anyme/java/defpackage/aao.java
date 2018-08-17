package defpackage;

import java.net.InetAddress;

final class aao extends wz<InetAddress> {
    aao() {
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return InetAddress.getByName(abn.h());
        }
        abn.j();
        return null;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        abq.b(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
