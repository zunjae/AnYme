package defpackage;

final class uh {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final uh d;

    public uh(Throwable th, ug ugVar) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = ugVar.a(th.getStackTrace());
        th = th.getCause();
        this.d = th != null ? new uh(th, ugVar) : null;
    }
}
