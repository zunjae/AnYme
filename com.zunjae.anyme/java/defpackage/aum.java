package defpackage;

public final class aum {
    private static final String a;

    static {
        StringBuilder stringBuilder = new StringBuilder("Zx");
        stringBuilder.append(Math.log(2.0d) / 3.0d);
        a = stringBuilder.toString();
    }

    public static String a(String str) {
        char[] cArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String str2 = a;
            cArr[i] = (char) (charAt - str2.charAt(i % str2.length()));
        }
        return new String(cArr);
    }
}
