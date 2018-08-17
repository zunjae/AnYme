package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.HttpConnection;

public final class bgu implements bcb {
    private static final Charset a = Charset.forName("UTF-8");
    private final bgw b;
    private volatile int c;

    public bgu() {
        this(bgw.a);
    }

    private bgu(bgw bgw) {
        this.c = bgv.a;
        this.b = bgw;
    }

    private static boolean a(bbx bbx) {
        String a = bbx.a(HttpConnection.CONTENT_ENCODING);
        return (a == null || a.equalsIgnoreCase("identity")) ? false : true;
    }

    private static boolean a(defpackage.bhd r8) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = 0;
        r7 = new bhd;	 Catch:{ EOFException -> 0x003f }
        r7.<init>();	 Catch:{ EOFException -> 0x003f }
        r1 = r8.b();	 Catch:{ EOFException -> 0x003f }
        r3 = 64;	 Catch:{ EOFException -> 0x003f }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ EOFException -> 0x003f }
        if (r5 >= 0) goto L_0x0016;	 Catch:{ EOFException -> 0x003f }
    L_0x0010:
        r1 = r8.b();	 Catch:{ EOFException -> 0x003f }
        r5 = r1;	 Catch:{ EOFException -> 0x003f }
        goto L_0x0017;	 Catch:{ EOFException -> 0x003f }
    L_0x0016:
        r5 = r3;	 Catch:{ EOFException -> 0x003f }
    L_0x0017:
        r3 = 0;	 Catch:{ EOFException -> 0x003f }
        r1 = r8;	 Catch:{ EOFException -> 0x003f }
        r2 = r7;	 Catch:{ EOFException -> 0x003f }
        r1.a(r2, r3, r5);	 Catch:{ EOFException -> 0x003f }
        r8 = 0;	 Catch:{ EOFException -> 0x003f }
    L_0x001f:
        r1 = 16;	 Catch:{ EOFException -> 0x003f }
        if (r8 >= r1) goto L_0x003d;	 Catch:{ EOFException -> 0x003f }
    L_0x0023:
        r1 = r7.e();	 Catch:{ EOFException -> 0x003f }
        if (r1 != 0) goto L_0x003d;	 Catch:{ EOFException -> 0x003f }
    L_0x0029:
        r1 = r7.q();	 Catch:{ EOFException -> 0x003f }
        r2 = java.lang.Character.isISOControl(r1);	 Catch:{ EOFException -> 0x003f }
        if (r2 == 0) goto L_0x003a;	 Catch:{ EOFException -> 0x003f }
    L_0x0033:
        r1 = java.lang.Character.isWhitespace(r1);	 Catch:{ EOFException -> 0x003f }
        if (r1 != 0) goto L_0x003a;
    L_0x0039:
        return r0;
    L_0x003a:
        r8 = r8 + 1;
        goto L_0x001f;
    L_0x003d:
        r8 = 1;
        return r8;
    L_0x003f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgu.a(bhd):boolean");
    }

    public final bgu a(int i) {
        if (i != 0) {
            this.c = i;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public final bcs intercept(bcc bcc) {
        bcc bcc2 = bcc;
        int i = this.c;
        bcn a = bcc.a();
        if (i == bgv.a) {
            return bcc2.a(a);
        }
        Object obj;
        bcp d;
        bbf b;
        Object a2;
        StringBuilder stringBuilder;
        String stringBuilder2;
        bgw bgw;
        StringBuilder stringBuilder3;
        bbx c;
        int a3;
        int i2;
        String a4;
        StringBuilder stringBuilder4;
        Charset charset;
        bcd a5;
        bgw bgw2;
        StringBuilder stringBuilder5;
        String str;
        long nanoTime;
        bcs a6;
        bcu g;
        long b2;
        String stringBuilder6;
        bbx f;
        int a7;
        int i3;
        bhd c2;
        Charset charset2;
        bcd a8;
        bgw bgw3;
        StringBuilder stringBuilder7;
        bgw bgw4;
        String str2;
        Object obj2 = 1;
        Object obj3 = i == bgv.d ? 1 : null;
        if (obj3 == null) {
            if (i != bgv.c) {
                obj = null;
                d = a.d();
                if (d != null) {
                    obj2 = null;
                }
                b = bcc.b();
                a2 = b == null ? b.a() : bck.HTTP_1_1;
                stringBuilder = new StringBuilder("--> ");
                stringBuilder.append(a.b());
                stringBuilder.append(' ');
                stringBuilder.append(a.a());
                stringBuilder.append(' ');
                stringBuilder.append(a2);
                stringBuilder2 = stringBuilder.toString();
                if (obj == null && obj2 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder2);
                    stringBuilder.append(" (");
                    stringBuilder.append(d.b());
                    stringBuilder.append("-byte body)");
                    stringBuilder2 = stringBuilder.toString();
                }
                r1.b.a(stringBuilder2);
                if (obj != null) {
                    if (obj2 != null) {
                        if (d.a() != null) {
                            bgw = r1.b;
                            stringBuilder3 = new StringBuilder("Content-Type: ");
                            stringBuilder3.append(d.a());
                            bgw.a(stringBuilder3.toString());
                        }
                        if (d.b() != -1) {
                            bgw = r1.b;
                            stringBuilder3 = new StringBuilder("Content-Length: ");
                            stringBuilder3.append(d.b());
                            bgw.a(stringBuilder3.toString());
                        }
                    }
                    c = a.c();
                    a3 = c.a();
                    for (i2 = 0; i2 < a3; i2++) {
                        a4 = c.a(i2);
                        if (!("Content-Type".equalsIgnoreCase(a4) || "Content-Length".equalsIgnoreCase(a4))) {
                            bgw bgw5 = r1.b;
                            stringBuilder4 = new StringBuilder();
                            stringBuilder4.append(a4);
                            stringBuilder4.append(": ");
                            stringBuilder4.append(c.b(i2));
                            bgw5.a(stringBuilder4.toString());
                        }
                    }
                    if (obj3 != null) {
                        if (obj2 == null) {
                            if (bgu.a(a.c())) {
                                bhd bhd;
                                bhd = new bhd();
                                d.a((bhg) bhd);
                                charset = a;
                                a5 = d.a();
                                if (a5 != null) {
                                    charset = a5.a(a);
                                }
                                r1.b.a(BuildConfig.FLAVOR);
                                if (bgu.a(bhd)) {
                                    bgw2 = r1.b;
                                    stringBuilder5 = new StringBuilder("--> END ");
                                    stringBuilder5.append(a.b());
                                    stringBuilder5.append(" (binary ");
                                    stringBuilder5.append(d.b());
                                    str = "-byte body omitted)";
                                } else {
                                    r1.b.a(bhd.a(charset));
                                    bgw2 = r1.b;
                                    stringBuilder5 = new StringBuilder("--> END ");
                                    stringBuilder5.append(a.b());
                                    stringBuilder5.append(" (");
                                    stringBuilder5.append(d.b());
                                    str = "-byte body)";
                                }
                            } else {
                                bgw2 = r1.b;
                                stringBuilder5 = new StringBuilder("--> END ");
                                stringBuilder5.append(a.b());
                                str = " (encoded body omitted)";
                            }
                            stringBuilder5.append(str);
                            bgw2.a(stringBuilder5.toString());
                        }
                    }
                    bgw2 = r1.b;
                    stringBuilder5 = new StringBuilder("--> END ");
                    str = a.b();
                    stringBuilder5.append(str);
                    bgw2.a(stringBuilder5.toString());
                }
                nanoTime = System.nanoTime();
                a6 = bcc2.a(a);
                nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                g = a6.g();
                b2 = g.b();
                if (b2 == -1) {
                    StringBuilder stringBuilder8 = new StringBuilder();
                    stringBuilder8.append(b2);
                    stringBuilder8.append("-byte");
                    str = stringBuilder8.toString();
                } else {
                    str = "unknown-length";
                }
                bgw bgw6 = r1.b;
                stringBuilder = new StringBuilder("<-- ");
                stringBuilder.append(a6.b());
                stringBuilder.append(' ');
                stringBuilder.append(a6.d());
                stringBuilder.append(' ');
                stringBuilder.append(a6.a().a());
                stringBuilder.append(" (");
                stringBuilder.append(nanoTime);
                stringBuilder.append("ms");
                if (obj != null) {
                    stringBuilder4 = new StringBuilder(", ");
                    stringBuilder4.append(str);
                    stringBuilder4.append(" body");
                    stringBuilder6 = stringBuilder4.toString();
                } else {
                    stringBuilder6 = BuildConfig.FLAVOR;
                }
                stringBuilder.append(stringBuilder6);
                stringBuilder.append(')');
                bgw6.a(stringBuilder.toString());
                if (obj != null) {
                    f = a6.f();
                    a7 = f.a();
                    for (i3 = 0; i3 < a7; i3++) {
                        bgw bgw7 = r1.b;
                        StringBuilder stringBuilder9 = new StringBuilder();
                        stringBuilder9.append(f.a(i3));
                        stringBuilder9.append(": ");
                        stringBuilder9.append(f.b(i3));
                        bgw7.a(stringBuilder9.toString());
                    }
                    if (obj3 != null) {
                        if (!bec.b(a6)) {
                            if (bgu.a(a6.f())) {
                                bhh c3 = g.c();
                                c3.b(Long.MAX_VALUE);
                                c2 = c3.c();
                                charset2 = a;
                                a8 = g.a();
                                if (a8 != null) {
                                    charset2 = a8.a(a);
                                }
                                if (bgu.a(c2)) {
                                    r1.b.a(BuildConfig.FLAVOR);
                                    bgw3 = r1.b;
                                    stringBuilder7 = new StringBuilder("<-- END HTTP (binary ");
                                    stringBuilder7.append(c2.b());
                                    stringBuilder7.append("-byte body omitted)");
                                    bgw3.a(stringBuilder7.toString());
                                    return a6;
                                }
                                if (b2 != 0) {
                                    r1.b.a(BuildConfig.FLAVOR);
                                    r1.b.a(c2.u().a(charset2));
                                }
                                bgw3 = r1.b;
                                stringBuilder7 = new StringBuilder("<-- END HTTP (");
                                stringBuilder7.append(c2.b());
                                stringBuilder7.append("-byte body)");
                                bgw3.a(stringBuilder7.toString());
                            } else {
                                bgw4 = r1.b;
                                str2 = "<-- END HTTP (encoded body omitted)";
                                bgw4.a(str2);
                            }
                        }
                    }
                    bgw4 = r1.b;
                    str2 = "<-- END HTTP";
                    bgw4.a(str2);
                }
                return a6;
            }
        }
        obj = 1;
        d = a.d();
        if (d != null) {
            obj2 = null;
        }
        b = bcc.b();
        if (b == null) {
        }
        stringBuilder = new StringBuilder("--> ");
        stringBuilder.append(a.b());
        stringBuilder.append(' ');
        stringBuilder.append(a.a());
        stringBuilder.append(' ');
        stringBuilder.append(a2);
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" (");
        stringBuilder.append(d.b());
        stringBuilder.append("-byte body)");
        stringBuilder2 = stringBuilder.toString();
        r1.b.a(stringBuilder2);
        if (obj != null) {
            if (obj2 != null) {
                if (d.a() != null) {
                    bgw = r1.b;
                    stringBuilder3 = new StringBuilder("Content-Type: ");
                    stringBuilder3.append(d.a());
                    bgw.a(stringBuilder3.toString());
                }
                if (d.b() != -1) {
                    bgw = r1.b;
                    stringBuilder3 = new StringBuilder("Content-Length: ");
                    stringBuilder3.append(d.b());
                    bgw.a(stringBuilder3.toString());
                }
            }
            c = a.c();
            a3 = c.a();
            for (i2 = 0; i2 < a3; i2++) {
                a4 = c.a(i2);
                bgw bgw52 = r1.b;
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(a4);
                stringBuilder4.append(": ");
                stringBuilder4.append(c.b(i2));
                bgw52.a(stringBuilder4.toString());
            }
            if (obj3 != null) {
                if (obj2 == null) {
                    if (bgu.a(a.c())) {
                        bhd = new bhd();
                        d.a((bhg) bhd);
                        charset = a;
                        a5 = d.a();
                        if (a5 != null) {
                            charset = a5.a(a);
                        }
                        r1.b.a(BuildConfig.FLAVOR);
                        if (bgu.a(bhd)) {
                            bgw2 = r1.b;
                            stringBuilder5 = new StringBuilder("--> END ");
                            stringBuilder5.append(a.b());
                            stringBuilder5.append(" (binary ");
                            stringBuilder5.append(d.b());
                            str = "-byte body omitted)";
                        } else {
                            r1.b.a(bhd.a(charset));
                            bgw2 = r1.b;
                            stringBuilder5 = new StringBuilder("--> END ");
                            stringBuilder5.append(a.b());
                            stringBuilder5.append(" (");
                            stringBuilder5.append(d.b());
                            str = "-byte body)";
                        }
                    } else {
                        bgw2 = r1.b;
                        stringBuilder5 = new StringBuilder("--> END ");
                        stringBuilder5.append(a.b());
                        str = " (encoded body omitted)";
                    }
                    stringBuilder5.append(str);
                    bgw2.a(stringBuilder5.toString());
                }
            }
            bgw2 = r1.b;
            stringBuilder5 = new StringBuilder("--> END ");
            str = a.b();
            stringBuilder5.append(str);
            bgw2.a(stringBuilder5.toString());
        }
        nanoTime = System.nanoTime();
        try {
            a6 = bcc2.a(a);
            nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            g = a6.g();
            b2 = g.b();
            if (b2 == -1) {
                str = "unknown-length";
            } else {
                StringBuilder stringBuilder82 = new StringBuilder();
                stringBuilder82.append(b2);
                stringBuilder82.append("-byte");
                str = stringBuilder82.toString();
            }
            bgw bgw62 = r1.b;
            stringBuilder = new StringBuilder("<-- ");
            stringBuilder.append(a6.b());
            stringBuilder.append(' ');
            stringBuilder.append(a6.d());
            stringBuilder.append(' ');
            stringBuilder.append(a6.a().a());
            stringBuilder.append(" (");
            stringBuilder.append(nanoTime);
            stringBuilder.append("ms");
            if (obj != null) {
                stringBuilder6 = BuildConfig.FLAVOR;
            } else {
                stringBuilder4 = new StringBuilder(", ");
                stringBuilder4.append(str);
                stringBuilder4.append(" body");
                stringBuilder6 = stringBuilder4.toString();
            }
            stringBuilder.append(stringBuilder6);
            stringBuilder.append(')');
            bgw62.a(stringBuilder.toString());
            if (obj != null) {
                f = a6.f();
                a7 = f.a();
                for (i3 = 0; i3 < a7; i3++) {
                    bgw bgw72 = r1.b;
                    StringBuilder stringBuilder92 = new StringBuilder();
                    stringBuilder92.append(f.a(i3));
                    stringBuilder92.append(": ");
                    stringBuilder92.append(f.b(i3));
                    bgw72.a(stringBuilder92.toString());
                }
                if (obj3 != null) {
                    if (!bec.b(a6)) {
                        if (bgu.a(a6.f())) {
                            bhh c32 = g.c();
                            c32.b(Long.MAX_VALUE);
                            c2 = c32.c();
                            charset2 = a;
                            a8 = g.a();
                            if (a8 != null) {
                                charset2 = a8.a(a);
                            }
                            if (bgu.a(c2)) {
                                if (b2 != 0) {
                                    r1.b.a(BuildConfig.FLAVOR);
                                    r1.b.a(c2.u().a(charset2));
                                }
                                bgw3 = r1.b;
                                stringBuilder7 = new StringBuilder("<-- END HTTP (");
                                stringBuilder7.append(c2.b());
                                stringBuilder7.append("-byte body)");
                                bgw3.a(stringBuilder7.toString());
                            } else {
                                r1.b.a(BuildConfig.FLAVOR);
                                bgw3 = r1.b;
                                stringBuilder7 = new StringBuilder("<-- END HTTP (binary ");
                                stringBuilder7.append(c2.b());
                                stringBuilder7.append("-byte body omitted)");
                                bgw3.a(stringBuilder7.toString());
                                return a6;
                            }
                        }
                        bgw4 = r1.b;
                        str2 = "<-- END HTTP (encoded body omitted)";
                        bgw4.a(str2);
                    }
                }
                bgw4 = r1.b;
                str2 = "<-- END HTTP";
                bgw4.a(str2);
            }
            return a6;
        } catch (Exception e) {
            Exception exception = e;
            r1.b.a("<-- HTTP FAILED: ".concat(String.valueOf(exception)));
            throw exception;
        }
    }
}
