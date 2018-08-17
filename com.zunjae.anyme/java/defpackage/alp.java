package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class alp implements Creator<alo> {
    alp() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new alo(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new alo[i];
    }
}
