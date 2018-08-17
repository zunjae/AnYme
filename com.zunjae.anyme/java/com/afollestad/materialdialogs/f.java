package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.afollestad.materialdialogs.internal.MDRootLayout;

class f extends Dialog implements OnShowListener {
    protected MDRootLayout a;
    private OnShowListener b;

    f(Context context, int i) {
        super(context, i);
    }

    final void a() {
        super.setOnShowListener(this);
    }

    final void a(View view) {
        super.setContentView(view);
    }

    public View findViewById(int i) {
        return this.a.findViewById(i);
    }

    public void onShow(DialogInterface dialogInterface) {
        OnShowListener onShowListener = this.b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Deprecated
    public void setContentView(int i) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view, LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(OnShowListener onShowListener) {
        this.b = onShowListener;
    }
}
