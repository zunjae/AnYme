package defpackage;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.b;
import android.arch.persistence.room.c;
import android.arch.persistence.room.k;
import android.arch.persistence.room.s;
import android.arch.persistence.room.t;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

public final class aoi extends aoh {
    private final k a;
    private final c b;
    private final c c;
    private final c d;
    private final c e;
    private final c f;
    private final c g;
    private final c h;
    private final b i;
    private final b j;
    private final t k;
    private final t l;
    private final t m;
    private final t n;
    private final t o;
    private final t p;

    public aoi(k kVar) {
        this.a = kVar;
        this.b = new aoj(this, kVar);
        this.c = new aoy(this, kVar);
        this.d = new apr(this, kVar);
        this.e = new aqk(this, kVar);
        this.f = new aql(this, kVar);
        this.g = new aqm(this, kVar);
        this.h = new aqn(this, kVar);
        this.i = new aqo(this, kVar);
        this.j = new aqp(this, kVar);
        this.k = new aok(this, kVar);
        this.l = new aol(this, kVar);
        this.m = new aom(this, kVar);
        this.n = new aon(this, kVar);
        this.o = new aoo(this, kVar);
        this.p = new aop(this, kVar);
    }

    public final LiveData<List<are>> a() {
        return new aoq(this, s.a("SELECT * FROM animes LEFT JOIN livechart_entry on animes.series_animedb_id = livechart_entry.malid", 0)).a();
    }

    public final LiveData<List<are>> a(int i) {
        s a = s.a("SELECT * FROM animes where my_status = ?", 1);
        a.a(1, (long) i);
        return new aos(this, a).a();
    }

    public final LiveData<List<are>> a(String str) {
        s a = s.a("SELECT * FROM animes LEFT JOIN livechart_entry on animes.series_animedb_id = livechart_entry.malid WHERE my_tags LIKE ?", 1);
        a.a(1, str);
        return new aow(this, a).a();
    }

    public final are a(long j) {
        s sVar;
        Throwable th;
        s a = s.a("SELECT * FROM animes where series_animedb_id = ?", 1);
        a.a(1, j);
        Cursor a2 = this.a.a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("series_animedb_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("series_title");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("series_synonyms");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("series_type");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("series_episodes");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("series_status");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("series_start");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("series_end");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("series_image");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_watched_episodes");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("my_start_date");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("my_finish_date");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("my_score");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("my_rewatching");
            sVar = a;
            try {
                are are;
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("my_rewatching_ep");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("my_last_updated");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("my_tags");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("my_status");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("kitsu_malId");
                int i = columnIndexOrThrow14;
                columnIndexOrThrow14 = a2.getColumnIndexOrThrow("kitsu_kitsuId");
                int i2 = columnIndexOrThrow13;
                columnIndexOrThrow13 = a2.getColumnIndexOrThrow("kitsu_startDate");
                int i3 = columnIndexOrThrow12;
                columnIndexOrThrow12 = a2.getColumnIndexOrThrow("kitsu_endDate");
                int i4 = columnIndexOrThrow11;
                columnIndexOrThrow11 = a2.getColumnIndexOrThrow("kitsu_posterId");
                int i5 = columnIndexOrThrow10;
                columnIndexOrThrow10 = a2.getColumnIndexOrThrow("kitsu_coverId");
                int i6 = columnIndexOrThrow9;
                columnIndexOrThrow9 = a2.getColumnIndexOrThrow("kitsu_type");
                int i7 = columnIndexOrThrow8;
                columnIndexOrThrow8 = a2.getColumnIndexOrThrow("kitsu_titleEnJp");
                int i8 = columnIndexOrThrow7;
                columnIndexOrThrow7 = a2.getColumnIndexOrThrow("kitsu_titleEn");
                int i9 = columnIndexOrThrow6;
                columnIndexOrThrow6 = a2.getColumnIndexOrThrow("kitsu_titleJaJp");
                int i10 = columnIndexOrThrow5;
                columnIndexOrThrow5 = a2.getColumnIndexOrThrow("livechart_malid");
                int i11 = columnIndexOrThrow4;
                columnIndexOrThrow4 = a2.getColumnIndexOrThrow("livechart_time");
                int i12 = columnIndexOrThrow3;
                columnIndexOrThrow3 = a2.getColumnIndexOrThrow("livechart_episode");
                int i13 = columnIndexOrThrow2;
                if (a2.moveToFirst()) {
                    asr asr;
                    arq arq;
                    if (a2.isNull(columnIndexOrThrow19) && a2.isNull(columnIndexOrThrow14) && a2.isNull(columnIndexOrThrow13) && a2.isNull(columnIndexOrThrow12) && a2.isNull(columnIndexOrThrow11) && a2.isNull(columnIndexOrThrow10) && a2.isNull(columnIndexOrThrow9) && a2.isNull(columnIndexOrThrow8) && a2.isNull(columnIndexOrThrow7)) {
                        if (a2.isNull(columnIndexOrThrow6)) {
                            asr = null;
                            if (a2.isNull(columnIndexOrThrow5) && a2.isNull(columnIndexOrThrow4)) {
                                if (!a2.isNull(columnIndexOrThrow3)) {
                                    arq = null;
                                    are = new are();
                                    are.a(a2.getLong(columnIndexOrThrow));
                                    are.a(a2.getString(i13));
                                    are.b(a2.getString(i12));
                                    are.a(a2.getInt(i11));
                                    are.b(a2.getInt(i10));
                                    are.c(a2.getInt(i9));
                                    are.c(a2.getString(i8));
                                    are.d(a2.getString(i7));
                                    are.e(a2.getString(i6));
                                    are.d(a2.getInt(i5));
                                    are.f(a2.getString(i4));
                                    are.g(a2.getString(i3));
                                    are.e(a2.getInt(i2));
                                    are.f(a2.getInt(i));
                                    are.g(a2.getInt(columnIndexOrThrow15));
                                    are.b(a2.getLong(columnIndexOrThrow16));
                                    are.h(a2.getString(columnIndexOrThrow17));
                                    are.h(a2.getInt(columnIndexOrThrow18));
                                    are.a(asr);
                                    are.a(arq);
                                }
                            }
                            arq = new arq();
                            if (a2.isNull(columnIndexOrThrow5)) {
                                arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow5));
                            } else {
                                arq.a = null;
                            }
                            arq.b = a2.getLong(columnIndexOrThrow4);
                            arq.c = a2.getInt(columnIndexOrThrow3);
                            are = new are();
                            are.a(a2.getLong(columnIndexOrThrow));
                            are.a(a2.getString(i13));
                            are.b(a2.getString(i12));
                            are.a(a2.getInt(i11));
                            are.b(a2.getInt(i10));
                            are.c(a2.getInt(i9));
                            are.c(a2.getString(i8));
                            are.d(a2.getString(i7));
                            are.e(a2.getString(i6));
                            are.d(a2.getInt(i5));
                            are.f(a2.getString(i4));
                            are.g(a2.getString(i3));
                            are.e(a2.getInt(i2));
                            are.f(a2.getInt(i));
                            are.g(a2.getInt(columnIndexOrThrow15));
                            are.b(a2.getLong(columnIndexOrThrow16));
                            are.h(a2.getString(columnIndexOrThrow17));
                            are.h(a2.getInt(columnIndexOrThrow18));
                            are.a(asr);
                            are.a(arq);
                        }
                    }
                    asr = new asr();
                    asr.a = a2.getInt(columnIndexOrThrow19);
                    asr.b = a2.getInt(columnIndexOrThrow14);
                    asr.c = a2.getString(columnIndexOrThrow13);
                    asr.d = a2.getString(columnIndexOrThrow12);
                    asr.e = a2.getString(columnIndexOrThrow11);
                    asr.f = a2.getString(columnIndexOrThrow10);
                    asr.g = a2.getString(columnIndexOrThrow9);
                    asr.h = a2.getString(columnIndexOrThrow8);
                    asr.i = a2.getString(columnIndexOrThrow7);
                    asr.j = a2.getString(columnIndexOrThrow6);
                    if (!a2.isNull(columnIndexOrThrow3)) {
                        arq = null;
                        are = new are();
                        are.a(a2.getLong(columnIndexOrThrow));
                        are.a(a2.getString(i13));
                        are.b(a2.getString(i12));
                        are.a(a2.getInt(i11));
                        are.b(a2.getInt(i10));
                        are.c(a2.getInt(i9));
                        are.c(a2.getString(i8));
                        are.d(a2.getString(i7));
                        are.e(a2.getString(i6));
                        are.d(a2.getInt(i5));
                        are.f(a2.getString(i4));
                        are.g(a2.getString(i3));
                        are.e(a2.getInt(i2));
                        are.f(a2.getInt(i));
                        are.g(a2.getInt(columnIndexOrThrow15));
                        are.b(a2.getLong(columnIndexOrThrow16));
                        are.h(a2.getString(columnIndexOrThrow17));
                        are.h(a2.getInt(columnIndexOrThrow18));
                        are.a(asr);
                        are.a(arq);
                    } else {
                        arq = new arq();
                        if (a2.isNull(columnIndexOrThrow5)) {
                            arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow5));
                        } else {
                            arq.a = null;
                        }
                        arq.b = a2.getLong(columnIndexOrThrow4);
                        arq.c = a2.getInt(columnIndexOrThrow3);
                        are = new are();
                        are.a(a2.getLong(columnIndexOrThrow));
                        are.a(a2.getString(i13));
                        are.b(a2.getString(i12));
                        are.a(a2.getInt(i11));
                        are.b(a2.getInt(i10));
                        are.c(a2.getInt(i9));
                        are.c(a2.getString(i8));
                        are.d(a2.getString(i7));
                        are.e(a2.getString(i6));
                        are.d(a2.getInt(i5));
                        are.f(a2.getString(i4));
                        are.g(a2.getString(i3));
                        are.e(a2.getInt(i2));
                        are.f(a2.getInt(i));
                        are.g(a2.getInt(columnIndexOrThrow15));
                        are.b(a2.getLong(columnIndexOrThrow16));
                        are.h(a2.getString(columnIndexOrThrow17));
                        are.h(a2.getInt(columnIndexOrThrow18));
                        are.a(asr);
                        are.a(arq);
                    }
                } else {
                    are = null;
                }
                a2.close();
                sVar.b();
                return are;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                sVar.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sVar = a;
            a2.close();
            sVar.b();
            throw th;
        }
    }

    public final Integer a(long j, long j2) {
        s a = s.a("SELECT COUNT(*) from animejikaninfor2 where malId = ? and expirationDate > ?", 2);
        a.a(1, j);
        a.a(2, j2);
        Cursor a2 = this.a.a(a);
        try {
            Integer num = null;
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    num = Integer.valueOf(a2.getInt(0));
                }
            }
            a2.close();
            a.b();
            return num;
        } catch (Throwable th) {
            a2.close();
            a.b();
        }
    }

    public final void a(are are) {
        this.a.g();
        try {
            this.j.a(are);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void a(asc asc) {
        this.a.g();
        try {
            this.d.a(asc);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void a(ArrayList<arg> arrayList) {
        this.a.g();
        try {
            this.e.a(arrayList);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void a(List<are> list) {
        this.a.g();
        try {
            this.b.a(list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void a(List<amg> list, int i) {
        this.a.g();
        try {
            super.a((List) list, i);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final LiveData<List<are>> b() {
        s a = s.a("SELECT * FROM animes WHERE my_score > ? ORDER BY my_score DESC", 1);
        a.a(1, 6);
        return new aou(this, a).a();
    }

    public final LiveData<are> b(long j) {
        s a = s.a("SELECT * FROM ANIMES WHERE series_animedb_id = ?", 1);
        a.a(1, j);
        return new aph(this, a).a();
    }

    public final Integer b(long j, long j2) {
        s a = s.a("SELECT COUNT(*) from related_animes where parent_anime_id = ? and expiration_date > ?", 2);
        a.a(1, j);
        a.a(2, j2);
        Cursor a2 = this.a.a(a);
        try {
            Integer num = null;
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    num = Integer.valueOf(a2.getInt(0));
                }
            }
            a2.close();
            a.b();
            return num;
        } catch (Throwable th) {
            a2.close();
            a.b();
        }
    }

    public final void b(int i) {
        w b = this.k.b();
        this.a.g();
        try {
            b.a(1, (long) i);
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.k.a(b);
        }
    }

    public final void b(are are) {
        this.a.g();
        try {
            this.b.a(are);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void b(ArrayList<arl> arrayList) {
        this.a.g();
        try {
            super.b((ArrayList) arrayList);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final void b(List<are> list) {
        this.a.g();
        try {
            super.b((List) list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final LiveData<Integer> c(int i) {
        s a = s.a("SELECT COUNT(*) FROM animes where my_status = ?", 1);
        a.a(1, (long) i);
        return new apd(this, a).a();
    }

    public final asc c(long j) {
        s sVar;
        Throwable th;
        s a = s.a("SELECT * FROM animejikaninfor2 where malId = ?", 1);
        a.a(1, j);
        Cursor a2 = this.a.a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("malId");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("link_canonical");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("title");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("title_english");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("title_synonyms");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("image_url");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("type");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("source");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("episodes");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("status");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("aired_string");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("rating");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("score");
            sVar = a;
            try {
                asc asc;
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("rank");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("synopsis");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("broadcast");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("studio");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("genre");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("opening_theme");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("ending_theme");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("expirationDate");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("jikanRelated");
                if (a2.moveToFirst()) {
                    int i;
                    asc asc2 = new asc();
                    if (a2.isNull(columnIndexOrThrow)) {
                        i = columnIndexOrThrow14;
                        asc2.a = null;
                    } else {
                        i = columnIndexOrThrow14;
                        asc2.a = Integer.valueOf(a2.getInt(columnIndexOrThrow));
                    }
                    asc2.b = a2.getString(columnIndexOrThrow2);
                    asc2.c = a2.getString(columnIndexOrThrow3);
                    asc2.d = a2.getString(columnIndexOrThrow4);
                    asc2.e = a2.getString(columnIndexOrThrow5);
                    asc2.f = a2.getString(columnIndexOrThrow6);
                    asc2.g = a2.getString(columnIndexOrThrow7);
                    asc2.h = a2.getString(columnIndexOrThrow8);
                    if (a2.isNull(columnIndexOrThrow9)) {
                        asc2.i = null;
                    } else {
                        asc2.i = Integer.valueOf(a2.getInt(columnIndexOrThrow9));
                    }
                    asc2.j = a2.getString(columnIndexOrThrow10);
                    asc2.k = a2.getString(columnIndexOrThrow11);
                    asc2.l = a2.getString(columnIndexOrThrow12);
                    asc2.m = a2.getString(columnIndexOrThrow13);
                    columnIndexOrThrow = i;
                    if (a2.isNull(columnIndexOrThrow)) {
                        asc2.n = null;
                    } else {
                        asc2.n = Double.valueOf(a2.getDouble(columnIndexOrThrow));
                    }
                    columnIndexOrThrow = columnIndexOrThrow15;
                    if (a2.isNull(columnIndexOrThrow)) {
                        asc2.o = null;
                    } else {
                        asc2.o = Integer.valueOf(a2.getInt(columnIndexOrThrow));
                    }
                    asc2.p = a2.getString(columnIndexOrThrow16);
                    asc2.q = a2.getString(columnIndexOrThrow17);
                    asc2.r = atw.a(a2.getString(columnIndexOrThrow18));
                    asc2.s = att.a(a2.getString(columnIndexOrThrow19));
                    asc2.t = atr.a(a2.getString(columnIndexOrThrow20));
                    asc2.u = atr.a(a2.getString(columnIndexOrThrow21));
                    asc2.v = a2.getLong(columnIndexOrThrow22);
                    asc2.w = atv.a(a2.getString(columnIndexOrThrow23));
                    asc = asc2;
                } else {
                    asc = null;
                }
                a2.close();
                sVar.b();
                return asc;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                sVar.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sVar = a;
            a2.close();
            sVar.b();
            throw th;
        }
    }

    public final List<Long> c() {
        s a = s.a("SELECT series_animedb_id from animes", 0);
        Cursor a2 = this.a.a(a);
        try {
            List<Long> arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.isNull(0) ? null : Long.valueOf(a2.getLong(0)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.b();
        }
    }

    public final void c(are are) {
        this.a.g();
        try {
            this.i.a(are);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    final void c(ArrayList<arl> arrayList) {
        this.a.g();
        try {
            this.f.a(arrayList);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    final void c(List<amg> list) {
        this.a.g();
        try {
            this.g.a(list);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final LiveData<List<are>> d() {
        return new aoz(this, s.a("SELECT * from animes where my_status <> 2", 0)).a();
    }

    public final LiveData<List<arl>> d(int i) {
        s a = s.a("SELECT * FROM livechart_entry WHERE dayOfWeek = ? ORDER BY time ASC", 1);
        a.a(1, (long) i);
        return new aps(this, a).a();
    }

    public final LiveData<asc> d(long j) {
        s a = s.a("SELECT * FROM animejikaninfor2 where malId = ?", 1);
        a.a(1, j);
        return new apn(this, a).a();
    }

    public final void d(ArrayList<arr> arrayList) {
        this.a.g();
        try {
            super.d((ArrayList) arrayList);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final LiveData<List<are>> e() {
        return new apb(this, s.a("SELECT * FROM animes", 0)).a();
    }

    public final LiveData<List<asn>> e(int i) {
        s a = s.a("SELECT * from related_animes as re LEFT JOIN animes ON re.series_id = animes.series_animedb_id WHERE re.parent_anime_id = ? AND re.series_id <> ?", 2);
        long j = (long) i;
        a.a(1, j);
        a.a(2, j);
        return new apy(this, a).a();
    }

    public final List<asm> e(long j) {
        s sVar;
        Throwable th;
        s a = s.a("SELECT ar.*, animes.* from animerecommendations as ar left join animes on ar.animeId = animes.series_animedb_id where ar.parentAnimeId = ?", 1);
        a.a(1, j);
        Cursor a2 = this.a.a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("animeId");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("parentAnimeId");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("title");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("image");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("series_animedb_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("series_title");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("series_synonyms");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("series_type");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("series_episodes");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("series_status");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("series_start");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("series_end");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("series_image");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("my_watched_episodes");
            sVar = a;
            try {
                ArrayList arrayList;
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("my_start_date");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("my_finish_date");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("my_score");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("my_rewatching");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("my_rewatching_ep");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("my_last_updated");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("my_tags");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("my_status");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("kitsu_malId");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("kitsu_kitsuId");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("kitsu_startDate");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("kitsu_endDate");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("kitsu_posterId");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("kitsu_coverId");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("kitsu_type");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("kitsu_titleEnJp");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("kitsu_titleEn");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("kitsu_titleJaJp");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("livechart_malid");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("livechart_time");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("livechart_episode");
                int i = columnIndexOrThrow14;
                ArrayList arrayList2 = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    arp arp;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    arp arp2;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
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
                    int i35;
                    int i36;
                    int i37;
                    int i38;
                    int i39;
                    int i40;
                    int i41;
                    int i42;
                    are are;
                    asm asm;
                    int i43;
                    int i44;
                    asr asr;
                    arq arq;
                    ArrayList arrayList3 = arrayList2;
                    if (a2.isNull(columnIndexOrThrow) && a2.isNull(columnIndexOrThrow2) && a2.isNull(columnIndexOrThrow3)) {
                        if (a2.isNull(columnIndexOrThrow4)) {
                            arp = null;
                            if (!a2.isNull(columnIndexOrThrow5) && a2.isNull(columnIndexOrThrow6) && a2.isNull(columnIndexOrThrow7) && a2.isNull(columnIndexOrThrow8) && a2.isNull(columnIndexOrThrow9) && a2.isNull(columnIndexOrThrow10) && a2.isNull(columnIndexOrThrow11) && a2.isNull(columnIndexOrThrow12) && a2.isNull(columnIndexOrThrow13)) {
                                i2 = i;
                                if (a2.isNull(i2)) {
                                    i3 = columnIndexOrThrow;
                                    columnIndexOrThrow = columnIndexOrThrow15;
                                    if (a2.isNull(columnIndexOrThrow)) {
                                        i4 = columnIndexOrThrow2;
                                        columnIndexOrThrow2 = columnIndexOrThrow16;
                                        if (a2.isNull(columnIndexOrThrow2)) {
                                            i5 = columnIndexOrThrow3;
                                            columnIndexOrThrow3 = columnIndexOrThrow17;
                                            if (a2.isNull(columnIndexOrThrow3)) {
                                                i6 = columnIndexOrThrow4;
                                                columnIndexOrThrow4 = columnIndexOrThrow18;
                                                if (a2.isNull(columnIndexOrThrow4)) {
                                                    arp2 = arp;
                                                    columnIndexOrThrow14 = columnIndexOrThrow19;
                                                    if (a2.isNull(columnIndexOrThrow14)) {
                                                        i7 = columnIndexOrThrow14;
                                                        columnIndexOrThrow14 = columnIndexOrThrow20;
                                                        if (a2.isNull(columnIndexOrThrow14)) {
                                                            i8 = columnIndexOrThrow14;
                                                            columnIndexOrThrow14 = columnIndexOrThrow21;
                                                            if (a2.isNull(columnIndexOrThrow14)) {
                                                                i9 = columnIndexOrThrow14;
                                                                columnIndexOrThrow14 = columnIndexOrThrow22;
                                                                if (a2.isNull(columnIndexOrThrow14)) {
                                                                    i10 = columnIndexOrThrow14;
                                                                    columnIndexOrThrow14 = columnIndexOrThrow23;
                                                                    if (a2.isNull(columnIndexOrThrow14)) {
                                                                        i11 = columnIndexOrThrow4;
                                                                        columnIndexOrThrow4 = columnIndexOrThrow24;
                                                                        if (a2.isNull(columnIndexOrThrow4)) {
                                                                            i12 = columnIndexOrThrow3;
                                                                            columnIndexOrThrow3 = columnIndexOrThrow25;
                                                                            if (a2.isNull(columnIndexOrThrow3)) {
                                                                                i13 = columnIndexOrThrow2;
                                                                                columnIndexOrThrow2 = columnIndexOrThrow26;
                                                                                if (a2.isNull(columnIndexOrThrow2)) {
                                                                                    i14 = columnIndexOrThrow;
                                                                                    columnIndexOrThrow = columnIndexOrThrow27;
                                                                                    if (a2.isNull(columnIndexOrThrow)) {
                                                                                        i15 = i2;
                                                                                        i2 = columnIndexOrThrow28;
                                                                                        if (a2.isNull(i2)) {
                                                                                            i16 = columnIndexOrThrow13;
                                                                                            columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                                            if (a2.isNull(columnIndexOrThrow13)) {
                                                                                                i17 = columnIndexOrThrow12;
                                                                                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                                                if (a2.isNull(columnIndexOrThrow12)) {
                                                                                                    i18 = columnIndexOrThrow11;
                                                                                                    columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                                    if (a2.isNull(columnIndexOrThrow11)) {
                                                                                                        i19 = columnIndexOrThrow10;
                                                                                                        columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                                        if (a2.isNull(columnIndexOrThrow10)) {
                                                                                                            i20 = columnIndexOrThrow9;
                                                                                                            columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                                            if (a2.isNull(columnIndexOrThrow9)) {
                                                                                                                i21 = columnIndexOrThrow8;
                                                                                                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                                                if (a2.isNull(columnIndexOrThrow8)) {
                                                                                                                    i22 = columnIndexOrThrow7;
                                                                                                                    columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                                                    if (a2.isNull(columnIndexOrThrow7)) {
                                                                                                                        i23 = columnIndexOrThrow;
                                                                                                                        i24 = columnIndexOrThrow14;
                                                                                                                        i25 = i2;
                                                                                                                        i26 = columnIndexOrThrow2;
                                                                                                                        i27 = columnIndexOrThrow3;
                                                                                                                        i28 = columnIndexOrThrow5;
                                                                                                                        i29 = columnIndexOrThrow6;
                                                                                                                        i2 = i7;
                                                                                                                        i30 = i8;
                                                                                                                        columnIndexOrThrow2 = i9;
                                                                                                                        columnIndexOrThrow3 = i10;
                                                                                                                        i31 = i11;
                                                                                                                        i32 = i12;
                                                                                                                        i33 = i13;
                                                                                                                        i34 = i14;
                                                                                                                        i35 = i15;
                                                                                                                        i36 = i16;
                                                                                                                        i37 = i17;
                                                                                                                        i38 = i18;
                                                                                                                        i39 = i19;
                                                                                                                        i40 = i20;
                                                                                                                        i41 = i21;
                                                                                                                        i42 = i22;
                                                                                                                        are = null;
                                                                                                                        asm = new asm();
                                                                                                                        asm.b = arp2;
                                                                                                                        asm.a = are;
                                                                                                                        arrayList = arrayList3;
                                                                                                                        arrayList.add(asm);
                                                                                                                        columnIndexOrThrow19 = i2;
                                                                                                                        columnIndexOrThrow21 = columnIndexOrThrow2;
                                                                                                                        columnIndexOrThrow22 = columnIndexOrThrow3;
                                                                                                                        columnIndexOrThrow24 = columnIndexOrThrow4;
                                                                                                                        columnIndexOrThrow35 = columnIndexOrThrow7;
                                                                                                                        columnIndexOrThrow34 = columnIndexOrThrow8;
                                                                                                                        columnIndexOrThrow33 = columnIndexOrThrow9;
                                                                                                                        columnIndexOrThrow32 = columnIndexOrThrow10;
                                                                                                                        columnIndexOrThrow31 = columnIndexOrThrow11;
                                                                                                                        columnIndexOrThrow30 = columnIndexOrThrow12;
                                                                                                                        columnIndexOrThrow29 = columnIndexOrThrow13;
                                                                                                                        columnIndexOrThrow2 = i4;
                                                                                                                        columnIndexOrThrow3 = i5;
                                                                                                                        columnIndexOrThrow4 = i6;
                                                                                                                        columnIndexOrThrow27 = i23;
                                                                                                                        columnIndexOrThrow23 = i24;
                                                                                                                        columnIndexOrThrow25 = i27;
                                                                                                                        columnIndexOrThrow26 = i26;
                                                                                                                        columnIndexOrThrow5 = i28;
                                                                                                                        columnIndexOrThrow28 = i25;
                                                                                                                        columnIndexOrThrow8 = i41;
                                                                                                                        columnIndexOrThrow9 = i40;
                                                                                                                        columnIndexOrThrow10 = i39;
                                                                                                                        columnIndexOrThrow11 = i38;
                                                                                                                        columnIndexOrThrow12 = i37;
                                                                                                                        columnIndexOrThrow13 = i36;
                                                                                                                        i = i35;
                                                                                                                        columnIndexOrThrow15 = i34;
                                                                                                                        columnIndexOrThrow16 = i33;
                                                                                                                        columnIndexOrThrow17 = i32;
                                                                                                                        columnIndexOrThrow18 = i31;
                                                                                                                        columnIndexOrThrow6 = i29;
                                                                                                                        columnIndexOrThrow7 = i42;
                                                                                                                        columnIndexOrThrow20 = i30;
                                                                                                                        arrayList2 = arrayList;
                                                                                                                        columnIndexOrThrow = i3;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i22 = columnIndexOrThrow7;
                                                                                                                    columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i22 = columnIndexOrThrow7;
                                                                                                                i21 = columnIndexOrThrow8;
                                                                                                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                                                columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i22 = columnIndexOrThrow7;
                                                                                                            i21 = columnIndexOrThrow8;
                                                                                                            i20 = columnIndexOrThrow9;
                                                                                                            columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                                            columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                                            columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i22 = columnIndexOrThrow7;
                                                                                                        i21 = columnIndexOrThrow8;
                                                                                                        i20 = columnIndexOrThrow9;
                                                                                                        i19 = columnIndexOrThrow10;
                                                                                                        columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                                        columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                                        columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                                        columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                                    }
                                                                                                } else {
                                                                                                    i22 = columnIndexOrThrow7;
                                                                                                    i21 = columnIndexOrThrow8;
                                                                                                    i20 = columnIndexOrThrow9;
                                                                                                    i19 = columnIndexOrThrow10;
                                                                                                    i18 = columnIndexOrThrow11;
                                                                                                    columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                                    columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                                    columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                                    columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                                    columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                                }
                                                                                            } else {
                                                                                                i22 = columnIndexOrThrow7;
                                                                                                i21 = columnIndexOrThrow8;
                                                                                                i20 = columnIndexOrThrow9;
                                                                                                i19 = columnIndexOrThrow10;
                                                                                                i18 = columnIndexOrThrow11;
                                                                                                i17 = columnIndexOrThrow12;
                                                                                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                                                columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                                columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                                columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                                columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                            }
                                                                                        } else {
                                                                                            i22 = columnIndexOrThrow7;
                                                                                            i21 = columnIndexOrThrow8;
                                                                                            i20 = columnIndexOrThrow9;
                                                                                            i19 = columnIndexOrThrow10;
                                                                                            i18 = columnIndexOrThrow11;
                                                                                            i17 = columnIndexOrThrow12;
                                                                                            i16 = columnIndexOrThrow13;
                                                                                            columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                                            columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                                            columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                            columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                            columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                            columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                            columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                        }
                                                                                    } else {
                                                                                        i15 = i2;
                                                                                        i22 = columnIndexOrThrow7;
                                                                                        i21 = columnIndexOrThrow8;
                                                                                        i20 = columnIndexOrThrow9;
                                                                                        i19 = columnIndexOrThrow10;
                                                                                        i18 = columnIndexOrThrow11;
                                                                                        i17 = columnIndexOrThrow12;
                                                                                        i16 = columnIndexOrThrow13;
                                                                                        i2 = columnIndexOrThrow28;
                                                                                        columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                                        columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                                        columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                        columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                        columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                        columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                        columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                    }
                                                                                } else {
                                                                                    i14 = columnIndexOrThrow;
                                                                                    i15 = i2;
                                                                                    i22 = columnIndexOrThrow7;
                                                                                    i21 = columnIndexOrThrow8;
                                                                                    i20 = columnIndexOrThrow9;
                                                                                    i19 = columnIndexOrThrow10;
                                                                                    i18 = columnIndexOrThrow11;
                                                                                    i17 = columnIndexOrThrow12;
                                                                                    i16 = columnIndexOrThrow13;
                                                                                    columnIndexOrThrow = columnIndexOrThrow27;
                                                                                    i2 = columnIndexOrThrow28;
                                                                                    columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                                    columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                                    columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                    columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                    columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                    columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                    columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                                }
                                                                            } else {
                                                                                i14 = columnIndexOrThrow;
                                                                                i15 = i2;
                                                                                i13 = columnIndexOrThrow2;
                                                                                i22 = columnIndexOrThrow7;
                                                                                i21 = columnIndexOrThrow8;
                                                                                i20 = columnIndexOrThrow9;
                                                                                i19 = columnIndexOrThrow10;
                                                                                i18 = columnIndexOrThrow11;
                                                                                i17 = columnIndexOrThrow12;
                                                                                i16 = columnIndexOrThrow13;
                                                                                columnIndexOrThrow2 = columnIndexOrThrow26;
                                                                                columnIndexOrThrow = columnIndexOrThrow27;
                                                                                i2 = columnIndexOrThrow28;
                                                                                columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                                columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                                columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                                columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                                columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                            }
                                                                        } else {
                                                                            i14 = columnIndexOrThrow;
                                                                            i15 = i2;
                                                                            i13 = columnIndexOrThrow2;
                                                                            i12 = columnIndexOrThrow3;
                                                                            i22 = columnIndexOrThrow7;
                                                                            i21 = columnIndexOrThrow8;
                                                                            i20 = columnIndexOrThrow9;
                                                                            i19 = columnIndexOrThrow10;
                                                                            i18 = columnIndexOrThrow11;
                                                                            i17 = columnIndexOrThrow12;
                                                                            i16 = columnIndexOrThrow13;
                                                                            columnIndexOrThrow3 = columnIndexOrThrow25;
                                                                            columnIndexOrThrow2 = columnIndexOrThrow26;
                                                                            columnIndexOrThrow = columnIndexOrThrow27;
                                                                            i2 = columnIndexOrThrow28;
                                                                            columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                            columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                            columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                            columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                            columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                            columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                            columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                        }
                                                                    } else {
                                                                        i14 = columnIndexOrThrow;
                                                                        i15 = i2;
                                                                        i13 = columnIndexOrThrow2;
                                                                        i12 = columnIndexOrThrow3;
                                                                        i11 = columnIndexOrThrow4;
                                                                        i22 = columnIndexOrThrow7;
                                                                        i21 = columnIndexOrThrow8;
                                                                        i20 = columnIndexOrThrow9;
                                                                        i19 = columnIndexOrThrow10;
                                                                        i18 = columnIndexOrThrow11;
                                                                        i17 = columnIndexOrThrow12;
                                                                        i16 = columnIndexOrThrow13;
                                                                        columnIndexOrThrow4 = columnIndexOrThrow24;
                                                                        columnIndexOrThrow3 = columnIndexOrThrow25;
                                                                        columnIndexOrThrow2 = columnIndexOrThrow26;
                                                                        columnIndexOrThrow = columnIndexOrThrow27;
                                                                        i2 = columnIndexOrThrow28;
                                                                        columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                        columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                        columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                        columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                        columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                        columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                        columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                    }
                                                                } else {
                                                                    i14 = columnIndexOrThrow;
                                                                    i10 = columnIndexOrThrow14;
                                                                    i15 = i2;
                                                                    i13 = columnIndexOrThrow2;
                                                                    i12 = columnIndexOrThrow3;
                                                                    i11 = columnIndexOrThrow4;
                                                                    i22 = columnIndexOrThrow7;
                                                                    i21 = columnIndexOrThrow8;
                                                                    i20 = columnIndexOrThrow9;
                                                                    i19 = columnIndexOrThrow10;
                                                                    i18 = columnIndexOrThrow11;
                                                                    i17 = columnIndexOrThrow12;
                                                                    i16 = columnIndexOrThrow13;
                                                                    columnIndexOrThrow14 = columnIndexOrThrow23;
                                                                    columnIndexOrThrow4 = columnIndexOrThrow24;
                                                                    columnIndexOrThrow3 = columnIndexOrThrow25;
                                                                    columnIndexOrThrow2 = columnIndexOrThrow26;
                                                                    columnIndexOrThrow = columnIndexOrThrow27;
                                                                    i2 = columnIndexOrThrow28;
                                                                    columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                    columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                    columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                    columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                    columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                    columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                    columnIndexOrThrow7 = columnIndexOrThrow35;
                                                                }
                                                            } else {
                                                                i14 = columnIndexOrThrow;
                                                                i9 = columnIndexOrThrow14;
                                                                i15 = i2;
                                                                i13 = columnIndexOrThrow2;
                                                                i12 = columnIndexOrThrow3;
                                                                i11 = columnIndexOrThrow4;
                                                                i22 = columnIndexOrThrow7;
                                                                i21 = columnIndexOrThrow8;
                                                                i20 = columnIndexOrThrow9;
                                                                i19 = columnIndexOrThrow10;
                                                                i18 = columnIndexOrThrow11;
                                                                i17 = columnIndexOrThrow12;
                                                                i16 = columnIndexOrThrow13;
                                                                i10 = columnIndexOrThrow22;
                                                                columnIndexOrThrow14 = columnIndexOrThrow23;
                                                                columnIndexOrThrow4 = columnIndexOrThrow24;
                                                                columnIndexOrThrow3 = columnIndexOrThrow25;
                                                                columnIndexOrThrow2 = columnIndexOrThrow26;
                                                                columnIndexOrThrow = columnIndexOrThrow27;
                                                                i2 = columnIndexOrThrow28;
                                                                columnIndexOrThrow13 = columnIndexOrThrow29;
                                                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                                                columnIndexOrThrow11 = columnIndexOrThrow31;
                                                                columnIndexOrThrow10 = columnIndexOrThrow32;
                                                                columnIndexOrThrow9 = columnIndexOrThrow33;
                                                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                                                columnIndexOrThrow7 = columnIndexOrThrow35;
                                                            }
                                                        } else {
                                                            i14 = columnIndexOrThrow;
                                                            i8 = columnIndexOrThrow14;
                                                            i15 = i2;
                                                            i13 = columnIndexOrThrow2;
                                                            i12 = columnIndexOrThrow3;
                                                            i11 = columnIndexOrThrow4;
                                                            i22 = columnIndexOrThrow7;
                                                            i21 = columnIndexOrThrow8;
                                                            i20 = columnIndexOrThrow9;
                                                            i19 = columnIndexOrThrow10;
                                                            i18 = columnIndexOrThrow11;
                                                            i17 = columnIndexOrThrow12;
                                                            i16 = columnIndexOrThrow13;
                                                            i9 = columnIndexOrThrow21;
                                                            i10 = columnIndexOrThrow22;
                                                            columnIndexOrThrow14 = columnIndexOrThrow23;
                                                            columnIndexOrThrow4 = columnIndexOrThrow24;
                                                            columnIndexOrThrow3 = columnIndexOrThrow25;
                                                            columnIndexOrThrow2 = columnIndexOrThrow26;
                                                            columnIndexOrThrow = columnIndexOrThrow27;
                                                            i2 = columnIndexOrThrow28;
                                                            columnIndexOrThrow13 = columnIndexOrThrow29;
                                                            columnIndexOrThrow12 = columnIndexOrThrow30;
                                                            columnIndexOrThrow11 = columnIndexOrThrow31;
                                                            columnIndexOrThrow10 = columnIndexOrThrow32;
                                                            columnIndexOrThrow9 = columnIndexOrThrow33;
                                                            columnIndexOrThrow8 = columnIndexOrThrow34;
                                                            columnIndexOrThrow7 = columnIndexOrThrow35;
                                                        }
                                                    } else {
                                                        i14 = columnIndexOrThrow;
                                                        i7 = columnIndexOrThrow14;
                                                        i15 = i2;
                                                        i13 = columnIndexOrThrow2;
                                                        i12 = columnIndexOrThrow3;
                                                        i11 = columnIndexOrThrow4;
                                                        i22 = columnIndexOrThrow7;
                                                        i21 = columnIndexOrThrow8;
                                                        i20 = columnIndexOrThrow9;
                                                        i19 = columnIndexOrThrow10;
                                                        i18 = columnIndexOrThrow11;
                                                        i17 = columnIndexOrThrow12;
                                                        i16 = columnIndexOrThrow13;
                                                        i8 = columnIndexOrThrow20;
                                                        i9 = columnIndexOrThrow21;
                                                        i10 = columnIndexOrThrow22;
                                                        columnIndexOrThrow14 = columnIndexOrThrow23;
                                                        columnIndexOrThrow4 = columnIndexOrThrow24;
                                                        columnIndexOrThrow3 = columnIndexOrThrow25;
                                                        columnIndexOrThrow2 = columnIndexOrThrow26;
                                                        columnIndexOrThrow = columnIndexOrThrow27;
                                                        i2 = columnIndexOrThrow28;
                                                        columnIndexOrThrow13 = columnIndexOrThrow29;
                                                        columnIndexOrThrow12 = columnIndexOrThrow30;
                                                        columnIndexOrThrow11 = columnIndexOrThrow31;
                                                        columnIndexOrThrow10 = columnIndexOrThrow32;
                                                        columnIndexOrThrow9 = columnIndexOrThrow33;
                                                        columnIndexOrThrow8 = columnIndexOrThrow34;
                                                        columnIndexOrThrow7 = columnIndexOrThrow35;
                                                    }
                                                } else {
                                                    i14 = columnIndexOrThrow;
                                                    arp2 = arp;
                                                    i15 = i2;
                                                    i13 = columnIndexOrThrow2;
                                                    i12 = columnIndexOrThrow3;
                                                    i11 = columnIndexOrThrow4;
                                                    i22 = columnIndexOrThrow7;
                                                    i21 = columnIndexOrThrow8;
                                                    i20 = columnIndexOrThrow9;
                                                    i19 = columnIndexOrThrow10;
                                                    i18 = columnIndexOrThrow11;
                                                    i17 = columnIndexOrThrow12;
                                                    i16 = columnIndexOrThrow13;
                                                    i7 = columnIndexOrThrow19;
                                                    i8 = columnIndexOrThrow20;
                                                    i9 = columnIndexOrThrow21;
                                                    i10 = columnIndexOrThrow22;
                                                    columnIndexOrThrow14 = columnIndexOrThrow23;
                                                    columnIndexOrThrow4 = columnIndexOrThrow24;
                                                    columnIndexOrThrow3 = columnIndexOrThrow25;
                                                    columnIndexOrThrow2 = columnIndexOrThrow26;
                                                    columnIndexOrThrow = columnIndexOrThrow27;
                                                    i2 = columnIndexOrThrow28;
                                                    columnIndexOrThrow13 = columnIndexOrThrow29;
                                                    columnIndexOrThrow12 = columnIndexOrThrow30;
                                                    columnIndexOrThrow11 = columnIndexOrThrow31;
                                                    columnIndexOrThrow10 = columnIndexOrThrow32;
                                                    columnIndexOrThrow9 = columnIndexOrThrow33;
                                                    columnIndexOrThrow8 = columnIndexOrThrow34;
                                                    columnIndexOrThrow7 = columnIndexOrThrow35;
                                                }
                                            } else {
                                                i14 = columnIndexOrThrow;
                                                arp2 = arp;
                                                i15 = i2;
                                                i13 = columnIndexOrThrow2;
                                                i12 = columnIndexOrThrow3;
                                                i6 = columnIndexOrThrow4;
                                                i22 = columnIndexOrThrow7;
                                                i21 = columnIndexOrThrow8;
                                                i20 = columnIndexOrThrow9;
                                                i19 = columnIndexOrThrow10;
                                                i18 = columnIndexOrThrow11;
                                                i17 = columnIndexOrThrow12;
                                                i16 = columnIndexOrThrow13;
                                                i11 = columnIndexOrThrow18;
                                                i7 = columnIndexOrThrow19;
                                                i8 = columnIndexOrThrow20;
                                                i9 = columnIndexOrThrow21;
                                                i10 = columnIndexOrThrow22;
                                                columnIndexOrThrow14 = columnIndexOrThrow23;
                                                columnIndexOrThrow4 = columnIndexOrThrow24;
                                                columnIndexOrThrow3 = columnIndexOrThrow25;
                                                columnIndexOrThrow2 = columnIndexOrThrow26;
                                                columnIndexOrThrow = columnIndexOrThrow27;
                                                i2 = columnIndexOrThrow28;
                                                columnIndexOrThrow13 = columnIndexOrThrow29;
                                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                                columnIndexOrThrow11 = columnIndexOrThrow31;
                                                columnIndexOrThrow10 = columnIndexOrThrow32;
                                                columnIndexOrThrow9 = columnIndexOrThrow33;
                                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                                columnIndexOrThrow7 = columnIndexOrThrow35;
                                            }
                                        } else {
                                            i14 = columnIndexOrThrow;
                                            arp2 = arp;
                                            i15 = i2;
                                            i13 = columnIndexOrThrow2;
                                            i5 = columnIndexOrThrow3;
                                            i6 = columnIndexOrThrow4;
                                            i22 = columnIndexOrThrow7;
                                            i21 = columnIndexOrThrow8;
                                            i20 = columnIndexOrThrow9;
                                            i19 = columnIndexOrThrow10;
                                            i18 = columnIndexOrThrow11;
                                            i17 = columnIndexOrThrow12;
                                            i16 = columnIndexOrThrow13;
                                            i12 = columnIndexOrThrow17;
                                            i11 = columnIndexOrThrow18;
                                            i7 = columnIndexOrThrow19;
                                            i8 = columnIndexOrThrow20;
                                            i9 = columnIndexOrThrow21;
                                            i10 = columnIndexOrThrow22;
                                            columnIndexOrThrow14 = columnIndexOrThrow23;
                                            columnIndexOrThrow4 = columnIndexOrThrow24;
                                            columnIndexOrThrow3 = columnIndexOrThrow25;
                                            columnIndexOrThrow2 = columnIndexOrThrow26;
                                            columnIndexOrThrow = columnIndexOrThrow27;
                                            i2 = columnIndexOrThrow28;
                                            columnIndexOrThrow13 = columnIndexOrThrow29;
                                            columnIndexOrThrow12 = columnIndexOrThrow30;
                                            columnIndexOrThrow11 = columnIndexOrThrow31;
                                            columnIndexOrThrow10 = columnIndexOrThrow32;
                                            columnIndexOrThrow9 = columnIndexOrThrow33;
                                            columnIndexOrThrow8 = columnIndexOrThrow34;
                                            columnIndexOrThrow7 = columnIndexOrThrow35;
                                        }
                                    } else {
                                        i14 = columnIndexOrThrow;
                                        arp2 = arp;
                                        i15 = i2;
                                        i4 = columnIndexOrThrow2;
                                        i5 = columnIndexOrThrow3;
                                        i6 = columnIndexOrThrow4;
                                        i22 = columnIndexOrThrow7;
                                        i21 = columnIndexOrThrow8;
                                        i20 = columnIndexOrThrow9;
                                        i19 = columnIndexOrThrow10;
                                        i18 = columnIndexOrThrow11;
                                        i17 = columnIndexOrThrow12;
                                        i16 = columnIndexOrThrow13;
                                    }
                                } else {
                                    i3 = columnIndexOrThrow;
                                    arp2 = arp;
                                    i15 = i2;
                                    i4 = columnIndexOrThrow2;
                                    i5 = columnIndexOrThrow3;
                                    i6 = columnIndexOrThrow4;
                                    i22 = columnIndexOrThrow7;
                                    i21 = columnIndexOrThrow8;
                                    i20 = columnIndexOrThrow9;
                                    i19 = columnIndexOrThrow10;
                                    i18 = columnIndexOrThrow11;
                                    i17 = columnIndexOrThrow12;
                                    i16 = columnIndexOrThrow13;
                                    i14 = columnIndexOrThrow15;
                                }
                                i13 = columnIndexOrThrow16;
                                i12 = columnIndexOrThrow17;
                                i11 = columnIndexOrThrow18;
                                i7 = columnIndexOrThrow19;
                                i8 = columnIndexOrThrow20;
                                i9 = columnIndexOrThrow21;
                                i10 = columnIndexOrThrow22;
                                columnIndexOrThrow14 = columnIndexOrThrow23;
                                columnIndexOrThrow4 = columnIndexOrThrow24;
                                columnIndexOrThrow3 = columnIndexOrThrow25;
                                columnIndexOrThrow2 = columnIndexOrThrow26;
                                columnIndexOrThrow = columnIndexOrThrow27;
                                i2 = columnIndexOrThrow28;
                                columnIndexOrThrow13 = columnIndexOrThrow29;
                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                columnIndexOrThrow11 = columnIndexOrThrow31;
                                columnIndexOrThrow10 = columnIndexOrThrow32;
                                columnIndexOrThrow9 = columnIndexOrThrow33;
                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                columnIndexOrThrow7 = columnIndexOrThrow35;
                            } else {
                                i3 = columnIndexOrThrow;
                                arp2 = arp;
                                i4 = columnIndexOrThrow2;
                                i5 = columnIndexOrThrow3;
                                i6 = columnIndexOrThrow4;
                                i22 = columnIndexOrThrow7;
                                i21 = columnIndexOrThrow8;
                                i20 = columnIndexOrThrow9;
                                i19 = columnIndexOrThrow10;
                                i18 = columnIndexOrThrow11;
                                i17 = columnIndexOrThrow12;
                                i16 = columnIndexOrThrow13;
                                i14 = columnIndexOrThrow15;
                                i13 = columnIndexOrThrow16;
                                i12 = columnIndexOrThrow17;
                                i11 = columnIndexOrThrow18;
                                i7 = columnIndexOrThrow19;
                                i8 = columnIndexOrThrow20;
                                i9 = columnIndexOrThrow21;
                                i10 = columnIndexOrThrow22;
                                columnIndexOrThrow14 = columnIndexOrThrow23;
                                columnIndexOrThrow4 = columnIndexOrThrow24;
                                columnIndexOrThrow3 = columnIndexOrThrow25;
                                columnIndexOrThrow2 = columnIndexOrThrow26;
                                columnIndexOrThrow = columnIndexOrThrow27;
                                i2 = columnIndexOrThrow28;
                                columnIndexOrThrow13 = columnIndexOrThrow29;
                                columnIndexOrThrow12 = columnIndexOrThrow30;
                                columnIndexOrThrow11 = columnIndexOrThrow31;
                                columnIndexOrThrow10 = columnIndexOrThrow32;
                                columnIndexOrThrow9 = columnIndexOrThrow33;
                                columnIndexOrThrow8 = columnIndexOrThrow34;
                                columnIndexOrThrow7 = columnIndexOrThrow35;
                                i15 = i;
                            }
                            if (a2.isNull(columnIndexOrThrow14) && a2.isNull(columnIndexOrThrow4) && a2.isNull(columnIndexOrThrow3) && a2.isNull(columnIndexOrThrow2) && a2.isNull(columnIndexOrThrow) && a2.isNull(i2) && a2.isNull(columnIndexOrThrow13) && a2.isNull(columnIndexOrThrow12) && a2.isNull(columnIndexOrThrow11)) {
                                if (!a2.isNull(columnIndexOrThrow10)) {
                                    i43 = columnIndexOrThrow5;
                                    i44 = columnIndexOrThrow6;
                                    asr = null;
                                    if (a2.isNull(columnIndexOrThrow9) && a2.isNull(columnIndexOrThrow8)) {
                                        if (!a2.isNull(columnIndexOrThrow7)) {
                                            i23 = columnIndexOrThrow;
                                            i24 = columnIndexOrThrow14;
                                            arq = null;
                                            are = new are();
                                            i26 = columnIndexOrThrow2;
                                            i27 = columnIndexOrThrow3;
                                            columnIndexOrThrow14 = i43;
                                            are.a(a2.getLong(columnIndexOrThrow14));
                                            columnIndexOrThrow2 = i44;
                                            are.a(a2.getString(columnIndexOrThrow2));
                                            i28 = columnIndexOrThrow14;
                                            columnIndexOrThrow3 = i22;
                                            are.b(a2.getString(columnIndexOrThrow3));
                                            i25 = i2;
                                            columnIndexOrThrow14 = i21;
                                            are.a(a2.getInt(columnIndexOrThrow14));
                                            i41 = columnIndexOrThrow14;
                                            i2 = i20;
                                            are.b(a2.getInt(i2));
                                            i40 = i2;
                                            columnIndexOrThrow14 = i19;
                                            are.c(a2.getInt(columnIndexOrThrow14));
                                            i39 = columnIndexOrThrow14;
                                            i2 = i18;
                                            are.c(a2.getString(i2));
                                            i38 = i2;
                                            columnIndexOrThrow14 = i17;
                                            are.d(a2.getString(columnIndexOrThrow14));
                                            i37 = columnIndexOrThrow14;
                                            i2 = i16;
                                            are.e(a2.getString(i2));
                                            i36 = i2;
                                            columnIndexOrThrow14 = i15;
                                            are.d(a2.getInt(columnIndexOrThrow14));
                                            i35 = columnIndexOrThrow14;
                                            i2 = i14;
                                            are.f(a2.getString(i2));
                                            i34 = i2;
                                            columnIndexOrThrow14 = i13;
                                            are.g(a2.getString(columnIndexOrThrow14));
                                            i33 = columnIndexOrThrow14;
                                            i2 = i12;
                                            are.e(a2.getInt(i2));
                                            i32 = i2;
                                            columnIndexOrThrow14 = i11;
                                            are.f(a2.getInt(columnIndexOrThrow14));
                                            i31 = columnIndexOrThrow14;
                                            i2 = i7;
                                            are.g(a2.getInt(i2));
                                            i29 = columnIndexOrThrow2;
                                            i42 = columnIndexOrThrow3;
                                            columnIndexOrThrow14 = i8;
                                            are.b(a2.getLong(columnIndexOrThrow14));
                                            columnIndexOrThrow2 = i9;
                                            are.h(a2.getString(columnIndexOrThrow2));
                                            i30 = columnIndexOrThrow14;
                                            columnIndexOrThrow3 = i10;
                                            are.h(a2.getInt(columnIndexOrThrow3));
                                            are.a(asr);
                                            are.a(arq);
                                            asm = new asm();
                                            asm.b = arp2;
                                            asm.a = are;
                                            arrayList = arrayList3;
                                            arrayList.add(asm);
                                            columnIndexOrThrow19 = i2;
                                            columnIndexOrThrow21 = columnIndexOrThrow2;
                                            columnIndexOrThrow22 = columnIndexOrThrow3;
                                            columnIndexOrThrow24 = columnIndexOrThrow4;
                                            columnIndexOrThrow35 = columnIndexOrThrow7;
                                            columnIndexOrThrow34 = columnIndexOrThrow8;
                                            columnIndexOrThrow33 = columnIndexOrThrow9;
                                            columnIndexOrThrow32 = columnIndexOrThrow10;
                                            columnIndexOrThrow31 = columnIndexOrThrow11;
                                            columnIndexOrThrow30 = columnIndexOrThrow12;
                                            columnIndexOrThrow29 = columnIndexOrThrow13;
                                            columnIndexOrThrow2 = i4;
                                            columnIndexOrThrow3 = i5;
                                            columnIndexOrThrow4 = i6;
                                            columnIndexOrThrow27 = i23;
                                            columnIndexOrThrow23 = i24;
                                            columnIndexOrThrow25 = i27;
                                            columnIndexOrThrow26 = i26;
                                            columnIndexOrThrow5 = i28;
                                            columnIndexOrThrow28 = i25;
                                            columnIndexOrThrow8 = i41;
                                            columnIndexOrThrow9 = i40;
                                            columnIndexOrThrow10 = i39;
                                            columnIndexOrThrow11 = i38;
                                            columnIndexOrThrow12 = i37;
                                            columnIndexOrThrow13 = i36;
                                            i = i35;
                                            columnIndexOrThrow15 = i34;
                                            columnIndexOrThrow16 = i33;
                                            columnIndexOrThrow17 = i32;
                                            columnIndexOrThrow18 = i31;
                                            columnIndexOrThrow6 = i29;
                                            columnIndexOrThrow7 = i42;
                                            columnIndexOrThrow20 = i30;
                                            arrayList2 = arrayList;
                                            columnIndexOrThrow = i3;
                                        }
                                    }
                                    arq = new arq();
                                    if (a2.isNull(columnIndexOrThrow9)) {
                                        i23 = columnIndexOrThrow;
                                        arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow9));
                                    } else {
                                        i23 = columnIndexOrThrow;
                                        arq.a = null;
                                    }
                                    i24 = columnIndexOrThrow14;
                                    arq.b = a2.getLong(columnIndexOrThrow8);
                                    arq.c = a2.getInt(columnIndexOrThrow7);
                                    are = new are();
                                    i26 = columnIndexOrThrow2;
                                    i27 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i43;
                                    are.a(a2.getLong(columnIndexOrThrow14));
                                    columnIndexOrThrow2 = i44;
                                    are.a(a2.getString(columnIndexOrThrow2));
                                    i28 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i22;
                                    are.b(a2.getString(columnIndexOrThrow3));
                                    i25 = i2;
                                    columnIndexOrThrow14 = i21;
                                    are.a(a2.getInt(columnIndexOrThrow14));
                                    i41 = columnIndexOrThrow14;
                                    i2 = i20;
                                    are.b(a2.getInt(i2));
                                    i40 = i2;
                                    columnIndexOrThrow14 = i19;
                                    are.c(a2.getInt(columnIndexOrThrow14));
                                    i39 = columnIndexOrThrow14;
                                    i2 = i18;
                                    are.c(a2.getString(i2));
                                    i38 = i2;
                                    columnIndexOrThrow14 = i17;
                                    are.d(a2.getString(columnIndexOrThrow14));
                                    i37 = columnIndexOrThrow14;
                                    i2 = i16;
                                    are.e(a2.getString(i2));
                                    i36 = i2;
                                    columnIndexOrThrow14 = i15;
                                    are.d(a2.getInt(columnIndexOrThrow14));
                                    i35 = columnIndexOrThrow14;
                                    i2 = i14;
                                    are.f(a2.getString(i2));
                                    i34 = i2;
                                    columnIndexOrThrow14 = i13;
                                    are.g(a2.getString(columnIndexOrThrow14));
                                    i33 = columnIndexOrThrow14;
                                    i2 = i12;
                                    are.e(a2.getInt(i2));
                                    i32 = i2;
                                    columnIndexOrThrow14 = i11;
                                    are.f(a2.getInt(columnIndexOrThrow14));
                                    i31 = columnIndexOrThrow14;
                                    i2 = i7;
                                    are.g(a2.getInt(i2));
                                    i29 = columnIndexOrThrow2;
                                    i42 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i8;
                                    are.b(a2.getLong(columnIndexOrThrow14));
                                    columnIndexOrThrow2 = i9;
                                    are.h(a2.getString(columnIndexOrThrow2));
                                    i30 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i10;
                                    are.h(a2.getInt(columnIndexOrThrow3));
                                    are.a(asr);
                                    are.a(arq);
                                    asm = new asm();
                                    asm.b = arp2;
                                    asm.a = are;
                                    arrayList = arrayList3;
                                    arrayList.add(asm);
                                    columnIndexOrThrow19 = i2;
                                    columnIndexOrThrow21 = columnIndexOrThrow2;
                                    columnIndexOrThrow22 = columnIndexOrThrow3;
                                    columnIndexOrThrow24 = columnIndexOrThrow4;
                                    columnIndexOrThrow35 = columnIndexOrThrow7;
                                    columnIndexOrThrow34 = columnIndexOrThrow8;
                                    columnIndexOrThrow33 = columnIndexOrThrow9;
                                    columnIndexOrThrow32 = columnIndexOrThrow10;
                                    columnIndexOrThrow31 = columnIndexOrThrow11;
                                    columnIndexOrThrow30 = columnIndexOrThrow12;
                                    columnIndexOrThrow29 = columnIndexOrThrow13;
                                    columnIndexOrThrow2 = i4;
                                    columnIndexOrThrow3 = i5;
                                    columnIndexOrThrow4 = i6;
                                    columnIndexOrThrow27 = i23;
                                    columnIndexOrThrow23 = i24;
                                    columnIndexOrThrow25 = i27;
                                    columnIndexOrThrow26 = i26;
                                    columnIndexOrThrow5 = i28;
                                    columnIndexOrThrow28 = i25;
                                    columnIndexOrThrow8 = i41;
                                    columnIndexOrThrow9 = i40;
                                    columnIndexOrThrow10 = i39;
                                    columnIndexOrThrow11 = i38;
                                    columnIndexOrThrow12 = i37;
                                    columnIndexOrThrow13 = i36;
                                    i = i35;
                                    columnIndexOrThrow15 = i34;
                                    columnIndexOrThrow16 = i33;
                                    columnIndexOrThrow17 = i32;
                                    columnIndexOrThrow18 = i31;
                                    columnIndexOrThrow6 = i29;
                                    columnIndexOrThrow7 = i42;
                                    columnIndexOrThrow20 = i30;
                                    arrayList2 = arrayList;
                                    columnIndexOrThrow = i3;
                                }
                            }
                            i44 = columnIndexOrThrow6;
                            asr = new asr();
                            i43 = columnIndexOrThrow5;
                            asr.a = a2.getInt(columnIndexOrThrow14);
                            asr.b = a2.getInt(columnIndexOrThrow4);
                            asr.c = a2.getString(columnIndexOrThrow3);
                            asr.d = a2.getString(columnIndexOrThrow2);
                            asr.e = a2.getString(columnIndexOrThrow);
                            asr.f = a2.getString(i2);
                            asr.g = a2.getString(columnIndexOrThrow13);
                            asr.h = a2.getString(columnIndexOrThrow12);
                            asr.i = a2.getString(columnIndexOrThrow11);
                            asr.j = a2.getString(columnIndexOrThrow10);
                            if (!a2.isNull(columnIndexOrThrow7)) {
                                i23 = columnIndexOrThrow;
                                i24 = columnIndexOrThrow14;
                                arq = null;
                                are = new are();
                                i26 = columnIndexOrThrow2;
                                i27 = columnIndexOrThrow3;
                                columnIndexOrThrow14 = i43;
                                are.a(a2.getLong(columnIndexOrThrow14));
                                columnIndexOrThrow2 = i44;
                                are.a(a2.getString(columnIndexOrThrow2));
                                i28 = columnIndexOrThrow14;
                                columnIndexOrThrow3 = i22;
                                are.b(a2.getString(columnIndexOrThrow3));
                                i25 = i2;
                                columnIndexOrThrow14 = i21;
                                are.a(a2.getInt(columnIndexOrThrow14));
                                i41 = columnIndexOrThrow14;
                                i2 = i20;
                                are.b(a2.getInt(i2));
                                i40 = i2;
                                columnIndexOrThrow14 = i19;
                                are.c(a2.getInt(columnIndexOrThrow14));
                                i39 = columnIndexOrThrow14;
                                i2 = i18;
                                are.c(a2.getString(i2));
                                i38 = i2;
                                columnIndexOrThrow14 = i17;
                                are.d(a2.getString(columnIndexOrThrow14));
                                i37 = columnIndexOrThrow14;
                                i2 = i16;
                                are.e(a2.getString(i2));
                                i36 = i2;
                                columnIndexOrThrow14 = i15;
                                are.d(a2.getInt(columnIndexOrThrow14));
                                i35 = columnIndexOrThrow14;
                                i2 = i14;
                                are.f(a2.getString(i2));
                                i34 = i2;
                                columnIndexOrThrow14 = i13;
                                are.g(a2.getString(columnIndexOrThrow14));
                                i33 = columnIndexOrThrow14;
                                i2 = i12;
                                are.e(a2.getInt(i2));
                                i32 = i2;
                                columnIndexOrThrow14 = i11;
                                are.f(a2.getInt(columnIndexOrThrow14));
                                i31 = columnIndexOrThrow14;
                                i2 = i7;
                                are.g(a2.getInt(i2));
                                i29 = columnIndexOrThrow2;
                                i42 = columnIndexOrThrow3;
                                columnIndexOrThrow14 = i8;
                                are.b(a2.getLong(columnIndexOrThrow14));
                                columnIndexOrThrow2 = i9;
                                are.h(a2.getString(columnIndexOrThrow2));
                                i30 = columnIndexOrThrow14;
                                columnIndexOrThrow3 = i10;
                                are.h(a2.getInt(columnIndexOrThrow3));
                                are.a(asr);
                                are.a(arq);
                                asm = new asm();
                                asm.b = arp2;
                                asm.a = are;
                                arrayList = arrayList3;
                                arrayList.add(asm);
                                columnIndexOrThrow19 = i2;
                                columnIndexOrThrow21 = columnIndexOrThrow2;
                                columnIndexOrThrow22 = columnIndexOrThrow3;
                                columnIndexOrThrow24 = columnIndexOrThrow4;
                                columnIndexOrThrow35 = columnIndexOrThrow7;
                                columnIndexOrThrow34 = columnIndexOrThrow8;
                                columnIndexOrThrow33 = columnIndexOrThrow9;
                                columnIndexOrThrow32 = columnIndexOrThrow10;
                                columnIndexOrThrow31 = columnIndexOrThrow11;
                                columnIndexOrThrow30 = columnIndexOrThrow12;
                                columnIndexOrThrow29 = columnIndexOrThrow13;
                                columnIndexOrThrow2 = i4;
                                columnIndexOrThrow3 = i5;
                                columnIndexOrThrow4 = i6;
                                columnIndexOrThrow27 = i23;
                                columnIndexOrThrow23 = i24;
                                columnIndexOrThrow25 = i27;
                                columnIndexOrThrow26 = i26;
                                columnIndexOrThrow5 = i28;
                                columnIndexOrThrow28 = i25;
                                columnIndexOrThrow8 = i41;
                                columnIndexOrThrow9 = i40;
                                columnIndexOrThrow10 = i39;
                                columnIndexOrThrow11 = i38;
                                columnIndexOrThrow12 = i37;
                                columnIndexOrThrow13 = i36;
                                i = i35;
                                columnIndexOrThrow15 = i34;
                                columnIndexOrThrow16 = i33;
                                columnIndexOrThrow17 = i32;
                                columnIndexOrThrow18 = i31;
                                columnIndexOrThrow6 = i29;
                                columnIndexOrThrow7 = i42;
                                columnIndexOrThrow20 = i30;
                                arrayList2 = arrayList;
                                columnIndexOrThrow = i3;
                            } else {
                                arq = new arq();
                                if (a2.isNull(columnIndexOrThrow9)) {
                                    i23 = columnIndexOrThrow;
                                    arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow9));
                                } else {
                                    i23 = columnIndexOrThrow;
                                    arq.a = null;
                                }
                                i24 = columnIndexOrThrow14;
                                arq.b = a2.getLong(columnIndexOrThrow8);
                                arq.c = a2.getInt(columnIndexOrThrow7);
                                are = new are();
                                i26 = columnIndexOrThrow2;
                                i27 = columnIndexOrThrow3;
                                columnIndexOrThrow14 = i43;
                                are.a(a2.getLong(columnIndexOrThrow14));
                                columnIndexOrThrow2 = i44;
                                are.a(a2.getString(columnIndexOrThrow2));
                                i28 = columnIndexOrThrow14;
                                columnIndexOrThrow3 = i22;
                                are.b(a2.getString(columnIndexOrThrow3));
                                i25 = i2;
                                columnIndexOrThrow14 = i21;
                                are.a(a2.getInt(columnIndexOrThrow14));
                                i41 = columnIndexOrThrow14;
                                i2 = i20;
                                are.b(a2.getInt(i2));
                                i40 = i2;
                                columnIndexOrThrow14 = i19;
                                are.c(a2.getInt(columnIndexOrThrow14));
                                i39 = columnIndexOrThrow14;
                                i2 = i18;
                                are.c(a2.getString(i2));
                                i38 = i2;
                                columnIndexOrThrow14 = i17;
                                are.d(a2.getString(columnIndexOrThrow14));
                                i37 = columnIndexOrThrow14;
                                i2 = i16;
                                are.e(a2.getString(i2));
                                i36 = i2;
                                columnIndexOrThrow14 = i15;
                                are.d(a2.getInt(columnIndexOrThrow14));
                                i35 = columnIndexOrThrow14;
                                i2 = i14;
                                are.f(a2.getString(i2));
                                i34 = i2;
                                columnIndexOrThrow14 = i13;
                                are.g(a2.getString(columnIndexOrThrow14));
                                i33 = columnIndexOrThrow14;
                                i2 = i12;
                                are.e(a2.getInt(i2));
                                i32 = i2;
                                columnIndexOrThrow14 = i11;
                                are.f(a2.getInt(columnIndexOrThrow14));
                                i31 = columnIndexOrThrow14;
                                i2 = i7;
                                are.g(a2.getInt(i2));
                                i29 = columnIndexOrThrow2;
                                i42 = columnIndexOrThrow3;
                                columnIndexOrThrow14 = i8;
                                are.b(a2.getLong(columnIndexOrThrow14));
                                columnIndexOrThrow2 = i9;
                                are.h(a2.getString(columnIndexOrThrow2));
                                i30 = columnIndexOrThrow14;
                                columnIndexOrThrow3 = i10;
                                are.h(a2.getInt(columnIndexOrThrow3));
                                are.a(asr);
                                are.a(arq);
                                asm = new asm();
                                asm.b = arp2;
                                asm.a = are;
                                arrayList = arrayList3;
                                arrayList.add(asm);
                                columnIndexOrThrow19 = i2;
                                columnIndexOrThrow21 = columnIndexOrThrow2;
                                columnIndexOrThrow22 = columnIndexOrThrow3;
                                columnIndexOrThrow24 = columnIndexOrThrow4;
                                columnIndexOrThrow35 = columnIndexOrThrow7;
                                columnIndexOrThrow34 = columnIndexOrThrow8;
                                columnIndexOrThrow33 = columnIndexOrThrow9;
                                columnIndexOrThrow32 = columnIndexOrThrow10;
                                columnIndexOrThrow31 = columnIndexOrThrow11;
                                columnIndexOrThrow30 = columnIndexOrThrow12;
                                columnIndexOrThrow29 = columnIndexOrThrow13;
                                columnIndexOrThrow2 = i4;
                                columnIndexOrThrow3 = i5;
                                columnIndexOrThrow4 = i6;
                                columnIndexOrThrow27 = i23;
                                columnIndexOrThrow23 = i24;
                                columnIndexOrThrow25 = i27;
                                columnIndexOrThrow26 = i26;
                                columnIndexOrThrow5 = i28;
                                columnIndexOrThrow28 = i25;
                                columnIndexOrThrow8 = i41;
                                columnIndexOrThrow9 = i40;
                                columnIndexOrThrow10 = i39;
                                columnIndexOrThrow11 = i38;
                                columnIndexOrThrow12 = i37;
                                columnIndexOrThrow13 = i36;
                                i = i35;
                                columnIndexOrThrow15 = i34;
                                columnIndexOrThrow16 = i33;
                                columnIndexOrThrow17 = i32;
                                columnIndexOrThrow18 = i31;
                                columnIndexOrThrow6 = i29;
                                columnIndexOrThrow7 = i42;
                                columnIndexOrThrow20 = i30;
                                arrayList2 = arrayList;
                                columnIndexOrThrow = i3;
                            }
                        }
                    }
                    arp arp3 = new arp(a2.getLong(columnIndexOrThrow), a2.getString(columnIndexOrThrow3), a2.getString(columnIndexOrThrow4), a2.getLong(columnIndexOrThrow2));
                    if (!a2.isNull(columnIndexOrThrow5)) {
                    }
                    i3 = columnIndexOrThrow;
                    arp2 = arp;
                    i4 = columnIndexOrThrow2;
                    i5 = columnIndexOrThrow3;
                    i6 = columnIndexOrThrow4;
                    i22 = columnIndexOrThrow7;
                    i21 = columnIndexOrThrow8;
                    i20 = columnIndexOrThrow9;
                    i19 = columnIndexOrThrow10;
                    i18 = columnIndexOrThrow11;
                    i17 = columnIndexOrThrow12;
                    i16 = columnIndexOrThrow13;
                    i14 = columnIndexOrThrow15;
                    i13 = columnIndexOrThrow16;
                    i12 = columnIndexOrThrow17;
                    i11 = columnIndexOrThrow18;
                    i7 = columnIndexOrThrow19;
                    i8 = columnIndexOrThrow20;
                    i9 = columnIndexOrThrow21;
                    i10 = columnIndexOrThrow22;
                    columnIndexOrThrow14 = columnIndexOrThrow23;
                    columnIndexOrThrow4 = columnIndexOrThrow24;
                    columnIndexOrThrow3 = columnIndexOrThrow25;
                    columnIndexOrThrow2 = columnIndexOrThrow26;
                    columnIndexOrThrow = columnIndexOrThrow27;
                    i2 = columnIndexOrThrow28;
                    columnIndexOrThrow13 = columnIndexOrThrow29;
                    columnIndexOrThrow12 = columnIndexOrThrow30;
                    columnIndexOrThrow11 = columnIndexOrThrow31;
                    columnIndexOrThrow10 = columnIndexOrThrow32;
                    columnIndexOrThrow9 = columnIndexOrThrow33;
                    columnIndexOrThrow8 = columnIndexOrThrow34;
                    columnIndexOrThrow7 = columnIndexOrThrow35;
                    i15 = i;
                    if (!a2.isNull(columnIndexOrThrow10)) {
                        i43 = columnIndexOrThrow5;
                        i44 = columnIndexOrThrow6;
                        asr = null;
                        if (!a2.isNull(columnIndexOrThrow7)) {
                            arq = new arq();
                            if (a2.isNull(columnIndexOrThrow9)) {
                                i23 = columnIndexOrThrow;
                                arq.a = null;
                            } else {
                                i23 = columnIndexOrThrow;
                                arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow9));
                            }
                            i24 = columnIndexOrThrow14;
                            arq.b = a2.getLong(columnIndexOrThrow8);
                            arq.c = a2.getInt(columnIndexOrThrow7);
                            are = new are();
                            i26 = columnIndexOrThrow2;
                            i27 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i43;
                            are.a(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i44;
                            are.a(a2.getString(columnIndexOrThrow2));
                            i28 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i22;
                            are.b(a2.getString(columnIndexOrThrow3));
                            i25 = i2;
                            columnIndexOrThrow14 = i21;
                            are.a(a2.getInt(columnIndexOrThrow14));
                            i41 = columnIndexOrThrow14;
                            i2 = i20;
                            are.b(a2.getInt(i2));
                            i40 = i2;
                            columnIndexOrThrow14 = i19;
                            are.c(a2.getInt(columnIndexOrThrow14));
                            i39 = columnIndexOrThrow14;
                            i2 = i18;
                            are.c(a2.getString(i2));
                            i38 = i2;
                            columnIndexOrThrow14 = i17;
                            are.d(a2.getString(columnIndexOrThrow14));
                            i37 = columnIndexOrThrow14;
                            i2 = i16;
                            are.e(a2.getString(i2));
                            i36 = i2;
                            columnIndexOrThrow14 = i15;
                            are.d(a2.getInt(columnIndexOrThrow14));
                            i35 = columnIndexOrThrow14;
                            i2 = i14;
                            are.f(a2.getString(i2));
                            i34 = i2;
                            columnIndexOrThrow14 = i13;
                            are.g(a2.getString(columnIndexOrThrow14));
                            i33 = columnIndexOrThrow14;
                            i2 = i12;
                            are.e(a2.getInt(i2));
                            i32 = i2;
                            columnIndexOrThrow14 = i11;
                            are.f(a2.getInt(columnIndexOrThrow14));
                            i31 = columnIndexOrThrow14;
                            i2 = i7;
                            are.g(a2.getInt(i2));
                            i29 = columnIndexOrThrow2;
                            i42 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i8;
                            are.b(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i9;
                            are.h(a2.getString(columnIndexOrThrow2));
                            i30 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i10;
                            are.h(a2.getInt(columnIndexOrThrow3));
                            are.a(asr);
                            are.a(arq);
                            asm = new asm();
                            asm.b = arp2;
                            asm.a = are;
                            arrayList = arrayList3;
                            arrayList.add(asm);
                            columnIndexOrThrow19 = i2;
                            columnIndexOrThrow21 = columnIndexOrThrow2;
                            columnIndexOrThrow22 = columnIndexOrThrow3;
                            columnIndexOrThrow24 = columnIndexOrThrow4;
                            columnIndexOrThrow35 = columnIndexOrThrow7;
                            columnIndexOrThrow34 = columnIndexOrThrow8;
                            columnIndexOrThrow33 = columnIndexOrThrow9;
                            columnIndexOrThrow32 = columnIndexOrThrow10;
                            columnIndexOrThrow31 = columnIndexOrThrow11;
                            columnIndexOrThrow30 = columnIndexOrThrow12;
                            columnIndexOrThrow29 = columnIndexOrThrow13;
                            columnIndexOrThrow2 = i4;
                            columnIndexOrThrow3 = i5;
                            columnIndexOrThrow4 = i6;
                            columnIndexOrThrow27 = i23;
                            columnIndexOrThrow23 = i24;
                            columnIndexOrThrow25 = i27;
                            columnIndexOrThrow26 = i26;
                            columnIndexOrThrow5 = i28;
                            columnIndexOrThrow28 = i25;
                            columnIndexOrThrow8 = i41;
                            columnIndexOrThrow9 = i40;
                            columnIndexOrThrow10 = i39;
                            columnIndexOrThrow11 = i38;
                            columnIndexOrThrow12 = i37;
                            columnIndexOrThrow13 = i36;
                            i = i35;
                            columnIndexOrThrow15 = i34;
                            columnIndexOrThrow16 = i33;
                            columnIndexOrThrow17 = i32;
                            columnIndexOrThrow18 = i31;
                            columnIndexOrThrow6 = i29;
                            columnIndexOrThrow7 = i42;
                            columnIndexOrThrow20 = i30;
                            arrayList2 = arrayList;
                            columnIndexOrThrow = i3;
                        } else {
                            i23 = columnIndexOrThrow;
                            i24 = columnIndexOrThrow14;
                            arq = null;
                            are = new are();
                            i26 = columnIndexOrThrow2;
                            i27 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i43;
                            are.a(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i44;
                            are.a(a2.getString(columnIndexOrThrow2));
                            i28 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i22;
                            are.b(a2.getString(columnIndexOrThrow3));
                            i25 = i2;
                            columnIndexOrThrow14 = i21;
                            are.a(a2.getInt(columnIndexOrThrow14));
                            i41 = columnIndexOrThrow14;
                            i2 = i20;
                            are.b(a2.getInt(i2));
                            i40 = i2;
                            columnIndexOrThrow14 = i19;
                            are.c(a2.getInt(columnIndexOrThrow14));
                            i39 = columnIndexOrThrow14;
                            i2 = i18;
                            are.c(a2.getString(i2));
                            i38 = i2;
                            columnIndexOrThrow14 = i17;
                            are.d(a2.getString(columnIndexOrThrow14));
                            i37 = columnIndexOrThrow14;
                            i2 = i16;
                            are.e(a2.getString(i2));
                            i36 = i2;
                            columnIndexOrThrow14 = i15;
                            are.d(a2.getInt(columnIndexOrThrow14));
                            i35 = columnIndexOrThrow14;
                            i2 = i14;
                            are.f(a2.getString(i2));
                            i34 = i2;
                            columnIndexOrThrow14 = i13;
                            are.g(a2.getString(columnIndexOrThrow14));
                            i33 = columnIndexOrThrow14;
                            i2 = i12;
                            are.e(a2.getInt(i2));
                            i32 = i2;
                            columnIndexOrThrow14 = i11;
                            are.f(a2.getInt(columnIndexOrThrow14));
                            i31 = columnIndexOrThrow14;
                            i2 = i7;
                            are.g(a2.getInt(i2));
                            i29 = columnIndexOrThrow2;
                            i42 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i8;
                            are.b(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i9;
                            are.h(a2.getString(columnIndexOrThrow2));
                            i30 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i10;
                            are.h(a2.getInt(columnIndexOrThrow3));
                            are.a(asr);
                            are.a(arq);
                            asm = new asm();
                            asm.b = arp2;
                            asm.a = are;
                            arrayList = arrayList3;
                            arrayList.add(asm);
                            columnIndexOrThrow19 = i2;
                            columnIndexOrThrow21 = columnIndexOrThrow2;
                            columnIndexOrThrow22 = columnIndexOrThrow3;
                            columnIndexOrThrow24 = columnIndexOrThrow4;
                            columnIndexOrThrow35 = columnIndexOrThrow7;
                            columnIndexOrThrow34 = columnIndexOrThrow8;
                            columnIndexOrThrow33 = columnIndexOrThrow9;
                            columnIndexOrThrow32 = columnIndexOrThrow10;
                            columnIndexOrThrow31 = columnIndexOrThrow11;
                            columnIndexOrThrow30 = columnIndexOrThrow12;
                            columnIndexOrThrow29 = columnIndexOrThrow13;
                            columnIndexOrThrow2 = i4;
                            columnIndexOrThrow3 = i5;
                            columnIndexOrThrow4 = i6;
                            columnIndexOrThrow27 = i23;
                            columnIndexOrThrow23 = i24;
                            columnIndexOrThrow25 = i27;
                            columnIndexOrThrow26 = i26;
                            columnIndexOrThrow5 = i28;
                            columnIndexOrThrow28 = i25;
                            columnIndexOrThrow8 = i41;
                            columnIndexOrThrow9 = i40;
                            columnIndexOrThrow10 = i39;
                            columnIndexOrThrow11 = i38;
                            columnIndexOrThrow12 = i37;
                            columnIndexOrThrow13 = i36;
                            i = i35;
                            columnIndexOrThrow15 = i34;
                            columnIndexOrThrow16 = i33;
                            columnIndexOrThrow17 = i32;
                            columnIndexOrThrow18 = i31;
                            columnIndexOrThrow6 = i29;
                            columnIndexOrThrow7 = i42;
                            columnIndexOrThrow20 = i30;
                            arrayList2 = arrayList;
                            columnIndexOrThrow = i3;
                        }
                    } else {
                        i44 = columnIndexOrThrow6;
                        asr = new asr();
                        i43 = columnIndexOrThrow5;
                        asr.a = a2.getInt(columnIndexOrThrow14);
                        asr.b = a2.getInt(columnIndexOrThrow4);
                        asr.c = a2.getString(columnIndexOrThrow3);
                        asr.d = a2.getString(columnIndexOrThrow2);
                        asr.e = a2.getString(columnIndexOrThrow);
                        asr.f = a2.getString(i2);
                        asr.g = a2.getString(columnIndexOrThrow13);
                        asr.h = a2.getString(columnIndexOrThrow12);
                        asr.i = a2.getString(columnIndexOrThrow11);
                        asr.j = a2.getString(columnIndexOrThrow10);
                        if (!a2.isNull(columnIndexOrThrow7)) {
                            i23 = columnIndexOrThrow;
                            i24 = columnIndexOrThrow14;
                            arq = null;
                            are = new are();
                            i26 = columnIndexOrThrow2;
                            i27 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i43;
                            are.a(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i44;
                            are.a(a2.getString(columnIndexOrThrow2));
                            i28 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i22;
                            are.b(a2.getString(columnIndexOrThrow3));
                            i25 = i2;
                            columnIndexOrThrow14 = i21;
                            are.a(a2.getInt(columnIndexOrThrow14));
                            i41 = columnIndexOrThrow14;
                            i2 = i20;
                            are.b(a2.getInt(i2));
                            i40 = i2;
                            columnIndexOrThrow14 = i19;
                            are.c(a2.getInt(columnIndexOrThrow14));
                            i39 = columnIndexOrThrow14;
                            i2 = i18;
                            are.c(a2.getString(i2));
                            i38 = i2;
                            columnIndexOrThrow14 = i17;
                            are.d(a2.getString(columnIndexOrThrow14));
                            i37 = columnIndexOrThrow14;
                            i2 = i16;
                            are.e(a2.getString(i2));
                            i36 = i2;
                            columnIndexOrThrow14 = i15;
                            are.d(a2.getInt(columnIndexOrThrow14));
                            i35 = columnIndexOrThrow14;
                            i2 = i14;
                            are.f(a2.getString(i2));
                            i34 = i2;
                            columnIndexOrThrow14 = i13;
                            are.g(a2.getString(columnIndexOrThrow14));
                            i33 = columnIndexOrThrow14;
                            i2 = i12;
                            are.e(a2.getInt(i2));
                            i32 = i2;
                            columnIndexOrThrow14 = i11;
                            are.f(a2.getInt(columnIndexOrThrow14));
                            i31 = columnIndexOrThrow14;
                            i2 = i7;
                            are.g(a2.getInt(i2));
                            i29 = columnIndexOrThrow2;
                            i42 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i8;
                            are.b(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i9;
                            are.h(a2.getString(columnIndexOrThrow2));
                            i30 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i10;
                            are.h(a2.getInt(columnIndexOrThrow3));
                            are.a(asr);
                            are.a(arq);
                            asm = new asm();
                            asm.b = arp2;
                            asm.a = are;
                            arrayList = arrayList3;
                            arrayList.add(asm);
                            columnIndexOrThrow19 = i2;
                            columnIndexOrThrow21 = columnIndexOrThrow2;
                            columnIndexOrThrow22 = columnIndexOrThrow3;
                            columnIndexOrThrow24 = columnIndexOrThrow4;
                            columnIndexOrThrow35 = columnIndexOrThrow7;
                            columnIndexOrThrow34 = columnIndexOrThrow8;
                            columnIndexOrThrow33 = columnIndexOrThrow9;
                            columnIndexOrThrow32 = columnIndexOrThrow10;
                            columnIndexOrThrow31 = columnIndexOrThrow11;
                            columnIndexOrThrow30 = columnIndexOrThrow12;
                            columnIndexOrThrow29 = columnIndexOrThrow13;
                            columnIndexOrThrow2 = i4;
                            columnIndexOrThrow3 = i5;
                            columnIndexOrThrow4 = i6;
                            columnIndexOrThrow27 = i23;
                            columnIndexOrThrow23 = i24;
                            columnIndexOrThrow25 = i27;
                            columnIndexOrThrow26 = i26;
                            columnIndexOrThrow5 = i28;
                            columnIndexOrThrow28 = i25;
                            columnIndexOrThrow8 = i41;
                            columnIndexOrThrow9 = i40;
                            columnIndexOrThrow10 = i39;
                            columnIndexOrThrow11 = i38;
                            columnIndexOrThrow12 = i37;
                            columnIndexOrThrow13 = i36;
                            i = i35;
                            columnIndexOrThrow15 = i34;
                            columnIndexOrThrow16 = i33;
                            columnIndexOrThrow17 = i32;
                            columnIndexOrThrow18 = i31;
                            columnIndexOrThrow6 = i29;
                            columnIndexOrThrow7 = i42;
                            columnIndexOrThrow20 = i30;
                            arrayList2 = arrayList;
                            columnIndexOrThrow = i3;
                        } else {
                            arq = new arq();
                            if (a2.isNull(columnIndexOrThrow9)) {
                                i23 = columnIndexOrThrow;
                                arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow9));
                            } else {
                                i23 = columnIndexOrThrow;
                                arq.a = null;
                            }
                            i24 = columnIndexOrThrow14;
                            arq.b = a2.getLong(columnIndexOrThrow8);
                            arq.c = a2.getInt(columnIndexOrThrow7);
                            are = new are();
                            i26 = columnIndexOrThrow2;
                            i27 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i43;
                            are.a(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i44;
                            are.a(a2.getString(columnIndexOrThrow2));
                            i28 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i22;
                            are.b(a2.getString(columnIndexOrThrow3));
                            i25 = i2;
                            columnIndexOrThrow14 = i21;
                            are.a(a2.getInt(columnIndexOrThrow14));
                            i41 = columnIndexOrThrow14;
                            i2 = i20;
                            are.b(a2.getInt(i2));
                            i40 = i2;
                            columnIndexOrThrow14 = i19;
                            are.c(a2.getInt(columnIndexOrThrow14));
                            i39 = columnIndexOrThrow14;
                            i2 = i18;
                            are.c(a2.getString(i2));
                            i38 = i2;
                            columnIndexOrThrow14 = i17;
                            are.d(a2.getString(columnIndexOrThrow14));
                            i37 = columnIndexOrThrow14;
                            i2 = i16;
                            are.e(a2.getString(i2));
                            i36 = i2;
                            columnIndexOrThrow14 = i15;
                            are.d(a2.getInt(columnIndexOrThrow14));
                            i35 = columnIndexOrThrow14;
                            i2 = i14;
                            are.f(a2.getString(i2));
                            i34 = i2;
                            columnIndexOrThrow14 = i13;
                            are.g(a2.getString(columnIndexOrThrow14));
                            i33 = columnIndexOrThrow14;
                            i2 = i12;
                            are.e(a2.getInt(i2));
                            i32 = i2;
                            columnIndexOrThrow14 = i11;
                            are.f(a2.getInt(columnIndexOrThrow14));
                            i31 = columnIndexOrThrow14;
                            i2 = i7;
                            are.g(a2.getInt(i2));
                            i29 = columnIndexOrThrow2;
                            i42 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i8;
                            are.b(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow2 = i9;
                            are.h(a2.getString(columnIndexOrThrow2));
                            i30 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i10;
                            are.h(a2.getInt(columnIndexOrThrow3));
                            are.a(asr);
                            are.a(arq);
                            asm = new asm();
                            asm.b = arp2;
                            asm.a = are;
                            arrayList = arrayList3;
                            arrayList.add(asm);
                            columnIndexOrThrow19 = i2;
                            columnIndexOrThrow21 = columnIndexOrThrow2;
                            columnIndexOrThrow22 = columnIndexOrThrow3;
                            columnIndexOrThrow24 = columnIndexOrThrow4;
                            columnIndexOrThrow35 = columnIndexOrThrow7;
                            columnIndexOrThrow34 = columnIndexOrThrow8;
                            columnIndexOrThrow33 = columnIndexOrThrow9;
                            columnIndexOrThrow32 = columnIndexOrThrow10;
                            columnIndexOrThrow31 = columnIndexOrThrow11;
                            columnIndexOrThrow30 = columnIndexOrThrow12;
                            columnIndexOrThrow29 = columnIndexOrThrow13;
                            columnIndexOrThrow2 = i4;
                            columnIndexOrThrow3 = i5;
                            columnIndexOrThrow4 = i6;
                            columnIndexOrThrow27 = i23;
                            columnIndexOrThrow23 = i24;
                            columnIndexOrThrow25 = i27;
                            columnIndexOrThrow26 = i26;
                            columnIndexOrThrow5 = i28;
                            columnIndexOrThrow28 = i25;
                            columnIndexOrThrow8 = i41;
                            columnIndexOrThrow9 = i40;
                            columnIndexOrThrow10 = i39;
                            columnIndexOrThrow11 = i38;
                            columnIndexOrThrow12 = i37;
                            columnIndexOrThrow13 = i36;
                            i = i35;
                            columnIndexOrThrow15 = i34;
                            columnIndexOrThrow16 = i33;
                            columnIndexOrThrow17 = i32;
                            columnIndexOrThrow18 = i31;
                            columnIndexOrThrow6 = i29;
                            columnIndexOrThrow7 = i42;
                            columnIndexOrThrow20 = i30;
                            arrayList2 = arrayList;
                            columnIndexOrThrow = i3;
                        }
                    }
                }
                arrayList = arrayList2;
                a2.close();
                sVar.b();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                sVar.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sVar = a;
            a2.close();
            sVar.b();
            throw th;
        }
    }

    final void e(ArrayList<arr> arrayList) {
        this.a.g();
        try {
            this.h.a(arrayList);
            this.a.i();
        } finally {
            this.a.h();
        }
    }

    public final LiveData<List<asm>> f(long j) {
        s a = s.a("SELECT ar.*, animes.* from animerecommendations as ar left join animes on ar.animeId = animes.series_animedb_id where ar.parentAnimeId = ?", 1);
        a.a(1, j);
        return new app(this, a).a();
    }

    public final List<are> f() {
        Throwable th;
        s a = s.a("SELECT * FROM animes", 0);
        Cursor a2 = this.a.a(a);
        s sVar;
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("series_animedb_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("series_title");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("series_synonyms");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("series_type");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("series_episodes");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("series_status");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("series_start");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("series_end");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("series_image");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_watched_episodes");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("my_start_date");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("my_finish_date");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("my_score");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("my_rewatching");
            sVar = a;
            try {
                ArrayList arrayList;
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("my_rewatching_ep");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("my_last_updated");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("my_tags");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("my_status");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("kitsu_malId");
                int i = columnIndexOrThrow14;
                columnIndexOrThrow14 = a2.getColumnIndexOrThrow("kitsu_kitsuId");
                int i2 = columnIndexOrThrow13;
                columnIndexOrThrow13 = a2.getColumnIndexOrThrow("kitsu_startDate");
                int i3 = columnIndexOrThrow12;
                columnIndexOrThrow12 = a2.getColumnIndexOrThrow("kitsu_endDate");
                int i4 = columnIndexOrThrow11;
                columnIndexOrThrow11 = a2.getColumnIndexOrThrow("kitsu_posterId");
                int i5 = columnIndexOrThrow10;
                columnIndexOrThrow10 = a2.getColumnIndexOrThrow("kitsu_coverId");
                int i6 = columnIndexOrThrow9;
                columnIndexOrThrow9 = a2.getColumnIndexOrThrow("kitsu_type");
                int i7 = columnIndexOrThrow8;
                columnIndexOrThrow8 = a2.getColumnIndexOrThrow("kitsu_titleEnJp");
                int i8 = columnIndexOrThrow7;
                columnIndexOrThrow7 = a2.getColumnIndexOrThrow("kitsu_titleEn");
                int i9 = columnIndexOrThrow6;
                columnIndexOrThrow6 = a2.getColumnIndexOrThrow("kitsu_titleJaJp");
                int i10 = columnIndexOrThrow5;
                columnIndexOrThrow5 = a2.getColumnIndexOrThrow("livechart_malid");
                int i11 = columnIndexOrThrow4;
                columnIndexOrThrow4 = a2.getColumnIndexOrThrow("livechart_time");
                int i12 = columnIndexOrThrow3;
                columnIndexOrThrow3 = a2.getColumnIndexOrThrow("livechart_episode");
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow;
                ArrayList arrayList2 = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    asr asr;
                    int i15;
                    int i16;
                    arq arq;
                    are are;
                    int i17;
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
                    if (a2.isNull(columnIndexOrThrow19) && a2.isNull(columnIndexOrThrow14) && a2.isNull(columnIndexOrThrow13) && a2.isNull(columnIndexOrThrow12) && a2.isNull(columnIndexOrThrow11) && a2.isNull(columnIndexOrThrow10) && a2.isNull(columnIndexOrThrow9) && a2.isNull(columnIndexOrThrow8) && a2.isNull(columnIndexOrThrow7)) {
                        if (a2.isNull(columnIndexOrThrow6)) {
                            asr = null;
                            if (a2.isNull(columnIndexOrThrow5) && a2.isNull(columnIndexOrThrow4)) {
                                if (!a2.isNull(columnIndexOrThrow3)) {
                                    i15 = columnIndexOrThrow19;
                                    i16 = columnIndexOrThrow14;
                                    arq = null;
                                    are = new are();
                                    i17 = columnIndexOrThrow3;
                                    i18 = columnIndexOrThrow4;
                                    columnIndexOrThrow14 = i14;
                                    are.a(a2.getLong(columnIndexOrThrow14));
                                    columnIndexOrThrow3 = i13;
                                    are.a(a2.getString(columnIndexOrThrow3));
                                    i19 = columnIndexOrThrow14;
                                    columnIndexOrThrow4 = i12;
                                    are.b(a2.getString(columnIndexOrThrow4));
                                    i20 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i11;
                                    are.a(a2.getInt(columnIndexOrThrow14));
                                    i21 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i10;
                                    are.b(a2.getInt(columnIndexOrThrow3));
                                    i22 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i9;
                                    are.c(a2.getInt(columnIndexOrThrow14));
                                    i23 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i8;
                                    are.c(a2.getString(columnIndexOrThrow3));
                                    i24 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i7;
                                    are.d(a2.getString(columnIndexOrThrow14));
                                    i25 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i6;
                                    are.e(a2.getString(columnIndexOrThrow3));
                                    i26 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i5;
                                    are.d(a2.getInt(columnIndexOrThrow14));
                                    i27 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i4;
                                    are.f(a2.getString(columnIndexOrThrow3));
                                    i28 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i3;
                                    are.g(a2.getString(columnIndexOrThrow14));
                                    i29 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = i2;
                                    are.e(a2.getInt(columnIndexOrThrow3));
                                    i30 = columnIndexOrThrow3;
                                    columnIndexOrThrow14 = i;
                                    are.f(a2.getInt(columnIndexOrThrow14));
                                    i31 = columnIndexOrThrow14;
                                    columnIndexOrThrow3 = columnIndexOrThrow15;
                                    are.g(a2.getInt(columnIndexOrThrow3));
                                    i32 = columnIndexOrThrow3;
                                    i33 = columnIndexOrThrow4;
                                    columnIndexOrThrow14 = columnIndexOrThrow16;
                                    are.b(a2.getLong(columnIndexOrThrow14));
                                    columnIndexOrThrow3 = columnIndexOrThrow17;
                                    are.h(a2.getString(columnIndexOrThrow3));
                                    i34 = columnIndexOrThrow14;
                                    columnIndexOrThrow4 = columnIndexOrThrow18;
                                    are.h(a2.getInt(columnIndexOrThrow4));
                                    are.a(asr);
                                    are.a(arq);
                                    arrayList = arrayList3;
                                    arrayList.add(are);
                                    arrayList2 = arrayList;
                                    columnIndexOrThrow17 = columnIndexOrThrow3;
                                    columnIndexOrThrow18 = columnIndexOrThrow4;
                                    columnIndexOrThrow19 = i15;
                                    columnIndexOrThrow14 = i16;
                                    columnIndexOrThrow4 = i18;
                                    columnIndexOrThrow3 = i17;
                                    i14 = i19;
                                    i13 = i20;
                                    i11 = i21;
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
                                    i12 = i33;
                                    columnIndexOrThrow15 = i32;
                                    columnIndexOrThrow16 = i34;
                                }
                            }
                            arq = new arq();
                            if (a2.isNull(columnIndexOrThrow5)) {
                                i15 = columnIndexOrThrow19;
                                arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow5));
                            } else {
                                i15 = columnIndexOrThrow19;
                                arq.a = null;
                            }
                            i16 = columnIndexOrThrow14;
                            arq.b = a2.getLong(columnIndexOrThrow4);
                            arq.c = a2.getInt(columnIndexOrThrow3);
                            are = new are();
                            i17 = columnIndexOrThrow3;
                            i18 = columnIndexOrThrow4;
                            columnIndexOrThrow14 = i14;
                            are.a(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow3 = i13;
                            are.a(a2.getString(columnIndexOrThrow3));
                            i19 = columnIndexOrThrow14;
                            columnIndexOrThrow4 = i12;
                            are.b(a2.getString(columnIndexOrThrow4));
                            i20 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i11;
                            are.a(a2.getInt(columnIndexOrThrow14));
                            i21 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i10;
                            are.b(a2.getInt(columnIndexOrThrow3));
                            i22 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i9;
                            are.c(a2.getInt(columnIndexOrThrow14));
                            i23 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i8;
                            are.c(a2.getString(columnIndexOrThrow3));
                            i24 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i7;
                            are.d(a2.getString(columnIndexOrThrow14));
                            i25 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i6;
                            are.e(a2.getString(columnIndexOrThrow3));
                            i26 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i5;
                            are.d(a2.getInt(columnIndexOrThrow14));
                            i27 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i4;
                            are.f(a2.getString(columnIndexOrThrow3));
                            i28 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i3;
                            are.g(a2.getString(columnIndexOrThrow14));
                            i29 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = i2;
                            are.e(a2.getInt(columnIndexOrThrow3));
                            i30 = columnIndexOrThrow3;
                            columnIndexOrThrow14 = i;
                            are.f(a2.getInt(columnIndexOrThrow14));
                            i31 = columnIndexOrThrow14;
                            columnIndexOrThrow3 = columnIndexOrThrow15;
                            are.g(a2.getInt(columnIndexOrThrow3));
                            i32 = columnIndexOrThrow3;
                            i33 = columnIndexOrThrow4;
                            columnIndexOrThrow14 = columnIndexOrThrow16;
                            are.b(a2.getLong(columnIndexOrThrow14));
                            columnIndexOrThrow3 = columnIndexOrThrow17;
                            are.h(a2.getString(columnIndexOrThrow3));
                            i34 = columnIndexOrThrow14;
                            columnIndexOrThrow4 = columnIndexOrThrow18;
                            are.h(a2.getInt(columnIndexOrThrow4));
                            are.a(asr);
                            are.a(arq);
                            arrayList = arrayList3;
                            arrayList.add(are);
                            arrayList2 = arrayList;
                            columnIndexOrThrow17 = columnIndexOrThrow3;
                            columnIndexOrThrow18 = columnIndexOrThrow4;
                            columnIndexOrThrow19 = i15;
                            columnIndexOrThrow14 = i16;
                            columnIndexOrThrow4 = i18;
                            columnIndexOrThrow3 = i17;
                            i14 = i19;
                            i13 = i20;
                            i11 = i21;
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
                            i12 = i33;
                            columnIndexOrThrow15 = i32;
                            columnIndexOrThrow16 = i34;
                        }
                    }
                    asr = new asr();
                    asr.a = a2.getInt(columnIndexOrThrow19);
                    asr.b = a2.getInt(columnIndexOrThrow14);
                    asr.c = a2.getString(columnIndexOrThrow13);
                    asr.d = a2.getString(columnIndexOrThrow12);
                    asr.e = a2.getString(columnIndexOrThrow11);
                    asr.f = a2.getString(columnIndexOrThrow10);
                    asr.g = a2.getString(columnIndexOrThrow9);
                    asr.h = a2.getString(columnIndexOrThrow8);
                    asr.i = a2.getString(columnIndexOrThrow7);
                    asr.j = a2.getString(columnIndexOrThrow6);
                    if (!a2.isNull(columnIndexOrThrow3)) {
                        i15 = columnIndexOrThrow19;
                        i16 = columnIndexOrThrow14;
                        arq = null;
                        are = new are();
                        i17 = columnIndexOrThrow3;
                        i18 = columnIndexOrThrow4;
                        columnIndexOrThrow14 = i14;
                        are.a(a2.getLong(columnIndexOrThrow14));
                        columnIndexOrThrow3 = i13;
                        are.a(a2.getString(columnIndexOrThrow3));
                        i19 = columnIndexOrThrow14;
                        columnIndexOrThrow4 = i12;
                        are.b(a2.getString(columnIndexOrThrow4));
                        i20 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i11;
                        are.a(a2.getInt(columnIndexOrThrow14));
                        i21 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i10;
                        are.b(a2.getInt(columnIndexOrThrow3));
                        i22 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i9;
                        are.c(a2.getInt(columnIndexOrThrow14));
                        i23 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i8;
                        are.c(a2.getString(columnIndexOrThrow3));
                        i24 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i7;
                        are.d(a2.getString(columnIndexOrThrow14));
                        i25 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i6;
                        are.e(a2.getString(columnIndexOrThrow3));
                        i26 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i5;
                        are.d(a2.getInt(columnIndexOrThrow14));
                        i27 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i4;
                        are.f(a2.getString(columnIndexOrThrow3));
                        i28 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i3;
                        are.g(a2.getString(columnIndexOrThrow14));
                        i29 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i2;
                        are.e(a2.getInt(columnIndexOrThrow3));
                        i30 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i;
                        are.f(a2.getInt(columnIndexOrThrow14));
                        i31 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = columnIndexOrThrow15;
                        are.g(a2.getInt(columnIndexOrThrow3));
                        i32 = columnIndexOrThrow3;
                        i33 = columnIndexOrThrow4;
                        columnIndexOrThrow14 = columnIndexOrThrow16;
                        are.b(a2.getLong(columnIndexOrThrow14));
                        columnIndexOrThrow3 = columnIndexOrThrow17;
                        are.h(a2.getString(columnIndexOrThrow3));
                        i34 = columnIndexOrThrow14;
                        columnIndexOrThrow4 = columnIndexOrThrow18;
                        are.h(a2.getInt(columnIndexOrThrow4));
                        are.a(asr);
                        are.a(arq);
                        arrayList = arrayList3;
                        arrayList.add(are);
                        arrayList2 = arrayList;
                        columnIndexOrThrow17 = columnIndexOrThrow3;
                        columnIndexOrThrow18 = columnIndexOrThrow4;
                        columnIndexOrThrow19 = i15;
                        columnIndexOrThrow14 = i16;
                        columnIndexOrThrow4 = i18;
                        columnIndexOrThrow3 = i17;
                        i14 = i19;
                        i13 = i20;
                        i11 = i21;
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
                        i12 = i33;
                        columnIndexOrThrow15 = i32;
                        columnIndexOrThrow16 = i34;
                    } else {
                        arq = new arq();
                        if (a2.isNull(columnIndexOrThrow5)) {
                            i15 = columnIndexOrThrow19;
                            arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow5));
                        } else {
                            i15 = columnIndexOrThrow19;
                            arq.a = null;
                        }
                        i16 = columnIndexOrThrow14;
                        arq.b = a2.getLong(columnIndexOrThrow4);
                        arq.c = a2.getInt(columnIndexOrThrow3);
                        are = new are();
                        i17 = columnIndexOrThrow3;
                        i18 = columnIndexOrThrow4;
                        columnIndexOrThrow14 = i14;
                        are.a(a2.getLong(columnIndexOrThrow14));
                        columnIndexOrThrow3 = i13;
                        are.a(a2.getString(columnIndexOrThrow3));
                        i19 = columnIndexOrThrow14;
                        columnIndexOrThrow4 = i12;
                        are.b(a2.getString(columnIndexOrThrow4));
                        i20 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i11;
                        are.a(a2.getInt(columnIndexOrThrow14));
                        i21 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i10;
                        are.b(a2.getInt(columnIndexOrThrow3));
                        i22 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i9;
                        are.c(a2.getInt(columnIndexOrThrow14));
                        i23 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i8;
                        are.c(a2.getString(columnIndexOrThrow3));
                        i24 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i7;
                        are.d(a2.getString(columnIndexOrThrow14));
                        i25 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i6;
                        are.e(a2.getString(columnIndexOrThrow3));
                        i26 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i5;
                        are.d(a2.getInt(columnIndexOrThrow14));
                        i27 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i4;
                        are.f(a2.getString(columnIndexOrThrow3));
                        i28 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i3;
                        are.g(a2.getString(columnIndexOrThrow14));
                        i29 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = i2;
                        are.e(a2.getInt(columnIndexOrThrow3));
                        i30 = columnIndexOrThrow3;
                        columnIndexOrThrow14 = i;
                        are.f(a2.getInt(columnIndexOrThrow14));
                        i31 = columnIndexOrThrow14;
                        columnIndexOrThrow3 = columnIndexOrThrow15;
                        are.g(a2.getInt(columnIndexOrThrow3));
                        i32 = columnIndexOrThrow3;
                        i33 = columnIndexOrThrow4;
                        columnIndexOrThrow14 = columnIndexOrThrow16;
                        are.b(a2.getLong(columnIndexOrThrow14));
                        columnIndexOrThrow3 = columnIndexOrThrow17;
                        are.h(a2.getString(columnIndexOrThrow3));
                        i34 = columnIndexOrThrow14;
                        columnIndexOrThrow4 = columnIndexOrThrow18;
                        are.h(a2.getInt(columnIndexOrThrow4));
                        are.a(asr);
                        are.a(arq);
                        arrayList = arrayList3;
                        arrayList.add(are);
                        arrayList2 = arrayList;
                        columnIndexOrThrow17 = columnIndexOrThrow3;
                        columnIndexOrThrow18 = columnIndexOrThrow4;
                        columnIndexOrThrow19 = i15;
                        columnIndexOrThrow14 = i16;
                        columnIndexOrThrow4 = i18;
                        columnIndexOrThrow3 = i17;
                        i14 = i19;
                        i13 = i20;
                        i11 = i21;
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
                        i12 = i33;
                        columnIndexOrThrow15 = i32;
                        columnIndexOrThrow16 = i34;
                    }
                }
                arrayList = arrayList2;
                a2.close();
                sVar.b();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                sVar.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sVar = a;
            a2.close();
            sVar.b();
            throw th;
        }
    }

    final void f(int i) {
        w b = this.o.b();
        this.a.g();
        try {
            b.a(1, (long) i);
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.o.a(b);
        }
    }

    public final LiveData<Integer> g() {
        return new apf(this, s.a("SELECT COUNT(*) FROM animes", 0)).a();
    }

    public final Integer g(int i) {
        s a = s.a("SELECT COUNT(*) FROM nsfwshows where nsfw_animeid = ?", 1);
        a.a(1, (long) i);
        Cursor a2 = this.a.a(a);
        try {
            Integer num = null;
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    num = Integer.valueOf(a2.getInt(0));
                }
            }
            a2.close();
            a.b();
            return num;
        } catch (Throwable th) {
            a2.close();
            a.b();
        }
    }

    public final Integer g(long j) {
        s a = s.a("SELECT COUNT(*) FROM animerecommendations where parentAnimeId = ?", 1);
        a.a(1, j);
        Cursor a2 = this.a.a(a);
        try {
            Integer num = null;
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    num = Integer.valueOf(a2.getInt(0));
                }
            }
            a2.close();
            a.b();
            return num;
        } catch (Throwable th) {
            a2.close();
            a.b();
        }
    }

    public final LiveData<Integer> h() {
        return new apj(this, s.a("SELECT COUNT(*) FROM livechart_entry where malid in (SELECT series_animedb_id from animes)", 0)).a();
    }

    public final LiveData<asr> h(int i) {
        s a = s.a("SELECT * FROM minimal_kitsu_info where MALId = ?", 1);
        a.a(1, (long) i);
        return new aqi(this, a).a();
    }

    public final void i() {
        w b = this.m.b();
        this.a.g();
        try {
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.m.a(b);
        }
    }

    public final LiveData<List<arn>> j() {
        s a = s.a("SELECT series_animedb_id, series_title,series_image from animes where my_status = ? AND series_status <> ?", 2);
        a.a(1, 6);
        a.a(2, 3);
        return new apl(this, a).a();
    }

    final void k() {
        w b = this.n.b();
        this.a.g();
        try {
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.n.a(b);
        }
    }

    public final LiveData<List<arl>> l() {
        return new apu(this, s.a("SELECT * FROM livechart_entry where malid in (SELECT series_animedb_id from animes) ORDER BY time ASC", 0)).a();
    }

    public final List<arq> m() {
        s a = s.a("SELECT * FROM livechart_entry where malid in (SELECT series_animedb_id from animes)", 0);
        Cursor a2 = this.a.a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("malid");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("episode");
            List<arq> arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arq arq = new arq();
                if (a2.isNull(columnIndexOrThrow)) {
                    arq.a = null;
                } else {
                    arq.a = Integer.valueOf(a2.getInt(columnIndexOrThrow));
                }
                arq.b = a2.getLong(columnIndexOrThrow2);
                arq.c = a2.getInt(columnIndexOrThrow3);
                arrayList.add(arq);
            }
            return arrayList;
        } finally {
            a2.close();
            a.b();
        }
    }

    public final LiveData<List<arl>> n() {
        return new apw(this, s.a("SELECT * FROM livechart_entry ORDER BY time ASC", 0)).a();
    }

    public final LiveData<List<arg>> o() {
        s a = s.a("SELECT * from animerecommendations LEFT JOIN animes on animes.series_animedb_id = animerecommendations.parentAnimeId WHERE animes.my_score > 6 AND animerecommendations.animeId NOT IN (SELECT series_animedb_id from animes) AND animerecommendations.animeId NOT IN (SELECT nsfw_animeid from nsfwshows) AND animerecommendations.priority < 6 GROUP BY animerecommendations.animeId ORDER BY RANDOM() LIMIT ?", 1);
        a.a(1, 50);
        return new aqa(this, a).a();
    }

    public final LiveData<Integer> p() {
        return new aqc(this, s.a("SELECT COUNT(DISTINCT animerecommendations.animeId) from animerecommendations LEFT JOIN animes on animes.series_animedb_id = animerecommendations.parentAnimeId WHERE animes.my_score > 6 AND animerecommendations.animeId NOT IN (SELECT series_animedb_id from animes) AND animerecommendations.animeId NOT IN (SELECT nsfw_animeid from nsfwshows) AND animerecommendations.priority < 6 ", 0)).a();
    }

    public final LiveData<Integer> q() {
        s a = s.a("SELECT COUNT(*) FROM animes where series_status = ?", 1);
        a.a(1, -1);
        return new aqe(this, a).a();
    }

    final void r() {
        w b = this.p.b();
        this.a.g();
        try {
            b.a();
            this.a.i();
        } finally {
            this.a.h();
            this.p.a(b);
        }
    }

    public final List<Integer> s() {
        s a = s.a("SELECT nsfw_animeid FROM nsfwshows", 0);
        Cursor a2 = this.a.a(a);
        try {
            List<Integer> arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.isNull(0) ? null : Integer.valueOf(a2.getInt(0)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.b();
        }
    }

    public final LiveData<Integer> t() {
        return new aqg(this, s.a("SELECT (SELECT COUNT(*) FROM animes WHERE my_score >= 7) + (SELECT COUNT(*) FROM waifus) as counter", 0)).a();
    }

    public final List<Integer> u() {
        s a = s.a("SELECT series_animedb_id from animes where series_animedb_id not in (SELECT MALId from minimal_kitsu_info) limit 1500", 0);
        Cursor a2 = this.a.a(a);
        try {
            List<Integer> arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.isNull(0) ? null : Integer.valueOf(a2.getInt(0)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.b();
        }
    }

    public final List<asr> v() {
        s a = s.a("SELECT * from minimal_kitsu_info WHERE MALId in (SELECT series_animedb_id from animes)", 0);
        Cursor a2 = this.a.a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("malId");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("kitsuId");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("startDate");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("endDate");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("posterId");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("coverId");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("type");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("titleEnJp");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("titleEn");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("titleJaJp");
            List<asr> arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                asr asr = new asr();
                asr.a = a2.getInt(columnIndexOrThrow);
                asr.b = a2.getInt(columnIndexOrThrow2);
                asr.c = a2.getString(columnIndexOrThrow3);
                asr.d = a2.getString(columnIndexOrThrow4);
                asr.e = a2.getString(columnIndexOrThrow5);
                asr.f = a2.getString(columnIndexOrThrow6);
                asr.g = a2.getString(columnIndexOrThrow7);
                asr.h = a2.getString(columnIndexOrThrow8);
                asr.i = a2.getString(columnIndexOrThrow9);
                asr.j = a2.getString(columnIndexOrThrow10);
                arrayList.add(asr);
            }
            return arrayList;
        } finally {
            a2.close();
            a.b();
        }
    }
}
