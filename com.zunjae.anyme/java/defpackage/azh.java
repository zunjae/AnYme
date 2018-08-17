package defpackage;

import java.io.IOException;

public final class azh extends RuntimeException {
    protected azh(IOException iOException) {
        super(iOException);
    }

    public final /* bridge */ /* synthetic */ Throwable getCause() {
        return (IOException) super.getCause();
    }
}
