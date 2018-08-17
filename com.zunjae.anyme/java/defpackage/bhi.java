package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class bhi implements Serializable, Comparable<bhi> {
    static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final bhi b = bhi.a(new byte[0]);
    final byte[] c;
    transient int d;
    transient String e;

    bhi(byte[] bArr) {
        this.c = bArr;
    }

    private static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        int i = 97;
        if (c < 'a' || c > 'f') {
            i = 65;
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
            }
        }
        return (c - i) + 10;
    }

    public static bhi a(String str) {
        if (str != null) {
            bhi bhi = new bhi(str.getBytes(bic.a));
            bhi.e = str;
            return bhi;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static bhi a(byte... bArr) {
        if (bArr != null) {
            return new bhi((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static bhi b(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((bhi.a(str.charAt(i2)) << 4) + bhi.a(str.charAt(i2 + 1)));
            }
            return bhi.a(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
    }

    private bhi c(String str) {
        try {
            return bhi.a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public byte a(int i) {
        return this.c[i];
    }

    public bhi a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    Object obj = new byte[i3];
                    System.arraycopy(this.c, i, obj, 0, i3);
                    return new bhi(obj);
                }
            }
            StringBuilder stringBuilder = new StringBuilder("endIndex > length(");
            stringBuilder.append(this.c.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        str = new String(this.c, bic.a);
        this.e = str;
        return str;
    }

    void a(bhd bhd) {
        byte[] bArr = this.c;
        bhd.b(bArr, 0, bArr.length);
    }

    public boolean a(int i, bhi bhi, int i2, int i3) {
        return bhi.a(0, this.c, 0, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && bic.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        return bhc.a(this.c);
    }

    public bhi c() {
        return c("SHA-1");
    }

    public /* synthetic */ int compareTo(Object obj) {
        bhi bhi = (bhi) obj;
        int g = g();
        int g2 = bhi.g();
        int min = Math.min(g, g2);
        int i = 0;
        while (i < min) {
            int a = a(i) & 255;
            int a2 = bhi.a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            } else {
                i++;
            }
        }
        return g == g2 ? 0 : g < g2 ? -1 : 1;
    }

    public bhi d() {
        return c("SHA-256");
    }

    public String e() {
        byte[] bArr = this.c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhi) {
            bhi bhi = (bhi) obj;
            int g = bhi.g();
            byte[] bArr = this.c;
            return g == bArr.length && bhi.a(0, bArr, 0, bArr.length);
        }
    }

    public bhi f() {
        Object obj;
        byte b;
        int i = 0;
        while (true) {
            obj = this.c;
            if (i < obj.length) {
                b = obj[i];
                if (b >= (byte) 65 && b <= (byte) 90) {
                    break;
                }
                i++;
            } else {
                return this;
            }
        }
        byte[] bArr = (byte[]) obj.clone();
        bArr[i] = (byte) (b + 32);
        for (int i2 = i + 1; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            if (b2 >= (byte) 65 && b2 <= (byte) 90) {
                bArr[i2] = (byte) (b2 + 32);
            }
        }
        return new bhi(bArr);
    }

    public int g() {
        return this.c.length;
    }

    public byte[] h() {
        return (byte[]) this.c.clone();
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.c);
        this.d = i;
        return i;
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String replace;
        StringBuilder stringBuilder;
        String a = a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 != 64) {
                int codePointAt = a.codePointAt(i);
                if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                    i = -1;
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        i = a.length();
        if (i != -1) {
            replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                stringBuilder = new StringBuilder("[size=");
                stringBuilder.append(this.c.length);
                stringBuilder.append(" text=");
                stringBuilder.append(replace);
                replace = "\u2026]";
                stringBuilder.append(replace);
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder("[text=");
        } else if (this.c.length <= 64) {
            stringBuilder = new StringBuilder("[hex=");
            replace = e();
        } else {
            stringBuilder = new StringBuilder("[size=");
            stringBuilder.append(this.c.length);
            stringBuilder.append(" hex=");
            replace = a(0, 64).e();
            stringBuilder.append(replace);
            replace = "\u2026]";
            stringBuilder.append(replace);
            return stringBuilder.toString();
        }
        stringBuilder.append(replace);
        replace = "]";
        stringBuilder.append(replace);
        return stringBuilder.toString();
    }
}
