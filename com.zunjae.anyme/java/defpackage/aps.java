package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class aps extends d<List<arl>> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    aps(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private List<arl> d() {
        if (this.e == null) {
            this.e = new apt(this, "livechart_entry", new String[0]);
            this.d.a.j().a(this.e);
        }
        Cursor a = this.d.a.a(this.c);
        try {
            int columnIndexOrThrow = a.getColumnIndexOrThrow("malid");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("series_cover");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("tags");
            int columnIndexOrThrow5 = a.getColumnIndexOrThrow("title");
            int columnIndexOrThrow6 = a.getColumnIndexOrThrow("episode");
            int columnIndexOrThrow7 = a.getColumnIndexOrThrow("dayOfWeek");
            List<arl> arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arl arl = new arl();
                if (a.isNull(columnIndexOrThrow)) {
                    arl.a = null;
                } else {
                    arl.a = Integer.valueOf(a.getInt(columnIndexOrThrow));
                }
                arl.b = a.getLong(columnIndexOrThrow2);
                arl.c = a.getString(columnIndexOrThrow3);
                arl.d = a.getString(columnIndexOrThrow4);
                arl.e = a.getString(columnIndexOrThrow5);
                arl.f = a.getInt(columnIndexOrThrow6);
                arl.g = a.getInt(columnIndexOrThrow7);
                arrayList.add(arl);
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
