package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class do implements Closeable {
    final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final int f;
    private long g;
    private final int h;
    private long i = 0;
    private Writer j;
    private final LinkedHashMap<String, dr> k = new LinkedHashMap(0, 0.75f, true);
    private int l;
    private long m = 0;
    private final Callable<Void> n = new dp(this);

    private do(File file, long j) {
        File file2 = file;
        this.b = file2;
        this.f = 1;
        this.c = new File(file2, "journal");
        this.d = new File(file2, "journal.tmp");
        this.e = new File(file2, "journal.bkp");
        this.h = 1;
        this.g = j;
    }

    public static do a(File file, long j) {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    do.a(file2, file3, false);
                }
            }
            do doVar = new do(file, j);
            if (doVar.c.exists()) {
                try {
                    doVar.b();
                    doVar.c();
                    return doVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder stringBuilder = new StringBuilder("DiskLruCache ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    printStream.println(stringBuilder.toString());
                    doVar.a();
                }
            }
            file.mkdirs();
            doVar = new do(file, j);
            doVar.d();
            return doVar;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(defpackage.dq r10, boolean r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.b;	 Catch:{ all -> 0x0108 }
        r1 = r0.g;	 Catch:{ all -> 0x0108 }
        if (r1 != r10) goto L_0x0102;
    L_0x000b:
        r1 = 0;
        if (r11 == 0) goto L_0x0046;
    L_0x000e:
        r2 = r0.f;	 Catch:{ all -> 0x0108 }
        if (r2 != 0) goto L_0x0046;
    L_0x0014:
        r2 = 0;
    L_0x0015:
        r3 = r9.h;	 Catch:{ all -> 0x0108 }
        if (r2 >= r3) goto L_0x0046;
    L_0x0019:
        r3 = r10.c;	 Catch:{ all -> 0x0108 }
        r3 = r3[r2];	 Catch:{ all -> 0x0108 }
        if (r3 == 0) goto L_0x0033;
    L_0x0021:
        r3 = r0.b;	 Catch:{ all -> 0x0108 }
        r3 = r3[r2];	 Catch:{ all -> 0x0108 }
        r3 = r3.exists();	 Catch:{ all -> 0x0108 }
        if (r3 != 0) goto L_0x0030;
    L_0x002b:
        r10.c();	 Catch:{ all -> 0x0108 }
        monitor-exit(r9);
        return;
    L_0x0030:
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0033:
        r10.c();	 Catch:{ all -> 0x0108 }
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0108 }
        r11 = "Newly created entry didn't create value for index ";
        r0 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0108 }
        r11 = r11.concat(r0);	 Catch:{ all -> 0x0108 }
        r10.<init>(r11);	 Catch:{ all -> 0x0108 }
        throw r10;	 Catch:{ all -> 0x0108 }
    L_0x0046:
        r10 = r9.h;	 Catch:{ all -> 0x0108 }
        if (r1 >= r10) goto L_0x007b;
    L_0x004a:
        r10 = r0.b;	 Catch:{ all -> 0x0108 }
        r10 = r10[r1];	 Catch:{ all -> 0x0108 }
        if (r11 == 0) goto L_0x0075;
    L_0x0050:
        r2 = r10.exists();	 Catch:{ all -> 0x0108 }
        if (r2 == 0) goto L_0x0078;
    L_0x0056:
        r2 = r0.a;	 Catch:{ all -> 0x0108 }
        r2 = r2[r1];	 Catch:{ all -> 0x0108 }
        r10.renameTo(r2);	 Catch:{ all -> 0x0108 }
        r10 = r0.e;	 Catch:{ all -> 0x0108 }
        r3 = r10[r1];	 Catch:{ all -> 0x0108 }
        r5 = r2.length();	 Catch:{ all -> 0x0108 }
        r10 = r0.e;	 Catch:{ all -> 0x0108 }
        r10[r1] = r5;	 Catch:{ all -> 0x0108 }
        r7 = r9.i;	 Catch:{ all -> 0x0108 }
        r10 = 0;
        r7 = r7 - r3;
        r7 = r7 + r5;
        r9.i = r7;	 Catch:{ all -> 0x0108 }
        goto L_0x0078;
    L_0x0075:
        defpackage.do.a(r10);	 Catch:{ all -> 0x0108 }
    L_0x0078:
        r1 = r1 + 1;
        goto L_0x0046;
    L_0x007b:
        r10 = r9.l;	 Catch:{ all -> 0x0108 }
        r10 = r10 + 1;
        r9.l = r10;	 Catch:{ all -> 0x0108 }
        r10 = 0;
        r0.g = r10;	 Catch:{ all -> 0x0108 }
        r10 = r0.f;	 Catch:{ all -> 0x0108 }
        r10 = r10 | r11;
        r1 = 10;
        r2 = 32;
        if (r10 == 0) goto L_0x00c3;
    L_0x0090:
        r0.f = true;	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r3 = "CLEAN";
        r10.append(r3);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r10.append(r2);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r2 = r0.d;	 Catch:{ all -> 0x0108 }
        r10.append(r2);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r2 = r0.a();	 Catch:{ all -> 0x0108 }
        r10.append(r2);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r10.append(r1);	 Catch:{ all -> 0x0108 }
        if (r11 == 0) goto L_0x00e6;
    L_0x00b8:
        r10 = r9.m;	 Catch:{ all -> 0x0108 }
        r1 = 1;
        r1 = r1 + r10;
        r9.m = r1;	 Catch:{ all -> 0x0108 }
        r0.h = r10;	 Catch:{ all -> 0x0108 }
        goto L_0x00e6;
    L_0x00c3:
        r10 = r9.k;	 Catch:{ all -> 0x0108 }
        r11 = r0.d;	 Catch:{ all -> 0x0108 }
        r10.remove(r11);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r11 = "REMOVE";
        r10.append(r11);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r10.append(r2);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r11 = r0.d;	 Catch:{ all -> 0x0108 }
        r10.append(r11);	 Catch:{ all -> 0x0108 }
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r10.append(r1);	 Catch:{ all -> 0x0108 }
    L_0x00e6:
        r10 = r9.j;	 Catch:{ all -> 0x0108 }
        r10.flush();	 Catch:{ all -> 0x0108 }
        r10 = r9.i;	 Catch:{ all -> 0x0108 }
        r0 = r9.g;	 Catch:{ all -> 0x0108 }
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00f9;
    L_0x00f3:
        r10 = r9.e();	 Catch:{ all -> 0x0108 }
        if (r10 == 0) goto L_0x0100;
    L_0x00f9:
        r10 = r9.a;	 Catch:{ all -> 0x0108 }
        r11 = r9.n;	 Catch:{ all -> 0x0108 }
        r10.submit(r11);	 Catch:{ all -> 0x0108 }
    L_0x0100:
        monitor-exit(r9);
        return;
    L_0x0102:
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0108 }
        r10.<init>();	 Catch:{ all -> 0x0108 }
        throw r10;	 Catch:{ all -> 0x0108 }
    L_0x0108:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: do.a(dq, boolean):void");
    }

    private static void a(File file) {
        if (!file.exists()) {
            return;
        }
        if (!file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            do.a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void b() {
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
        r10 = this;
        r0 = new dt;
        r1 = new java.io.FileInputStream;
        r2 = r10.c;
        r1.<init>(r2);
        r2 = defpackage.dv.a;
        r0.<init>(r1, r2);
        r1 = r0.a();	 Catch:{ all -> 0x015e }
        r2 = r0.a();	 Catch:{ all -> 0x015e }
        r3 = r0.a();	 Catch:{ all -> 0x015e }
        r4 = r0.a();	 Catch:{ all -> 0x015e }
        r5 = r0.a();	 Catch:{ all -> 0x015e }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x015e }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x015e }
        if (r6 == 0) goto L_0x012d;	 Catch:{ all -> 0x015e }
    L_0x002a:
        r6 = "1";	 Catch:{ all -> 0x015e }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x015e }
        if (r6 == 0) goto L_0x012d;	 Catch:{ all -> 0x015e }
    L_0x0032:
        r6 = r10.f;	 Catch:{ all -> 0x015e }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x015e }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x015e }
        if (r3 == 0) goto L_0x012d;	 Catch:{ all -> 0x015e }
    L_0x003e:
        r3 = r10.h;	 Catch:{ all -> 0x015e }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x015e }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x015e }
        if (r3 == 0) goto L_0x012d;	 Catch:{ all -> 0x015e }
    L_0x004a:
        r3 = "";	 Catch:{ all -> 0x015e }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x015e }
        if (r3 == 0) goto L_0x012d;
    L_0x0052:
        r1 = 0;
        r2 = 0;
    L_0x0054:
        r3 = r0.a();	 Catch:{ EOFException -> 0x0100 }
        r4 = 32;	 Catch:{ EOFException -> 0x0100 }
        r5 = r3.indexOf(r4);	 Catch:{ EOFException -> 0x0100 }
        r6 = -1;	 Catch:{ EOFException -> 0x0100 }
        if (r5 == r6) goto L_0x00f0;	 Catch:{ EOFException -> 0x0100 }
    L_0x0061:
        r7 = r5 + 1;	 Catch:{ EOFException -> 0x0100 }
        r4 = r3.indexOf(r4, r7);	 Catch:{ EOFException -> 0x0100 }
        if (r4 != r6) goto L_0x007e;	 Catch:{ EOFException -> 0x0100 }
    L_0x0069:
        r7 = r3.substring(r7);	 Catch:{ EOFException -> 0x0100 }
        r8 = 6;	 Catch:{ EOFException -> 0x0100 }
        if (r5 != r8) goto L_0x0082;	 Catch:{ EOFException -> 0x0100 }
    L_0x0070:
        r8 = "REMOVE";	 Catch:{ EOFException -> 0x0100 }
        r8 = r3.startsWith(r8);	 Catch:{ EOFException -> 0x0100 }
        if (r8 == 0) goto L_0x0082;	 Catch:{ EOFException -> 0x0100 }
    L_0x0078:
        r3 = r10.k;	 Catch:{ EOFException -> 0x0100 }
        r3.remove(r7);	 Catch:{ EOFException -> 0x0100 }
        goto L_0x00dc;	 Catch:{ EOFException -> 0x0100 }
    L_0x007e:
        r7 = r3.substring(r7, r4);	 Catch:{ EOFException -> 0x0100 }
    L_0x0082:
        r8 = r10.k;	 Catch:{ EOFException -> 0x0100 }
        r8 = r8.get(r7);	 Catch:{ EOFException -> 0x0100 }
        r8 = (defpackage.dr) r8;	 Catch:{ EOFException -> 0x0100 }
        if (r8 != 0) goto L_0x0096;	 Catch:{ EOFException -> 0x0100 }
    L_0x008c:
        r8 = new dr;	 Catch:{ EOFException -> 0x0100 }
        r8.<init>(r10, r7);	 Catch:{ EOFException -> 0x0100 }
        r9 = r10.k;	 Catch:{ EOFException -> 0x0100 }
        r9.put(r7, r8);	 Catch:{ EOFException -> 0x0100 }
    L_0x0096:
        r7 = 5;	 Catch:{ EOFException -> 0x0100 }
        if (r4 == r6) goto L_0x00ba;	 Catch:{ EOFException -> 0x0100 }
    L_0x0099:
        if (r5 != r7) goto L_0x00ba;	 Catch:{ EOFException -> 0x0100 }
    L_0x009b:
        r9 = "CLEAN";	 Catch:{ EOFException -> 0x0100 }
        r9 = r3.startsWith(r9);	 Catch:{ EOFException -> 0x0100 }
        if (r9 == 0) goto L_0x00ba;	 Catch:{ EOFException -> 0x0100 }
    L_0x00a3:
        r4 = r4 + 1;	 Catch:{ EOFException -> 0x0100 }
        r3 = r3.substring(r4);	 Catch:{ EOFException -> 0x0100 }
        r4 = " ";	 Catch:{ EOFException -> 0x0100 }
        r3 = r3.split(r4);	 Catch:{ EOFException -> 0x0100 }
        r8.f = true;	 Catch:{ EOFException -> 0x0100 }
        r4 = 0;	 Catch:{ EOFException -> 0x0100 }
        r8.g = r4;	 Catch:{ EOFException -> 0x0100 }
        defpackage.dr.a(r8, r3);	 Catch:{ EOFException -> 0x0100 }
        goto L_0x00dc;	 Catch:{ EOFException -> 0x0100 }
    L_0x00ba:
        if (r4 != r6) goto L_0x00cf;	 Catch:{ EOFException -> 0x0100 }
    L_0x00bc:
        if (r5 != r7) goto L_0x00cf;	 Catch:{ EOFException -> 0x0100 }
    L_0x00be:
        r7 = "DIRTY";	 Catch:{ EOFException -> 0x0100 }
        r7 = r3.startsWith(r7);	 Catch:{ EOFException -> 0x0100 }
        if (r7 == 0) goto L_0x00cf;	 Catch:{ EOFException -> 0x0100 }
    L_0x00c6:
        r3 = new dq;	 Catch:{ EOFException -> 0x0100 }
        r3.<init>(r10, r8);	 Catch:{ EOFException -> 0x0100 }
        r8.g = r3;	 Catch:{ EOFException -> 0x0100 }
        goto L_0x00dc;	 Catch:{ EOFException -> 0x0100 }
    L_0x00cf:
        if (r4 != r6) goto L_0x00e0;	 Catch:{ EOFException -> 0x0100 }
    L_0x00d1:
        r4 = 4;	 Catch:{ EOFException -> 0x0100 }
        if (r5 != r4) goto L_0x00e0;	 Catch:{ EOFException -> 0x0100 }
    L_0x00d4:
        r4 = "READ";	 Catch:{ EOFException -> 0x0100 }
        r4 = r3.startsWith(r4);	 Catch:{ EOFException -> 0x0100 }
        if (r4 == 0) goto L_0x00e0;	 Catch:{ EOFException -> 0x0100 }
    L_0x00dc:
        r2 = r2 + 1;	 Catch:{ EOFException -> 0x0100 }
        goto L_0x0054;	 Catch:{ EOFException -> 0x0100 }
    L_0x00e0:
        r1 = new java.io.IOException;	 Catch:{ EOFException -> 0x0100 }
        r4 = "unexpected journal line: ";	 Catch:{ EOFException -> 0x0100 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ EOFException -> 0x0100 }
        r3 = r4.concat(r3);	 Catch:{ EOFException -> 0x0100 }
        r1.<init>(r3);	 Catch:{ EOFException -> 0x0100 }
        throw r1;	 Catch:{ EOFException -> 0x0100 }
    L_0x00f0:
        r1 = new java.io.IOException;	 Catch:{ EOFException -> 0x0100 }
        r4 = "unexpected journal line: ";	 Catch:{ EOFException -> 0x0100 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ EOFException -> 0x0100 }
        r3 = r4.concat(r3);	 Catch:{ EOFException -> 0x0100 }
        r1.<init>(r3);	 Catch:{ EOFException -> 0x0100 }
        throw r1;	 Catch:{ EOFException -> 0x0100 }
    L_0x0100:
        r1 = r10.k;	 Catch:{ all -> 0x015e }
        r1 = r1.size();	 Catch:{ all -> 0x015e }
        r2 = r2 - r1;	 Catch:{ all -> 0x015e }
        r10.l = r2;	 Catch:{ all -> 0x015e }
        r1 = r0.b();	 Catch:{ all -> 0x015e }
        if (r1 == 0) goto L_0x0113;	 Catch:{ all -> 0x015e }
    L_0x010f:
        r10.d();	 Catch:{ all -> 0x015e }
        goto L_0x0129;	 Catch:{ all -> 0x015e }
    L_0x0113:
        r1 = new java.io.BufferedWriter;	 Catch:{ all -> 0x015e }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x015e }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x015e }
        r4 = r10.c;	 Catch:{ all -> 0x015e }
        r5 = 1;	 Catch:{ all -> 0x015e }
        r3.<init>(r4, r5);	 Catch:{ all -> 0x015e }
        r4 = defpackage.dv.a;	 Catch:{ all -> 0x015e }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x015e }
        r1.<init>(r2);	 Catch:{ all -> 0x015e }
        r10.j = r1;	 Catch:{ all -> 0x015e }
    L_0x0129:
        defpackage.dv.a(r0);
        return;
    L_0x012d:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x015e }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015e }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x015e }
        r6.<init>(r7);	 Catch:{ all -> 0x015e }
        r6.append(r1);	 Catch:{ all -> 0x015e }
        r1 = ", ";	 Catch:{ all -> 0x015e }
        r6.append(r1);	 Catch:{ all -> 0x015e }
        r6.append(r2);	 Catch:{ all -> 0x015e }
        r1 = ", ";	 Catch:{ all -> 0x015e }
        r6.append(r1);	 Catch:{ all -> 0x015e }
        r6.append(r4);	 Catch:{ all -> 0x015e }
        r1 = ", ";	 Catch:{ all -> 0x015e }
        r6.append(r1);	 Catch:{ all -> 0x015e }
        r6.append(r5);	 Catch:{ all -> 0x015e }
        r1 = "]";	 Catch:{ all -> 0x015e }
        r6.append(r1);	 Catch:{ all -> 0x015e }
        r1 = r6.toString();	 Catch:{ all -> 0x015e }
        r3.<init>(r1);	 Catch:{ all -> 0x015e }
        throw r3;	 Catch:{ all -> 0x015e }
    L_0x015e:
        r1 = move-exception;
        defpackage.dv.a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: do.b():void");
    }

    private void c() {
        do.a(this.d);
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            dr drVar = (dr) it.next();
            int i = 0;
            if (drVar.g == null) {
                while (i < this.h) {
                    this.i += drVar.e[i];
                    i++;
                }
            } else {
                drVar.g = null;
                while (i < this.h) {
                    do.a(drVar.a[i]);
                    do.a(drVar.b[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    private synchronized dq d(String str) {
        f();
        dr drVar = (dr) this.k.get(str);
        if (drVar == null) {
            drVar = new dr(this, str);
            this.k.put(str, drVar);
        } else if (drVar.g != null) {
            return null;
        }
        dq dqVar = new dq(this, drVar);
        drVar.g = dqVar;
        this.j.append("DIRTY");
        this.j.append(' ');
        this.j.append(str);
        this.j.append('\n');
        this.j.flush();
        return dqVar;
    }

    private synchronized void d() {
        if (this.j != null) {
            this.j.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), dv.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (dr drVar : this.k.values()) {
                String stringBuilder;
                StringBuilder stringBuilder2;
                if (drVar.g != null) {
                    stringBuilder2 = new StringBuilder("DIRTY ");
                    stringBuilder2.append(drVar.d);
                    stringBuilder2.append('\n');
                    stringBuilder = stringBuilder2.toString();
                } else {
                    stringBuilder2 = new StringBuilder("CLEAN ");
                    stringBuilder2.append(drVar.d);
                    stringBuilder2.append(drVar.a());
                    stringBuilder2.append('\n');
                    stringBuilder = stringBuilder2.toString();
                }
                bufferedWriter.write(stringBuilder);
            }
            if (this.c.exists()) {
                do.a(this.c, this.e, true);
            }
            do.a(this.d, this.c, false);
            this.e.delete();
            this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), dv.a));
        } finally {
            bufferedWriter.close();
        }
    }

    private boolean e() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    private void f() {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void g() {
        while (this.i > this.g) {
            c((String) ((Entry) this.k.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized ds a(String str) {
        f();
        dr drVar = (dr) this.k.get(str);
        if (drVar == null) {
            return null;
        }
        if (!drVar.f) {
            return null;
        }
        for (File exists : drVar.a) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.l++;
        this.j.append("READ");
        this.j.append(' ');
        this.j.append(str);
        this.j.append('\n');
        if (e()) {
            this.a.submit(this.n);
        }
        return new ds(this, str, drVar.h, drVar.a, drVar.e);
    }

    public final void a() {
        close();
        dv.a(this.b);
    }

    public final dq b(String str) {
        return d(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r7.f();	 Catch:{ all -> 0x0088 }
        r0 = r7.k;	 Catch:{ all -> 0x0088 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0088 }
        r0 = (defpackage.dr) r0;	 Catch:{ all -> 0x0088 }
        r1 = 0;
        if (r0 == 0) goto L_0x0086;
    L_0x000f:
        r2 = r0.g;	 Catch:{ all -> 0x0088 }
        if (r2 == 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0086;
    L_0x0016:
        r2 = r7.h;	 Catch:{ all -> 0x0088 }
        if (r1 >= r2) goto L_0x0052;
    L_0x001a:
        r2 = r0.a;	 Catch:{ all -> 0x0088 }
        r2 = r2[r1];	 Catch:{ all -> 0x0088 }
        r3 = r2.exists();	 Catch:{ all -> 0x0088 }
        if (r3 == 0) goto L_0x003b;
    L_0x0024:
        r3 = r2.delete();	 Catch:{ all -> 0x0088 }
        if (r3 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x003b;
    L_0x002b:
        r8 = new java.io.IOException;	 Catch:{ all -> 0x0088 }
        r0 = "failed to delete ";
        r1 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0088 }
        r0 = r0.concat(r1);	 Catch:{ all -> 0x0088 }
        r8.<init>(r0);	 Catch:{ all -> 0x0088 }
        throw r8;	 Catch:{ all -> 0x0088 }
    L_0x003b:
        r2 = r7.i;	 Catch:{ all -> 0x0088 }
        r4 = r0.e;	 Catch:{ all -> 0x0088 }
        r5 = r4[r1];	 Catch:{ all -> 0x0088 }
        r4 = 0;
        r2 = r2 - r5;
        r7.i = r2;	 Catch:{ all -> 0x0088 }
        r2 = r0.e;	 Catch:{ all -> 0x0088 }
        r3 = 0;
        r2[r1] = r3;	 Catch:{ all -> 0x0088 }
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0052:
        r0 = r7.l;	 Catch:{ all -> 0x0088 }
        r1 = 1;
        r0 = r0 + r1;
        r7.l = r0;	 Catch:{ all -> 0x0088 }
        r0 = r7.j;	 Catch:{ all -> 0x0088 }
        r2 = "REMOVE";
        r0.append(r2);	 Catch:{ all -> 0x0088 }
        r0 = r7.j;	 Catch:{ all -> 0x0088 }
        r2 = 32;
        r0.append(r2);	 Catch:{ all -> 0x0088 }
        r0 = r7.j;	 Catch:{ all -> 0x0088 }
        r0.append(r8);	 Catch:{ all -> 0x0088 }
        r0 = r7.j;	 Catch:{ all -> 0x0088 }
        r2 = 10;
        r0.append(r2);	 Catch:{ all -> 0x0088 }
        r0 = r7.k;	 Catch:{ all -> 0x0088 }
        r0.remove(r8);	 Catch:{ all -> 0x0088 }
        r8 = r7.e();	 Catch:{ all -> 0x0088 }
        if (r8 == 0) goto L_0x0084;
    L_0x007d:
        r8 = r7.a;	 Catch:{ all -> 0x0088 }
        r0 = r7.n;	 Catch:{ all -> 0x0088 }
        r8.submit(r0);	 Catch:{ all -> 0x0088 }
    L_0x0084:
        monitor-exit(r7);
        return r1;
    L_0x0086:
        monitor-exit(r7);
        return r1;
    L_0x0088:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: do.c(java.lang.String):boolean");
    }

    public final synchronized void close() {
        if (this.j != null) {
            Iterator it = new ArrayList(this.k.values()).iterator();
            while (it.hasNext()) {
                dr drVar = (dr) it.next();
                if (drVar.g != null) {
                    drVar.g.c();
                }
            }
            g();
            this.j.close();
            this.j = null;
        }
    }
}
