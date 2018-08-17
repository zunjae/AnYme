package defpackage;

import java.util.ArrayList;

public class bs extends be {
    protected ArrayList<be> am = new ArrayList();

    public final void B() {
        super.B();
        ArrayList arrayList = this.am;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                be beVar = (be) this.am.get(i);
                beVar.b(r(), s());
                if (!(beVar instanceof bh)) {
                    beVar.B();
                }
            }
        }
    }

    public void J() {
        B();
        ArrayList arrayList = this.am;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                be beVar = (be) this.am.get(i);
                if (beVar instanceof bs) {
                    ((bs) beVar).J();
                }
            }
        }
    }

    public final void M() {
        this.am.clear();
    }

    public final void a(am amVar) {
        super.a(amVar);
        int size = this.am.size();
        for (int i = 0; i < size; i++) {
            ((be) this.am.get(i)).a(amVar);
        }
    }

    public final void a(be beVar) {
        this.am.add(beVar);
        be beVar2 = beVar.C;
        if (beVar2 != null) {
            ((bs) beVar2).b(beVar);
        }
        beVar.C = this;
    }

    public final void b(int i, int i2) {
        super.b(i, i2);
        i = this.am.size();
        for (i2 = 0; i2 < i; i2++) {
            ((be) this.am.get(i2)).b(t(), u());
        }
    }

    public final void b(be beVar) {
        this.am.remove(beVar);
        beVar.C = null;
    }

    public void f() {
        this.am.clear();
        super.f();
    }
}
