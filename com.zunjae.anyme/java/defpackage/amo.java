package defpackage;

import android.annotation.SuppressLint;
import java.util.ArrayList;

public final class amo {
    private final int a;
    private final String b;

    private amo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static ArrayList<amo> a() {
        ArrayList<amo> arrayList = new ArrayList();
        arrayList.add(new amo(0, "Unrated"));
        arrayList.add(new amo(1, "Amagami SS"));
        arrayList.add(new amo(2, "Horrible"));
        arrayList.add(new amo(3, "Very Bad"));
        arrayList.add(new amo(4, "Bad"));
        arrayList.add(new amo(5, "Average"));
        arrayList.add(new amo(6, "Fine"));
        arrayList.add(new amo(7, "Good"));
        arrayList.add(new amo(8, "Very Good"));
        arrayList.add(new amo(9, "Great"));
        arrayList.add(new amo(10, "Masterpiece"));
        return arrayList;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return String.format("(%d) %s", new Object[]{Integer.valueOf(this.a), this.b});
    }
}
