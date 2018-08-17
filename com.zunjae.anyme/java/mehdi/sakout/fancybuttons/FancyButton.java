package mehdi.sakout.fancybuttons;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public class FancyButton extends LinearLayout {
    public static final String a = "FancyButton";
    private int A = 0;
    private int B = 0;
    private boolean C = true;
    private boolean D = false;
    private Typeface E = null;
    private Typeface F = null;
    private String G = "fontawesome.ttf";
    private String H = "robotoregular.ttf";
    private ImageView I;
    private TextView J;
    private TextView K;
    private boolean L = false;
    private boolean M = false;
    private boolean N = true;
    private Context b;
    private int c = -16777216;
    private int d = 0;
    private int e = Color.parseColor("#f6f7f9");
    private int f = Color.parseColor("#bec2c9");
    private int g = Color.parseColor("#dddfe2");
    private int h = -1;
    private int i = -1;
    private int j = 1;
    private int k = b.b(getContext(), 15.0f);
    private int l = 17;
    private String m = null;
    private Drawable n = null;
    private int o = b.b(getContext(), 15.0f);
    private String p = null;
    private int q = 1;
    private int r = 10;
    private int s = 10;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;

    public FancyButton(Context context) {
        super(context);
        this.b = context;
        this.E = b.a(this.b, this.H, null);
        this.F = b.a(this.b, this.G, null);
        a();
    }

    public FancyButton(android.content.Context r6, android.util.AttributeSet r7) {
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
        r5.<init>(r6, r7);
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r5.c = r0;
        r0 = 0;
        r5.d = r0;
        r1 = "#f6f7f9";
        r1 = android.graphics.Color.parseColor(r1);
        r5.e = r1;
        r1 = "#bec2c9";
        r1 = android.graphics.Color.parseColor(r1);
        r5.f = r1;
        r1 = "#dddfe2";
        r1 = android.graphics.Color.parseColor(r1);
        r5.g = r1;
        r1 = -1;
        r5.h = r1;
        r5.i = r1;
        r1 = 1;
        r5.j = r1;
        r2 = r5.getContext();
        r3 = 1097859072; // 0x41700000 float:15.0 double:5.424144515E-315;
        r2 = mehdi.sakout.fancybuttons.b.b(r2, r3);
        r5.k = r2;
        r2 = 17;
        r5.l = r2;
        r2 = 0;
        r5.m = r2;
        r5.n = r2;
        r4 = r5.getContext();
        r3 = mehdi.sakout.fancybuttons.b.b(r4, r3);
        r5.o = r3;
        r5.p = r2;
        r5.q = r1;
        r3 = 10;
        r5.r = r3;
        r5.s = r3;
        r5.t = r0;
        r5.u = r0;
        r5.v = r0;
        r5.w = r0;
        r5.x = r0;
        r5.y = r0;
        r5.z = r0;
        r5.A = r0;
        r5.B = r0;
        r5.C = r1;
        r5.D = r0;
        r5.E = r2;
        r5.F = r2;
        r3 = "fontawesome.ttf";
        r5.G = r3;
        r3 = "robotoregular.ttf";
        r5.H = r3;
        r5.L = r0;
        r5.M = r0;
        r5.N = r1;
        r5.b = r6;
        r3 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs;
        r6 = r6.obtainStyledAttributes(r7, r3, r0, r0);
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_defaultColor;
        r3 = r5.c;
        r7 = r6.getColor(r7, r3);
        r5.c = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_focusColor;
        r3 = r5.d;
        r7 = r6.getColor(r7, r3);
        r5.d = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_disabledColor;
        r3 = r5.e;
        r7 = r6.getColor(r7, r3);
        r5.e = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_enabled;
        r7 = r6.getBoolean(r7, r1);
        r5.C = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_disabledTextColor;
        r1 = r5.f;
        r7 = r6.getColor(r7, r1);
        r5.f = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_disabledBorderColor;
        r1 = r5.g;
        r7 = r6.getColor(r7, r1);
        r5.g = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_textColor;
        r1 = r5.h;
        r7 = r6.getColor(r7, r1);
        r5.h = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconColor;
        r1 = r5.h;
        r7 = r6.getColor(r7, r1);
        r5.i = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_textSize;
        r1 = r5.k;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.k = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_textSize;
        r1 = r5.k;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.k = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_textGravity;
        r1 = r5.l;
        r7 = r6.getInt(r7, r1);
        r5.l = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_borderColor;
        r1 = r5.v;
        r7 = r6.getColor(r7, r1);
        r5.v = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_borderWidth;
        r1 = r5.w;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.w = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_radius;
        r1 = r5.x;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.x = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_radiusTopLeft;
        r1 = r5.x;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.y = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_radiusTopRight;
        r1 = r5.x;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.z = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_radiusBottomLeft;
        r1 = r5.x;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.A = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_radiusBottomRight;
        r1 = r5.x;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.B = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_fontIconSize;
        r1 = r5.o;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.o = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconPaddingLeft;
        r1 = r5.r;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.r = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconPaddingRight;
        r1 = r5.s;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.s = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconPaddingTop;
        r1 = r5.t;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.t = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconPaddingBottom;
        r1 = r5.u;
        r1 = (float) r1;
        r7 = r6.getDimension(r7, r1);
        r7 = (int) r7;
        r5.u = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_textAllCaps;
        r7 = r6.getBoolean(r7, r0);
        r5.D = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_textAllCaps;
        r7 = r6.getBoolean(r7, r0);
        r5.D = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_ghost;
        r0 = r5.L;
        r7 = r6.getBoolean(r7, r0);
        r5.L = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_useSystemFont;
        r0 = r5.M;
        r7 = r6.getBoolean(r7, r0);
        r5.M = r7;
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_text;
        r7 = r6.getString(r7);
        if (r7 != 0) goto L_0x01b3;
    L_0x01ad:
        r7 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_android_text;
        r7 = r6.getString(r7);
    L_0x01b3:
        r0 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconPosition;
        r1 = r5.q;
        r0 = r6.getInt(r0, r1);
        r5.q = r0;
        r0 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_fontIconResource;
        r0 = r6.getString(r0);
        r1 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconFont;
        r1 = r6.getString(r1);
        r3 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_textFont;
        r3 = r6.getString(r3);
        r4 = mehdi.sakout.fancybuttons.R.styleable.FancyButtonsAttrs_fb_iconResource;	 Catch:{ Exception -> 0x01d8 }
        r4 = r6.getDrawable(r4);	 Catch:{ Exception -> 0x01d8 }
        r5.n = r4;	 Catch:{ Exception -> 0x01d8 }
        goto L_0x01da;
    L_0x01d8:
        r5.n = r2;
    L_0x01da:
        if (r0 == 0) goto L_0x01de;
    L_0x01dc:
        r5.p = r0;
    L_0x01de:
        if (r7 == 0) goto L_0x01ea;
    L_0x01e0:
        r0 = r5.D;
        if (r0 == 0) goto L_0x01e8;
    L_0x01e4:
        r7 = r7.toUpperCase();
    L_0x01e8:
        r5.m = r7;
    L_0x01ea:
        r7 = r5.isInEditMode();
        if (r7 != 0) goto L_0x021c;
    L_0x01f0:
        if (r1 == 0) goto L_0x01fd;
    L_0x01f2:
        r7 = r5.b;
        r0 = r5.G;
        r7 = mehdi.sakout.fancybuttons.b.a(r7, r1, r0);
    L_0x01fa:
        r5.F = r7;
        goto L_0x0206;
    L_0x01fd:
        r7 = r5.b;
        r0 = r5.G;
        r7 = mehdi.sakout.fancybuttons.b.a(r7, r0, r2);
        goto L_0x01fa;
    L_0x0206:
        if (r3 == 0) goto L_0x0213;
    L_0x0208:
        r7 = r5.b;
        r0 = r5.H;
        r7 = mehdi.sakout.fancybuttons.b.a(r7, r3, r0);
    L_0x0210:
        r5.E = r7;
        goto L_0x021c;
    L_0x0213:
        r7 = r5.b;
        r0 = r5.H;
        r7 = mehdi.sakout.fancybuttons.b.a(r7, r0, r2);
        goto L_0x0210;
    L_0x021c:
        r6.recycle();
        r5.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mehdi.sakout.fancybuttons.FancyButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @TargetApi(21)
    private Drawable a(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        return !this.C ? drawable3 : new RippleDrawable(ColorStateList.valueOf(this.d), drawable, drawable2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r12 = this;
        r0 = r12.q;
        r1 = 4;
        r2 = 1;
        r3 = 3;
        if (r0 == r3) goto L_0x000f;
    L_0x0007:
        if (r0 != r1) goto L_0x000a;
    L_0x0009:
        goto L_0x000f;
    L_0x000a:
        r0 = 0;
        r12.setOrientation(r0);
        goto L_0x0012;
    L_0x000f:
        r12.setOrientation(r2);
    L_0x0012:
        r0 = r12.getLayoutParams();
        r4 = -2;
        if (r0 != 0) goto L_0x0021;
    L_0x0019:
        r0 = new android.widget.LinearLayout$LayoutParams;
        r0.<init>(r4, r4);
        r12.setLayoutParams(r0);
    L_0x0021:
        r0 = 17;
        r12.setGravity(r0);
        r12.setClickable(r2);
        r12.setFocusable(r2);
        r5 = r12.n;
        if (r5 != 0) goto L_0x0051;
    L_0x0030:
        r5 = r12.p;
        if (r5 != 0) goto L_0x0051;
    L_0x0034:
        r5 = r12.getPaddingLeft();
        if (r5 != 0) goto L_0x0051;
    L_0x003a:
        r5 = r12.getPaddingRight();
        if (r5 != 0) goto L_0x0051;
    L_0x0040:
        r5 = r12.getPaddingTop();
        if (r5 != 0) goto L_0x0051;
    L_0x0046:
        r5 = r12.getPaddingBottom();
        if (r5 != 0) goto L_0x0051;
    L_0x004c:
        r5 = 20;
        r12.setPadding(r5, r5, r5, r5);
    L_0x0051:
        r5 = r12.m;
        if (r5 != 0) goto L_0x0059;
    L_0x0055:
        r5 = "Fancy Button";
        r12.m = r5;
    L_0x0059:
        r5 = new android.widget.TextView;
        r6 = r12.b;
        r5.<init>(r6);
        r6 = r12.m;
        r5.setText(r6);
        r6 = r12.l;
        r5.setGravity(r6);
        r6 = r12.C;
        if (r6 == 0) goto L_0x0071;
    L_0x006e:
        r6 = r12.h;
        goto L_0x0073;
    L_0x0071:
        r6 = r12.f;
    L_0x0073:
        r5.setTextColor(r6);
        r6 = r12.getContext();
        r7 = r12.k;
        r7 = (float) r7;
        r6 = mehdi.sakout.fancybuttons.b.a(r6, r7);
        r6 = (float) r6;
        r5.setTextSize(r6);
        r6 = new android.widget.LinearLayout$LayoutParams;
        r6.<init>(r4, r4);
        r5.setLayoutParams(r6);
        r6 = r12.isInEditMode();
        if (r6 != 0) goto L_0x009c;
    L_0x0093:
        r6 = r12.M;
        if (r6 != 0) goto L_0x009c;
    L_0x0097:
        r6 = r12.E;
        r5.setTypeface(r6);
    L_0x009c:
        r12.K = r5;
        r5 = r12.n;
        r6 = 0;
        r7 = 16;
        if (r5 == 0) goto L_0x00e1;
    L_0x00a5:
        r5 = new android.widget.ImageView;
        r8 = r12.b;
        r5.<init>(r8);
        r8 = r12.n;
        r5.setImageDrawable(r8);
        r8 = r12.r;
        r9 = r12.t;
        r10 = r12.s;
        r11 = r12.u;
        r5.setPadding(r8, r9, r10, r11);
        r8 = new android.widget.LinearLayout$LayoutParams;
        r8.<init>(r4, r4);
        r9 = r12.K;
        if (r9 == 0) goto L_0x00db;
    L_0x00c5:
        r9 = r12.q;
        if (r9 == r3) goto L_0x00d2;
    L_0x00c9:
        if (r9 != r1) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00d2;
    L_0x00cc:
        r9 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        r8.gravity = r9;
        goto L_0x00d4;
    L_0x00d2:
        r8.gravity = r0;
    L_0x00d4:
        r9 = 10;
        r8.rightMargin = r9;
        r8.leftMargin = r9;
        goto L_0x00dd;
    L_0x00db:
        r8.gravity = r7;
    L_0x00dd:
        r5.setLayoutParams(r8);
        goto L_0x00e2;
    L_0x00e1:
        r5 = r6;
    L_0x00e2:
        r12.I = r5;
        r5 = r12.p;
        if (r5 == 0) goto L_0x0163;
    L_0x00e8:
        r6 = new android.widget.TextView;
        r5 = r12.b;
        r6.<init>(r5);
        r5 = r12.C;
        if (r5 == 0) goto L_0x00f6;
    L_0x00f3:
        r5 = r12.i;
        goto L_0x00f8;
    L_0x00f6:
        r5 = r12.f;
    L_0x00f8:
        r6.setTextColor(r5);
        r5 = new android.widget.LinearLayout$LayoutParams;
        r5.<init>(r4, r4);
        r4 = r12.s;
        r5.rightMargin = r4;
        r4 = r12.r;
        r5.leftMargin = r4;
        r4 = r12.t;
        r5.topMargin = r4;
        r4 = r12.u;
        r5.bottomMargin = r4;
        r4 = r12.K;
        if (r4 == 0) goto L_0x0127;
    L_0x0114:
        r4 = r12.q;
        if (r4 == r3) goto L_0x0121;
    L_0x0118:
        if (r4 != r1) goto L_0x011b;
    L_0x011a:
        goto L_0x0121;
    L_0x011b:
        r6.setGravity(r7);
        r5.gravity = r7;
        goto L_0x012c;
    L_0x0121:
        r5.gravity = r0;
        r6.setGravity(r0);
        goto L_0x012c;
    L_0x0127:
        r5.gravity = r0;
        r6.setGravity(r7);
    L_0x012c:
        r6.setLayoutParams(r5);
        r0 = r12.isInEditMode();
        if (r0 != 0) goto L_0x014f;
    L_0x0135:
        r0 = r12.getContext();
        r1 = r12.o;
        r1 = (float) r1;
        r0 = mehdi.sakout.fancybuttons.b.a(r0, r1);
        r0 = (float) r0;
        r6.setTextSize(r0);
        r0 = r12.p;
        r6.setText(r0);
        r0 = r12.F;
        r6.setTypeface(r0);
        goto L_0x0163;
    L_0x014f:
        r0 = r12.getContext();
        r1 = r12.o;
        r1 = (float) r1;
        r0 = mehdi.sakout.fancybuttons.b.a(r0, r1);
        r0 = (float) r0;
        r6.setTextSize(r0);
        r0 = "O";
        r6.setText(r0);
    L_0x0163:
        r12.J = r6;
        r12.removeAllViews();
        r12.b();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r12.q;
        if (r1 == r2) goto L_0x018a;
    L_0x0174:
        if (r1 != r3) goto L_0x0177;
    L_0x0176:
        goto L_0x018a;
    L_0x0177:
        r1 = r12.K;
        if (r1 == 0) goto L_0x017e;
    L_0x017b:
        r0.add(r1);
    L_0x017e:
        r1 = r12.I;
        if (r1 == 0) goto L_0x0185;
    L_0x0182:
        r0.add(r1);
    L_0x0185:
        r1 = r12.J;
        if (r1 == 0) goto L_0x019f;
    L_0x0189:
        goto L_0x019c;
    L_0x018a:
        r1 = r12.I;
        if (r1 == 0) goto L_0x0191;
    L_0x018e:
        r0.add(r1);
    L_0x0191:
        r1 = r12.J;
        if (r1 == 0) goto L_0x0198;
    L_0x0195:
        r0.add(r1);
    L_0x0198:
        r1 = r12.K;
        if (r1 == 0) goto L_0x019f;
    L_0x019c:
        r0.add(r1);
    L_0x019f:
        r0 = r0.iterator();
    L_0x01a3:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x01b3;
    L_0x01a9:
        r1 = r0.next();
        r1 = (android.view.View) r1;
        r12.addView(r1);
        goto L_0x01a3;
    L_0x01b3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mehdi.sakout.fancybuttons.FancyButton.a():void");
    }

    private void a(GradientDrawable gradientDrawable) {
        int i = this.x;
        if (i > 0) {
            gradientDrawable.setCornerRadius((float) i);
            return;
        }
        r0 = new float[8];
        int i2 = this.y;
        r0[0] = (float) i2;
        r0[1] = (float) i2;
        i2 = this.z;
        r0[2] = (float) i2;
        r0[3] = (float) i2;
        i2 = this.B;
        r0[4] = (float) i2;
        r0[5] = (float) i2;
        i2 = this.A;
        r0[6] = (float) i2;
        r0[7] = (float) i2;
        gradientDrawable.setCornerRadii(r0);
    }

    @SuppressLint({"NewApi"})
    private void b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        a(gradientDrawable);
        gradientDrawable.setColor(this.L ? getResources().getColor(17170445) : this.c);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        a(gradientDrawable2);
        gradientDrawable2.setColor(this.d);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        a(gradientDrawable3);
        gradientDrawable3.setColor(this.e);
        gradientDrawable3.setStroke(this.w, this.g);
        int i = this.v;
        if (i != 0) {
            gradientDrawable.setStroke(this.w, i);
        }
        if (!this.C) {
            gradientDrawable.setStroke(this.w, this.g);
            if (this.L) {
                gradientDrawable3.setColor(getResources().getColor(17170445));
            }
        }
        if (!this.N || VERSION.SDK_INT < 21) {
            Drawable stateListDrawable = new StateListDrawable();
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            a(gradientDrawable4);
            gradientDrawable4.setColor(this.L ? getResources().getColor(17170445) : this.d);
            int i2 = this.v;
            if (i2 != 0) {
                if (this.L) {
                    gradientDrawable4.setStroke(this.w, this.d);
                } else {
                    gradientDrawable4.setStroke(this.w, i2);
                }
            }
            if (!this.C) {
                gradientDrawable4.setStroke(this.w, this.g);
            }
            if (this.d != 0) {
                stateListDrawable.addState(new int[]{16842919}, gradientDrawable4);
                stateListDrawable.addState(new int[]{16842908}, gradientDrawable4);
                stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
            }
            stateListDrawable.addState(new int[0], gradientDrawable);
            if (VERSION.SDK_INT < 16) {
                setBackgroundDrawable(stateListDrawable);
                return;
            } else {
                setBackground(stateListDrawable);
                return;
            }
        }
        setBackground(a(gradientDrawable, gradientDrawable2, gradientDrawable3));
    }

    public TextView getIconFontObject() {
        return this.J;
    }

    public ImageView getIconImageObject() {
        return this.I;
    }

    public CharSequence getText() {
        TextView textView = this.K;
        return textView != null ? textView.getText() : BuildConfig.FLAVOR;
    }

    public TextView getTextViewObject() {
        return this.K;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a(this, i, i2));
        }
    }

    public void setBackgroundColor(int i) {
        this.c = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setBorderColor(int i) {
        this.v = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setBorderWidth(int i) {
        this.w = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setCustomIconFont(String str) {
        this.F = b.a(this.b, str, this.G);
        TextView textView = this.J;
        if (textView == null) {
            a();
        } else {
            textView.setTypeface(this.F);
        }
    }

    public void setCustomTextFont(String str) {
        this.E = b.a(this.b, str, this.H);
        TextView textView = this.K;
        if (textView == null) {
            a();
        } else {
            textView.setTypeface(this.E);
        }
    }

    public void setDisableBackgroundColor(int i) {
        this.e = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setDisableBorderColor(int i) {
        this.g = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setDisableTextColor(int i) {
        this.f = i;
        TextView textView = this.K;
        if (textView == null) {
            a();
            return;
        }
        if (!this.C) {
            textView.setTextColor(i);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.C = z;
        a();
    }

    public void setFocusBackgroundColor(int i) {
        this.d = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setFontIconSize(int i) {
        float f = (float) i;
        this.o = b.b(getContext(), f);
        TextView textView = this.J;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setGhost(boolean z) {
        this.L = z;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setIconColor(int i) {
        TextView textView = this.J;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setIconPosition(int i) {
        if (i <= 0 || i >= 5) {
            i = 1;
        }
        this.q = i;
        a();
    }

    public void setIconResource(int i) {
        this.n = this.b.getResources().getDrawable(i);
        ImageView imageView = this.I;
        if (imageView != null) {
            if (this.J == null) {
                imageView.setImageDrawable(this.n);
                return;
            }
        }
        this.J = null;
        a();
    }

    public void setIconResource(Drawable drawable) {
        this.n = drawable;
        ImageView imageView = this.I;
        if (imageView != null) {
            if (this.J == null) {
                imageView.setImageDrawable(this.n);
                return;
            }
        }
        this.J = null;
        a();
    }

    public void setIconResource(String str) {
        this.p = str;
        TextView textView = this.J;
        if (textView == null) {
            this.I = null;
            a();
            return;
        }
        textView.setText(str);
    }

    public void setRadius(int i) {
        this.x = i;
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setRadius(int[] iArr) {
        this.y = iArr[0];
        this.z = iArr[1];
        this.A = iArr[2];
        this.B = iArr[3];
        if (this.I != null || this.J != null || this.K != null) {
            b();
        }
    }

    public void setText(String str) {
        CharSequence toUpperCase;
        if (this.D) {
            toUpperCase = str.toUpperCase();
        }
        this.m = toUpperCase;
        TextView textView = this.K;
        if (textView == null) {
            a();
        } else {
            textView.setText(toUpperCase);
        }
    }

    public void setTextAllCaps(boolean z) {
        this.D = z;
        setText(this.m);
    }

    public void setTextColor(int i) {
        this.h = i;
        TextView textView = this.K;
        if (textView == null) {
            a();
        } else {
            textView.setTextColor(i);
        }
    }

    public void setTextGravity(int i) {
        this.l = i;
        if (this.K != null) {
            setGravity(i);
        }
    }

    public void setTextSize(int i) {
        float f = (float) i;
        this.k = b.b(getContext(), f);
        TextView textView = this.K;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setUsingSystemFont(boolean z) {
        this.M = z;
    }
}
