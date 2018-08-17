package defpackage;

import java.util.Arrays;
import java.util.Collection;

public final class eh<T> implements ek<T> {
    private final Collection<? extends ek<T>> a;
    private String b;

    @SafeVarargs
    public eh(ek<T>... ekVarArr) {
        if (ekVarArr.length > 0) {
            this.a = Arrays.asList(ekVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public final ft<T> a(ft<T> ftVar, int i, int i2) {
        ft<T> ftVar2 = ftVar;
        for (ek a : this.a) {
            ft<T> a2 = a.a(ftVar2, i, i2);
            if (!(ftVar2 == null || ftVar2.equals(ftVar) || ftVar2.equals(a2))) {
                ftVar2.d();
            }
            ftVar2 = a2;
        }
        return ftVar2;
    }

    public final String a() {
        if (this.b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (ek a : this.a) {
                stringBuilder.append(a.a());
            }
            this.b = stringBuilder.toString();
        }
        return this.b;
    }
}
