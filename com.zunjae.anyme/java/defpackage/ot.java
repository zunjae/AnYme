package defpackage;

public final class ot extends ob<ot> {
    private final String a;

    public ot(String str) {
        this.a = this.b.a(str);
    }

    final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{eventName:\"");
        stringBuilder.append(this.a);
        stringBuilder.append('\"');
        stringBuilder.append(", customAttributes:");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
