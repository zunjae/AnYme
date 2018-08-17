package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class bds {
    private final bas a;
    private final bdq b;
    private final bay c;
    private final bbq d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<bcx> h = new ArrayList();

    public bds(bas bas, bdq bdq, bay bay, bbq bbq) {
        List singletonList;
        this.a = bas;
        this.b = bdq;
        this.c = bay;
        this.d = bbq;
        bbz a = bas.a();
        Proxy g = bas.g();
        if (g != null) {
            singletonList = Collections.singletonList(g);
        } else {
            singletonList = this.a.f().select(a.a());
            if (singletonList == null || singletonList.isEmpty()) {
                singletonList = bdb.a(Proxy.NO_PROXY);
            } else {
                singletonList = bdb.a(singletonList);
            }
        }
        this.e = singletonList;
        this.f = 0;
    }

    private void a(Proxy proxy) {
        String hostName;
        int port;
        StringBuilder stringBuilder;
        this.g = new ArrayList();
        if (proxy.type() != Type.DIRECT) {
            if (proxy.type() != Type.SOCKS) {
                SocketAddress address = proxy.address();
                if (address instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    InetAddress address2 = inetSocketAddress.getAddress();
                    hostName = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                    port = inetSocketAddress.getPort();
                    if (port > 0 || port > 65535) {
                        stringBuilder = new StringBuilder("No route to ");
                        stringBuilder.append(hostName);
                        stringBuilder.append(":");
                        stringBuilder.append(port);
                        stringBuilder.append("; port is out of range");
                        throw new SocketException(stringBuilder.toString());
                    } else if (proxy.type() == Type.SOCKS) {
                        this.g.add(InetSocketAddress.createUnresolved(hostName, port));
                        return;
                    } else {
                        List a = this.a.b().a(hostName);
                        if (a.isEmpty()) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(this.a.b());
                            stringBuilder2.append(" returned no addresses for ");
                            stringBuilder2.append(hostName);
                            throw new UnknownHostException(stringBuilder2.toString());
                        }
                        int size = a.size();
                        for (int i = 0; i < size; i++) {
                            this.g.add(new InetSocketAddress((InetAddress) a.get(i), port));
                        }
                        return;
                    }
                }
                StringBuilder stringBuilder3 = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                stringBuilder3.append(address.getClass());
                throw new IllegalArgumentException(stringBuilder3.toString());
            }
        }
        hostName = this.a.a().f();
        port = this.a.a().g();
        if (port > 0) {
        }
        stringBuilder = new StringBuilder("No route to ");
        stringBuilder.append(hostName);
        stringBuilder.append(":");
        stringBuilder.append(port);
        stringBuilder.append("; port is out of range");
        throw new SocketException(stringBuilder.toString());
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    public final void a(bcx bcx, IOException iOException) {
        if (!(bcx.b().type() == Type.DIRECT || this.a.f() == null)) {
            this.a.f().connectFailed(this.a.a().a(), bcx.b().address(), iOException);
        }
        this.b.a(bcx);
    }

    public final boolean a() {
        if (!c()) {
            if (this.h.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final bdt b() {
        if (a()) {
            List arrayList = new ArrayList();
            while (c()) {
                if (c()) {
                    List list = this.e;
                    int i = this.f;
                    this.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    a(proxy);
                    int size = this.g.size();
                    for (i = 0; i < size; i++) {
                        bcx bcx = new bcx(this.a, proxy, (InetSocketAddress) this.g.get(i));
                        if (this.b.c(bcx)) {
                            this.h.add(bcx);
                        } else {
                            arrayList.add(bcx);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("No route to ");
                stringBuilder.append(this.a.a().f());
                stringBuilder.append("; exhausted proxy configurations: ");
                stringBuilder.append(this.e);
                throw new SocketException(stringBuilder.toString());
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new bdt(arrayList);
        }
        throw new NoSuchElementException();
    }
}
