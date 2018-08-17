package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class arj implements Parcelable {
    public static final Creator<arj> CREATOR = new ark();
    public boolean a;
    public int b;
    public int c;

    protected arj(Parcel parcel) {
        this.a = parcel.readByte() != (byte) 0;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
