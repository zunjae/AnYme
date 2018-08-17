package defpackage;

import android.util.TypedValue;
import android.view.View;

public final class ct {
    private static final TypedValue a = new TypedValue();

    public static View a(View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        String a = ct.a(view, i);
        StringBuilder stringBuilder = new StringBuilder("Required view '");
        stringBuilder.append(a);
        stringBuilder.append("' with ID ");
        stringBuilder.append(i);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static <T> T a(View view, int i, String str, Class<T> cls) {
        return ct.b(ct.a(view, i, str), i, str, cls);
    }

    public static <T> T a(Object obj, String str, String str2, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Parameter #1 of method '");
            stringBuilder.append(str);
            stringBuilder.append("' was of the wrong type for parameter #1 of method '");
            stringBuilder.append(str2);
            stringBuilder.append("'. See cause for more info.");
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }

    private static String a(View view, int i) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i);
    }

    public static <T> T b(View view, int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (Throwable e) {
            String a = ct.a(view, i);
            StringBuilder stringBuilder = new StringBuilder("View '");
            stringBuilder.append(a);
            stringBuilder.append("' with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" for ");
            stringBuilder.append(str);
            stringBuilder.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }
}
