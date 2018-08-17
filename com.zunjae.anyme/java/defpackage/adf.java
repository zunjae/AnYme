package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.TextPaint;

public final class adf extends Drawable {
    private float A = 0.0f;
    private float B = 0.0f;
    private int C = 0;
    private adl D;
    private String E;
    private ColorStateList F;
    private Mode G = Mode.SRC_IN;
    private ColorFilter H;
    private ColorFilter I;
    private Context a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;
    private ColorStateList e;
    private Paint f;
    private int g;
    private int h;
    private Paint i;
    private int j;
    private Paint k;
    private Paint l;
    private int m = -1;
    private int n = -1;
    private Rect o;
    private RectF p;
    private Path q;
    private int r;
    private int s;
    private int t;
    private int u = 0;
    private int v = 0;
    private int w = 255;
    private boolean x;
    private boolean y;
    private float z = 0.0f;

    public adf(Context context) {
        this.a = context.getApplicationContext();
        c();
        c(Character.valueOf(' ').toString());
    }

    public adf(Context context, adl adl) {
        this.a = context.getApplicationContext();
        c();
        a(adl);
    }

    private adf a(adl adl) {
        this.D = adl;
        this.E = null;
        this.f.setTypeface(adl.getTypeface().getTypeface(this.a));
        invalidateSelf();
        return this;
    }

    private adf a(boolean z) {
        if (this.x != z) {
            this.x = z;
            this.r += (this.x ? 1 : -1) * this.s;
            invalidateSelf();
        }
        return this;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }

    private void a(Rect rect) {
        this.q.offset(((((float) rect.centerX()) - (this.p.width() / 2.0f)) - this.p.left) + ((float) this.u), ((((float) rect.centerY()) - (this.p.height() / 2.0f)) - this.p.top) + ((float) this.v));
    }

    private adf b(boolean z) {
        if (this.y != z) {
            this.y = z;
            this.r += ((this.y ? 1 : -1) * this.t) * 2;
            invalidateSelf();
        }
        return this;
    }

    private adf c(String str) {
        this.E = str;
        this.D = null;
        this.f.setTypeface(Typeface.DEFAULT);
        invalidateSelf();
        return this;
    }

    private void c() {
        this.f = new TextPaint(1);
        this.f.setStyle(Style.FILL);
        this.f.setTextAlign(Align.CENTER);
        this.f.setUnderlineText(false);
        this.f.setAntiAlias(true);
        this.k = new Paint(1);
        this.i = new Paint(1);
        this.i.setStyle(Style.STROKE);
        this.l = new Paint(1);
        this.l.setStyle(Style.STROKE);
        this.q = new Path();
        this.p = new RectF();
        this.o = new Rect();
    }

    private void d() {
        Object obj;
        int colorForState = this.e.getColorForState(getState(), this.e.getDefaultColor());
        int rgb = Color.rgb(Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState));
        if (rgb != this.f.getColor()) {
            this.f.setColor(rgb);
            obj = 1;
        } else {
            obj = null;
        }
        colorForState = Color.alpha(colorForState);
        if (colorForState == 255 || colorForState == this.w) {
            if (obj != null) {
                invalidateSelf();
            }
            return;
        }
        setAlpha(colorForState);
    }

    public final adf a() {
        adf e = new adf(this.a).e(this.r);
        e.m = this.m;
        e.invalidateSelf();
        e.n = this.n;
        e.invalidateSelf();
        e.b = this.b;
        e.setBounds(0, 0, e.b, e.c);
        e.invalidateSelf();
        e.c = this.c;
        e.setBounds(0, 0, e.b, e.c);
        e.invalidateSelf();
        e.u = this.u;
        e.invalidateSelf();
        e.v = this.v;
        e.invalidateSelf();
        e = e.j(this.h).n(this.s);
        float f = this.z;
        float f2 = this.A;
        float f3 = this.B;
        int i = this.C;
        e.z = f;
        e.A = f2;
        e.B = f3;
        e.C = i;
        e.f.setShadowLayer(f, f2, f3, i);
        e.invalidateSelf();
        e = e.l(this.j).i(this.g).o(this.t).a(this.e);
        e.setAlpha(this.w);
        e = e.a(this.x).b(this.y);
        e.f.setTypeface(this.f.getTypeface());
        e.invalidateSelf();
        adl adl = this.D;
        if (adl != null) {
            e.a(adl);
        } else {
            String str = this.E;
            if (str != null) {
                e.c(str);
            }
        }
        return e;
    }

    public final adf a(int i) {
        this.e = ColorStateList.valueOf(i);
        d();
        return this;
    }

    public final adf a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.e = colorStateList;
            d();
        }
        return this;
    }

    public final defpackage.adf a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r3 = this;
        r0 = r3.a;	 Catch:{ Exception -> 0x001c }
        r1 = 0;	 Catch:{ Exception -> 0x001c }
        r2 = 3;	 Catch:{ Exception -> 0x001c }
        r1 = r4.substring(r1, r2);	 Catch:{ Exception -> 0x001c }
        r0 = defpackage.adc.a(r0, r1);	 Catch:{ Exception -> 0x001c }
        r1 = "-";	 Catch:{ Exception -> 0x001c }
        r2 = "_";	 Catch:{ Exception -> 0x001c }
        r4 = r4.replace(r1, r2);	 Catch:{ Exception -> 0x001c }
        r4 = r0.getIcon(r4);	 Catch:{ Exception -> 0x001c }
        r3.a(r4);	 Catch:{ Exception -> 0x001c }
        goto L_0x001e;
    L_0x001c:
        r4 = defpackage.adc.a;
    L_0x001e:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: adf.a(java.lang.String):adf");
    }

    public final adf b() {
        g(24);
        d(1);
        return this;
    }

    public final adf b(int i) {
        return a(ContextCompat.getColor(this.a, i));
    }

    public final adf b(String str) {
        return c(str);
    }

    public final adf c(int i) {
        return e(this.a.getResources().getDimensionPixelSize(i));
    }

    public final void clearColorFilter() {
        this.I = null;
        invalidateSelf();
    }

    public final /* synthetic */ Object clone() {
        return a();
    }

    public final adf d(int i) {
        return e(ads.a(this.a, (float) i));
    }

    public final void draw(android.graphics.Canvas r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r12 = this;
        r0 = r12.D;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r12.E;
        if (r0 == 0) goto L_0x0146;
    L_0x0008:
        r0 = r12.getBounds();
        r1 = r12.r;
        r2 = 2;
        if (r1 < 0) goto L_0x0036;
    L_0x0011:
        r1 = r1 * 2;
        r3 = r0.width();
        if (r1 > r3) goto L_0x0036;
    L_0x0019:
        r1 = r12.r;
        r1 = r1 * 2;
        r3 = r0.height();
        if (r1 > r3) goto L_0x0036;
    L_0x0023:
        r1 = r12.o;
        r3 = r0.left;
        r4 = r12.r;
        r3 = r3 + r4;
        r5 = r0.top;
        r5 = r5 + r4;
        r6 = r0.right;
        r6 = r6 - r4;
        r7 = r0.bottom;
        r7 = r7 - r4;
        r1.set(r3, r5, r6, r7);
    L_0x0036:
        r1 = r0.height();
        r1 = (float) r1;
        r3 = r12.d;
        r4 = 1;
        if (r3 == 0) goto L_0x0042;
    L_0x0040:
        r3 = 1;
        goto L_0x0043;
    L_0x0042:
        r3 = 2;
    L_0x0043:
        r3 = (float) r3;
        r1 = r1 * r3;
        r3 = r12.f;
        r3.setTextSize(r1);
        r3 = r12.D;
        if (r3 == 0) goto L_0x0058;
    L_0x004f:
        r3 = r3.getCharacter();
        r3 = java.lang.String.valueOf(r3);
        goto L_0x005e;
    L_0x0058:
        r3 = r12.E;
        r3 = java.lang.String.valueOf(r3);
    L_0x005e:
        r5 = r12.f;
        r7 = 0;
        r8 = r3.length();
        r9 = 0;
        r6 = r0.height();
        r10 = (float) r6;
        r11 = r12.q;
        r6 = r3;
        r5.getTextPath(r6, r7, r8, r9, r10, r11);
        r5 = r12.q;
        r6 = r12.p;
        r5.computeBounds(r6, r4);
        r5 = r12.d;
        if (r5 != 0) goto L_0x00bf;
    L_0x007c:
        r5 = r12.o;
        r5 = r5.width();
        r5 = (float) r5;
        r6 = r12.p;
        r6 = r6.width();
        r5 = r5 / r6;
        r6 = r12.o;
        r6 = r6.height();
        r6 = (float) r6;
        r7 = r12.p;
        r7 = r7.height();
        r6 = r6 / r7;
        r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r7 >= 0) goto L_0x009d;
    L_0x009c:
        goto L_0x009e;
    L_0x009d:
        r5 = r6;
    L_0x009e:
        r1 = r1 * r5;
        r5 = r12.f;
        r5.setTextSize(r1);
        r5 = r12.f;
        r7 = 0;
        r8 = r3.length();
        r9 = 0;
        r1 = r0.height();
        r10 = (float) r1;
        r11 = r12.q;
        r6 = r3;
        r5.getTextPath(r6, r7, r8, r9, r10, r11);
        r1 = r12.q;
        r3 = r12.p;
        r1.computeBounds(r3, r4);
    L_0x00bf:
        r12.a(r0);
        r1 = r12.k;
        if (r1 == 0) goto L_0x011d;
    L_0x00c6:
        r1 = r12.n;
        if (r1 < 0) goto L_0x011d;
    L_0x00ca:
        r1 = r12.m;
        if (r1 < 0) goto L_0x011d;
    L_0x00ce:
        r1 = r12.y;
        if (r1 == 0) goto L_0x0102;
    L_0x00d2:
        r1 = r12.l;
        if (r1 == 0) goto L_0x0102;
    L_0x00d6:
        r1 = r12.t;
        r1 = r1 / r2;
        r1 = (float) r1;
        r2 = new android.graphics.RectF;
        r3 = r0.width();
        r3 = (float) r3;
        r3 = r3 - r1;
        r0 = r0.height();
        r0 = (float) r0;
        r0 = r0 - r1;
        r2.<init>(r1, r1, r3, r0);
        r0 = r12.m;
        r0 = (float) r0;
        r1 = r12.n;
        r1 = (float) r1;
        r3 = r12.k;
        r13.drawRoundRect(r2, r0, r1, r3);
        r0 = r12.m;
        r0 = (float) r0;
        r1 = r12.n;
        r1 = (float) r1;
        r3 = r12.l;
        r13.drawRoundRect(r2, r0, r1, r3);
        goto L_0x011d;
    L_0x0102:
        r1 = new android.graphics.RectF;
        r2 = r0.width();
        r2 = (float) r2;
        r0 = r0.height();
        r0 = (float) r0;
        r3 = 0;
        r1.<init>(r3, r3, r2, r0);
        r0 = r12.m;
        r0 = (float) r0;
        r2 = r12.n;
        r2 = (float) r2;
        r3 = r12.k;
        r13.drawRoundRect(r1, r0, r2, r3);
    L_0x011d:
        r0 = r12.q;	 Catch:{ Exception -> 0x0122 }
        r0.close();	 Catch:{ Exception -> 0x0122 }
    L_0x0122:
        r0 = r12.x;
        if (r0 == 0) goto L_0x012d;
    L_0x0126:
        r0 = r12.q;
        r1 = r12.i;
        r13.drawPath(r0, r1);
    L_0x012d:
        r0 = r12.f;
        r1 = r12.w;
        r0.setAlpha(r1);
        r0 = r12.f;
        r1 = r12.I;
        if (r1 != 0) goto L_0x013c;
    L_0x013a:
        r1 = r12.H;
    L_0x013c:
        r0.setColorFilter(r1);
        r0 = r12.q;
        r1 = r12.f;
        r13.drawPath(r0, r1);
    L_0x0146:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: adf.draw(android.graphics.Canvas):void");
    }

    public final adf e(int i) {
        if (this.r != i) {
            this.r = i;
            if (this.x) {
                this.r += this.s;
            }
            if (this.y) {
                this.r += this.t;
            }
            invalidateSelf();
        }
        return this;
    }

    public final adf f(int i) {
        return h(this.a.getResources().getDimensionPixelSize(i));
    }

    public final adf g(int i) {
        return h(ads.a(this.a, (float) i));
    }

    public final int getAlpha() {
        return this.w;
    }

    public final int getIntrinsicHeight() {
        return this.c;
    }

    public final int getIntrinsicWidth() {
        return this.b;
    }

    public final int getOpacity() {
        if (this.H == null) {
            if (this.f.getColorFilter() == null) {
                int alpha = getAlpha();
                return alpha != 0 ? alpha != 255 ? -3 : -1 : -2;
            }
        }
        return -3;
    }

    public final adf h(int i) {
        this.c = i;
        this.b = i;
        setBounds(0, 0, this.b, this.c);
        invalidateSelf();
        return this;
    }

    public final adf i(int i) {
        this.l.setColor(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)));
        this.l.setAlpha(Color.alpha(i));
        this.g = i;
        invalidateSelf();
        return this;
    }

    public final boolean isStateful() {
        return true;
    }

    public final adf j(int i) {
        this.i.setColor(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)));
        this.i.setAlpha(Color.alpha(i));
        this.h = i;
        invalidateSelf();
        return this;
    }

    public final adf k(int i) {
        return l(ContextCompat.getColor(this.a, i));
    }

    public final adf l(int i) {
        this.k.setColor(i);
        this.j = i;
        if (this.m == -1) {
            this.m = 0;
        }
        if (this.n == -1) {
            this.n = 0;
        }
        invalidateSelf();
        return this;
    }

    public final adf m(int i) {
        this.n = i;
        this.m = i;
        invalidateSelf();
        return this;
    }

    public final adf n(int i) {
        this.s = i;
        this.i.setStrokeWidth((float) this.s);
        a(true);
        invalidateSelf();
        return this;
    }

    public final adf o(int i) {
        this.t = i;
        this.l.setStrokeWidth((float) this.t);
        b(true);
        invalidateSelf();
        return this;
    }

    protected final void onBoundsChange(android.graphics.Rect r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r1 = this;
        r1.a(r2);
        r0 = r1.q;	 Catch:{ Exception -> 0x0008 }
        r0.close();	 Catch:{ Exception -> 0x0008 }
    L_0x0008:
        super.onBoundsChange(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: adf.onBoundsChange(android.graphics.Rect):void");
    }

    protected final boolean onStateChange(int[] iArr) {
        boolean z;
        ColorStateList colorStateList = this.e;
        if (colorStateList == null || !colorStateList.isStateful()) {
            z = false;
        } else {
            d();
            z = true;
        }
        ColorStateList colorStateList2 = this.F;
        if (colorStateList2 == null) {
            return z;
        }
        Mode mode = this.G;
        if (mode == null) {
            return z;
        }
        this.H = a(colorStateList2, mode);
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        this.f.setAlpha(i);
        this.w = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.I = colorFilter;
        invalidateSelf();
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            ColorStateList colorStateList = this.e;
            if ((colorStateList == null || !colorStateList.isStateful()) && this.I == null) {
                if (this.H == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.H = a(colorStateList, this.G);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.G = mode;
        this.H = a(this.F, mode);
        invalidateSelf();
    }
}
