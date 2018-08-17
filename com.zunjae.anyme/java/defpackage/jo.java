package defpackage;

import java.io.OutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class jo<T> implements ej<T> {
    private static final jo<?> a = new jo();

    public static <T> jo<T> b() {
        return a;
    }

    public final String a() {
        return BuildConfig.FLAVOR;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        return false;
    }
}
