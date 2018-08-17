package defpackage;

import android.content.Context;

public final class dd<ModelType, DataType, ResourceType> extends db<ModelType, DataType, ResourceType, ResourceType> {
    private final ii<ModelType, DataType> g;
    private final Class<DataType> h;
    private final Class<ResourceType> i;
    private final dm j;

    dd(Context context, de deVar, Class<ModelType> cls, ii<ModelType, DataType> iiVar, Class<DataType> cls2, Class<ResourceType> cls3, lv lvVar, lo loVar, dm dmVar) {
        ii<ModelType, DataType> iiVar2 = iiVar;
        Class cls4 = cls2;
        Class cls5 = cls3;
        de deVar2 = deVar;
        super(context, cls, new me(iiVar2, lf.b(), deVar.b(cls4, cls5)), cls3, deVar2, lvVar, loVar);
        this.g = iiVar2;
        this.h = cls4;
        this.i = cls5;
        this.j = dmVar;
    }
}
