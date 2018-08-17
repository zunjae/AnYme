package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

final class qu implements FilenameFilter {
    final /* synthetic */ Set a;
    final /* synthetic */ qp b;

    qu(qp qpVar, Set set) {
        this.b = qpVar;
        this.a = set;
    }

    public final boolean accept(File file, String str) {
        return str.length() < 35 ? false : this.a.contains(str.substring(0, 35));
    }
}
