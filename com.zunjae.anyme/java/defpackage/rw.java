package defpackage;

import java.io.File;

final class rw implements te {
    private final azo a;

    public rw(azo azo) {
        this.a = azo;
    }

    public final File a() {
        File file = new File(this.a.a(), "log-files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
