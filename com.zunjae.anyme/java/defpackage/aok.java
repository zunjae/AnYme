package defpackage;

import android.arch.persistence.room.k;
import android.arch.persistence.room.t;

final class aok extends t {
    final /* synthetic */ aoi a;

    aok(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "DELETE FROM animes where series_animedb_id = ?";
    }
}
