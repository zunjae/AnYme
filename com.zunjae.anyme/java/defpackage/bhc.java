package defpackage;

import java.io.UnsupportedEncodingException;

final class bhc {
    private static final byte[] a = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
    private static final byte[] b = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};

    public static String a(byte[] bArr) {
        return bhc.a(bArr, a);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        for (i = 0; i < length; i += 3) {
            int i3 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            i2 = i3 + 1;
            int i4 = i + 1;
            bArr3[i3] = bArr2[((bArr[i] & 3) << 4) | ((bArr[i4] & 255) >> 4)];
            i3 = i2 + 1;
            i4 = i + 2;
            bArr3[i2] = bArr2[((bArr[i4] & 15) << 2) | ((bArr[i4] & 255) >> 6)];
            i2 = i3 + 1;
            bArr3[i3] = bArr2[bArr[i4] & 63];
        }
        switch (bArr.length % 3) {
            case tw.a /*1*/:
                i = i2 + 1;
                bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
                i2 = i + 1;
                bArr3[i] = bArr2[(bArr[length] & 3) << 4];
                int i5 = i2 + 1;
                bArr3[i2] = (byte) 61;
                bArr3[i5] = (byte) 61;
                break;
            case tw.b /*2*/:
                i = i2 + 1;
                bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
                i2 = i + 1;
                length++;
                bArr3[i] = bArr2[((bArr[length] & 3) << 4) | ((bArr[length] & 255) >> 4)];
                i = i2 + 1;
                bArr3[i2] = bArr2[(bArr[length] & 15) << 2];
                bArr3[i] = (byte) 61;
                break;
            default:
                break;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
