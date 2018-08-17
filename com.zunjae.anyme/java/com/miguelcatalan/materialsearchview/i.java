package com.miguelcatalan.materialsearchview;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

final class i extends BaseSavedState {
    public static final Creator<i> CREATOR = new j();
    String a;
    boolean b;

    private i(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.b = z;
    }

    i(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
