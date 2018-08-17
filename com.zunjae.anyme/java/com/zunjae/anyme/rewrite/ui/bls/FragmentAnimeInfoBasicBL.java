package com.zunjae.anyme.rewrite.ui.bls;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.activities.browsers.AnimeFLVBrowser;
import com.zunjae.anyme.activities.browsers.AnimeHeavenBrowser;
import com.zunjae.anyme.activities.browsers.AnimePaheBrowser;
import com.zunjae.anyme.activities.browsers.ChiaAnimeBrowser;
import com.zunjae.anyme.activities.browsers.GoGoBrowser;
import com.zunjae.anyme.activities.browsers.KissBrowser;
import com.zunjae.anyme.activities.browsers.MasterAnimeBrowser;
import com.zunjae.anyme.activities.browsers.NineAnimeBrowser;
import com.zunjae.anyme.activities.browsers.RyuAnimeBrowser;
import com.zunjae.anyme.activities.browsers.TwistMoeBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HGBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HHBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HMBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.HPBrowser;
import com.zunjae.anyme.activities.browsers.nsfw.KHBrowser;
import com.zunjae.anyme.dialogs.CastDialog;
import com.zunjae.anyme.dialogs.StreamingSitePickerDialog;
import com.zunjae.anyme.dialogs.b;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.ui.dialogs.DefaultEpisodePickerDialogR2;
import com.zunjae.anyme.rewrite.ui.dialogs.ManualEpisodeSelectorDialogR2;
import com.zunjae.anyme.rewrite.ui.dialogs.ScorePickerDialogR2;
import com.zunjae.anyme.rewrite.ui.dialogs.StatusPickerDialogR2;
import com.zunjae.anyme.rewrite.ui.fragments.FragmentAnimeInfoR2;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.alf;
import defpackage.alg;
import defpackage.alr;
import defpackage.ann;
import defpackage.are;
import defpackage.arv;
import defpackage.arw;
import defpackage.arz;
import defpackage.aty;
import defpackage.aua;
import defpackage.aub;
import defpackage.aud;
import defpackage.aun;
import defpackage.aup;
import defpackage.aux;
import defpackage.mh;
import defpackage.tw;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import mehdi.sakout.fancybuttons.R;

public final class FragmentAnimeInfoBasicBL {
    private static final String a = "com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoBasicBL";
    @BindView
    Button addToPtwButton;
    @BindView
    TextView animeProgressValue;
    @BindView
    TextView animeScoreValue;
    @BindView
    TextView animeStatusValue;
    private final AnimeInfoActivityR2 b;
    private final FragmentAnimeInfoR2 c;
    private final are d;
    private final are e;
    private final AnimeViewModel f;
    private boolean g = false;
    private boolean h;
    private boolean i;
    private final boolean j;
    @BindView
    TextView pickOtherSiteButton;
    @BindView
    Button plusOneButton;
    @BindView
    Button updateButton;
    @BindView
    ViewGroup userStatusContainer;
    @BindView
    Button watchButton;
    @BindView
    CardView watchContainer;

    public FragmentAnimeInfoBasicBL(AnimeInfoActivityR2 animeInfoActivityR2, FragmentAnimeInfoR2 fragmentAnimeInfoR2, are are, are are2, boolean z, boolean z2, boolean z3, AnimeViewModel animeViewModel) {
        ButterKnife.a(this, animeInfoActivityR2);
        this.b = animeInfoActivityR2;
        this.d = are;
        this.c = fragmentAnimeInfoR2;
        this.e = are2;
        this.i = z;
        this.j = z2;
        this.h = z3;
        this.f = animeViewModel;
        g();
        b();
        if (this.j) {
            this.userStatusContainer.setVisibility(0);
            this.addToPtwButton.setVisibility(8);
            return;
        }
        this.userStatusContainer.setVisibility(8);
        this.addToPtwButton.setVisibility(0);
        this.addToPtwButton.startAnimation(aup.a(0.6d, 300));
    }

    private /* synthetic */ void a(alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, String.format("Successfully added %s to your profile", new Object[]{this.d.g()}), 0).show();
            this.addToPtwButton.setVisibility(8);
            return;
        }
        aub.a(this.b, alg);
    }

    private void a(alr alr, boolean z, boolean z2) {
        aun.c(alr.b());
        int c = alr.c();
        switch (c) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                a(KissBrowser.class, z, z2);
                return;
            case tw.a /*1*/:
                a(GoGoBrowser.class, z, z2);
                return;
            case tw.b /*2*/:
                a(NineAnimeBrowser.class, z, z2);
                return;
            case f.c /*3*/:
                a(MasterAnimeBrowser.class, z, z2);
                return;
            case mh.d /*4*/:
                a(AnimeHeavenBrowser.class, z, z2);
                return;
            default:
                switch (c) {
                    case mh.g /*7*/:
                        a(ChiaAnimeBrowser.class, z, z2);
                        return;
                    case mh.h /*8*/:
                        a(AnimePaheBrowser.class, z, z2);
                        return;
                    case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                        a(AnimeFLVBrowser.class, z, z2);
                        return;
                    case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                        a(RyuAnimeBrowser.class, z, z2);
                        return;
                    case R.styleable.FancyButtonsAttrs_fb_fontIconResource /*11*/:
                        a(TwistMoeBrowser.class, z, z2);
                        return;
                    default:
                        switch (c) {
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*100*/:
                                a(KHBrowser.class);
                                return;
                            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /*101*/:
                                a(HGBrowser.class);
                                return;
                            default:
                                switch (c) {
                                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorAlertDialogListItem /*103*/:
                                        a(HMBrowser.class);
                                        return;
                                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorSearchUrl /*104*/:
                                        a(HHBrowser.class);
                                        return;
                                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /*105*/:
                                        a(HPBrowser.class);
                                        break;
                                    default:
                                        break;
                                }
                                return;
                        }
                }
        }
    }

    private /* synthetic */ void a(j jVar, e eVar) {
        i();
    }

    private void a(Class cls) {
        this.b.startActivity(AbstractNSFWBrowser.a(this.b, cls, this.e.g()));
    }

    private void a(Class cls, boolean z, boolean z2) {
        this.c.startActivityForResult(AbstractAnimeBrowser.a(this.b, this.e, cls, z, z2), 4);
    }

    private /* synthetic */ void a(boolean z, alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, String.format("Successfully updated %s", new Object[]{this.d.g()}), 0).show();
            this.updateButton.setEnabled(false);
            this.updateButton.setAnimation(null);
            this.i = false;
            if (!z) {
                this.b.finish();
                return;
            }
        }
        aub.a(this.b, alg);
    }

    private void f() {
        if (this.e.o() == this.e.j() && this.e.o() > 0) {
            this.e.h(2);
        }
        if (this.e.o() > this.e.o() && this.e.j() == 0) {
            this.e.h(1);
        }
        if (this.e.o() == 0 && this.e.o() > 0) {
            this.e.F();
        }
        g();
        if (!this.i) {
            h();
        }
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void g() {
        this.animeStatusValue.setText(this.e.D());
        this.animeProgressValue.setText(this.e.b(null));
        String str = BuildConfig.FLAVOR;
        int y = this.e.y() - this.d.y();
        if (y > 0) {
            str = "+";
        }
        if (y == 0) {
            this.animeProgressValue.setText(this.e.b(null));
        } else {
            TextView textView = this.animeProgressValue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.e.b(null));
            stringBuilder.append(String.format(" (%s%d)", new Object[]{str, Integer.valueOf(y)}));
            textView.setText(stringBuilder.toString());
        }
        this.plusOneButton.setEnabled(this.e.K());
        str = BuildConfig.FLAVOR;
        y = this.e.r() - this.d.r();
        if (y > 0) {
            str = "+";
        }
        if (y == 0) {
            TextView textView2 = this.animeScoreValue;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.e.r());
            textView2.setText(stringBuilder2.toString());
            return;
        }
        TextView textView3 = this.animeScoreValue;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.e.r());
        stringBuilder3.append(String.format(" (%s%d)", new Object[]{str, Integer.valueOf(y)}));
        textView3.setText(stringBuilder3.toString());
    }

    private void h() {
        this.updateButton.setEnabled(true);
        this.updateButton.startAnimation(aup.a(0.6d, 400));
        this.i = true;
    }

    private void i() {
        new aua(this.b, this.e, this.f, new -$$Lambda$FragmentAnimeInfoBasicBL$42FNI1Svmb9XdMPBuk0HzKtKzLs(this, aux.b(this.b.getResources().getString(com.zunjae.anyme.R.string.preference_key_stay_on_animescreen), false))).f();
    }

    public final void a(int i) {
        this.e.e(i);
        g();
        h();
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra("newEpisodeNumber", -1);
        if (intExtra > 0) {
            if (this.e.j() <= 0 || intExtra <= this.e.j()) {
                if (this.e.f()) {
                    if (intExtra > this.e.s()) {
                        this.e.g(intExtra);
                        if (this.e.s() == this.e.j()) {
                            this.e.f(0);
                        }
                        Toast.makeText(this.b, "Rewatch progress set to episode ".concat(String.valueOf(intExtra)), 0).show();
                        f();
                    }
                } else if (intExtra > this.e.o()) {
                    this.e.d(intExtra);
                    if (this.e.o() < this.e.j()) {
                        this.e.h(1);
                    }
                    if (this.e.I()) {
                        this.e.h(2);
                    }
                    Toast.makeText(this.b, "Progress set to episode ".concat(String.valueOf(intExtra)), 0).show();
                    f();
                }
            }
        }
    }

    public final void a(arv arv) {
        if (arv.a()) {
            this.e.g(arv.b());
            if (this.e.s() == this.e.j()) {
                this.e.f(0);
                this.e.h(2);
            }
        } else {
            this.e.d(arv.b());
            if (arv.b() == 0) {
                this.e.h(6);
            }
            if (!this.e.I() && arv.b() > 0) {
                this.e.h(1);
            }
            if (this.e.I()) {
                this.e.H();
            }
            if (this.e.v() == 2 && !this.e.I()) {
                this.e.h(1);
            }
        }
        g();
        h();
    }

    public final void a(arw arw) {
        a(new arv(false, arw.a()));
    }

    public final void a(arz arz) {
        this.e.h(arz.a());
        if (arz.a() == 2) {
            this.e.H();
        }
        g();
        h();
    }

    public final void a(boolean z) {
        if (z && !this.h) {
            this.h = true;
            a(ann.a(this.e.d()), false, false);
        }
        if (this.i) {
            h();
        } else {
            this.updateButton.setEnabled(false);
        }
    }

    public final boolean a() {
        return this.i;
    }

    @OnClick
    public final void addOneEpisodeWatched() {
        this.e.G();
        f();
    }

    public final void b() {
        this.watchButton.setText(ann.a(this.e.d()).b());
    }

    public final void c() {
        new a(this, this.b, this.f, this.d.d()).f();
    }

    @OnClick
    public final void changeProgress() {
        b manualEpisodeSelectorDialogR2;
        Bundle bundle = new Bundle();
        if (this.e.j() == 0) {
            manualEpisodeSelectorDialogR2 = new ManualEpisodeSelectorDialogR2();
            bundle.putInt("myWatchedEpisodes", this.e.o());
        } else {
            manualEpisodeSelectorDialogR2 = new DefaultEpisodePickerDialogR2();
            bundle.putParcelable("defaultEpisodePickerDialog", this.e.N());
        }
        manualEpisodeSelectorDialogR2.setArguments(bundle);
        manualEpisodeSelectorDialogR2.show(this.b.getSupportFragmentManager(), "CRUD_DIALOG_EPISODE_PICKER");
    }

    @OnClick
    public final void changeScore() {
        ScorePickerDialogR2 scorePickerDialogR2 = new ScorePickerDialogR2();
        Bundle bundle = new Bundle();
        bundle.putInt("currentScore", this.e.r());
        scorePickerDialogR2.setArguments(bundle);
        scorePickerDialogR2.show(this.b.getSupportFragmentManager(), "CRUD_DIALOG_SCORE_PICKER");
    }

    @OnClick
    public final void changeStatus() {
        StatusPickerDialogR2 statusPickerDialogR2 = new StatusPickerDialogR2();
        Bundle bundle = new Bundle();
        bundle.putInt("currentStatus", this.e.v());
        statusPickerDialogR2.setArguments(bundle);
        statusPickerDialogR2.show(this.b.getSupportFragmentManager(), "CRUD_DIALOG_STATUS_PICKER");
    }

    @OnClick
    public final void changeStreamingSite() {
        StreamingSitePickerDialog.a(this.e.d(), this.g).show(this.b.getSupportFragmentManager(), "CRUD_DIALOG_STREAM_PICKER");
    }

    public final boolean d() {
        return this.h;
    }

    public final are e() {
        return this.e;
    }

    @OnClick
    public final void onAddToPtwButtonClicked() {
        new aty(this.b, this.d, this.f, new -$$Lambda$FragmentAnimeInfoBasicBL$zYsRJY4MxYXbmtFOBpJuZ3mr5Rc(this)).f();
    }

    @OnClick
    public final void onCastButtonClicked() {
        if (alf.a(this.b)) {
            a(ann.a(this.e.d()), true, false);
        } else {
            CastDialog.a(CastDialog.b, "BepisThonk").show(this.b.getSupportFragmentManager(), "BEPISTHONK");
        }
    }

    @OnClick
    public final void onDownloadButtonClicked() {
        if (aud.a(this.b)) {
            a(ann.a(this.e.d()), false, true);
            return;
        }
        Toast.makeText(this.b, "To download videos you need ADM!", 1).show();
        aud.b(this.b);
    }

    @OnClick
    public final void onFavoriteButtonClicked() {
        Toast.makeText(this.b, "Who am I? Someone that's afraid to let go. You decide, if you're ever gonna, let me know", 1).show();
    }

    @OnClick
    public final void onWatchButtonClicked() {
        a(ann.a(this.e.d()), false, false);
    }

    @OnClick
    public final void updateAnime() {
        if (this.e.v() != 2 || this.e.k() == 2) {
            i();
        } else {
            new o(this.b).a((CharSequence) "Are you sure").b((CharSequence) "This Anime has not yet finished airing, are you sure that your status is properly set?").c((CharSequence) "Yes").e("No").a(new -$$Lambda$FragmentAnimeInfoBasicBL$adcK1zy-am_I_UvBBUoGVEu8wiU(this)).l();
        }
    }
}
