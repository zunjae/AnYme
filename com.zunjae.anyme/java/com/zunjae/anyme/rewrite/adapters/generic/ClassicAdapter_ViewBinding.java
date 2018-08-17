package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.R;
import defpackage.ct;

public class ClassicAdapter_ViewBinding implements Unbinder {
    private ClassicAdapter b;

    public ClassicAdapter_ViewBinding(ClassicAdapter classicAdapter, View view) {
        this.b = classicAdapter;
        classicAdapter.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCardViewCoverImage, "field 'animeCoverImage'", ImageView.class);
        classicAdapter.animeName = (TextView) ct.a(view, (int) R.id.animeCardViewName, "field 'animeName'", TextView.class);
        classicAdapter.userProgress = (TextView) ct.a(view, (int) R.id.animeCardViewProgress, "field 'userProgress'", TextView.class);
        classicAdapter.userScore = (IconicsTextView) ct.a(view, (int) R.id.animeCardViewScore, "field 'userScore'", IconicsTextView.class);
        classicAdapter.animeStatus = (IconicsTextView) ct.a(view, (int) R.id.animeCardViewStatus, "field 'animeStatus'", IconicsTextView.class);
        classicAdapter.container = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", ViewGroup.class);
        classicAdapter.animeFavoriteBadge = (IconicsTextView) ct.a(view, (int) R.id.animeInFavorite, "field 'animeFavoriteBadge'", IconicsTextView.class);
    }

    public final void a() {
        ClassicAdapter classicAdapter = this.b;
        if (classicAdapter != null) {
            this.b = null;
            classicAdapter.animeCoverImage = null;
            classicAdapter.animeName = null;
            classicAdapter.userProgress = null;
            classicAdapter.userScore = null;
            classicAdapter.animeStatus = null;
            classicAdapter.container = null;
            classicAdapter.animeFavoriteBadge = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
