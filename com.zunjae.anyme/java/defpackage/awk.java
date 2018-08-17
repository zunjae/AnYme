package defpackage;

import java.io.File;
import java.util.Comparator;

final class awk implements Comparator<File> {
    awk() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
    }
}
