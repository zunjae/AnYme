package com.miguelcatalan.materialsearchview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class n {
    TextView a;
    ImageView b;
    final /* synthetic */ l c;

    public n(l lVar, View view) {
        this.c = lVar;
        this.a = (TextView) view.findViewById(R.id.suggestion_text);
        if (lVar.c != null) {
            this.b = (ImageView) view.findViewById(R.id.suggestion_icon);
            this.b.setImageDrawable(lVar.c);
        }
    }
}
