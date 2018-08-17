package defpackage;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public abstract class biv {
    static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    private void a(CharSequence charSequence, Writer writer) {
        if (charSequence != null) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int a = a(charSequence, i, writer);
                if (a == 0) {
                    char charAt = charSequence.charAt(i);
                    writer.write(charAt);
                    i++;
                    if (Character.isHighSurrogate(charAt) && i < length) {
                        charAt = charSequence.charAt(i);
                        if (Character.isLowSurrogate(charAt)) {
                            writer.write(charAt);
                            i++;
                        }
                    }
                } else {
                    int i2 = i;
                    for (i = 0; i < a; i++) {
                        i2 += Character.charCount(Character.codePointAt(charSequence, i2));
                    }
                    i = i2;
                }
            }
        }
    }

    public abstract int a(CharSequence charSequence, int i, Writer writer);

    public final biv a(biv... bivArr) {
        Object obj = new biv[2];
        obj[0] = this;
        System.arraycopy(bivArr, 0, obj, 1, 1);
        return new biu(obj);
    }

    public final String a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            Writer stringWriter = new StringWriter(charSequence.length() * 2);
            a(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
