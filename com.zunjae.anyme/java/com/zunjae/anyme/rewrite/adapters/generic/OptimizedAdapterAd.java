package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class OptimizedAdapterAd extends a {
    @BindView
    ViewGroup clickableContainer;
    @BindView
    ImageView kanonImage;

    public OptimizedAdapterAd(View view) {
        super(view);
        ButterKnife.a(this, view);
    }

    public final ImageView a() {
        return this.kanonImage;
    }

    public final ViewGroup b() {
        return this.clickableContainer;
    }
}
