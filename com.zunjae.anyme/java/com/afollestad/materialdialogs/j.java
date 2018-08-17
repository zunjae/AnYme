package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import defpackage.cu;
import defpackage.cx;
import defpackage.tw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class j extends f implements OnClickListener, d {
    protected final o b;
    protected ImageView c;
    protected TextView d;
    protected TextView e;
    EditText f;
    RecyclerView g;
    View h;
    FrameLayout i;
    ProgressBar j;
    TextView k;
    TextView l;
    TextView m;
    CheckBox n;
    MDButton o;
    MDButton p;
    MDButton q;
    int r;
    List<Integer> s;
    private final Handler t = new Handler();

    @SuppressLint({"InflateParams"})
    protected j(o oVar) {
        super(oVar.a, g.a(oVar));
        this.b = oVar;
        this.a = (MDRootLayout) LayoutInflater.from(oVar.a).inflate(g.b(oVar), null);
        g.a(this);
    }

    public static void a(TextView textView, Typeface typeface) {
        if (typeface != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
            textView.setTypeface(typeface);
        }
    }

    private boolean b(View view) {
        o oVar = this.b;
        if (oVar.F == null) {
            return false;
        }
        CharSequence charSequence = null;
        int i = oVar.N;
        if (i >= 0 && i < oVar.l.size()) {
            oVar = this.b;
            charSequence = (CharSequence) oVar.l.get(oVar.N);
        }
        oVar = this.b;
        return oVar.F.onSelection(this, view, oVar.N, charSequence);
    }

    private boolean g() {
        if (this.b.G == null) {
            return false;
        }
        Collections.sort(this.s);
        List arrayList = new ArrayList();
        for (Integer num : this.s) {
            if (num.intValue() >= 0 && num.intValue() <= this.b.l.size() - 1) {
                arrayList.add(this.b.l.get(num.intValue()));
            }
        }
        t tVar = this.b.G;
        List list = this.s;
        return tVar.onSelection(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    final Drawable a(e eVar, boolean z) {
        o oVar;
        Drawable b;
        if (z) {
            oVar = this.b;
            if (oVar.aK != 0) {
                return ResourcesCompat.getDrawable(oVar.a.getResources(), this.b.aK, null);
            }
            b = cu.b(oVar.a, R.attr.md_btn_stacked_selector);
            return b != null ? b : cu.b(getContext(), R.attr.md_btn_stacked_selector);
        } else {
            switch (n.a[eVar.ordinal()]) {
                case tw.a /*1*/:
                    oVar = this.b;
                    if (oVar.aM != 0) {
                        return ResourcesCompat.getDrawable(oVar.a.getResources(), this.b.aM, null);
                    }
                    b = cu.b(oVar.a, R.attr.md_btn_neutral_selector);
                    if (b != null) {
                        return b;
                    }
                    b = cu.b(getContext(), R.attr.md_btn_neutral_selector);
                    if (VERSION.SDK_INT >= 21) {
                        cx.a(b, this.b.h);
                    }
                    return b;
                case tw.b /*2*/:
                    oVar = this.b;
                    if (oVar.aN != 0) {
                        return ResourcesCompat.getDrawable(oVar.a.getResources(), this.b.aN, null);
                    }
                    b = cu.b(oVar.a, R.attr.md_btn_negative_selector);
                    if (b != null) {
                        return b;
                    }
                    b = cu.b(getContext(), R.attr.md_btn_negative_selector);
                    if (VERSION.SDK_INT >= 21) {
                        cx.a(b, this.b.h);
                    }
                    return b;
                default:
                    oVar = this.b;
                    if (oVar.aL != 0) {
                        return ResourcesCompat.getDrawable(oVar.a.getResources(), this.b.aL, null);
                    }
                    b = cu.b(oVar.a, R.attr.md_btn_positive_selector);
                    if (b != null) {
                        return b;
                    }
                    b = cu.b(getContext(), R.attr.md_btn_positive_selector);
                    if (VERSION.SDK_INT >= 21) {
                        cx.a(b, this.b.h);
                    }
                    return b;
            }
        }
    }

    public final MDButton a(e eVar) {
        switch (n.a[eVar.ordinal()]) {
            case tw.a /*1*/:
                return this.p;
            case tw.b /*2*/:
                return this.q;
            default:
                return this.o;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void a(int r8, boolean r9) {
        /*
        r7 = this;
        r0 = r7.m;
        if (r0 == 0) goto L_0x007b;
    L_0x0004:
        r1 = r7.b;
        r1 = r1.as;
        r2 = 1;
        r3 = 0;
        if (r1 <= 0) goto L_0x0032;
    L_0x000c:
        r1 = java.util.Locale.getDefault();
        r4 = "%d/%d";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = java.lang.Integer.valueOf(r8);
        r5[r3] = r6;
        r6 = r7.b;
        r6 = r6.as;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r2] = r6;
        r1 = java.lang.String.format(r1, r4, r5);
        r0.setText(r1);
        r0 = r7.m;
        r0.setVisibility(r3);
        goto L_0x0037;
    L_0x0032:
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0037:
        if (r9 == 0) goto L_0x003b;
    L_0x0039:
        if (r8 == 0) goto L_0x0049;
    L_0x003b:
        r9 = r7.b;
        r9 = r9.as;
        if (r9 <= 0) goto L_0x0043;
    L_0x0041:
        if (r8 > r9) goto L_0x0049;
    L_0x0043:
        r9 = r7.b;
        r9 = r9.ar;
        if (r8 >= r9) goto L_0x004a;
    L_0x0049:
        r3 = 1;
    L_0x004a:
        if (r3 == 0) goto L_0x0051;
    L_0x004c:
        r8 = r7.b;
        r8 = r8.at;
        goto L_0x0055;
    L_0x0051:
        r8 = r7.b;
        r8 = r8.j;
    L_0x0055:
        if (r3 == 0) goto L_0x005c;
    L_0x0057:
        r9 = r7.b;
        r9 = r9.at;
        goto L_0x0060;
    L_0x005c:
        r9 = r7.b;
        r9 = r9.t;
    L_0x0060:
        r0 = r7.b;
        r0 = r0.as;
        if (r0 <= 0) goto L_0x006b;
    L_0x0066:
        r0 = r7.m;
        r0.setTextColor(r8);
    L_0x006b:
        r8 = r7.f;
        com.afollestad.materialdialogs.internal.f.a(r8, r9);
        r8 = com.afollestad.materialdialogs.e.POSITIVE;
        r8 = r7.a(r8);
        r9 = r3 ^ 1;
        r8.setEnabled(r9);
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.j.a(int, boolean):void");
    }

    public final void a(CharSequence charSequence) {
        this.e.setText(charSequence);
        this.e.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final boolean a(View view, int i, boolean z) {
        boolean z2 = false;
        if (!view.isEnabled()) {
            return false;
        }
        o oVar;
        int i2 = this.r;
        if (i2 != 0) {
            if (i2 != w.a) {
                if (i2 == w.c) {
                    CheckBox checkBox = (CheckBox) view.findViewById(R.id.md_control);
                    if (!checkBox.isEnabled()) {
                        return false;
                    }
                    if ((this.s.contains(Integer.valueOf(i)) ^ 1) != 0) {
                        this.s.add(Integer.valueOf(i));
                        if (this.b.H) {
                            if (!g()) {
                                this.s.remove(Integer.valueOf(i));
                            }
                        }
                        checkBox.setChecked(true);
                    } else {
                        this.s.remove(Integer.valueOf(i));
                        if (!this.b.H || g()) {
                            checkBox.setChecked(false);
                        } else {
                            this.s.add(Integer.valueOf(i));
                        }
                    }
                } else if (i2 == w.b) {
                    RadioButton radioButton = (RadioButton) view.findViewById(R.id.md_control);
                    if (!radioButton.isEnabled()) {
                        return false;
                    }
                    oVar = this.b;
                    int i3 = oVar.N;
                    if (oVar.Q && oVar.m == null) {
                        dismiss();
                        this.b.N = i;
                        b(view);
                    } else {
                        oVar = this.b;
                        if (oVar.I) {
                            oVar.N = i;
                            z2 = b(view);
                            this.b.N = i3;
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        this.b.N = i;
                        radioButton.setChecked(true);
                        this.b.W.notifyItemChanged(i3);
                        this.b.W.notifyItemChanged(i);
                    }
                }
                return true;
            }
        }
        if (this.b.Q) {
            dismiss();
        }
        if (!z) {
            oVar = this.b;
            s sVar = oVar.D;
            if (sVar != null) {
                sVar.onSelection(this, view, i, (CharSequence) oVar.l.get(i));
            }
        }
        if (z) {
            o oVar2 = this.b;
            v vVar = oVar2.E;
            if (vVar != null) {
                oVar2.l.get(i);
                return vVar.a();
            }
        }
        return true;
    }

    public final o b() {
        return this.b;
    }

    final void c() {
        if (this.g != null) {
            ArrayList arrayList = this.b.l;
            if ((arrayList != null && arrayList.size() != 0) || this.b.W != null) {
                o oVar = this.b;
                if (oVar.X == null) {
                    oVar.X = new LinearLayoutManager(getContext());
                }
                if (this.g.getLayoutManager() == null) {
                    this.g.setLayoutManager(this.b.X);
                }
                this.g.setAdapter(this.b.W);
                if (this.r != 0) {
                    ((a) this.b.W).a((d) this);
                }
            }
        }
    }

    final Drawable d() {
        o oVar = this.b;
        if (oVar.aJ != 0) {
            return ResourcesCompat.getDrawable(oVar.a.getResources(), this.b.aJ, null);
        }
        Drawable b = cu.b(oVar.a, R.attr.md_list_selector);
        return b != null ? b : cu.b(getContext(), R.attr.md_list_selector);
    }

    public final void dismiss() {
        if (this.f != null) {
            o oVar = this.b;
            j jVar = this;
            if (jVar.f != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) oVar.a().getSystemService("input_method");
                if (inputMethodManager != null) {
                    View currentFocus = getCurrentFocus();
                    IBinder iBinder = null;
                    if (currentFocus != null) {
                        iBinder = currentFocus.getWindowToken();
                    } else {
                        View view = jVar.a;
                        if (view != null) {
                            iBinder = view.getWindowToken();
                        }
                    }
                    if (iBinder != null) {
                        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                    }
                }
            }
        }
        super.dismiss();
    }

    public final boolean e() {
        CheckBox checkBox = this.n;
        return checkBox != null && checkBox.isChecked();
    }

    public final EditText f() {
        return this.f;
    }

    public final /* bridge */ /* synthetic */ View findViewById(int i) {
        return super.findViewById(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
        r3 = this;
        r0 = r4.getTag();
        r0 = (com.afollestad.materialdialogs.e) r0;
        r1 = com.afollestad.materialdialogs.n.a;
        r2 = r0.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x005c;
            case 2: goto L_0x0049;
            case 3: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x006e;
    L_0x0012:
        r1 = r3.b;
        r1 = r1.z;
        if (r1 == 0) goto L_0x001b;
    L_0x0018:
        r1.onClick(r3, r0);
    L_0x001b:
        r1 = r3.b;
        r1 = r1.I;
        if (r1 != 0) goto L_0x0024;
    L_0x0021:
        r3.b(r4);
    L_0x0024:
        r4 = r3.b;
        r4 = r4.H;
        if (r4 != 0) goto L_0x002d;
    L_0x002a:
        r3.g();
    L_0x002d:
        r4 = r3.b;
        r1 = r4.an;
        if (r1 == 0) goto L_0x0042;
    L_0x0033:
        r2 = r3.f;
        if (r2 == 0) goto L_0x0042;
    L_0x0037:
        r4 = r4.aq;
        if (r4 != 0) goto L_0x0042;
    L_0x003b:
        r4 = r2.getText();
        r1.onInput(r3, r4);
    L_0x0042:
        r4 = r3.b;
        r4 = r4.Q;
        if (r4 == 0) goto L_0x006e;
    L_0x0048:
        goto L_0x006b;
    L_0x0049:
        r4 = r3.b;
        r4 = r4.A;
        if (r4 == 0) goto L_0x0052;
    L_0x004f:
        r4.onClick(r3, r0);
    L_0x0052:
        r4 = r3.b;
        r4 = r4.Q;
        if (r4 == 0) goto L_0x006e;
    L_0x0058:
        r3.cancel();
        goto L_0x006e;
    L_0x005c:
        r4 = r3.b;
        r4 = r4.B;
        if (r4 == 0) goto L_0x0065;
    L_0x0062:
        r4.onClick(r3, r0);
    L_0x0065:
        r4 = r3.b;
        r4 = r4.Q;
        if (r4 == 0) goto L_0x006e;
    L_0x006b:
        r3.dismiss();
    L_0x006e:
        r4 = r3.b;
        r4 = r4.C;
        if (r4 == 0) goto L_0x0077;
    L_0x0074:
        r4.onClick(r3, r0);
    L_0x0077:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.j.onClick(android.view.View):void");
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f != null) {
            cu.a((DialogInterface) this, this.b);
            if (this.f.getText().length() > 0) {
                EditText editText = this.f;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    public final void setTitle(int i) {
        setTitle(this.b.a.getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void show() {
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
        r2 = this;
        super.show();	 Catch:{ BadTokenException -> 0x0004 }
        return;
    L_0x0004:
        r0 = new com.afollestad.materialdialogs.p;
        r1 = "Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.j.show():void");
    }
}
