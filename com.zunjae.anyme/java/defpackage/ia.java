package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

public final class ia implements ef<hz> {
    private final ef<InputStream> a;
    private final ef<ParcelFileDescriptor> b;
    private String c;

    public ia(ef<InputStream> efVar, ef<ParcelFileDescriptor> efVar2) {
        this.a = efVar;
        this.b = efVar2;
    }

    public final String a() {
        if (this.c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.a());
            stringBuilder.append(this.b.a());
            this.c = stringBuilder.toString();
        }
        return this.c;
    }

    public final /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        ef efVar;
        hz hzVar = (hz) obj;
        if (hzVar.a() != null) {
            efVar = this.a;
            obj = hzVar.a();
        } else {
            efVar = this.b;
            obj = hzVar.b();
        }
        return efVar.a(obj, outputStream);
    }
}
