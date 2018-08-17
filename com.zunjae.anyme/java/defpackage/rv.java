package defpackage;

import java.io.File;
import java.io.FilenameFilter;

final class rv implements FilenameFilter {
    rv() {
    }

    public final boolean accept(File file, String str) {
        if (!qa.a.accept(file, str)) {
            if (!str.contains("SessionMissingBinaryImages")) {
                return false;
            }
        }
        return true;
    }
}
