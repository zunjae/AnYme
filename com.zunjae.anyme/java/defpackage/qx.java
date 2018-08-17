package defpackage;

import java.io.FileOutputStream;
import org.json.JSONObject;

final class qx implements ru {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ qp d;

    qx(qp qpVar, String str, String str2, long j) {
        this.d = qpVar;
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final void a(FileOutputStream fileOutputStream) {
        fileOutputStream.write(new JSONObject(new qy(this)).toString().getBytes());
    }
}
