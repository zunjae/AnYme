package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;

public final class avi {
    private final Context a;
    private avp[] b;
    private aye c;
    private Handler d;
    private avs e;
    private boolean f;
    private String g;
    private String h;
    private avl<avf> i;

    public avi(Context context) {
        if (context != null) {
            this.a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public final avf a() {
        if (this.c == null) {
            this.c = aye.a();
        }
        if (this.d == null) {
            this.d = new Handler(Looper.getMainLooper());
        }
        if (this.e == null) {
            this.e = this.f ? new ave() : new ave((byte) 0);
        }
        if (this.h == null) {
            this.h = this.a.getPackageName();
        }
        if (this.i == null) {
            this.i = avl.d;
        }
        avp[] avpArr = this.b;
        HashMap hashMap = avpArr == null ? new HashMap() : avf.a(Arrays.asList(avpArr));
        Context applicationContext = this.a.getApplicationContext();
        return new avf(applicationContext, hashMap, this.c, this.d, this.e, this.f, this.i, new aww(applicationContext, this.h, this.g, hashMap.values()), avf.a(this.a));
    }

    public final avi a(avp... avpArr) {
        if (this.b == null) {
            this.b = avpArr;
            return this;
        }
        throw new IllegalStateException("Kits already set.");
    }
}
