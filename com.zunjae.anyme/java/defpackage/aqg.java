package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;

final class aqg extends d<Integer> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    aqg(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private Integer d() {
        if (this.e == null) {
            this.e = new aqh(this, "animes", "waifus");
            this.d.a.j().a(this.e);
        }
        Cursor a = this.d.a.a(this.c);
        try {
            Integer num = null;
            if (a.moveToFirst()) {
                if (!a.isNull(0)) {
                    num = Integer.valueOf(a.getInt(0));
                }
            }
            a.close();
            return num;
        } catch (Throwable th) {
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
