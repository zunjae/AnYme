package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class ahs extends BaseSavedState {
    public static final Creator<ahs> CREATOR = new aht();
    private int a;
    private int b;
    private int c;

    private ahs(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public ahs(Parcelable parcelable) {
        super(parcelable);
    }

    public final int a() {
        return this.a;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final int b() {
        return this.b;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final int c() {
        return this.c;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
