package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(19)
public final class gj implements gh {
    private static final Config[] a = new Config[]{Config.ARGB_8888, null};
    private static final Config[] b = new Config[]{Config.RGB_565};
    private static final Config[] c = new Config[]{Config.ARGB_4444};
    private static final Config[] d = new Config[]{Config.ALPHA_8};
    private final gm e = new gm();
    private final gc<gl, Bitmap> f = new gc();
    private final Map<Config, NavigableMap<Integer, Integer>> g = new HashMap();

    private NavigableMap<Integer, Integer> a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.g.put(config, treeMap);
        return treeMap;
    }

    private void a(Integer num, Config config) {
        NavigableMap a = a(config);
        Integer num2 = (Integer) a.get(num);
        if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private static String b(int i, Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final Bitmap a() {
        Bitmap bitmap = (Bitmap) this.f.a();
        if (bitmap != null) {
            a(Integer.valueOf(nw.a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(int r10, int r11, android.graphics.Bitmap.Config r12) {
        /*
        r9 = this;
        r0 = defpackage.nw.a(r10, r11, r12);
        r1 = r9.e;
        r1 = r1.a(r0, r12);
        r2 = defpackage.gk.a;
        r3 = r12.ordinal();
        r2 = r2[r3];
        r3 = 0;
        switch(r2) {
            case 1: goto L_0x0025;
            case 2: goto L_0x0022;
            case 3: goto L_0x001f;
            case 4: goto L_0x001c;
            default: goto L_0x0016;
        };
    L_0x0016:
        r2 = 1;
        r2 = new android.graphics.Bitmap.Config[r2];
        r2[r3] = r12;
        goto L_0x0027;
    L_0x001c:
        r2 = d;
        goto L_0x0027;
    L_0x001f:
        r2 = c;
        goto L_0x0027;
    L_0x0022:
        r2 = b;
        goto L_0x0027;
    L_0x0025:
        r2 = a;
    L_0x0027:
        r4 = r2.length;
    L_0x0028:
        if (r3 >= r4) goto L_0x0068;
    L_0x002a:
        r5 = r2[r3];
        r6 = r9.a(r5);
        r7 = java.lang.Integer.valueOf(r0);
        r6 = r6.ceilingKey(r7);
        r6 = (java.lang.Integer) r6;
        if (r6 == 0) goto L_0x0065;
    L_0x003c:
        r7 = r6.intValue();
        r8 = r0 * 8;
        if (r7 > r8) goto L_0x0065;
    L_0x0044:
        r2 = r6.intValue();
        if (r2 != r0) goto L_0x0055;
    L_0x004a:
        if (r5 != 0) goto L_0x004f;
    L_0x004c:
        if (r12 == 0) goto L_0x0068;
    L_0x004e:
        goto L_0x0055;
    L_0x004f:
        r12 = r5.equals(r12);
        if (r12 != 0) goto L_0x0068;
    L_0x0055:
        r12 = r9.e;
        r12.a(r1);
        r12 = r9.e;
        r0 = r6.intValue();
        r1 = r12.a(r0, r5);
        goto L_0x0068;
    L_0x0065:
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x0068:
        r12 = r9.f;
        r12 = r12.a(r1);
        r12 = (android.graphics.Bitmap) r12;
        if (r12 == 0) goto L_0x0091;
    L_0x0072:
        r0 = defpackage.nw.a(r12);
        r0 = java.lang.Integer.valueOf(r0);
        r1 = r12.getConfig();
        r9.a(r0, r1);
        r0 = r12.getConfig();
        if (r0 == 0) goto L_0x008c;
    L_0x0087:
        r0 = r12.getConfig();
        goto L_0x008e;
    L_0x008c:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
    L_0x008e:
        r12.reconfigure(r10, r11, r0);
    L_0x0091:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final void a(Bitmap bitmap) {
        gl a = this.e.a(nw.a(bitmap), bitmap.getConfig());
        this.f.a(a, bitmap);
        NavigableMap a2 = a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.b));
        Integer valueOf = Integer.valueOf(a.b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    public final String b(int i, int i2, Config config) {
        return gj.b(nw.a(i, i2, config), config);
    }

    public final String b(Bitmap bitmap) {
        return gj.b(nw.a(bitmap), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap) {
        return nw.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.g.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.g.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), BuildConfig.FLAVOR);
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}
