package defpackage;

import android.arch.lifecycle.d;
import android.arch.persistence.room.g;
import android.arch.persistence.room.s;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class aou extends d<List<are>> {
    final /* synthetic */ s c;
    final /* synthetic */ aoi d;
    private g e;

    aou(aoi aoi, s sVar) {
        this.d = aoi;
        this.c = sVar;
    }

    private List<are> d() {
        if (this.e == null) {
            r1.e = new aov(r1, "animes", new String[0]);
            r1.d.a.j().a(r1.e);
        }
        Cursor a = r1.d.a.a(r1.c);
        try {
            ArrayList arrayList;
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
            int i14 = columnIndexOrThrow;
            ArrayList arrayList2 = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                asr asr;
                int i15;
                int i16;
                int i17;
                arq arq;
                are are;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                int i31;
                int i32;
                int i33;
                int i34;
                ArrayList arrayList3 = arrayList2;
                if (a.isNull(columnIndexOrThrow19) && a.isNull(columnIndexOrThrow14) && a.isNull(columnIndexOrThrow13) && a.isNull(columnIndexOrThrow12) && a.isNull(columnIndexOrThrow11) && a.isNull(columnIndexOrThrow10) && a.isNull(columnIndexOrThrow9) && a.isNull(columnIndexOrThrow8) && a.isNull(columnIndexOrThrow7)) {
                    if (a.isNull(columnIndexOrThrow6)) {
                        asr = null;
                        if (a.isNull(columnIndexOrThrow5) && a.isNull(columnIndexOrThrow4)) {
                            if (!a.isNull(columnIndexOrThrow3)) {
                                i15 = columnIndexOrThrow19;
                                i16 = columnIndexOrThrow5;
                                i17 = columnIndexOrThrow6;
                                arq = null;
                                are = new are();
                                i18 = columnIndexOrThrow3;
                                i19 = columnIndexOrThrow4;
                                columnIndexOrThrow5 = i14;
                                are.a(a.getLong(columnIndexOrThrow5));
                                columnIndexOrThrow3 = i13;
                                are.a(a.getString(columnIndexOrThrow3));
                                columnIndexOrThrow4 = i12;
                                are.b(a.getString(columnIndexOrThrow4));
                                i20 = columnIndexOrThrow3;
                                columnIndexOrThrow6 = i11;
                                are.a(a.getInt(columnIndexOrThrow6));
                                i21 = columnIndexOrThrow4;
                                columnIndexOrThrow3 = i10;
                                are.b(a.getInt(columnIndexOrThrow3));
                                i22 = columnIndexOrThrow3;
                                columnIndexOrThrow4 = i9;
                                are.c(a.getInt(columnIndexOrThrow4));
                                i23 = columnIndexOrThrow4;
                                columnIndexOrThrow3 = i8;
                                are.c(a.getString(columnIndexOrThrow3));
                                i24 = columnIndexOrThrow3;
                                columnIndexOrThrow4 = i7;
                                are.d(a.getString(columnIndexOrThrow4));
                                i25 = columnIndexOrThrow4;
                                columnIndexOrThrow3 = i6;
                                are.e(a.getString(columnIndexOrThrow3));
                                i26 = columnIndexOrThrow3;
                                columnIndexOrThrow4 = i5;
                                are.d(a.getInt(columnIndexOrThrow4));
                                i27 = columnIndexOrThrow4;
                                columnIndexOrThrow3 = i4;
                                are.f(a.getString(columnIndexOrThrow3));
                                i28 = columnIndexOrThrow3;
                                columnIndexOrThrow4 = i3;
                                are.g(a.getString(columnIndexOrThrow4));
                                i29 = columnIndexOrThrow4;
                                columnIndexOrThrow3 = i2;
                                are.e(a.getInt(columnIndexOrThrow3));
                                i30 = columnIndexOrThrow3;
                                columnIndexOrThrow4 = i;
                                are.f(a.getInt(columnIndexOrThrow4));
                                i31 = columnIndexOrThrow4;
                                columnIndexOrThrow3 = columnIndexOrThrow15;
                                are.g(a.getInt(columnIndexOrThrow3));
                                i32 = columnIndexOrThrow5;
                                i33 = columnIndexOrThrow6;
                                columnIndexOrThrow4 = columnIndexOrThrow16;
                                are.b(a.getLong(columnIndexOrThrow4));
                                columnIndexOrThrow5 = columnIndexOrThrow17;
                                are.h(a.getString(columnIndexOrThrow5));
                                i34 = columnIndexOrThrow3;
                                columnIndexOrThrow6 = columnIndexOrThrow18;
                                are.h(a.getInt(columnIndexOrThrow6));
                                are.a(asr);
                                are.a(arq);
                                arrayList = arrayList3;
                                arrayList.add(are);
                                arrayList2 = arrayList;
                                columnIndexOrThrow16 = columnIndexOrThrow4;
                                columnIndexOrThrow17 = columnIndexOrThrow5;
                                columnIndexOrThrow18 = columnIndexOrThrow6;
                                columnIndexOrThrow19 = i15;
                                columnIndexOrThrow6 = i17;
                                columnIndexOrThrow5 = i16;
                                columnIndexOrThrow4 = i19;
                                columnIndexOrThrow3 = i18;
                                i13 = i20;
                                i12 = i21;
                                i10 = i22;
                                i9 = i23;
                                i8 = i24;
                                i7 = i25;
                                i6 = i26;
                                i5 = i27;
                                i4 = i28;
                                i3 = i29;
                                i2 = i30;
                                i = i31;
                                i14 = i32;
                                i11 = i33;
                                columnIndexOrThrow15 = i34;
                            }
                        }
                        arq = new arq();
                        if (a.isNull(columnIndexOrThrow5)) {
                            i15 = columnIndexOrThrow19;
                            arq.a = Integer.valueOf(a.getInt(columnIndexOrThrow5));
                        } else {
                            i15 = columnIndexOrThrow19;
                            arq.a = null;
                        }
                        i16 = columnIndexOrThrow5;
                        i17 = columnIndexOrThrow6;
                        arq.b = a.getLong(columnIndexOrThrow4);
                        arq.c = a.getInt(columnIndexOrThrow3);
                        are = new are();
                        i18 = columnIndexOrThrow3;
                        i19 = columnIndexOrThrow4;
                        columnIndexOrThrow5 = i14;
                        are.a(a.getLong(columnIndexOrThrow5));
                        columnIndexOrThrow3 = i13;
                        are.a(a.getString(columnIndexOrThrow3));
                        columnIndexOrThrow4 = i12;
                        are.b(a.getString(columnIndexOrThrow4));
                        i20 = columnIndexOrThrow3;
                        columnIndexOrThrow6 = i11;
                        are.a(a.getInt(columnIndexOrThrow6));
                        i21 = columnIndexOrThrow4;
                        columnIndexOrThrow3 = i10;
                        are.b(a.getInt(columnIndexOrThrow3));
                        i22 = columnIndexOrThrow3;
                        columnIndexOrThrow4 = i9;
                        are.c(a.getInt(columnIndexOrThrow4));
                        i23 = columnIndexOrThrow4;
                        columnIndexOrThrow3 = i8;
                        are.c(a.getString(columnIndexOrThrow3));
                        i24 = columnIndexOrThrow3;
                        columnIndexOrThrow4 = i7;
                        are.d(a.getString(columnIndexOrThrow4));
                        i25 = columnIndexOrThrow4;
                        columnIndexOrThrow3 = i6;
                        are.e(a.getString(columnIndexOrThrow3));
                        i26 = columnIndexOrThrow3;
                        columnIndexOrThrow4 = i5;
                        are.d(a.getInt(columnIndexOrThrow4));
                        i27 = columnIndexOrThrow4;
                        columnIndexOrThrow3 = i4;
                        are.f(a.getString(columnIndexOrThrow3));
                        i28 = columnIndexOrThrow3;
                        columnIndexOrThrow4 = i3;
                        are.g(a.getString(columnIndexOrThrow4));
                        i29 = columnIndexOrThrow4;
                        columnIndexOrThrow3 = i2;
                        are.e(a.getInt(columnIndexOrThrow3));
                        i30 = columnIndexOrThrow3;
                        columnIndexOrThrow4 = i;
                        are.f(a.getInt(columnIndexOrThrow4));
                        i31 = columnIndexOrThrow4;
                        columnIndexOrThrow3 = columnIndexOrThrow15;
                        are.g(a.getInt(columnIndexOrThrow3));
                        i32 = columnIndexOrThrow5;
                        i33 = columnIndexOrThrow6;
                        columnIndexOrThrow4 = columnIndexOrThrow16;
                        are.b(a.getLong(columnIndexOrThrow4));
                        columnIndexOrThrow5 = columnIndexOrThrow17;
                        are.h(a.getString(columnIndexOrThrow5));
                        i34 = columnIndexOrThrow3;
                        columnIndexOrThrow6 = columnIndexOrThrow18;
                        are.h(a.getInt(columnIndexOrThrow6));
                        are.a(asr);
                        are.a(arq);
                        arrayList = arrayList3;
                        arrayList.add(are);
                        arrayList2 = arrayList;
                        columnIndexOrThrow16 = columnIndexOrThrow4;
                        columnIndexOrThrow17 = columnIndexOrThrow5;
                        columnIndexOrThrow18 = columnIndexOrThrow6;
                        columnIndexOrThrow19 = i15;
                        columnIndexOrThrow6 = i17;
                        columnIndexOrThrow5 = i16;
                        columnIndexOrThrow4 = i19;
                        columnIndexOrThrow3 = i18;
                        i13 = i20;
                        i12 = i21;
                        i10 = i22;
                        i9 = i23;
                        i8 = i24;
                        i7 = i25;
                        i6 = i26;
                        i5 = i27;
                        i4 = i28;
                        i3 = i29;
                        i2 = i30;
                        i = i31;
                        i14 = i32;
                        i11 = i33;
                        columnIndexOrThrow15 = i34;
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
                    i15 = columnIndexOrThrow19;
                    i16 = columnIndexOrThrow5;
                    i17 = columnIndexOrThrow6;
                    arq = null;
                    are = new are();
                    i18 = columnIndexOrThrow3;
                    i19 = columnIndexOrThrow4;
                    columnIndexOrThrow5 = i14;
                    are.a(a.getLong(columnIndexOrThrow5));
                    columnIndexOrThrow3 = i13;
                    are.a(a.getString(columnIndexOrThrow3));
                    columnIndexOrThrow4 = i12;
                    are.b(a.getString(columnIndexOrThrow4));
                    i20 = columnIndexOrThrow3;
                    columnIndexOrThrow6 = i11;
                    are.a(a.getInt(columnIndexOrThrow6));
                    i21 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i10;
                    are.b(a.getInt(columnIndexOrThrow3));
                    i22 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i9;
                    are.c(a.getInt(columnIndexOrThrow4));
                    i23 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i8;
                    are.c(a.getString(columnIndexOrThrow3));
                    i24 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i7;
                    are.d(a.getString(columnIndexOrThrow4));
                    i25 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i6;
                    are.e(a.getString(columnIndexOrThrow3));
                    i26 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i5;
                    are.d(a.getInt(columnIndexOrThrow4));
                    i27 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i4;
                    are.f(a.getString(columnIndexOrThrow3));
                    i28 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i3;
                    are.g(a.getString(columnIndexOrThrow4));
                    i29 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i2;
                    are.e(a.getInt(columnIndexOrThrow3));
                    i30 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i;
                    are.f(a.getInt(columnIndexOrThrow4));
                    i31 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = columnIndexOrThrow15;
                    are.g(a.getInt(columnIndexOrThrow3));
                    i32 = columnIndexOrThrow5;
                    i33 = columnIndexOrThrow6;
                    columnIndexOrThrow4 = columnIndexOrThrow16;
                    are.b(a.getLong(columnIndexOrThrow4));
                    columnIndexOrThrow5 = columnIndexOrThrow17;
                    are.h(a.getString(columnIndexOrThrow5));
                    i34 = columnIndexOrThrow3;
                    columnIndexOrThrow6 = columnIndexOrThrow18;
                    are.h(a.getInt(columnIndexOrThrow6));
                    are.a(asr);
                    are.a(arq);
                    arrayList = arrayList3;
                    arrayList.add(are);
                    arrayList2 = arrayList;
                    columnIndexOrThrow16 = columnIndexOrThrow4;
                    columnIndexOrThrow17 = columnIndexOrThrow5;
                    columnIndexOrThrow18 = columnIndexOrThrow6;
                    columnIndexOrThrow19 = i15;
                    columnIndexOrThrow6 = i17;
                    columnIndexOrThrow5 = i16;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow3 = i18;
                    i13 = i20;
                    i12 = i21;
                    i10 = i22;
                    i9 = i23;
                    i8 = i24;
                    i7 = i25;
                    i6 = i26;
                    i5 = i27;
                    i4 = i28;
                    i3 = i29;
                    i2 = i30;
                    i = i31;
                    i14 = i32;
                    i11 = i33;
                    columnIndexOrThrow15 = i34;
                } else {
                    arq = new arq();
                    if (a.isNull(columnIndexOrThrow5)) {
                        i15 = columnIndexOrThrow19;
                        arq.a = Integer.valueOf(a.getInt(columnIndexOrThrow5));
                    } else {
                        i15 = columnIndexOrThrow19;
                        arq.a = null;
                    }
                    i16 = columnIndexOrThrow5;
                    i17 = columnIndexOrThrow6;
                    arq.b = a.getLong(columnIndexOrThrow4);
                    arq.c = a.getInt(columnIndexOrThrow3);
                    are = new are();
                    i18 = columnIndexOrThrow3;
                    i19 = columnIndexOrThrow4;
                    columnIndexOrThrow5 = i14;
                    are.a(a.getLong(columnIndexOrThrow5));
                    columnIndexOrThrow3 = i13;
                    are.a(a.getString(columnIndexOrThrow3));
                    columnIndexOrThrow4 = i12;
                    are.b(a.getString(columnIndexOrThrow4));
                    i20 = columnIndexOrThrow3;
                    columnIndexOrThrow6 = i11;
                    are.a(a.getInt(columnIndexOrThrow6));
                    i21 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i10;
                    are.b(a.getInt(columnIndexOrThrow3));
                    i22 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i9;
                    are.c(a.getInt(columnIndexOrThrow4));
                    i23 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i8;
                    are.c(a.getString(columnIndexOrThrow3));
                    i24 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i7;
                    are.d(a.getString(columnIndexOrThrow4));
                    i25 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i6;
                    are.e(a.getString(columnIndexOrThrow3));
                    i26 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i5;
                    are.d(a.getInt(columnIndexOrThrow4));
                    i27 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i4;
                    are.f(a.getString(columnIndexOrThrow3));
                    i28 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i3;
                    are.g(a.getString(columnIndexOrThrow4));
                    i29 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = i2;
                    are.e(a.getInt(columnIndexOrThrow3));
                    i30 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = i;
                    are.f(a.getInt(columnIndexOrThrow4));
                    i31 = columnIndexOrThrow4;
                    columnIndexOrThrow3 = columnIndexOrThrow15;
                    are.g(a.getInt(columnIndexOrThrow3));
                    i32 = columnIndexOrThrow5;
                    i33 = columnIndexOrThrow6;
                    columnIndexOrThrow4 = columnIndexOrThrow16;
                    are.b(a.getLong(columnIndexOrThrow4));
                    columnIndexOrThrow5 = columnIndexOrThrow17;
                    are.h(a.getString(columnIndexOrThrow5));
                    i34 = columnIndexOrThrow3;
                    columnIndexOrThrow6 = columnIndexOrThrow18;
                    are.h(a.getInt(columnIndexOrThrow6));
                    are.a(asr);
                    are.a(arq);
                    arrayList = arrayList3;
                    arrayList.add(are);
                    arrayList2 = arrayList;
                    columnIndexOrThrow16 = columnIndexOrThrow4;
                    columnIndexOrThrow17 = columnIndexOrThrow5;
                    columnIndexOrThrow18 = columnIndexOrThrow6;
                    columnIndexOrThrow19 = i15;
                    columnIndexOrThrow6 = i17;
                    columnIndexOrThrow5 = i16;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow3 = i18;
                    i13 = i20;
                    i12 = i21;
                    i10 = i22;
                    i9 = i23;
                    i8 = i24;
                    i7 = i25;
                    i6 = i26;
                    i5 = i27;
                    i4 = i28;
                    i3 = i29;
                    i2 = i30;
                    i = i31;
                    i14 = i32;
                    i11 = i33;
                    columnIndexOrThrow15 = i34;
                }
            }
            arrayList = arrayList2;
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
