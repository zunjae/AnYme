package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class zn implements xb {
    private final xm a;
    private final wd b;
    private final yb c;
    private final zd d;

    public zn(xm xmVar, wd wdVar, yb ybVar, zd zdVar) {
        this.a = xmVar;
        this.b = wdVar;
        this.c = ybVar;
        this.d = zdVar;
    }

    private List<String> a(Field field) {
        xe xeVar = (xe) field.getAnnotation(xe.class);
        if (xeVar == null) {
            return Collections.singletonList(this.b.translateName(field));
        }
        String a = xeVar.a();
        String[] b = xeVar.b();
        if (b.length == 0) {
            return Collections.singletonList(a);
        }
        List<String> arrayList = new ArrayList(b.length + 1);
        arrayList.add(a);
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    private Map<String, zq> a(we weVar, abm<?> abm_, Class<?> cls) {
        zn znVar = this;
        we weVar2 = weVar;
        Map<String, zq> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = abm_.b();
        abm abm = abm_;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Class cls3;
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                int i2;
                int i3;
                Field[] fieldArr;
                zq zqVar;
                Field field = declaredFields[i];
                boolean a = znVar.a(field, true);
                boolean a2 = znVar.a(field, z);
                if (!a) {
                    if (!a2) {
                        i2 = i;
                        i3 = length;
                        fieldArr = declaredFields;
                        cls3 = cls2;
                        i = i2 + 1;
                        cls2 = cls3;
                        length = i3;
                        declaredFields = fieldArr;
                        z = false;
                        znVar = this;
                        weVar2 = weVar;
                    }
                }
                field.setAccessible(true);
                Type a3 = xi.a(abm.b(), cls2, field.getGenericType());
                List a4 = znVar.a(field);
                int size = a4.size();
                zq zqVar2 = null;
                int i4 = 0;
                while (i4 < size) {
                    cls3 = cls2;
                    String str = (String) a4.get(i4);
                    boolean z2 = i4 != 0 ? false : a;
                    abm a5 = abm.a(a3);
                    boolean a6 = yo.a(a5.a());
                    xd xdVar = (xd) field.getAnnotation(xd.class);
                    wz a7 = xdVar != null ? zd.a(znVar.a, weVar2, a5, xdVar) : null;
                    z = a7 != null;
                    if (a7 == null) {
                        a7 = weVar2.a(a5);
                    }
                    zqVar = zqVar2;
                    int i5 = i4;
                    int i6 = size;
                    List list = a4;
                    zo zoVar = r0;
                    Field field2 = field;
                    i2 = i;
                    i3 = length;
                    fieldArr = declaredFields;
                    zo zoVar2 = new zo(this, str, z2, a2, field, z, a7, weVar, a5, a6);
                    zqVar2 = zqVar == null ? (zq) linkedHashMap.put(str, zoVar) : zqVar;
                    i4 = i5 + 1;
                    a = z2;
                    cls2 = cls3;
                    length = i3;
                    declaredFields = fieldArr;
                    size = i6;
                    a4 = list;
                    field = field2;
                    i = i2;
                    znVar = this;
                    weVar2 = weVar;
                }
                zqVar = zqVar2;
                i2 = i;
                i3 = length;
                fieldArr = declaredFields;
                cls3 = cls2;
                if (zqVar == null) {
                    i = i2 + 1;
                    cls2 = cls3;
                    length = i3;
                    declaredFields = fieldArr;
                    z = false;
                    znVar = this;
                    weVar2 = weVar;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b);
                    stringBuilder.append(" declares multiple JSON fields named ");
                    stringBuilder.append(zqVar.h);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            cls3 = cls2;
            abm = abm.a(xi.a(abm.b(), cls3, cls3.getGenericSuperclass()));
            cls2 = abm.a();
            znVar = this;
            weVar2 = weVar;
        }
        return linkedHashMap;
    }

    private boolean a(Field field, boolean z) {
        yb ybVar = this.c;
        return (ybVar.a(field.getType(), z) || ybVar.a(field, z)) ? false : true;
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Class a = abm_T.a();
        return !Object.class.isAssignableFrom(a) ? null : new zp(this.a.a((abm) abm_T), a(weVar, abm_T, a));
    }
}
