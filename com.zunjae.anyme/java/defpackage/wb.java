package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

enum wb extends vx {
    wb(String str, int i) {
        super(str, i);
    }

    public final String translateName(Field field) {
        return vx.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
    }
}
