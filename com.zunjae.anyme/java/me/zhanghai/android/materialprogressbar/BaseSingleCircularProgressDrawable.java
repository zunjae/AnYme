package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;

abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    BaseSingleCircularProgressDrawable() {
    }

    protected void drawRing(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawArc(RECT_PROGRESS, f - 0.049804688f, f2, false, paint);
    }

    protected void onDraw(Canvas canvas, int i, int i2, Paint paint) {
        float width;
        RectF rectF;
        if (this.mUseIntrinsicPadding) {
            canvas.scale(((float) i) / RECT_PADDED_BOUND.width(), ((float) i2) / RECT_PADDED_BOUND.height());
            width = RECT_PADDED_BOUND.width() / 2.0f;
            rectF = RECT_PADDED_BOUND;
        } else {
            canvas.scale(((float) i) / RECT_BOUND.width(), ((float) i2) / RECT_BOUND.height());
            width = RECT_BOUND.width() / 2.0f;
            rectF = RECT_BOUND;
        }
        canvas.translate(width, rectF.height() / 2.0f);
        onDrawRing(canvas, paint);
    }

    protected abstract void onDrawRing(Canvas canvas, Paint paint);

    protected void onPreparePaint(Paint paint) {
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }
}
