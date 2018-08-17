package defpackage;

public final class anf {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    private static final /* synthetic */ int[] h;

    static {
        int[] iArr = new int[g];
        iArr[0] = a;
        iArr[a] = b;
        iArr[b] = c;
        iArr[c] = d;
        iArr[d] = e;
        iArr[e] = f;
        iArr[f] = g;
        h = iArr;
    }

    public static int[] a() {
        return (int[]) h.clone();
    }
}
