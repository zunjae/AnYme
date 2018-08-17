package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aqn extends c<arr> {
    final /* synthetic */ aoi a;

    aqn(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `nsfwshows`(`nsfw_animeid`) VALUES (?)";
    }

    public final /* bridge */ /* synthetic */ void a(w wVar, Object obj) {
        wVar.a(1, (long) ((arr) obj).a());
    }
}
