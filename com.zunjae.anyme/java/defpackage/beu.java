package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class beu {
    static final bet[] a;
    static final Map<bhi, Integer> b;

    static {
        r0 = new bet[61];
        int i = 0;
        r0[0] = new bet(bet.f, BuildConfig.FLAVOR);
        r0[1] = new bet(bet.c, "GET");
        r0[2] = new bet(bet.c, "POST");
        r0[3] = new bet(bet.d, "/");
        r0[4] = new bet(bet.d, "/index.html");
        r0[5] = new bet(bet.e, "http");
        r0[6] = new bet(bet.e, "https");
        r0[7] = new bet(bet.b, "200");
        r0[8] = new bet(bet.b, "204");
        r0[9] = new bet(bet.b, "206");
        r0[10] = new bet(bet.b, "304");
        r0[11] = new bet(bet.b, "400");
        r0[12] = new bet(bet.b, "404");
        r0[13] = new bet(bet.b, "500");
        r0[14] = new bet("accept-charset", BuildConfig.FLAVOR);
        r0[15] = new bet("accept-encoding", "gzip, deflate");
        r0[16] = new bet("accept-language", BuildConfig.FLAVOR);
        r0[17] = new bet("accept-ranges", BuildConfig.FLAVOR);
        r0[18] = new bet("accept", BuildConfig.FLAVOR);
        r0[19] = new bet("access-control-allow-origin", BuildConfig.FLAVOR);
        r0[20] = new bet("age", BuildConfig.FLAVOR);
        r0[21] = new bet("allow", BuildConfig.FLAVOR);
        r0[22] = new bet("authorization", BuildConfig.FLAVOR);
        r0[23] = new bet("cache-control", BuildConfig.FLAVOR);
        r0[24] = new bet("content-disposition", BuildConfig.FLAVOR);
        r0[25] = new bet("content-encoding", BuildConfig.FLAVOR);
        r0[26] = new bet("content-language", BuildConfig.FLAVOR);
        r0[27] = new bet("content-length", BuildConfig.FLAVOR);
        r0[28] = new bet("content-location", BuildConfig.FLAVOR);
        r0[29] = new bet("content-range", BuildConfig.FLAVOR);
        r0[30] = new bet("content-type", BuildConfig.FLAVOR);
        r0[31] = new bet("cookie", BuildConfig.FLAVOR);
        r0[32] = new bet("date", BuildConfig.FLAVOR);
        r0[33] = new bet("etag", BuildConfig.FLAVOR);
        r0[34] = new bet("expect", BuildConfig.FLAVOR);
        r0[35] = new bet("expires", BuildConfig.FLAVOR);
        r0[36] = new bet("from", BuildConfig.FLAVOR);
        r0[37] = new bet("host", BuildConfig.FLAVOR);
        r0[38] = new bet("if-match", BuildConfig.FLAVOR);
        r0[39] = new bet("if-modified-since", BuildConfig.FLAVOR);
        r0[40] = new bet("if-none-match", BuildConfig.FLAVOR);
        r0[41] = new bet("if-range", BuildConfig.FLAVOR);
        r0[42] = new bet("if-unmodified-since", BuildConfig.FLAVOR);
        r0[43] = new bet("last-modified", BuildConfig.FLAVOR);
        r0[44] = new bet("link", BuildConfig.FLAVOR);
        r0[45] = new bet("location", BuildConfig.FLAVOR);
        r0[46] = new bet("max-forwards", BuildConfig.FLAVOR);
        r0[47] = new bet("proxy-authenticate", BuildConfig.FLAVOR);
        r0[48] = new bet("proxy-authorization", BuildConfig.FLAVOR);
        r0[49] = new bet("range", BuildConfig.FLAVOR);
        r0[50] = new bet("referer", BuildConfig.FLAVOR);
        r0[51] = new bet("refresh", BuildConfig.FLAVOR);
        r0[52] = new bet("retry-after", BuildConfig.FLAVOR);
        r0[53] = new bet("server", BuildConfig.FLAVOR);
        r0[54] = new bet("set-cookie", BuildConfig.FLAVOR);
        r0[55] = new bet("strict-transport-security", BuildConfig.FLAVOR);
        r0[56] = new bet("transfer-encoding", BuildConfig.FLAVOR);
        r0[57] = new bet("user-agent", BuildConfig.FLAVOR);
        r0[58] = new bet("vary", BuildConfig.FLAVOR);
        r0[59] = new bet("via", BuildConfig.FLAVOR);
        r0[60] = new bet("www-authenticate", BuildConfig.FLAVOR);
        a = r0;
        Map linkedHashMap = new LinkedHashMap(a.length);
        while (true) {
            bet[] betArr = a;
            if (i < betArr.length) {
                if (!linkedHashMap.containsKey(betArr[i].g)) {
                    linkedHashMap.put(a[i].g, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    static bhi a(bhi bhi) {
        int g = bhi.g();
        for (int i = 0; i < g; i++) {
            byte a = bhi.a(i);
            if (a >= (byte) 65) {
                if (a <= (byte) 90) {
                    StringBuilder stringBuilder = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                    stringBuilder.append(bhi.a());
                    throw new IOException(stringBuilder.toString());
                }
            }
        }
        return bhi;
    }
}
