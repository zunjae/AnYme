package defpackage;

import java.io.Writer;

final class bis extends biv {
    private static final String b = "\"";
    private static final char[] c = new char[]{',', '\"', '\r', '\n'};

    bis() {
    }

    public final int a(CharSequence charSequence, int i, Writer writer) {
        if (i == 0) {
            String a;
            if (charSequence.charAt(0) == '\"') {
                if (charSequence.charAt(charSequence.length() - 1) == '\"') {
                    CharSequence charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                    if (bit.a(charSequence2, c)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(b);
                        a = bit.a(charSequence2, stringBuilder.toString(), b);
                    } else {
                        a = charSequence.toString();
                    }
                    writer.write(a);
                    return Character.codePointCount(charSequence, 0, charSequence.length());
                }
            }
            a = charSequence.toString();
            writer.write(a);
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
    }
}
