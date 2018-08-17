package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import rx;

final class qp {
    static final FilenameFilter a = new qq("BeginSession");
    static final FilenameFilter b = new ra();
    static final FileFilter c = new rk();
    static final Comparator<File> d = new rl();
    static final Comparator<File> e = new rm();
    private static final Pattern f = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> g = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] h = new String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    private final AtomicInteger i = new AtomicInteger(0);
    private final se j;
    private final qm k;
    private final azk l;
    private final aww m;
    private final to n;
    private final azo o;
    private final pu p;
    private final rw q;
    private final td r;
    private final ua s;
    private final tz t;
    private final sx u;
    private final ug v;
    private final String w;
    private final pv x;
    private final ox y;
    private sp z;

    qp(se seVar, qm qmVar, azk azk, aww aww, to toVar, azo azo, pu puVar, ui uiVar, pv pvVar, ox oxVar) {
        this.j = seVar;
        this.k = qmVar;
        this.l = azk;
        this.m = aww;
        this.n = toVar;
        this.o = azo;
        this.p = puVar;
        this.w = uiVar.a();
        this.x = pvVar;
        this.y = oxVar;
        Context m = seVar.m();
        this.q = new rw(azo);
        this.r = new td(m, this.q);
        this.s = new sa();
        this.t = new sb();
        this.u = new sx(m);
        this.v = new ti(new tu(10));
    }

    static String a(File file) {
        return file.getName().substring(0, 35);
    }

    private void a(bah bah, boolean z) {
        b(z + 8);
        File[] h = h();
        if (h.length <= z) {
            avf.c();
            return;
        }
        b(qp.a(h[z]));
        if (bah == null) {
            avf.c();
        } else {
            a(h, (int) z, bah.c);
        }
    }

    private void a(File file, String str, int i) {
        avf.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("SessionCrash");
        File[] a = a(new rt(stringBuilder.toString()));
        boolean z = a != null && a.length > 0;
        avf.c();
        String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)});
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("SessionEvent");
        File[] a2 = a(new rt(stringBuilder2.toString()));
        boolean z2 = a2 != null && a2.length > 0;
        avf.c();
        String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)});
        if (!z) {
            if (!z2) {
                avf.c();
                avf.c();
                a(str);
            }
        }
        a(file, str, a(str, a2, i), z ? a[0] : null);
        avf.c();
        a(str);
    }

    private void a(java.io.File r10, java.lang.String r11, java.io.File[] r12, java.io.File r13) {
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
        r9 = this;
        r0 = 1;
        if (r13 == 0) goto L_0x0005;
    L_0x0003:
        r1 = 1;
        goto L_0x0006;
    L_0x0005:
        r1 = 0;
    L_0x0006:
        if (r1 == 0) goto L_0x000d;
    L_0x0008:
        r2 = r9.k();
        goto L_0x0011;
    L_0x000d:
        r2 = r9.l();
    L_0x0011:
        r3 = r2.exists();
        if (r3 != 0) goto L_0x001a;
    L_0x0017:
        r2.mkdirs();
    L_0x001a:
        r3 = 0;
        r4 = new qa;	 Catch:{ Exception -> 0x0063, all -> 0x005f }
        r4.<init>(r2, r11);	 Catch:{ Exception -> 0x0063, all -> 0x005f }
        r2 = defpackage.qc.a(r4);	 Catch:{ Exception -> 0x0064 }
        defpackage.avf.c();	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        defpackage.qp.a(r2, r10);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r10 = 4;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r3 = new java.util.Date;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r3.<init>();	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r5 = r3.getTime();	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r5 = r5 / r7;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r2.a(r10, r5);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r10 = 5;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r2.a(r10, r1);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r10 = 11;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r2.a(r10, r0);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r10 = 12;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r0 = 3;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r2.b(r10, r0);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        r9.a(r2, r11);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        defpackage.qp.a(r2, r12, r11);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
        if (r1 == 0) goto L_0x0054;	 Catch:{ Exception -> 0x005d, all -> 0x005b }
    L_0x0051:
        defpackage.qp.a(r2, r13);	 Catch:{ Exception -> 0x005d, all -> 0x005b }
    L_0x0054:
        defpackage.awj.a(r2);
        defpackage.awj.a(r4);
        return;
    L_0x005b:
        r10 = move-exception;
        goto L_0x0070;
    L_0x005d:
        r3 = r2;
        goto L_0x0064;
    L_0x005f:
        r10 = move-exception;
        r2 = r3;
        r4 = r2;
        goto L_0x0070;
    L_0x0063:
        r4 = r3;
    L_0x0064:
        defpackage.avf.c();	 Catch:{ all -> 0x006e }
        defpackage.awj.a(r3);
        defpackage.qp.a(r4);
        return;
    L_0x006e:
        r10 = move-exception;
        r2 = r3;
    L_0x0070:
        defpackage.awj.a(r2);
        defpackage.awj.a(r4);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.a(java.io.File, java.lang.String, java.io.File[], java.io.File):void");
    }

    private static void a(InputStream inputStream, qc qcVar, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        qcVar.a(bArr);
    }

    private void a(String str) {
        for (File delete : a(new sd(str))) {
            delete.delete();
        }
    }

    private void a(String str, String str2, rr rrVar) {
        Closeable qaVar;
        Throwable th;
        StringBuilder stringBuilder;
        Flushable flushable = null;
        try {
            Flushable a;
            File j = j();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            qaVar = new qa(j, stringBuilder2.toString());
            try {
                a = qc.a((OutputStream) qaVar);
            } catch (Throwable th2) {
                th = th2;
                stringBuilder = new StringBuilder("Failed to flush to session ");
                stringBuilder.append(str2);
                stringBuilder.append(" file.");
                awj.a(flushable);
                stringBuilder = new StringBuilder("Failed to close session ");
                stringBuilder.append(str2);
                stringBuilder.append(" file.");
                awj.a(qaVar);
                throw th;
            }
            try {
                rrVar.a(a);
                StringBuilder stringBuilder3 = new StringBuilder("Failed to flush to session ");
                stringBuilder3.append(str2);
                stringBuilder3.append(" file.");
                awj.a(a);
                stringBuilder = new StringBuilder("Failed to close session ");
                stringBuilder.append(str2);
                stringBuilder.append(" file.");
                awj.a(qaVar);
            } catch (Throwable th3) {
                th = th3;
                flushable = a;
                stringBuilder = new StringBuilder("Failed to flush to session ");
                stringBuilder.append(str2);
                stringBuilder.append(" file.");
                awj.a(flushable);
                stringBuilder = new StringBuilder("Failed to close session ");
                stringBuilder.append(str2);
                stringBuilder.append(" file.");
                awj.a(qaVar);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            qaVar = null;
            stringBuilder = new StringBuilder("Failed to flush to session ");
            stringBuilder.append(str2);
            stringBuilder.append(" file.");
            awj.a(flushable);
            stringBuilder = new StringBuilder("Failed to close session ");
            stringBuilder.append(str2);
            stringBuilder.append(" file.");
            awj.a(qaVar);
            throw th;
        }
    }

    private void a(String str, String str2, ru ruVar) {
        Throwable th;
        StringBuilder stringBuilder;
        Closeable closeable = null;
        try {
            File j = j();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            Closeable fileOutputStream = new FileOutputStream(new File(j, stringBuilder2.toString()));
            try {
                ruVar.a(fileOutputStream);
                StringBuilder stringBuilder3 = new StringBuilder("Failed to close ");
                stringBuilder3.append(str2);
                stringBuilder3.append(" file.");
                awj.a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream;
                stringBuilder = new StringBuilder("Failed to close ");
                stringBuilder.append(str2);
                stringBuilder.append(" file.");
                awj.a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            stringBuilder = new StringBuilder("Failed to close ");
            stringBuilder.append(str2);
            stringBuilder.append(" file.");
            awj.a(closeable);
            throw th;
        }
    }

    private static void a(defpackage.qa r0) {
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
        if (r0 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0.a();	 Catch:{ IOException -> 0x0007 }
        return;
    L_0x0007:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.a(qa):void");
    }

    private static void a(qc qcVar, File file) {
        Throwable th;
        if (file.exists()) {
            Closeable closeable = null;
            try {
                Closeable fileInputStream = new FileInputStream(file);
                try {
                    qp.a((InputStream) fileInputStream, qcVar, (int) file.length());
                    awj.a(fileInputStream);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = fileInputStream;
                    awj.a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                awj.a(closeable);
                throw th;
            }
        }
        avf.c();
        new StringBuilder("Tried to include a file that doesn't exist: ").append(file.getName());
    }

    private void a(qc qcVar, String str) {
        for (String str2 : h) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(".cls");
            File[] a = a(new rt(stringBuilder.toString()));
            if (a.length == 0) {
                avf.c();
                StringBuilder stringBuilder2 = new StringBuilder("Can't find ");
                stringBuilder2.append(str2);
                stringBuilder2.append(" data for session ID ");
                stringBuilder2.append(str);
            } else {
                avf.c();
                stringBuilder = new StringBuilder("Collecting ");
                stringBuilder.append(str2);
                stringBuilder.append(" data for session ID ");
                stringBuilder.append(str);
                qp.a(qcVar, a[0]);
            }
        }
    }

    private void a(qc qcVar, Date date, Thread thread, Throwable th, String str) {
        TreeMap f;
        Map treeMap;
        uh uhVar = new uh(th, this.v);
        Context m = this.j.m();
        long time = date.getTime() / 1000;
        Float c = awj.c(m);
        int a = awj.a(m, this.u.b());
        boolean d = awj.d(m);
        int i = m.getResources().getConfiguration().orientation;
        long b = awj.b() - awj.b(m);
        long c2 = awj.c(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a2 = awj.a(m.getPackageName(), m);
        List linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = uhVar.c;
        String str2 = this.p.b;
        String c3 = this.m.c();
        Map allStackTraces = Thread.getAllStackTraces();
        Thread[] threadArr = new Thread[allStackTraces.size()];
        int i2 = 0;
        for (Entry entry : allStackTraces.entrySet()) {
            threadArr[i2] = (Thread) entry.getKey();
            linkedList.add(r0.v.a((StackTraceElement[]) entry.getValue()));
            i2++;
        }
        if (awj.a(m, "com.crashlytics.CollectCustomKeys", true)) {
            f = r0.j.f();
            if (f != null && f.size() > 1) {
                treeMap = new TreeMap(f);
                ud.a(qcVar, time, str, uhVar, thread, stackTraceElementArr, threadArr, linkedList, treeMap, r0.r, a2, i, c3, str2, c, a, d, b, c2);
            }
        }
        f = new TreeMap();
        treeMap = f;
        ud.a(qcVar, time, str, uhVar, thread, stackTraceElementArr, threadArr, linkedList, treeMap, r0.r, a2, i, c3, str2, c, a, d, b, c2);
    }

    private static void a(defpackage.qc r9, java.io.File[] r10, java.lang.String r11) {
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
        r0 = defpackage.awj.a;
        java.util.Arrays.sort(r10, r0);
        r0 = r10.length;
        r1 = 0;
        r2 = 0;
    L_0x0008:
        if (r2 >= r0) goto L_0x002c;
    L_0x000a:
        r3 = r10[r2];
        defpackage.avf.c();	 Catch:{ Exception -> 0x0026 }
        r4 = java.util.Locale.US;	 Catch:{ Exception -> 0x0026 }
        r5 = "Found Non Fatal for session ID %s in %s ";	 Catch:{ Exception -> 0x0026 }
        r6 = 2;	 Catch:{ Exception -> 0x0026 }
        r6 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x0026 }
        r6[r1] = r11;	 Catch:{ Exception -> 0x0026 }
        r7 = r3.getName();	 Catch:{ Exception -> 0x0026 }
        r8 = 1;	 Catch:{ Exception -> 0x0026 }
        r6[r8] = r7;	 Catch:{ Exception -> 0x0026 }
        java.lang.String.format(r4, r5, r6);	 Catch:{ Exception -> 0x0026 }
        defpackage.qp.a(r9, r3);	 Catch:{ Exception -> 0x0026 }
        goto L_0x0029;
    L_0x0026:
        defpackage.avf.c();
    L_0x0029:
        r2 = r2 + 1;
        goto L_0x0008;
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.a(qc, java.io.File[], java.lang.String):void");
    }

    static /* synthetic */ void a(qp qpVar, long j) {
        if (qp.m()) {
            avf.c();
        } else if (qpVar.y != null) {
            avf.c();
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            qpVar.y.a("clx", "_ae", bundle);
        } else {
            avf.c();
        }
    }

    static /* synthetic */ void a(qp qpVar, Context context, File file, String str) {
        byte[] b = tl.b(file);
        byte[] c = tl.c(file);
        byte[] a = tl.a(file, context);
        if (b != null) {
            if (b.length != 0) {
                qp.c(str, "<native-crash: minidump>");
                byte[] a2 = qpVar.a(str, "BeginSession.json");
                byte[] a3 = qpVar.a(str, "SessionApp.json");
                byte[] a4 = qpVar.a(str, "SessionDevice.json");
                byte[] a5 = qpVar.a(str, "SessionOS.json");
                byte[] a6 = tl.a(new th(qpVar.j()).b(str));
                td tdVar = new td(qpVar.j.m(), qpVar.q, str);
                byte[] b2 = tdVar.b();
                tdVar.c();
                byte[] a7 = tl.a(new th(qpVar.j()).c(str));
                File file2 = new File(qpVar.o.a(), str);
                if (file2.mkdir()) {
                    qp.a(b, new File(file2, "minidump"));
                    qp.a(c, new File(file2, "metadata"));
                    qp.a(a, new File(file2, "binaryImages"));
                    qp.a(a2, new File(file2, "session"));
                    qp.a(a3, new File(file2, "app"));
                    qp.a(a4, new File(file2, "device"));
                    qp.a(a5, new File(file2, "os"));
                    qp.a(a6, new File(file2, "user"));
                    qp.a(b2, new File(file2, "logs"));
                    qp.a(a7, new File(file2, "keys"));
                    return;
                }
                avf.c();
                return;
            }
        }
        avf.c();
        new StringBuilder("No minidump data found in directory ").append(file);
    }

    static /* synthetic */ void a(defpackage.qp r10, java.util.Date r11, java.lang.Thread r12, java.lang.Throwable r13) {
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
        r0 = 0;
        r1 = r10.h();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r2 = r1.length;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        if (r2 <= 0) goto L_0x0010;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
    L_0x0008:
        r2 = 0;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r1 = r1[r2];	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r1 = defpackage.qp.a(r1);	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        goto L_0x0011;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
    L_0x0010:
        r1 = r0;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
    L_0x0011:
        if (r1 != 0) goto L_0x001d;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
    L_0x0013:
        defpackage.avf.c();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        defpackage.awj.a(r0);
        defpackage.awj.a(r0);
        return;
    L_0x001d:
        r2 = r13.getClass();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r2 = r2.getName();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        defpackage.qp.c(r1, r2);	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r2 = new qa;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r3 = r10.j();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r4.<init>();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r4.append(r1);	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r1 = "SessionCrash";	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r4.append(r1);	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r1 = r4.toString();	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r2.<init>(r3, r1);	 Catch:{ Exception -> 0x005f, all -> 0x005c }
        r1 = defpackage.qc.a(r2);	 Catch:{ Exception -> 0x0060 }
        r9 = "crash";	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        r4 = r10;	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        r5 = r1;	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        r6 = r11;	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        r7 = r12;	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        r8 = r13;	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        r4.a(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x005a, all -> 0x0057 }
        defpackage.awj.a(r1);
        defpackage.awj.a(r2);
        return;
    L_0x0057:
        r10 = move-exception;
        r0 = r1;
        goto L_0x006b;
    L_0x005a:
        r0 = r1;
        goto L_0x0060;
    L_0x005c:
        r10 = move-exception;
        r2 = r0;
        goto L_0x006b;
    L_0x005f:
        r2 = r0;
    L_0x0060:
        defpackage.avf.c();	 Catch:{ all -> 0x006a }
        defpackage.awj.a(r0);
        defpackage.awj.a(r2);
        return;
    L_0x006a:
        r10 = move-exception;
    L_0x006b:
        defpackage.awj.a(r0);
        defpackage.awj.a(r2);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.a(qp, java.util.Date, java.lang.Thread, java.lang.Throwable):void");
    }

    static /* synthetic */ void a(qp qpVar, Set set) {
        for (File b : set) {
            qpVar.b(b);
        }
    }

    private static void a(byte[] bArr, File file) {
        Throwable th;
        if (bArr != null && bArr.length > 0) {
            Closeable closeable = null;
            try {
                Closeable gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    awj.b(gZIPOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    closeable = gZIPOutputStream;
                    awj.b(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                awj.b(closeable);
                throw th;
            }
        }
    }

    private void a(File[] fileArr, int i, int i2) {
        avf.c();
        while (i < fileArr.length) {
            File file = fileArr[i];
            String a = qp.a(file);
            avf.c();
            a(file, a, i2);
            i++;
        }
    }

    private static void a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            Matcher matcher = f.matcher(file.getName());
            if (matcher.matches()) {
                if (set.contains(matcher.group(1))) {
                }
            }
            avf.c();
            file.delete();
        }
    }

    private byte[] a(String str, String str2) {
        File j = j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return tl.a(new File(j, stringBuilder.toString()));
    }

    private static File[] a(File file, FilenameFilter filenameFilter) {
        return qp.b(file.listFiles(filenameFilter));
    }

    private File[] a(FilenameFilter filenameFilter) {
        return qp.a(j(), filenameFilter);
    }

    private File[] a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        avf.c();
        String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)});
        File j = j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("SessionEvent");
        uk.a(j, new rt(stringBuilder.toString()), i, e);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("SessionEvent");
        return a(new rt(stringBuilder2.toString()));
    }

    private st b(String str, String str2) {
        String b = awj.b(this.j.m(), "com.crashlytics.ApiEndpoint");
        return new qe(new sw(this.j, b, str, this.l), new tk(this.j, b, str2, this.l));
    }

    private void b(int i) {
        Set hashSet = new HashSet();
        File[] h = h();
        i = Math.min(i, h.length);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(qp.a(h[i2]));
        }
        this.r.a(hashSet);
        qp.a(a(new rq()), hashSet);
    }

    private void b(File file) {
        if (file.isDirectory()) {
            for (File b : file.listFiles()) {
                b(b);
            }
        }
        file.delete();
    }

    private void b(String str) {
        a(str, "SessionUser", new rj(this, c(str)));
    }

    static /* synthetic */ void b(qp qpVar) {
        qp qpVar2 = qpVar;
        Date date = new Date();
        String pzVar = new pz(qpVar2.m).toString();
        avf.c();
        qp qpVar3 = qpVar;
        String str = pzVar;
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"2.6.3.25"});
        long time = date.getTime() / 1000;
        qpVar2.a(pzVar, "BeginSession", new qw(qpVar3, str, format, time));
        qpVar2.a(pzVar, "BeginSession.json", new qx(qpVar3, str, format, time));
        String c = qpVar2.m.c();
        pu puVar = qpVar2.p;
        String str2 = puVar.e;
        String str3 = puVar.f;
        str = c;
        format = str2;
        String str4 = str3;
        String b = qpVar2.m.b();
        int id = awp.determineFrom(qpVar2.p.c).getId();
        qpVar2.a(pzVar, "SessionApp", new qz(qpVar3, str, format, str4, b, id));
        qpVar2.a(pzVar, "SessionApp.json", new rb(qpVar3, str, format, str4, b, id));
        boolean h = awj.h(qpVar2.j.m());
        qpVar2.a(pzVar, "SessionOS", new rd(qpVar2, h));
        qpVar2.a(pzVar, "SessionOS.json", new re(qpVar2, h));
        Context m = qpVar2.j.m();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = awj.a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = awj.b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean g = awj.g(m);
        qpVar3 = qpVar;
        int i = a;
        int i2 = availableProcessors;
        time = b2;
        long j = blockCount;
        boolean z = g;
        long j2 = b2;
        rr rrVar = r0;
        Map g2 = qpVar2.m.g();
        int i3 = availableProcessors;
        int i4 = awj.i(m);
        rg rgVar = new rg(qpVar3, i, i2, time, j, z, g2, i4);
        qpVar2.a(pzVar, "SessionDevice", rrVar);
        qpVar2.a(pzVar, "SessionDevice.json", new rh(qpVar3, i, i3, j2, j, z, g2, i4));
        qpVar2.r.a(pzVar);
    }

    static /* synthetic */ void b(qp qpVar, bam bam) {
        if (bam == null) {
            avf.c();
            return;
        }
        Context m = qpVar.j.m();
        azw azw = bam.a;
        tx txVar = new tx(qpVar.p.a, qpVar.b(azw.d, azw.e), qpVar.s, qpVar.t);
        for (File ueVar : qpVar.a()) {
            qpVar.k.a(new sc(m, new ue(ueVar, g), txVar));
        }
    }

    private boolean b(bam bam) {
        return (bam == null || !bam.d.a || this.n.b()) ? false : true;
    }

    private static File[] b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private uj c(String str) {
        return d() ? new uj(this.j.g(), this.j.i(), this.j.h()) : new th(j()).a(str);
    }

    private static void c(String str, String str2) {
        nz nzVar = (nz) avf.a(nz.class);
        if (nzVar == null) {
            avf.c();
        } else {
            nzVar.a(new awn(str, str2));
        }
    }

    static /* synthetic */ String d(qp qpVar) {
        File[] h = qpVar.h();
        return h.length > 1 ? qp.a(h[1]) : null;
    }

    private File[] h() {
        File[] a = a(a);
        Arrays.sort(a, d);
        return a;
    }

    private void i() {
        File e = e();
        if (e.exists()) {
            File[] a = qp.a(e, new rv());
            Arrays.sort(a, Collections.reverseOrder());
            Set hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(qp.a(a[i]));
            }
            qp.a(qp.b(e.listFiles()), hashSet);
        }
    }

    private File j() {
        return this.o.a();
    }

    private File k() {
        return new File(j(), "fatal-sessions");
    }

    private File l() {
        return new File(j(), "nonfatal-sessions");
    }

    private static boolean m() {
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
        r0 = "com.google.firebase.crash.FirebaseCrash";	 Catch:{ ClassNotFoundException -> 0x0007 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = 1;
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.m():boolean");
    }

    final void a(float f, bam bam) {
        if (bam == null) {
            avf.c();
            return;
        }
        azw azw = bam.a;
        new tx(this.p.a, b(azw.d, azw.e), this.s, this.t).a(f, b(bam) ? new rx(this.j, this.n, bam.c) : new ty());
    }

    final void a(int i) {
        i -= uk.a(k(), i, e);
        uk.a(j(), b, i - uk.a(l(), i, e), e);
    }

    final void a(long j, String str) {
        this.k.b(new rp(this, j, str));
    }

    final void a(bam bam) {
        if (bam.d.e && this.x.a()) {
            avf.c();
        }
    }

    final void a(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.k.b(new qr(this));
        this.z = new sp(new rn(this), new rs(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.z);
    }

    final synchronized void a(sr srVar, Thread thread, Throwable th, boolean z) {
        avf.c();
        StringBuilder stringBuilder = new StringBuilder("Crashlytics is handling uncaught exception \"");
        stringBuilder.append(th);
        stringBuilder.append("\" from thread ");
        stringBuilder.append(thread.getName());
        this.u.c();
        this.k.a(new ro(this, new Date(), thread, th, srVar, z));
    }

    final void a(File[] fileArr) {
        Set hashSet = new HashSet();
        for (File file : fileArr) {
            avf.c();
            new StringBuilder("Found invalid session part file: ").append(file);
            hashSet.add(qp.a(file));
        }
        if (!hashSet.isEmpty()) {
            File e = e();
            if (!e.exists()) {
                e.mkdir();
            }
            for (File file2 : a(new qu(this, hashSet))) {
                avf.c();
                new StringBuilder("Moving session file: ").append(file2);
                if (!file2.renameTo(new File(e, file2.getName()))) {
                    avf.c();
                    new StringBuilder("Could not move session file. Deleting ").append(file2);
                    file2.delete();
                }
            }
            i();
        }
    }

    final boolean a(bah bah) {
        return ((Boolean) this.k.a(new qs(this, bah))).booleanValue();
    }

    final boolean a(sm smVar) {
        return smVar == null ? true : ((Boolean) this.k.a(new qv(this, smVar))).booleanValue();
    }

    final File[] a() {
        List linkedList = new LinkedList();
        Collections.addAll(linkedList, qp.a(k(), b));
        Collections.addAll(linkedList, qp.a(l(), b));
        Collections.addAll(linkedList, qp.a(j(), b));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    final void b(bah bah) {
        a(bah, false);
    }

    final File[] b() {
        return qp.b(j().listFiles(c));
    }

    final void c() {
        this.k.a(new qt(this));
    }

    final boolean d() {
        sp spVar = this.z;
        return spVar != null && spVar.a();
    }

    final File e() {
        return new File(j(), "invalidClsFiles");
    }

    final void f() {
        this.u.a();
    }
}
