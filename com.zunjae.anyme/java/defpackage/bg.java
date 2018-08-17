package defpackage;

public final class bg {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[d];
        iArr[0] = a;
        iArr[a] = b;
        iArr[b] = c;
        iArr[c] = d;
        e = iArr;
    }

    public static int[] a() {
        return (int[]) e.clone();
    }
}
