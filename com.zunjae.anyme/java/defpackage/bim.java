package defpackage;

import java.lang.reflect.Array;

public final class bim {
    public static final Object[] a = new Object[0];
    public static final Class<?>[] b = new Class[0];
    public static final String[] c = new String[0];
    public static final long[] d = new long[0];
    public static final Long[] e = new Long[0];
    public static final int[] f = new int[0];
    public static final Integer[] g = new Integer[0];
    public static final short[] h = new short[0];
    public static final Short[] i = new Short[0];
    public static final byte[] j = new byte[0];
    public static final Byte[] k = new Byte[0];
    public static final double[] l = new double[0];
    public static final Double[] m = new Double[0];
    public static final float[] n = new float[0];
    public static final Float[] o = new Float[0];
    public static final boolean[] p = new boolean[0];
    public static final Boolean[] q = new Boolean[0];
    public static final char[] r = new char[0];
    public static final Character[] s = new Character[0];

    private static int a(Object obj) {
        return obj == null ? 0 : Array.getLength(obj);
    }

    public static boolean a(char[] cArr) {
        return bim.a((Object) cArr) == 0;
    }

    public static <T> T[] a(T[] tArr) {
        return tArr == null ? null : (Object[]) tArr.clone();
    }

    public static boolean b(Object[] objArr) {
        return bim.a((Object) objArr) == 0;
    }
}
