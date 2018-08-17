package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.mikepenz.materialdrawer.a;
import com.mikepenz.materialdrawer.f;
import com.mikepenz.materialdrawer.o;
import com.mikepenz.materialdrawer.p;
import com.mikepenz.materialdrawer.t;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.BasicWebViewBrowser;
import com.zunjae.anyme.activities.browsers.light_browsers.KissAsianBrowser;
import com.zunjae.anyme.activities.browsers.light_browsers.LightKissBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HABrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HGBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HHBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HMBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HPBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.KHBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.SHMBrowser;
import com.zunjae.anyme.activities.explore.AdvancedAnimeSearch;
import com.zunjae.anyme.activities.explore.DiscoveryActivity;
import com.zunjae.anyme.activities.explore.FastAnimeSearchActivity;
import com.zunjae.anyme.activities.explore.MyCalendarActivity;
import com.zunjae.anyme.activities.explore.SeasonalAnimeActivity;
import com.zunjae.anyme.activities.misc.BulkDeleteActivity;
import com.zunjae.anyme.activities.misc.DiscordExplanationActivity;
import com.zunjae.anyme.activities.settings.UserSettingsActivity;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.activities.FavoritesActivity;
import com.zunjae.anyme.rewrite.activities.MainActivityR2;
import com.zunjae.anyme.rewrite.activities.UserRecommendationsActivity;
import java.security.SecureRandom;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class atq {
    private static final String a = "atq";
    private final SecureRandom b = new SecureRandom();
    private final MainActivityR2 c;
    private final Toolbar d;
    private o e;
    private a f;
    private final int g = 1;
    private final int h = 2;
    private final int i = 3;
    private final int j = 4;
    private final int k = 6;
    private final int l = 7;
    private final int m = 8;
    private final int n = 9;
    private aex o;
    private aex p;
    private aex q;
    private aex r;
    private List<arn> s;

    public atq(MainActivityR2 mainActivityR2, Toolbar toolbar) {
        this.c = mainActivityR2;
        this.d = toolbar;
        aey b = new aey().b(anq.c().a());
        arm e = anq.e();
        b = b.c(e != null ? e.c() : BuildConfig.FLAVOR).a(anq.e() != null ? String.format("https://myanimelist.cdn-dena.com/images/userimages/%s.jpg", new Object[]{anq.e().a()}) : BuildConfig.FLAVOR);
        r7.f = new f().a(r7.c).a().c().b().d().a(b, new afa().a("Show Profile").a(com.mikepenz.fontawesome_typeface_library.a.faw_user), new afa().a("Show Manga").a(com.mikepenz.fontawesome_typeface_library.a.faw_book), new afa().a("Bulk Delete Anime").a(com.mikepenz.fontawesome_typeface_library.a.faw_trash), r11, r12).a(new -$$Lambda$atq$yfoOygZwmVAPkx87iFDvG1k3uyU(this, r6, new afa().a("Account Settings").a(com.mikepenz.fontawesome_typeface_library.a.faw_cog), r9, r10, new afa().a("Logout").a(com.mikepenz.fontawesome_typeface_library.a.faw_sign_out))).e();
        b();
    }

    private void a(String str) {
        this.c.startActivity(BasicWebViewBrowser.a(this.c, str));
    }

    private /* synthetic */ boolean a(aex aex, aex aex2, aex aex3, aex aex4, aex aex5, aex aex6, aex aex7, aex aex8, aex aex9, aex aex10, aex aex11, aex aex12, aex aex13, aex aex14, aex aex15, aex aex16, aex aex17, aex aex18, View view, int i, afi afi) {
        atq atq = this;
        afi afi2 = afi;
        long c = afi.c();
        if (afi2 == aex) {
            MainActivityR2 mainActivityR2 = atq.c;
            mainActivityR2.startActivity(new Intent(mainActivityR2, LightKissBrowser.class));
        }
        if (c != 1) {
            MainActivityR2 mainActivityR22;
            MainActivityR2 mainActivityR23;
            if (c == 2) {
                List list = atq.s;
                if (list == null) {
                    return false;
                }
                if (list.size() > 0) {
                    list = atq.s;
                    arn arn = (arn) list.get(atq.b.nextInt(list.size() - 1));
                    Context context = atq.c;
                    context.startActivity(AnimeInfoActivityR2.a(context, arn));
                } else {
                    Toast.makeText(atq.c, "To use the random anime button you need some shows in your PTW", 1).show();
                }
            }
            if (c == 3) {
                MainActivityR2 mainActivityR24 = atq.c;
                mainActivityR24.startActivity(new Intent(mainActivityR24, FavoritesActivity.class));
            }
            if (c == 6) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, FastAnimeSearchActivity.class));
            }
            if (afi2 == aex2) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, HHBrowser.class));
            }
            if (afi2 == aex3) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(DiscoveryActivity.a(mainActivityR22));
            }
            if (afi2 == aex4) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, KissAsianBrowser.class));
            }
            if (afi2 == aex5) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, KHBrowser.class));
            }
            if (afi2 == aex6) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, HABrowser.class));
            }
            if (afi2 == aex7) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, HPBrowser.class));
            }
            if (afi2 == aex8) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, SHMBrowser.class));
            }
            if (afi2 == aex9) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, HMBrowser.class));
            }
            if (afi2 == aex10) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, HGBrowser.class));
            }
            if (afi2 == aex11) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, AdvancedAnimeSearch.class));
            }
            if (afi2 == aex12) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, DiscordExplanationActivity.class));
            }
            if (afi2 == aex13) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, UserRecommendationsActivity.class));
            }
            if (afi2 == atq.q) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, MyCalendarActivity.class));
            }
            if (afi2 == aex14) {
                mainActivityR22 = atq.c;
                mainActivityR22.startActivity(new Intent(mainActivityR22, SeasonalAnimeActivity.class));
            }
            if (afi2 != aex15) {
                if (afi2 == aex16) {
                }
                if (afi2 == aex17) {
                    atq.c.a(atq.c.getResources().getString(R.string.reddit_dm));
                }
                if (afi2 == aex18) {
                    mainActivityR23 = atq.c;
                    mainActivityR23.startActivityForResult(new Intent(mainActivityR23, UserSettingsActivity.class), 10);
                }
                return false;
            }
            atq.c.a(atq.c.getResources().getString(R.string.reddit_url));
            if (afi2 == aex17) {
                atq.c.a(atq.c.getResources().getString(R.string.reddit_dm));
            }
            if (afi2 == aex18) {
                mainActivityR23 = atq.c;
                mainActivityR23.startActivityForResult(new Intent(mainActivityR23, UserSettingsActivity.class), 10);
            }
            return false;
        }
        throw new bin("Bring back profile cleanup :cry:");
    }

    private /* synthetic */ boolean a(afj afj, afj afj2, afj afj3, afj afj4, afj afj5, View view, afj afj6, boolean z) {
        if (afj6 == afj) {
            a(String.format("http://myanimelist.net/profile/%s", new Object[]{anq.c().a()}));
        }
        if (afj6 == afj2) {
            a("https://myanimelist.net/editprofile.php?go=myoptions");
        }
        if (afj6 == afj3) {
            a(String.format("https://myanimelist.net/mangalist/%s?status=1&tag=", new Object[]{anq.c().a()}));
        }
        if (afj6 == afj4) {
            MainActivityR2 mainActivityR2 = this.c;
            mainActivityR2.startActivity(new Intent(mainActivityR2, BulkDeleteActivity.class));
        }
        if (afj6 == afj5) {
            anq.a(this.c);
        }
        return false;
    }

    private void b() {
        aex aex = (aex) ((aex) ((aex) ((aex) new aex().c("Visit /r/AnYme")).j()).a("TIP!")).a(com.mikepenz.fontawesome_typeface_library.a.faw_reddit_square);
        this.p = (aex) ((aex) ((aex) ((aex) new aex().c("MAL Profile Cleanup")).j()).a(1)).a(com.mikepenz.fontawesome_typeface_library.a.faw_diamond);
        this.o = (aex) ((aex) ((aex) ((aex) ((aex) new aex().c("Random Anime")).j()).b("From your PTW")).a(2)).a(com.mikepenz.fontawesome_typeface_library.a.faw_random);
        this.r = (aex) ((aex) ((aex) ((aex) ((aex) new aex().c("Favorites")).j()).b("Shows and Waifus")).a(3)).a(com.mikepenz.fontawesome_typeface_library.a.faw_heart);
        aex aex2 = (aex) ((aex) ((aex) new aex().c("Open KissAsian")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex3 = (aex) ((aex) ((aex) ((aex) ((aex) new aex().c("Join Discord Server")).b("Chat With Other People")).a(8)).j()).p();
        aex aex4 = aex3;
        aex aex5 = (aex) ((aex) ((aex) ((aex) ((aex) ((aex) new aex().c("Recommendations")).a(9)).j()).b("NEW!")).o()).a(com.mikepenz.fontawesome_typeface_library.a.faw_thumbs_o_up);
        aex aex6 = aex5;
        aex aex7 = (aex) ((aex) ((aex) new aex().c("Open HentaiHaven")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex8 = (aex) ((aex) ((aex) new aex().c("Open HentaiMama")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex9 = (aex) ((aex) ((aex) new aex().c("Open KissHentai")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex10 = (aex) ((aex) ((aex) new aex().c("Open HentaiGasm")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex11 = (aex) ((aex) ((aex) new aex().c("Open Hentai Pulse")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex12 = (aex) ((aex) ((aex) new aex().c("Open Stream Hentai Movies")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex13 = (aex) ((aex) ((aex) new aex().c("Open HAnime")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        aex aex14 = (aex) ((aex) ((aex) new aex().c("Open KissAnime")).j()).a(com.mikepenz.fontawesome_typeface_library.a.faw_video_camera);
        this.q = (aex) ((aex) ((aex) ((aex) ((aex) ((aex) new aex().c("My Calendar")).a(com.mikepenz.fontawesome_typeface_library.a.faw_calendar_plus_o)).a(4)).b("UPDATED!")).o()).j();
        aex aex15 = (aex) ((aex) ((aex) ((aex) new aex().c("Settings")).j()).b("Personalize the App")).a(com.mikepenz.fontawesome_typeface_library.a.faw_cog);
        aex aex16 = (aex) ((aex) ((aex) new aex().c("Advanced Anime Search")).a(com.mikepenz.fontawesome_typeface_library.a.faw_search_plus)).j();
        aex aex17 = (aex) ((aex) ((aex) new aex().c("Categories")).a(com.mikepenz.fontawesome_typeface_library.a.faw_tags)).j();
        aex aex18 = aex7;
        aex7 = (aex) ((aex) ((aex) new aex().c("Seasonal Anime")).a(com.mikepenz.fontawesome_typeface_library.a.faw_calendar)).j();
        aex aex19 = aex7;
        aex aex20 = aex17;
        aex aex21 = aex2;
        aex aex22 = aex9;
        aex aex23 = (aex) ((aex) ((aex) ((aex) new aex().c("Fast Anime Search")).a(6)).a(com.mikepenz.fontawesome_typeface_library.a.faw_search)).j();
        aex2 = (aex) ((aex) ((aex) ((aex) new aex().c("Leave Feedback on Reddit")).b("And help improve the App!")).a(com.mikepenz.fontawesome_typeface_library.a.faw_reddit_alien)).j();
        aex aex24 = aex2;
        aex aex25 = aex13;
        aex9 = (aex) ((aex) ((aex) ((aex) new aex().c("Message me on Reddit")).b("In case you have any questions")).a(com.mikepenz.fontawesome_typeface_library.a.faw_envelope_o)).j();
        aex aex26 = aex9;
        aex aex27 = aex11;
        t a = new t().a(this.c).a().a(this.d).a(this.f);
        r8 = new afi[15];
        aex aex28 = aex12;
        r8[0] = aex3;
        aex aex29 = aex8;
        aex aex30 = aex10;
        r8[1] = (afi) ((aeq) ((aeq) ((aeq) new aeq().c("Watch")).a(com.mikepenz.fontawesome_typeface_library.a.faw_play_circle)).j()).a(r20, r21);
        r8[2] = (afi) ((aeq) ((aeq) ((aeq) ((aeq) new aeq().c("NSFW")).a(com.mikepenz.fontawesome_typeface_library.a.faw_play_circle)).a(7)).j()).a(r26, r28, r27, r25, r29, r30, r24);
        r8[3] = new aeo();
        r8[4] = this.r;
        r8[5] = this.o;
        r8[6] = this.q;
        r8[7] = new aeo();
        r8[8] = aex23;
        r8[9] = aex5;
        r8[10] = aex17;
        r8[11] = aex7;
        r8[12] = new afd().a("Support");
        r8[13] = aex2;
        r8[14] = aex9;
        t b = a.a(r8).b(r1);
        atq atq = this;
        t tVar = b;
        -$$Lambda$atq$Y6ZHVMdzk18Q5hnqa6eO6g2VC-g -__Lambda_atq_Y6ZHVMdzk18Q5hnqa6eO6g2VC-g = r0;
        -$$Lambda$atq$Y6ZHVMdzk18Q5hnqa6eO6g2VC-g -__Lambda_atq_Y6ZHVMdzk18Q5hnqa6eO6g2VC-g2 = new -$$Lambda$atq$Y6ZHVMdzk18Q5hnqa6eO6g2VC-g(this, aex14, aex18, aex20, aex21, aex22, aex25, aex27, aex28, aex29, aex30, aex16, aex4, aex6, aex19, aex24, aex, aex26, aex15);
        this.e = tVar.a((p) -__Lambda_atq_Y6ZHVMdzk18Q5hnqa6eO6g2VC-g).g();
        int i = 0;
        for (afi c : this.e.e()) {
            if (7 == c.c()) {
                i++;
            }
        }
        if (i == 1) {
            boolean z;
            boolean z2;
            if (anl.b(r1.c)) {
                r1.e.b(7);
            }
            if (anq.c().a().equalsIgnoreCase("shawr")) {
                z = false;
                z2 = false;
            } else {
                z = false;
                z2 = aux.b("preference_key_hide_discord_item", false);
            }
            if (z2) {
                r1.e.b(8);
            }
            if (aux.b("preference_key_hide_cleanup_item", z)) {
                r1.e.b(1);
            }
            r1.e.a(0);
            return;
        }
        throw new RuntimeException(String.format("The NSFW ID appeared too many times (%d)", new Object[]{Integer.valueOf(i)}));
    }

    public final o a() {
        return this.e;
    }

    public final void a(List<arn> list) {
        this.s = list;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(list.size());
        this.e.a(2, new adx(stringBuilder.toString()));
    }
}
