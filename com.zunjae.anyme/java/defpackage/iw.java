package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class iw extends in<ParcelFileDescriptor> implements ir<Uri> {
    public iw(Context context, ii<hu, ParcelFileDescriptor> iiVar) {
        super(context, iiVar);
    }

    protected final en<ParcelFileDescriptor> a(Context context, Uri uri) {
        return new ep(context, uri);
    }

    protected final en<ParcelFileDescriptor> a(Context context, String str) {
        return new eo(context.getApplicationContext().getAssets(), str);
    }
}
