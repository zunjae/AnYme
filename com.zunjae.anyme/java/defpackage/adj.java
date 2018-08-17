package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v4.widget.TextViewCompat;
import android.widget.TextView;

public final class adj {
    public adf a;
    public adf b;
    public adf c;
    public adf d;

    public final void a(TextView textView) {
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(textView);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = compoundDrawablesRelative[0];
        }
        Drawable drawable2 = this.b;
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative[1];
        }
        Drawable drawable3 = this.c;
        if (drawable3 == null) {
            drawable3 = compoundDrawablesRelative[2];
        }
        Drawable drawable4 = this.d;
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative[3];
        }
        TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable, drawable2, drawable3, drawable4);
    }
}
