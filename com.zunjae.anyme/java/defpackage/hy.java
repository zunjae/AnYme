package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

final class hy implements en<hz> {
    private final en<InputStream> a;
    private final en<ParcelFileDescriptor> b;

    public hy(en<InputStream> enVar, en<ParcelFileDescriptor> enVar2) {
        this.a = enVar;
        this.b = enVar2;
    }

    private hz b(int i) {
        InputStream inputStream;
        en enVar;
        ParcelFileDescriptor parcelFileDescriptor;
        en enVar2 = this.a;
        if (enVar2 != null) {
            try {
                inputStream = (InputStream) enVar2.a(i);
            } catch (Exception e) {
                if (this.b == null) {
                    throw e;
                }
            }
            enVar = this.b;
            if (enVar != null) {
                try {
                    parcelFileDescriptor = (ParcelFileDescriptor) enVar.a(i);
                } catch (Exception e2) {
                    if (inputStream == null) {
                        throw e2;
                    }
                }
                return new hz(inputStream, parcelFileDescriptor);
            }
            parcelFileDescriptor = null;
            return new hz(inputStream, parcelFileDescriptor);
        }
        inputStream = null;
        enVar = this.b;
        if (enVar != null) {
            parcelFileDescriptor = (ParcelFileDescriptor) enVar.a(i);
            return new hz(inputStream, parcelFileDescriptor);
        }
        parcelFileDescriptor = null;
        return new hz(inputStream, parcelFileDescriptor);
    }

    public final /* synthetic */ Object a(int i) {
        return b(i);
    }

    public final void a() {
        en enVar = this.a;
        if (enVar != null) {
            enVar.a();
        }
        enVar = this.b;
        if (enVar != null) {
            enVar.a();
        }
    }

    public final String b() {
        en enVar = this.a;
        return enVar != null ? enVar.b() : this.b.b();
    }

    public final void c() {
        en enVar = this.a;
        if (enVar != null) {
            enVar.c();
        }
        enVar = this.b;
        if (enVar != null) {
            enVar.c();
        }
    }
}
