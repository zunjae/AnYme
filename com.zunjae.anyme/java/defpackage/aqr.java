package defpackage;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.c;
import android.arch.persistence.room.k;
import android.arch.persistence.room.s;
import android.arch.persistence.room.t;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

public final class aqr extends aqq {
    private final k a;
    private final c b;
    private final t c;

    public aqr(k kVar) {
        this.a = kVar;
        this.b = new aqs(this, kVar);
        this.c = new aqt(this, kVar);
    }

    public final List<arh> a(long j) {
        s a = s.a("SELECT * FROM characters where animeId = ?", 1);
        a.a(1, j);
        Cursor a2 = this.a.a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("characterURL");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("imageURL");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("animeId");
            List<arh> arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arh arh = new arh(a2.getString(columnIndexOrThrow));
                arh.a(a2.getString(columnIndexOrThrow2));
                arh.b(a2.getString(columnIndexOrThrow3));
                arh.a(a2.getLong(columnIndexOrThrow4));
                arrayList.add(arh);
            }
            return arrayList;
        } finally {
            a2.close();
            a.b();
        }
    }

    public final void a() {
        w b = this.c.b();
        this.a.g();
        try {
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.c.a(b);
        }
    }

    final void a(List<arh> list) {
        this.a.g();
        try {
            this.b.a(list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void a(List<arh> list, long j) {
        this.a.g();
        try {
            super.a(list, j);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final Integer b(long j) {
        s a = s.a("SELECT COUNT(*) FROM characters where animeId = ?", 1);
        a.a(1, j);
        Cursor a2 = this.a.a(a);
        try {
            Integer num = null;
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    num = Integer.valueOf(a2.getInt(0));
                }
            }
            a2.close();
            a.b();
            return num;
        } catch (Throwable th) {
            a2.close();
            a.b();
        }
    }

    public final LiveData<List<arh>> c(long j) {
        s a = s.a("SELECT * FROM characters where animeId = ?", 1);
        a.a(1, j);
        return new aqu(this, a).a();
    }
}
