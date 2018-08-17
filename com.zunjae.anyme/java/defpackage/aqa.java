package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class aqa extends d<List<arg>> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    aqa(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private List<arg> d() {
        if (this.e == null) {
            r1.e = new aqb(r1, "animerecommendations", "animes", "nsfwshows");
            r1.d.a.j().a(r1.e);
        }
        Cursor a = r1.d.a.a(r1.c);
        try {
            int columnIndexOrThrow = a.getColumnIndexOrThrow("animeId");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("parentAnimeId");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("title");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("image");
            int columnIndexOrThrow5 = a.getColumnIndexOrThrow("recommendedBy");
            int columnIndexOrThrow6 = a.getColumnIndexOrThrow("shortDescription");
            int columnIndexOrThrow7 = a.getColumnIndexOrThrow("readMoreURL");
            int columnIndexOrThrow8 = a.getColumnIndexOrThrow("priority");
            List<arg> arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                long j = a.getLong(columnIndexOrThrow);
                long j2 = a.getLong(columnIndexOrThrow2);
                arrayList.add(new arg(j, a.getInt(columnIndexOrThrow8), a.getString(columnIndexOrThrow3), a.getString(columnIndexOrThrow4), a.getString(columnIndexOrThrow5), a.getString(columnIndexOrThrow6), a.getString(columnIndexOrThrow7), j2));
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
