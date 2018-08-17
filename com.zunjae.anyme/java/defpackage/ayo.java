package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class ayo<T> {
    protected final Context a;
    protected final ayn<T> b;
    protected final awo c;
    protected final ayr d;
    protected volatile long e;
    protected final List<ays> f = new CopyOnWriteArrayList();
    private final int g;

    public ayo(Context context, ayn<T> ayn_T, awo awo, ayr ayr) {
        this.a = context.getApplicationContext();
        this.b = ayn_T;
        this.d = ayr;
        this.c = awo;
        this.e = this.c.a();
        this.g = 100;
    }

    private static long a(java.lang.String r5) {
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
        r0 = "_";
        r5 = r5.split(r0);
        r0 = r5.length;
        r1 = 0;
        r3 = 3;
        if (r0 == r3) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = 2;
        r5 = r5[r0];	 Catch:{ NumberFormatException -> 0x0019 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ NumberFormatException -> 0x0019 }
        r3 = r5.longValue();	 Catch:{ NumberFormatException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayo.a(java.lang.String):long");
    }

    private void h() {
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
        r0 = r2.f;
        r0 = r0.iterator();
    L_0x0006:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x001c;
    L_0x000c:
        r1 = r0.next();
        r1 = (defpackage.ays) r1;
        r1.b();	 Catch:{ Exception -> 0x0016 }
        goto L_0x0006;
    L_0x0016:
        r1 = r2.a;
        defpackage.awj.f(r1);
        goto L_0x0006;
    L_0x001c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayo.h():void");
    }

    protected abstract String a();

    public final void a(ays ays) {
        if (ays != null) {
            this.f.add(ays);
        }
    }

    public final void a(T t) {
        byte[] a = this.b.a(t);
        if (!this.d.a(a.length, c())) {
            awj.a(this.a, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.d.a()), Integer.valueOf(a.length), Integer.valueOf(c())}));
            d();
        }
        this.d.a(a);
    }

    public final void a(List<File> list) {
        this.d.a((List) list);
    }

    protected int b() {
        return this.g;
    }

    protected int c() {
        return 8000;
    }

    public final boolean d() {
        boolean z = true;
        if (this.d.b()) {
            z = false;
        } else {
            this.d.a(a());
            awj.a(this.a, String.format(Locale.US, "generated new file %s", new Object[]{r0}));
            this.e = this.c.a();
        }
        h();
        return z;
    }

    public final List<File> e() {
        return this.d.c();
    }

    public final void f() {
        ayr ayr = this.d;
        ayr.a(ayr.d());
        this.d.e();
    }

    public final void g() {
        List<File> d = this.d.d();
        int b = b();
        if (d.size() > b) {
            int size = d.size() - b;
            Context context = this.a;
            String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(d.size()), Integer.valueOf(b), Integer.valueOf(size)});
            awj.e(context);
            TreeSet treeSet = new TreeSet(new ayp(this));
            for (File file : d) {
                treeSet.add(new ayq(file, ayo.a(file.getName())));
            }
            List d2 = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                d2.add(((ayq) it.next()).a);
                if (d2.size() == size) {
                    break;
                }
            }
            this.d.a(d2);
        }
    }
}
