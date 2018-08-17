package defpackage;

import java.util.Collections;
import java.util.List;

public final class ah {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final List<String> e;

    public ah(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ah ahVar = (ah) obj;
                return (this.a.equals(ahVar.a) && this.b.equals(ahVar.b) && this.c.equals(ahVar.c) && this.d.equals(ahVar.d)) ? this.e.equals(ahVar.e) : false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForeignKey{referenceTable='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", onDelete='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", onUpdate='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", columnNames=");
        stringBuilder.append(this.d);
        stringBuilder.append(", referenceColumnNames=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
