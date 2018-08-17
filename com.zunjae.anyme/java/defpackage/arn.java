package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class arn implements Parcelable {
    public static final Creator<arn> CREATOR = new aro();
    private final long a;
    private final String b;
    private final String c;

    public arn(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    protected arn(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
