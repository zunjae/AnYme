package defpackage;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

final class pm {
    public final pp a;
    public final long b;
    public final po c;
    public final Map<String, String> d;
    public final String e;
    public final Map<String, Object> f;
    public final String g;
    public final Map<String, Object> h;
    private String i;

    private pm(pp ppVar, long j, po poVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.a = ppVar;
        this.b = j;
        this.c = poVar;
        this.d = map;
        this.e = str;
        this.f = map2;
        this.g = str2;
        this.h = map3;
    }

    public static pn a(pc<?> pcVar) {
        pn pnVar = new pn(po.PREDEFINED);
        pnVar.f = pcVar.a();
        pnVar.g = pcVar.d.b;
        pnVar.e = pcVar.c.b;
        return pnVar;
    }

    public static pn a(po poVar, Activity activity) {
        Map singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        pn pnVar = new pn(poVar);
        pnVar.c = singletonMap;
        return pnVar;
    }

    public final String toString() {
        if (this.i == null) {
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(": timestamp=");
            stringBuilder.append(this.b);
            stringBuilder.append(", type=");
            stringBuilder.append(this.c);
            stringBuilder.append(", details=");
            stringBuilder.append(this.d);
            stringBuilder.append(", customType=");
            stringBuilder.append(this.e);
            stringBuilder.append(", customAttributes=");
            stringBuilder.append(this.f);
            stringBuilder.append(", predefinedType=");
            stringBuilder.append(this.g);
            stringBuilder.append(", predefinedAttributes=");
            stringBuilder.append(this.h);
            stringBuilder.append(", metadata=[");
            stringBuilder.append(this.a);
            stringBuilder.append("]]");
            this.i = stringBuilder.toString();
        }
        return this.i;
    }
}
