package com.mikepenz.materialize.view;

import android.graphics.Rect;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

final class d implements OnApplyWindowInsetsListener {
    final /* synthetic */ ScrimInsetsRelativeLayout a;

    d(ScrimInsetsRelativeLayout scrimInsetsRelativeLayout) {
        this.a = scrimInsetsRelativeLayout;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.a.b == null) {
            this.a.b = new Rect();
        }
        this.a.b.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        ScrimInsetsRelativeLayout scrimInsetsRelativeLayout = this.a;
        scrimInsetsRelativeLayout.setWillNotDraw(scrimInsetsRelativeLayout.a == null);
        ViewCompat.postInvalidateOnAnimation(this.a);
        if (this.a.d != null) {
            this.a.d;
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }
}
