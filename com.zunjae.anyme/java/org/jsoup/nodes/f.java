package org.jsoup.nodes;

final class f {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[c];
        iArr[0] = a;
        iArr[a] = b;
        iArr[b] = c;
        d = iArr;
    }

    static /* synthetic */ int a(String str) {
        return str.equals("US-ASCII") ? a : str.startsWith("UTF-") ? b : c;
    }

    public static int[] a() {
        return (int[]) d.clone();
    }
}
