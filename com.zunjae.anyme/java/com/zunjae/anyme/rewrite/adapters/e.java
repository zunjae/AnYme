package com.zunjae.anyme.rewrite.adapters;

public final class e {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    private static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[e];
        iArr[0] = a;
        iArr[a] = b;
        iArr[b] = c;
        iArr[c] = d;
        iArr[d] = e;
        f = iArr;
    }

    public static int[] a() {
        return (int[]) f.clone();
    }
}
