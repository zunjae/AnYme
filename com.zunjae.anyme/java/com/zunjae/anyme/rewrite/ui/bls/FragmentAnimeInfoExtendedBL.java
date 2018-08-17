package com.zunjae.anyme.rewrite.ui.bls;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.cunoraz.tagview.TagView;
import com.cunoraz.tagview.b;
import com.leinardi.android.speeddial.SpeedDialView;
import com.leinardi.android.speeddial.d;
import com.leinardi.android.speeddial.f;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.BasicWebViewBrowser;
import com.zunjae.anyme.activities.browsers.ZeroChanBrowser;
import com.zunjae.anyme.activities.explore.GenreSearchActivity;
import com.zunjae.anyme.activities.explore.NewsActivity;
import com.zunjae.anyme.activities.explore.SongsActivity;
import com.zunjae.anyme.activities.explore.VideosActivity;
import com.zunjae.anyme.adapters.animes.AnimeRelatedShowsAdapter;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.activities.AnimeRecommendationsActivityR2;
import com.zunjae.anyme.rewrite.activities.CharactersActivityR2;
import com.zunjae.anyme.rewrite.activities.RelatedAnimeActivityR2;
import com.zunjae.anyme.rewrite.adapters.AnimeAdditionalAdapterR2;
import com.zunjae.anyme.rewrite.adapters.AnimeCharactersAdapterR2;
import com.zunjae.anyme.rewrite.adapters.AnimeRecommendationsAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.anyme.rewrite.viewmodels.CharactersViewModel;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import defpackage.aml;
import defpackage.ane;
import defpackage.anf;
import defpackage.are;
import defpackage.arn;
import defpackage.ash;
import defpackage.bit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

@SuppressLint({"SetTextI18n", "DefaultLocale"})
public final class FragmentAnimeInfoExtendedBL {
    private static final String a = "com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL";
    @BindView
    RecyclerView additionalInfoRecyclerView;
    private final AnimeInfoActivityR2 b;
    private final are c;
    @BindView
    TextView charactersErrorMessage;
    @BindView
    RecyclerView charactersRecyclerView;
    private final AnimeViewModel d;
    private final CharactersViewModel e;
    @BindView
    TextView errorMessageAdditionalInfo;
    @BindView
    TextView errorMessageSynopsis;
    private final KanonViewModel f;
    private AnimeRelatedShowsAdapter g = new AnimeRelatedShowsAdapter(this.b, 0);
    @BindView
    TextView genreTagsErrorMessage;
    @BindView
    TagView genreTagsView;
    private AnimeCharactersAdapterR2 h;
    private AnimeRecommendationsAdapter i;
    private AnimeAdditionalAdapterR2 j;
    private Snackbar k;
    @BindView
    ProgressBar progressBarAdditionalInfo;
    @BindView
    ProgressBar progressBarSynopsis;
    @BindView
    TextView readMoreText;
    @BindView
    TextView recommendationsErrorMessage;
    @BindView
    RecyclerView recyclerViewRecommendations;
    @BindView
    RecyclerView recyclerViewRelatedAnime;
    @BindView
    TextView relatedAnimeErrorMessage;
    @BindView
    TextView synopsisAnime;
    @BindView
    TextView viewAllCharacters;
    @BindView
    TextView viewAllRecommendations;
    @BindView
    TextView viewAllRelated;

    public FragmentAnimeInfoExtendedBL(AnimeInfoActivityR2 animeInfoActivityR2, are are, AnimeViewModel animeViewModel, CharactersViewModel charactersViewModel, KanonViewModel kanonViewModel) {
        this.b = animeInfoActivityR2;
        this.c = are;
        this.f = kanonViewModel;
        this.e = charactersViewModel;
        this.d = animeViewModel;
        ButterKnife.a(this, this.b);
        SpeedDialView speedDialView = (SpeedDialView) this.b.findViewById(R.id.speedDial);
        speedDialView.a(new f(R.id.fab_mal, R.drawable.earth).a("MyAnimeList").a());
        speedDialView.a(new f(R.id.fab_videos, R.drawable.youtube).a("Videos").a());
        speedDialView.a(new f(R.id.fab_news, R.drawable.newspaper).a("News").a());
        speedDialView.a(new f(R.id.fab_songs, R.drawable.music).a("Songs").a());
        speedDialView.a(new f(R.id.fab_photos, R.drawable.image).a("Photos").a());
        speedDialView.a(new f(R.id.fab_discuss, R.drawable.reddit).a("Discuss").a());
        speedDialView.setOnActionSelectedListener(new -$$Lambda$FragmentAnimeInfoExtendedBL$oKrQ9tlfK_XccEo4yLKkqMonRxE(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b, 0, false);
        this.recyclerViewRelatedAnime.setAdapter(this.g);
        this.recyclerViewRelatedAnime.setLayoutManager(linearLayoutManager);
        this.d.f(this.c.d()).observe(this.b, new -$$Lambda$FragmentAnimeInfoExtendedBL$xHyOZxFVK-8UTKe-j2cAAMOcCKE(this));
    }

    private /* synthetic */ void a(j jVar, e eVar) {
        a(this.c.E());
    }

    private /* synthetic */ void a(b bVar, int i) {
        Object obj;
        Iterator it = aml.a(true).iterator();
        while (it.hasNext()) {
            aml aml = (aml) it.next();
            if (aml.a().equalsIgnoreCase(bVar.b)) {
                AnimeInfoActivityR2 animeInfoActivityR2 = this.b;
                animeInfoActivityR2.startActivity(GenreSearchActivity.a(animeInfoActivityR2, aml));
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj == null) {
            Toast.makeText(this.b, "I do not recognize this genre... Please send zunjae on Reddit or Discord a message", 1).show();
        }
    }

    static /* synthetic */ void a(com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL r10, defpackage.asc r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = r10.progressBarAdditionalInfo;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r10.progressBarSynopsis;
        r0.setVisibility(r1);
        r0 = 1;
        r2 = 0;
        if (r11 == 0) goto L_0x02c5;
    L_0x0010:
        r3 = r11.a();
        r3 = r3 ^ r0;
        if (r3 == 0) goto L_0x0019;
    L_0x0017:
        goto L_0x02c5;
    L_0x0019:
        r3 = r10.genreTagsView;
        r3.setVisibility(r2);
        r3 = r10.errorMessageAdditionalInfo;
        r3.setVisibility(r1);
        r3 = r10.errorMessageSynopsis;
        r3.setVisibility(r1);
        r3 = r10.genreTagsErrorMessage;
        r3.setVisibility(r1);
        r3 = r11.w;
        r3 = r3.c;
        if (r3 == 0) goto L_0x0041;
    L_0x0033:
        r3 = r3.iterator();
    L_0x0037:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0041;
    L_0x003d:
        r3.next();
        goto L_0x0037;
    L_0x0041:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r10.c;
        r4 = r4.w();
        if (r4 == 0) goto L_0x006b;
    L_0x004e:
        r4 = r10.c;
        r5 = new java.text.SimpleDateFormat;
        r6 = "yyyy-MM-dd";
        r5.<init>(r6);
        r4 = r4.a(r5);
        if (r4 <= 0) goto L_0x006b;
    L_0x005d:
        r5 = new ane;
        r6 = "Estimated Episodes Released:";
        r4 = java.lang.String.valueOf(r4);
        r5.<init>(r6, r4);
        r3.add(r5);
    L_0x006b:
        r4 = r11.i;	 Catch:{ Exception -> 0x0083 }
        r4 = r4.intValue();	 Catch:{ Exception -> 0x0083 }
        if (r4 <= 0) goto L_0x0083;	 Catch:{ Exception -> 0x0083 }
    L_0x0073:
        r4 = new ane;	 Catch:{ Exception -> 0x0083 }
        r5 = "Episodes:";	 Catch:{ Exception -> 0x0083 }
        r6 = r11.i;	 Catch:{ Exception -> 0x0083 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ Exception -> 0x0083 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x0083 }
        r3.add(r4);	 Catch:{ Exception -> 0x0083 }
    L_0x0083:
        r4 = r11.o;	 Catch:{ Exception -> 0x00a5 }
        r4 = r4.intValue();	 Catch:{ Exception -> 0x00a5 }
        if (r4 <= 0) goto L_0x00a5;	 Catch:{ Exception -> 0x00a5 }
    L_0x008b:
        r4 = new ane;	 Catch:{ Exception -> 0x00a5 }
        r5 = "Ranked:";	 Catch:{ Exception -> 0x00a5 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00a5 }
        r7 = "#";	 Catch:{ Exception -> 0x00a5 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x00a5 }
        r7 = r11.o;	 Catch:{ Exception -> 0x00a5 }
        r6.append(r7);	 Catch:{ Exception -> 0x00a5 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x00a5 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x00a5 }
        r3.add(r4);	 Catch:{ Exception -> 0x00a5 }
    L_0x00a5:
        r4 = r11.n;	 Catch:{ Exception -> 0x00c9 }
        r4 = r4.doubleValue();	 Catch:{ Exception -> 0x00c9 }
        r6 = 0;	 Catch:{ Exception -> 0x00c9 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ Exception -> 0x00c9 }
        if (r8 <= 0) goto L_0x00c9;	 Catch:{ Exception -> 0x00c9 }
    L_0x00b1:
        r4 = new ane;	 Catch:{ Exception -> 0x00c9 }
        r5 = "Score:";	 Catch:{ Exception -> 0x00c9 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c9 }
        r6.<init>();	 Catch:{ Exception -> 0x00c9 }
        r7 = r11.n;	 Catch:{ Exception -> 0x00c9 }
        r6.append(r7);	 Catch:{ Exception -> 0x00c9 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x00c9 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x00c9 }
        r3.add(r4);	 Catch:{ Exception -> 0x00c9 }
    L_0x00c9:
        r4 = r11.g;
        r4 = defpackage.bit.c(r4);
        if (r4 == 0) goto L_0x00dd;
    L_0x00d1:
        r4 = new ane;
        r5 = "Type:";
        r6 = r11.g;
        r4.<init>(r5, r6);
        r3.add(r4);
    L_0x00dd:
        r4 = r11.h;
        r4 = defpackage.bit.c(r4);
        if (r4 == 0) goto L_0x00f1;
    L_0x00e5:
        r4 = new ane;
        r5 = "Source:";
        r6 = r11.h;
        r4.<init>(r5, r6);
        r3.add(r4);
    L_0x00f1:
        r4 = r11.r;
        if (r4 == 0) goto L_0x012c;
    L_0x00f5:
        r4 = r4.iterator();
    L_0x00f9:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x012c;
    L_0x00ff:
        r5 = r4.next();
        r5 = (defpackage.asf) r5;
        r6 = new ane;
        r7 = "Studio:";
        r8 = r5.b;
        r6.<init>(r7, r8);
        r7 = new java.lang.StringBuilder;
        r8 = "https://myanimelist.net/anime/producer/";
        r7.<init>(r8);
        r5 = r5.a();
        r7.append(r5);
        r5 = r7.toString();
        r6.a(r5);
        r5 = defpackage.anf.f;
        r6.a(r5);
        r3.add(r6);
        goto L_0x00f9;
    L_0x012c:
        r4 = r11.m;
        r4 = defpackage.bit.c(r4);
        if (r4 == 0) goto L_0x0140;
    L_0x0134:
        r4 = new ane;
        r5 = "Rating:";
        r6 = r11.m;
        r4.<init>(r5, r6);
        r3.add(r4);
    L_0x0140:
        r4 = r11.j;
        r4 = defpackage.bit.c(r4);
        if (r4 == 0) goto L_0x0154;
    L_0x0148:
        r4 = new ane;
        r5 = "Status:";
        r6 = r11.j;
        r4.<init>(r5, r6);
        r3.add(r4);
    L_0x0154:
        r4 = r11.l;
        r5 = 0;
        r6 = r10.c;
        r6 = r6.i();
        r7 = 3;
        if (r6 == r7) goto L_0x01c4;
    L_0x0160:
        r6 = r10.c;
        r6 = r6.j();
        if (r6 <= r0) goto L_0x01c4;
    L_0x0168:
        r6 = "^[0-9]{1,2} min.*$";
        r6 = r4.matches(r6);
        if (r6 == 0) goto L_0x01c4;
    L_0x0170:
        r6 = " min";	 Catch:{ Exception -> 0x01c4 }
        r6 = r4.split(r6);	 Catch:{ Exception -> 0x01c4 }
        r6 = r6[r2];	 Catch:{ Exception -> 0x01c4 }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ Exception -> 0x01c4 }
        r7 = r11.i;	 Catch:{ Exception -> 0x01c4 }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x01c4 }
        r6 = r6 * r7;	 Catch:{ Exception -> 0x01c4 }
        if (r6 == 0) goto L_0x01c4;	 Catch:{ Exception -> 0x01c4 }
    L_0x0186:
        r7 = 60;	 Catch:{ Exception -> 0x01c4 }
        if (r6 <= r7) goto L_0x01b5;	 Catch:{ Exception -> 0x01c4 }
    L_0x018a:
        r8 = r6 / 60;	 Catch:{ Exception -> 0x01c4 }
        r6 = r6 % r7;	 Catch:{ Exception -> 0x01c4 }
        if (r6 != 0) goto L_0x019f;	 Catch:{ Exception -> 0x01c4 }
    L_0x018f:
        r6 = "%dh";	 Catch:{ Exception -> 0x01c4 }
        r7 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x01c4 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x01c4 }
        r7[r2] = r8;	 Catch:{ Exception -> 0x01c4 }
        r6 = java.lang.String.format(r6, r7);	 Catch:{ Exception -> 0x01c4 }
    L_0x019d:
        r5 = r6;	 Catch:{ Exception -> 0x01c4 }
        goto L_0x01c4;	 Catch:{ Exception -> 0x01c4 }
    L_0x019f:
        r7 = "%dh %dm";	 Catch:{ Exception -> 0x01c4 }
        r9 = 2;	 Catch:{ Exception -> 0x01c4 }
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x01c4 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x01c4 }
        r9[r2] = r8;	 Catch:{ Exception -> 0x01c4 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x01c4 }
        r9[r0] = r6;	 Catch:{ Exception -> 0x01c4 }
        r6 = java.lang.String.format(r7, r9);	 Catch:{ Exception -> 0x01c4 }
        goto L_0x019d;	 Catch:{ Exception -> 0x01c4 }
    L_0x01b5:
        r7 = "%dm";	 Catch:{ Exception -> 0x01c4 }
        r8 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x01c4 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x01c4 }
        r8[r2] = r6;	 Catch:{ Exception -> 0x01c4 }
        r6 = java.lang.String.format(r7, r8);	 Catch:{ Exception -> 0x01c4 }
        goto L_0x019d;
    L_0x01c4:
        if (r5 != 0) goto L_0x01d1;
    L_0x01c6:
        r0 = new ane;
        r5 = "Duration:";
        r0.<init>(r5, r4);
        r3.add(r0);
        goto L_0x01e9;
    L_0x01d1:
        r6 = new ane;
        r7 = "Duration:";
        r8 = " (%s)";
        r0 = new java.lang.Object[r0];
        r0[r2] = r5;
        r0 = java.lang.String.format(r8, r0);
        r0 = r4.concat(r0);
        r6.<init>(r7, r0);
        r3.add(r6);
    L_0x01e9:
        r0 = r11.k;
        r0 = defpackage.bit.c(r0);
        if (r0 == 0) goto L_0x01fd;
    L_0x01f1:
        r0 = new ane;
        r4 = "Aired:";
        r5 = r11.k;
        r0.<init>(r4, r5);
        r3.add(r0);
    L_0x01fd:
        r0 = r11.q;
        r4 = defpackage.bit.c(r0);
        if (r4 == 0) goto L_0x021e;
    L_0x0205:
        r4 = "unknown";
        r0 = r0.equalsIgnoreCase(r4);
        if (r0 != 0) goto L_0x021e;
    L_0x020d:
        r0 = new ane;
        r4 = "Broadcast:";
        r5 = r11.q;
        r0.<init>(r4, r5);
        r4 = defpackage.anf.e;
        r0.a(r4);
        r3.add(r0);
    L_0x021e:
        r0 = new com.zunjae.anyme.rewrite.adapters.AnimeAdditionalAdapterR2;
        r4 = r10.b;
        r0.<init>(r4, r3);
        r10.j = r0;
        r0 = new com.zunjae.zrecyclerview.b;
        r4 = r10.b;
        r5 = r10.additionalInfoRecyclerView;
        r6 = r10.j;
        r0.<init>(r4, r5, r6);
        r4 = com.zunjae.zrecyclerview.a.a;
        r0 = r0.b(r4);
        r0.a();
        r0 = r11.w;
        if (r0 == 0) goto L_0x0269;
    L_0x023f:
        r4 = "Adaptation";
        r0 = r0.a;
        r5 = defpackage.anf.d;
        a(r4, r0, r5, r3);
        r0 = "Prequel";
        r4 = r11.w;
        r4 = r4.b;
        r5 = defpackage.anf.b;
        a(r0, r4, r5, r3);
        r0 = "Sequel";
        r4 = r11.w;
        r4 = r4.c;
        r5 = defpackage.anf.b;
        a(r0, r4, r5, r3);
        r0 = "OVA";
        r4 = r11.w;
        r4 = r4.d;
        r5 = defpackage.anf.b;
        a(r0, r4, r5, r3);
    L_0x0269:
        r0 = r10.additionalInfoRecyclerView;
        r0.setNestedScrollingEnabled(r2);
        r0 = r11.p;
        r0 = defpackage.bit.c(r0);
        if (r0 == 0) goto L_0x0291;
    L_0x0276:
        r0 = r10.synopsisAnime;
        r1 = r11.p;
        r1 = android.text.Html.fromHtml(r1);
        r0.setText(r1);
        r0 = r10.synopsisAnime;
        r0.setVisibility(r2);
        r0 = r10.synopsisAnime;
        r1 = new com.zunjae.anyme.rewrite.ui.bls.-$$Lambda$FragmentAnimeInfoExtendedBL$rsbwHNX4D4BPitrJWe8WBRh2Ruw;
        r1.<init>(r10);
        r0.post(r1);
        goto L_0x0296;
    L_0x0291:
        r0 = r10.synopsisAnime;
        r0.setVisibility(r1);
    L_0x0296:
        r0 = r10.b;
        r0 = r0.c();
        if (r0 == 0) goto L_0x02ad;
    L_0x029e:
        r0 = r11.f;
        r0 = defpackage.bit.c(r0);
        if (r0 == 0) goto L_0x02ad;
    L_0x02a6:
        r0 = r10.b;
        r1 = r11.f;
        r0.c(r1);
    L_0x02ad:
        r0 = r10.b;
        r0 = r0.d();
        if (r0 != 0) goto L_0x02c4;
    L_0x02b5:
        r0 = r11.c;
        r0 = defpackage.bit.c(r0);
        if (r0 == 0) goto L_0x02c4;
    L_0x02bd:
        r10 = r10.b;
        r11 = r11.c;
        r10.d(r11);
    L_0x02c4:
        return;
    L_0x02c5:
        r11 = r10.j;
        if (r11 == 0) goto L_0x02e0;
    L_0x02c9:
        r11 = r11.a();
        if (r11 == 0) goto L_0x02e0;
    L_0x02cf:
        r11 = r10.synopsisAnime;
        r11 = r11.getText();
        r11 = r11.toString();
        r11 = r11.length();
        if (r11 <= 0) goto L_0x02e0;
    L_0x02df:
        goto L_0x02e1;
    L_0x02e0:
        r0 = 0;
    L_0x02e1:
        if (r0 != 0) goto L_0x030c;
    L_0x02e3:
        r11 = r10.errorMessageAdditionalInfo;
        r0 = "Could not load any additional information.\nSwipe down to retry";
        r11.setText(r0);
        r11 = r10.errorMessageSynopsis;
        r0 = "Could not load the synopsis.\nSwipe down to retry";
        r11.setText(r0);
        r11 = r10.genreTagsErrorMessage;
        r0 = "Could not load any genres.\nSwipe down to retry";
        r11.setText(r0);
        r11 = r10.genreTagsView;
        r11.setVisibility(r1);
        r11 = r10.errorMessageAdditionalInfo;
        r11.setVisibility(r2);
        r11 = r10.errorMessageSynopsis;
        r11.setVisibility(r2);
        r10 = r10.genreTagsErrorMessage;
        r10.setText(r2);
    L_0x030c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL.a(com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL, asc):void");
    }

    static /* synthetic */ void a(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, List list) {
        if (list == null) {
            fragmentAnimeInfoExtendedBL.viewAllRecommendations.setVisibility(8);
            fragmentAnimeInfoExtendedBL.recommendationsErrorMessage.setVisibility(0);
            fragmentAnimeInfoExtendedBL.recommendationsErrorMessage.setText("Could not connect to MyAnimeList.");
        } else if (list.size() == 0) {
            fragmentAnimeInfoExtendedBL.viewAllRecommendations.setVisibility(8);
            fragmentAnimeInfoExtendedBL.recommendationsErrorMessage.setVisibility(0);
            fragmentAnimeInfoExtendedBL.recommendationsErrorMessage.setText("No recommendations found for this show");
        } else {
            fragmentAnimeInfoExtendedBL.viewAllRecommendations.setVisibility(list.size() > 3 ? 0 : 8);
            fragmentAnimeInfoExtendedBL.recommendationsErrorMessage.setVisibility(8);
            fragmentAnimeInfoExtendedBL.i = new AnimeRecommendationsAdapter(fragmentAnimeInfoExtendedBL.b, list, 0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fragmentAnimeInfoExtendedBL.b, 0, false);
            fragmentAnimeInfoExtendedBL.recyclerViewRecommendations.setAdapter(fragmentAnimeInfoExtendedBL.i);
            fragmentAnimeInfoExtendedBL.recyclerViewRecommendations.setLayoutManager(linearLayoutManager);
        }
    }

    private void a(String str) {
        str = String.format("https://www.zerochan.net/search?q=%s&m=1", new Object[]{str});
        Context context = this.b;
        context.startActivity(ZeroChanBrowser.a(context, this.c, str));
    }

    private static void a(String str, ArrayList<ash> arrayList, int i, ArrayList<ane> arrayList2) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ash ash = (ash) it.next();
                ane ane = new ane(str, ash.c());
                if (i == anf.b) {
                    ane.a(new arn((long) ash.a(), ash.c(), BuildConfig.FLAVOR));
                }
                if (i == anf.d) {
                    ane.a(ash.b());
                }
                ane.a(i);
                arrayList2.add(ane);
            }
        }
    }

    private /* synthetic */ void a(List list) {
        if (list != null) {
            TextView textView;
            CharSequence charSequence;
            int i = 0;
            if (list == null) {
                this.viewAllRelated.setVisibility(8);
                this.relatedAnimeErrorMessage.setVisibility(0);
                textView = this.relatedAnimeErrorMessage;
                charSequence = "Could not connect to Kanon. You're most likely rate limited, try again in a minute!";
            } else if (list.size() == 0) {
                this.viewAllRelated.setVisibility(8);
                this.relatedAnimeErrorMessage.setVisibility(0);
                textView = this.relatedAnimeErrorMessage;
                charSequence = "No related shows found";
            } else {
                TextView textView2 = this.viewAllRelated;
                if (list.size() <= 3) {
                    i = 8;
                }
                textView2.setVisibility(i);
                this.relatedAnimeErrorMessage.setVisibility(8);
                this.g.a(list);
                this.g.b();
            }
            textView.setText(charSequence);
        }
    }

    private /* synthetic */ boolean a(d dVar) {
        Intent intent;
        AnimeInfoActivityR2 animeInfoActivityR2;
        switch (dVar.a()) {
            case R.id.fab_discuss /*2131296432*/:
                if (this.c.k() == 3) {
                    Toast.makeText(this.b, "This Anime has not yet been aired, so you probably won't find any discussions", 1).show();
                }
                StringBuilder stringBuilder = new StringBuilder(String.format("title:\"%s\"", new Object[]{this.c.g()}));
                are are = this.c;
                Object arrayList = new ArrayList();
                String h = are.h();
                if (!bit.a(h)) {
                    if (h.startsWith("; ")) {
                        arrayList.add(h.replace("; ", BuildConfig.FLAVOR));
                    } else {
                        Collections.addAll(arrayList, h.split("; "));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuilder.append(String.format(" OR title:\"%s\"", new Object[]{(String) it.next()}));
                }
                String format = String.format("subreddit:anime self:yes title:\"Spoilers\" title:\"discussion\" title:Episode (%s)", new Object[]{stringBuilder.toString()});
                StringBuilder stringBuilder2 = new StringBuilder("https://www.reddit.com/search?q=");
                stringBuilder2.append(format);
                stringBuilder2.append("&restrict_sr=on&sort=new&t=all");
                intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder2.toString()));
                intent.setFlags(268435456);
                animeInfoActivityR2 = this.b;
                break;
            case R.id.fab_mal /*2131296433*/:
                onOpenMalButtonClicked();
                return false;
            case R.id.fab_news /*2131296434*/:
                animeInfoActivityR2 = this.b;
                intent = NewsActivity.a(animeInfoActivityR2, this.c);
                break;
            case R.id.fab_photos /*2131296435*/:
                if (this.c.v() != 2) {
                    new o(this.b).a((CharSequence) "Are you sure?").b((CharSequence) "You haven't finished watching this Anime, you may see spoilers").d().e().a(new -$$Lambda$FragmentAnimeInfoExtendedBL$q6c2i77WX7AvqefqTEiyruujLuA(this)).l();
                } else {
                    a(this.c.E());
                }
                return false;
            case R.id.fab_songs /*2131296436*/:
                animeInfoActivityR2 = this.b;
                intent = SongsActivity.a(animeInfoActivityR2, this.c);
                break;
            case R.id.fab_videos /*2131296437*/:
                animeInfoActivityR2 = this.b;
                intent = VideosActivity.a((Context) animeInfoActivityR2, this.c);
                break;
            default:
                StringBuilder stringBuilder3 = new StringBuilder("No switch case found for ");
                stringBuilder3.append(dVar.a());
                throw new IllegalStateException(stringBuilder3.toString());
        }
        animeInfoActivityR2.startActivity(intent);
        return false;
    }

    private /* synthetic */ void b() {
        TextView textView;
        int i;
        if (this.synopsisAnime.getLineCount() > 3) {
            textView = this.readMoreText;
            i = 0;
        } else {
            textView = this.readMoreText;
            i = 8;
        }
        textView.setVisibility(i);
    }

    static /* synthetic */ void b(com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL r4, defpackage.asc r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r5 = r5.s;	 Catch:{ Exception -> 0x006f }
        r0 = r4.b;	 Catch:{ Exception -> 0x006f }
        r0 = defpackage.aue.b(r0);	 Catch:{ Exception -> 0x006f }
        r1 = r4.b;	 Catch:{ Exception -> 0x006f }
        r2 = 2131099685; // 0x7f060025 float:1.781173E38 double:1.052903142E-314;	 Catch:{ Exception -> 0x006f }
        r1 = android.support.v4.content.ContextCompat.getColor(r1, r2);	 Catch:{ Exception -> 0x006f }
        r2 = r4.genreTagsView;	 Catch:{ Exception -> 0x006f }
        r2.a();	 Catch:{ Exception -> 0x006f }
        r2 = 0;	 Catch:{ Exception -> 0x006f }
        if (r5 != 0) goto L_0x0026;	 Catch:{ Exception -> 0x006f }
    L_0x0019:
        r5 = r4.genreTagsErrorMessage;	 Catch:{ Exception -> 0x006f }
        r0 = "Could not find the genres.\nSwipe down to retry";	 Catch:{ Exception -> 0x006f }
        r5.setText(r0);	 Catch:{ Exception -> 0x006f }
        r4 = r4.genreTagsErrorMessage;	 Catch:{ Exception -> 0x006f }
        r4.setVisibility(r2);	 Catch:{ Exception -> 0x006f }
        return;	 Catch:{ Exception -> 0x006f }
    L_0x0026:
        r3 = r5.size();	 Catch:{ Exception -> 0x006f }
        if (r3 != 0) goto L_0x0039;	 Catch:{ Exception -> 0x006f }
    L_0x002c:
        r5 = r4.genreTagsErrorMessage;	 Catch:{ Exception -> 0x006f }
        r0 = "This Anime apparently has no known genres";	 Catch:{ Exception -> 0x006f }
        r5.setText(r0);	 Catch:{ Exception -> 0x006f }
        r4 = r4.genreTagsErrorMessage;	 Catch:{ Exception -> 0x006f }
        r4.setVisibility(r2);	 Catch:{ Exception -> 0x006f }
        return;	 Catch:{ Exception -> 0x006f }
    L_0x0039:
        r2 = r4.genreTagsErrorMessage;	 Catch:{ Exception -> 0x006f }
        r3 = 8;	 Catch:{ Exception -> 0x006f }
        r2.setVisibility(r3);	 Catch:{ Exception -> 0x006f }
        r5 = r5.iterator();	 Catch:{ Exception -> 0x006f }
    L_0x0044:
        r2 = r5.hasNext();	 Catch:{ Exception -> 0x006f }
        if (r2 == 0) goto L_0x0065;	 Catch:{ Exception -> 0x006f }
    L_0x004a:
        r2 = r5.next();	 Catch:{ Exception -> 0x006f }
        r2 = (defpackage.asb) r2;	 Catch:{ Exception -> 0x006f }
        r3 = new com.cunoraz.tagview.b;	 Catch:{ Exception -> 0x006f }
        r2 = r2.a;	 Catch:{ Exception -> 0x006f }
        r3.<init>(r2);	 Catch:{ Exception -> 0x006f }
        r3.e = r0;	 Catch:{ Exception -> 0x006f }
        r2 = 1099956224; // 0x41900000 float:18.0 double:5.43450582E-315;	 Catch:{ Exception -> 0x006f }
        r3.j = r2;	 Catch:{ Exception -> 0x006f }
        r3.f = r1;	 Catch:{ Exception -> 0x006f }
        r2 = r4.genreTagsView;	 Catch:{ Exception -> 0x006f }
        r2.a(r3);	 Catch:{ Exception -> 0x006f }
        goto L_0x0044;	 Catch:{ Exception -> 0x006f }
    L_0x0065:
        r5 = r4.genreTagsView;	 Catch:{ Exception -> 0x006f }
        r0 = new com.zunjae.anyme.rewrite.ui.bls.-$$Lambda$FragmentAnimeInfoExtendedBL$KJ3Z5VxO9If-ZiPU1otSYnRWlhw;	 Catch:{ Exception -> 0x006f }
        r0.<init>(r4);	 Catch:{ Exception -> 0x006f }
        r5.setOnTagClickListener(r0);	 Catch:{ Exception -> 0x006f }
    L_0x006f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL.b(com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL, asc):void");
    }

    static /* synthetic */ void b(FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL, List list) {
        if (list == null) {
            fragmentAnimeInfoExtendedBL.charactersErrorMessage.setVisibility(0);
            fragmentAnimeInfoExtendedBL.charactersErrorMessage.setText("Could not connect to MAL.\nSwipe down to try again");
        } else if (list.size() == 0) {
            fragmentAnimeInfoExtendedBL.charactersErrorMessage.setVisibility(0);
            TextView textView = fragmentAnimeInfoExtendedBL.charactersErrorMessage;
            StringBuilder stringBuilder = new StringBuilder("No characters found for ");
            stringBuilder.append(fragmentAnimeInfoExtendedBL.c.g());
            textView.setText(stringBuilder.toString());
        } else {
            fragmentAnimeInfoExtendedBL.charactersErrorMessage.setVisibility(8);
            fragmentAnimeInfoExtendedBL.h = new AnimeCharactersAdapterR2(fragmentAnimeInfoExtendedBL.b, list, fragmentAnimeInfoExtendedBL.c.d(), fragmentAnimeInfoExtendedBL.f, fragmentAnimeInfoExtendedBL.c.J(), 0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fragmentAnimeInfoExtendedBL.b, 0, false);
            fragmentAnimeInfoExtendedBL.charactersRecyclerView.setAdapter(fragmentAnimeInfoExtendedBL.h);
            fragmentAnimeInfoExtendedBL.charactersRecyclerView.setLayoutManager(linearLayoutManager);
            if (list.size() > 3) {
                fragmentAnimeInfoExtendedBL.viewAllCharacters.setVisibility(0);
            } else {
                fragmentAnimeInfoExtendedBL.viewAllCharacters.setVisibility(8);
            }
            new q(fragmentAnimeInfoExtendedBL, fragmentAnimeInfoExtendedBL.b, list).f();
        }
    }

    public final void a() {
        Snackbar snackbar = this.k;
        if (snackbar != null && snackbar.isShown()) {
            this.k.dismiss();
        }
    }

    public final void a(boolean z) {
        n nVar = new n(this, this.b, this.c.c());
        nVar.a(z);
        nVar.f();
    }

    public final void b(boolean z) {
        o oVar = new o(this, this.b, this.c.c(), this.d);
        oVar.a(z);
        oVar.f();
    }

    public final void c(boolean z) {
        m mVar = new m(this, this.b, this.c.c());
        mVar.a(z);
        mVar.f();
    }

    public final void d(boolean z) {
        if (!z) {
            AnimeRelatedShowsAdapter animeRelatedShowsAdapter = this.g;
            if (animeRelatedShowsAdapter != null && animeRelatedShowsAdapter.a()) {
                return;
            }
        }
        p pVar = new p(this, this.b);
        pVar.a(z);
        pVar.f();
    }

    @OnClick
    public final void onOpenMalButtonClicked() {
        AnimeInfoActivityR2 animeInfoActivityR2 = this.b;
        animeInfoActivityR2.startActivity(BasicWebViewBrowser.a(animeInfoActivityR2, this.c.x()));
    }

    @OnClick
    public final void onReadMoreSummaryClicked() {
        new o(this.b).a((CharSequence) "Synopsis").b(this.synopsisAnime.getText()).c((CharSequence) "ok").l();
    }

    @OnClick
    public final void onViewAllCharactersClicked() {
        AnimeCharactersAdapterR2 animeCharactersAdapterR2 = this.h;
        if (animeCharactersAdapterR2 != null) {
            ArrayList b = animeCharactersAdapterR2.b();
            AnimeInfoActivityR2 animeInfoActivityR2 = this.b;
            animeInfoActivityR2.startActivity(CharactersActivityR2.a(animeInfoActivityR2, this.c.d(), this.c.J(), b));
        }
    }

    @OnClick
    public final void onViewAllRecommendationsClicked() {
        AnimeInfoActivityR2 animeInfoActivityR2 = this.b;
        animeInfoActivityR2.startActivity(AnimeRecommendationsActivityR2.a(animeInfoActivityR2, this.c.d(), this.c.J()));
    }

    @OnClick
    public final void onViewAllRelatedClicked() {
        AnimeInfoActivityR2 animeInfoActivityR2 = this.b;
        animeInfoActivityR2.startActivity(RelatedAnimeActivityR2.a(animeInfoActivityR2, this.c.d(), this.c.J()));
    }
}
