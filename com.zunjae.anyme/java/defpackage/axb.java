package defpackage;

import java.io.InputStream;

final class axb implements axe {
    boolean a = true;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ axa c;

    axb(axa axa, StringBuilder stringBuilder) {
        this.c = axa;
        this.b = stringBuilder;
    }

    public final void a(InputStream inputStream, int i) {
        if (this.a) {
            this.a = false;
        } else {
            this.b.append(", ");
        }
        this.b.append(i);
    }
}
