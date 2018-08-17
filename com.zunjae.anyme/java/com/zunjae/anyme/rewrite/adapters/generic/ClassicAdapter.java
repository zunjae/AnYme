package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.mikepenz.iconics.view.IconicsTextView;

public class ClassicAdapter extends b {
    @BindView
    public ImageView animeCoverImage;
    @BindView
    public IconicsTextView animeFavoriteBadge;
    @BindView
    public TextView animeName;
    @BindView
    public IconicsTextView animeStatus;
    @BindView
    public ViewGroup container;
    @BindView
    public TextView userProgress;
    @BindView
    public IconicsTextView userScore;

    public ClassicAdapter(View view) {
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
        return this.animeStatus;
    }

    public final IconicsTextView f() {
        return this.animeFavoriteBadge;
    }
}
