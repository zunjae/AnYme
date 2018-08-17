package com.joanzapata.iconify.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.joanzapata.iconify.Icon;

public class CustomTypefaceSpan extends ReplacementSpan {
    private static final float BASELINE_RATIO = 0.14285715f;
    private static final Paint LOCAL_PAINT = new Paint();
    private static final int ROTATION_DURATION = 2000;
    private static final Rect TEXT_BOUNDS = new Rect();
    private final boolean baselineAligned;
    private final String icon;
    private final int iconColor;
    private final float iconSizePx;
    private final float iconSizeRatio;
    private final boolean rotate;
    private final long rotationStartTime = System.currentTimeMillis();
    private final Typeface type;

    public CustomTypefaceSpan(Icon icon, Typeface typeface, float f, float f2, int i, boolean z, boolean z2) {
        this.rotate = z;
        this.baselineAligned = z2;
        this.icon = String.valueOf(icon.character());
        this.type = typeface;
        this.iconSizePx = f;
        this.iconSizeRatio = f2;
        this.iconColor = i;
    }

    private void applyCustomTypeFace(Paint paint, Typeface typeface) {
        float textSize;
        int i;
        paint.setFakeBoldText(false);
        paint.setTextSkewX(0.0f);
        paint.setTypeface(typeface);
        if (this.rotate) {
            paint.clearShadowLayer();
        }
        if (this.iconSizeRatio > 0.0f) {
            textSize = paint.getTextSize() * this.iconSizeRatio;
        } else {
            textSize = this.iconSizePx;
            if (textSize > 0.0f) {
            }
            i = this.iconColor;
            if (i < Integer.MAX_VALUE) {
                paint.setColor(i);
            }
        }
        paint.setTextSize(textSize);
        i = this.iconColor;
        if (i < Integer.MAX_VALUE) {
            paint.setColor(i);
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        applyCustomTypeFace(paint, this.type);
        paint.getTextBounds(this.icon, 0, 1, TEXT_BOUNDS);
        canvas.save();
        float f2 = this.baselineAligned ? 0.0f : BASELINE_RATIO;
        if (this.rotate) {
            canvas.rotate((((float) (System.currentTimeMillis() - this.rotationStartTime)) / 2000.0f) * 360.0f, (((float) TEXT_BOUNDS.width()) / 2.0f) + f, (((float) i4) - (((float) TEXT_BOUNDS.height()) / 2.0f)) + (((float) TEXT_BOUNDS.height()) * f2));
        }
        String str = this.icon;
        Rect rect = TEXT_BOUNDS;
        canvas.drawText(str, f - ((float) rect.left), ((float) (i4 - rect.bottom)) + (((float) rect.height()) * f2), paint);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        LOCAL_PAINT.set(paint);
        applyCustomTypeFace(LOCAL_PAINT, this.type);
        LOCAL_PAINT.getTextBounds(this.icon, 0, 1, TEXT_BOUNDS);
        if (fontMetricsInt != null) {
            fontMetricsInt.descent = (int) (((float) TEXT_BOUNDS.height()) * (this.baselineAligned ? 0.0f : BASELINE_RATIO));
            int height = TEXT_BOUNDS.height();
            int i3 = fontMetricsInt.descent;
            fontMetricsInt.ascent = -(height - i3);
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = i3;
        }
        return TEXT_BOUNDS.width();
    }

    public boolean isAnimated() {
        return this.rotate;
    }
}
