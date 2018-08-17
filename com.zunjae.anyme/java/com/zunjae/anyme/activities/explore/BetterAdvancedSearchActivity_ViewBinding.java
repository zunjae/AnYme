package com.zunjae.anyme.activities.explore;

import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class BetterAdvancedSearchActivity_ViewBinding implements Unbinder {
    private BetterAdvancedSearchActivity b;
    private View c;
    private View d;
    private View e;
    private View f;

    public BetterAdvancedSearchActivity_ViewBinding(BetterAdvancedSearchActivity betterAdvancedSearchActivity, View view) {
        this.b = betterAdvancedSearchActivity;
        View a = ct.a(view, R.id.cardViewGenre, "method 'onCardViewGenreClicked'");
        this.c = a;
        a.setOnClickListener(new d(this, betterAdvancedSearchActivity));
        a = ct.a(view, R.id.cardViewStatus, "method 'onCardViewStatusClicked'");
        this.d = a;
        a.setOnClickListener(new e(this, betterAdvancedSearchActivity));
        a = ct.a(view, R.id.cardViewScore, "method 'onCardViewScoreClicked'");
        this.e = a;
        a.setOnClickListener(new f(this, betterAdvancedSearchActivity));
        view = ct.a(view, R.id.cardViewRating, "method 'onCardViewRatingClicked'");
        this.f = view;
        view.setOnClickListener(new g(this, betterAdvancedSearchActivity));
    }

    public final void a() {
        if (this.b != null) {
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
