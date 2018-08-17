package com.leinardi.android.speeddial;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.FloatingActionButton.OnVisibilityChangedListener;

final class h extends OnVisibilityChangedListener {
    final /* synthetic */ OnVisibilityChangedListener a;
    final /* synthetic */ SpeedDialView b;

    h(SpeedDialView speedDialView, OnVisibilityChangedListener onVisibilityChangedListener) {
        this.b = speedDialView;
        this.a = onVisibilityChangedListener;
    }

    public final void onHidden(FloatingActionButton floatingActionButton) {
        super.onHidden(floatingActionButton);
        this.b.setVisibility(4);
        OnVisibilityChangedListener onVisibilityChangedListener = this.a;
        if (onVisibilityChangedListener != null) {
            onVisibilityChangedListener.onHidden(floatingActionButton);
        }
    }

    public final void onShown(FloatingActionButton floatingActionButton) {
        super.onShown(floatingActionButton);
        OnVisibilityChangedListener onVisibilityChangedListener = this.a;
        if (onVisibilityChangedListener != null) {
            onVisibilityChangedListener.onShown(floatingActionButton);
        }
    }
}
