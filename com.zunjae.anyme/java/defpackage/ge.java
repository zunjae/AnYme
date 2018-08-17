package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ge implements ga {
    private static final Config a = Config.ARGB_8888;
    private final gh b;
    private final Set<Config> c;
    private final int d;
    private final gf e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public ge(int i) {
        gh gjVar = VERSION.SDK_INT >= 19 ? new gj() : new fw();
        Set hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        this(i, gjVar, Collections.unmodifiableSet(hashSet));
    }

    private ge(int i, gh ghVar, Set<Config> set) {
        this.d = i;
        this.f = i;
        this.b = ghVar;
        this.c = set;
        this.e = new gg();
    }

    private void b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            c();
        }
    }

    private synchronized void b(int i) {
        while (this.g > i) {
            Bitmap a = this.b.a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    c();
                }
                this.g = 0;
                return;
            }
            this.g -= this.b.c(a);
            a.recycle();
            this.k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Evicting bitmap=").append(this.b.b(a));
            }
            b();
        }
    }

    private void c() {
        StringBuilder stringBuilder = new StringBuilder("Hits=");
        stringBuilder.append(this.h);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.i);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.j);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.k);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.g);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.f);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.b);
    }

    public final synchronized Bitmap a(int i, int i2, Config config) {
        Bitmap b;
        b = b(i, i2, config);
        if (b != null) {
            b.eraseColor(0);
        }
        return b;
    }

    public final void a() {
        b(0);
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        if (i >= 60) {
            b(0);
            return;
        }
        if (i >= 40) {
            b(this.f / 2);
        }
    }

    public final synchronized boolean a(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isMutable() && this.b.c(bitmap) <= this.f) {
                if (this.c.contains(bitmap.getConfig())) {
                    int c = this.b.c(bitmap);
                    this.b.a(bitmap);
                    this.j++;
                    this.g += c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        new StringBuilder("Put bitmap in pool=").append(this.b.b(bitmap));
                    }
                    b();
                    b(this.f);
                    return true;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder stringBuilder = new StringBuilder("Reject bitmap from pool, bitmap: ");
                stringBuilder.append(this.b.b(bitmap));
                stringBuilder.append(", is mutable: ");
                stringBuilder.append(bitmap.isMutable());
                stringBuilder.append(", is allowed config: ");
                stringBuilder.append(this.c.contains(bitmap.getConfig()));
            }
            return false;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @TargetApi(12)
    public final synchronized Bitmap b(int i, int i2, Config config) {
        Bitmap a;
        a = this.b.a(i, i2, config != null ? config : a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Missing bitmap=").append(this.b.b(i, i2, config));
            }
            this.i++;
        } else {
            this.h++;
            this.g -= this.b.c(a);
            if (VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            new StringBuilder("Get bitmap=").append(this.b.b(i, i2, config));
        }
        b();
        return a;
    }
}
