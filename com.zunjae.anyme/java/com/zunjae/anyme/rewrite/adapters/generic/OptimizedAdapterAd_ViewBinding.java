package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class OptimizedAdapterAd_ViewBinding implements Unbinder {
    private OptimizedAdapterAd b;

    public OptimizedAdapterAd_ViewBinding(OptimizedAdapterAd optimizedAdapterAd, View view) {
        this.b = optimizedAdapterAd;
        optimizedAdapterAd.kanonImage = (ImageView) ct.a(view, (int) R.id.kanonImage, "field 'kanonImage'", ImageView.class);
        optimizedAdapterAd.clickableContainer = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'clickableContainer'", ViewGroup.class);
    }

    public final void a() {
        OptimizedAdapterAd optimizedAdapterAd = this.b;
        if (optimizedAdapterAd != null) {
            this.b = null;
            optimizedAdapterAd.kanonImage = null;
            optimizedAdapterAd.clickableContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
