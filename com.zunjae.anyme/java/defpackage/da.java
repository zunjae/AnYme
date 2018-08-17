package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class da<ModelType> extends cz<ModelType> {
    private final ii<ModelType, InputStream> g;
    private final ii<ModelType, ParcelFileDescriptor> h;
    private final dm i;

    da(Class<ModelType> cls, ii<ModelType, InputStream> iiVar, ii<ModelType, ParcelFileDescriptor> iiVar2, Context context, de deVar, lv lvVar, lo loVar, dm dmVar) {
        mf mfVar;
        da daVar = this;
        ii<ModelType, InputStream> iiVar3 = iiVar;
        ii<ModelType, ParcelFileDescriptor> iiVar4 = iiVar2;
        de deVar2 = deVar;
        Class cls2 = ks.class;
        Class cls3 = js.class;
        if (iiVar3 == null && iiVar4 == null) {
            mfVar = null;
        } else {
            mfVar = new me(new hx(iiVar, iiVar2), deVar.a(cls2, cls3), deVar.b(hz.class, cls2));
        }
        super(context, cls, mfVar, deVar, lvVar, loVar);
        daVar.g = iiVar3;
        daVar.h = iiVar4;
        daVar.i = dmVar;
    }
}
