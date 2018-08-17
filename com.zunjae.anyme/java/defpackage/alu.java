package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class alu implements Creator<alt> {
    alu() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new alt(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new alt[i];
    }
}
