package defpackage;

import android.graphics.Bitmap.Config;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class nw {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static final char[] b = new char[64];
    private static final char[] c = new char[40];

    public static int a(int i, int i2, Config config) {
        i *= i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (nx.a[config.ordinal()]) {
            case tw.a /*1*/:
                i2 = 1;
                break;
            case tw.b /*2*/:
            case f.c /*3*/:
                i2 = 2;
                break;
            default:
                i2 = 4;
                break;
        }
        return i * i2;
    }

    @android.annotation.TargetApi(19)
    public static int a(android.graphics.Bitmap r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x000b;
    L_0x0006:
        r0 = r2.getAllocationByteCount();	 Catch:{ NullPointerException -> 0x000b }
        return r0;
    L_0x000b:
        r0 = r2.getHeight();
        r2 = r2.getRowBytes();
        r0 = r0 * r2;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: nw.a(android.graphics.Bitmap):int");
    }

    public static String a(byte[] bArr) {
        String str;
        synchronized (b) {
            char[] cArr = b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                int i3 = i * 2;
                cArr[i3] = a[i2 >>> 4];
                cArr[i3 + 1] = a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static <T> List<T> a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static <T> Queue<T> a(int i) {
        return new ArrayDeque(i);
    }

    public static void a() {
        if (!nw.c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean a(int i, int i2) {
        return nw.b(i) && nw.b(i2);
    }

    public static void b() {
        if (!nw.d()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    private static boolean b(int i) {
        if (i <= 0) {
            if (i != Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d() {
        return !nw.c();
    }
}
