package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

final class oa {
    final oc a;
    final Map<String, Object> b = new ConcurrentHashMap();

    public oa(oc ocVar) {
        this.a = ocVar;
    }

    final void a(String str, String str2) {
        if (!this.a.a((Object) str, "key")) {
            if (!this.a.a((Object) str2, "value")) {
                str = this.a.a(str);
                str2 = this.a.a(str2);
                if (!this.a.a(this.b, str)) {
                    this.b.put(str, str2);
                }
            }
        }
    }

    public final String toString() {
        return new JSONObject(this.b).toString();
    }
}
