package defpackage;

import java.util.Arrays;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

public final class bbi {
    public static final bbi a = new bbj(true).a(i).a(bcy.TLS_1_2).a().b();
    public static final bbi b = new bbj(true).a(j).a(bcy.TLS_1_2, bcy.TLS_1_1, bcy.TLS_1_0).a().b();
    public static final bbi c = new bbj(b).a(bcy.TLS_1_0).a().b();
    public static final bbi d = new bbj(false).b();
    private static final bbd[] i = new bbd[]{bbd.aX, bbd.bb, bbd.aY, bbd.bc, bbd.bi, bbd.bh};
    private static final bbd[] j = new bbd[]{bbd.aX, bbd.bb, bbd.aY, bbd.bc, bbd.bi, bbd.bh, bbd.aI, bbd.aJ, bbd.ag, bbd.ah, bbd.E, bbd.I, bbd.i};
    final boolean e;
    final boolean f;
    @Nullable
    final String[] g;
    @Nullable
    final String[] h;

    bbi(bbj bbj) {
        this.e = bbj.a;
        this.g = bbj.b;
        this.h = bbj.c;
        this.f = bbj.d;
    }

    public final boolean a() {
        return this.f;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.e) {
            return false;
        }
        String[] strArr = this.h;
        if (strArr != null && !bdb.b(bdb.h, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        strArr = this.g;
        return strArr == null || bdb.b(bbd.a, strArr, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof bbi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bbi bbi = (bbi) obj;
        boolean z = this.e;
        return z != bbi.e ? false : !z || (Arrays.equals(this.g, bbi.g) && Arrays.equals(this.h, bbi.h) && this.f == bbi.f);
    }

    public final int hashCode() {
        return this.e ? ((((Arrays.hashCode(this.g) + 527) * 31) + Arrays.hashCode(this.h)) * 31) + (this.f ^ 1) : 17;
    }

    public final String toString() {
        if (!this.e) {
            return "ConnectionSpec()";
        }
        String obj;
        String obj2;
        String[] strArr = this.g;
        Object obj3 = null;
        if (strArr != null) {
            obj = (strArr != null ? bbd.a(strArr) : null).toString();
        } else {
            obj = "[all enabled]";
        }
        String[] strArr2 = this.h;
        if (strArr2 != null) {
            if (strArr2 != null) {
                obj3 = bcy.forJavaNames(strArr2);
            }
            obj2 = obj3.toString();
        } else {
            obj2 = "[all enabled]";
        }
        StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder.append(obj);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(obj2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
