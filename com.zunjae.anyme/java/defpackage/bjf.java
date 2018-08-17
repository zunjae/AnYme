package defpackage;

import java.io.Writer;

public final class bjf extends biv {
    public final int a(CharSequence charSequence, int i, Writer writer) {
        if (charSequence.charAt(i) == '\\') {
            int i2 = i + 1;
            if (i2 < charSequence.length() && charSequence.charAt(i2) == 'u') {
                int i3;
                i2 = 2;
                while (true) {
                    i3 = i + i2;
                    if (i3 < charSequence.length() && charSequence.charAt(i3) == 'u') {
                        i2++;
                    }
                }
                if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
                    i2++;
                }
                int i4 = i + i2;
                i3 = i4 + 4;
                if (i3 <= charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i3);
                    try {
                        writer.write((char) Integer.parseInt(charSequence.toString(), 16));
                        return i2 + 4;
                    } catch (Throwable e) {
                        throw new IllegalArgumentException("Unable to parse unicode value: ".concat(String.valueOf(charSequence)), e);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Less than 4 hex digits in unicode value: '");
                stringBuilder.append(charSequence.subSequence(i, charSequence.length()));
                stringBuilder.append("' due to end of CharSequence");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return 0;
    }
}
