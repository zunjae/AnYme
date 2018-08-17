package defpackage;

import java.io.Writer;

public abstract class biw extends biv {
    public final int a(CharSequence charSequence, int i, Writer writer) {
        return a(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean a(int i, Writer writer);
}
