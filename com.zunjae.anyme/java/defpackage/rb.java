package defpackage;

import java.io.FileOutputStream;
import org.json.JSONObject;

final class rb implements ru {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ qp f;

    rb(qp qpVar, String str, String str2, String str3, String str4, int i) {
        this.f = qpVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final void a(FileOutputStream fileOutputStream) {
        fileOutputStream.write(new JSONObject(new rc(this)).toString().getBytes());
    }
}
