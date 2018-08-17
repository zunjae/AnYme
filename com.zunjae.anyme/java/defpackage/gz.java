package defpackage;

import android.annotation.SuppressLint;

public final class gz extends nt<eg, ft<?>> implements ha {
    private hb a;

    public gz(int i) {
        super(i);
    }

    protected final /* synthetic */ int a(Object obj) {
        return ((ft) obj).c();
    }

    public final /* synthetic */ ft a(eg egVar) {
        return (ft) super.c(egVar);
    }

    public final /* synthetic */ ft a(eg egVar, ft ftVar) {
        return (ft) super.b(egVar, ftVar);
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        if (i >= 60) {
            a();
            return;
        }
        if (i >= 40) {
            b(b() / 2);
        }
    }

    public final void a(hb hbVar) {
        this.a = hbVar;
    }

    protected final /* synthetic */ void a(Object obj, Object obj2) {
        ft ftVar = (ft) obj2;
        hb hbVar = this.a;
        if (hbVar != null) {
            hbVar.b(ftVar);
        }
    }
}
