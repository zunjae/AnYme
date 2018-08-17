package defpackage;

public final class biy extends bje {
    private biy() {
    }

    public static biy a() {
        return new biy();
    }

    protected final String b(int i) {
        char[] toChars = Character.toChars(i);
        StringBuilder stringBuilder = new StringBuilder("\\u");
        stringBuilder.append(biv.a((int) toChars[0]));
        stringBuilder.append("\\u");
        stringBuilder.append(biv.a((int) toChars[1]));
        return stringBuilder.toString();
    }
}
