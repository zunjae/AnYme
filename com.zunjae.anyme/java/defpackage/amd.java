package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class amd implements Creator<amc> {
    amd() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new amc(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new amc[i];
    }
}
