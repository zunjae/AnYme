package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aql extends c<arl> {
    final /* synthetic */ aoi a;

    aql(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR IGNORE INTO `livechart_entry`(`malid`,`time`,`series_cover`,`tags`,`title`,`episode`,`dayOfWeek`) VALUES (?,?,?,?,?,?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        arl arl = (arl) obj;
        Integer num = arl.a;
        if (num == null) {
            wVar.a(1);
        } else {
            wVar.a(1, (long) num.intValue());
        }
        wVar.a(2, arl.b);
        String str = arl.c;
        if (str == null) {
            wVar.a(3);
        } else {
            wVar.a(3, str);
        }
        str = arl.d;
        if (str == null) {
            wVar.a(4);
        } else {
            wVar.a(4, str);
        }
        str = arl.e;
        if (str == null) {
            wVar.a(5);
        } else {
            wVar.a(5, str);
        }
        wVar.a(6, (long) arl.f);
        wVar.a(7, (long) arl.g);
    }
}
