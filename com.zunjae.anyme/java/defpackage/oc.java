package defpackage;

import java.util.Locale;
import java.util.Map;

final class oc {
    final int a = 20;
    final int b = 100;
    boolean c;

    public oc(boolean z) {
        this.c = z;
    }

    private void a(RuntimeException runtimeException) {
        if (this.c) {
            throw runtimeException;
        }
        avf.c();
    }

    public final String a(String str) {
        if (str.length() <= this.b) {
            return str;
        }
        a(new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[]{Integer.valueOf(this.b)})));
        return str.substring(0, this.b);
    }

    public final boolean a(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" must not be null");
        a(new NullPointerException(stringBuilder.toString()));
        return true;
    }

    public final boolean a(Map<String, Object> map, String str) {
        if (map.size() < this.a || map.containsKey(str)) {
            return false;
        }
        a(new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[]{Integer.valueOf(this.a)})));
        return true;
    }
}
