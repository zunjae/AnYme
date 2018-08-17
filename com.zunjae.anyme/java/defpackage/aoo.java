package defpackage;

import android.arch.persistence.room.k;
import android.arch.persistence.room.t;

final class aoo extends t {
    final /* synthetic */ aoi a;

    aoo(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "DELETE FROM related_animes where parent_anime_id = ?";
    }
}
