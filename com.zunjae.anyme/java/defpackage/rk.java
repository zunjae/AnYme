package defpackage;

import java.io.File;
import java.io.FileFilter;

final class rk implements FileFilter {
    rk() {
    }

    public final boolean accept(File file) {
        return file.isDirectory() && file.getName().length() == 35;
    }
}
