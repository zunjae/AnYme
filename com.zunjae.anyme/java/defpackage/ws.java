package defpackage;

public class ws extends RuntimeException {
    public ws(String str) {
        super(str);
    }

    public ws(String str, Throwable th) {
        super(str, th);
    }

    public ws(Throwable th) {
        super(th);
    }
}
