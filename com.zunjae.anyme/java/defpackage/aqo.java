package defpackage;

import android.arch.persistence.room.b;
import android.arch.persistence.room.k;

final class aqo extends b<are> {
    final /* synthetic */ aoi a;

    aqo(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "DELETE FROM `animes` WHERE `series_animedb_id` = ?";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        wVar.a(1, ((are) obj).c());
    }
}
