package defpackage;

import java.net.Socket;
import javax.net.ssl.SSLSocket;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class bci extends bcz {
    bci() {
    }

    public final int a(bct bct) {
        return bct.c;
    }

    public final bdp a(bbg bbg, bas bas, bdu bdu, bcx bcx) {
        return bbg.a(bas, bdu, bcx);
    }

    public final bdq a(bbg bbg) {
        return bbg.a;
    }

    public final Socket a(bbg bbg, bas bas, bdu bdu) {
        return bbg.a(bas, bdu);
    }

    public final void a(bbi bbi, SSLSocket sSLSocket, boolean z) {
        String[] a = bbi.g != null ? bdb.a(bbd.a, sSLSocket.getEnabledCipherSuites(), bbi.g) : sSLSocket.getEnabledCipherSuites();
        String[] a2 = bbi.h != null ? bdb.a(bdb.h, sSLSocket.getEnabledProtocols(), bbi.h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a3 = bdb.a(bbd.a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a3 != -1) {
            a = bdb.a(a, supportedCipherSuites[a3]);
        }
        bbi = new bbj(bbi).a(a).b(a2).b();
        String[] strArr = bbi.h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = bbi.g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public final void a(bby bby, String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            bby.b(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            bby.b(BuildConfig.FLAVOR, str.substring(1));
        } else {
            bby.b(BuildConfig.FLAVOR, str);
        }
    }

    public final void a(bby bby, String str, String str2) {
        bby.b(str, str2);
    }

    public final boolean a(bas bas, bas bas2) {
        return bas.a(bas2);
    }

    public final boolean a(bbg bbg, bdp bdp) {
        return bbg.b(bdp);
    }

    public final void b(bbg bbg, bdp bdp) {
        bbg.a(bdp);
    }
}
