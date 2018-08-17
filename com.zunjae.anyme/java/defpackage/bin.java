package defpackage;

public final class bin extends UnsupportedOperationException {
    private final String a;

    public bin(String str) {
        this(str, (byte) 0);
    }

    private bin(String str, byte b) {
        super(str);
        this.a = null;
    }
}
