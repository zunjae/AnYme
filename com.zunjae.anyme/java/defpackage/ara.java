package defpackage;

import android.arch.persistence.room.b;
import android.arch.persistence.room.k;

final class ara extends b<asp> {
    final /* synthetic */ aqx a;

    ara(aqx aqx, k kVar) {
        this.a = aqx;
        super(kVar);
    }

    public final String a() {
        return "DELETE FROM `waifus` WHERE `waifu_id` = ?";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        wVar.a(1, (long) ((asp) obj).b());
    }
}
