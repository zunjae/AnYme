package defpackage;

import android.arch.persistence.room.b;
import android.arch.persistence.room.k;

final class aqp extends b<are> {
    final /* synthetic */ aoi a;

    aqp(aoi aoi, k kVar) {
        this.a = aoi;
        super(kVar);
    }

    public final String a() {
        return "UPDATE OR ABORT `animes` SET `series_animedb_id` = ?,`series_title` = ?,`series_synonyms` = ?,`series_type` = ?,`series_episodes` = ?,`series_status` = ?,`series_start` = ?,`series_end` = ?,`series_image` = ?,`my_watched_episodes` = ?,`my_start_date` = ?,`my_finish_date` = ?,`my_score` = ?,`my_rewatching` = ?,`my_rewatching_ep` = ?,`my_last_updated` = ?,`my_tags` = ?,`my_status` = ?,`kitsu_malId` = ?,`kitsu_kitsuId` = ?,`kitsu_startDate` = ?,`kitsu_endDate` = ?,`kitsu_posterId` = ?,`kitsu_coverId` = ?,`kitsu_type` = ?,`kitsu_titleEnJp` = ?,`kitsu_titleEn` = ?,`kitsu_titleJaJp` = ?,`livechart_malid` = ?,`livechart_time` = ?,`livechart_episode` = ? WHERE `series_animedb_id` = ?";
    }

    public final /* synthetic */ void a(w wVar, Object obj) {
        arq b;
        Integer num;
        are are = (are) obj;
        wVar.a(1, are.c());
        if (are.g() == null) {
            wVar.a(2);
        } else {
            wVar.a(2, are.g());
        }
        if (are.h() == null) {
            wVar.a(3);
        } else {
            wVar.a(3, are.h());
        }
        wVar.a(4, (long) are.i());
        wVar.a(5, (long) are.j());
        wVar.a(6, (long) are.k());
        if (are.l() == null) {
            wVar.a(7);
        } else {
            wVar.a(7, are.l());
        }
        if (are.m() == null) {
            wVar.a(8);
        } else {
            wVar.a(8, are.m());
        }
        if (are.n() == null) {
            wVar.a(9);
        } else {
            wVar.a(9, are.n());
        }
        wVar.a(10, (long) are.o());
        if (are.p() == null) {
            wVar.a(11);
        } else {
            wVar.a(11, are.p());
        }
        if (are.q() == null) {
            wVar.a(12);
        } else {
            wVar.a(12, are.q());
        }
        wVar.a(13, (long) are.r());
        wVar.a(14, (long) are.e());
        wVar.a(15, (long) are.s());
        wVar.a(16, are.t());
        if (are.u() == null) {
            wVar.a(17);
        } else {
            wVar.a(17, are.u());
        }
        wVar.a(18, (long) are.v());
        asr a = are.a();
        if (a != null) {
            wVar.a(19, (long) a.a);
            wVar.a(20, (long) a.b);
            String str = a.c;
            if (str == null) {
                wVar.a(21);
            } else {
                wVar.a(21, str);
            }
            String str2 = a.d;
            if (str2 == null) {
                wVar.a(22);
            } else {
                wVar.a(22, str2);
            }
            String str3 = a.e;
            if (str3 == null) {
                wVar.a(23);
            } else {
                wVar.a(23, str3);
            }
            String str4 = a.f;
            if (str4 == null) {
                wVar.a(24);
            } else {
                wVar.a(24, str4);
            }
            String str5 = a.g;
            if (str5 == null) {
                wVar.a(25);
            } else {
                wVar.a(25, str5);
            }
            String str6 = a.h;
            if (str6 == null) {
                wVar.a(26);
            } else {
                wVar.a(26, str6);
            }
            String str7 = a.i;
            if (str7 == null) {
                wVar.a(27);
            } else {
                wVar.a(27, str7);
            }
            String str8 = a.j;
            if (str8 != null) {
                wVar.a(28, str8);
                b = are.b();
                if (b == null) {
                    num = b.a;
                    if (num != null) {
                        wVar.a(29);
                    } else {
                        wVar.a(29, (long) num.intValue());
                    }
                    wVar.a(30, b.b);
                    wVar.a(31, (long) b.c);
                } else {
                    wVar.a(29);
                    wVar.a(30);
                    wVar.a(31);
                }
                wVar.a(32, are.c());
            }
        } else {
            wVar.a(19);
            wVar.a(20);
            wVar.a(21);
            wVar.a(22);
            wVar.a(23);
            wVar.a(24);
            wVar.a(25);
            wVar.a(26);
            wVar.a(27);
        }
        wVar.a(28);
        b = are.b();
        if (b == null) {
            wVar.a(29);
            wVar.a(30);
            wVar.a(31);
        } else {
            num = b.a;
            if (num != null) {
                wVar.a(29, (long) num.intValue());
            } else {
                wVar.a(29);
            }
            wVar.a(30, b.b);
            wVar.a(31, (long) b.c);
        }
        wVar.a(32, are.c());
    }
}
