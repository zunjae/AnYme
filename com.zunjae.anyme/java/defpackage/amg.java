package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class amg implements Parcelable {
    public static final Creator<amg> CREATOR = new amh();
    private int a;
    @xe(a = "Id")
    private Integer b;
    @xe(a = "Title")
    private String c;
    @xe(a = "Type")
    private String d;
    @xe(a = "Episodes")
    private Integer e;
    @xe(a = "Picture")
    private String f;
    private long g;

    protected amg(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readLong();
    }

    public final int a() {
        return this.a;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final void a(long j) {
        this.g = j;
    }

    public final void a(Integer num) {
        this.b = num;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final String b() {
        return this.c;
    }

    public final void b(Integer num) {
        this.e = num;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final String c() {
        return this.d;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final Integer d() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final String h() {
        StringBuilder stringBuilder = new StringBuilder("https://myanimelist.cdn-dena.com/images/anime");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    public final String toString() {
        return String.format("%s (%s)", new Object[]{this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeValue(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeValue(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
    }
}
