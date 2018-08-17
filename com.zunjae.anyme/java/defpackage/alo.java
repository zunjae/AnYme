package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Comparator;

public final class alo implements Parcelable, auv {
    public static final Creator<alo> CREATOR = new alp();
    @xe(a = "animeName")
    private final String a;
    @xe(a = "videoUrl")
    private final String b;
    @xe(a = "dateAdded")
    private long c;

    protected alo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readLong();
    }

    public alo(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = System.currentTimeMillis();
    }

    public static Comparator<alo> a() {
        return new alq();
    }

    public final void a(long j) {
        this.c = j;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b.toLowerCase();
    }

    public final long d() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.b.toLowerCase();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
