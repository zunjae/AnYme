package defpackage;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;

public final class bik {
    public static final char a = File.separatorChar;
    public static final String b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r0 = java.io.File.separatorChar;
        a = r0;
        r0 = new bil;
        r1 = 0;
        r0.<init>(r1);
        r1 = 0;
        r2 = new java.io.PrintWriter;	 Catch:{ Throwable -> 0x003a }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x003a }
        r2.println();	 Catch:{ Throwable -> 0x0023, all -> 0x0020 }
        r3 = r0.toString();	 Catch:{ Throwable -> 0x0023, all -> 0x0020 }
        b = r3;	 Catch:{ Throwable -> 0x0023, all -> 0x0020 }
        r2.close();	 Catch:{ Throwable -> 0x003a }
        r0.close();
        return;
    L_0x0020:
        r3 = move-exception;
        r4 = r1;
        goto L_0x0029;
    L_0x0023:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r4 = move-exception;
        r5 = r4;
        r4 = r3;
        r3 = r5;
    L_0x0029:
        if (r4 == 0) goto L_0x0034;
    L_0x002b:
        r2.close();	 Catch:{ Throwable -> 0x002f }
        goto L_0x0037;
    L_0x002f:
        r2 = move-exception;
        r4.addSuppressed(r2);	 Catch:{ Throwable -> 0x003a }
        goto L_0x0037;
    L_0x0034:
        r2.close();	 Catch:{ Throwable -> 0x003a }
    L_0x0037:
        throw r3;	 Catch:{ Throwable -> 0x003a }
    L_0x0038:
        r2 = move-exception;
        goto L_0x003c;
    L_0x003a:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0038 }
    L_0x003c:
        if (r1 == 0) goto L_0x0047;
    L_0x003e:
        r0.close();	 Catch:{ Throwable -> 0x0042 }
        goto L_0x004a;
    L_0x0042:
        r0 = move-exception;
        r1.addSuppressed(r0);
        goto L_0x004a;
    L_0x0047:
        r0.close();
    L_0x004a:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bik.<clinit>():void");
    }

    private static long a(Reader reader, Writer writer, char[] cArr) {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += (long) read;
        }
    }

    private static String a(InputStream inputStream, Charset charset) {
        Throwable th;
        Writer bil = new bil();
        try {
            bik.a(new InputStreamReader(inputStream, bii.a(charset)), bil, new char[4096]);
            String defpackage_bil = bil.toString();
            bil.close();
            return defpackage_bil;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public static String a(URL url) {
        return bik.a(url, Charset.defaultCharset());
    }

    private static String a(URL url, Charset charset) {
        Throwable th;
        InputStream openStream = url.openStream();
        try {
            String a = bik.a(openStream, charset);
            if (openStream != null) {
                openStream.close();
            }
            return a;
        } catch (Throwable th2) {
            th = th2;
        }
        if (openStream != null) {
            if (r0 != null) {
                try {
                    openStream.close();
                } catch (Throwable th3) {
                    r0.addSuppressed(th3);
                }
            } else {
                openStream.close();
            }
        }
        throw th;
        throw th;
    }
}
