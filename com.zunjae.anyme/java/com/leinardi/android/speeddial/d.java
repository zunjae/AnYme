package com.leinardi.android.speeddial;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import defpackage.bv;

public final class d implements Parcelable {
    public static final Creator<d> CREATOR = new e();
    private final int a;
    private final String b;
    private final int c;
    private final Drawable d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final int k;

    protected d(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = null;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readByte() != (byte) 0;
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }

    private d(f fVar) {
        this.a = fVar.a;
        this.b = fVar.e;
        this.e = fVar.d;
        this.c = fVar.b;
        this.d = fVar.c;
        this.f = fVar.f;
        this.g = fVar.g;
        this.h = fVar.h;
        this.i = fVar.i;
        this.j = fVar.j;
        this.k = fVar.k;
    }

    public final int a() {
        return this.a;
    }

    public final Drawable a(Context context) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable;
        }
        int i = this.c;
        return i != Integer.MIN_VALUE ? bv.b(context, i) : null;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    public final boolean g() {
        return this.i;
    }

    public final int h() {
        return this.k;
    }

    final int i() {
        return this.j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByte(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
    }
}
