package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class amc implements Parcelable {
    public static final Creator<amc> CREATOR = new amd();
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private double l;

    private amc(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readDouble();
    }

    public final double a() {
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
        r6 = this;
        r0 = java.util.Locale.US;	 Catch:{ Exception -> 0x0019 }
        r1 = "%.2f";	 Catch:{ Exception -> 0x0019 }
        r2 = 1;	 Catch:{ Exception -> 0x0019 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
        r3 = 0;	 Catch:{ Exception -> 0x0019 }
        r4 = r6.l;	 Catch:{ Exception -> 0x0019 }
        r4 = java.lang.Double.valueOf(r4);	 Catch:{ Exception -> 0x0019 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0019 }
        r0 = java.lang.String.format(r0, r1, r2);	 Catch:{ Exception -> 0x0019 }
        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ Exception -> 0x0019 }
        return r0;
    L_0x0019:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: amc.a():double");
    }

    public final boolean a(int[] iArr) {
        if (this.e.toLowerCase().equals("tv")) {
            return false;
        }
        for (int i : iArr) {
            if (this.a == i) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.k;
    }

    public final String c() {
        return this.j;
    }

    public final int d() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        this.b = this.b.replace("\u2665", BuildConfig.FLAVOR);
        return this.b;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return bit.b(this.g) ? "No synopsis found for this Anime ):" : this.g;
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeDouble(this.l);
    }
}
