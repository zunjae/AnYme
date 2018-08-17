package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;

final class apn extends d<asc> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    apn(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private asc d() {
        if (this.e == null) {
            r1.e = new apo(r1, "animejikaninfor2", new String[0]);
            r1.d.a.j().a(r1.e);
        }
        Cursor a = r1.d.a.a(r1.c);
        try {
            asc asc;
            int columnIndexOrThrow = a.getColumnIndexOrThrow("malId");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("link_canonical");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("title");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("title_english");
            int columnIndexOrThrow5 = a.getColumnIndexOrThrow("title_synonyms");
            int columnIndexOrThrow6 = a.getColumnIndexOrThrow("image_url");
            int columnIndexOrThrow7 = a.getColumnIndexOrThrow("type");
            int columnIndexOrThrow8 = a.getColumnIndexOrThrow("source");
            int columnIndexOrThrow9 = a.getColumnIndexOrThrow("episodes");
            int columnIndexOrThrow10 = a.getColumnIndexOrThrow("status");
            int columnIndexOrThrow11 = a.getColumnIndexOrThrow("aired_string");
            int columnIndexOrThrow12 = a.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow13 = a.getColumnIndexOrThrow("rating");
            int columnIndexOrThrow14 = a.getColumnIndexOrThrow("score");
            int columnIndexOrThrow15 = a.getColumnIndexOrThrow("rank");
            int columnIndexOrThrow16 = a.getColumnIndexOrThrow("synopsis");
            int columnIndexOrThrow17 = a.getColumnIndexOrThrow("broadcast");
            int columnIndexOrThrow18 = a.getColumnIndexOrThrow("studio");
            int columnIndexOrThrow19 = a.getColumnIndexOrThrow("genre");
            int columnIndexOrThrow20 = a.getColumnIndexOrThrow("opening_theme");
            int columnIndexOrThrow21 = a.getColumnIndexOrThrow("ending_theme");
            int columnIndexOrThrow22 = a.getColumnIndexOrThrow("expirationDate");
            int columnIndexOrThrow23 = a.getColumnIndexOrThrow("jikanRelated");
            if (a.moveToFirst()) {
                int i;
                asc = new asc();
                if (a.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow14;
                    asc.a = null;
                } else {
                    i = columnIndexOrThrow14;
                    asc.a = Integer.valueOf(a.getInt(columnIndexOrThrow));
                }
                asc.b = a.getString(columnIndexOrThrow2);
                asc.c = a.getString(columnIndexOrThrow3);
                asc.d = a.getString(columnIndexOrThrow4);
                asc.e = a.getString(columnIndexOrThrow5);
                asc.f = a.getString(columnIndexOrThrow6);
                asc.g = a.getString(columnIndexOrThrow7);
                asc.h = a.getString(columnIndexOrThrow8);
                if (a.isNull(columnIndexOrThrow9)) {
                    asc.i = null;
                } else {
                    asc.i = Integer.valueOf(a.getInt(columnIndexOrThrow9));
                }
                asc.j = a.getString(columnIndexOrThrow10);
                asc.k = a.getString(columnIndexOrThrow11);
                asc.l = a.getString(columnIndexOrThrow12);
                asc.m = a.getString(columnIndexOrThrow13);
                columnIndexOrThrow = i;
                if (a.isNull(columnIndexOrThrow)) {
                    asc.n = null;
                } else {
                    asc.n = Double.valueOf(a.getDouble(columnIndexOrThrow));
                }
                columnIndexOrThrow = columnIndexOrThrow15;
                if (a.isNull(columnIndexOrThrow)) {
                    asc.o = null;
                } else {
                    asc.o = Integer.valueOf(a.getInt(columnIndexOrThrow));
                }
                asc.p = a.getString(columnIndexOrThrow16);
                asc.q = a.getString(columnIndexOrThrow17);
                asc.r = atw.a(a.getString(columnIndexOrThrow18));
                asc.s = att.a(a.getString(columnIndexOrThrow19));
                asc.t = atr.a(a.getString(columnIndexOrThrow20));
                asc.u = atr.a(a.getString(columnIndexOrThrow21));
                asc.v = a.getLong(columnIndexOrThrow22);
                asc.w = atv.a(a.getString(columnIndexOrThrow23));
            } else {
                asc = null;
            }
            a.close();
            return asc;
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
