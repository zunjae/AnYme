package defpackage;

import java.util.List;

public final class aj {
    public final String a;
    public final boolean b;
    public final List<String> c;

    public aj(String str, boolean z, List<String> list) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                aj ajVar = (aj) obj;
                return (this.b == ajVar.b && this.c.equals(ajVar.c)) ? this.a.startsWith("index_") ? ajVar.a.startsWith("index_") : this.a.equals(ajVar.a) : false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.startsWith("index_") ? "index_" : this.a).hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Index{name='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", unique=");
        stringBuilder.append(this.b);
        stringBuilder.append(", columns=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
