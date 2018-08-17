package defpackage;

import java.io.File;
import java.io.FilenameFilter;

final class sd implements FilenameFilter {
    private final String a;

    public sd(String str) {
        this.a = str;
    }

    public final boolean accept(File file, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".cls");
        return (str.equals(stringBuilder.toString()) || !str.contains(this.a) || str.endsWith(".cls_temp")) ? false : true;
    }
}
