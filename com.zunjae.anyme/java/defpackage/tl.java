package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

final class tl {
    private static File a(File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    static byte[] a(java.io.File r2) {
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
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x001b, IOException -> 0x0016, all -> 0x0011 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x001b, IOException -> 0x0016, all -> 0x0011 }
        r2 = defpackage.tl.a(r1);	 Catch:{ FileNotFoundException -> 0x001c, IOException -> 0x0017, all -> 0x000e }
        defpackage.awj.b(r1);
        return r2;
    L_0x000e:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0012;
    L_0x0011:
        r2 = move-exception;
    L_0x0012:
        defpackage.awj.b(r0);
        throw r2;
    L_0x0016:
        r1 = r0;
    L_0x0017:
        defpackage.awj.b(r1);
        return r0;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        defpackage.awj.b(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.a(java.io.File):byte[]");
    }

    static byte[] a(File file, Context context) {
        File a = tl.a(file, ".maps");
        if (a != null) {
            return tl.b(a, context);
        }
        file = tl.a(file, ".binary_libs");
        if (file != null) {
            byte[] a2 = tl.a(file);
            if (a2 != null) {
                if (a2.length != 0) {
                    return new pw(context, new uf()).a(new String(a2));
                }
            }
        }
        return null;
    }

    private static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static byte[] b(File file) {
        file = tl.a(file, ".dmp");
        return file == null ? new byte[0] : tl.a(file);
    }

    private static byte[] b(File file, Context context) {
        Closeable bufferedReader;
        Throwable th;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new pw(context, new uf()).a((BufferedReader) bufferedReader);
                awj.b(bufferedReader);
                return a;
            } catch (Throwable th2) {
                th = th2;
                awj.b(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            awj.b(bufferedReader);
            throw th;
        }
    }

    static byte[] c(File file) {
        file = tl.a(file, ".device_info");
        return file == null ? null : tl.a(file);
    }
}
