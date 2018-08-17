package com.greenfrvr.hashtagview;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import defpackage.tw;
import defpackage.vl;
import defpackage.vt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mehdi.sakout.fancybuttons.R;

public class HashtagView extends LinearLayout {
    private static final SparseArray<TruncateAt> a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private Typeface J;
    private float K;
    private int L = -1;
    private int M = 0;
    private boolean N;
    private boolean O;
    private h P = b.a();
    private f Q = a.a();
    private e R;
    private final OnPreDrawListener S = new c(this);
    private final LayoutParams b = new LayoutParams(-1, -2);
    private final LayoutParams c = new LayoutParams(-2, -2);
    private final FrameLayout.LayoutParams d = new FrameLayout.LayoutParams(-2, -2);
    private LayoutTransition e;
    private List<Object> f;
    private List<Object> g;
    private List<Float> h;
    private List<l> i;
    private vt<Integer, l> j;
    private k k = k.a();
    private ColorStateList l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;
    private int x;
    private int y;
    private int z;

    static {
        SparseArray sparseArray = new SparseArray(4);
        a = sparseArray;
        sparseArray.put(0, TruncateAt.START);
        a.put(1, TruncateAt.MIDDLE);
        a.put(2, TruncateAt.END);
        a.put(3, TruncateAt.MARQUEE);
    }

    public HashtagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.HashtagView, 0, 0);
        try {
            this.m = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagMargin, getResources().getDimensionPixelOffset(R.dimen.default_item_margin));
            this.n = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagPaddingLeft, getResources().getDimensionPixelOffset(R.dimen.default_item_padding));
            this.o = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagPaddingRight, getResources().getDimensionPixelOffset(R.dimen.default_item_padding));
            this.p = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagPaddingTop, getResources().getDimensionPixelOffset(R.dimen.default_item_padding));
            this.q = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagPaddingBottom, getResources().getDimensionPixelOffset(R.dimen.default_item_padding));
            this.r = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagDrawablePadding, 0);
            this.s = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagMinWidth, getResources().getDimensionPixelOffset(R.dimen.min_item_width));
            this.t = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_tagMaxWidth, getResources().getDimensionPixelOffset(R.dimen.min_item_width));
            this.x = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.HashtagView_rowMargin, getResources().getDimensionPixelOffset(R.dimen.default_row_margin));
            this.w = obtainStyledAttributes.getDimension(R.styleable.HashtagView_tagTextSize, getResources().getDimension(R.dimen.default_text_size));
            this.u = obtainStyledAttributes.getInt(R.styleable.HashtagView_tagTextGravity, 17);
            this.v = obtainStyledAttributes.getInt(R.styleable.HashtagView_tagEllipsize, 2);
            this.y = obtainStyledAttributes.getInt(R.styleable.HashtagView_rowGravity, 17);
            this.z = obtainStyledAttributes.getInt(R.styleable.HashtagView_rowDistribution, 4);
            this.A = obtainStyledAttributes.getInt(R.styleable.HashtagView_rowMode, 0);
            this.B = obtainStyledAttributes.getInt(R.styleable.HashtagView_rowsQuantity, 0);
            this.C = obtainStyledAttributes.getInt(R.styleable.HashtagView_composeMode, 0);
            this.D = obtainStyledAttributes.getResourceId(R.styleable.HashtagView_tagBackground, 0);
            this.E = obtainStyledAttributes.getResourceId(R.styleable.HashtagView_tagForeground, 0);
            this.F = obtainStyledAttributes.getResourceId(R.styleable.HashtagView_tagDrawableLeft, 0);
            this.G = obtainStyledAttributes.getResourceId(R.styleable.HashtagView_tagSelectedDrawableLeft, 0);
            this.H = obtainStyledAttributes.getResourceId(R.styleable.HashtagView_tagDrawableRight, 0);
            this.I = obtainStyledAttributes.getResourceId(R.styleable.HashtagView_tagSelectedDrawableRight, 0);
            this.l = obtainStyledAttributes.getColorStateList(R.styleable.HashtagView_tagTextColor);
            if (this.l == null) {
                this.l = ColorStateList.valueOf(-16777216);
            }
            this.N = obtainStyledAttributes.getBoolean(R.styleable.HashtagView_selectionMode, false);
            this.O = obtainStyledAttributes.getBoolean(R.styleable.HashtagView_dynamicMode, false);
            this.d.gravity = this.u;
            LayoutParams layoutParams = this.c;
            int i = this.m;
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
            layoutParams.weight = this.A > 0 ? 1.0f : 0.0f;
            if (2 == this.A) {
                this.c.width = 0;
            }
            layoutParams = this.b;
            i = this.x;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
            if (this.O) {
                this.e = new LayoutTransition();
                this.e.setStagger(2, 250);
                this.e.setAnimateParentHierarchy(false);
            }
            a();
            this.h = new ArrayList();
            this.i = new ArrayList();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private View a(l lVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.layout_item, this, false);
        viewGroup.setBackgroundResource(this.D);
        viewGroup.setPadding(this.n, this.p, this.o, this.q);
        viewGroup.setMinimumWidth(this.s);
        try {
            if (this.E != 0) {
                ((FrameLayout) viewGroup).setForeground(ContextCompat.getDrawable(getContext(), this.E));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        viewGroup.setOnClickListener(new d(this, lVar));
        return viewGroup;
    }

    private void a() {
        switch (this.C) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                this.R = new j();
                return;
            case tw.a /*1*/:
                this.R = new i();
                return;
            default:
                return;
        }
    }

    static /* synthetic */ void a(HashtagView hashtagView, l lVar) {
        int i;
        if (lVar.d) {
            i = hashtagView.M - 1;
        } else {
            i = hashtagView.L;
            if (i != -1) {
                if (hashtagView.M >= i) {
                    return;
                }
            }
            i = hashtagView.M + 1;
        }
        hashtagView.M = i;
        lVar.b(hashtagView.F, hashtagView.G, hashtagView.H, hashtagView.I);
        lVar.a(hashtagView.P);
        List list = hashtagView.g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    static /* synthetic */ boolean a(HashtagView hashtagView) {
        if (hashtagView.getViewWidth() <= 0) {
            if (hashtagView.B <= 0) {
                return false;
            }
        }
        return true;
    }

    private int b() {
        return (this.n + this.o) + (this.m * 2);
    }

    static /* synthetic */ void b(HashtagView hashtagView) {
        List list = hashtagView.i;
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            hashtagView.h.clear();
            hashtagView.K = 0.0f;
            for (l lVar : hashtagView.i) {
                View a = hashtagView.a(lVar);
                TextView textView = (TextView) a.findViewById(R.id.text);
                textView.setText(hashtagView.P.a(lVar.a));
                textView.setTextColor(hashtagView.l);
                int i = 0;
                textView.setTextSize(0, hashtagView.w);
                textView.setCompoundDrawablePadding(hashtagView.r);
                textView.setCompoundDrawablesWithIntrinsicBounds(hashtagView.F, 0, hashtagView.H, 0);
                textView.setEllipsize((TruncateAt) a.get(hashtagView.v));
                int i2 = hashtagView.t;
                if (i2 > 0) {
                    textView.setMaxWidth(i2);
                }
                Typeface typeface = hashtagView.J;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                textView.setLayoutParams(hashtagView.d);
                textView.measure(0, 0);
                i2 = textView.getMeasuredWidth();
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                int intrinsicWidth = (compoundDrawables[0] != null ? compoundDrawables[0].getIntrinsicWidth() + hashtagView.r : 0) + 0;
                if (compoundDrawables[2] != null) {
                    i = hashtagView.r + compoundDrawables[2].getIntrinsicWidth();
                }
                float min = Math.min(Math.max((float) ((i2 + (intrinsicWidth + i)) + hashtagView.b()), (float) hashtagView.s), (float) (hashtagView.getViewWidth() - (hashtagView.b() * 2)));
                lVar.b = a;
                lVar.c = min;
                hashtagView.setItemPreselected(lVar);
                hashtagView.h.add(Float.valueOf(lVar.c));
                hashtagView.K += lVar.c;
            }
            hashtagView.R.a();
        }
    }

    static /* synthetic */ void c(HashtagView hashtagView) {
        List list = hashtagView.i;
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            list = hashtagView.h;
            if (list != null) {
                if (!list.isEmpty()) {
                    int i = hashtagView.B;
                    if (i > 0) {
                        hashtagView.k.a(i, false, 0);
                    } else {
                        hashtagView.R.b();
                    }
                }
            }
            int[] iArr = new int[hashtagView.k.b()];
            hashtagView.j = vl.a(hashtagView.k.b(), hashtagView.i.size());
            hashtagView.R.a(0, hashtagView.k.c, iArr, true);
            k kVar = hashtagView.k;
            if (kVar.a) {
                hashtagView.R.a(kVar.c, kVar.b(), iArr, false);
                hashtagView.k.a(0, false, 0);
            }
        }
    }

    static /* synthetic */ void d(HashtagView hashtagView) {
        vt vtVar = hashtagView.j;
        if (vtVar == null) {
            return;
        }
        if (!vtVar.c()) {
            hashtagView.removeAllViews();
            List<Integer> arrayList = new ArrayList(hashtagView.j.e());
            Collections.sort(arrayList);
            for (Integer num : arrayList) {
                int size = hashtagView.j.b(num).size();
                View linearLayout = new LinearLayout(hashtagView.getContext());
                linearLayout.setLayoutParams(hashtagView.b);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(hashtagView.y);
                linearLayout.setWeightSum((float) size);
                hashtagView.addView(linearLayout);
                Collection b = hashtagView.j.b(num);
                switch (hashtagView.z) {
                    case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                        Collections.sort((List) b);
                        break;
                    case tw.a /*1*/:
                        m.a((List) b);
                        break;
                    case tw.b /*2*/:
                        Collections.sort((List) b, Collections.reverseOrder());
                        break;
                    case f.c /*3*/:
                        Collections.shuffle((List) b);
                        break;
                    default:
                        break;
                }
                linearLayout.setLayoutTransition(hashtagView.e);
                for (l lVar : hashtagView.j.b(num)) {
                    View view = lVar.b;
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    linearLayout.addView(lVar.b, hashtagView.c);
                }
            }
            arrayList.clear();
        }
    }

    static /* synthetic */ void g(HashtagView hashtagView) {
        List list = hashtagView.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private int getViewWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    static /* synthetic */ boolean m(HashtagView hashtagView) {
        if (hashtagView.k.a) {
            if (hashtagView.i.size() == hashtagView.k.b) {
                return false;
            }
        }
        return true;
    }

    private void setItemPreselected(l lVar) {
        if (this.N) {
            boolean a = this.Q.a(lVar.a);
            if (a) {
                int i = this.L;
                if (i != -1) {
                    if (this.M >= i) {
                        return;
                    }
                }
                this.M++;
            }
            lVar.d = a;
            lVar.a(this.P);
            lVar.a(this.F, this.G, this.H, this.I);
        }
    }

    public final <T> void a(List<T> list, h<T> hVar, f<T> fVar) {
        this.Q = fVar;
        this.P = hVar;
        setData(list);
    }

    public <T> List<T> getData() {
        List<T> arrayList = new ArrayList();
        vt vtVar = this.j;
        if (!(vtVar == null || vtVar.c())) {
            for (l lVar : this.j.f()) {
                arrayList.add(lVar.a);
            }
        }
        return arrayList;
    }

    public <T> List<T> getSelectedItems() {
        List<T> arrayList = new ArrayList();
        vt vtVar = this.j;
        if (!(vtVar == null || vtVar.c())) {
            for (l lVar : this.j.f()) {
                if (lVar.d) {
                    arrayList.add(lVar.a);
                }
            }
        }
        return arrayList;
    }

    public int getSelectionLimit() {
        return this.L;
    }

    public void setBackgroundColor(int i) {
        this.D = i;
    }

    public void setBackgroundDrawable(int i) {
        this.D = i;
    }

    public void setComposeMode(int i) {
        this.C = i;
        a();
    }

    public <T> void setData(List<T> list) {
        this.h.clear();
        this.i.clear();
        if (list.isEmpty()) {
            removeAllViews();
            return;
        }
        for (T lVar : list) {
            this.i.add(new l(lVar));
        }
        getViewTreeObserver().addOnPreDrawListener(this.S);
    }

    public void setDynamicMode(boolean z) {
        this.O = z;
    }

    public void setEllipsize(int i) {
        this.v = i;
    }

    public void setForegroundDrawable(int i) {
        this.E = i;
    }

    public void setInSelectMode(boolean z) {
        this.N = z;
    }

    public void setItemMargin(int i) {
        this.m = i;
    }

    public void setItemMarginRes(int i) {
        this.m = getResources().getDimensionPixelOffset(i);
    }

    public void setItemTextColor(int i) {
        this.l = ColorStateList.valueOf(i);
    }

    public void setItemTextColorRes(int i) {
        this.l = ColorStateList.valueOf(ContextCompat.getColor(getContext(), i));
    }

    public void setItemTextColorStateList(ColorStateList colorStateList) {
        this.l = colorStateList;
    }

    public void setItemTextColorStateListRes(int i) {
        this.l = ContextCompat.getColorStateList(getContext(), i);
    }

    public void setItemTextGravity(int i) {
        this.u = i;
    }

    public void setItemTextSize(float f) {
        this.w = f;
    }

    public void setItemTextSizeRes(int i) {
        this.w = getResources().getDimension(i);
    }

    public void setLeftDrawable(int i) {
        this.F = i;
    }

    public void setLeftSelectedDrawable(int i) {
        this.G = i;
    }

    public void setMaxItemWidth(int i) {
        this.t = i;
    }

    public void setMaxItemWidthRes(int i) {
        this.t = getResources().getDimensionPixelOffset(i);
    }

    public void setMinItemWidth(int i) {
        this.s = i;
    }

    public void setMinItemWidthRes(int i) {
        this.s = getResources().getDimensionPixelOffset(i);
    }

    public void setRightDrawable(int i) {
        this.H = i;
    }

    public void setRightSelectedDrawable(int i) {
        this.I = i;
    }

    public void setRowCount(int i) {
        if (i >= 0) {
            this.B = i;
        }
    }

    public void setRowDistribution(int i) {
        this.z = i;
    }

    public void setRowGravity(int i) {
        this.y = i;
    }

    public void setRowMargin(int i) {
        this.x = i;
    }

    public void setRowMarginRes(int i) {
        this.x = getResources().getDimensionPixelOffset(i);
    }

    public void setRowMode(int i) {
        this.A = i;
    }

    public void setSelectionLimit(int i) {
        if (i <= 0) {
            i = -1;
        }
        this.L = i;
        vt vtVar = this.j;
        if (vtVar != null) {
            for (l lVar : vtVar.f()) {
                lVar.d = false;
                lVar.a(this.F, this.G, this.H, this.I);
                lVar.a(this.P);
            }
        }
    }

    public <T> void setTransformer(h<T> hVar) {
        this.P = hVar;
    }

    public void setTypeface(Typeface typeface) {
        this.J = typeface;
    }
}
