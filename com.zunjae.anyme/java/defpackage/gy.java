package defpackage;

import android.content.Context;
import java.io.File;

final class gy implements gv {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    gy(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final File a() {
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = this.b;
        return str != null ? new File(cacheDir, str) : cacheDir;
    }
}
