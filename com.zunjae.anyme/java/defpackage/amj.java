package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class amj implements Creator<ami> {
    amj() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ami(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ami[i];
    }
}
