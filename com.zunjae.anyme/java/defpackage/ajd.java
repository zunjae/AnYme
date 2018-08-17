package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public final class ajd {
    private static ArrayList<String> a;

    public static void a(Context context) {
        new Thread(new aje(context)).start();
    }

    public static boolean a(String str) {
        ArrayList arrayList = a;
        if (arrayList == null || arrayList.size() == 0) {
            throw new NullPointerException("Forgot to init");
        } else if (str == null) {
            return false;
        } else {
            str = str.toLowerCase();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (str.contains(((String) it.next()).toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void b(Context context) {
        ajd.a(context);
    }
}
