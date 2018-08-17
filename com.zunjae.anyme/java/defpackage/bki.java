package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

final class bki<T> extends bkb<Map<String, T>> {
    private final bjq<T, String> a;

    bki(bjq<T, String> bjq_T__java_lang_String) {
        this.a = bjq_T__java_lang_String;
    }

    final /* synthetic */ void a(bkv bkv, @Nullable Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        bkv.a(str, (String) this.a.a(value));
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Header map contained null value for key '");
                        stringBuilder.append(str);
                        stringBuilder.append("'.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                throw new IllegalArgumentException("Header map contained null key.");
            }
            return;
        }
        throw new IllegalArgumentException("Header map was null.");
    }
}
