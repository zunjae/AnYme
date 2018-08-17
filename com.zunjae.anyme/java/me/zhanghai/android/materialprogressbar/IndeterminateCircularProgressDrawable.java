package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.annotation.Keep;

public class IndeterminateCircularProgressDrawable extends BaseIndeterminateProgressDrawable implements MaterialProgressDrawable {
    private static final int PADDED_INTRINSIC_SIZE_DP = 48;
    private static final int PROGRESS_INTRINSIC_SIZE_DP = 42;
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);
    private int mPaddedIntrinsicSize;
    private int mProgressIntrinsicSize;
    private RingPathTransform mRingPathTransform = new RingPathTransform();
    private RingRotation mRingRotation = new RingRotation();

    class RingPathTransform {
        public float mTrimPathEnd;
        public float mTrimPathOffset;
        public float mTrimPathStart;

        private RingPathTransform() {
        }

        @Keep
        public void setTrimPathEnd(float f) {
            this.mTrimPathEnd = f;
        }

        @Keep
        public void setTrimPathOffset(float f) {
            this.mTrimPathOffset = f;
        }

        @Keep
        public void setTrimPathStart(float f) {
            this.mTrimPathStart = f;
        }
    }

    class RingRotation {
        private float mRotation;

        private RingRotation() {
        }

        @Keep
        public void setRotation(float f) {
            this.mRotation = f;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicSize = Math.round(42.0f * f);
        this.mPaddedIntrinsicSize = Math.round(f * 48.0f);
        this.mAnimators = new Animator[]{Animators.createIndeterminate(this.mRingPathTransform), Animators.createIndeterminateRotation(this.mRingRotation)};
    }

    private void drawRing(Canvas canvas, Paint paint) {
        int save = canvas.save();
        canvas.rotate(this.mRingRotation.mRotation);
        RingPathTransform ringPathTransform = this.mRingPathTransform;
        float f = ringPathTransform.mTrimPathOffset;
        float f2 = ringPathTransform.mTrimPathStart;
        Canvas canvas2 = canvas;
        canvas2.drawArc(RECT_PROGRESS, ((f + f2) * 360.0f) - 0.049804688f, (ringPathTransform.mTrimPathEnd - f2) * 360.0f, false, paint);
        canvas.restoreToCount(save);
    }

    private int getIntrinsicSize() {
        return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicSize : this.mProgressIntrinsicSize;
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ ConstantState getConstantState() {
        return super.getConstantState();
    }

    public int getIntrinsicHeight() {
        return getIntrinsicSize();
    }

    public int getIntrinsicWidth() {
        return getIntrinsicSize();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
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
        drawRing(canvas, paint);
    }

    protected void onPreparePaint(Paint paint) {
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Cap.SQUARE);
        paint.setStrokeJoin(Join.MITER);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
