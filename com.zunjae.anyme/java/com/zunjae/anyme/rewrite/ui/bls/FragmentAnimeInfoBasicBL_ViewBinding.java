package com.zunjae.anyme.rewrite.ui.bls;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class FragmentAnimeInfoBasicBL_ViewBinding implements Unbinder {
    private FragmentAnimeInfoBasicBL b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;

    public FragmentAnimeInfoBasicBL_ViewBinding(FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL, View view) {
        this.b = fragmentAnimeInfoBasicBL;
        fragmentAnimeInfoBasicBL.animeProgressValue = (TextView) ct.a(view, (int) R.id.valueAnimeProgress, "field 'animeProgressValue'", TextView.class);
        fragmentAnimeInfoBasicBL.animeScoreValue = (TextView) ct.a(view, (int) R.id.valueAnimeScore, "field 'animeScoreValue'", TextView.class);
        fragmentAnimeInfoBasicBL.watchContainer = (CardView) ct.a(view, (int) R.id.cardViewContainer, "field 'watchContainer'", CardView.class);
        fragmentAnimeInfoBasicBL.animeStatusValue = (TextView) ct.a(view, (int) R.id.valueAnimeStatus, "field 'animeStatusValue'", TextView.class);
        View a = ct.a(view, R.id.plusOne, "field 'plusOneButton' and method 'addOneEpisodeWatched'");
        fragmentAnimeInfoBasicBL.plusOneButton = (Button) ct.b(a, R.id.plusOne, "field 'plusOneButton'", Button.class);
        this.c = a;
        a.setOnClickListener(new b(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.watchButton, "field 'watchButton' and method 'onWatchButtonClicked'");
        fragmentAnimeInfoBasicBL.watchButton = (Button) ct.b(a, R.id.watchButton, "field 'watchButton'", Button.class);
        this.d = a;
        a.setOnClickListener(new e(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.updateButton, "field 'updateButton' and method 'updateAnime'");
        fragmentAnimeInfoBasicBL.updateButton = (Button) ct.b(a, R.id.updateButton, "field 'updateButton'", Button.class);
        this.e = a;
        a.setOnClickListener(new f(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.buttonOtherSource, "field 'pickOtherSiteButton' and method 'changeStreamingSite'");
        fragmentAnimeInfoBasicBL.pickOtherSiteButton = (TextView) ct.b(a, R.id.buttonOtherSource, "field 'pickOtherSiteButton'", TextView.class);
        this.f = a;
        a.setOnClickListener(new g(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.addToPTW, "field 'addToPtwButton' and method 'onAddToPtwButtonClicked'");
        fragmentAnimeInfoBasicBL.addToPtwButton = (Button) ct.b(a, R.id.addToPTW, "field 'addToPtwButton'", Button.class);
        this.g = a;
        a.setOnClickListener(new h(this, fragmentAnimeInfoBasicBL));
        fragmentAnimeInfoBasicBL.userStatusContainer = (ViewGroup) ct.a(view, (int) R.id.viewGroupUserStatus, "field 'userStatusContainer'", ViewGroup.class);
        a = ct.a(view, R.id.statusContainer, "method 'changeStatus'");
        this.h = a;
        a.setOnClickListener(new i(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.fabCast, "method 'onCastButtonClicked'");
        this.i = a;
        a.setOnClickListener(new j(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.fabDownload, "method 'onDownloadButtonClicked'");
        this.j = a;
        a.setOnClickListener(new k(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.fabFavorite, "method 'onFavoriteButtonClicked'");
        this.k = a;
        a.setOnClickListener(new l(this, fragmentAnimeInfoBasicBL));
        a = ct.a(view, R.id.scoreContainer, "method 'changeScore'");
        this.l = a;
        a.setOnClickListener(new c(this, fragmentAnimeInfoBasicBL));
        view = ct.a(view, R.id.progressContainer, "method 'changeProgress'");
        this.m = view;
        view.setOnClickListener(new d(this, fragmentAnimeInfoBasicBL));
    }

    public final void a() {
        FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL = this.b;
        if (fragmentAnimeInfoBasicBL != null) {
            this.b = null;
            fragmentAnimeInfoBasicBL.animeProgressValue = null;
            fragmentAnimeInfoBasicBL.animeScoreValue = null;
            fragmentAnimeInfoBasicBL.watchContainer = null;
            fragmentAnimeInfoBasicBL.animeStatusValue = null;
            fragmentAnimeInfoBasicBL.plusOneButton = null;
            fragmentAnimeInfoBasicBL.watchButton = null;
            fragmentAnimeInfoBasicBL.updateButton = null;
            fragmentAnimeInfoBasicBL.pickOtherSiteButton = null;
            fragmentAnimeInfoBasicBL.addToPtwButton = null;
            fragmentAnimeInfoBasicBL.userStatusContainer = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.m.setOnClickListener(null);
            this.m = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
