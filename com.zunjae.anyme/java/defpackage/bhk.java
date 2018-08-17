package defpackage;

public abstract class bhk implements bhz {
    private final bhz a;

    public bhk(bhz bhz) {
        if (bhz != null) {
            this.a = bhz;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long a(bhd bhd, long j) {
        return this.a.a(bhd, j);
    }

    public final bia a() {
        return this.a.a();
    }

    public final bhz b() {
        return this.a;
    }

    public void close() {
        this.a.close();
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
