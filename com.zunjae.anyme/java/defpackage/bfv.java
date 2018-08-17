package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

final class bfv extends bgy {
    final /* synthetic */ bfs a;

    bfv(bfs bfs) {
        this.a = bfs;
    }

    protected final IOException a(IOException iOException) {
        IOException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    protected final void a() {
        this.a.b(bes.CANCEL);
    }

    public final void b() {
        if (e_()) {
            throw a(null);
        }
    }
}
