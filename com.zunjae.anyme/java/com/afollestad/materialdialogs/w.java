package com.afollestad.materialdialogs;

final class w {
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

    public static int a(int i) {
        switch (n.b[i - 1]) {
            case a /*1*/:
                return R.layout.md_listitem;
            case b /*2*/:
                return R.layout.md_listitem_singlechoice;
            case c /*3*/:
                return R.layout.md_listitem_multichoice;
            default:
                throw new IllegalArgumentException("Not a valid list type");
        }
    }

    public static int[] a() {
        return (int[]) d.clone();
    }
}
