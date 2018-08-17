package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aqk extends c<arg> {
    final /* synthetic */ aoi a;

    aqk(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `animerecommendations`(`animeId`,`parentAnimeId`,`title`,`image`,`recommendedBy`,`shortDescription`,`readMoreURL`,`priority`) VALUES (?,?,?,?,?,?,?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        arg arg = (arg) obj;
        wVar.a(1, arg.a());
        wVar.a(2, arg.b());
        if (arg.g() == null) {
            wVar.a(3);
        } else {
            wVar.a(3, arg.g());
        }
        if (arg.c() == null) {
            wVar.a(4);
        } else {
            wVar.a(4, arg.c());
        }
        if (arg.i() == null) {
            wVar.a(5);
        } else {
            wVar.a(5, arg.i());
        }
        if (arg.d() == null) {
            wVar.a(6);
        } else {
            wVar.a(6, arg.d());
        }
        if (arg.f() == null) {
            wVar.a(7);
        } else {
            wVar.a(7, arg.f());
        }
        wVar.a(8, (long) arg.e());
    }
}
