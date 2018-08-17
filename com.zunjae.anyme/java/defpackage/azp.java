package defpackage;

import android.content.Context;
import java.io.File;

public final class azp implements azo {
    private final Context a;
    private final String b;
    private final String c;

    public azp(avp avp) {
        if (avp.m() != null) {
            this.a = avp.m();
            this.b = avp.o();
            StringBuilder stringBuilder = new StringBuilder("Android/");
            stringBuilder.append(this.a.getPackageName());
            this.c = stringBuilder.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public final File a() {
        File filesDir = this.a.getFilesDir();
        if (filesDir != null && (filesDir.exists() || filesDir.mkdirs())) {
            return filesDir;
        }
        avf.c();
        return null;
    }
}
