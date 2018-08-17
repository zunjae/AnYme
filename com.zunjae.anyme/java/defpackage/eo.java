package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class eo extends el<ParcelFileDescriptor> {
    public eo(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    protected final /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    protected final /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
