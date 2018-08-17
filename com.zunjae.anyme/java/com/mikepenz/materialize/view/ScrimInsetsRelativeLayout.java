package com.mikepenz.materialize.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mikepenz.materialize.R;

public class ScrimInsetsRelativeLayout extends RelativeLayout implements a {
    private Drawable a;
    private Rect b;
    private Rect c;
    private b d;
    private boolean e;
    private boolean f;
    private boolean g;

    public ScrimInsetsRelativeLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.e = true;
        this.f = true;
        this.g = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrimInsetsRelativeLayout, i, R.style.Widget_Materialize_ScrimInsetsRelativeLayout);
        this.a = obtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsRelativeLayout_sirl_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new d(this));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b != null && this.a != null) {
            Rect rect;
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (!this.g) {
                rect = this.b;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.left = 0;
            }
            if (this.e) {
                this.c.set(0, 0, width, this.b.top);
                this.a.setBounds(this.c);
                this.a.draw(canvas);
            }
            if (this.f) {
                this.c.set(0, height - this.b.bottom, width, height);
                this.a.setBounds(this.c);
                this.a.draw(canvas);
            }
            rect = this.c;
            Rect rect2 = this.b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            rect = this.c;
            Rect rect3 = this.b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public Drawable getInsetForeground() {
        return this.a;
    }

    public b getOnInsetsCallback() {
        return this.d;
    }

    public ViewGroup getView() {
        return this;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setInsetForeground(int i) {
        this.a = new ColorDrawable(i);
    }

    public void setInsetForeground(Drawable drawable) {
        this.a = drawable;
    }

    public void setOnInsetsCallback(b bVar) {
        this.d = bVar;
    }

    public void setSystemUIVisible(boolean z) {
        this.g = z;
    }

    public void setTintNavigationBar(boolean z) {
        this.f = z;
    }

    public void setTintStatusBar(boolean z) {
        this.e = z;
    }
}
