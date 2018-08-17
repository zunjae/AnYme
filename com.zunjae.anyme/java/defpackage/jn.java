package defpackage;

import java.io.OutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class jn<T> implements ef<T> {
    private static final jn<?> a = new jn();

    public static <T> ef<T> b() {
        return a;
    }

    public final String a() {
        return BuildConfig.FLAVOR;
    }

    public final boolean a(T t, OutputStream outputStream) {
        return false;
    }
}
