package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

final class fw implements gh {
    private final fy a = new fy();
    private final gc<fx, Bitmap> b = new gc();

    fw() {
    }

    private static String d(int i, int i2, Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("], ");
        stringBuilder.append(config);
        return stringBuilder.toString();
    }

    public final Bitmap a() {
        return (Bitmap) this.b.a();
    }

    public final Bitmap a(int i, int i2, Config config) {
        return (Bitmap) this.b.a(this.a.a(i, i2, config));
    }

    public final void a(Bitmap bitmap) {
        this.b.a(this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public final String b(int i, int i2, Config config) {
        return fw.d(i, i2, config);
    }

    public final String b(Bitmap bitmap) {
        return fw.d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap) {
        return nw.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AttributeStrategy:\n  ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
