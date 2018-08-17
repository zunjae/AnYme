package com.leinardi.android.speeddial;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

class l implements Parcelable {
    public static final Creator<l> CREATOR = new m();
    private boolean a = false;
    private int b = Integer.MIN_VALUE;
    private int c = Integer.MIN_VALUE;
    private int d = 0;
    private float e = 45.0f;
    private boolean f = false;
    private ArrayList<d> g = new ArrayList();

    protected l(Parcel parcel) {
        boolean z = false;
        this.a = parcel.readByte() != (byte) 0;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.f = z;
        this.g = parcel.createTypedArrayList(d.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeByte(this.f);
        parcel.writeTypedList(this.g);
    }
}
