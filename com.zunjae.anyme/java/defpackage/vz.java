package defpackage;

import java.lang.reflect.Field;

enum vz extends vx {
    vz(String str, int i) {
        super(str, i);
    }

    public final String translateName(Field field) {
        return vx.upperCaseFirstLetter(field.getName());
    }
}
