package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

final class bhr extends bgy {
    final /* synthetic */ Socket a;

    bhr(Socket socket) {
        this.a = socket;
    }

    protected final IOException a(@Nullable IOException iOException) {
        IOException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    protected final void a() {
        Throwable e;
        Logger logger;
        Level level;
        StringBuilder stringBuilder;
        try {
            this.a.close();
        } catch (Exception e2) {
            e = e2;
            logger = bho.a;
            level = Level.WARNING;
            stringBuilder = new StringBuilder("Failed to close timed out socket ");
            stringBuilder.append(this.a);
            logger.log(level, stringBuilder.toString(), e);
        } catch (AssertionError e3) {
            e = e3;
            if (bho.a((AssertionError) e)) {
                logger = bho.a;
                level = Level.WARNING;
                stringBuilder = new StringBuilder("Failed to close timed out socket ");
                stringBuilder.append(this.a);
                logger.log(level, stringBuilder.toString(), e);
            }
            throw e;
        }
    }
}
