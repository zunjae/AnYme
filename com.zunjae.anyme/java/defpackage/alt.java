package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class alt implements Parcelable {
    public static final Creator<alt> CREATOR = new alu();
    private static final String a = "alt";
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public alt(int i, String str, String str2, String str3, String str4, String str5) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    protected alt(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.g;
    }

    public final int f() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
