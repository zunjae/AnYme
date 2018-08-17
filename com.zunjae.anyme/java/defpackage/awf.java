package defpackage;

import android.os.IBinder;
import android.os.IInterface;

final class awf implements IInterface {
    private final IBinder a;

    public awf(IBinder iBinder) {
        this.a = iBinder;
    }

    public final java.lang.String a() {
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
        r0 = android.os.Parcel.obtain();
        r1 = android.os.Parcel.obtain();
        r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";	 Catch:{ Exception -> 0x0024 }
        r0.writeInterfaceToken(r2);	 Catch:{ Exception -> 0x0024 }
        r2 = r5.a;	 Catch:{ Exception -> 0x0024 }
        r3 = 1;	 Catch:{ Exception -> 0x0024 }
        r4 = 0;	 Catch:{ Exception -> 0x0024 }
        r2.transact(r3, r0, r1, r4);	 Catch:{ Exception -> 0x0024 }
        r1.readException();	 Catch:{ Exception -> 0x0024 }
        r2 = r1.readString();	 Catch:{ Exception -> 0x0024 }
        r1.recycle();
        r0.recycle();
        goto L_0x002e;
    L_0x0022:
        r2 = move-exception;
        goto L_0x002f;
    L_0x0024:
        defpackage.avf.c();	 Catch:{ all -> 0x0022 }
        r1.recycle();
        r0.recycle();
        r2 = 0;
    L_0x002e:
        return r2;
    L_0x002f:
        r1.recycle();
        r0.recycle();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: awf.a():java.lang.String");
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final boolean b() {
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
        r6 = this;
        r0 = android.os.Parcel.obtain();
        r1 = android.os.Parcel.obtain();
        r2 = 0;
        r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";	 Catch:{ Exception -> 0x0025 }
        r0.writeInterfaceToken(r3);	 Catch:{ Exception -> 0x0025 }
        r3 = 1;	 Catch:{ Exception -> 0x0025 }
        r0.writeInt(r3);	 Catch:{ Exception -> 0x0025 }
        r4 = r6.a;	 Catch:{ Exception -> 0x0025 }
        r5 = 2;	 Catch:{ Exception -> 0x0025 }
        r4.transact(r5, r0, r1, r2);	 Catch:{ Exception -> 0x0025 }
        r1.readException();	 Catch:{ Exception -> 0x0025 }
        r4 = r1.readInt();	 Catch:{ Exception -> 0x0025 }
        if (r4 == 0) goto L_0x0028;
    L_0x0021:
        r2 = 1;
        goto L_0x0028;
    L_0x0023:
        r2 = move-exception;
        goto L_0x002f;
    L_0x0025:
        defpackage.avf.c();	 Catch:{ all -> 0x0023 }
    L_0x0028:
        r1.recycle();
        r0.recycle();
        return r2;
    L_0x002f:
        r1.recycle();
        r0.recycle();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: awf.b():boolean");
    }
}
