package defpackage;

import android.content.Context;
import java.io.File;

public final class auk {
    private static final String a = "auk";

    private auk() {
    }

    public static File a(Context context, String str) {
        return new File(context.getFilesDir(), str);
    }

    public static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
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
        r0 = new java.io.File;
        r3 = r3.getFilesDir();
        r0.<init>(r3, r4);
        r3 = 0;
        r4 = new java.io.BufferedWriter;	 Catch:{ IOException -> 0x0029, all -> 0x0022 }
        r1 = new java.io.FileWriter;	 Catch:{ IOException -> 0x0029, all -> 0x0022 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0029, all -> 0x0022 }
        r4.<init>(r1);	 Catch:{ IOException -> 0x0029, all -> 0x0022 }
        r4.write(r5);	 Catch:{ IOException -> 0x0020, all -> 0x001b }
        r4.close();	 Catch:{ Exception -> 0x002e }
        return;	 Catch:{ Exception -> 0x002e }
    L_0x001b:
        r3 = move-exception;	 Catch:{ Exception -> 0x002e }
        r2 = r4;	 Catch:{ Exception -> 0x002e }
        r4 = r3;	 Catch:{ Exception -> 0x002e }
        r3 = r2;	 Catch:{ Exception -> 0x002e }
        goto L_0x0023;	 Catch:{ Exception -> 0x002e }
    L_0x0020:
        r3 = r4;	 Catch:{ Exception -> 0x002e }
        goto L_0x0029;	 Catch:{ Exception -> 0x002e }
    L_0x0022:
        r4 = move-exception;	 Catch:{ Exception -> 0x002e }
    L_0x0023:
        if (r3 == 0) goto L_0x0028;	 Catch:{ Exception -> 0x002e }
    L_0x0025:
        r3.close();	 Catch:{ Exception -> 0x002e }
    L_0x0028:
        throw r4;	 Catch:{ Exception -> 0x002e }
    L_0x0029:
        if (r3 == 0) goto L_0x002e;	 Catch:{ Exception -> 0x002e }
    L_0x002b:
        r3.close();	 Catch:{ Exception -> 0x002e }
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: auk.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static boolean b(Context context, String str) {
        File file = new File(context.getFilesDir(), str);
        return file.exists() && !file.isDirectory();
    }
}
