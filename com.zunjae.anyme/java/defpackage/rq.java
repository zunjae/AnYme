package defpackage;

import java.io.File;
import java.io.FilenameFilter;

final class rq implements FilenameFilter {
    private rq() {
    }

    public final boolean accept(File file, String str) {
        return !qp.b.accept(file, str) && qp.f.matcher(str).matches();
    }
}
