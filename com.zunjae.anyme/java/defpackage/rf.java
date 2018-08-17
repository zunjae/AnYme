package defpackage;

import android.os.Build.VERSION;
import java.util.HashMap;

final class rf extends HashMap<String, Object> {
    final /* synthetic */ re a;

    rf(re reVar) {
        this.a = reVar;
        put("version", VERSION.RELEASE);
        put("build_version", VERSION.CODENAME);
        put("is_rooted", Boolean.valueOf(this.a.a));
    }
}
