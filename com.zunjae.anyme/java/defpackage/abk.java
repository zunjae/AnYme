package defpackage;

import java.util.HashMap;
import java.util.Map;

final class abk<T extends Enum<T>> extends wz<T> {
    private final Map<String, T> a = new HashMap();
    private final Map<T, String> b = new HashMap();

    public abk(Class<T> cls) {
        try {
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                Object name = enumR.name();
                xe xeVar = (xe) cls.getField(name).getAnnotation(xe.class);
                if (xeVar != null) {
                    name = xeVar.a();
                    for (Object put : xeVar.b()) {
                        this.a.put(put, enumR);
                    }
                }
                this.a.put(name, enumR);
                this.b.put(enumR, name);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return (Enum) this.a.get(abn.h());
        }
        abn.j();
        return null;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Enum enumR = (Enum) obj;
        abq.b(enumR == null ? null : (String) this.b.get(enumR));
    }
}
