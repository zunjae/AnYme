package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.h;
import defpackage.cu;

@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {
    private boolean a = false;
    private h b;
    private int c;
    private Drawable d;
    private Drawable e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public MDButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        this.c = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.b = h.END;
    }

    final void a(boolean z, boolean z2) {
        if (this.a != z || z2) {
            setGravity(z ? this.b.getGravityInt() | 16 : 17);
            if (VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.b.getTextAlignment() : 4);
            }
            cu.a((View) this, z ? this.d : this.e);
            if (z) {
                setPadding(this.c, getPaddingTop(), this.c, getPaddingBottom());
            }
            this.a = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        if (VERSION.SDK_INT >= 14) {
            setAllCaps(z);
        } else {
            setTransformationMethod(z ? new a(getContext()) : null);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        this.e = drawable;
        if (!this.a) {
            a(false, true);
        }
    }

    public void setStackedGravity(h hVar) {
        this.b = hVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.d = drawable;
        if (this.a) {
            a(true, true);
        }
    }
}
