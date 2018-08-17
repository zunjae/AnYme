package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

public class ik<T> implements ii<Integer, T> {
    private final ii<Uri, T> a;
    private final Resources b;

    public ik(Context context, ii<Uri, T> iiVar) {
        this(context.getResources(), (ii) iiVar);
    }

    private ik(Resources resources, ii<Uri, T> iiVar) {
        this.b = resources;
        this.a = iiVar;
    }

    private defpackage.en<T> a(java.lang.Integer r6, int r7, int r8) {
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
        r5 = this;
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x0040 }
        r2 = "android.resource://";	 Catch:{ NotFoundException -> 0x0040 }
        r1.<init>(r2);	 Catch:{ NotFoundException -> 0x0040 }
        r2 = r5.b;	 Catch:{ NotFoundException -> 0x0040 }
        r3 = r6.intValue();	 Catch:{ NotFoundException -> 0x0040 }
        r2 = r2.getResourcePackageName(r3);	 Catch:{ NotFoundException -> 0x0040 }
        r1.append(r2);	 Catch:{ NotFoundException -> 0x0040 }
        r2 = 47;	 Catch:{ NotFoundException -> 0x0040 }
        r1.append(r2);	 Catch:{ NotFoundException -> 0x0040 }
        r3 = r5.b;	 Catch:{ NotFoundException -> 0x0040 }
        r4 = r6.intValue();	 Catch:{ NotFoundException -> 0x0040 }
        r3 = r3.getResourceTypeName(r4);	 Catch:{ NotFoundException -> 0x0040 }
        r1.append(r3);	 Catch:{ NotFoundException -> 0x0040 }
        r1.append(r2);	 Catch:{ NotFoundException -> 0x0040 }
        r2 = r5.b;	 Catch:{ NotFoundException -> 0x0040 }
        r3 = r6.intValue();	 Catch:{ NotFoundException -> 0x0040 }
        r2 = r2.getResourceEntryName(r3);	 Catch:{ NotFoundException -> 0x0040 }
        r1.append(r2);	 Catch:{ NotFoundException -> 0x0040 }
        r1 = r1.toString();	 Catch:{ NotFoundException -> 0x0040 }
        r1 = android.net.Uri.parse(r1);	 Catch:{ NotFoundException -> 0x0040 }
        goto L_0x0054;
    L_0x0040:
        r1 = "ResourceLoader";
        r2 = 5;
        r1 = android.util.Log.isLoggable(r1, r2);
        if (r1 == 0) goto L_0x0053;
    L_0x0049:
        r1 = new java.lang.StringBuilder;
        r2 = "Received invalid resource id: ";
        r1.<init>(r2);
        r1.append(r6);
    L_0x0053:
        r1 = r0;
    L_0x0054:
        if (r1 == 0) goto L_0x005d;
    L_0x0056:
        r6 = r5.a;
        r6 = r6.a(r1, r7, r8);
        return r6;
    L_0x005d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.a(java.lang.Integer, int, int):en<T>");
    }
}
