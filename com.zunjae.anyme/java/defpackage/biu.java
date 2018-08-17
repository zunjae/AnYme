package defpackage;

import java.io.Writer;

public final class biu extends biv {
    private final biv[] b;

    public biu(biv... bivArr) {
        this.b = (biv[]) bim.a((Object[]) bivArr);
    }

    public final int a(CharSequence charSequence, int i, Writer writer) {
        for (biv a : this.b) {
            int a2 = a.a(charSequence, i, writer);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }
}
