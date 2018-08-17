package com.zunjae.anyme;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import defpackage.adf;
import defpackage.afn;
import defpackage.afr;
import defpackage.afs;
import defpackage.de;
import defpackage.fa;

final class a extends afn {
    final /* synthetic */ AnYmeApp a;

    a(AnYmeApp anYmeApp) {
        this.a = anYmeApp;
    }

    public final Drawable a(Context context, String str) {
        if (afr.PROFILE.name().equals(str)) {
            return afs.b(context);
        }
        adf b;
        int i;
        if (afr.ACCOUNT_HEADER.name().equals(str)) {
            b = new adf(context).b(" ");
            i = R.color.md_black_1000;
        } else if (!"customUrlItem".equals(str)) {
            return super.a(context, str);
        } else {
            b = new adf(context).b(" ");
            i = R.color.md_white_1000;
        }
        return b.k(i).g(56);
    }

    public final void a(ImageView imageView) {
        de.a((View) imageView);
    }

    public final void a(ImageView imageView, Uri uri) {
        de.b(imageView.getContext()).a(uri).a(17170443).a().b(17170443).a(fa.ALL).a(imageView);
    }
}
