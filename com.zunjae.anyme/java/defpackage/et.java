package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public abstract class et<T> implements en<T> {
    private final Uri a;
    private final Context b;
    private T c;

    public et(Context context, Uri uri) {
        this.b = context.getApplicationContext();
        this.a = uri;
    }

    public final T a(int i) {
        this.c = a(this.a, this.b.getContentResolver());
        return this.c;
    }

    protected abstract T a(Uri uri, ContentResolver contentResolver);

    public final void a() {
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
        r1 = this;
        r0 = r1.c;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r1.a(r0);	 Catch:{ IOException -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: et.a():void");
    }

    protected abstract void a(T t);

    public final String b() {
        return this.a.toString();
    }

    public final void c() {
    }
}
