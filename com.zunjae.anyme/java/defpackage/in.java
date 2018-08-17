package defpackage;

import android.content.Context;
import android.net.Uri;

public abstract class in<T> implements ii<Uri, T> {
    private final Context a;
    private final ii<hu, T> b;

    public in(Context context, ii<hu, T> iiVar) {
        this.a = context;
        this.b = iiVar;
    }

    protected abstract en<T> a(Context context, Uri uri);

    protected abstract en<T> a(Context context, String str);

    public final /* synthetic */ en a(Object obj, int i, int i2) {
        Object obj2;
        Uri uri = (Uri) obj;
        String scheme = uri.getScheme();
        if (!("file".equals(scheme) || "content".equals(scheme))) {
            if (!"android.resource".equals(scheme)) {
                obj2 = null;
                if (obj2 != null) {
                    return (this.b == null && ("http".equals(scheme) || "https".equals(scheme))) ? this.b.a(new hu(uri.toString()), i, i2) : null;
                } else {
                    if (hq.a(uri)) {
                        return a(this.a, uri);
                    }
                    return a(this.a, hq.b(uri));
                }
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            if (this.b == null) {
            }
        } else if (hq.a(uri)) {
            return a(this.a, uri);
        } else {
            return a(this.a, hq.b(uri));
        }
    }
}
