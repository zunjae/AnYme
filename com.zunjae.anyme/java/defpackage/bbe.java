package defpackage;

import java.util.Comparator;

final class bbe implements Comparator<String> {
    bbe() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (i < min) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            } else {
                i++;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        return length != length2 ? length < length2 ? -1 : 1 : 0;
    }
}
