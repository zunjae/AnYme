package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class ep extends et<ParcelFileDescriptor> {
    public ep(Context context, Uri uri) {
        super(context, uri);
    }

    protected final /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }

    protected final /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
