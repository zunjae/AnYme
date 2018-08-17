package defpackage;

import android.widget.TextView;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public class afx {
    private CharSequence a;
    private int b = -1;

    public afx(CharSequence charSequence) {
        this.a = charSequence;
    }

    public static void a(afx afx, TextView textView) {
        if (!(afx == null || textView == null)) {
            CharSequence charSequence = afx.a;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            int i = afx.b;
            if (i != -1) {
                textView.setText(i);
                return;
            }
            textView.setText(BuildConfig.FLAVOR);
        }
    }

    public static boolean b(afx afx, TextView textView) {
        if (afx == null || textView == null) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            return false;
        }
        CharSequence charSequence = afx.a;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            int i = afx.b;
            if (i != -1) {
                textView.setText(i);
            } else {
                textView.setVisibility(8);
                return false;
            }
        }
        textView.setVisibility(0);
        return true;
    }

    public String toString() {
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            return charSequence.toString();
        }
        if (this.b == -1) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder stringBuilder = new StringBuilder("StringRes:");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
