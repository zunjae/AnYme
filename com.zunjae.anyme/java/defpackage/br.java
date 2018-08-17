package defpackage;

final class br {
    private az a;
    private az b;
    private int c;
    private int d;
    private int e;

    public br(az azVar) {
        this.a = azVar;
        this.b = azVar.c;
        this.c = azVar.d();
        this.d = azVar.e();
        this.e = azVar.g();
    }

    public final void a(be beVar) {
        int g;
        this.a = beVar.a(this.a.b);
        az azVar = this.a;
        if (azVar != null) {
            this.b = azVar.c;
            this.c = azVar.d();
            this.d = this.a.e();
            g = this.a.g();
        } else {
            this.b = null;
            g = 0;
            this.c = 0;
            this.d = bc.b;
        }
        this.e = g;
    }

    public final void b(be beVar) {
        beVar.a(this.a.b).a(this.b, this.c, this.d, this.e);
    }
}
