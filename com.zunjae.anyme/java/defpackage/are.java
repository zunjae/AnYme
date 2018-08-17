package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import mehdi.sakout.fancybuttons.R;

public class are implements Parcelable, Cloneable {
    public static final Creator<are> CREATOR = new arf();
    public static int a = 0;
    public static int b = 1;
    public static int c = 2;
    private arq A;
    public int d = a;
    private final String e = are.class.getName();
    private long f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int k;
    private String l;
    private String m;
    private String n;
    private int o;
    private String p;
    private String q;
    private int r;
    private int s;
    private int t;
    private long u;
    private String v;
    private int w;
    private boolean x;
    private String y;
    private asr z;

    protected are(Parcel parcel) {
        this.f = parcel.readLong();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readLong();
        this.v = parcel.readString();
        this.w = parcel.readInt();
        this.x = parcel.readByte() != (byte) 0;
        this.y = parcel.readString();
    }

    private String O() {
        if (this.j == 0) {
            return "?";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.j);
        return stringBuilder.toString();
    }

    private String P() {
        return bit.b(this.q) ? BuildConfig.FLAVOR : this.q;
    }

    private static /* synthetic */ int a(defpackage.are r3, defpackage.are r4) {
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
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = r3.z;	 Catch:{ Exception -> 0x0018 }
        if (r1 == 0) goto L_0x0018;	 Catch:{ Exception -> 0x0018 }
    L_0x0007:
        r3 = r3.z;	 Catch:{ Exception -> 0x0018 }
        r3 = r3.c;	 Catch:{ Exception -> 0x0018 }
        r1 = "-";	 Catch:{ Exception -> 0x0018 }
        r2 = "";	 Catch:{ Exception -> 0x0018 }
        r3 = r3.replace(r1, r2);	 Catch:{ Exception -> 0x0018 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x0018 }
        goto L_0x001b;
    L_0x0018:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x001b:
        r1 = r4.z;	 Catch:{ Exception -> 0x0030 }
        if (r1 == 0) goto L_0x0030;	 Catch:{ Exception -> 0x0030 }
    L_0x001f:
        r4 = r4.z;	 Catch:{ Exception -> 0x0030 }
        r4 = r4.c;	 Catch:{ Exception -> 0x0030 }
        r1 = "-";	 Catch:{ Exception -> 0x0030 }
        r2 = "";	 Catch:{ Exception -> 0x0030 }
        r4 = r4.replace(r1, r2);	 Catch:{ Exception -> 0x0030 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ Exception -> 0x0030 }
        r0 = r4;
    L_0x0030:
        r0 = r0 - r3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: are.a(are, are):int");
    }

    public static are a(long j, String str, String str2) {
        are are = new are();
        are.f = j;
        are.g = str;
        if (str2 != null) {
            are.n = str2;
        }
        are.w = 6;
        are.k = -1;
        are.u = (long) ((int) (System.currentTimeMillis() / 1000));
        return are;
    }

    public static void a(List<are> list) {
        if (list != null) {
            Comparator comparator;
            switch (ast.a()) {
                case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                    comparator = -$$Lambda$are$r-toQWVph_ZxncDOV6oYfMVMFDo.INSTANCE;
                    break;
                case tw.a /*1*/:
                    comparator = -$$Lambda$are$N_I9dlwtGadCnepjMNaAzCZhwlk.INSTANCE;
                    break;
                case tw.b /*2*/:
                    comparator = -$$Lambda$are$IiMdHZY0uXcaYdKB86NrJhbd4bY.INSTANCE;
                    break;
                case f.c /*3*/:
                    comparator = -$$Lambda$are$jqbDamNoBoq89Z30z57aI0lfCwU.INSTANCE;
                    break;
                case mh.d /*4*/:
                    comparator = -$$Lambda$are$fsfUfeCg9A_lHzw9UZoxdWFGRrI.INSTANCE;
                    break;
                case mh.e /*5*/:
                    comparator = -$$Lambda$are$XXVDdKHyn2t_JzdOW0ZmekyLpXk.INSTANCE;
                    break;
                case mh.f /*6*/:
                    comparator = -$$Lambda$are$CLgsqHuqzGbTc5D8WMi8g92iZSg.INSTANCE;
                    break;
                case mh.g /*7*/:
                    comparator = -$$Lambda$are$qwMUEj2y3A0GQGdIjFlzy639P_8.INSTANCE;
                    break;
                case mh.h /*8*/:
                    comparator = -$$Lambda$are$pXy342BoOK0v2Sr6FdF9eChFlNE.INSTANCE;
                    break;
                case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                    comparator = -$$Lambda$are$6ncmrGuFR9bNVm3Kbvzqm5tQae4.INSTANCE;
                    break;
                case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                    comparator = -$$Lambda$are$npwbC9sTCH-qs0ew8rbGzlmzf44.INSTANCE;
                    break;
                case R.styleable.FancyButtonsAttrs_fb_fontIconResource /*11*/:
                    comparator = -$$Lambda$are$0SybjZi7mZmZPWVip1c5u9BXMfw.INSTANCE;
                    break;
                case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
                    comparator = -$$Lambda$are$vADqlPSFCiI1n7AyCphvtOPbDhI.INSTANCE;
                    break;
                case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                    comparator = -$$Lambda$are$mYTwZ9HefYbw7nFQY5dzZdNwQF8.INSTANCE;
                    break;
                default:
                    return;
            }
            Collections.sort(list, comparator);
        }
    }

    private static /* synthetic */ int b(defpackage.are r3, defpackage.are r4) {
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
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1 = r3.z;	 Catch:{ Exception -> 0x0017 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ Exception -> 0x0017 }
    L_0x0006:
        r3 = r3.z;	 Catch:{ Exception -> 0x0017 }
        r3 = r3.c;	 Catch:{ Exception -> 0x0017 }
        r1 = "-";	 Catch:{ Exception -> 0x0017 }
        r2 = "";	 Catch:{ Exception -> 0x0017 }
        r3 = r3.replace(r1, r2);	 Catch:{ Exception -> 0x0017 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x0017 }
        goto L_0x0019;
    L_0x0017:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0019:
        r1 = r4.z;	 Catch:{ Exception -> 0x002e }
        if (r1 == 0) goto L_0x002e;	 Catch:{ Exception -> 0x002e }
    L_0x001d:
        r4 = r4.z;	 Catch:{ Exception -> 0x002e }
        r4 = r4.c;	 Catch:{ Exception -> 0x002e }
        r1 = "-";	 Catch:{ Exception -> 0x002e }
        r2 = "";	 Catch:{ Exception -> 0x002e }
        r4 = r4.replace(r1, r2);	 Catch:{ Exception -> 0x002e }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ Exception -> 0x002e }
        r0 = r4;
    L_0x002e:
        r3 = r3 - r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: are.b(are, are):int");
    }

    private static /* synthetic */ int c(are are, are are2) {
        arq arq = are.A;
        long j = -2147483648L;
        long j2 = arq != null ? arq.b : -2147483648L;
        arq = are2.A;
        if (arq != null) {
            j = arq.b;
        }
        return (int) (j - j2);
    }

    private static /* synthetic */ int d(are are, are are2) {
        arq arq = are.A;
        long j = 2147483647L;
        long j2 = arq != null ? arq.b : 2147483647L;
        arq = are2.A;
        if (arq != null) {
            j = arq.b;
        }
        return (int) (j2 - j);
    }

    public static String i(int i) {
        if (i == 6) {
            return "Planned";
        }
        switch (i) {
            case tw.a /*1*/:
                return "Watching";
            case tw.b /*2*/:
                return "Completed";
            case f.c /*3*/:
                return "On Hold";
            case mh.d /*4*/:
                return "Dropped";
            default:
                return "Unknown";
        }
    }

    public final boolean A() {
        return this.x;
    }

    public final boolean B() {
        if (bit.b(P())) {
            return false;
        }
        if (!P().equals("0000-00-00")) {
            if (!bit.b(P())) {
                return false;
            }
        }
        return true;
    }

    public final int C() {
        return (int) TimeUnit.SECONDS.toDays((System.currentTimeMillis() / 1000) - this.u);
    }

    public final String D() {
        return are.i(this.w);
    }

    public final String E() {
        String trim = this.g.toLowerCase().replaceAll("\\(.*?\\) ?", BuildConfig.FLAVOR).replace("the movie", BuildConfig.FLAVOR).replace("movie", BuildConfig.FLAVOR).replace("special", BuildConfig.FLAVOR).replace("2nd", BuildConfig.FLAVOR).replace("-", " ").replaceAll("edition", BuildConfig.FLAVOR).replace("season", BuildConfig.FLAVOR).replace("3rd", BuildConfig.FLAVOR).replace(" ii", BuildConfig.FLAVOR).replaceAll("[0-9]", BuildConfig.FLAVOR).replaceAll("!", BuildConfig.FLAVOR).replaceAll(" ova", BuildConfig.FLAVOR).replaceAll(" ", "+").trim();
        return trim.contains(": ") ? trim.split(":")[0] : trim;
    }

    public final void F() {
        this.x = true;
    }

    public final void G() {
        int y = y();
        int i = this.j;
        if (y != i || i <= 0) {
            if (f()) {
                this.s = this.t + 1;
            } else {
                this.o++;
            }
            y = this.w;
            if (y == 6 || y == 3) {
                this.w = 1;
            }
            if (I()) {
                H();
            }
        }
    }

    public final void H() {
        this.w = 2;
        this.o = this.j;
        this.s = 0;
    }

    public final boolean I() {
        return this.j > 0 && this.k == 2 && y() == this.j;
    }

    public final String J() {
        return this.g.replaceAll("[^0-9A-Za-z. :()-]", BuildConfig.FLAVOR);
    }

    public final boolean K() {
        int y = y();
        int i = this.j;
        if (y >= i) {
            if (i != 0 || this.k != 1) {
                return false;
            }
        }
        return true;
    }

    public final arn L() {
        return new arn(this.f, this.g, this.n);
    }

    public final defpackage.are M() {
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
        r1 = this;
        r0 = super.clone();	 Catch:{ Exception -> 0x0007 }
        r0 = (defpackage.are) r0;	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: are.M():are");
    }

    public final arj N() {
        arj arj = new arj();
        arj.c = this.j;
        arj.b = y();
        boolean z = true;
        if (this.s != 1) {
            z = false;
        }
        arj.a = z;
        return arj;
    }

    public final int a(java.text.SimpleDateFormat r6) {
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
        r5 = this;
        r0 = r5.l;
        r1 = defpackage.bit.c(r0);
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x0009:
        r6 = r6.parse(r0);	 Catch:{ ParseException -> 0x002c }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ ParseException -> 0x002c }
        r3 = r6.getTime();	 Catch:{ ParseException -> 0x002c }
        r6 = 0;
        r0 = r0 - r3;
        r0 = (double) r0;
        r3 = 4738356638484791296; // 0x41c2064200000000 float:0.0 double:6.048E8;
        java.lang.Double.isNaN(r0);
        r0 = r0 / r3;
        r0 = java.lang.Math.ceil(r0);	 Catch:{ ParseException -> 0x002c }
        r6 = (int) r0;	 Catch:{ ParseException -> 0x002c }
        r0 = r5.j;	 Catch:{ ParseException -> 0x002c }
        if (r6 <= r0) goto L_0x002b;
    L_0x002a:
        return r2;
    L_0x002b:
        return r6;
    L_0x002c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: are.a(java.text.SimpleDateFormat):int");
    }

    public final asr a() {
        return this.z;
    }

    public final void a(int i) {
        this.i = i;
    }

    public final void a(long j) {
        this.f = j;
    }

    public final void a(arq arq) {
        this.A = arq;
    }

    public final void a(asr asr) {
        this.z = asr;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final arq b() {
        return this.A;
    }

    @SuppressLint({"DefaultLocale"})
    public final String b(arq arq) {
        if (f()) {
            return String.format("%d/%d", new Object[]{Integer.valueOf(this.t), Integer.valueOf(this.j)});
        } else if (arq != null) {
            return String.format("%d/%d/%s", new Object[]{Integer.valueOf(this.o), Integer.valueOf(arq.c - 1), O()});
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.o);
            stringBuilder.append("/");
            stringBuilder.append(O());
            return stringBuilder.toString();
        }
    }

    public final void b(int i) {
        this.j = i;
    }

    public final void b(long j) {
        this.u = j;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final long c() {
        return this.f;
    }

    public final void c(int i) {
        this.k = i;
    }

    public final void c(String str) {
        this.l = str;
    }

    public /* synthetic */ Object clone() {
        return M();
    }

    public final int d() {
        return (int) this.f;
    }

    public final void d(int i) {
        this.o = i;
    }

    public final void d(String str) {
        this.m = str;
    }

    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.s;
    }

    public final void e(int i) {
        this.r = i;
    }

    public final void e(String str) {
        this.n = str;
    }

    public final void f(int i) {
        this.s = i;
    }

    public final void f(String str) {
        this.p = str;
    }

    public final boolean f() {
        return this.s == 1;
    }

    public final String g() {
        return this.g;
    }

    public final void g(int i) {
        this.t = i;
    }

    public final void g(String str) {
        this.q = str;
    }

    public final String h() {
        return bit.b(this.h) ? BuildConfig.FLAVOR : this.h;
    }

    public final void h(int i) {
        this.w = i;
    }

    public final void h(String str) {
        this.v = str;
    }

    public final int i() {
        return this.i;
    }

    public final boolean i(String str) {
        Object obj;
        String toLowerCase = this.g.toLowerCase();
        String toLowerCase2 = h().toLowerCase();
        boolean contains = toLowerCase.contains(str);
        boolean contains2 = toLowerCase2.contains(str);
        boolean contains3 = toLowerCase.contains(str.replaceAll("[^A-Za-z]+", BuildConfig.FLAVOR));
        asr asr = this.z;
        if (asr != null) {
            String str2 = asr.i;
            if (str2 == null || !str2.toLowerCase().contains(str)) {
                str2 = asr.h;
                if (str2 == null || !str2.toLowerCase().contains(str)) {
                    String str3 = asr.j;
                    if (str3 == null || !str3.toLowerCase().contains(str)) {
                        obj = null;
                        if (obj != null) {
                            obj = 1;
                            if (!(contains2 || contains || contains3)) {
                                if (obj == null) {
                                }
                            }
                        }
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                obj = 1;
                return obj == null;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final int j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.n;
    }

    public final int o() {
        return this.o;
    }

    public final String p() {
        return this.p;
    }

    public final String q() {
        return this.q;
    }

    public final int r() {
        return this.r;
    }

    public final int s() {
        return this.t;
    }

    public final long t() {
        return this.u;
    }

    public final String u() {
        String str = this.v;
        return str != null ? str : BuildConfig.FLAVOR;
    }

    public final int v() {
        return this.w;
    }

    public final boolean w() {
        return ((this.k == 1 ? 1 : null) == null || !bit.c(this.l) || (this.j <= 26 ? 1 : null) == null) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeLong(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeByte(this.x);
        parcel.writeString(this.y);
    }

    public final String x() {
        return String.format("https://www.myanimelist.net/anime/%d/%s", new Object[]{Integer.valueOf((int) this.f), this.g});
    }

    public final int y() {
        return f() ? this.t : this.o;
    }

    public final double z() {
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
        r7 = this;
        r0 = r7.y();
        r1 = 0;
        if (r0 == 0) goto L_0x002e;
    L_0x0008:
        r0 = r7.j;
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x002e;
    L_0x000d:
        r0 = r7.y();	 Catch:{ Exception -> 0x002e }
        r3 = (double) r0;	 Catch:{ Exception -> 0x002e }
        r0 = r7.j;	 Catch:{ Exception -> 0x002e }
        r5 = (double) r0;
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r5);
        r3 = r3 / r5;
        r5 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r3 = r3 * r5;
        r5 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r3 = r3 * r5;
        r3 = java.lang.Math.round(r3);	 Catch:{ Exception -> 0x002e }
        r0 = (double) r3;
        java.lang.Double.isNaN(r0);
        r0 = r0 / r5;
        return r0;
    L_0x002e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: are.z():double");
    }
}
