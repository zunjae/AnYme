package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.activities.AbstractActivity;
import java.util.ArrayList;
import java.util.Collection;

public final class ajm {
    public static void a(Activity activity, String str) {
        aug.a(activity, str);
        Toast.makeText(activity, "Name copied to your clipboard", 0).show();
    }

    public static void a(AbstractActivity abstractActivity, String str, String str2, String str3) {
        Collection arrayList = new ArrayList();
        if (str3 == null) {
            str3 = "anime";
        }
        String str4 = str3;
        arrayList.add("MyAnimeList");
        arrayList.add("Google Search");
        arrayList.add("Google Images");
        arrayList.add("Cosplay Images");
        arrayList.add("Wallpapers");
        arrayList.add("YouTube Videos");
        if (anl.a(abstractActivity)) {
            arrayList.add("NHentai");
        }
        new o(abstractActivity).a(String.format("Pick an Action for %s", new Object[]{str})).a(arrayList).a(new ajn(arrayList, abstractActivity, str2, str, str4)).l();
    }
}
