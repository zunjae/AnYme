package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

public final class eu extends el<InputStream> {
    public eu(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    protected final /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    protected final /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }
}
