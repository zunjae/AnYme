package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class ud {
    private static final py a = py.a("0");
    private static final py b = py.a("Unity");

    private static int a() {
        return ((qc.b(1, a) + 0) + qc.b(2, a)) + qc.b(3, 0);
    }

    private static int a(awx awx, String str) {
        return qc.d(1, awx.protobufIndex) + qc.b(2, py.a(str));
    }

    private static int a(Float f, int i, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            f.floatValue();
            i3 = 0 + qc.a();
        }
        return ((((i3 + qc.b(i)) + qc.a(3)) + qc.c(4, i2)) + qc.b(5, j)) + qc.b(6, j2);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        int b = qc.b(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0) + 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        b += qc.b(2, py.a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            b += qc.b(3, py.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b += qc.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b + qc.c(5, i);
    }

    private static int a(String str, String str2) {
        int b = qc.b(1, py.a(str));
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        return b + qc.b(2, py.a(str2));
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b = qc.b(1, py.a(thread.getName())) + qc.c(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = ud.a(a, z);
            b += (qc.d(3) + qc.f(a2)) + a2;
        }
        return b;
    }

    private static int a(py pyVar, py pyVar2) {
        int b = ((qc.b(1, 0) + 0) + qc.b(2, 0)) + qc.b(3, pyVar);
        return pyVar2 != null ? b + qc.b(4, pyVar2) : b;
    }

    private static int a(uh uhVar, int i, int i2) {
        int i3 = 0;
        int b = qc.b(1, py.a(uhVar.b)) + 0;
        String str = uhVar.a;
        if (str != null) {
            b += qc.b(3, py.a(str));
        }
        int i4 = b;
        for (StackTraceElement a : uhVar.c) {
            int a2 = ud.a(a, true);
            i4 += (qc.d(4) + qc.f(a2)) + a2;
        }
        uhVar = uhVar.d;
        if (uhVar == null) {
            return i4;
        }
        if (i < i2) {
            int a3 = ud.a(uhVar, i + 1, i2);
            return i4 + ((qc.d(6) + qc.f(a3)) + a3);
        }
        while (uhVar != null) {
            uhVar = uhVar.d;
            i3++;
        }
        return i4 + qc.c(7, i3);
    }

    private static int a(uh uhVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, py pyVar, py pyVar2) {
        int a = ud.a(thread, stackTraceElementArr, 4, true);
        int d = ((qc.d(1) + qc.f(a)) + a) + 0;
        int length = threadArr.length;
        int i = d;
        for (d = 0; d < length; d++) {
            int a2 = ud.a(threadArr[d], (StackTraceElement[]) list.get(d), 0, false);
            i += (qc.d(1) + qc.f(a2)) + a2;
        }
        int a3 = ud.a(uhVar, 1, 8);
        i += (qc.d(2) + qc.f(a3)) + a3;
        a3 = ud.a();
        i += (qc.d(3) + qc.f(a3)) + a3;
        a3 = ud.a(pyVar, pyVar2);
        return i + ((qc.d(3) + qc.f(a3)) + a3);
    }

    private static int a(uh uhVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, py pyVar, py pyVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i) {
        int a = ud.a(uhVar, thread, stackTraceElementArr, threadArr, list, pyVar, pyVar2);
        int d = ((qc.d(1) + qc.f(a)) + a) + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a2 = ud.a((String) entry.getKey(), (String) entry.getValue());
                d += (qc.d(2) + qc.f(a2)) + a2;
            }
        }
        if (runningAppProcessInfo != null) {
            a2 = runningAppProcessInfo.importance;
            d += qc.a(3);
        }
        return d + qc.c(4, i);
    }

    private static py a(String str) {
        return str == null ? null : py.a(str);
    }

    private static void a(qc qcVar, int i, StackTraceElement stackTraceElement, boolean z) {
        qcVar.e(i, 2);
        qcVar.e(ud.a(stackTraceElement, z));
        qcVar.a(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        qcVar.a(2, py.a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            qcVar.a(3, py.a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            qcVar.a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        qcVar.a(5, i2);
    }

    public static void a(qc qcVar, int i, String str, int i2, long j, long j2, boolean z, Map<awx, String> map, int i3, String str2, String str3) {
        qc qcVar2 = qcVar;
        int i4 = i;
        int i5 = i2;
        long j3 = j;
        long j4 = j2;
        int i6 = i3;
        py a = ud.a(str);
        py a2 = ud.a(str3);
        py a3 = ud.a(str2);
        qcVar2.e(9, 2);
        int d = (((((qc.d(3, i4) + 0) + (a == null ? 0 : qc.b(4, a))) + qc.c(5, i5)) + qc.b(6, j3)) + qc.b(7, j4)) + qc.a(10);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a4 = ud.a((awx) entry.getKey(), (String) entry.getValue());
                d += (qc.d(11) + qc.f(a4)) + a4;
            }
        }
        qcVar2.e(((d + qc.c(12, i6)) + (a3 == null ? 0 : qc.b(13, a3))) + (a2 == null ? 0 : qc.b(14, a2)));
        qcVar2.b(3, i4);
        qcVar2.a(4, a);
        qcVar2.a(5, i5);
        qcVar2.a(6, j3);
        qcVar2.a(7, j4);
        qcVar2.a(10, z);
        for (Entry entry2 : map.entrySet()) {
            qcVar2.e(11, 2);
            qcVar2.e(ud.a((awx) entry2.getKey(), (String) entry2.getValue()));
            qcVar2.b(1, ((awx) entry2.getKey()).protobufIndex);
            qcVar2.a(2, py.a((String) entry2.getValue()));
        }
        qcVar2.a(12, i6);
        if (a3 != null) {
            qcVar2.a(13, a3);
        }
        if (a2 != null) {
            qcVar2.a(14, a2);
        }
    }

    public static void a(qc qcVar, long j, String str, uh uhVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, td tdVar, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        int b;
        qc qcVar2 = qcVar;
        long j4 = j;
        Thread[] threadArr2 = threadArr;
        RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        int i3 = i;
        String str4 = str3;
        py a = py.a(str2);
        py a2 = str4 == null ? null : py.a(str4.replace("-", BuildConfig.FLAVOR));
        py a3 = tdVar.a();
        if (a3 == null) {
            avf.c();
        }
        tdVar.c();
        qcVar2.e(10, 2);
        int b2 = (qc.b(1, j4) + 0) + qc.b(2, py.a(str));
        py pyVar = a3;
        py pyVar2 = a2;
        py pyVar3 = a;
        int a4 = ud.a(uhVar, thread, stackTraceElementArr, threadArr, list, a, a2, map, runningAppProcessInfo, i);
        b2 += (qc.d(3) + qc.f(a4)) + a4;
        a4 = ud.a(f, i2, i, j2, j3);
        b2 += (qc.d(5) + qc.f(a4)) + a4;
        if (pyVar != null) {
            a4 = 1;
            b = qc.b(1, pyVar);
            b2 += (qc.d(6) + qc.f(b)) + b;
        } else {
            a4 = 1;
        }
        qcVar2.e(b2);
        qcVar2.a(a4, j4);
        qcVar2.a(2, py.a(str));
        qcVar2.e(3, 2);
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        Thread[] threadArr3 = threadArr;
        List<StackTraceElement[]> list2 = list;
        py pyVar4 = pyVar3;
        py pyVar5 = pyVar2;
        qcVar2.e(ud.a(uhVar, thread2, stackTraceElementArr2, threadArr3, list2, pyVar4, pyVar5, map, runningAppProcessInfo, i));
        qcVar2.e(1, 2);
        qcVar2.e(ud.a(uhVar, thread2, stackTraceElementArr2, threadArr3, list2, pyVar4, pyVar5));
        ud.a(qcVar2, thread2, stackTraceElementArr2, 4, true);
        int length = threadArr2.length;
        for (a4 = 0; a4 < length; a4++) {
            ud.a(qcVar2, threadArr2[a4], (StackTraceElement[]) list.get(a4), 0, false);
        }
        uh uhVar2 = uhVar;
        length = 2;
        b = 1;
        while (true) {
            qcVar2.e(length, 2);
            qcVar2.e(ud.a(uhVar2, 1, 8));
            qcVar2.a(1, py.a(uhVar2.b));
            String str5 = uhVar2.a;
            if (str5 != null) {
                qcVar2.a(3, py.a(str5));
            }
            for (StackTraceElement a5 : uhVar2.c) {
                ud.a(qcVar2, 4, a5, true);
            }
            uhVar2 = uhVar2.d;
            if (uhVar2 != null) {
                if (b >= 8) {
                    break;
                }
                b++;
                length = 6;
            } else {
                break;
            }
        }
        length = 0;
        while (uhVar2 != null) {
            uhVar2 = uhVar2.d;
            length++;
        }
        qcVar2.a(7, length);
        qcVar2.e(3, 2);
        qcVar2.e(ud.a());
        qcVar2.a(1, a);
        qcVar2.a(2, a);
        qcVar2.a(3, 0);
        qcVar2.e(4, 2);
        pyVar4 = pyVar2;
        py pyVar6 = pyVar3;
        qcVar2.e(ud.a(pyVar6, pyVar4));
        qcVar2.a(1, 0);
        qcVar2.a(2, 0);
        qcVar2.a(3, pyVar6);
        if (pyVar4 != null) {
            qcVar2.a(4, pyVar4);
        }
        if (!(map == null || map.isEmpty())) {
            for (Entry entry : map.entrySet()) {
                qcVar2.e(2, 2);
                qcVar2.e(ud.a((String) entry.getKey(), (String) entry.getValue()));
                qcVar2.a(1, py.a((String) entry.getKey()));
                str4 = (String) entry.getValue();
                if (str4 == null) {
                    str4 = BuildConfig.FLAVOR;
                }
                qcVar2.a(2, py.a(str4));
            }
        }
        if (runningAppProcessInfo2 != null) {
            qcVar2.a(3, runningAppProcessInfo2.importance != 100);
        }
        length = i;
        qcVar2.a(4, length);
        qcVar2.e(5, 2);
        qcVar2.e(ud.a(f, i2, i, j2, j3));
        if (f != null) {
            float floatValue = f.floatValue();
            qcVar2.e(1, 5);
            b = Float.floatToRawIntBits(floatValue);
            qcVar2.c(b & 255);
            qcVar2.c((b >> 8) & 255);
            qcVar2.c((b >> 16) & 255);
            qcVar2.c((b >> 24) & 255);
        }
        qcVar2.e(2, 0);
        qcVar2.e(qc.g(i2));
        qcVar2.a(3, z);
        qcVar2.a(4, length);
        qcVar2.a(5, j2);
        qcVar2.a(6, j3);
        if (pyVar != null) {
            qcVar2.e(6, 2);
            qcVar2.e(qc.b(1, pyVar));
            qcVar2.a(1, pyVar);
        }
    }

    public static void a(qc qcVar, String str, String str2, long j) {
        qcVar.a(1, py.a(str2));
        qcVar.a(2, py.a(str));
        qcVar.a(3, j);
    }

    public static void a(qc qcVar, String str, String str2, String str3) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        py a = py.a(str);
        py a2 = ud.a(str2);
        py a3 = ud.a(str3);
        int b = qc.b(1, a) + 0;
        if (str2 != null) {
            b += qc.b(2, a2);
        }
        if (str3 != null) {
            b += qc.b(3, a3);
        }
        qcVar.e(6, 2);
        qcVar.e(b);
        qcVar.a(1, a);
        if (str2 != null) {
            qcVar.a(2, a2);
        }
        if (str3 != null) {
            qcVar.a(3, a3);
        }
    }

    public static void a(qc qcVar, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        qc qcVar2 = qcVar;
        int i2 = i;
        py a = py.a(str);
        py a2 = py.a(str2);
        py a3 = py.a(str3);
        py a4 = py.a(str4);
        py a5 = py.a(str5);
        py a6 = str6 != null ? py.a(str6) : null;
        qcVar2.e(7, 2);
        int b = qc.b(1, a2) + 0;
        int b2 = ((((qc.b(1, a) + 0) + qc.b(2, a3)) + qc.b(3, a4)) + ((qc.d(5) + qc.f(b)) + b)) + qc.b(6, a5);
        if (a6 != null) {
            b2 = (b2 + qc.b(8, b)) + qc.b(9, a6);
        }
        qcVar2.e(b2 + qc.d(10, i2));
        qcVar2.a(1, a);
        qcVar2.a(2, a3);
        qcVar2.a(3, a4);
        qcVar2.e(5, 2);
        qcVar2.e(qc.b(1, a2) + 0);
        qcVar2.a(1, a2);
        qcVar2.a(6, a5);
        if (a6 != null) {
            qcVar2.a(8, b);
            qcVar2.a(9, a6);
        }
        qcVar2.b(10, i2);
    }

    public static void a(qc qcVar, String str, String str2, boolean z) {
        py a = py.a(str);
        py a2 = py.a(str2);
        qcVar.e(8, 2);
        qcVar.e((((qc.d(1, 3) + 0) + qc.b(2, a)) + qc.b(3, a2)) + qc.a(4));
        qcVar.b(1, 3);
        qcVar.a(2, a);
        qcVar.a(3, a2);
        qcVar.a(4, z);
    }

    private static void a(qc qcVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        qcVar.e(1, 2);
        qcVar.e(ud.a(thread, stackTraceElementArr, i, z));
        qcVar.a(1, py.a(thread.getName()));
        qcVar.a(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            ud.a(qcVar, 3, a, z);
        }
    }
}
