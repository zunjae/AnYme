package defpackage;

import java.util.ArrayList;

public final class amp {
    private final String a;
    private final int b;

    private amp(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static ArrayList<amp> b() {
        ArrayList<amp> arrayList = new ArrayList();
        arrayList.add(new amp("All", 0));
        arrayList.add(new amp("Currently Airing", 1));
        arrayList.add(new amp("Finished Airing", 2));
        arrayList.add(new amp("Not yet Aired", 3));
        return arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }
}
