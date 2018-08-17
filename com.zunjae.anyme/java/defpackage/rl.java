package defpackage;

import java.io.File;
import java.util.Comparator;

final class rl implements Comparator<File> {
    rl() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
