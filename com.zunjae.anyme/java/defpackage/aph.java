package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;

final class aph extends d<are> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    aph(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private are d() {
        if (this.e == null) {
            r1.e = new api(r1, "ANIMES", new String[0]);
            r1.d.a.j().a(r1.e);
        }
        Cursor a = r1.d.a.a(r1.c);
        try {
            are are;
            int columnIndexOrThrow = a.getColumnIndexOrThrow("series_animedb_id");
            int columnIndexOrThrow2 = a.getColumnIndexOrThrow("series_title");
            int columnIndexOrThrow3 = a.getColumnIndexOrThrow("series_synonyms");
            int columnIndexOrThrow4 = a.getColumnIndexOrThrow("series_type");
            int columnIndexOrThrow5 = a.getColumnIndexOrThrow("series_episodes");
            int columnIndexOrThrow6 = a.getColumnIndexOrThrow("series_status");
            int columnIndexOrThrow7 = a.getColumnIndexOrThrow("series_start");
            int columnIndexOrThrow8 = a.getColumnIndexOrThrow("series_end");
            int columnIndexOrThrow9 = a.getColumnIndexOrThrow("series_image");
            int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_watched_episodes");
            int columnIndexOrThrow11 = a.getColumnIndexOrThrow("my_start_date");
            int columnIndexOrThrow12 = a.getColumnIndexOrThrow("my_finish_date");
            int columnIndexOrThrow13 = a.getColumnIndexOrThrow("my_score");
            int columnIndexOrThrow14 = a.getColumnIndexOrThrow("my_rewatching");
            int columnIndexOrThrow15 = a.getColumnIndexOrThrow("my_rewatching_ep");
            int columnIndexOrThrow16 = a.getColumnIndexOrThrow("my_last_updated");
            int columnIndexOrThrow17 = a.getColumnIndexOrThrow("my_tags");
            int columnIndexOrThrow18 = a.getColumnIndexOrThrow("my_status");
            int columnIndexOrThrow19 = a.getColumnIndexOrThrow("kitsu_malId");
            int i = columnIndexOrThrow14;
            columnIndexOrThrow14 = a.getColumnIndexOrThrow("kitsu_kitsuId");
            int i2 = columnIndexOrThrow13;
            columnIndexOrThrow13 = a.getColumnIndexOrThrow("kitsu_startDate");
            int i3 = columnIndexOrThrow12;
            columnIndexOrThrow12 = a.getColumnIndexOrThrow("kitsu_endDate");
            int i4 = columnIndexOrThrow11;
            columnIndexOrThrow11 = a.getColumnIndexOrThrow("kitsu_posterId");
            int i5 = columnIndexOrThrow10;
            columnIndexOrThrow10 = a.getColumnIndexOrThrow("kitsu_coverId");
            int i6 = columnIndexOrThrow9;
            columnIndexOrThrow9 = a.getColumnIndexOrThrow("kitsu_type");
            int i7 = columnIndexOrThrow8;
            columnIndexOrThrow8 = a.getColumnIndexOrThrow("kitsu_titleEnJp");
            int i8 = columnIndexOrThrow7;
            columnIndexOrThrow7 = a.getColumnIndexOrThrow("kitsu_titleEn");
            int i9 = columnIndexOrThrow6;
            columnIndexOrThrow6 = a.getColumnIndexOrThrow("kitsu_titleJaJp");
            int i10 = columnIndexOrThrow5;
            columnIndexOrThrow5 = a.getColumnIndexOrThrow("livechart_malid");
            int i11 = columnIndexOrThrow4;
            columnIndexOrThrow4 = a.getColumnIndexOrThrow("livechart_time");
            int i12 = columnIndexOrThrow3;
            columnIndexOrThrow3 = a.getColumnIndexOrThrow("livechart_episode");
            int i13 = columnIndexOrThrow2;
            if (a.moveToFirst()) {
                asr asr;
                arq arq;
                if (a.isNull(columnIndexOrThrow19) && a.isNull(columnIndexOrThrow14) && a.isNull(columnIndexOrThrow13) && a.isNull(columnIndexOrThrow12) && a.isNull(columnIndexOrThrow11) && a.isNull(columnIndexOrThrow10) && a.isNull(columnIndexOrThrow9) && a.isNull(columnIndexOrThrow8) && a.isNull(columnIndexOrThrow7)) {
                    if (a.isNull(columnIndexOrThrow6)) {
                        asr = null;
                        if (a.isNull(columnIndexOrThrow5) && a.isNull(columnIndexOrThrow4)) {
                            if (!a.isNull(columnIndexOrThrow3)) {
                                arq = null;
                                are = new are();
                                are.a(a.getLong(columnIndexOrThrow));
                                are.a(a.getString(i13));
                                are.b(a.getString(i12));
                                are.a(a.getInt(i11));
                                are.b(a.getInt(i10));
                                are.c(a.getInt(i9));
                                are.c(a.getString(i8));
                                are.d(a.getString(i7));
                                are.e(a.getString(i6));
                                are.d(a.getInt(i5));
                                are.f(a.getString(i4));
                                are.g(a.getString(i3));
                                are.e(a.getInt(i2));
                                are.f(a.getInt(i));
                                are.g(a.getInt(columnIndexOrThrow15));
                                are.b(a.getLong(columnIndexOrThrow16));
                                are.h(a.getString(columnIndexOrThrow17));
                                are.h(a.getInt(columnIndexOrThrow18));
                                are.a(asr);
                                are.a(arq);
                            }
                        }
                        arq = new arq();
                        if (a.isNull(columnIndexOrThrow5)) {
                            arq.a = Integer.valueOf(a.getInt(columnIndexOrThrow5));
                        } else {
                            arq.a = null;
                        }
                        arq.b = a.getLong(columnIndexOrThrow4);
                        arq.c = a.getInt(columnIndexOrThrow3);
                        are = new are();
                        are.a(a.getLong(columnIndexOrThrow));
                        are.a(a.getString(i13));
                        are.b(a.getString(i12));
                        are.a(a.getInt(i11));
                        are.b(a.getInt(i10));
                        are.c(a.getInt(i9));
                        are.c(a.getString(i8));
                        are.d(a.getString(i7));
                        are.e(a.getString(i6));
                        are.d(a.getInt(i5));
                        are.f(a.getString(i4));
                        are.g(a.getString(i3));
                        are.e(a.getInt(i2));
                        are.f(a.getInt(i));
                        are.g(a.getInt(columnIndexOrThrow15));
                        are.b(a.getLong(columnIndexOrThrow16));
                        are.h(a.getString(columnIndexOrThrow17));
                        are.h(a.getInt(columnIndexOrThrow18));
                        are.a(asr);
                        are.a(arq);
                    }
                }
                asr = new asr();
                asr.a = a.getInt(columnIndexOrThrow19);
                asr.b = a.getInt(columnIndexOrThrow14);
                asr.c = a.getString(columnIndexOrThrow13);
                asr.d = a.getString(columnIndexOrThrow12);
                asr.e = a.getString(columnIndexOrThrow11);
                asr.f = a.getString(columnIndexOrThrow10);
                asr.g = a.getString(columnIndexOrThrow9);
                asr.h = a.getString(columnIndexOrThrow8);
                asr.i = a.getString(columnIndexOrThrow7);
                asr.j = a.getString(columnIndexOrThrow6);
                if (!a.isNull(columnIndexOrThrow3)) {
                    arq = null;
                    are = new are();
                    are.a(a.getLong(columnIndexOrThrow));
                    are.a(a.getString(i13));
                    are.b(a.getString(i12));
                    are.a(a.getInt(i11));
                    are.b(a.getInt(i10));
                    are.c(a.getInt(i9));
                    are.c(a.getString(i8));
                    are.d(a.getString(i7));
                    are.e(a.getString(i6));
                    are.d(a.getInt(i5));
                    are.f(a.getString(i4));
                    are.g(a.getString(i3));
                    are.e(a.getInt(i2));
                    are.f(a.getInt(i));
                    are.g(a.getInt(columnIndexOrThrow15));
                    are.b(a.getLong(columnIndexOrThrow16));
                    are.h(a.getString(columnIndexOrThrow17));
                    are.h(a.getInt(columnIndexOrThrow18));
                    are.a(asr);
                    are.a(arq);
                } else {
                    arq = new arq();
                    if (a.isNull(columnIndexOrThrow5)) {
                        arq.a = Integer.valueOf(a.getInt(columnIndexOrThrow5));
                    } else {
                        arq.a = null;
                    }
                    arq.b = a.getLong(columnIndexOrThrow4);
                    arq.c = a.getInt(columnIndexOrThrow3);
                    are = new are();
                    are.a(a.getLong(columnIndexOrThrow));
                    are.a(a.getString(i13));
                    are.b(a.getString(i12));
                    are.a(a.getInt(i11));
                    are.b(a.getInt(i10));
                    are.c(a.getInt(i9));
                    are.c(a.getString(i8));
                    are.d(a.getString(i7));
                    are.e(a.getString(i6));
                    are.d(a.getInt(i5));
                    are.f(a.getString(i4));
                    are.g(a.getString(i3));
                    are.e(a.getInt(i2));
                    are.f(a.getInt(i));
                    are.g(a.getInt(columnIndexOrThrow15));
                    are.b(a.getLong(columnIndexOrThrow16));
                    are.h(a.getString(columnIndexOrThrow17));
                    are.h(a.getInt(columnIndexOrThrow18));
                    are.a(asr);
                    are.a(arq);
                }
            } else {
                are = null;
            }
            a.close();
            return are;
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
