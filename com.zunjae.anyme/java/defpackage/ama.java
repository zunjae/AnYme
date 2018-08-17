package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ama implements Parcelable {
    public static final Creator<ama> CREATOR = new amb();
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;

    public ama(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
    }

    protected ama(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final int c() {
        return this.d;
    }

    public final double d() {
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
        r2 = this;
        r0 = r2.c;	 Catch:{ Exception -> 0x0007 }
        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ama.d():double");
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a;
    }

    public final String f() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
