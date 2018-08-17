package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class amm implements Creator<aml> {
    amm() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aml(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aml[i];
    }
}
