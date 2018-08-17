package defpackage;

import android.net.Uri;
import java.io.File;

public class hr<T> implements ii<File, T> {
    private final ii<Uri, T> a;

    public hr(ii<Uri, T> iiVar) {
        this.a = iiVar;
    }

    public final /* synthetic */ en a(Object obj, int i, int i2) {
        return this.a.a(Uri.fromFile((File) obj), i, i2);
    }
}
