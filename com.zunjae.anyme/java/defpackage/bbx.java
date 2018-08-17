package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public final class bbx {
    private final String[] a;

    bbx(bby bby) {
        List list = bby.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    private bbx(String[] strArr) {
        this.a = strArr;
    }

    public static bbx a(String... strArr) {
        strArr = (String[]) strArr.clone();
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i] != null) {
                strArr[i] = strArr[i].trim();
                i++;
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                i += 2;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unexpected header: ");
                stringBuilder.append(str);
                stringBuilder.append(": ");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return new bbx(strArr);
    }

    public final int a() {
        return this.a.length / 2;
    }

    public final String a(int i) {
        return this.a[i * 2];
    }

    @Nullable
    public final String a(String str) {
        String[] strArr = this.a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final bby b() {
        bby bby = new bby();
        Collections.addAll(bby.a, this.a);
        return bby;
    }

    public final String b(int i) {
        return this.a[(i * 2) + 1];
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof bbx) && Arrays.equals(((bbx) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(a(i));
            stringBuilder.append(": ");
            stringBuilder.append(b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
