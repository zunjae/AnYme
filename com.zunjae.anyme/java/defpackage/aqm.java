package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aqm extends c<amg> {
    final /* synthetic */ aoi a;

    aqm(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `related_animes`(`parent_anime_id`,`series_id`,`title`,`type`,`episodes`,`picture`,`expiration_date`) VALUES (?,?,?,?,?,?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        amg amg = (amg) obj;
        wVar.a(1, (long) amg.a());
        if (amg.d() == null) {
            wVar.a(2);
        } else {
            wVar.a(2, (long) amg.d().intValue());
        }
        if (amg.b() == null) {
            wVar.a(3);
        } else {
            wVar.a(3, amg.b());
        }
        if (amg.c() == null) {
            wVar.a(4);
        } else {
            wVar.a(4, amg.c());
        }
        if (amg.e() == null) {
            wVar.a(5);
        } else {
            wVar.a(5, (long) amg.e().intValue());
        }
        if (amg.f() == null) {
            wVar.a(6);
        } else {
            wVar.a(6, amg.f());
        }
        wVar.a(7, amg.g());
    }
}
