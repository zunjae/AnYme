package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class aml implements Parcelable {
    public static final Creator<aml> CREATOR = new amm();
    private final String a;
    private final int b;

    protected aml(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    private aml(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static ArrayList<aml> a(boolean z) {
        ArrayList<aml> arrayList = new ArrayList();
        arrayList.add(new aml("Action", 1));
        arrayList.add(new aml("Adventure", 2));
        arrayList.add(new aml("Comedy", 4));
        arrayList.add(new aml("Dementia", 5));
        arrayList.add(new aml("Drama", 8));
        arrayList.add(new aml("Ecchi", 9));
        arrayList.add(new aml("Fantasy", 10));
        arrayList.add(new aml("Game", 11));
        arrayList.add(new aml("Harem", 35));
        arrayList.add(new aml("Historical", 13));
        arrayList.add(new aml("Horror", 14));
        arrayList.add(new aml("Josei", 43));
        arrayList.add(new aml("Kids", 15));
        arrayList.add(new aml("Magic", 16));
        arrayList.add(new aml("Martial Arts", 17));
        arrayList.add(new aml("Mecha", 18));
        arrayList.add(new aml("Military", 38));
        arrayList.add(new aml("Music", 19));
        arrayList.add(new aml("Mystery", 7));
        arrayList.add(new aml("Parody", 20));
        arrayList.add(new aml("Police", 39));
        arrayList.add(new aml("Psychological", 40));
        arrayList.add(new aml("Romance", 22));
        arrayList.add(new aml("Samurai", 21));
        arrayList.add(new aml("School", 23));
        arrayList.add(new aml("Sci-Fi", 24));
        arrayList.add(new aml("Seinen", 42));
        arrayList.add(new aml("Shoujo", 25));
        arrayList.add(new aml("Shoujo Ai", 26));
        arrayList.add(new aml("Shounen", 27));
        arrayList.add(new aml("Shounen Ai", 28));
        arrayList.add(new aml("Slice of Life", 36));
        arrayList.add(new aml("Space", 29));
        arrayList.add(new aml("Sports", 30));
        arrayList.add(new aml("Super Power", 31));
        arrayList.add(new aml("Supernatural", 37));
        arrayList.add(new aml("Thriller", 41));
        arrayList.add(new aml("Vampire", 32));
        if (z) {
            arrayList.add(new aml("Yaoi", 33));
            arrayList.add(new aml("Yuri", 34));
            arrayList.add(new aml("Hentai", 12));
            arrayList.add(new aml("Demons", 6));
        }
        return arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
