package defpackage;

import java.io.FileOutputStream;
import java.util.Map;
import org.json.JSONObject;

final class rh implements ru {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Map f;
    final /* synthetic */ int g;
    final /* synthetic */ qp h;

    rh(qp qpVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
        this.h = qpVar;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = map;
        this.g = i3;
    }

    public final void a(FileOutputStream fileOutputStream) {
        fileOutputStream.write(new JSONObject(new ri(this)).toString().getBytes());
    }
}
