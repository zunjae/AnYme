package com.zunjae.anyme.rewrite.activities;

import android.annotation.SuppressLint;
import android.arch.lifecycle.as;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.leinardi.android.speeddial.SpeedDialView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.dialogs.animeDialog.AnimeCoverPreviewDialog;
import com.zunjae.anyme.dialogs.animeDialog.MiscSettingsDialog;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zpagerwrapper.a;
import defpackage.alg;
import defpackage.anu;
import defpackage.anv;
import defpackage.anw;
import defpackage.anx;
import defpackage.any;
import defpackage.anz;
import defpackage.aoa;
import defpackage.aob;
import defpackage.aoe;
import defpackage.arn;
import defpackage.art;
import defpackage.asr;
import defpackage.atz;
import defpackage.aug;
import defpackage.bit;
import defpackage.de;
import defpackage.fa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class AnimeInfoActivityR2 extends AbstractActivity {
    @BindView
    ImageView animePoster;
    public final String c = "https://i.imgur.com/QwSD1Fg.jpg";
    @BindView
    ImageView coverImage;
    private aoe d;
    @BindView
    ImageView dropDownImage;
    private asr e;
    private arn f;
    private String g = BuildConfig.FLAVOR;
    @BindView
    SpeedDialView speedDialView;
    @BindView
    TabLayout tabLayout;
    @BindView
    Toolbar toolbar;
    @BindView
    ViewPager viewPager;

    public static Intent a(Context context, arn arn) {
        return a(context, arn, new art());
    }

    public static Intent a(Context context, arn arn, art art) {
        Intent intent = new Intent(context, AnimeInfoActivityR2.class);
        intent.putExtra("minimalAnimeInfo", arn);
        intent.putExtra("args", art);
        return intent;
    }

    private /* synthetic */ void a(alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, String.format("Deleted %s from your profile", new Object[]{this.f.b()}), 0).show();
            finish();
            return;
        }
        Toast.makeText(this.b, String.format("Could not delete %s from your list, status code = %d", new Object[]{this.f.b(), Integer.valueOf(alg.a())}), 0).show();
    }

    private /* synthetic */ void a(asr asr) {
        String str;
        if (asr == null) {
            str = "https://i.imgur.com/QwSD1Fg.jpg";
        } else {
            String str2;
            Object[] objArr;
            this.e = asr;
            if (bit.c(asr.f)) {
                str2 = "https://media.kitsu.io/anime/cover_images/%d/large.jpg?%s";
                objArr = new Object[]{Integer.valueOf(asr.b), asr.f};
            } else if (bit.c(asr.e)) {
                str2 = "https://media.kitsu.io/anime/poster_images/%d/large.jpg?%s";
                objArr = new Object[]{Integer.valueOf(asr.b), asr.f};
            } else {
                str = BuildConfig.FLAVOR;
            }
            str = String.format(str2, objArr);
        }
        if (bit.a(str)) {
            str = "https://i.imgur.com/QwSD1Fg.jpg";
        }
        de.b(this.b).a(str).a(fa.ALL).a(this.animePoster);
    }

    private /* synthetic */ void a(j jVar, e eVar) {
        finish();
    }

    private /* synthetic */ void b(j jVar, e eVar) {
        this.d.b();
    }

    private /* synthetic */ void c(j jVar, e eVar) {
        new atz(this, (int) this.f.a(), (AnimeViewModel) as.a(this).a(AnimeViewModel.class), new -$$Lambda$AnimeInfoActivityR2$Apt5OiLxGga781getnZNse1P2nE(this)).f();
    }

    private void e() {
        new o(this).a((CharSequence) "Changes not saved").b((CharSequence) "You made some changes, do you want to update them to MyAnimeList?").c((CharSequence) "Yes, update").a(new -$$Lambda$AnimeInfoActivityR2$VJlUZ3Viru9eW6TOAjBqi1MXV3c(this)).e("No, ignore").b(new -$$Lambda$AnimeInfoActivityR2$54wdoPFCwAcFI6w2MxsJrFpS6zA(this)).l();
    }

    public final void c(String str) {
        this.g = str;
        de.b(this.b).a(str).a(fa.ALL).a(this.coverImage);
    }

    public final boolean c() {
        return this.coverImage.getDrawable() == null;
    }

    public final void d(String str) {
        this.toolbar.setTitle(str);
    }

    public final boolean d() {
        return bit.c(this.f.b());
    }

    @OnClick
    public final void onAnimeCoverImageClicked() {
        AnimeCoverPreviewDialog.a(this.f.b(), this.g).show(getSupportFragmentManager(), "bepis");
    }

    public final void onBackPressed() {
        aoe aoe = this.d;
        if (aoe == null || !aoe.a()) {
            super.onBackPressed();
        } else {
            e();
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_anime_info);
        ButterKnife.a(this);
        c(this.toolbar);
        this.f = (arn) getIntent().getParcelableExtra("minimalAnimeInfo");
        art art = (art) getIntent().getParcelableExtra("args");
        arn arn = this.f;
        if (arn != null) {
            if (bit.c(arn.c())) {
                c(this.f.c());
            }
            ((AnimeViewModel) as.a(this).a(AnimeViewModel.class)).h((int) this.f.a()).observe(this, new -$$Lambda$AnimeInfoActivityR2$s89-_0QwpnValdbiPvhgJZKW764(this));
            this.toolbar.setTitle(this.f.b());
            this.d = new aoe(getSupportFragmentManager(), this.f, art);
            new a(this.viewPager, this.d).a(this.tabLayout);
            return;
        }
        throw new IllegalArgumentException("Incorrectly set the bundle");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_betteranime, menu);
        return true;
    }

    @OnClick
    public final void onDropDownImageClicked() {
        String format = String.format("<b>Original:</b>\n%s", new Object[]{this.f.b()});
        asr asr = this.e;
        if (asr != null) {
            StringBuilder stringBuilder;
            if (bit.c(asr.i)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(format);
                stringBuilder.append(String.format("<br><br><b>English:</b>\n%s", new Object[]{this.e.i}));
                format = stringBuilder.toString();
            }
            if (bit.c(this.e.j)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(format);
                stringBuilder.append(String.format("<br><br><b>True Weebanese:</b>\n%s", new Object[]{this.e.j}));
                format = stringBuilder.toString();
            }
        }
        new o(this).a((CharSequence) "Titles").b(Html.fromHtml(format)).c((CharSequence) "OK").l();
    }

    @SuppressLint({"DefaultLocale"})
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            Context context;
            CharSequence charSequence;
            switch (itemId) {
                case R.id.menu_clear_saved_urls /*2131296590*/:
                    itemId = (int) this.f.a();
                    new anz().a(itemId);
                    new aob().a(itemId);
                    new aoa().a(itemId);
                    new any().a(itemId);
                    new anv().a(itemId);
                    new anx().a(itemId);
                    new anw().a(itemId);
                    new anu().a(itemId);
                    context = this.b;
                    charSequence = "URLs reset for all sites!";
                    break;
                case R.id.menu_copy_name /*2131296591*/:
                    aug.a(this.b, this.f.b());
                    context = this.b;
                    charSequence = "Copied title to your clipboard";
                    break;
                case R.id.menu_delete_anime /*2131296592*/:
                    new o(this).a((CharSequence) "Are you sure?").c((CharSequence) "Yes").e("No").a(new -$$Lambda$AnimeInfoActivityR2$Fv9_CJkG39lNfDUq-m7tcIIdTsg(this)).l();
                    break;
                case R.id.menu_share_anime /*2131296593*/:
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", String.format("https://myanimelist.net/anime/%d/%s", new Object[]{Long.valueOf(this.f.a()), this.f.b()}));
                    intent.putExtra("android.intent.extra.SUBJECT", this.f.b());
                    startActivity(Intent.createChooser(intent, "Share this Anime"));
                    break;
                case R.id.menu_skip_intro /*2131296594*/:
                case R.id.menu_sync_incorrect_episodes /*2131296595*/:
                    MiscSettingsDialog.a(this.f).show(getSupportFragmentManager(), "MISC_SETTINGS_DIALOG");
                    break;
                default:
                    break;
            }
            Toast.makeText(context, charSequence, 0).show();
        } else {
            aoe aoe = this.d;
            if (aoe != null && aoe.a()) {
                e();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
