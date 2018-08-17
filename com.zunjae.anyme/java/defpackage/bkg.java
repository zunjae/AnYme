package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

final class bkg<T> extends bkb<Map<String, T>> {
    private final bjq<T, String> a;
    private final boolean b;

    bkg(bjq<T, String> bjq_T__java_lang_String, boolean z) {
        this.a = bjq_T__java_lang_String;
        this.b = z;
    }

    final /* synthetic */ void a(bkv bkv, @Nullable Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    StringBuilder stringBuilder;
                    if (value != null) {
                        String str2 = (String) this.a.a(value);
                        if (str2 != null) {
                            bkv.c(str, str2, this.b);
                        } else {
                            stringBuilder = new StringBuilder("Field map value '");
                            stringBuilder.append(value);
                            stringBuilder.append("' converted to null by ");
                            stringBuilder.append(this.a.getClass().getName());
                            stringBuilder.append(" for key '");
                            stringBuilder.append(str);
                            stringBuilder.append("'.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    stringBuilder = new StringBuilder("Field map contained null value for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                throw new IllegalArgumentException("Field map contained null key.");
            }
            return;
        }
        throw new IllegalArgumentException("Field map was null.");
    }
}
