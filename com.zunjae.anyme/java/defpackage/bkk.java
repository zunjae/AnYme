package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

final class bkk<T> extends bkb<Map<String, T>> {
    private final bjq<T, bcp> a;
    private final String b;

    bkk(bjq<T, bcp> bjq_T__bcp, String str) {
        this.a = bjq_T__bcp;
        this.b = str;
    }

    final /* synthetic */ void a(bkv bkv, @Nullable Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        String[] strArr = new String[4];
                        strArr[0] = "Content-Disposition";
                        StringBuilder stringBuilder = new StringBuilder("form-data; name=\"");
                        stringBuilder.append(str);
                        stringBuilder.append("\"");
                        strArr[1] = stringBuilder.toString();
                        strArr[2] = "Content-Transfer-Encoding";
                        strArr[3] = this.b;
                        bkv.a(bbx.a(strArr), (bcp) this.a.a(value));
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder("Part map contained null value for key '");
                        stringBuilder2.append(str);
                        stringBuilder2.append("'.");
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                }
                throw new IllegalArgumentException("Part map contained null key.");
            }
            return;
        }
        throw new IllegalArgumentException("Part map was null.");
    }
}
