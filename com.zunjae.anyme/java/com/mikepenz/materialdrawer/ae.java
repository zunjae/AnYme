package com.mikepenz.materialdrawer;

import com.mikepenz.fastadapter.b;
import defpackage.abw;
import defpackage.aet;
import defpackage.aev;
import defpackage.aex;
import defpackage.aey;
import defpackage.afc;
import defpackage.afi;
import defpackage.afj;

public final class ae {
    protected b<afi> a;
    protected abw<afi> b;
    private o c;
    private a d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;

    public final ae a(a aVar) {
        this.d = aVar;
        return this;
    }

    public final ae a(o oVar) {
        this.c = oVar;
        return this;
    }

    public final void a() {
        a aVar = this.d;
        if (aVar != null) {
            afj c = aVar.c();
            if (c instanceof afi) {
                abw abw = this.b;
                afi afi = (afi) c;
                Object obj = null;
                if (afi instanceof afc) {
                    if (this.g) {
                        obj = (aet) new aet((afc) afi).d(this.h).k();
                    }
                } else if (afi instanceof aex) {
                    obj = (afi) new aet((aex) afi).d(this.h).k();
                } else if (afi instanceof aey) {
                    obj = new aev((aey) afi);
                    obj.c(this.i);
                }
                abw.b(0, obj);
            }
        }
    }

    public final void a(long j) {
        if (j == -1) {
            this.a.h();
        }
        int itemCount = this.a.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            afi afi = (afi) this.a.b(i);
            if (afi.c() == j && !afi.e()) {
                this.a.h();
                this.a.g(i);
            }
        }
    }
}
