package defpackage;

public abstract class bhj implements bhy {
    private final bhy a;

    public bhj(bhy bhy) {
        if (bhy != null) {
            this.a = bhy;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final bia a() {
        return this.a.a();
    }

    public void a_(bhd bhd, long j) {
        this.a.a_(bhd, j);
    }

    public void close() {
        this.a.close();
    }

    public void flush() {
        this.a.flush();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
