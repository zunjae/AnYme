package defpackage;

import java.util.ArrayList;

public final class bq {
    private int a;
    private int b;
    private int c;
    private int d;
    private ArrayList<br> e = new ArrayList();

    public bq(be beVar) {
        this.a = beVar.l();
        this.b = beVar.m();
        this.c = beVar.n();
        this.d = beVar.p();
        ArrayList A = beVar.A();
        int size = A.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new br((az) A.get(i)));
        }
    }

    public final void a(be beVar) {
        this.a = beVar.l();
        this.b = beVar.m();
        this.c = beVar.n();
        this.d = beVar.p();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((br) this.e.get(i)).a(beVar);
        }
    }

    public final void b(be beVar) {
        beVar.f(this.a);
        beVar.g(this.b);
        beVar.h(this.c);
        beVar.i(this.d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((br) this.e.get(i)).b(beVar);
        }
    }
}
