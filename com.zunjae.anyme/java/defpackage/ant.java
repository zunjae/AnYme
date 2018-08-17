package defpackage;

public abstract class ant {
    private String b(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a());
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    abstract String a();

    public final String a(int i, String str) {
        return aux.b(b(i), a(str));
    }

    abstract String a(String str);

    public final void a(int i) {
        aux.b(b(i));
    }

    public final void a(String str, int i) {
        aux.a(b(i), str);
    }
}
