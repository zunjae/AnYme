package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.m;

public final class lb implements ld<ks, js> {
    private final ld<Bitmap, m> a;

    public lb(ld<Bitmap, m> ldVar) {
        this.a = ldVar;
    }

    public final ft<js> a(ft<ks> ftVar) {
        ks ksVar = (ks) ftVar.b();
        ft b = ksVar.b();
        return b != null ? this.a.a(b) : ksVar.c();
    }

    public final String a() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
