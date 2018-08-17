package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.o;

public final class lc implements ld<Bitmap, m> {
    private final Resources a;
    private final ga b;

    public lc(Resources resources, ga gaVar) {
        this.a = resources;
        this.b = gaVar;
    }

    public final ft<m> a(ft<Bitmap> ftVar) {
        return new o(new m(this.a, (Bitmap) ftVar.b()), this.b);
    }

    public final String a() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
