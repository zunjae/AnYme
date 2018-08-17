package defpackage;

import java.io.Writer;

public final class bjd extends biv {
    private static boolean a(char c) {
        return c >= '0' && c <= '7';
    }

    public final int a(CharSequence charSequence, int i, Writer writer) {
        int length = (charSequence.length() - i) - 1;
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 0;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i3 = i + 1;
            if (bjd.a(charSequence.charAt(i3))) {
                int i4 = i + 2;
                i += 3;
                stringBuilder.append(charSequence.charAt(i3));
                if (length > 1 && bjd.a(charSequence.charAt(i4))) {
                    stringBuilder.append(charSequence.charAt(i4));
                    if (length > 2) {
                        char charAt = charSequence.charAt(i3);
                        if (charAt >= '0' && charAt <= '3') {
                            i2 = 1;
                        }
                        if (i2 != 0 && bjd.a(charSequence.charAt(i))) {
                            stringBuilder.append(charSequence.charAt(i));
                        }
                    }
                }
                writer.write(Integer.parseInt(stringBuilder.toString(), 8));
                return stringBuilder.length() + 1;
            }
        }
        return 0;
    }
}
