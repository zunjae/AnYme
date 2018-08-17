package defpackage;

import android.os.Looper;

final class aiy implements aiw {
    aiy() {
    }

    public final void a(ail ail) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder stringBuilder = new StringBuilder("Event bus ");
            stringBuilder.append(ail);
            stringBuilder.append(" accessed from non-main thread ");
            stringBuilder.append(Looper.myLooper());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
