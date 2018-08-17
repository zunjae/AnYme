package com.rd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnAdapterChangeListener;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.ago;
import defpackage.aho;
import defpackage.ahq;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.ahu;
import defpackage.aii;
import defpackage.aij;
import defpackage.tw;

public class PageIndicatorView extends View implements OnAdapterChangeListener, OnPageChangeListener, b {
    private a a;
    private DataSetObserver b;
    private ViewPager c;
    private boolean d;

    public PageIndicatorView(Context context) {
        super(context);
        a(null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    @TargetApi(21)
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        b();
        b(attributeSet);
    }

    private void b() {
        if (getId() == -1) {
            setId(aij.a());
        }
    }

    private void b(AttributeSet attributeSet) {
        this.a = new a(this);
        this.a.c().a(getContext(), attributeSet);
        ahq b = this.a.b();
        b.e(getPaddingLeft());
        b.f(getPaddingTop());
        b.g(getPaddingRight());
        b.h(getPaddingBottom());
        this.d = b.k();
    }

    private void c() {
        if (this.b != null) {
            ViewPager viewPager = this.c;
            if (viewPager != null) {
                if (viewPager.getAdapter() != null) {
                    try {
                        this.c.getAdapter().unregisterDataSetObserver(this.b);
                        this.b = null;
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void d() {
        ViewPager viewPager = this.c;
        if (viewPager == null) {
            return;
        }
        if (viewPager.getAdapter() != null) {
            int count = this.c.getAdapter().getCount();
            int currentItem = f() ? (count - 1) - this.c.getCurrentItem() : this.c.getCurrentItem();
            this.a.b().l(currentItem);
            this.a.b().m(currentItem);
            this.a.b().n(currentItem);
            this.a.b().o(count);
            this.a.a().b();
            e();
            requestLayout();
        }
    }

    private void e() {
        if (this.a.b().l()) {
            int r = this.a.b().r();
            int visibility = getVisibility();
            if (visibility == 0 || r <= 1) {
                if (visibility != 4 && r <= 1) {
                    setVisibility(4);
                }
                return;
            }
            setVisibility(0);
        }
    }

    private boolean f() {
        switch (d.a[this.a.b().u().ordinal()]) {
            case tw.a /*1*/:
                return true;
            case tw.b /*2*/:
                break;
            case f.c /*3*/:
                if (TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1) {
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }

    private boolean g() {
        if (getMeasuredHeight() == 0) {
            if (getMeasuredWidth() == 0) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        invalidate();
    }

    public long getAnimationDuration() {
        return this.a.b().n();
    }

    public int getCount() {
        return this.a.b().r();
    }

    public int getPadding() {
        return this.a.b().b();
    }

    public int getRadius() {
        return this.a.b().a();
    }

    public float getScaleFactor() {
        return this.a.b().h();
    }

    public int getSelectedColor() {
        return this.a.b().j();
    }

    public int getSelection() {
        return this.a.b().o();
    }

    public int getStrokeWidth() {
        return this.a.b().g();
    }

    public int getUnselectedColor() {
        return this.a.b().i();
    }

    public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        d();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            Object obj = (parent == null || !(parent instanceof ViewGroup) || ((ViewGroup) parent).getChildCount() <= 0) ? null : 1;
            if (obj != null) {
                ViewPager viewPager;
                int v = this.a.b().v();
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getChildCount() > 0) {
                    View findViewById = viewGroup.findViewById(v);
                    if (findViewById != null && (findViewById instanceof ViewPager)) {
                        viewPager = (ViewPager) findViewById;
                        if (viewPager == null) {
                            setViewPager(viewPager);
                            return;
                        }
                        parent = parent.getParent();
                    }
                }
                viewPager = null;
                if (viewPager == null) {
                    parent = parent.getParent();
                } else {
                    setViewPager(viewPager);
                    return;
                }
            }
            return;
        }
    }

    protected void onDetachedFromWindow() {
        c();
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        this.a.c().a(canvas);
    }

    protected void onMeasure(int i, int i2) {
        Pair a = this.a.c().a(i, i2);
        setMeasuredDimension(((Integer) a.first).intValue(), ((Integer) a.second).intValue());
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.a.b().a(this.d);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r7, float r8, int r9) {
        /*
        r6 = this;
        r9 = r6.a;
        r9 = r9.b();
        r0 = r9.t();
        r1 = r9.k();
        r2 = r6.g();
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001e;
    L_0x0016:
        if (r1 == 0) goto L_0x001e;
    L_0x0018:
        r1 = defpackage.ago.NONE;
        if (r0 == r1) goto L_0x001e;
    L_0x001c:
        r0 = 1;
        goto L_0x001f;
    L_0x001e:
        r0 = 0;
    L_0x001f:
        if (r0 == 0) goto L_0x00d9;
    L_0x0021:
        r0 = r6.f();
        r1 = r9.r();
        r2 = r9.o();
        if (r0 == 0) goto L_0x0033;
    L_0x002f:
        r5 = r1 + -1;
        r7 = r5 - r7;
    L_0x0033:
        if (r7 >= 0) goto L_0x0037;
    L_0x0035:
        r7 = 0;
        goto L_0x003b;
    L_0x0037:
        r1 = r1 - r4;
        if (r7 <= r1) goto L_0x003b;
    L_0x003a:
        r7 = r1;
    L_0x003b:
        if (r7 <= r2) goto L_0x003f;
    L_0x003d:
        r1 = 1;
        goto L_0x0040;
    L_0x003f:
        r1 = 0;
    L_0x0040:
        if (r0 == 0) goto L_0x004a;
    L_0x0042:
        r5 = r7 + -1;
        if (r5 >= r2) goto L_0x0048;
    L_0x0046:
        r5 = 1;
        goto L_0x004f;
    L_0x0048:
        r5 = 0;
        goto L_0x004f;
    L_0x004a:
        r5 = r7 + 1;
        if (r5 >= r2) goto L_0x0048;
    L_0x004e:
        goto L_0x0046;
    L_0x004f:
        if (r1 != 0) goto L_0x0053;
    L_0x0051:
        if (r5 == 0) goto L_0x0057;
    L_0x0053:
        r9.l(r7);
        r2 = r7;
    L_0x0057:
        r9 = 0;
        if (r2 != r7) goto L_0x0060;
    L_0x005a:
        r1 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r1 == 0) goto L_0x0060;
    L_0x005e:
        r1 = 1;
        goto L_0x0061;
    L_0x0060:
        r1 = 0;
    L_0x0061:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r1 == 0) goto L_0x006d;
    L_0x0065:
        if (r0 == 0) goto L_0x006a;
    L_0x0067:
        r7 = r7 + -1;
        goto L_0x006f;
    L_0x006a:
        r7 = r7 + 1;
        goto L_0x006f;
    L_0x006d:
        r8 = r2 - r8;
    L_0x006f:
        r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0076;
    L_0x0073:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x007b;
    L_0x0076:
        r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r0 >= 0) goto L_0x007b;
    L_0x007a:
        r8 = 0;
    L_0x007b:
        r0 = new android.util.Pair;
        r7 = java.lang.Integer.valueOf(r7);
        r8 = java.lang.Float.valueOf(r8);
        r0.<init>(r7, r8);
        r7 = r0.first;
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r8 = r0.second;
        r8 = (java.lang.Float) r8;
        r8 = r8.floatValue();
        r0 = r6.a;
        r0 = r0.b();
        r1 = r0.k();
        if (r1 == 0) goto L_0x00d9;
    L_0x00a4:
        r1 = r0.r();
        if (r1 <= 0) goto L_0x00b3;
    L_0x00aa:
        if (r7 >= 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00b3;
    L_0x00ad:
        r3 = r1 + -1;
        if (r7 <= r3) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b3;
    L_0x00b2:
        r3 = r7;
    L_0x00b3:
        r7 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r7 >= 0) goto L_0x00b9;
    L_0x00b7:
        r8 = 0;
        goto L_0x00bf;
    L_0x00b9:
        r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r7 <= 0) goto L_0x00bf;
    L_0x00bd:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x00bf:
        r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r7 != 0) goto L_0x00cd;
    L_0x00c3:
        r7 = r0.o();
        r0.n(r7);
        r0.l(r3);
    L_0x00cd:
        r0.m(r3);
        r7 = r6.a;
        r7 = r7.a();
        r7.a(r8);
    L_0x00d9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.onPageScrolled(int, float, int):void");
    }

    public void onPageSelected(int i) {
        ahq b = this.a.b();
        boolean g = g();
        int r = b.r();
        if (g) {
            if (f()) {
                i = (r - 1) - i;
            }
            setSelection(i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ahs) {
            ahq b = this.a.b();
            ahs ahs = (ahs) parcelable;
            b.l(ahs.a());
            b.m(ahs.b());
            b.n(ahs.c());
            super.onRestoreInstanceState(ahs.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        ahq b = this.a.b();
        Parcelable ahs = new ahs(super.onSaveInstanceState());
        ahs.a(b.o());
        ahs.b(b.p());
        ahs.c(b.q());
        return ahs;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.c().a(motionEvent);
        return true;
    }

    public void setAnimationDuration(long j) {
        this.a.b().a(j);
    }

    public void setAnimationType(ago ago) {
        this.a.a(null);
        if (ago != null) {
            this.a.b().a(ago);
        } else {
            this.a.b().a(ago.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.a.b().b(z);
        e();
    }

    public void setClickListener(aho aho) {
        this.a.c().a(aho);
    }

    public void setCount(int i) {
        if (i >= 0 && this.a.b().r() != i) {
            this.a.b().o(i);
            e();
            requestLayout();
        }
    }

    public void setDynamicCount(boolean z) {
        this.a.b().c(z);
        if (z) {
            if (this.b == null) {
                ViewPager viewPager = this.c;
                if (viewPager != null) {
                    if (viewPager.getAdapter() != null) {
                        this.b = new c(this);
                        try {
                            this.c.getAdapter().registerDataSetObserver(this.b);
                            return;
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return;
        }
        c();
    }

    public void setInteractiveAnimation(boolean z) {
        this.a.b().a(z);
        this.d = z;
    }

    public void setOrientation(ahr ahr) {
        if (ahr != null) {
            this.a.b().a(ahr);
            requestLayout();
        }
    }

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.a.b().d((int) f);
        invalidate();
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a.b().d(aii.a(i));
        invalidate();
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.a.b().c((int) f);
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a.b().c(aii.a(i));
        invalidate();
    }

    public void setRtlMode(ahu ahu) {
        ahq b = this.a.b();
        if (ahu == null) {
            ahu = ahu.Off;
        }
        b.a(ahu);
        if (this.c != null) {
            int o = b.o();
            if (f()) {
                o = (b.r() - 1) - o;
            } else {
                ViewPager viewPager = this.c;
                if (viewPager != null) {
                    o = viewPager.getCurrentItem();
                }
            }
            b.n(o);
            b.m(o);
            b.l(o);
            invalidate();
        }
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        this.a.b().a(f);
    }

    public void setSelected(int i) {
        ahq b = this.a.b();
        ago t = b.t();
        b.a(ago.NONE);
        setSelection(i);
        b.a(t);
    }

    public void setSelectedColor(int i) {
        this.a.b().k(i);
        invalidate();
    }

    public void setSelection(int i) {
        ahq b = this.a.b();
        int r = this.a.b().r() - 1;
        if (i < 0) {
            i = 0;
        } else if (i > r) {
            i = r;
        }
        if (i == b.o()) {
            return;
        }
        if (i != b.p()) {
            b.a(false);
            b.n(b.o());
            b.m(i);
            b.l(i);
            this.a.a().a();
        }
    }

    public void setStrokeWidth(float f) {
        int a = this.a.b().a();
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = (float) a;
            if (f > f2) {
                f = f2;
            }
        }
        this.a.b().i((int) f);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        i = aii.a(i);
        int a = this.a.b().a();
        if (i < 0) {
            i = 0;
        } else if (i > a) {
            i = a;
        }
        this.a.b().i(i);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.a.b().j(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.c;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            this.c = null;
        }
        if (viewPager != null) {
            this.c = viewPager;
            this.c.addOnPageChangeListener(this);
            this.c.addOnAdapterChangeListener(this);
            this.a.b().p(this.c.getId());
            setDynamicCount(this.a.b().m());
            d();
        }
    }
}
