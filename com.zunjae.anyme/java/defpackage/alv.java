package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class alv implements Parcelable {
    public static final Creator<alv> CREATOR = new alw();
    private ArrayList<Integer> a;
    private String b;
    private int c;
    private alx d;

    private alv(Parcel parcel) {
        if (parcel.readByte() == (byte) 1) {
            this.a = new ArrayList();
            parcel.readList(this.a, Integer.class.getClassLoader());
        } else {
            this.a = null;
        }
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = (alx) parcel.readValue(alx.class.getClassLoader());
    }

    public static ArrayList<alx> a() {
        ArrayList<alx> arrayList = new ArrayList();
        arrayList.add(alx.ALL);
        arrayList.add(alx.AIRING);
        arrayList.add(alx.FINISHED);
        arrayList.add(alx.NOT_YET_AIRED);
        return arrayList;
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void a(alx alx) {
        this.d = alx;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(List<Object> list) {
        this.a = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add(Integer.valueOf(((aml) it.next()).b()));
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final String b() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            stringBuilder.append("&genre[]=");
            stringBuilder.append(num);
        }
        return String.format("http://myanimelist.net/anime.php?q=%s&type=0&score=%d&status=%d&p=0&r=0&sm=0&sd=0&sy=0&em=0&ed=0&ey=0&c[]=a&c[]=b&c[]=c&c[]=f&gx=0%s", new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d.getValue()), stringBuilder.toString()});
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.a);
        }
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeValue(this.d);
    }
}
