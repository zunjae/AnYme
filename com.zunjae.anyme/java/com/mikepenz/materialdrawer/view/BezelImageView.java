package com.mikepenz.materialdrawer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.mikepenz.materialdrawer.R;
import defpackage.afo;
import defpackage.mh;
import defpackage.tw;

public class BezelImageView extends ImageView {
    private Paint a;
    private Paint b;
    private Rect c;
    private RectF d;
    private Drawable e;
    private boolean f;
    private ColorMatrixColorFilter g;
    private int h;
    private int i;
    private ColorFilter j;
    private boolean k;
    private Bitmap l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private ColorMatrixColorFilter q;
    private ColorFilter r;

    public BezelImageView(Context context) {
        this(context, null);
    }

    public BezelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = true;
        this.h = 150;
        this.k = false;
        this.o = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BezelImageView, i, R.style.BezelImageView);
        this.e = obtainStyledAttributes.getDrawable(R.styleable.BezelImageView_biv_maskDrawable);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f = obtainStyledAttributes.getBoolean(R.styleable.BezelImageView_biv_drawCircularShadow, true);
        this.i = obtainStyledAttributes.getColor(R.styleable.BezelImageView_biv_selectorOnPress, 0);
        obtainStyledAttributes.recycle();
        this.a = new Paint();
        this.a.setColor(-16777216);
        this.b = new Paint();
        this.b.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        this.l = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.g = new ColorMatrixColorFilter(colorMatrix);
        int i2 = this.i;
        if (i2 != 0) {
            this.j = new PorterDuffColorFilter(Color.argb(this.h, Color.red(i2), Color.green(this.i), Color.blue(this.i)), Mode.SRC_ATOP);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.q = this.g;
            this.r = this.j;
            this.j = null;
            this.g = null;
            return;
        }
        ColorMatrixColorFilter colorMatrixColorFilter = this.q;
        if (colorMatrixColorFilter != null) {
            this.g = colorMatrixColorFilter;
        }
        ColorFilter colorFilter = this.r;
        if (colorFilter != null) {
            this.j = colorFilter;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isClickable()) {
            switch (motionEvent.getAction()) {
                case mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                    this.p = true;
                    break;
                case tw.a /*1*/:
                case f.c /*3*/:
                case mh.d /*4*/:
                case mh.h /*8*/:
                    this.p = false;
                    break;
                default:
                    break;
            }
            invalidate();
            return super.dispatchTouchEvent(motionEvent);
        }
        this.p = false;
        return super.onTouchEvent(motionEvent);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(getDrawableState());
        }
        if (isDuplicateParentStateEnabled()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.e) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r11) {
        /*
        r10 = this;
        r0 = r10.c;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r0.width();
        r1 = r10.c;
        r1 = r1.height();
        if (r0 == 0) goto L_0x00b8;
    L_0x0011:
        if (r1 != 0) goto L_0x0015;
    L_0x0013:
        goto L_0x00b8;
    L_0x0015:
        r2 = r10.k;
        r3 = 0;
        if (r2 == 0) goto L_0x0028;
    L_0x001a:
        r2 = r10.m;
        if (r0 != r2) goto L_0x0028;
    L_0x001e:
        r2 = r10.n;
        if (r1 != r2) goto L_0x0028;
    L_0x0022:
        r2 = r10.p;
        r4 = r10.o;
        if (r2 == r4) goto L_0x00a5;
    L_0x0028:
        r2 = r10.m;
        if (r0 != r2) goto L_0x0037;
    L_0x002c:
        r2 = r10.n;
        if (r1 != r2) goto L_0x0037;
    L_0x0030:
        r0 = r10.l;
        r1 = 0;
        r0.eraseColor(r1);
        goto L_0x0048;
    L_0x0037:
        r2 = r10.l;
        r2.recycle();
        r2 = android.graphics.Bitmap.Config.ARGB_8888;
        r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2);
        r10.l = r2;
        r10.m = r0;
        r10.n = r1;
    L_0x0048:
        r0 = new android.graphics.Canvas;
        r1 = r10.l;
        r0.<init>(r1);
        r1 = r10.e;
        r2 = 31;
        if (r1 == 0) goto L_0x0087;
    L_0x0055:
        r1 = r0.save();
        r4 = r10.e;
        r4.draw(r0);
        r4 = r10.p;
        if (r4 == 0) goto L_0x0074;
    L_0x0062:
        r4 = r10.j;
        if (r4 == 0) goto L_0x006c;
    L_0x0066:
        r5 = r10.b;
        r5.setColorFilter(r4);
        goto L_0x0079;
    L_0x006c:
        r4 = r10.b;
        r5 = r10.g;
        r4.setColorFilter(r5);
        goto L_0x0079;
    L_0x0074:
        r4 = r10.b;
        r4.setColorFilter(r3);
    L_0x0079:
        r4 = r10.d;
        r5 = r10.b;
        r0.saveLayer(r4, r5, r2);
        super.onDraw(r0);
        r0.restoreToCount(r1);
        goto L_0x00a5;
    L_0x0087:
        r1 = r10.p;
        if (r1 == 0) goto L_0x00a2;
    L_0x008b:
        r1 = r0.save();
        r5 = 0;
        r6 = 0;
        r4 = r10.m;
        r7 = (float) r4;
        r4 = r10.n;
        r8 = (float) r4;
        r9 = r10.a;
        r4 = r0;
        r4.drawRect(r5, r6, r7, r8, r9);
        r4 = r10.j;
        if (r4 == 0) goto L_0x006c;
    L_0x00a1:
        goto L_0x0066;
    L_0x00a2:
        super.onDraw(r0);
    L_0x00a5:
        r0 = r10.l;
        r1 = r10.c;
        r2 = r1.left;
        r2 = (float) r2;
        r1 = r1.top;
        r1 = (float) r1;
        r11.drawBitmap(r0, r2, r1, r3);
        r11 = r10.isPressed();
        r10.o = r11;
    L_0x00b8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.view.BezelImageView.onDraw(android.graphics.Canvas):void");
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21 && this.f) {
            setOutlineProvider(new a(this, i, i2));
        }
    }

    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        this.c = new Rect(0, 0, i3 - i, i4 - i2);
        this.d = new RectF(this.c);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(this.c);
        }
        if (frame) {
            this.k = false;
        }
        return frame;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        if (!"http".equals(uri.getScheme())) {
            if (!"https".equals(uri.getScheme())) {
                super.setImageURI(uri);
                return;
            }
        }
        afo.a().a(this, uri, null);
    }

    public void setSelectorColor(int i) {
        this.i = i;
        this.j = new PorterDuffColorFilter(Color.argb(this.h, Color.red(this.i), Color.green(this.i), Color.blue(this.i)), Mode.SRC_ATOP);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e) {
            if (!super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
