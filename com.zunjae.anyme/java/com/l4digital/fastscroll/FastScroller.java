package com.l4digital.fastscroll;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.b;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.tw;
import mehdi.sakout.fancybuttons.R;

public class FastScroller extends LinearLayout {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private i h;
    private ViewPropertyAnimator i;
    private ViewPropertyAnimator j;
    private RecyclerView k;
    private TextView l;
    private ImageView m;
    private ImageView n;
    private View o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private a s;
    private Runnable t;
    private OnScrollListener u;

    public FastScroller(Context context) {
        super(context);
        this.t = new b(this);
        this.u = new c(this);
        a(context, null);
        setLayoutParams(new LayoutParams(-2, -1));
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new b(this);
        this.u = new c(this);
        a(context, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
    }

    static /* synthetic */ float a(FastScroller fastScroller, RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float computeVerticalScrollRange = (float) (recyclerView.computeVerticalScrollRange() - fastScroller.e);
        float f = (float) computeVerticalScrollOffset;
        if (computeVerticalScrollRange <= 0.0f) {
            computeVerticalScrollRange = 1.0f;
        }
        return ((float) fastScroller.e) * (f / computeVerticalScrollRange);
    }

    private static int a(int i, int i2) {
        return Math.min(Math.max(0, i2), i);
    }

    private void a(Context context, AttributeSet attributeSet) {
        boolean z;
        inflate(context, R.layout.fastscroller, this);
        boolean z2 = false;
        setClipChildren(false);
        setOrientation(0);
        this.l = (TextView) findViewById(R.id.fastscroll_bubble);
        this.m = (ImageView) findViewById(R.id.fastscroll_handle);
        this.n = (ImageView) findViewById(R.id.fastscroll_track);
        this.o = findViewById(R.id.fastscroll_scrollbar);
        int i = -1;
        int i2 = -3355444;
        int i3 = -12303292;
        int i4 = -7829368;
        boolean z3 = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FastScroller, 0, 0);
            if (obtainStyledAttributes != null) {
                try {
                    i4 = obtainStyledAttributes.getColor(R.styleable.FastScroller_bubbleColor, -7829368);
                    i3 = obtainStyledAttributes.getColor(R.styleable.FastScroller_handleColor, -12303292);
                    i2 = obtainStyledAttributes.getColor(R.styleable.FastScroller_trackColor, -3355444);
                    i = obtainStyledAttributes.getColor(R.styleable.FastScroller_bubbleTextColor, -1);
                    z = obtainStyledAttributes.getBoolean(R.styleable.FastScroller_hideScrollbar, true);
                    z3 = obtainStyledAttributes.getBoolean(R.styleable.FastScroller_showBubble, true);
                    z2 = obtainStyledAttributes.getBoolean(R.styleable.FastScroller_showTrack, false);
                    setTrackColor(i2);
                    setHandleColor(i3);
                    setBubbleColor(i4);
                    setBubbleTextColor(i);
                    setHideScrollbar(z);
                    setBubbleVisible(z3);
                    setTrackVisible(z2);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        z = true;
        setTrackColor(i2);
        setHandleColor(i3);
        setBubbleColor(i4);
        setBubbleTextColor(i);
        setHideScrollbar(z);
        setBubbleVisible(z3);
        setTrackVisible(z2);
    }

    private void b() {
        if (this.k.computeVerticalScrollRange() - this.e > 0) {
            this.o.setTranslationX((float) getResources().getDimensionPixelSize(R.dimen.fastscroll_scrollbar_padding_end));
            this.o.setVisibility(0);
            this.i = this.o.animate().translationX(0.0f).alpha(1.0f).setDuration(300).setListener(new g(this));
        }
    }

    private static void b(ViewPropertyAnimator viewPropertyAnimator) {
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private static boolean b(View view) {
        return view != null && view.getVisibility() == 0;
    }

    private void setHandleSelected(boolean z) {
        this.m.setSelected(z);
        DrawableCompat.setTint(this.q, z ? this.a : this.b);
    }

    private void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.k;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            int itemCount = this.k.getAdapter().getItemCount();
            float f2 = 0.0f;
            if (this.m.getY() != 0.0f) {
                float y = this.m.getY() + ((float) this.d);
                int i = this.e;
                f2 = y >= ((float) (i + -5)) ? 1.0f : f / ((float) i);
            }
            int round = Math.round(f2 * ((float) itemCount));
            LayoutManager layoutManager = this.k.getLayoutManager();
            boolean reverseLayout = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getReverseLayout() : layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).getReverseLayout() : false;
            if (reverseLayout) {
                round = itemCount - round;
            }
            round = a(itemCount - 1, round);
            this.k.getLayoutManager().scrollToPosition(round);
            if (this.g) {
                i iVar = this.h;
                if (iVar != null) {
                    this.l.setText(iVar.a(round));
                }
            }
        }
    }

    private void setViewPositions(float f) {
        this.c = this.l.getHeight();
        this.d = this.m.getHeight();
        int i = this.e;
        int i2 = this.c;
        i = a((i - i2) - (this.d / 2), (int) (f - ((float) i2)));
        i2 = this.e;
        int i3 = this.d;
        int a = a(i2 - i3, (int) (f - ((float) (i3 / 2))));
        if (this.g) {
            this.l.setY((float) i);
        }
        this.m.setY((float) a);
    }

    public final void a() {
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.u);
            this.k = null;
        }
    }

    public final void a(RecyclerView recyclerView) {
        this.k = recyclerView;
        recyclerView = this.k;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.u);
            post(new d(this));
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e = i2;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                if (motionEvent.getX() >= this.m.getX() - ((float) ViewCompat.getPaddingStart(this.m))) {
                    requestDisallowInterceptTouchEvent(true);
                    setHandleSelected(true);
                    getHandler().removeCallbacks(this.t);
                    b(this.i);
                    b(this.j);
                    if (!b(this.o)) {
                        b();
                    }
                    if (!(!this.g || this.h == null || b(this.l))) {
                        this.l.setVisibility(0);
                        this.j = this.l.animate().alpha(1.0f).setDuration(100).setListener(new e(this));
                        break;
                    }
                }
                return false;
            case tw.a /*1*/:
            case f.c /*3*/:
                requestDisallowInterceptTouchEvent(false);
                setHandleSelected(false);
                if (this.f) {
                    getHandler().postDelayed(this.t, 1000);
                }
                if (b(this.l)) {
                    this.j = this.l.animate().alpha(0.0f).setDuration(100).setListener(new f(this));
                }
                return true;
            case tw.b /*2*/:
                break;
            default:
                return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        setViewPositions(y);
        setRecyclerViewPosition(y);
        return true;
    }

    public void setBubbleColor(int i) {
        this.a = i;
        if (this.p == null) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.fastscroll_bubble);
            if (drawable != null) {
                this.p = DrawableCompat.wrap(drawable);
                this.p.mutate();
            }
        }
        DrawableCompat.setTint(this.p, this.a);
        if (VERSION.SDK_INT >= 16) {
            this.l.setBackground(this.p);
        } else {
            this.l.setBackgroundDrawable(this.p);
        }
    }

    public void setBubbleTextColor(int i) {
        this.l.setTextColor(i);
    }

    public void setBubbleVisible(boolean z) {
        this.g = z;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setVisibility(z ? 0 : 8);
    }

    public void setFastScrollStateChangeListener(a aVar) {
        this.s = aVar;
    }

    public void setHandleColor(int i) {
        this.b = i;
        if (this.q == null) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.fastscroll_handle);
            if (drawable != null) {
                this.q = DrawableCompat.wrap(drawable);
                this.q.mutate();
            }
        }
        DrawableCompat.setTint(this.q, this.b);
        this.m.setImageDrawable(this.q);
    }

    public void setHideScrollbar(boolean z) {
        this.f = z;
        this.o.setVisibility(z ? 8 : 0);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        super.setLayoutParams(layoutParams);
    }

    public void setLayoutParams(ViewGroup viewGroup) {
        RecyclerView recyclerView = this.k;
        int id = recyclerView != null ? recyclerView.getId() : -1;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.fastscroll_scrollbar_margin_top);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.fastscroll_scrollbar_margin_bottom);
        if (id != -1) {
            ViewGroup.LayoutParams layoutParams;
            int i = 7;
            if (viewGroup instanceof ConstraintLayout) {
                b bVar = new b();
                int id2 = getId();
                ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
                bVar.a(constraintLayout);
                bVar.a(id2, 3, id, 3);
                bVar.a(id2, 4, id, 4);
                bVar.a(id2, 7, id, 7);
                bVar.b(constraintLayout);
                layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
                layoutParams.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize2);
            } else if (viewGroup instanceof CoordinatorLayout) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) getLayoutParams();
                layoutParams2.setAnchorId(id);
                layoutParams2.anchorGravity = 8388613;
                layoutParams2.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize2);
            } else if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) getLayoutParams();
                layoutParams3.gravity = 8388613;
                layoutParams3.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize2);
            } else if (viewGroup instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) getLayoutParams();
                if (VERSION.SDK_INT >= 17) {
                    i = 19;
                }
                layoutParams4.addRule(6, id);
                layoutParams4.addRule(8, id);
                layoutParams4.addRule(i, id);
                layoutParams4.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize2);
            } else {
                throw new IllegalArgumentException("Parent ViewGroup must be a ConstraintLayout, CoordinatorLayout, FrameLayout, or RelativeLayout");
            }
            setLayoutParams(layoutParams);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            this.l.measure(makeMeasureSpec, makeMeasureSpec);
            this.c = this.l.getMeasuredHeight();
            this.m.measure(makeMeasureSpec, makeMeasureSpec);
            this.d = this.m.getMeasuredHeight();
            return;
        }
        throw new IllegalArgumentException("RecyclerView must have a view ID");
    }

    public void setSectionIndexer(i iVar) {
        this.h = iVar;
    }

    public void setTrackColor(int i) {
        if (this.r == null) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.fastscroll_track);
            if (drawable != null) {
                this.r = DrawableCompat.wrap(drawable);
                this.r.mutate();
            }
        }
        DrawableCompat.setTint(this.r, i);
        this.n.setImageDrawable(this.r);
    }

    public void setTrackVisible(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }
}
