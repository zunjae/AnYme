package defpackage;

import java.io.Writer;

final class bir extends biv {
    private static final String b = "\"";
    private static final char[] c = new char[]{',', '\"', '\r', '\n'};

    bir() {
    }

    public final int a(CharSequence charSequence, int i, Writer writer) {
        if (i == 0) {
            if (bit.b(charSequence.toString(), c)) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String charSequence2 = charSequence.toString();
                String str = b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b);
                stringBuilder.append(b);
                writer.write(bit.a(charSequence2, str, stringBuilder.toString()));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        throw new IllegalStateException("CsvEscaper should never reach the [1] index");
    }
}
