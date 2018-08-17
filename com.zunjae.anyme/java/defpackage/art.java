package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class art implements Parcelable {
    public static final Creator<art> CREATOR = new aru();
    private boolean a;

    protected art(Parcel parcel) {
        this.a = parcel.readByte() != (byte) 0;
    }

    public final boolean a() {
        return this.a;
    }

    public final void b() {
        this.a = true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
    }
}
