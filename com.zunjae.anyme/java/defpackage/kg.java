package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;

final class kg extends ne<Bitmap> {
    private final Handler a;
    private final int b;
    private final long c;
    private Bitmap d;

    public kg(Handler handler, int i, long j) {
        this.a = handler;
        this.b = i;
        this.c = j;
    }

    public final Bitmap a() {
        return this.d;
    }

    public final /* synthetic */ void a(Object obj, mq mqVar) {
        this.d = (Bitmap) obj;
        this.a.sendMessageAtTime(this.a.obtainMessage(1, this), this.c);
    }
}
