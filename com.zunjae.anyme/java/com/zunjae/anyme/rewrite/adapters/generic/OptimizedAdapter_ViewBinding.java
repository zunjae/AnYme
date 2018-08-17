package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.R;
import defpackage.ct;

public class OptimizedAdapter_ViewBinding implements Unbinder {
    private OptimizedAdapter b;

    public OptimizedAdapter_ViewBinding(OptimizedAdapter optimizedAdapter, View view) {
        this.b = optimizedAdapter;
        optimizedAdapter.animeCoverImage = (ImageView) ct.a(view, (int) R.id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
        optimizedAdapter.animeName = (TextView) ct.a(view, (int) R.id.animeTitle, "field 'animeName'", TextView.class);
        optimizedAdapter.userScore = (IconicsTextView) ct.a(view, (int) R.id.userScore, "field 'userScore'", IconicsTextView.class);
        optimizedAdapter.container = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'container'", ViewGroup.class);
        optimizedAdapter.userProgress = (IconicsTextView) ct.a(view, (int) R.id.userProgress, "field 'userProgress'", IconicsTextView.class);
        optimizedAdapter.releaseDate = (TextView) ct.a(view, (int) R.id.animeReleaseDate, "field 'releaseDate'", TextView.class);
        optimizedAdapter.progressBar = (ProgressBar) ct.a(view, (int) R.id.userProgressBar, "field 'progressBar'", ProgressBar.class);
        optimizedAdapter.overflowIcon = (ImageButton) ct.a(view, (int) R.id.overflowIcon, "field 'overflowIcon'", ImageButton.class);
        optimizedAdapter.airingText = (IconicsTextView) ct.a(view, (int) R.id.animeAiring, "field 'airingText'", IconicsTextView.class);
        optimizedAdapter.animeFavoriteBadge = (IconicsTextView) ct.a(view, (int) R.id.animeInFavorite, "field 'animeFavoriteBadge'", IconicsTextView.class);
    }

    public final void a() {
        OptimizedAdapter optimizedAdapter = this.b;
        if (optimizedAdapter != null) {
            this.b = null;
            optimizedAdapter.animeCoverImage = null;
            optimizedAdapter.animeName = null;
            optimizedAdapter.userScore = null;
            optimizedAdapter.container = null;
            optimizedAdapter.userProgress = null;
            optimizedAdapter.releaseDate = null;
            optimizedAdapter.progressBar = null;
            optimizedAdapter.overflowIcon = null;
            optimizedAdapter.airingText = null;
            optimizedAdapter.animeFavoriteBadge = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
