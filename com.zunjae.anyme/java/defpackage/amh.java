package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class amh implements Creator<amg> {
    amh() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new amg(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new amg[i];
    }
}
