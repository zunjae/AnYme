package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class bit {
    public static String a(String str, String str2, String str3) {
        if (!(bit.a(str) || bit.a(str2))) {
            if (str3 != null) {
                int i = 0;
                int indexOf = str.indexOf(str2, 0);
                if (indexOf == -1) {
                    return str;
                }
                int length = str2.length();
                int length2 = str3.length() - length;
                if (length2 < 0) {
                    length2 = 0;
                }
                StringBuilder stringBuilder = new StringBuilder(str.length() + (length2 * 16));
                length2 = -1;
                while (indexOf != -1) {
                    stringBuilder.append(str.substring(i, indexOf));
                    stringBuilder.append(str3);
                    i = indexOf + length;
                    length2--;
                    if (length2 == 0) {
                        break;
                    }
                    indexOf = str.indexOf(str2, i);
                }
                stringBuilder.append(str.substring(i));
                str = stringBuilder.toString();
            }
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.util.Iterator<?> r3, java.lang.String r4) {
        /*
        if (r3 != 0) goto L_0x0004;
    L_0x0002:
        r3 = 0;
        return r3;
    L_0x0004:
        r0 = r3.hasNext();
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r3 = "";
        return r3;
    L_0x000d:
        r0 = r3.next();
        r1 = r3.hasNext();
        if (r1 != 0) goto L_0x001c;
    L_0x0017:
        r3 = defpackage.bio.a(r0);
        return r3;
    L_0x001c:
        r1 = new java.lang.StringBuilder;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1.<init>(r2);
        if (r0 == 0) goto L_0x0028;
    L_0x0025:
        r1.append(r0);
    L_0x0028:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0038;
    L_0x002e:
        r1.append(r4);
        r0 = r3.next();
        if (r0 == 0) goto L_0x0028;
    L_0x0037:
        goto L_0x0025;
    L_0x0038:
        r3 = r1.toString();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: bit.a(java.util.Iterator, java.lang.String):java.lang.String");
    }

    public static String a(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        int i = length + 0;
        if (i <= 0) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder stringBuilder = new StringBuilder(i * 16);
        for (i = 0; i < length; i++) {
            if (i > 0) {
                stringBuilder.append(str);
            }
            if (objArr[i] != null) {
                stringBuilder.append(objArr[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean a(CharSequence charSequence) {
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(CharSequence charSequence, char... cArr) {
        if (!bit.a(charSequence)) {
            if (!bim.a(cArr)) {
                int length = charSequence.length();
                int length2 = cArr.length;
                int i = length - 1;
                int i2 = length2 - 1;
                int i3 = 0;
                while (i3 < length) {
                    char charAt = charSequence.charAt(i3);
                    int i4 = 0;
                    while (i4 < length2) {
                        if (cArr[i4] == charAt) {
                            if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                                return true;
                            }
                            if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                                return true;
                            }
                        }
                        i4++;
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(charSequence.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence, char... cArr) {
        if (charSequence != null) {
            if (cArr != null) {
                int length = charSequence.length();
                int i = length - 1;
                int length2 = cArr.length;
                int i2 = length2 - 1;
                int i3 = 0;
                while (i3 < length) {
                    char charAt = charSequence.charAt(i3);
                    int i4 = 0;
                    while (i4 < length2) {
                        if (cArr[i4] == charAt) {
                            if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                                return false;
                            }
                            if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                                return false;
                            }
                        }
                        i4++;
                    }
                    i3++;
                }
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return !bit.b(charSequence);
    }
}
