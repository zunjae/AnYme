package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public final class ev extends et<InputStream> {
    public ev(Context context, Uri uri) {
        super(context, uri);
    }

    protected final /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openInputStream(uri);
    }

    protected final /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }
}
