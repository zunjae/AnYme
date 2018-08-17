package defpackage;

import java.lang.reflect.Field;

enum wa extends vx {
    wa(String str, int i) {
        super(str, i);
    }

    public final String translateName(Field field) {
        return vx.upperCaseFirstLetter(vx.separateCamelCase(field.getName(), " "));
    }
}
