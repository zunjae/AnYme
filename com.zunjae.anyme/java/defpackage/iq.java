package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

public final class iq implements ij<File, ParcelFileDescriptor> {
    public final ii<File, ParcelFileDescriptor> a(Context context, hs hsVar) {
        return new ip(hsVar.a(Uri.class, ParcelFileDescriptor.class));
    }
}
