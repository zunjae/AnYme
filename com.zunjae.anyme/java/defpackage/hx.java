package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class hx<A> implements ii<A, hz> {
    private final ii<A, InputStream> a;
    private final ii<A, ParcelFileDescriptor> b;

    public hx(ii<A, InputStream> iiVar, ii<A, ParcelFileDescriptor> iiVar2) {
        if (iiVar == null) {
            if (iiVar2 == null) {
                throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
            }
        }
        this.a = iiVar;
        this.b = iiVar2;
    }

    public final en<hz> a(A a, int i, int i2) {
        ii iiVar = this.a;
        en a2 = iiVar != null ? iiVar.a(a, i, i2) : null;
        ii iiVar2 = this.b;
        en a3 = iiVar2 != null ? iiVar2.a(a, i, i2) : null;
        if (a2 == null) {
            if (a3 == null) {
                return null;
            }
        }
        return new hy(a2, a3);
    }
}
