package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class aqz extends c<asr> {
    final /* synthetic */ aqx a;

    aqz(aqx aqx, k kVar) {
        this.a = aqx;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `minimal_kitsu_info`(`malId`,`kitsuId`,`startDate`,`endDate`,`posterId`,`coverId`,`type`,`titleEnJp`,`titleEn`,`titleJaJp`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    }

    public final /* bridge */ /* synthetic */ void a(w wVar, Object obj) {
        asr asr = (asr) obj;
        wVar.a(1, (long) asr.a);
        wVar.a(2, (long) asr.b);
        String str = asr.c;
        if (str == null) {
            wVar.a(3);
        } else {
            wVar.a(3, str);
        }
        str = asr.d;
        if (str == null) {
            wVar.a(4);
        } else {
            wVar.a(4, str);
        }
        str = asr.e;
        if (str == null) {
            wVar.a(5);
        } else {
            wVar.a(5, str);
        }
        str = asr.f;
        if (str == null) {
            wVar.a(6);
        } else {
            wVar.a(6, str);
        }
        str = asr.g;
        if (str == null) {
            wVar.a(7);
        } else {
            wVar.a(7, str);
        }
        str = asr.h;
        if (str == null) {
            wVar.a(8);
        } else {
            wVar.a(8, str);
        }
        str = asr.i;
        if (str == null) {
            wVar.a(9);
        } else {
            wVar.a(9, str);
        }
        String str2 = asr.j;
        if (str2 == null) {
            wVar.a(10);
        } else {
            wVar.a(10, str2);
        }
    }
}
