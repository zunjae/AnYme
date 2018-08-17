package defpackage;

import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class bex {
    static final bhi a = bhi.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] b = new String[64];
    static final String[] c = new String[256];
    private static final String[] d = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = bdb.a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = b;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        strArr2[8] = "PADDED";
        for (i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = b;
            int i4 = i3 | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b[i3]);
            stringBuilder.append("|PADDED");
            strArr3[i4] = stringBuilder.toString();
        }
        strArr2 = b;
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = new int[]{4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (i4 = 0; i4 <= 0; i4++) {
                int i7 = iArr[i4];
                String[] strArr4 = b;
                int i8 = i7 | i6;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(b[i7]);
                stringBuilder2.append('|');
                stringBuilder2.append(b[i6]);
                strArr4[i8] = stringBuilder2.toString();
                strArr4 = b;
                i8 |= 8;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(b[i7]);
                stringBuilder2.append('|');
                stringBuilder2.append(b[i6]);
                stringBuilder2.append("|PADDED");
                strArr4[i8] = stringBuilder2.toString();
            }
        }
        while (true) {
            strArr2 = b;
            if (i < strArr2.length) {
                if (strArr2[i] == null) {
                    strArr2[i] = c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private bex() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(bdb.a(str, objArr));
    }

    static String a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String[] strArr = d;
        String a = b < strArr.length ? strArr[b] : bdb.a("0x%02x", Byte.valueOf(b));
        if (b2 != (byte) 0) {
            switch (b) {
                case tw.b /*2*/:
                case f.c /*3*/:
                case mh.g /*7*/:
                case mh.h /*8*/:
                    str = c[b2];
                    break;
                case mh.d /*4*/:
                case mh.f /*6*/:
                    if (b2 != (byte) 1) {
                        str = c[b2];
                        break;
                    }
                    str = "ACK";
                    break;
                default:
                    CharSequence charSequence;
                    CharSequence charSequence2;
                    String[] strArr2 = b;
                    String str2 = b2 < strArr2.length ? strArr2[b2] : c[b2];
                    if (b == (byte) 5 && (b2 & 4) != 0) {
                        charSequence = "HEADERS";
                        charSequence2 = "PUSH_PROMISE";
                    } else if (b != (byte) 0 || (b2 & 32) == 0) {
                        str = str2;
                        break;
                    } else {
                        charSequence = "PRIORITY";
                        charSequence2 = "COMPRESSED";
                    }
                    str = str2.replace(charSequence, charSequence2);
                    break;
            }
        }
        str = BuildConfig.FLAVOR;
        String str3 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = str;
        return bdb.a(str3, objArr);
    }

    static IOException b(String str, Object... objArr) {
        throw new IOException(bdb.a(str, objArr));
    }
}
