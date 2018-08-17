package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class aro implements Creator<arn> {
    aro() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new arn(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new arn[i];
    }
}
