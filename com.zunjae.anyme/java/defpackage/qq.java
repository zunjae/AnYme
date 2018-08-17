package defpackage;

import java.io.File;

final class qq extends rt {
    qq(String str) {
        super(str);
    }

    public final boolean accept(File file, String str) {
        return super.accept(file, str) && str.endsWith(".cls");
    }
}
