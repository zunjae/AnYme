package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aqy extends c<asp> {
    final /* synthetic */ aqx a;

    aqy(aqx aqx, k kVar) {
        this.a = aqx;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `waifus`(`waifu_id`,`parent_anime_id`,`waifu_name`,`waifu_image_url`,`date_created`) VALUES (?,?,?,?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        asp asp = (asp) obj;
        wVar.a(1, (long) asp.b());
        wVar.a(2, (long) asp.c());
        if (asp.d() == null) {
            wVar.a(3);
        } else {
            wVar.a(3, asp.d());
        }
        if (asp.e() == null) {
            wVar.a(4);
        } else {
            wVar.a(4, asp.e());
        }
        wVar.a(5, asp.f());
    }
}
