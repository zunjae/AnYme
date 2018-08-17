package com.zunjae.anyme;

import android.arch.persistence.room.a;
import android.arch.persistence.room.d;
import defpackage.aoh;
import defpackage.aoi;
import defpackage.aqq;
import defpackage.aqr;
import defpackage.aqw;
import defpackage.aqx;
import defpackage.o;
import defpackage.p;
import defpackage.r;

public class AppDatabase_Impl extends AppDatabase {
    private volatile aoh d;
    private volatile aqq e;
    private volatile aqw f;

    protected final p b(a aVar) {
        return aVar.a.a(r.a(aVar.b).a(aVar.c).a(new android.arch.persistence.room.p(aVar, new c(this), "e1e6d5999a9db9ee03b44c933d47131e", "56efc82e53cb7f09a056ef5f22a1dcb5")).a());
    }

    protected final d c() {
        return new d(this, new String[]{"animes", "characters", "AnimeJikanInfoR2", "animerecommendations", "releasedays", "MinimalAnimeInfo", "minimal_kitsu_info", "livechart_entry", "related_animes", "nsfwshows", "waifus"});
    }

    public final void d() {
        super.f();
        o a = super.b().a();
        try {
            super.g();
            a.c("DELETE FROM `animes`");
            a.c("DELETE FROM `characters`");
            a.c("DELETE FROM `AnimeJikanInfoR2`");
            a.c("DELETE FROM `animerecommendations`");
            a.c("DELETE FROM `releasedays`");
            a.c("DELETE FROM `MinimalAnimeInfo`");
            a.c("DELETE FROM `minimal_kitsu_info`");
            a.c("DELETE FROM `livechart_entry`");
            a.c("DELETE FROM `related_animes`");
            a.c("DELETE FROM `nsfwshows`");
            a.c("DELETE FROM `waifus`");
            super.i();
        } finally {
            super.h();
            a.b("PRAGMA wal_checkpoint(FULL)").close();
            if (!a.d()) {
                a.c("VACUUM");
            }
        }
    }

    public final aoh l() {
        aoh aoh = this.d;
        if (aoh != null) {
            return aoh;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new aoi(this);
            }
            aoh = this.d;
        }
        return aoh;
    }

    public final aqq m() {
        aqq aqq = this.e;
        if (aqq != null) {
            return aqq;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new aqr(this);
            }
            aqq = this.e;
        }
        return aqq;
    }

    public final aqw n() {
        aqw aqw = this.f;
        if (aqw != null) {
            return aqw;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new aqx(this);
            }
            aqw = this.f;
        }
        return aqw;
    }
}
