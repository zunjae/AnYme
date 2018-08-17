package defpackage;

import java.util.ArrayList;
import mehdi.sakout.fancybuttons.R;

public final class alr {
    @xe(a = "name")
    private final String a;
    @xe(a = "id")
    private final int b;
    private String c;

    private alr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private alr(String str, String str2) {
        this.a = str;
        this.b = 9;
        this.c = str2;
    }

    public static alr a() {
        return alr.h();
    }

    public static alr a(int i) {
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return alr.h();
            case tw.a /*1*/:
                return alr.n();
            case tw.b /*2*/:
                return alr.k();
            case f.c /*3*/:
                return alr.m();
            case mh.d /*4*/:
                return alr.i();
            default:
                switch (i) {
                    case mh.g /*7*/:
                        return alr.p();
                    case mh.h /*8*/:
                        return alr.o();
                    case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                        return alr.l();
                    case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                        return alr.j();
                    case R.styleable.FancyButtonsAttrs_fb_fontIconResource /*11*/:
                        return new alr("Twist", 11);
                    default:
                        switch (i) {
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*100*/:
                                return alr.d();
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /*101*/:
                                return alr.g();
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /*102*/:
                                return new alr("HAnime.TV", (int) me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorAlertDialogListItem /*103*/:
                                return alr.f();
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorSearchUrl /*104*/:
                                return alr.e();
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /*105*/:
                                return new alr("Hentai Pulse", (int) me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                            default:
                                return alr.h();
                        }
                }
        }
    }

    public static ArrayList<alr> a(boolean z) {
        Object g;
        ArrayList<alr> arrayList = new ArrayList();
        if (z) {
            arrayList.add(alr.d());
            arrayList.add(alr.e());
            arrayList.add(alr.f());
            g = alr.g();
        } else {
            arrayList.add(alr.h());
            arrayList.add(alr.i());
            arrayList.add(alr.k());
            arrayList.add(alr.l());
            arrayList.add(alr.m());
            arrayList.add(alr.p());
            arrayList.add(alr.j());
            arrayList.add(alr.n());
            g = alr.o();
        }
        arrayList.add(g);
        return arrayList;
    }

    private static alr d() {
        return new alr("KissHentai", 100);
    }

    private static alr e() {
        return new alr("HentaiHaven", (int) me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorSearchUrl);
    }

    private static alr f() {
        return new alr("HentaiMama", (int) me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorAlertDialogListItem);
    }

    private static alr g() {
        return new alr("HentaiGasm", (int) me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
    }

    private static alr h() {
        return new alr("KissAnime", 0);
    }

    private static alr i() {
        return new alr("AnimeHeaven", 4);
    }

    private static alr j() {
        return new alr("RyuAnime", 10);
    }

    private static alr k() {
        return new alr("9Anime", 2);
    }

    private static alr l() {
        return new alr("AnimeFLV (ES)", "Spanish Subs");
    }

    private static alr m() {
        return new alr("MasterAnime", 3);
    }

    private static alr n() {
        return new alr("GoGoAnime", 1);
    }

    private static alr o() {
        return new alr("AnimePahe", 8);
    }

    private static alr p() {
        return new alr("Chia Anime", 7);
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
