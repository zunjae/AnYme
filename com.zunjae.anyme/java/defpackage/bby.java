package defpackage;

import java.util.ArrayList;
import java.util.List;

public final class bby {
    final List<String> a = new ArrayList(20);

    private static void d(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        } else {
            int i;
            char charAt;
            int length = str.length();
            for (i = 0; i < length; i++) {
                charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= '\u007f') {
                    throw new IllegalArgumentException(bdb.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            if (str2 != null) {
                length = str2.length();
                i = 0;
                while (i < length) {
                    charAt = str2.charAt(i);
                    if ((charAt > '\u001f' || charAt == '\t') && charAt < '\u007f') {
                        i++;
                    } else {
                        throw new IllegalArgumentException(bdb.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str, str2));
                    }
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("value for name ");
            stringBuilder.append(str);
            stringBuilder.append(" == null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    public final bbx a() {
        return new bbx(this);
    }

    public final bby a(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (str.equalsIgnoreCase((String) this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
        return this;
    }

    public final bby a(String str, String str2) {
        bby.d(str, str2);
        return b(str, str2);
    }

    final bby b(String str, String str2) {
        this.a.add(str);
        this.a.add(str2.trim());
        return this;
    }

    public final bby c(String str, String str2) {
        bby.d(str, str2);
        a(str);
        b(str, str2);
        return this;
    }
}
