package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.h;
import com.afollestad.materialdialogs.y;
import defpackage.cu;
import defpackage.tw;

public class MDRootLayout extends ViewGroup {
    private final MDButton[] a;
    private int b;
    private View c;
    private View d;
    private boolean e;
    private boolean f;
    private y g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private h o;
    private int p;
    private Paint q;
    private OnScrollChangedListener r;
    private OnScrollChangedListener s;
    private int t;

    public MDRootLayout(Context context) {
        super(context);
        this.a = new MDButton[3];
        this.e = false;
        this.f = false;
        this.g = y.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = h.START;
        a(context, null, 0);
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new MDButton[3];
        this.e = false;
        this.f = false;
        this.g = y.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = h.START;
        a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new MDButton[3];
        this.e = false;
        this.f = false;
        this.g = y.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = h.START;
        a(context, attributeSet, i);
    }

    @TargetApi(21)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new MDButton[3];
        this.e = false;
        this.f = false;
        this.g = y.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = h.START;
        a(context, attributeSet, i);
    }

    private static View a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        if (viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MDRootLayout, i, 0);
        this.j = obtainStyledAttributes.getBoolean(R.styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.l = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.m = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.p = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.n = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.q = new Paint();
        this.t = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.q.setColor(cu.a(context, R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    private void a(View view, boolean z, boolean z2) {
        while (view != null) {
            ViewGroup viewGroup;
            if (view instanceof ScrollView) {
                viewGroup = (ScrollView) view;
                if (a((ScrollView) viewGroup)) {
                    a(viewGroup, z, z2);
                    return;
                }
                if (z) {
                    this.e = false;
                }
                if (z2) {
                    this.f = false;
                }
                return;
            } else if (view instanceof AdapterView) {
                viewGroup = (AdapterView) view;
                if (a((AdapterView) viewGroup)) {
                    a(viewGroup, z, z2);
                    return;
                }
                if (z) {
                    this.e = false;
                }
                if (z2) {
                    this.f = false;
                }
                return;
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new b(this, view, z, z2));
                return;
            } else if (view instanceof RecyclerView) {
                boolean a = a((RecyclerView) view);
                if (z) {
                    this.e = a;
                }
                if (z2) {
                    this.f = a;
                }
                if (a) {
                    a((ViewGroup) view, z, z2);
                }
                return;
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                    View b = b(viewGroup);
                    a(b, z, z2);
                    view = a(viewGroup);
                    if (view != b) {
                        z2 = true;
                        z = false;
                    }
                }
                return;
            }
        }
    }

    private void a(ViewGroup viewGroup, boolean z, boolean z2) {
        if ((!z2 && this.r == null) || (z2 && this.s == null)) {
            if (viewGroup instanceof RecyclerView) {
                c cVar = new c(this, viewGroup, z, z2);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.addOnScrollListener(cVar);
                cVar.onScrolled(recyclerView, 0, 0);
                return;
            }
            ViewTreeObserver viewTreeObserver;
            OnScrollChangedListener onScrollChangedListener;
            OnScrollChangedListener dVar = new d(this, viewGroup, z, z2);
            if (z2) {
                this.s = dVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.s;
            } else {
                this.r = dVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.r;
            }
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            dVar.onScrollChanged();
        }
    }

    static /* synthetic */ void a(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            View view = mDRootLayout.c;
            z = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
            mDRootLayout.e = z;
        }
        if (z2 && viewGroup.getChildCount() > 0) {
            if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z4 = false;
            }
            mDRootLayout.f = z4;
        }
    }

    static /* synthetic */ void a(MDRootLayout mDRootLayout, WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            View view = mDRootLayout.c;
            z = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
            mDRootLayout.e = z;
        }
        if (z2) {
            if (!z3 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z4 = false;
            }
            mDRootLayout.f = z4;
        }
    }

    private static boolean a(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    private static boolean a(View view) {
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        return (z && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z;
    }

    static /* synthetic */ boolean a(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.widget.AdapterView r5) {
        /*
        r0 = r5.getLastVisiblePosition();
        r1 = 0;
        r2 = -1;
        if (r0 != r2) goto L_0x0009;
    L_0x0008:
        return r1;
    L_0x0009:
        r0 = r5.getFirstVisiblePosition();
        r2 = 1;
        if (r0 != 0) goto L_0x0012;
    L_0x0010:
        r0 = 1;
        goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r3 = r5.getLastVisiblePosition();
        r4 = r5.getCount();
        r4 = r4 - r2;
        if (r3 != r4) goto L_0x0020;
    L_0x001e:
        r3 = 1;
        goto L_0x0021;
    L_0x0020:
        r3 = 0;
    L_0x0021:
        if (r0 == 0) goto L_0x0054;
    L_0x0023:
        if (r3 == 0) goto L_0x0054;
    L_0x0025:
        r0 = r5.getChildCount();
        if (r0 <= 0) goto L_0x0054;
    L_0x002b:
        r0 = r5.getChildAt(r1);
        r0 = r0.getTop();
        r3 = r5.getPaddingTop();
        if (r0 >= r3) goto L_0x003a;
    L_0x0039:
        return r2;
    L_0x003a:
        r0 = r5.getChildCount();
        r0 = r0 - r2;
        r0 = r5.getChildAt(r0);
        r0 = r0.getBottom();
        r3 = r5.getHeight();
        r5 = r5.getPaddingBottom();
        r3 = r3 - r5;
        if (r0 <= r3) goto L_0x0053;
    L_0x0052:
        return r2;
    L_0x0053:
        return r1;
    L_0x0054:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.a(android.widget.AdapterView):boolean");
    }

    private static boolean a(ScrollView scrollView) {
        return scrollView.getChildCount() != 0 && (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    private static View b(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        if (viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    public final void a() {
        this.k = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.d;
        if (view != null) {
            int top;
            if (this.e) {
                top = view.getTop();
                canvas.drawRect(0.0f, (float) (top - this.t), (float) getMeasuredWidth(), (float) top, this.q);
            }
            if (this.f) {
                top = this.d.getBottom();
                canvas.drawRect(0.0f, (float) top, (float) getMeasuredWidth(), (float) (top + this.t), this.q);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.c = childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultNeutral) {
                this.a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                this.a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                this.a[2] = (MDButton) childAt;
            } else {
                this.d = childAt;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (a(this.c)) {
            int measuredHeight = this.c.getMeasuredHeight() + i2;
            this.c.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (!this.k && this.i) {
            i2 += this.l;
        }
        if (a(this.d)) {
            View view = this.d;
            view.layout(i, i2, i3, view.getMeasuredHeight() + i2);
        }
        int i5 = 0;
        int length;
        if (this.h) {
            i4 -= this.m;
            MDButton[] mDButtonArr = this.a;
            length = mDButtonArr.length;
            while (i5 < length) {
                View view2 = mDButtonArr[i5];
                if (a(view2)) {
                    view2.layout(i, i4 - view2.getMeasuredHeight(), i3, i4);
                    i4 -= view2.getMeasuredHeight();
                }
                i5++;
            }
        } else {
            int i6;
            int measuredWidth;
            int i7;
            if (this.i) {
                i4 -= this.m;
            }
            measuredHeight = i4 - this.n;
            length = this.p;
            if (a(this.a[2])) {
                if (this.o == h.END) {
                    i6 = i + length;
                    measuredWidth = this.a[2].getMeasuredWidth() + i6;
                    i7 = -1;
                } else {
                    measuredWidth = i3 - length;
                    i6 = measuredWidth - this.a[2].getMeasuredWidth();
                    i7 = i6;
                }
                this.a[2].layout(i6, measuredHeight, measuredWidth, i4);
                length += this.a[2].getMeasuredWidth();
            } else {
                i7 = -1;
            }
            if (a(this.a[1])) {
                h hVar = this.o;
                if (hVar == h.END) {
                    length += i;
                    i6 = this.a[1].getMeasuredWidth() + length;
                } else if (hVar == h.START) {
                    i6 = i3 - length;
                    length = i6 - this.a[1].getMeasuredWidth();
                } else {
                    length = this.p + i;
                    i6 = this.a[1].getMeasuredWidth() + length;
                    measuredWidth = i6;
                    this.a[1].layout(length, measuredHeight, i6, i4);
                }
                measuredWidth = -1;
                this.a[1].layout(length, measuredHeight, i6, i4);
            } else {
                measuredWidth = -1;
            }
            if (a(this.a[0])) {
                h hVar2 = this.o;
                if (hVar2 == h.END) {
                    i3 -= this.p;
                    i = i3 - this.a[0].getMeasuredWidth();
                } else if (hVar2 == h.START) {
                    i += this.p;
                    i3 = this.a[0].getMeasuredWidth() + i;
                } else {
                    if (measuredWidth != -1 || i7 == -1) {
                        MDButton mDButton;
                        if (i7 == -1 && measuredWidth != -1) {
                            mDButton = this.a[0];
                        } else if (i7 == -1) {
                            measuredWidth = ((i3 - i) / 2) - (this.a[0].getMeasuredWidth() / 2);
                            mDButton = this.a[0];
                        }
                        i7 = measuredWidth + mDButton.getMeasuredWidth();
                    } else {
                        measuredWidth = i7 - this.a[0].getMeasuredWidth();
                    }
                    i = measuredWidth;
                    i3 = i7;
                }
                this.a[0].layout(i, measuredHeight, i3, i4);
            }
        }
        a(this.d, true, true);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        Object obj;
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i5 = this.b;
        if (size2 > i5) {
            size2 = i5;
        }
        this.i = true;
        y yVar = this.g;
        int i6 = 0;
        if (yVar == y.ALWAYS) {
            z = true;
            obj = null;
        } else {
            if (yVar != y.NEVER) {
                i3 = 0;
                obj = null;
                for (View view : this.a) {
                    if (view != null && a(view)) {
                        view.a(false, false);
                        measureChild(view, i, i2);
                        i3 += view.getMeasuredWidth();
                        obj = 1;
                    }
                }
                if (i3 > size - (getContext().getResources().getDimensionPixelSize(R.dimen.md_neutral_button_margin) * 2)) {
                    z = true;
                }
            } else {
                obj = null;
            }
            z = false;
        }
        this.h = z;
        if (z) {
            i3 = 0;
            for (View view2 : this.a) {
                if (view2 != null && a(view2)) {
                    view2.a(true, false);
                    measureChild(view2, i, i2);
                    i3 += view2.getMeasuredHeight();
                    obj = 1;
                }
            }
        } else {
            i3 = 0;
        }
        if (obj == null) {
            i = size2;
        } else if (this.h) {
            i = size2 - i3;
            i2 = this.m;
            i4 = (i2 * 2) + 0;
            i2 = (i2 * 2) + 0;
            if (a(this.c)) {
                this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                i -= this.c.getMeasuredHeight();
            } else if (!this.k) {
                i4 += this.l;
            }
            if (a(this.d)) {
                i6 = i;
            } else {
                this.d.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(i - i2, Integer.MIN_VALUE));
                if (this.d.getMeasuredHeight() > i - i4) {
                    if (this.j && !a(this.c)) {
                        if (obj != null) {
                            this.i = false;
                            i6 = i - (this.d.getMeasuredHeight() + i2);
                        }
                    }
                    this.i = true;
                    i6 = i - (this.d.getMeasuredHeight() + i4);
                } else {
                    this.i = false;
                }
            }
            setMeasuredDimension(size, size2 - i6);
        } else {
            i = size2 - this.n;
        }
        i4 = (this.m * 2) + 0;
        i2 = 0;
        if (a(this.c)) {
            this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            i -= this.c.getMeasuredHeight();
        } else if (this.k) {
            i4 += this.l;
        }
        if (a(this.d)) {
            i6 = i;
        } else {
            this.d.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(i - i2, Integer.MIN_VALUE));
            if (this.d.getMeasuredHeight() > i - i4) {
                this.i = false;
            } else if (obj != null) {
                this.i = false;
                i6 = i - (this.d.getMeasuredHeight() + i2);
            } else {
                this.i = true;
                i6 = i - (this.d.getMeasuredHeight() + i4);
            }
        }
        setMeasuredDimension(size, size2 - i6);
    }

    public void setButtonGravity(h hVar) {
        this.o = hVar;
        if (VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            switch (e.a[this.o.ordinal()]) {
                case tw.a /*1*/:
                    this.o = h.END;
                    return;
                case tw.b /*2*/:
                    this.o = h.START;
                    return;
                default:
                    return;
            }
        }
    }

    public void setButtonStackedGravity(h hVar) {
        for (MDButton mDButton : this.a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(hVar);
            }
        }
    }

    public void setDividerColor(int i) {
        this.q.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.b = i;
    }

    public void setStackingBehavior(y yVar) {
        this.g = yVar;
        invalidate();
    }
}
