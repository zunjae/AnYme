package defpackage;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class uf implements px {
    uf() {
    }

    private static String a(String str) {
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                str = awj.b((InputStream) bufferedInputStream);
                awj.b(bufferedInputStream);
                return str;
            } catch (Throwable th2) {
                th = th2;
                closeable = bufferedInputStream;
                awj.b(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            awj.b(closeable);
            throw th;
        }
    }

    public final String a(File file) {
        return uf.a(file.getPath());
    }
}
