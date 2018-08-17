package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public final class ado extends TypefaceSpan {
    private final Typeface a;

    public ado(String str, Typeface typeface) {
        super(str);
        this.a = typeface;
    }

    private static void a(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public final void updateDrawState(TextPaint textPaint) {
        ado.a(textPaint, this.a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        ado.a(textPaint, this.a);
    }
}
