package com.joanzapata.iconify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;
import com.joanzapata.iconify.internal.IconFontDescriptorWrapper;

public class IconDrawable extends Drawable {
    public static final int ANDROID_ACTIONBAR_ICON_SIZE_DP = 24;
    private int alpha = 255;
    private Context context;
    private Icon icon;
    private TextPaint paint;
    private int size = -1;

    public IconDrawable(Context context, Icon icon) {
        init(context, icon);
    }

    public IconDrawable(Context context, String str) {
        Icon findIconForKey = Iconify.findIconForKey(str);
        if (findIconForKey != null) {
            init(context, findIconForKey);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("No icon with that key \"");
        stringBuilder.append(str);
        stringBuilder.append("\".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private int convertDpToPx(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private void init(Context context, Icon icon) {
        this.context = context;
        this.icon = icon;
        this.paint = new TextPaint();
        IconFontDescriptorWrapper findTypefaceOf = Iconify.findTypefaceOf(icon);
        if (findTypefaceOf != null) {
            this.paint.setTypeface(findTypefaceOf.getTypeface(context));
            this.paint.setStyle(Style.FILL);
            this.paint.setTextAlign(Align.CENTER);
            this.paint.setUnderlineText(false);
            this.paint.setColor(-16777216);
            this.paint.setAntiAlias(true);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unable to find the module associated with icon ");
        stringBuilder.append(icon.key());
        stringBuilder.append(", have you registered the module you are trying to use with Iconify.with(...) in your Application?");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private boolean isEnabled(int[] iArr) {
        for (int i : iArr) {
            if (i == 16842910) {
                return true;
            }
        }
        return false;
    }

    public IconDrawable actionBarSize() {
        return sizeDp(ANDROID_ACTIONBAR_ICON_SIZE_DP);
    }

    public IconDrawable alpha(int i) {
        setAlpha(i);
        invalidateSelf();
        return this;
    }

    public void clearColorFilter() {
        this.paint.setColorFilter(null);
    }

    public IconDrawable color(int i) {
        this.paint.setColor(i);
        invalidateSelf();
        return this;
    }

    public IconDrawable colorRes(int i) {
        this.paint.setColor(this.context.getResources().getColor(i));
        invalidateSelf();
        return this;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int height = bounds.height();
        this.paint.setTextSize((float) height);
        Rect rect = new Rect();
        String valueOf = String.valueOf(this.icon.character());
        this.paint.getTextBounds(valueOf, 0, 1, rect);
        int height2 = rect.height();
        canvas.drawText(valueOf, bounds.exactCenterX(), ((((float) bounds.top) + (((float) (height - height2)) / 2.0f)) + ((float) height2)) - ((float) rect.bottom), this.paint);
    }

    public int getIntrinsicHeight() {
        return this.size;
    }

    public int getIntrinsicWidth() {
        return this.size;
    }

    public int getOpacity() {
        return this.alpha;
    }

    public boolean isStateful() {
        return true;
    }

    public void setAlpha(int i) {
        this.alpha = i;
        this.paint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public boolean setState(int[] iArr) {
        int alpha = this.paint.getAlpha();
        int i = isEnabled(iArr) ? this.alpha : this.alpha / 2;
        this.paint.setAlpha(i);
        return alpha != i;
    }

    public void setStyle(Style style) {
        this.paint.setStyle(style);
    }

    public IconDrawable sizeDp(int i) {
        return sizePx(convertDpToPx(this.context, (float) i));
    }

    public IconDrawable sizePx(int i) {
        this.size = i;
        setBounds(0, 0, i, i);
        invalidateSelf();
        return this;
    }

    public IconDrawable sizeRes(int i) {
        return sizePx(this.context.getResources().getDimensionPixelSize(i));
    }
}
