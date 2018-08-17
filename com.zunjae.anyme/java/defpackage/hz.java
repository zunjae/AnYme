package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public class hz {
    private final InputStream a;
    private final ParcelFileDescriptor b;

    public hz(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = inputStream;
        this.b = parcelFileDescriptor;
    }

    public final InputStream a() {
        return this.a;
    }

    public final ParcelFileDescriptor b() {
        return this.b;
    }
}
