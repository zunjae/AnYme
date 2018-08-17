package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.Log;

public final class hc {
    private final int a;
    private final int b;
    private final Context c;

    public hc(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new hd(context.getResources().getDisplayMetrics()));
    }

    private hc(Context context, ActivityManager activityManager, he heVar) {
        this.c = context;
        int round = Math.round(((float) ((activityManager.getMemoryClass() * 1024) * 1024)) * (hc.a(activityManager) ? 0.33f : 0.4f));
        int a = (heVar.a() * heVar.b()) * 4;
        int i = a * 4;
        a *= 2;
        int i2 = a + i;
        if (i2 <= round) {
            this.b = a;
        } else {
            i = Math.round(((float) round) / 6.0f);
            this.b = i * 2;
            i *= 4;
        }
        this.a = i;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder stringBuilder = new StringBuilder("Calculated memory cache size: ");
            stringBuilder.append(a(this.b));
            stringBuilder.append(" pool size: ");
            stringBuilder.append(a(this.a));
            stringBuilder.append(" memory class limited? ");
            stringBuilder.append(i2 > round);
            stringBuilder.append(" max size: ");
            stringBuilder.append(a(round));
            stringBuilder.append(" memoryClass: ");
            stringBuilder.append(activityManager.getMemoryClass());
            stringBuilder.append(" isLowMemoryDevice: ");
            stringBuilder.append(hc.a(activityManager));
        }
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.c, (long) i);
    }

    @TargetApi(19)
    private static boolean a(ActivityManager activityManager) {
        int i = VERSION.SDK_INT;
        return i >= 19 ? activityManager.isLowRamDevice() : i < 11;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}
