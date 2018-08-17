package io.github.inflationx.calligraphy3;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class CalligraphyTypefaceSpan extends MetricAffectingSpan {
    private final Typeface typeface;

    public CalligraphyTypefaceSpan(Typeface typeface) {
        if (typeface != null) {
            this.typeface = typeface;
            return;
        }
        throw new IllegalArgumentException("typeface is null");
    }

    private void apply(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = (typeface != null ? typeface.getStyle() : 0) & (this.typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
