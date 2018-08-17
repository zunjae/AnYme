package defpackage;

import java.util.Random;

final class pd implements ayi {
    final ayi a;
    final Random b;
    final double c;

    public pd(ayi ayi) {
        this(ayi, new Random());
    }

    private pd(ayi ayi, Random random) {
        if (ayi != null) {
            this.a = ayi;
            this.c = 0.1d;
            this.b = random;
            return;
        }
        throw new NullPointerException("backoff must not be null");
    }

    public final long a(int i) {
        double d = this.c;
        double d2 = 1.0d - d;
        d2 += ((d + 1.0d) - d2) * this.b.nextDouble();
        d = (double) this.a.a(i);
        Double.isNaN(d);
        return (long) (d2 * d);
    }
}
