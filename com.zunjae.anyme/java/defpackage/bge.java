package defpackage;

import java.io.File;
import java.io.IOException;

final class bge implements bgd {
    bge() {
    }

    public final void a(File file) {
        if (!file.delete()) {
            if (file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }
    }
}
