package defpackage;

import android.os.Build;
import java.util.HashMap;

final class ri extends HashMap<String, Object> {
    final /* synthetic */ rh a;

    ri(rh rhVar) {
        this.a = rhVar;
        put("arch", Integer.valueOf(this.a.a));
        put("build_model", Build.MODEL);
        put("available_processors", Integer.valueOf(this.a.b));
        put("total_ram", Long.valueOf(this.a.c));
        put("disk_space", Long.valueOf(this.a.d));
        put("is_emulator", Boolean.valueOf(this.a.e));
        put("ids", this.a.f);
        put("state", Integer.valueOf(this.a.g));
        put("build_manufacturer", Build.MANUFACTURER);
        put("build_product", Build.PRODUCT);
    }
}
