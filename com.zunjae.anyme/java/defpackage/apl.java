package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class apl extends d<List<arn>> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    apl(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private List<arn> d() {
        if (this.e == null) {
            this.e = new apm(this, "animes", new String[0]);
            this.d.a.j().a(this.e);
        }
        Cursor a = this.d.a.a(this.c);
        try {
            int columnIndexOrThrow = a.getColumnIndexOrThrow("series_animedb_id");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("series_title");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("series_image");
            List<arn> arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(new arn(a.getLong(columnIndexOrThrow), a.getString(columnIndexOrThrow2), a.getString(columnIndexOrThrow3)));
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
