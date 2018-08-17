package defpackage;

import java.util.HashMap;

final class qy extends HashMap<String, Object> {
    final /* synthetic */ qx a;

    qy(qx qxVar) {
        this.a = qxVar;
        put("session_id", this.a.a);
        put("generator", this.a.b);
        put("started_at_seconds", Long.valueOf(this.a.c));
    }
}
