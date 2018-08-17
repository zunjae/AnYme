package defpackage;

public abstract class pc<T extends pc> extends ob<T> {
    final oa d = new oa(this.b);

    abstract String a();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{type:\"");
        stringBuilder.append(a());
        stringBuilder.append('\"');
        stringBuilder.append(", predefinedAttributes:");
        stringBuilder.append(this.d);
        stringBuilder.append(", customAttributes:");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
