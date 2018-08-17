package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aoy extends c<ars> {
    final /* synthetic */ aoi a;

    aoy(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `releasedays`(`day`,`anime_id`) VALUES (?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        ars ars = (ars) obj;
        if (ars.a() == null) {
            wVar.a(1);
        } else {
            wVar.a(1, ars.a());
        }
        wVar.a(2, (long) ars.b());
    }
}
