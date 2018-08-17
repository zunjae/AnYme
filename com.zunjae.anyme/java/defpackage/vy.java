package defpackage;

import java.lang.reflect.Field;

enum vy extends vx {
    vy(String str, int i) {
        super(str, i);
    }

    public final String translateName(Field field) {
        return field.getName();
    }
}
