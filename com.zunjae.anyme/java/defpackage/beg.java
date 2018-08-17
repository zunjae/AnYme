package defpackage;

public final class beg {
    public static String a(bbz bbz) {
        String h = bbz.h();
        String k = bbz.k();
        if (k == null) {
            return h;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h);
        stringBuilder.append('?');
        stringBuilder.append(k);
        return stringBuilder.toString();
    }
}
