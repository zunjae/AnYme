package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;

public final class ag {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;

    public ag(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = i;
        int i2 = 5;
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.US);
            if (str2.contains("INT")) {
                i2 = 3;
            } else {
                if (!(str2.contains("CHAR") || str2.contains("CLOB"))) {
                    if (!str2.contains("TEXT")) {
                        if (!str2.contains("BLOB")) {
                            if (!(str2.contains("REAL") || str2.contains("FLOA"))) {
                                if (!str2.contains("DOUB")) {
                                    i2 = 1;
                                }
                            }
                            i2 = 4;
                        }
                    }
                }
                i2 = 2;
            }
        }
        this.c = i2;
    }

    private boolean a() {
        return this.e > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ag agVar = (ag) obj;
                if (VERSION.SDK_INT >= 20) {
                    if (this.e != agVar.e) {
                        return false;
                    }
                } else if (a() != agVar.a()) {
                    return false;
                }
                if (this.a.equals(agVar.a) && this.d == agVar.d && this.c == agVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Column{name='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", type='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", affinity='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", notNull=");
        stringBuilder.append(this.d);
        stringBuilder.append(", primaryKeyPosition=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
