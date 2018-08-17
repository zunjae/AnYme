package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class bcl implements bay {
    final bch a;
    final beh b;
    final bcn c;
    final boolean d;
    private bbq e;
    private boolean f;

    private bcl(bch bch, bcn bcn, boolean z) {
        this.a = bch;
        this.c = bcn;
        this.d = z;
        this.b = new beh(bch, z);
    }

    static bcl a(bch bch, bcn bcn, boolean z) {
        bcl bcl = new bcl(bch, bcn, z);
        bcl.e = bch.i.a();
        return bcl;
    }

    public final bcs a() {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        this.b.a(bgo.c().a("response.body().close()"));
        try {
            this.a.c.a(this);
            bcs c = c();
            if (c != null) {
                this.a.c.b(this);
                return c;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            this.a.c.b(this);
        }
    }

    public final void b() {
        this.b.a();
    }

    final bcs c() {
        List arrayList = new ArrayList();
        arrayList.addAll(this.a.g);
        arrayList.add(this.b);
        arrayList.add(new bdw(this.a.k));
        arrayList.add(new bde(this.a.e()));
        arrayList.add(new bdn(this.a));
        if (!this.d) {
            arrayList.addAll(this.a.h);
        }
        arrayList.add(new bdx(this.d));
        bcn bcn = this.c;
        bbq bbq = this.e;
        bch bch = this.a;
        return new bee(arrayList, null, null, null, 0, bcn, this, bbq, bch.z, bch.A, bch.B).a(this.c);
    }

    public final /* synthetic */ Object clone() {
        return bcl.a(this.a, this.c, this.d);
    }
}
