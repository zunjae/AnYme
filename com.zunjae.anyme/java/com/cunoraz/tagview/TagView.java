package com.cunoraz.tagview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class TagView extends RelativeLayout {
    private List<b> a = new ArrayList();
    private LayoutInflater b;
    private ViewTreeObserver c;
    private g d;
    private h e;
    private i f;
    private int g;
    private boolean h = false;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public TagView(Context context) {
        super(context, null);
        a(context, null, 0);
    }

    public TagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public TagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.c = getViewTreeObserver();
        this.c.addOnGlobalLayoutListener(new c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TagView, i, i);
        this.i = (int) obtainStyledAttributes.getDimension(R.styleable.TagView_lineMargin, (float) j.a(getContext(), 5.0f));
        this.j = (int) obtainStyledAttributes.getDimension(R.styleable.TagView_tagMargin, (float) j.a(getContext(), 5.0f));
        this.k = (int) obtainStyledAttributes.getDimension(R.styleable.TagView_textPaddingLeft, (float) j.a(getContext(), 8.0f));
        this.l = (int) obtainStyledAttributes.getDimension(R.styleable.TagView_textPaddingRight, (float) j.a(getContext(), 8.0f));
        this.m = (int) obtainStyledAttributes.getDimension(R.styleable.TagView_textPaddingTop, (float) j.a(getContext(), 5.0f));
        this.n = (int) obtainStyledAttributes.getDimension(R.styleable.TagView_textPaddingBottom, (float) j.a(getContext(), 5.0f));
        obtainStyledAttributes.recycle();
    }

    private Drawable b(b bVar) {
        Drawable drawable = bVar.n;
        if (drawable != null) {
            return drawable;
        }
        drawable = new StateListDrawable();
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(bVar.e);
        gradientDrawable.setCornerRadius(bVar.j);
        if (bVar.l > 0.0f) {
            gradientDrawable.setStroke(j.a(getContext(), bVar.l), bVar.m);
        }
        Drawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(bVar.f);
        gradientDrawable2.setCornerRadius(bVar.j);
        drawable.addState(new int[]{16842919}, gradientDrawable2);
        drawable.addState(new int[0], gradientDrawable);
        return drawable;
    }

    private void b() {
        if (this.h) {
            removeAllViews();
            float paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
            ViewGroup viewGroup = null;
            float f = paddingLeft;
            b bVar = null;
            int i = 1;
            int i2 = 1;
            int i3 = 1;
            for (b bVar2 : r0.a) {
                int i4 = i - 1;
                View inflate = r0.b.inflate(R.layout.tagview_item, viewGroup);
                inflate.setId(i);
                if (VERSION.SDK_INT < 16) {
                    inflate.setBackgroundDrawable(b(bVar2));
                } else {
                    inflate.setBackground(b(bVar2));
                }
                TextView textView = (TextView) inflate.findViewById(R.id.tv_tag_item_contain);
                textView.setText(bVar2.b);
                LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
                layoutParams.setMargins(r0.k, r0.m, r0.l, r0.n);
                textView.setLayoutParams(layoutParams);
                textView.setTextColor(bVar2.c);
                textView.setTextSize(2, bVar2.d);
                inflate.setOnClickListener(new d(r0, bVar2, i4));
                inflate.setOnLongClickListener(new e(r0, bVar2, i4));
                float measureText = (textView.getPaint().measureText(bVar2.b) + ((float) r0.k)) + ((float) r0.l);
                textView = (TextView) inflate.findViewById(R.id.tv_tag_item_delete);
                if (bVar2.g) {
                    textView.setVisibility(0);
                    textView.setText(bVar2.k);
                    int a = j.a(getContext(), 2.0f);
                    textView.setPadding(a, r0.m, r0.l + a, r0.n);
                    textView.setTextColor(bVar2.h);
                    textView.setTextSize(2, bVar2.i);
                    textView.setOnClickListener(new f(r0, bVar2, i4));
                    measureText += (textView.getPaint().measureText(bVar2.k) + ((float) r0.k)) + ((float) r0.l);
                } else {
                    textView.setVisibility(8);
                }
                ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.bottomMargin = r0.i;
                if (((float) r0.g) <= (f + measureText) + ((float) j.a(getContext(), 2.0f))) {
                    layoutParams2.addRule(3, i2);
                    f = (float) (getPaddingLeft() + getPaddingRight());
                    i2 = i;
                    i3 = i2;
                } else {
                    layoutParams2.addRule(6, i3);
                    if (i != i3) {
                        layoutParams2.addRule(1, i4);
                        i4 = r0.j;
                        layoutParams2.leftMargin = i4;
                        f += (float) i4;
                        if (bVar.d < bVar2.d) {
                            i2 = i;
                        }
                        f += measureText;
                        addView(inflate, layoutParams2);
                        i++;
                        bVar = bVar2;
                        viewGroup = null;
                    }
                }
                f += measureText;
                addView(inflate, layoutParams2);
                i++;
                bVar = bVar2;
                viewGroup = null;
            }
        }
    }

    public final void a() {
        this.a.clear();
        removeAllViews();
    }

    public final void a(b bVar) {
        this.a.add(bVar);
        b();
    }

    public int getLineMargin() {
        return this.i;
    }

    public int getTagMargin() {
        return this.j;
    }

    public List<b> getTags() {
        return this.a;
    }

    public int getTextPaddingLeft() {
        return this.k;
    }

    public int getTextPaddingRight() {
        return this.l;
    }

    public int getTextPaddingTop() {
        return this.m;
    }

    public int gettextPaddingBottom() {
        return this.n;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > 0) {
            this.g = getMeasuredWidth();
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i;
    }

    public void setLineMargin(float f) {
        this.i = j.a(getContext(), f);
    }

    public void setOnTagClickListener(g gVar) {
        this.d = gVar;
    }

    public void setOnTagDeleteListener(h hVar) {
        this.e = hVar;
    }

    public void setOnTagLongClickListener(i iVar) {
        this.f = iVar;
    }

    public void setTagMargin(float f) {
        this.j = j.a(getContext(), f);
    }

    public void setTextPaddingLeft(float f) {
        this.k = j.a(getContext(), f);
    }

    public void setTextPaddingRight(float f) {
        this.l = j.a(getContext(), f);
    }

    public void setTextPaddingTop(float f) {
        this.m = j.a(getContext(), f);
    }

    public void settextPaddingBottom(float f) {
        this.n = j.a(getContext(), f);
    }
}
