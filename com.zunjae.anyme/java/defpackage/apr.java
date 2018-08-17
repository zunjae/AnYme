package defpackage;

import android.arch.persistence.room.c;
import android.arch.persistence.room.k;

final class apr extends c<asc> {
    final /* synthetic */ aoi a;

    apr(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `AnimeJikanInfoR2`(`malId`,`link_canonical`,`title`,`title_english`,`title_synonyms`,`image_url`,`type`,`source`,`episodes`,`status`,`aired_string`,`duration`,`rating`,`score`,`rank`,`synopsis`,`broadcast`,`studio`,`genre`,`opening_theme`,`ending_theme`,`expirationDate`,`jikanRelated`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        asc asc = (asc) obj;
        Integer num = asc.a;
        if (num == null) {
            wVar.a(1);
        } else {
            wVar.a(1, (long) num.intValue());
        }
        String str = asc.b;
        if (str == null) {
            wVar.a(2);
        } else {
            wVar.a(2, str);
        }
        str = asc.c;
        if (str == null) {
            wVar.a(3);
        } else {
            wVar.a(3, str);
        }
        str = asc.d;
        if (str == null) {
            wVar.a(4);
        } else {
            wVar.a(4, str);
        }
        str = asc.e;
        if (str == null) {
            wVar.a(5);
        } else {
            wVar.a(5, str);
        }
        str = asc.f;
        if (str == null) {
            wVar.a(6);
        } else {
            wVar.a(6, str);
        }
        str = asc.g;
        if (str == null) {
            wVar.a(7);
        } else {
            wVar.a(7, str);
        }
        str = asc.h;
        if (str == null) {
            wVar.a(8);
        } else {
            wVar.a(8, str);
        }
        num = asc.i;
        if (num == null) {
            wVar.a(9);
        } else {
            wVar.a(9, (long) num.intValue());
        }
        str = asc.j;
        if (str == null) {
            wVar.a(10);
        } else {
            wVar.a(10, str);
        }
        str = asc.k;
        if (str == null) {
            wVar.a(11);
        } else {
            wVar.a(11, str);
        }
        str = asc.l;
        if (str == null) {
            wVar.a(12);
        } else {
            wVar.a(12, str);
        }
        str = asc.m;
        if (str == null) {
            wVar.a(13);
        } else {
            wVar.a(13, str);
        }
        Double d = asc.n;
        if (d == null) {
            wVar.a(14);
        } else {
            wVar.a(14, d.doubleValue());
        }
        num = asc.o;
        if (num == null) {
            wVar.a(15);
        } else {
            wVar.a(15, (long) num.intValue());
        }
        str = asc.p;
        if (str == null) {
            wVar.a(16);
        } else {
            wVar.a(16, str);
        }
        str = asc.q;
        if (str == null) {
            wVar.a(17);
        } else {
            wVar.a(17, str);
        }
        str = atw.a(asc.r);
        if (str == null) {
            wVar.a(18);
        } else {
            wVar.a(18, str);
        }
        str = att.a(asc.s);
        if (str == null) {
            wVar.a(19);
        } else {
            wVar.a(19, str);
        }
        str = atr.a(asc.t);
        if (str == null) {
            wVar.a(20);
        } else {
            wVar.a(20, str);
        }
        str = atr.a(asc.u);
        if (str == null) {
            wVar.a(21);
        } else {
            wVar.a(21, str);
        }
        wVar.a(22, asc.v);
        obj = asc.w;
        String a = obj == null ? null : ato.a().a(obj);
        if (a == null) {
            wVar.a(23);
        } else {
            wVar.a(23, a);
        }
    }
}
