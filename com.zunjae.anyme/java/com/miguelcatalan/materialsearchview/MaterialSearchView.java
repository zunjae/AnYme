package com.miguelcatalan.materialsearchview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.Filter.FilterListener;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import defpackage.abs;
import defpackage.abv;

public class MaterialSearchView extends FrameLayout implements FilterListener {
    private MenuItem a;
    private boolean b;
    private int c;
    private boolean d;
    private View e;
    private View f;
    private ListView g;
    private EditText h;
    private ImageButton i;
    private ImageButton j;
    private ImageButton k;
    private RelativeLayout l;
    private CharSequence m;
    private CharSequence n;
    private h o;
    private k p;
    private ListAdapter q;
    private i r;
    private boolean s;
    private boolean t;
    private boolean u;
    private Drawable v;
    private Context w;
    private final OnClickListener x;

    public MaterialSearchView(Context context) {
        this(context, null);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.b = false;
        this.s = false;
        this.t = false;
        this.x = new d(this);
        this.w = context;
        LayoutInflater.from(this.w).inflate(R.layout.search_view, this, true);
        this.e = findViewById(R.id.search_layout);
        this.l = (RelativeLayout) this.e.findViewById(R.id.search_top_bar);
        this.g = (ListView) this.e.findViewById(R.id.suggestion_list);
        this.h = (EditText) this.e.findViewById(R.id.searchTextView);
        this.i = (ImageButton) this.e.findViewById(R.id.action_up_btn);
        this.j = (ImageButton) this.e.findViewById(R.id.action_voice_btn);
        this.k = (ImageButton) this.e.findViewById(R.id.action_empty_btn);
        this.f = this.e.findViewById(R.id.transparent_view);
        this.h.setOnClickListener(this.x);
        this.i.setOnClickListener(this.x);
        this.j.setOnClickListener(this.x);
        this.k.setOnClickListener(this.x);
        this.f.setOnClickListener(this.x);
        this.u = false;
        b(true);
        this.h.setOnEditorActionListener(new a(this));
        this.h.addTextChangedListener(new b(this));
        this.h.setOnFocusChangeListener(new c(this));
        this.g.setVisibility(8);
        setAnimationDuration(abs.b);
        TypedArray obtainStyledAttributes = this.w.obtainStyledAttributes(attributeSet, R.styleable.MaterialSearchView, i, 0);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_searchBackground)) {
                setBackground(obtainStyledAttributes.getDrawable(R.styleable.MaterialSearchView_searchBackground));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_android_textColor)) {
                setTextColor(obtainStyledAttributes.getColor(R.styleable.MaterialSearchView_android_textColor, 0));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_android_textColorHint)) {
                setHintTextColor(obtainStyledAttributes.getColor(R.styleable.MaterialSearchView_android_textColorHint, 0));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_android_hint)) {
                setHint(obtainStyledAttributes.getString(R.styleable.MaterialSearchView_android_hint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_searchVoiceIcon)) {
                setVoiceIcon(obtainStyledAttributes.getDrawable(R.styleable.MaterialSearchView_searchVoiceIcon));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_searchCloseIcon)) {
                setCloseIcon(obtainStyledAttributes.getDrawable(R.styleable.MaterialSearchView_searchCloseIcon));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_searchBackIcon)) {
                setBackIcon(obtainStyledAttributes.getDrawable(R.styleable.MaterialSearchView_searchBackIcon));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_searchSuggestionBackground)) {
                setSuggestionBackground(obtainStyledAttributes.getDrawable(R.styleable.MaterialSearchView_searchSuggestionBackground));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MaterialSearchView_searchSuggestionIcon)) {
                setSuggestionIcon(obtainStyledAttributes.getDrawable(R.styleable.MaterialSearchView_searchSuggestionIcon));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static void a(View view) {
        if (VERSION.SDK_INT <= 10 && view.hasFocus()) {
            view.clearFocus();
        }
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    private void a(CharSequence charSequence) {
        ListAdapter listAdapter = this.q;
        if (listAdapter != null && (listAdapter instanceof Filterable)) {
            ((Filterable) listAdapter).getFilter().filter(charSequence, this);
        }
    }

    private void b(boolean z) {
        ImageButton imageButton;
        int i;
        if (z && f() && this.u) {
            imageButton = this.j;
            i = 0;
        } else {
            imageButton = this.j;
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    static /* synthetic */ void c(MaterialSearchView materialSearchView, CharSequence charSequence) {
        CharSequence text = materialSearchView.h.getText();
        materialSearchView.n = text;
        boolean z = true;
        if ((TextUtils.isEmpty(text) ^ 1) != 0) {
            z = false;
            materialSearchView.k.setVisibility(0);
        } else {
            materialSearchView.k.setVisibility(8);
        }
        materialSearchView.b(z);
        if (!(materialSearchView.o == null || TextUtils.equals(charSequence, materialSearchView.m))) {
            materialSearchView.o.b(charSequence.toString());
        }
        materialSearchView.m = charSequence.toString();
    }

    private void e() {
        CharSequence text = this.h.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            h hVar = this.o;
            if (hVar != null) {
                hVar.a(text.toString());
            }
            d();
            this.h.setText(null);
        }
    }

    static /* synthetic */ void e(MaterialSearchView materialSearchView) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        Context context = materialSearchView.w;
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 9999);
        }
    }

    private boolean f() {
        return isInEditMode() || getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() == 0;
    }

    private void g() {
        if (this.g.getVisibility() == 0) {
            this.g.setVisibility(8);
        }
    }

    private void h() {
        abv gVar = new g(this);
        if (VERSION.SDK_INT >= 21) {
            this.e.setVisibility(0);
            abs.a(this.l, gVar);
            return;
        }
        abs.a(this.e, this.c, gVar);
    }

    public final void a() {
        ListAdapter listAdapter = this.q;
        if (listAdapter != null && listAdapter.getCount() > 0 && this.g.getVisibility() == 8) {
            this.g.setVisibility(0);
        }
    }

    public final void a(CharSequence charSequence, boolean z) {
        this.h.setText(charSequence);
        if (charSequence != null) {
            EditText editText = this.h;
            editText.setSelection(editText.length());
            this.n = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            e();
        }
    }

    public final void a(boolean z) {
        if (!this.b) {
            this.h.setText(null);
            this.h.requestFocus();
            if (z) {
                h();
            } else {
                this.e.setVisibility(0);
                k kVar = this.p;
                if (kVar != null) {
                    kVar.a();
                }
            }
            this.b = true;
        }
    }

    public final boolean b() {
        return this.b;
    }

    public final void c() {
        a(true);
    }

    public void clearFocus() {
        this.d = true;
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        super.clearFocus();
        this.h.clearFocus();
        this.d = false;
    }

    public final void d() {
        if (this.b) {
            this.h.setText(null);
            g();
            clearFocus();
            this.e.setVisibility(8);
            k kVar = this.p;
            if (kVar != null) {
                kVar.b();
            }
            this.b = false;
        }
    }

    public void onFilterComplete(int i) {
        if (i > 0) {
            a();
        } else {
            g();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof i) {
            this.r = (i) parcelable;
            if (this.r.b) {
                a(false);
                a(this.r.a, false);
            }
            super.onRestoreInstanceState(this.r.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        this.r = new i(super.onSaveInstanceState());
        i iVar = this.r;
        CharSequence charSequence = this.n;
        iVar.a = charSequence != null ? charSequence.toString() : null;
        Parcelable parcelable = this.r;
        parcelable.b = this.b;
        return parcelable;
    }

    public boolean requestFocus(int i, Rect rect) {
        return (!this.d && isFocusable()) ? this.h.requestFocus(i, rect) : false;
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.q = listAdapter;
        this.g.setAdapter(listAdapter);
        a(this.h.getText());
    }

    public void setAnimationDuration(int i) {
        this.c = i;
    }

    public void setBackIcon(Drawable drawable) {
        this.i.setImageDrawable(drawable);
    }

    public void setBackground(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            this.l.setBackground(drawable);
        } else {
            this.l.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundColor(int i) {
        this.l.setBackgroundColor(i);
    }

    public void setCloseIcon(Drawable drawable) {
        this.k.setImageDrawable(drawable);
    }

    public void setCursorDrawable(int r3) {
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
        r0 = android.widget.TextView.class;	 Catch:{ Exception -> 0x0015 }
        r1 = "mCursorDrawableRes";	 Catch:{ Exception -> 0x0015 }
        r0 = r0.getDeclaredField(r1);	 Catch:{ Exception -> 0x0015 }
        r1 = 1;	 Catch:{ Exception -> 0x0015 }
        r0.setAccessible(r1);	 Catch:{ Exception -> 0x0015 }
        r1 = r2.h;	 Catch:{ Exception -> 0x0015 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0015 }
        r0.set(r1, r3);	 Catch:{ Exception -> 0x0015 }
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miguelcatalan.materialsearchview.MaterialSearchView.setCursorDrawable(int):void");
    }

    public void setEllipsize(boolean z) {
        this.t = z;
    }

    public void setHint(CharSequence charSequence) {
        this.h.setHint(charSequence);
    }

    public void setHintTextColor(int i) {
        this.h.setHintTextColor(i);
    }

    public void setMenuItem(MenuItem menuItem) {
        this.a = menuItem;
        this.a.setOnMenuItemClickListener(new f(this));
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.g.setOnItemClickListener(onItemClickListener);
    }

    public void setOnQueryTextListener(h hVar) {
        this.o = hVar;
    }

    public void setOnSearchViewListener(k kVar) {
        this.p = kVar;
    }

    public void setSubmitOnClick(boolean z) {
        this.s = z;
    }

    public void setSuggestionBackground(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            this.g.setBackground(drawable);
        } else {
            this.g.setBackgroundDrawable(drawable);
        }
    }

    public void setSuggestionIcon(Drawable drawable) {
        this.v = drawable;
    }

    public void setSuggestions(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setVisibility(0);
        Object lVar = new l(this.w, strArr, this.v, this.t);
        setAdapter(lVar);
        setOnItemClickListener(new e(this, lVar));
    }

    public void setTextColor(int i) {
        this.h.setTextColor(i);
    }

    public void setVoiceIcon(Drawable drawable) {
        this.j.setImageDrawable(drawable);
    }

    public void setVoiceSearch(boolean z) {
        this.u = z;
    }
}
