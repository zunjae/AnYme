package okhttp3.internal.publicsuffix;

import defpackage.bdb;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    private static final byte[] a = new byte[]{(byte) 42};
    private static final String[] b = new String[0];
    private static final String[] c = new String[]{"*"};
    private static final PublicSuffixDatabase d = new PublicSuffixDatabase();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            int i4;
            int i5 = (i2 + length) / 2;
            while (i5 >= 0 && bArr3[i5] != (byte) 10) {
                i5--;
            }
            i5++;
            int i6 = 1;
            while (true) {
                i3 = i5 + i6;
                if (bArr3[i3] == (byte) 10) {
                    break;
                }
                i6++;
            }
            int i7 = i3 - i5;
            int i8 = i;
            Object obj = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (obj != null) {
                    obj = null;
                    i4 = 46;
                } else {
                    i4 = bArr4[i8][i9] & 255;
                }
                i4 -= bArr3[i5 + i10] & 255;
                if (i4 != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 != i7) {
                    if (bArr4[i8].length == i9) {
                        if (i8 == bArr4.length - 1) {
                            break;
                        }
                        i8++;
                        obj = 1;
                        i9 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i11 = i7 - i10;
                    i6 = bArr4[i8].length - i9;
                    while (true) {
                        i8++;
                        if (i8 >= bArr4.length) {
                            break;
                        }
                        i6 += bArr4[i8].length;
                    }
                    if (i6 >= i11) {
                        if (i6 <= i11) {
                            return new String(bArr, i5, i7, bdb.e);
                        }
                    }
                }
                i2 = i3 + 1;
            }
            length = i5 - 1;
        }
        return null;
    }

    public static PublicSuffixDatabase a() {
        return d;
    }

    private java.lang.String[] a(java.lang.String[] r8) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r7 = this;
        r0 = r7.e;
        r0 = r0.get();
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0072;
    L_0x000a:
        r0 = r7.e;
        r0 = r0.compareAndSet(r1, r2);
        if (r0 == 0) goto L_0x0072;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r4 = "publicsuffixes.gz";	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r3 = r3.getResourceAsStream(r4);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        if (r3 == 0) goto L_0x0053;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
    L_0x001d:
        r4 = new bhm;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r3 = defpackage.bho.a(r3);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r4.<init>(r3);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r3 = defpackage.bho.a(r4);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r4 = r3.j();	 Catch:{ all -> 0x004e }
        r4 = new byte[r4];	 Catch:{ all -> 0x004e }
        r3.a(r4);	 Catch:{ all -> 0x004e }
        r5 = r3.j();	 Catch:{ all -> 0x004e }
        r5 = new byte[r5];	 Catch:{ all -> 0x004e }
        r3.a(r5);	 Catch:{ all -> 0x004e }
        defpackage.bdb.a(r3);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        monitor-enter(r7);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r7.g = r4;	 Catch:{ all -> 0x004b }
        r7.h = r5;	 Catch:{ all -> 0x004b }
        monitor-exit(r7);	 Catch:{ all -> 0x004b }
        r3 = r7.f;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        r3.countDown();	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        goto L_0x0053;
    L_0x004b:
        r3 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x004b }
        throw r3;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
    L_0x004e:
        r4 = move-exception;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        defpackage.bdb.a(r3);	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
        throw r4;	 Catch:{ InterruptedIOException -> 0x0070, IOException -> 0x0058 }
    L_0x0053:
        if (r0 == 0) goto L_0x007f;
    L_0x0055:
        goto L_0x0078;
    L_0x0056:
        r8 = move-exception;
        goto L_0x0066;
    L_0x0058:
        r3 = move-exception;
        r4 = defpackage.bgo.c();	 Catch:{ all -> 0x0056 }
        r5 = 5;	 Catch:{ all -> 0x0056 }
        r6 = "Failed to read public suffix list";	 Catch:{ all -> 0x0056 }
        r4.a(r5, r6, r3);	 Catch:{ all -> 0x0056 }
        if (r0 == 0) goto L_0x007f;
    L_0x0065:
        goto L_0x0078;
    L_0x0066:
        if (r0 == 0) goto L_0x006f;
    L_0x0068:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x006f:
        throw r8;
    L_0x0070:
        r0 = 1;
        goto L_0x0013;
    L_0x0072:
        r0 = r7.f;	 Catch:{ InterruptedException -> 0x0078 }
        r0.await();	 Catch:{ InterruptedException -> 0x0078 }
        goto L_0x007f;
    L_0x0078:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x007f:
        monitor-enter(r7);
        r0 = r7.g;	 Catch:{ all -> 0x011b }
        if (r0 == 0) goto L_0x0113;	 Catch:{ all -> 0x011b }
    L_0x0084:
        monitor-exit(r7);	 Catch:{ all -> 0x011b }
        r0 = r8.length;
        r0 = new byte[r0][];
        r3 = 0;
    L_0x0089:
        r4 = r8.length;
        if (r3 >= r4) goto L_0x0099;
    L_0x008c:
        r4 = r8[r3];
        r5 = defpackage.bdb.e;
        r4 = r4.getBytes(r5);
        r0[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0089;
    L_0x0099:
        r8 = 0;
    L_0x009a:
        r3 = r0.length;
        r4 = 0;
        if (r8 >= r3) goto L_0x00aa;
    L_0x009e:
        r3 = r7.g;
        r3 = a(r3, r0, r8);
        if (r3 == 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00ab;
    L_0x00a7:
        r8 = r8 + 1;
        goto L_0x009a;
    L_0x00aa:
        r3 = r4;
    L_0x00ab:
        r8 = r0.length;
        if (r8 <= r2) goto L_0x00c9;
    L_0x00ae:
        r8 = r0.clone();
        r8 = (byte[][]) r8;
        r5 = 0;
    L_0x00b5:
        r6 = r8.length;
        r6 = r6 - r2;
        if (r5 >= r6) goto L_0x00c9;
    L_0x00b9:
        r6 = a;
        r8[r5] = r6;
        r6 = r7.g;
        r6 = a(r6, r8, r5);
        if (r6 == 0) goto L_0x00c6;
    L_0x00c5:
        goto L_0x00ca;
    L_0x00c6:
        r5 = r5 + 1;
        goto L_0x00b5;
    L_0x00c9:
        r6 = r4;
    L_0x00ca:
        if (r6 == 0) goto L_0x00dc;
    L_0x00cc:
        r8 = r0.length;
        r8 = r8 - r2;
        if (r1 >= r8) goto L_0x00dc;
    L_0x00d0:
        r8 = r7.h;
        r8 = a(r8, r0, r1);
        if (r8 == 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00dd;
    L_0x00d9:
        r1 = r1 + 1;
        goto L_0x00cc;
    L_0x00dc:
        r8 = r4;
    L_0x00dd:
        if (r8 == 0) goto L_0x00f0;
    L_0x00df:
        r0 = "!";
        r8 = java.lang.String.valueOf(r8);
        r8 = r0.concat(r8);
        r0 = "\\.";
        r8 = r8.split(r0);
        return r8;
    L_0x00f0:
        if (r3 != 0) goto L_0x00f7;
    L_0x00f2:
        if (r6 != 0) goto L_0x00f7;
    L_0x00f4:
        r8 = c;
        return r8;
    L_0x00f7:
        if (r3 == 0) goto L_0x0100;
    L_0x00f9:
        r8 = "\\.";
        r8 = r3.split(r8);
        goto L_0x0102;
    L_0x0100:
        r8 = b;
    L_0x0102:
        if (r6 == 0) goto L_0x010b;
    L_0x0104:
        r0 = "\\.";
        r0 = r6.split(r0);
        goto L_0x010d;
    L_0x010b:
        r0 = b;
    L_0x010d:
        r1 = r8.length;
        r2 = r0.length;
        if (r1 <= r2) goto L_0x0112;
    L_0x0111:
        return r8;
    L_0x0112:
        return r0;
    L_0x0113:
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011b }
        r0 = "Unable to load publicsuffixes.gz resource from the classpath.";	 Catch:{ all -> 0x011b }
        r8.<init>(r0);	 Catch:{ all -> 0x011b }
        throw r8;	 Catch:{ all -> 0x011b }
    L_0x011b:
        r8 = move-exception;	 Catch:{ all -> 0x011b }
        monitor-exit(r7);	 Catch:{ all -> 0x011b }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String[]):java.lang.String[]");
    }

    public final String a(String str) {
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] a = a(split);
            if (split.length == a.length && a[0].charAt(0) != '!') {
                return null;
            }
            int length;
            int length2;
            if (a[0].charAt(0) == '!') {
                length = split.length;
                length2 = a.length;
            } else {
                length = split.length;
                length2 = a.length + 1;
            }
            StringBuilder stringBuilder = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (length -= length2; length < split2.length; length++) {
                stringBuilder.append(split2[length]);
                stringBuilder.append('.');
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            return stringBuilder.toString();
        }
        throw new NullPointerException("domain == null");
    }
}
