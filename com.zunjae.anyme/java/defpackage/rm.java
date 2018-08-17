package defpackage;

import java.io.File;
import java.util.Comparator;

final class rm implements Comparator<File> {
    rm() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
