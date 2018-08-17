package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class aqu extends d<List<arh>> {
    final /* synthetic */ s c;
    final /* synthetic */ aqr d;
    private g e;

    aqu(aqr aqr, s sVar) {
        this.d = aqr;
        this.c = sVar;
    }

    private List<arh> d() {
        if (this.e == null) {
            this.e = new aqv(this, "characters", new String[0]);
            this.d.a.j().a(this.e);
        }
        Cursor a = this.d.a.a(this.c);
        try {
            int columnIndexOrThrow = a.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("characterURL");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("imageURL");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("animeId");
            List<arh> arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arh arh = new arh(a.getString(columnIndexOrThrow));
                arh.a(a.getString(columnIndexOrThrow2));
                arh.b(a.getString(columnIndexOrThrow3));
                arh.a(a.getLong(columnIndexOrThrow4));
                arrayList.add(arh);
            }
            return arrayList;
        } finally {
            a.close();
        }
    }

    protected final /* synthetic */ Object c() {
        return d();
    }

    protected final void finalize() {
        this.c.b();
    }
}
