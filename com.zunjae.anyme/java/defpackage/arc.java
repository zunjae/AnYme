package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class arc extends d<List<asp>> {
    final /* synthetic */ s c;
    final /* synthetic */ aqx d;
    private g e;

    arc(aqx aqx, s sVar) {
        this.d = aqx;
        this.c = sVar;
    }

    private List<asp> d() {
        if (this.e == null) {
            this.e = new ard(this, "waifus", new String[0]);
            this.d.a.j().a(this.e);
        }
        Cursor a = this.d.a.a(this.c);
        try {
            int columnIndexOrThrow = a.getColumnIndexOrThrow("waifu_id");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("parent_anime_id");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("waifu_name");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("waifu_image_url");
            int columnIndexOrThrow5 = a.getColumnIndexOrThrow("date_created");
            List<asp> arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                asp asp = new asp(a.getInt(columnIndexOrThrow), a.getInt(columnIndexOrThrow2), a.getString(columnIndexOrThrow3), a.getString(columnIndexOrThrow4));
                asp.a(a.getLong(columnIndexOrThrow5));
                arrayList.add(asp);
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
