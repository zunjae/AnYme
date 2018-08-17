package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class rc extends HashMap<String, Object> {
    final /* synthetic */ rb a;

    rc(rb rbVar) {
        this.a = rbVar;
        put("app_identifier", this.a.a);
        put("api_key", this.a.f.p.a);
        put("version_code", this.a.b);
        put("version_name", this.a.c);
        put("install_uuid", this.a.d);
        put("delivery_mechanism", Integer.valueOf(this.a.e));
        put("unity_version", TextUtils.isEmpty(this.a.f.w) ? BuildConfig.FLAVOR : this.a.f.w);
    }
}
