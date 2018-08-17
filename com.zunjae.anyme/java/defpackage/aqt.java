package defpackage;

import android.arch.persistence.room.k;
import android.arch.persistence.room.t;

final class aqt extends t {
    final /* synthetic */ aqr a;

    aqt(aqr aqr, k kVar) {
        this.a = aqr;
        super(kVar);
    }

    public final String a() {
        return "DELETE FROM characters";
    }
}
