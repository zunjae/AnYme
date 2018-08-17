package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

final class qg {
    private final ql a;
    private final Builder b;

    private qg(Builder builder, ql qlVar) {
        this.a = qlVar;
        this.b = builder;
    }

    public static qg a(Activity activity, bag bag, qk qkVar) {
        ql qlVar = new ql();
        ta taVar = new ta(activity, bag);
        Builder builder = new Builder(activity);
        CharSequence b = taVar.b();
        float f = activity.getResources().getDisplayMetrics().density;
        int i = (int) (5.0f * f);
        View textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(b);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(i, i, i, i);
        textView.setFocusable(false);
        View scrollView = new ScrollView(activity);
        scrollView.setPadding((int) (14.0f * f), (int) (2.0f * f), (int) (10.0f * f), (int) (f * 12.0f));
        scrollView.addView(textView);
        builder.setView(scrollView).setTitle(taVar.a()).setCancelable(false).setNeutralButton(taVar.c(), new qh(qlVar));
        if (bag.d) {
            builder.setNegativeButton(taVar.e(), new qi(qlVar));
        }
        if (bag.f) {
            builder.setPositiveButton(taVar.d(), new qj(qkVar, qlVar));
        }
        return new qg(builder, qlVar);
    }

    public final void a() {
        this.b.show();
    }

    public final void b() {
        this.a.b();
    }

    public final boolean c() {
        return this.a.a();
    }
}
