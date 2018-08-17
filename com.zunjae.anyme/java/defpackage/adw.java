package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class adw extends afw {
    private adl a;

    public adw(int i) {
        super(i);
    }

    public adw(adl adl) {
        this.a = adl;
    }

    public adw(String str) {
        super(str);
    }

    public static Drawable a(adw adw, Context context, int i, boolean z, int i2) {
        return adw == null ? null : adw.a(context, i, z, i2);
    }

    private android.graphics.drawable.Drawable a(android.content.Context r3, int r4, boolean r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r2 = this;
        r0 = r2.b();
        r1 = r2.a;
        if (r1 == 0) goto L_0x001c;
    L_0x0008:
        r0 = new adf;
        r0.<init>(r3, r1);
        r3 = r0.a(r4);
        r0 = 24;
        r3 = r3.g(r0);
        r0 = r3.d(r6);
        goto L_0x004b;
    L_0x001c:
        r6 = r2.d();
        r1 = -1;
        if (r6 == r1) goto L_0x002c;
    L_0x0023:
        r6 = r2.d();
        r0 = defpackage.bv.b(r3, r6);
        goto L_0x004b;
    L_0x002c:
        r6 = r2.a();
        if (r6 == 0) goto L_0x004b;
    L_0x0032:
        r3 = r3.getContentResolver();	 Catch:{ FileNotFoundException -> 0x004b }
        r6 = r2.a();	 Catch:{ FileNotFoundException -> 0x004b }
        r3 = r3.openInputStream(r6);	 Catch:{ FileNotFoundException -> 0x004b }
        r6 = r2.a();	 Catch:{ FileNotFoundException -> 0x004b }
        r6 = r6.toString();	 Catch:{ FileNotFoundException -> 0x004b }
        r3 = android.graphics.drawable.Drawable.createFromStream(r3, r6);	 Catch:{ FileNotFoundException -> 0x004b }
        r0 = r3;
    L_0x004b:
        if (r0 == 0) goto L_0x005c;
    L_0x004d:
        if (r5 == 0) goto L_0x005c;
    L_0x004f:
        r3 = r2.a;
        if (r3 != 0) goto L_0x005c;
    L_0x0053:
        r0 = r0.mutate();
        r3 = android.graphics.PorterDuff.Mode.SRC_IN;
        r0.setColorFilter(r4, r3);
    L_0x005c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: adw.a(android.content.Context, int, boolean, int):android.graphics.drawable.Drawable");
    }

    public static void a(adw adw, ImageView imageView, int i, boolean z, int i2) {
        if (adw == null || imageView == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            return;
        }
        Drawable a = adw.a(adw, imageView.getContext(), i, z, i2);
        if (a != null) {
            imageView.setImageDrawable(a);
        } else if (adw.c() != null) {
            imageView.setImageBitmap(adw.c());
        } else {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
    }

    public final boolean a(ImageView imageView, String str) {
        if (a() == null) {
            Drawable b;
            if (b() != null) {
                b = b();
            } else if (c() != null) {
                imageView.setImageBitmap(c());
            } else if (d() != -1) {
                imageView.setImageResource(d());
            } else if (this.a != null) {
                b = new adf(imageView.getContext(), this.a).b();
            } else {
                imageView.setImageBitmap(null);
                return false;
            }
            imageView.setImageDrawable(b);
        } else if (!afo.a().a(imageView, a(), str)) {
            imageView.setImageURI(a());
        }
        return true;
    }
}
