package defpackage;

import android.annotation.SuppressLint;
import java.util.Objects;

public final class asg {
    private final int a;
    private final String b;

    public asg(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                asg asg = (asg) obj;
                return this.a == asg.a && Objects.equals(this.b.toLowerCase(), asg.b.toLowerCase());
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        if (this.a <= 0) {
            return this.b;
        }
        return String.format("%s %d", new Object[]{this.b, Integer.valueOf(this.a)});
    }
}
