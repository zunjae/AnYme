package defpackage;

import java.io.File;
import java.io.FilenameFilter;

class rt implements FilenameFilter {
    private final String a;

    public rt(String str) {
        this.a = str;
    }

    public boolean accept(File file, String str) {
        return str.contains(this.a) && !str.endsWith(".cls_temp");
    }
}
