package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;

class BaseSingleHorizontalProgressDrawable extends BaseProgressDrawable {
    private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
    private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
    protected static final RectF RECT_BOUND = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);
    private int mPaddedIntrinsicHeight;
    private int mProgressIntrinsicHeight;

    public BaseSingleHorizontalProgressDrawable(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicHeight = Math.round(4.0f * f);
        this.mPaddedIntrinsicHeight = Math.round(f * 16.0f);
    }

    public int getIntrinsicHeight() {
        return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicHeight : this.mProgressIntrinsicHeight;
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
        onDrawRect(canvas, paint);
    }

    protected void onDrawRect(Canvas canvas, Paint paint) {
        canvas.drawRect(RECT_BOUND, paint);
    }

    protected void onPreparePaint(Paint paint) {
        paint.setStyle(Style.FILL);
    }
}
