package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;

public final class aux {
    private static SharedPreferences a;
    private static we b;
    private static auw c;

    public static long a(String str) {
        aux.a(str);
        return a.getLong(c.b(str), -1);
    }

    public static <T> T a(java.lang.String r2, java.lang.Class<T> r3) {
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
        r0 = 2;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r0[r1] = r2;
        r1 = 1;
        r0[r1] = r3;
        defpackage.aux.a(r0);
        r0 = 0;
        r2 = defpackage.aux.b(r2, r0);
        if (r2 == 0) goto L_0x0021;
    L_0x0013:
        r1 = r2.length();
        if (r1 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0021;
    L_0x001a:
        r1 = b;	 Catch:{ Exception -> 0x0021 }
        r2 = r1.a(r2, r3);	 Catch:{ Exception -> 0x0021 }
        return r2;
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: aux.a(java.lang.String, java.lang.Class):T");
    }

    public static void a() {
        aux.a(new Object[0]);
        a.edit().clear().apply();
    }

    public static void a(Context context) {
        a = PreferenceManager.getDefaultSharedPreferences(context);
        if (c == null) {
            c = new auy();
        }
        b = new we();
    }

    public static void a(String str, int i) {
        aux.a(str);
        a.edit().putInt(c.a(str), i).apply();
    }

    public static void a(String str, long j) {
        aux.a(str);
        a.edit().putLong(c.a(str), j).apply();
    }

    public static void a(String str, Object obj) {
        aux.a(str, obj);
        aux.a(str, b.a(obj));
    }

    public static void a(String str, String str2) {
        aux.a(str, str2);
        a.edit().putString(c.a(str), c.a(str2)).apply();
    }

    public static <T> void a(String str, ArrayList<T> arrayList) {
        aux.a(str, arrayList);
        aux.a(str, b.a((Object) arrayList));
    }

    public static void a(String str, boolean z) {
        aux.a(str);
        a.edit().putBoolean(c.a(str), z).apply();
    }

    private static void a(Object... objArr) {
        if (a == null || c == null || b == null) {
            throw new NullPointerException("Call ZimpleDB.init(Context|SharedPreference) first");
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (obj != null) {
                if (obj instanceof String) {
                    if (((String) obj).length() == 0) {
                        throw new IllegalArgumentException("The given String has an empty content");
                    }
                }
                i++;
            } else {
                throw new NullPointerException("One of your arguments were NULL. Please do a proper Null Check");
            }
        }
    }

    public static <T> boolean a(String str, Object obj, Class<T> cls) {
        aux.a(str, obj, cls);
        if (obj instanceof auv) {
            String e = ((auv) obj).e();
            ArrayList b = aux.b(str, (Class) cls);
            if (b.size() == 0) {
                return false;
            }
            Iterator it = b.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((auv) it.next()).e().equals(e)) {
                    b.set(i, cls.cast(obj));
                    aux.b(str, b);
                    return true;
                }
                i++;
            }
            return false;
        }
        throw new IllegalArgumentException("The model you want to update must implement the DBModel interface");
    }

    public static int b(String str, int i) {
        aux.a(str);
        return a.getInt(c.b(str), i);
    }

    public static SharedPreferences b() {
        aux.a(new Object[0]);
        return a;
    }

    public static String b(String str, String str2) {
        aux.a(str);
        str = a.getString(c.a(str), str2);
        return (str == null || str.equals(str2)) ? str2 : c.b(str);
    }

    public static <T> java.util.ArrayList<T> b(java.lang.String r2, java.lang.Class<T> r3) {
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
        r0 = 1;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r0[r1] = r2;
        defpackage.aux.a(r0);
        r0 = 0;
        r2 = defpackage.aux.b(r2, r0);
        if (r2 != 0) goto L_0x0016;
    L_0x0010:
        r2 = new java.util.ArrayList;
        r2.<init>();
        return r2;
    L_0x0016:
        r0 = b;	 Catch:{ Exception -> 0x0024 }
        r1 = new auz;	 Catch:{ Exception -> 0x0024 }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0024 }
        r2 = r0.a(r2, r1);	 Catch:{ Exception -> 0x0024 }
        r2 = (java.util.ArrayList) r2;	 Catch:{ Exception -> 0x0024 }
        return r2;
    L_0x0024:
        r2 = new java.util.ArrayList;
        r2.<init>();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: aux.b(java.lang.String, java.lang.Class):java.util.ArrayList<T>");
    }

    public static void b(String str) {
        aux.a(str);
        if (a.contains(str)) {
            a.edit().remove(str).apply();
        }
    }

    private static <T> void b(String str, ArrayList<T> arrayList) {
        aux.a(str, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof auv)) {
                throw new IllegalArgumentException("All models in your list should implement the DBModel interface");
            }
        }
        aux.a(str, b.a((Object) arrayList));
    }

    public static <T> boolean b(String str, Object obj, Class<T> cls) {
        aux.a(str, obj, cls);
        if (obj instanceof auv) {
            ArrayList b = aux.b(str, (Class) cls);
            String e = ((auv) obj).e();
            if (b.size() == 0) {
                return false;
            }
            Iterator it = b.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((auv) it.next()).e().equals(e)) {
                    b.remove(i);
                    aux.b(str, b);
                    return true;
                }
                i++;
            }
            return false;
        }
        throw new IllegalArgumentException("The model you want to delete must implement the DBModel interface");
    }

    public static boolean b(String str, boolean z) {
        aux.a(str);
        return a.getBoolean(c.b(str), z);
    }

    public static <T> java.util.ArrayList<T> c(java.lang.String r2, java.lang.Class<T> r3) {
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
        r0 = 2;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r0[r1] = r2;
        r1 = 1;
        r0[r1] = r3;
        defpackage.aux.a(r0);
        r0 = 0;
        r2 = defpackage.aux.b(r2, r0);
        if (r2 == 0) goto L_0x002e;
    L_0x0013:
        r0 = r2.length();
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x002e;
    L_0x001a:
        r0 = b;	 Catch:{ Exception -> 0x0028 }
        r1 = new auz;	 Catch:{ Exception -> 0x0028 }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0028 }
        r2 = r0.a(r2, r1);	 Catch:{ Exception -> 0x0028 }
        r2 = (java.util.ArrayList) r2;	 Catch:{ Exception -> 0x0028 }
        return r2;
    L_0x0028:
        r2 = new java.util.ArrayList;
        r2.<init>();
        return r2;
    L_0x002e:
        r2 = new java.util.ArrayList;
        r2.<init>();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: aux.c(java.lang.String, java.lang.Class):java.util.ArrayList<T>");
    }

    public static <T> void c(String str, Object obj, Class<T> cls) {
        aux.a(str, obj, cls);
        if (obj instanceof auv) {
            String e = ((auv) obj).e();
            ArrayList b = aux.b(str, (Class) cls);
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (((auv) it.next()).e().equals(e)) {
                    return;
                }
            }
            b.add(cls.cast(obj));
            aux.b(str, b);
            return;
        }
        throw new IllegalArgumentException("The model you want to delete must implement the DBModel interface");
    }

    public static boolean c(String str) {
        aux.a(str);
        return a.contains(str);
    }
}
