package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class awj {
    public static final Comparator<File> a = new awk();
    private static Boolean b = null;
    private static final char[] c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long d = -1;

    public static int a() {
        return awl.getValue().ordinal();
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, awj.p(context));
    }

    public static int a(Context context, boolean z) {
        Float c = awj.c(context);
        if (z) {
            if (c != null) {
                return ((double) c.floatValue()) >= 99.0d ? 3 : ((double) c.floatValue()) < 99.0d ? 2 : 0;
            }
        }
        return 1;
    }

    private static long a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static RunningAppProcessInfo a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    private static java.lang.String a(java.io.File r5, java.lang.String r6) {
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
        r0 = r5.exists();
        r1 = 0;
        if (r0 == 0) goto L_0x004f;
    L_0x0007:
        r0 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x003b, all -> 0x0038 }
        r2 = new java.io.FileReader;	 Catch:{ Exception -> 0x003b, all -> 0x0038 }
        r2.<init>(r5);	 Catch:{ Exception -> 0x003b, all -> 0x0038 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Exception -> 0x003b, all -> 0x0038 }
        r0.<init>(r2, r3);	 Catch:{ Exception -> 0x003b, all -> 0x0038 }
    L_0x0013:
        r2 = r0.readLine();	 Catch:{ Exception -> 0x003c }
        if (r2 == 0) goto L_0x0034;	 Catch:{ Exception -> 0x003c }
    L_0x0019:
        r3 = "\\s*:\\s*";	 Catch:{ Exception -> 0x003c }
        r3 = java.util.regex.Pattern.compile(r3);	 Catch:{ Exception -> 0x003c }
        r4 = 2;	 Catch:{ Exception -> 0x003c }
        r2 = r3.split(r2, r4);	 Catch:{ Exception -> 0x003c }
        r3 = r2.length;	 Catch:{ Exception -> 0x003c }
        r4 = 1;	 Catch:{ Exception -> 0x003c }
        if (r3 <= r4) goto L_0x0013;	 Catch:{ Exception -> 0x003c }
    L_0x0028:
        r3 = 0;	 Catch:{ Exception -> 0x003c }
        r3 = r2[r3];	 Catch:{ Exception -> 0x003c }
        r3 = r3.equals(r6);	 Catch:{ Exception -> 0x003c }
        if (r3 == 0) goto L_0x0013;	 Catch:{ Exception -> 0x003c }
    L_0x0031:
        r6 = r2[r4];	 Catch:{ Exception -> 0x003c }
        r1 = r6;
    L_0x0034:
        defpackage.awj.a(r0);
        goto L_0x004f;
    L_0x0038:
        r5 = move-exception;
        r0 = r1;
        goto L_0x004b;
    L_0x003b:
        r0 = r1;
    L_0x003c:
        defpackage.avf.c();	 Catch:{ all -> 0x004a }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004a }
        r2 = "Error parsing ";	 Catch:{ all -> 0x004a }
        r6.<init>(r2);	 Catch:{ all -> 0x004a }
        r6.append(r5);	 Catch:{ all -> 0x004a }
        goto L_0x0034;
    L_0x004a:
        r5 = move-exception;
    L_0x004b:
        defpackage.awj.a(r0);
        throw r5;
    L_0x004f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.a(java.io.File, java.lang.String):java.lang.String");
    }

    public static String a(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : BuildConfig.FLAVOR;
    }

    private static java.lang.String a(java.io.InputStream r3, java.lang.String r4) {
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
        r4 = java.security.MessageDigest.getInstance(r4);	 Catch:{ Exception -> 0x001d }
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Exception -> 0x001d }
        r0 = new byte[r0];	 Catch:{ Exception -> 0x001d }
    L_0x0008:
        r1 = r3.read(r0);	 Catch:{ Exception -> 0x001d }
        r2 = -1;	 Catch:{ Exception -> 0x001d }
        if (r1 == r2) goto L_0x0014;	 Catch:{ Exception -> 0x001d }
    L_0x000f:
        r2 = 0;	 Catch:{ Exception -> 0x001d }
        r4.update(r0, r2, r1);	 Catch:{ Exception -> 0x001d }
        goto L_0x0008;	 Catch:{ Exception -> 0x001d }
    L_0x0014:
        r3 = r4.digest();	 Catch:{ Exception -> 0x001d }
        r3 = defpackage.awj.a(r3);	 Catch:{ Exception -> 0x001d }
        return r3;
    L_0x001d:
        defpackage.avf.c();
        r3 = "";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static String a(String str) {
        return awj.a(str, "SHA-1");
    }

    private static String a(String str, String str2) {
        return awj.a(str.getBytes(), str2);
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = c;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    private static java.lang.String a(byte[] r1, java.lang.String r2) {
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
        r0 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0010 }
        r0.update(r1);
        r1 = r0.digest();
        r1 = defpackage.awj.a(r1);
        return r1;
    L_0x0010:
        defpackage.avf.c();
        r1 = new java.lang.StringBuilder;
        r0 = "Could not create hashing algorithm: ";
        r1.<init>(r0);
        r1.append(r2);
        r2 = ", returning empty string.";
        r1.append(r2);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.a(byte[], java.lang.String):java.lang.String");
    }

    public static String a(String... strArr) {
        List<String> arrayList = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                arrayList.add(str.replace("-", BuildConfig.FLAVOR).toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : arrayList) {
            stringBuilder.append(append);
        }
        String stringBuilder2 = stringBuilder.toString();
        return stringBuilder2.length() > 0 ? awj.a(stringBuilder2, "SHA-1") : null;
    }

    public static void a(Context context, String str) {
        if (awj.o(context)) {
            avf.c().a("Fabric", str);
        }
    }

    public static void a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0009;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0006 }
        return;
    L_0x0006:
        defpackage.avf.c();
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.a(java.io.Closeable):void");
    }

    public static void a(java.io.Flushable r0) {
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
        if (r0 == 0) goto L_0x0009;
    L_0x0002:
        r0.flush();	 Catch:{ IOException -> 0x0006 }
        return;
    L_0x0006:
        defpackage.avf.c();
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.a(java.io.Flushable):void");
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = awj.a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = awj.a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    public static synchronized long b() {
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
        r0 = defpackage.awj.class;
        monitor-enter(r0);
        r1 = d;	 Catch:{ all -> 0x0067 }
        r3 = -1;	 Catch:{ all -> 0x0067 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x0067 }
        if (r5 != 0) goto L_0x0063;	 Catch:{ all -> 0x0067 }
    L_0x000b:
        r1 = 0;	 Catch:{ all -> 0x0067 }
        r3 = new java.io.File;	 Catch:{ all -> 0x0067 }
        r4 = "/proc/meminfo";	 Catch:{ all -> 0x0067 }
        r3.<init>(r4);	 Catch:{ all -> 0x0067 }
        r4 = "MemTotal";	 Catch:{ all -> 0x0067 }
        r3 = defpackage.awj.a(r3, r4);	 Catch:{ all -> 0x0067 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0067 }
        if (r4 != 0) goto L_0x0060;	 Catch:{ all -> 0x0067 }
    L_0x0020:
        r4 = java.util.Locale.US;	 Catch:{ all -> 0x0067 }
        r3 = r3.toUpperCase(r4);	 Catch:{ all -> 0x0067 }
        r4 = "KB";	 Catch:{ NumberFormatException -> 0x005d }
        r4 = r3.endsWith(r4);	 Catch:{ NumberFormatException -> 0x005d }
        if (r4 == 0) goto L_0x0037;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x002e:
        r4 = "KB";	 Catch:{ NumberFormatException -> 0x005d }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ NumberFormatException -> 0x005d }
        r3 = defpackage.awj.a(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x005d }
        goto L_0x0061;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x0037:
        r4 = "MB";	 Catch:{ NumberFormatException -> 0x005d }
        r4 = r3.endsWith(r4);	 Catch:{ NumberFormatException -> 0x005d }
        if (r4 == 0) goto L_0x0048;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x003f:
        r4 = "MB";	 Catch:{ NumberFormatException -> 0x005d }
        r5 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;	 Catch:{ NumberFormatException -> 0x005d }
        r3 = defpackage.awj.a(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x005d }
        goto L_0x0061;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x0048:
        r4 = "GB";	 Catch:{ NumberFormatException -> 0x005d }
        r4 = r3.endsWith(r4);	 Catch:{ NumberFormatException -> 0x005d }
        if (r4 == 0) goto L_0x0059;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x0050:
        r4 = "GB";	 Catch:{ NumberFormatException -> 0x005d }
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ NumberFormatException -> 0x005d }
        r3 = defpackage.awj.a(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x005d }
        goto L_0x0061;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x0059:
        defpackage.avf.c();	 Catch:{ NumberFormatException -> 0x005d }
        goto L_0x0060;
    L_0x005d:
        defpackage.avf.c();	 Catch:{ all -> 0x0067 }
    L_0x0060:
        r3 = r1;	 Catch:{ all -> 0x0067 }
    L_0x0061:
        d = r3;	 Catch:{ all -> 0x0067 }
    L_0x0063:
        r1 = d;	 Catch:{ all -> 0x0067 }
        monitor-exit(r0);
        return r1;
    L_0x0067:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.b():long");
    }

    public static long b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static String b(Context context, String str) {
        int a = awj.a(context, str, "string");
        return a > 0 ? context.getString(a) : BuildConfig.FLAVOR;
    }

    public static String b(InputStream inputStream) {
        return awj.a(inputStream, "SHA-1");
    }

    public static String b(String str) {
        return awj.a(str, "SHA-256");
    }

    public static void b(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        return;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.b(java.io.Closeable):void");
    }

    public static long c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static Float c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static String c() {
        return "D";
    }

    public static boolean d(Context context) {
        return (awj.g(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static boolean d(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void e(Context context) {
        if (awj.o(context)) {
            avf.c();
        }
    }

    public static void f(Context context) {
        if (awj.o(context)) {
            avf.c();
        }
    }

    public static boolean g(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!("sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT))) {
            if (string != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(Context context) {
        boolean g = awj.g(context);
        String str = Build.TAGS;
        if ((!g && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !g && new File("/system/xbin/su").exists();
    }

    public static int i(Context context) {
        Object obj;
        int g = awj.g(context);
        if (awj.h(context)) {
            g |= 2;
        }
        if (!Debug.isDebuggerConnected()) {
            if (!Debug.waitingForDebugger()) {
                obj = null;
                return obj == null ? g | 4 : g;
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    public static boolean j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static java.lang.String k(android.content.Context r4) {
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
        r1 = r4.getResources();	 Catch:{ Exception -> 0x0024, all -> 0x001f }
        r4 = defpackage.awj.l(r4);	 Catch:{ Exception -> 0x0024, all -> 0x001f }
        r4 = r1.openRawResource(r4);	 Catch:{ Exception -> 0x0024, all -> 0x001f }
        r1 = "SHA-1";	 Catch:{ Exception -> 0x0025 }
        r1 = defpackage.awj.a(r4, r1);	 Catch:{ Exception -> 0x0025 }
        r2 = defpackage.awj.d(r1);	 Catch:{ Exception -> 0x0025 }
        if (r2 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        r0 = r1;
    L_0x001b:
        defpackage.awj.a(r4);
        return r0;
    L_0x001f:
        r4 = move-exception;
        r3 = r0;
        r0 = r4;
        r4 = r3;
        goto L_0x002d;
    L_0x0024:
        r4 = r0;
    L_0x0025:
        defpackage.avf.c();	 Catch:{ all -> 0x002c }
        defpackage.awj.a(r4);
        return r0;
    L_0x002c:
        r0 = move-exception;
    L_0x002d:
        defpackage.awj.a(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: awj.k(android.content.Context):java.lang.String");
    }

    public static int l(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String m(Context context) {
        int a = awj.a(context, "io.fabric.android.build_id", "string");
        if (a == 0) {
            a = awj.a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        avf.c();
        return string;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean n(Context context) {
        if ((context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null) == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private static boolean o(Context context) {
        if (b == null) {
            b = Boolean.valueOf(awj.a(context, "com.crashlytics.Trace", false));
        }
        return b.booleanValue();
    }

    private static String p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        return i > 0 ? context.getResources().getResourcePackageName(i) : context.getPackageName();
    }
}
