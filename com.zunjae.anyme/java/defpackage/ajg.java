package defpackage;

import android.widget.ProgressBar;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class ajg {
    public static String a(String str) {
        return String.format("javascript: alert(\"%s\" + document.documentElement.innerHTML);", new Object[]{str});
    }

    public static HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("X-Requested-With", BuildConfig.FLAVOR);
        return hashMap;
    }

    public static void a(int i, ProgressBar progressBar) {
        if (progressBar != null) {
            if (progressBar.getProgress() < 100 && progressBar.getVisibility() == 8) {
                progressBar.setVisibility(0);
            }
            progressBar.setProgress(i);
            if (i == 100) {
                progressBar.setVisibility(8);
            }
        }
    }
}
