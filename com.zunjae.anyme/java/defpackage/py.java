package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class py {
    public static final py a = new py(new byte[0]);
    private final byte[] b;
    private volatile int c = 0;

    private py(byte[] bArr) {
        this.b = bArr;
    }

    public static py a(String str) {
        try {
            return new py(str.getBytes("UTF-8"));
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static py a(byte[] bArr, int i) {
        Object obj = new byte[i];
        System.arraycopy(bArr, 0, obj, 0, i);
        return new py(obj);
    }

    public final int a() {
        return this.b.length;
    }

    public final void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, i, bArr, i2, i3);
    }

    public final InputStream b() {
        return new ByteArrayInputStream(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        byte[] bArr = this.b;
        int length = bArr.length;
        byte[] bArr2 = pyVar.b;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.b) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.c = i;
        }
        return i;
    }
}
