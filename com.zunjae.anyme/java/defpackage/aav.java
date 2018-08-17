package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class aav extends wz<wo> {
    aav() {
    }

    private void a(abq abq, wo woVar) {
        if (woVar != null) {
            if (!(woVar instanceof wq)) {
                if (woVar instanceof wt) {
                    wt g = woVar.g();
                    if (g.i()) {
                        abq.a(g.a());
                        return;
                    } else if (g.h()) {
                        abq.a(g.f());
                        return;
                    } else {
                        abq.b(g.b());
                        return;
                    }
                }
                boolean z = woVar instanceof wm;
                Iterator it;
                if (z) {
                    abq.b();
                    if (z) {
                        it = ((wm) woVar).iterator();
                        while (it.hasNext()) {
                            a(abq, (wo) it.next());
                        }
                        abq.c();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(woVar)));
                }
                z = woVar instanceof wr;
                if (z) {
                    abq.d();
                    if (z) {
                        for (Entry entry : ((wr) woVar).h()) {
                            abq.a((String) entry.getKey());
                            a(abq, (wo) entry.getValue());
                        }
                        abq.e();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(woVar)));
                }
                StringBuilder stringBuilder = new StringBuilder("Couldn't write ");
                stringBuilder.append(woVar.getClass());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        abq.f();
    }

    private wo b(abn abn) {
        wo wmVar;
        switch (abd.a[abn.f().ordinal()]) {
            case tw.a /*1*/:
                return new wt(new ye(abn.h()));
            case tw.b /*2*/:
                return new wt(Boolean.valueOf(abn.i()));
            case f.c /*3*/:
                return new wt(abn.h());
            case mh.d /*4*/:
                abn.j();
                return wq.a;
            case mh.e /*5*/:
                wmVar = new wm();
                abn.a();
                while (abn.e()) {
                    wmVar.a(b(abn));
                }
                abn.b();
                return wmVar;
            case mh.f /*6*/:
                wmVar = new wr();
                abn.c();
                while (abn.e()) {
                    wmVar.a(abn.g(), b(abn));
                }
                abn.d();
                return wmVar;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return b(abn);
    }
}
