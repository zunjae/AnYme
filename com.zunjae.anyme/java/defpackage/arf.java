package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class arf implements Creator<are> {
    arf() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new are(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new are[i];
    }
}
