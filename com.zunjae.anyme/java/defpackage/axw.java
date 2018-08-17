package defpackage;

public final class axw {
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

    static <Y> int a(ayc ayc, Y y) {
        return ((y instanceof ayc ? ((ayc) y).a() : b) - 1) - (ayc.a() - 1);
    }
}
