package defpackage;

import java.lang.reflect.Array;

final class bx {
    static final /* synthetic */ boolean a = true;

    private bx() {
    }

    private static int a(int i) {
        return i <= 4 ? 8 : i * 2;
    }

    public static int[] a(int[] iArr, int i, int i2) {
        if (!a) {
            if (i > iArr.length) {
                throw new AssertionError();
            }
        }
        if (i + 1 > iArr.length) {
            Object obj = new int[bx.a(i)];
            System.arraycopy(iArr, 0, obj, 0, i);
            iArr = obj;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static <T> T[] a(T[] tArr, int i, T t) {
        if (!a) {
            if (i > tArr.length) {
                throw new AssertionError();
            }
        }
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), bx.a(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }
}
