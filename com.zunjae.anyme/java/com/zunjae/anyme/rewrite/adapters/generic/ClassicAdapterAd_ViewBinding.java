package com.zunjae.anyme.rewrite.adapters.generic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public class ClassicAdapterAd_ViewBinding implements Unbinder {
    private ClassicAdapterAd b;

    public ClassicAdapterAd_ViewBinding(ClassicAdapterAd classicAdapterAd, View view) {
        this.b = classicAdapterAd;
        classicAdapterAd.kanonImage = (ImageView) ct.a(view, (int) R.id.kanonImage, "field 'kanonImage'", ImageView.class);
        classicAdapterAd.clickableContainer = (ViewGroup) ct.a(view, (int) R.id.cardViewContainer, "field 'clickableContainer'", ViewGroup.class);
    }

    public final void a() {
        ClassicAdapterAd classicAdapterAd = this.b;
        if (classicAdapterAd != null) {
            this.b = null;
            classicAdapterAd.kanonImage = null;
            classicAdapterAd.clickableContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
