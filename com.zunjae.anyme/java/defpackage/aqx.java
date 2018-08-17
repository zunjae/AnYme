package defpackage;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.b;
import android.arch.persistence.room.c;
import android.arch.persistence.room.k;
import android.arch.persistence.room.s;
import android.arch.persistence.room.t;
import java.util.List;

public final class aqx extends aqw {
    private final k a;
    private final c b;
    private final c c;
    private final b d;
    private final t e;

    public aqx(k kVar) {
        this.a = kVar;
        this.b = new aqy(this, kVar);
        this.c = new aqz(this, kVar);
        this.d = new ara(this, kVar);
        this.e = new arb(this, kVar);
    }

    public final LiveData<List<asp>> a() {
        return new arc(this, s.a("SELECT * from waifus", 0)).a();
    }

    public final void a(asp asp) {
        this.a.g();
        try {
            this.b.a(asp);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void a(List<asp> list) {
        this.a.g();
        try {
            super.a((List) list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    final void b() {
        w b = this.e.b();
        this.a.g();
        try {
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.e.a(b);
        }
    }

    public final void b(asp asp) {
        this.a.g();
        try {
            this.d.a(asp);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    final void b(List<asp> list) {
        this.a.g();
        try {
            this.b.a(list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void c(List<asr> list) {
        this.a.g();
        try {
            this.c.a(list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }
}
