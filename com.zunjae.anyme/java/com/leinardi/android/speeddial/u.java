package com.leinardi.android.speeddial;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

final class u extends LayerDrawable {
    final /* synthetic */ float a;
    final /* synthetic */ Drawable b;

    u(Drawable[] drawableArr, float f, Drawable drawable) {
        this.a = f;
        this.b = drawable;
        super(drawableArr);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.a, (float) (this.b.getBounds().width() / 2), (float) (this.b.getBounds().height() / 2));
        super.draw(canvas);
        canvas.restore();
    }
}
