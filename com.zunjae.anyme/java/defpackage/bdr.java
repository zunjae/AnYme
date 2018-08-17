package defpackage;

import java.io.IOException;

public final class bdr extends RuntimeException {
    private IOException a;
    private IOException b;

    public bdr(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }

    public final IOException a() {
        return this.a;
    }

    public final void a(IOException iOException) {
        bdb.a(this.a, (Throwable) iOException);
        this.b = iOException;
    }

    public final IOException b() {
        return this.b;
    }
}
