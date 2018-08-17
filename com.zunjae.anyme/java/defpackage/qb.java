package defpackage;

import java.io.File;
import java.io.FilenameFilter;

final class qb implements FilenameFilter {
    qb() {
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(".cls_temp");
    }
}
