package defpackage;

import javax.annotation.Nullable;

public abstract class bcp {
    public static bcp a(@Nullable bcd bcd, bhi bhi) {
        return new bcq(bcd, bhi);
    }

    public static bcp a(byte[] bArr) {
        int length = bArr.length;
        if (bArr != null) {
            bdb.a((long) bArr.length, (long) length);
            return new bcr(length, bArr);
        }
        throw new NullPointerException("content == null");
    }

    @Nullable
    public abstract bcd a();

    public abstract void a(bhg bhg);

    public long b() {
        return -1;
    }
}
