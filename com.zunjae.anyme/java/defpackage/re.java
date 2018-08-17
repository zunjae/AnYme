package defpackage;

import java.io.FileOutputStream;
import org.json.JSONObject;

final class re implements ru {
    final /* synthetic */ boolean a;
    final /* synthetic */ qp b;

    re(qp qpVar, boolean z) {
        this.b = qpVar;
        this.a = z;
    }

    public final void a(FileOutputStream fileOutputStream) {
        fileOutputStream.write(new JSONObject(new rf(this)).toString().getBytes());
    }
}
