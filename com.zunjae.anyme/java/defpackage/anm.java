package defpackage;

import android.content.Context;
import com.zunjae.anyme.R;
import java.util.HashMap;
import java.util.Map;

public final class anm {
    private static final String a = aum.a("\u00ca\u00ea\u0095\u0094\u0097\u00a5\u0096\u009e\u0097\u009e\u008f\u00ab\u00a3\u0096\u00aa\u0095\u00a9\u009c\u00a7\u00a9\u009e\u00be\u00d7\u00a5\u00a1\u0097\u0092\u0092\u0094\u0096\u00a5\u009f\u0099\u009b\u0096\u00aa\u008ch");
    private static final String b = aum.a("\u00ca\u00ea\u0095\u0094\u0097\u00a5\u0096\u009e\u0097\u009e\u008f\u00ab\u00a3\u0096\u00aa\u0095\u00a9\u009c\u00a7\u00a9\u009e\u00be\u00d7\u00a5\u00a1\u0097\u0092\u0092\u0094\u0096\u00a5\u009f\u0099\u009b\u0096\u00aa\u008ch\u0093\u00aa\u0099\u0093\u00cd\u00e7\u009e");

    public static String a(Context context) {
        int b = aux.b(b, -1);
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(-1), aum.a(context.getResources().getString(R.string.emoji_minus_one)));
        hashMap.put(Integer.valueOf(0), aum.a(context.getResources().getString(R.string.emoji_zero)));
        hashMap.put(Integer.valueOf(1), aum.a(context.getResources().getString(R.string.emoji_one)));
        hashMap.put(Integer.valueOf(2), aum.a(context.getResources().getString(R.string.emoji_two)));
        hashMap.put(Integer.valueOf(3), aum.a(context.getResources().getString(R.string.emoji_three)));
        return (String) hashMap.get(Integer.valueOf(b));
    }
}
