package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class aru implements Creator<art> {
    aru() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new art(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new art[i];
    }
}
