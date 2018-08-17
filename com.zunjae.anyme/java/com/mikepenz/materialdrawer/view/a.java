package com.mikepenz.materialdrawer.view;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
final class a extends ViewOutlineProvider {
    int a;
    int b;
    final /* synthetic */ BezelImageView c;

    a(BezelImageView bezelImageView, int i, int i2) {
        this.c = bezelImageView;
        this.a = i;
        this.b = i2;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, this.a, this.b);
    }
}
