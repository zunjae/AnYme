package defpackage;

import java.io.File;
import java.io.FilenameFilter;

final class ra implements FilenameFilter {
    ra() {
    }

    public final boolean accept(File file, String str) {
        return str.length() == 39 && str.endsWith(".cls");
    }
}
