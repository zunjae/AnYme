package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class alw implements Creator<alv> {
    alw() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new alv(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new alv[i];
    }
}
