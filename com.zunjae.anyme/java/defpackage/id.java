package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class id {
    private static final String a = System.getProperty("http.agent");
    private static final Map<String, List<ib>> b;
    private boolean c = true;
    private Map<String, List<ib>> d = b;
    private boolean e = true;
    private boolean f = true;

    static {
        Map hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(a)) {
            hashMap.put("User-Agent", Collections.singletonList(new ie(a)));
        }
        hashMap.put("Accept-Encoding", Collections.singletonList(new ie("identity")));
        b = Collections.unmodifiableMap(hashMap);
    }

    public final ic a() {
        this.c = true;
        return new ic(this.d);
    }
}
