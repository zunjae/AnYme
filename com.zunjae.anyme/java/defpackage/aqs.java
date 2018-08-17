package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aqs extends c<arh> {
    final /* synthetic */ aqr a;

    aqs(aqr aqr, k kVar) {
        this.a = aqr;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `characters`(`name`,`characterURL`,`imageURL`,`animeId`) VALUES (?,?,?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        arh arh = (arh) obj;
        if (arh.c() == null) {
            wVar.a(1);
        } else {
            wVar.a(1, arh.c());
        }
        if (arh.e() == null) {
            wVar.a(2);
        } else {
            wVar.a(2, arh.e());
        }
        if (arh.h() == null) {
            wVar.a(3);
        } else {
            wVar.a(3, arh.h());
        }
        wVar.a(4, arh.b());
    }
}
