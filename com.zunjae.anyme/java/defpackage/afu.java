package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import com.zunjae.anyme.R;

public class afu {
    private int a = 0;
    private int b = -1;

    public static int a(afu afu, Context context, int i, int i2) {
        if (afu == null) {
            return afz.a(context, i, i2);
        }
        int a = afu.a(context);
        if (a == 0) {
            a = afz.a(context, i, i2);
        }
        return a;
    }

    public static void a(afu afu, Context context, GradientDrawable gradientDrawable) {
        if (afu == null || gradientDrawable == null) {
            if (gradientDrawable != null) {
                gradientDrawable.setColor(0);
            }
            return;
        }
        int i = afu.a;
        if (i != 0) {
            gradientDrawable.setColor(i);
            return;
        }
        int i2 = afu.b;
        if (i2 != -1) {
            gradientDrawable.setColor(ContextCompat.getColor(context, i2));
        }
    }

    public static void a(afu afu, TextView textView, ColorStateList colorStateList) {
        if (afu == null || textView == null) {
            if (textView != null) {
                textView.setTextColor(colorStateList);
            }
            return;
        }
        int i = afu.a;
        if (i != 0) {
            textView.setTextColor(i);
        } else if (afu.b != -1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), afu.b));
        } else {
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public final int a(Context context) {
        if (this.a == 0) {
            int i = this.b;
            if (i != -1) {
                this.a = ContextCompat.getColor(context, i);
            }
        }
        return this.a;
    }

    public final void a() {
        this.b = R.color.colorAccent;
    }
}
