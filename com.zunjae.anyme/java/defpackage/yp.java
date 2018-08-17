package defpackage;

import java.io.Writer;

public final class yp {
    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new yq(appendable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wo a(defpackage.abn r2) {
        /*
        r2.f();	 Catch:{ EOFException -> 0x0024, abr -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r0 = 0;
        r1 = defpackage.zy.X;	 Catch:{ EOFException -> 0x000d, abr -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r2 = r1.a(r2);	 Catch:{ EOFException -> 0x000d, abr -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r2 = (defpackage.wo) r2;	 Catch:{ EOFException -> 0x000d, abr -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        return r2;
    L_0x000d:
        r2 = move-exception;
        goto L_0x0026;
    L_0x000f:
        r2 = move-exception;
        r0 = new wv;
        r0.<init>(r2);
        throw r0;
    L_0x0016:
        r2 = move-exception;
        r0 = new wp;
        r0.<init>(r2);
        throw r0;
    L_0x001d:
        r2 = move-exception;
        r0 = new wv;
        r0.<init>(r2);
        throw r0;
    L_0x0024:
        r2 = move-exception;
        r0 = 1;
    L_0x0026:
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r2 = defpackage.wq.a;
        return r2;
    L_0x002b:
        r0 = new wv;
        r0.<init>(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.a(abn):wo");
    }

    public static void a(wo woVar, abq abq) {
        zy.X.a(abq, woVar);
    }
}
