package defpackage;

import android.os.Build;
import java.util.Map;

final class rg implements rr {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Map f;
    final /* synthetic */ int g;
    final /* synthetic */ qp h;

    rg(qp qpVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
        this.h = qpVar;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = map;
        this.g = i3;
    }

    public final void a(qc qcVar) {
        ud.a(qcVar, this.a, Build.MODEL, this.b, this.c, this.d, this.e, this.f, this.g, Build.MANUFACTURER, Build.PRODUCT);
    }
}
