package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.resource.bitmap.c;
import com.bumptech.glide.load.resource.bitmap.t;
import java.io.InputStream;

public final class ku implements ei<hz, ks> {
    private static final kw a = new kw();
    private static final kv b = new kv();
    private final ei<hz, Bitmap> c;
    private final ei<InputStream, ka> d;
    private final ga e;
    private final kw f;
    private final kv g;
    private String h;

    public ku(ei<hz, Bitmap> eiVar, ei<InputStream, ka> eiVar2, ga gaVar) {
        this(eiVar, eiVar2, gaVar, a, b);
    }

    private ku(ei<hz, Bitmap> eiVar, ei<InputStream, ka> eiVar2, ga gaVar, kw kwVar, kv kvVar) {
        this.c = eiVar;
        this.d = eiVar2;
        this.e = gaVar;
        this.f = kwVar;
        this.g = kvVar;
    }

    private ft<ks> a(hz hzVar, int i, int i2) {
        np a = np.a();
        byte[] b = a.b();
        try {
            ks ksVar;
            if (hzVar.a() != null) {
                t tVar = new t(hzVar.a(), b);
                tVar.mark(2048);
                ImageType a2 = new ImageHeaderParser(tVar).a();
                tVar.reset();
                if (a2 == ImageType.GIF) {
                    ft a3 = this.d.a(tVar, i, i2);
                    if (a3 != null) {
                        ka kaVar = (ka) a3.b();
                        ksVar = kaVar.e() > 1 ? new ks(null, a3) : new ks(new c(kaVar.b(), this.e), null);
                        if (ksVar == null) {
                            ksVar = b(new hz(tVar, hzVar.b()), i, i2);
                        }
                    }
                }
                ksVar = null;
                if (ksVar == null) {
                    ksVar = b(new hz(tVar, hzVar.b()), i, i2);
                }
            } else {
                ksVar = b(hzVar, i, i2);
            }
            a.a(b);
            return ksVar != null ? new kt(ksVar) : null;
        } catch (Throwable th) {
            a.a(b);
        }
    }

    private ks b(hz hzVar, int i, int i2) {
        ft a = this.c.a(hzVar, i, i2);
        return a != null ? new ks(a, null) : null;
    }

    public final String a() {
        if (this.h == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.a());
            stringBuilder.append(this.c.a());
            this.h = stringBuilder.toString();
        }
        return this.h;
    }
}
