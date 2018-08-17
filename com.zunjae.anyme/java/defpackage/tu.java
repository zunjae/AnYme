package defpackage;

import java.util.HashMap;
import java.util.Map;

final class tu implements ug {
    private final int a;

    public tu() {
        this(1);
    }

    public tu(int i) {
        this.a = i;
    }

    private static boolean a(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i = this.a;
        Map hashMap = new HashMap();
        Object obj = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            int intValue;
            Object obj2 = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(obj2);
            if (num != null) {
                if (tu.a(stackTraceElementArr, num.intValue(), i2)) {
                    intValue = i2 - num.intValue();
                    if (i4 < i) {
                        System.arraycopy(stackTraceElementArr, i2, obj, i3, intValue);
                        i3 += intValue;
                        i4++;
                    }
                    intValue = (intValue - 1) + i2;
                    hashMap.put(obj2, Integer.valueOf(i2));
                    i2 = intValue + 1;
                }
            }
            obj[i3] = stackTraceElementArr[i2];
            i3++;
            intValue = i2;
            i4 = 1;
            hashMap.put(obj2, Integer.valueOf(i2));
            i2 = intValue + 1;
        }
        Object obj3 = new StackTraceElement[i3];
        System.arraycopy(obj, 0, obj3, 0, obj3.length);
        return obj3.length < stackTraceElementArr.length ? obj3 : stackTraceElementArr;
    }
}
