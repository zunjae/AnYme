package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class bho {
    static final Logger a = Logger.getLogger(bho.class.getName());

    private bho() {
    }

    public static bhg a(bhy bhy) {
        return new bhs(bhy);
    }

    public static bhh a(bhz bhz) {
        return new bht(bhz);
    }

    public static bhy a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            bia c = bho.c(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new bgz(c, new bhp(c, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static bhz a(InputStream inputStream) {
        return bho.a(inputStream, new bia());
    }

    private static bhz a(InputStream inputStream, bia bia) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (bia != null) {
            return new bhq(bia, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static bhz b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            bia c = bho.c(socket);
            return new bha(c, bho.a(socket.getInputStream(), c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static bgy c(Socket socket) {
        return new bhr(socket);
    }
}
