package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public final class jj extends in<InputStream> implements je<Uri> {
    public jj(Context context, ii<hu, InputStream> iiVar) {
        super(context, iiVar);
    }

    protected final en<InputStream> a(Context context, Uri uri) {
        return new ev(context, uri);
    }

    protected final en<InputStream> a(Context context, String str) {
        return new eu(context.getApplicationContext().getAssets(), str);
    }
}
