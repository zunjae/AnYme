package org.jsoup;

public final class SerializationException extends RuntimeException {
    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    public SerializationException(Throwable th) {
        super(th);
    }
}
