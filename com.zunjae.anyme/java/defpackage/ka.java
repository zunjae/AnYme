package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.Gravity;
import me.zhanghai.android.materialprogressbar.R;

public class ka extends js implements kh {
    private final Paint a;
    private final Rect b;
    private final kb c;
    private final dw d;
    private final kf e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;

    public ka(Context context, dx dxVar, ga gaVar, ek<Bitmap> ekVar, int i, int i2, dz dzVar, byte[] bArr, Bitmap bitmap) {
        kb kbVar = new kb(dzVar, bArr, context, ekVar, i, i2, dxVar, gaVar, bitmap);
        ka kaVar = this;
        this(kbVar);
    }

    public ka(ka kaVar, Bitmap bitmap, ek<Bitmap> ekVar) {
        kb kbVar = kaVar.c;
        this(new kb(kbVar.a, kbVar.b, kbVar.c, ekVar, kbVar.e, kbVar.f, kbVar.g, kbVar.h, bitmap));
    }

    ka(kb kbVar) {
        this.b = new Rect();
        this.i = true;
        this.k = -1;
        this.c = kbVar;
        this.d = new dw(kbVar.g);
        this.a = new Paint();
        this.d.a(kbVar.a, kbVar.b);
        this.e = new kf(kbVar.c, this, this.d, kbVar.e, kbVar.f);
        this.e.a(kbVar.d);
    }

    private void g() {
        this.e.c();
        invalidateSelf();
    }

    private void h() {
        if (this.d.c() == 1) {
            invalidateSelf();
            return;
        }
        if (!this.f) {
            this.f = true;
            this.e.a();
            invalidateSelf();
        }
    }

    private void i() {
        this.f = false;
        this.e.b();
    }

    public final void a(int i) {
        if (i <= 0 && i != -1) {
            if (i != 0) {
                throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
            }
        }
        if (i == 0) {
            this.k = this.d.e();
        } else {
            this.k = i;
        }
    }

    public final boolean a() {
        return true;
    }

    public final Bitmap b() {
        return this.c.i;
    }

    @TargetApi(11)
    public final void b(int i) {
        if (VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (i == this.d.c() - 1) {
                this.j++;
            }
            i = this.k;
            if (i != -1 && this.j >= i) {
                stop();
            }
            return;
        }
        stop();
        g();
    }

    public final ek<Bitmap> c() {
        return this.c.d;
    }

    public final byte[] d() {
        return this.c.b;
    }

    public void draw(Canvas canvas) {
        if (!this.h) {
            if (this.l) {
                Gravity.apply(R.styleable.AppCompatTheme_windowNoTitle, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.b);
                this.l = false;
            }
            Bitmap d = this.e.d();
            if (d == null) {
                d = this.c.i;
            }
            canvas.drawBitmap(d, null, this.b, this.a);
        }
    }

    public final int e() {
        return this.d.c();
    }

    public final void f() {
        this.h = true;
        kb kbVar = this.c;
        kbVar.h.a(kbVar.i);
        this.e.c();
        this.e.b();
    }

    public ConstantState getConstantState() {
        return this.c;
    }

    public int getIntrinsicHeight() {
        return this.c.i.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.c.i.getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.i = z;
        if (!z) {
            i();
        } else if (this.g) {
            h();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.g = true;
        this.j = 0;
        if (this.i) {
            h();
        }
    }

    public void stop() {
        this.g = false;
        i();
        if (VERSION.SDK_INT < 11) {
            g();
        }
    }
}
