package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.mikepenz.iconics.view.IconicsTextView;

public class OptimizedAdapter extends b {
    @BindView
    public IconicsTextView airingText;
    @BindView
    public ImageView animeCoverImage;
    @BindView
    public IconicsTextView animeFavoriteBadge;
    @BindView
    public TextView animeName;
    @BindView
    public ViewGroup container;
    @BindView
    public ImageButton overflowIcon;
    @BindView
    public ProgressBar progressBar;
    @BindView
    public TextView releaseDate;
    @BindView
    public IconicsTextView userProgress;
    @BindView
    public IconicsTextView userScore;

    public OptimizedAdapter(View view) {
        super(view);
        ButterKnife.a(this, view);
    }

    public final ViewGroup a() {
        return this.container;
    }

    public final IconicsTextView b() {
        return this.userScore;
    }

    public final ImageView c() {
        return this.animeCoverImage;
    }

    public final TextView d() {
        return this.animeName;
    }

    public final IconicsTextView e() {
        return this.airingText;
    }

    public final IconicsTextView f() {
        return this.animeFavoriteBadge;
    }
}
