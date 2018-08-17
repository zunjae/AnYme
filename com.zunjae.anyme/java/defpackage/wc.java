package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

enum wc extends vx {
    wc(String str, int i) {
        super(str, i);
    }

    public final String translateName(Field field) {
        return vx.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
    }
}
