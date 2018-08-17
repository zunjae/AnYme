package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import javax.annotation.Nullable;

public final class bcx {
    final bas a;
    final Proxy b;
    final InetSocketAddress c;

    public bcx(bas bas, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (bas == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = bas;
            this.b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final bas a() {
        return this.a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final InetSocketAddress c() {
        return this.c;
    }

    public final boolean d() {
        return this.a.i != null && this.b.type() == Type.HTTP;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof bcx) {
            bcx bcx = (bcx) obj;
            if (bcx.a.equals(this.a) && bcx.b.equals(this.b) && bcx.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route{");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
