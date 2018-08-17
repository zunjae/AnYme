package com.zunjae.anyme.rewrite.ui.fragments;

import android.annotation.SuppressLint;
import android.arch.lifecycle.as;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.rewrite.activities.AnimeInfoActivityR2;
import com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoBasicBL;
import com.zunjae.anyme.rewrite.ui.bls.FragmentAnimeInfoExtendedBL;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.anyme.rewrite.viewmodels.CharactersViewModel;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import defpackage.aiv;
import defpackage.alr;
import defpackage.amr;
import defpackage.are;
import defpackage.arn;
import defpackage.art;
import defpackage.arv;
import defpackage.arw;
import defpackage.arx;
import defpackage.arz;
import defpackage.aui;

@SuppressLint({"SetTextI18n"})
public final class FragmentAnimeInfoR2 extends Fragment {
    static final /* synthetic */ boolean a = true;
    private static final String b = "com.zunjae.anyme.rewrite.ui.fragments.FragmentAnimeInfoR2";
    private CharactersViewModel c;
    private AnimeViewModel d;
    private arn e;
    private art f;
    private FragmentAnimeInfoBasicBL g;
    private FragmentAnimeInfoExtendedBL h;
    private AnimeInfoActivityR2 i;
    private KanonViewModel j;
    @BindView
    LinearLayout progressContainer;
    @BindView
    LinearLayout scoreContainer;
    @BindView
    LinearLayout statusContainer;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;

    public static FragmentAnimeInfoR2 a(arn arn, art art) {
        FragmentAnimeInfoR2 fragmentAnimeInfoR2 = new FragmentAnimeInfoR2();
        Bundle bundle = new Bundle();
        bundle.putParcelable("minimalAnimeInfo", arn);
        bundle.putParcelable("args", art);
        fragmentAnimeInfoR2.setArguments(bundle);
        return fragmentAnimeInfoR2;
    }

    private void a(boolean z) {
        FragmentAnimeInfoExtendedBL fragmentAnimeInfoExtendedBL = this.h;
        if (fragmentAnimeInfoExtendedBL != null) {
            fragmentAnimeInfoExtendedBL.c(z);
            this.h.a(z);
            this.h.b(z);
            this.h.d(z);
        }
    }

    private /* synthetic */ void c() {
        this.swipeRefreshLayout.setRefreshing(false);
        a(a);
    }

    public final boolean a() {
        FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL = this.g;
        return (fragmentAnimeInfoBasicBL == null || !fragmentAnimeInfoBasicBL.a()) ? false : a;
    }

    public final void b() {
        FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL = this.g;
        if (fragmentAnimeInfoBasicBL != null) {
            fragmentAnimeInfoBasicBL.updateAnime();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        boolean z2;
        are are;
        boolean z3;
        super.onActivityCreated(bundle);
        are b = this.d.b(this.e.a());
        if (b == null) {
            b = are.a(this.e.a(), this.e.b(), this.e.c());
            z = false;
        } else {
            z = a;
        }
        if (bundle != null) {
            are are2 = (are) bundle.getParcelable("updatedAnime");
            boolean z4 = bundle.getBoolean("madeChanges");
            z2 = bundle.getBoolean("hasForceOpenedStream");
            are = are2;
            z3 = z4;
        } else {
            are = b.M();
            z3 = false;
            z2 = false;
        }
        this.g = new FragmentAnimeInfoBasicBL(this.i, this, b, are, z3, z, z2, this.d);
        this.h = new FragmentAnimeInfoExtendedBL(this.i, b, this.d, this.c, this.j);
        a(false);
        this.g.a(this.f.a());
        this.g.c();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 4 && i2 == 1) {
            this.g.a(intent);
        }
    }

    @aiv
    public final void onAnimeScoreChanged(arx arx) {
        this.g.a(arx.a());
    }

    @aiv
    public final void onAnimeStatusChanged(arz arz) {
        this.g.a(arz);
    }

    @aiv
    public final void onBulkAddCompleted(amr amr) {
        this.h.a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anime_main_r2, viewGroup, false);
        ButterKnife.a(this, inflate);
        this.swipeRefreshLayout.setOnRefreshListener(new -$$Lambda$FragmentAnimeInfoR2$ZLTzdtnEUu_5vttrc5MSfUHov2w(this));
        if (!a) {
            if (getArguments() == null) {
                throw new AssertionError();
            }
        }
        this.e = (arn) getArguments().getParcelable("minimalAnimeInfo");
        this.f = (art) getArguments().getParcelable("args");
        if (this.e == null || this.f == null) {
            throw new IllegalArgumentException("Incorrectly set the arguments");
        }
        this.d = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.c = (CharactersViewModel) as.a(this).a(CharactersViewModel.class);
        this.j = (KanonViewModel) as.a(this).a(KanonViewModel.class);
        this.i = (AnimeInfoActivityR2) getActivity();
        return inflate;
    }

    @aiv
    public final void onDefaultProgressionChanged(arv arv) {
        this.g.a(arv);
    }

    @aiv
    public final void onManualAnimeProgressionChanged(arw arw) {
        this.g.a(arw);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL = this.g;
        if (fragmentAnimeInfoBasicBL != null) {
            bundle.putParcelable("updatedAnime", fragmentAnimeInfoBasicBL.e());
            bundle.putBoolean("madeChanges", this.g.a());
            bundle.putBoolean("hasForceOpenedStream", this.g.d());
        }
    }

    public final void onStart() {
        super.onStart();
        aui.a().a((Object) this);
    }

    public final void onStop() {
        super.onStop();
        aui.a().b((Object) this);
    }

    @aiv
    public final void onStreamingSiteChanged(alr alr) {
        this.g.b();
    }
}
