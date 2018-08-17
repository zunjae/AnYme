package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;

final class aqi extends d<asr> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    aqi(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private asr d() {
        if (this.e == null) {
            this.e = new aqj(this, "minimal_kitsu_info", new String[0]);
            this.d.a.j().a(this.e);
        }
        Cursor a = this.d.a.a(this.c);
        try {
            asr asr;
            int columnIndexOrThrow = a.getColumnIndexOrThrow("malId");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("kitsuId");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("startDate");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("endDate");
            int columnIndexOrThrow5 = a.getColumnIndexOrThrow("posterId");
            int columnIndexOrThrow6 = a.getColumnIndexOrThrow("coverId");
            int columnIndexOrThrow7 = a.getColumnIndexOrThrow("type");
            int columnIndexOrThrow8 = a.getColumnIndexOrThrow("titleEnJp");
            int columnIndexOrThrow9 = a.getColumnIndexOrThrow("titleEn");
            int columnIndexOrThrow10 = a.getColumnIndexOrThrow("titleJaJp");
            if (a.moveToFirst()) {
                asr = new asr();
                asr.a = a.getInt(columnIndexOrThrow);
                asr.b = a.getInt(columnIndexOrThrow2);
                asr.c = a.getString(columnIndexOrThrow3);
                asr.d = a.getString(columnIndexOrThrow4);
                asr.e = a.getString(columnIndexOrThrow5);
                asr.f = a.getString(columnIndexOrThrow6);
                asr.g = a.getString(columnIndexOrThrow7);
                asr.h = a.getString(columnIndexOrThrow8);
                asr.i = a.getString(columnIndexOrThrow9);
                asr.j = a.getString(columnIndexOrThrow10);
            } else {
                asr = null;
            }
            a.close();
            return asr;
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
