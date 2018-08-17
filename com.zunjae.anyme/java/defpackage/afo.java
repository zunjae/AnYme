package defpackage;

import android.net.Uri;
import android.widget.ImageView;

public final class afo {
    private static afo a;
    private afq b;
    private boolean c = false;

    private afo(afq afq) {
        this.b = afq;
    }

    public static afo a() {
        if (a == null) {
            a = new afo(new afp());
        }
        return a;
    }

    public static afo a(afq afq) {
        afo afo = new afo(afq);
        a = afo;
        return afo;
    }

    public final void a(ImageView imageView) {
        afq afq = this.b;
        if (afq != null) {
            afq.a(imageView);
        }
    }

    public final boolean a(ImageView imageView, Uri uri, String str) {
        if (!(this.c || "http".equals(uri.getScheme()))) {
            if (!"https".equals(uri.getScheme())) {
                return false;
            }
        }
        afq afq = this.b;
        if (afq != null) {
            afq.a(imageView.getContext(), str);
            this.b.b(imageView, uri);
        }
        return true;
    }

    public final afq b() {
        return this.b;
    }
}
