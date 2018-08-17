package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;

public final class bz extends Drawable {
    private static final float b = ((float) Math.toRadians(45.0d));
    private final Paint a = new Paint();
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Path h = new Path();
    private final int i;
    private boolean j = false;
    private float k;
    private float l;
    private int m = 2;

    public bz(Context context) {
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeJoin(Join.MITER);
        this.a.setStrokeCap(Cap.BUTT);
        this.a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0);
        if (color != this.a.getColor()) {
            this.a.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f);
        if (this.a.getStrokeWidth() != dimension) {
            this.a.setStrokeWidth(dimension);
            double d = (double) (dimension / 2.0f);
            double cos = Math.cos((double) b);
            Double.isNaN(d);
            this.l = (float) (d * cos);
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true);
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
        dimension = (float) Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (dimension != this.f) {
            this.f = dimension;
            invalidateSelf();
        }
        this.i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.d = (float) Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.c = (float) Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.e = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }

    public final void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r19.getBounds();
        r3 = r0.m;
        r4 = 3;
        r5 = 0;
        r6 = 1;
        if (r3 == r4) goto L_0x001a;
    L_0x000f:
        switch(r3) {
            case 0: goto L_0x0021;
            case 1: goto L_0x0018;
            default: goto L_0x0012;
        };
    L_0x0012:
        r3 = android.support.v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19);
        if (r3 != r6) goto L_0x0021;
    L_0x0018:
        r5 = 1;
        goto L_0x0021;
    L_0x001a:
        r3 = android.support.v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19);
        if (r3 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0018;
    L_0x0021:
        r3 = r0.c;
        r3 = r3 * r3;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 * r4;
        r7 = (double) r3;
        r7 = java.lang.Math.sqrt(r7);
        r3 = (float) r7;
        r7 = r0.d;
        r8 = r0.k;
        r3 = r3 - r7;
        r3 = r3 * r8;
        r3 = r3 + r7;
        r9 = r0.e;
        r9 = r9 - r7;
        r9 = r9 * r8;
        r7 = r7 + r9;
        r9 = r0.l;
        r10 = 0;
        r9 = r9 - r10;
        r9 = r9 * r8;
        r9 = r9 + r10;
        r8 = java.lang.Math.round(r9);
        r8 = (float) r8;
        r9 = b;
        r11 = r0.k;
        r9 = r9 - r10;
        r9 = r9 * r11;
        r9 = r9 + r10;
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        r11 = 0;
        goto L_0x0057;
    L_0x0055:
        r11 = -1020002304; // 0xffffffffc3340000 float:-180.0 double:NaN;
    L_0x0057:
        r12 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        if (r5 == 0) goto L_0x005e;
    L_0x005b:
        r13 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        goto L_0x005f;
    L_0x005e:
        r13 = 0;
    L_0x005f:
        r14 = r0.k;
        r13 = r13 - r11;
        r13 = r13 * r14;
        r11 = r11 + r13;
        r13 = (double) r3;
        r15 = r11;
        r10 = (double) r9;
        r16 = java.lang.Math.cos(r10);
        java.lang.Double.isNaN(r13);
        r16 = r16 * r13;
        r18 = r5;
        r4 = java.lang.Math.round(r16);
        r3 = (float) r4;
        r4 = java.lang.Math.sin(r10);
        java.lang.Double.isNaN(r13);
        r13 = r13 * r4;
        r4 = java.lang.Math.round(r13);
        r4 = (float) r4;
        r5 = r0.h;
        r5.rewind();
        r5 = r0.f;
        r9 = r0.a;
        r9 = r9.getStrokeWidth();
        r5 = r5 + r9;
        r9 = r0.l;
        r9 = -r9;
        r10 = r0.k;
        r9 = r9 - r5;
        r9 = r9 * r10;
        r5 = r5 + r9;
        r9 = -r7;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = r9 / r10;
        r11 = r0.h;
        r13 = r9 + r8;
        r14 = 0;
        r11.moveTo(r13, r14);
        r11 = r0.h;
        r8 = r8 * r10;
        r7 = r7 - r8;
        r11.rLineTo(r7, r14);
        r7 = r0.h;
        r7.moveTo(r9, r5);
        r7 = r0.h;
        r7.rLineTo(r3, r4);
        r7 = r0.h;
        r5 = -r5;
        r7.moveTo(r9, r5);
        r5 = r0.h;
        r4 = -r4;
        r5.rLineTo(r3, r4);
        r3 = r0.h;
        r3.close();
        r20.save();
        r3 = r0.a;
        r3 = r3.getStrokeWidth();
        r4 = r2.height();
        r4 = (float) r4;
        r5 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r5 = r5 * r3;
        r4 = r4 - r5;
        r5 = r0.f;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r7 * r5;
        r4 = r4 - r7;
        r4 = (int) r4;
        r4 = r4 / 4;
        r4 = r4 * 2;
        r4 = (float) r4;
        r7 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r3 = r3 * r7;
        r3 = r3 + r5;
        r4 = r4 + r3;
        r2 = r2.centerX();
        r2 = (float) r2;
        r1.translate(r2, r4);
        r2 = r0.g;
        if (r2 == 0) goto L_0x010c;
    L_0x00fe:
        r2 = r0.j;
        r2 = r2 ^ r18;
        if (r2 == 0) goto L_0x0105;
    L_0x0104:
        r6 = -1;
    L_0x0105:
        r2 = (float) r6;
        r11 = r15 * r2;
        r1.rotate(r11);
        goto L_0x0111;
    L_0x010c:
        if (r18 == 0) goto L_0x0111;
    L_0x010e:
        r1.rotate(r12);
    L_0x0111:
        r2 = r0.h;
        r3 = r0.a;
        r1.drawPath(r2, r3);
        r20.restore();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        return this.i;
    }

    public final int getIntrinsicWidth() {
        return this.i;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
