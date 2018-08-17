package io.github.inflationx.calligraphy3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public final class CalligraphyUtils {
    public static final int[] ANDROID_ATTR_TEXT_APPEARANCE = new int[]{16842804};
    private static Boolean sAppCompatViewCheck;
    private static Boolean sToolbarCheck;

    final class AnonymousClass1 implements TextWatcher {
        final /* synthetic */ Typeface val$typeface;

        AnonymousClass1(Typeface typeface) {
            this.val$typeface = typeface;
        }

        public final void afterTextChanged(Editable editable) {
            CalligraphyUtils.applyTypefaceSpan(editable, this.val$typeface);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    private CalligraphyUtils() {
    }

    static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig) {
        applyFontToTextView(context, textView, calligraphyConfig, false);
    }

    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, String str) {
        applyFontToTextView(context, textView, calligraphyConfig, str, false);
    }

    static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, String str, boolean z) {
        if (!(context == null || textView == null)) {
            if (calligraphyConfig != null) {
                if (TextUtils.isEmpty(str) || !applyFontToTextView(context, textView, str, z)) {
                    applyFontToTextView(context, textView, calligraphyConfig, z);
                }
            }
        }
    }

    static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, boolean z) {
        if (!(context == null || textView == null)) {
            if (calligraphyConfig != null) {
                if (calligraphyConfig.isFontSet()) {
                    applyFontToTextView(context, textView, calligraphyConfig.getFontPath(), z);
                }
            }
        }
    }

    public static boolean applyFontToTextView(Context context, TextView textView, String str) {
        return applyFontToTextView(context, textView, str, false);
    }

    static boolean applyFontToTextView(Context context, TextView textView, String str, boolean z) {
        if (textView != null) {
            if (context != null) {
                return applyFontToTextView(textView, TypefaceUtils.load(context.getAssets(), str), z);
            }
        }
        return false;
    }

    public static boolean applyFontToTextView(TextView textView, Typeface typeface) {
        return applyFontToTextView(textView, typeface, false);
    }

    public static boolean applyFontToTextView(TextView textView, Typeface typeface, boolean z) {
        if (textView != null) {
            if (typeface != null) {
                textView.setPaintFlags((textView.getPaintFlags() | 128) | 1);
                textView.setTypeface(typeface);
                if (z) {
                    textView.setText(applyTypefaceSpan(textView.getText(), typeface), BufferType.SPANNABLE);
                    textView.addTextChangedListener(new AnonymousClass1(typeface));
                }
                return true;
            }
        }
        return false;
    }

    public static CharSequence applyTypefaceSpan(CharSequence charSequence, Typeface typeface) {
        if (charSequence != null && charSequence.length() > 0) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = new SpannableString(charSequence);
            }
            ((Spannable) charSequence).setSpan(TypefaceUtils.getSpan(typeface), 0, charSequence.length(), 33);
        }
        return charSequence;
    }

    static boolean canAddV7AppCompatViews() {
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
        r0 = sAppCompatViewCheck;
        if (r0 != 0) goto L_0x0012;
    L_0x0004:
        r0 = "android.support.v7.widget.AppCompatTextView";	 Catch:{ ClassNotFoundException -> 0x000e }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000e }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ ClassNotFoundException -> 0x000e }
        sAppCompatViewCheck = r0;	 Catch:{ ClassNotFoundException -> 0x000e }
        goto L_0x0012;
    L_0x000e:
        r0 = java.lang.Boolean.FALSE;
        sAppCompatViewCheck = r0;
    L_0x0012:
        r0 = sAppCompatViewCheck;
        r0 = r0.booleanValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.canAddV7AppCompatViews():boolean");
    }

    static boolean canCheckForV7Toolbar() {
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
        r0 = sToolbarCheck;
        if (r0 != 0) goto L_0x0012;
    L_0x0004:
        r0 = "android.support.v7.widget.Toolbar";	 Catch:{ ClassNotFoundException -> 0x000e }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000e }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ ClassNotFoundException -> 0x000e }
        sToolbarCheck = r0;	 Catch:{ ClassNotFoundException -> 0x000e }
        goto L_0x0012;
    L_0x000e:
        r0 = java.lang.Boolean.FALSE;
        sToolbarCheck = r0;
    L_0x0012:
        r0 = sToolbarCheck;
        r0 = r0.booleanValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.canCheckForV7Toolbar():boolean");
    }

    static java.lang.String pullFontPathFromStyle(android.content.Context r1, android.util.AttributeSet r2, int[] r3) {
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
        if (r3 == 0) goto L_0x0023;
    L_0x0003:
        if (r2 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0023;
    L_0x0006:
        r1 = r1.obtainStyledAttributes(r2, r3);
        if (r1 == 0) goto L_0x0023;
    L_0x000c:
        r2 = 0;
        r2 = r1.getString(r2);	 Catch:{ Exception -> 0x0020, all -> 0x001b }
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x0020, all -> 0x001b }
        if (r3 != 0) goto L_0x0020;
    L_0x0017:
        r1.recycle();
        return r2;
    L_0x001b:
        r2 = move-exception;
        r1.recycle();
        throw r2;
    L_0x0020:
        r1.recycle();
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.pullFontPathFromStyle(android.content.Context, android.util.AttributeSet, int[]):java.lang.String");
    }

    static java.lang.String pullFontPathFromTextAppearance(android.content.Context r3, android.util.AttributeSet r4, int[] r5) {
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
        if (r5 == 0) goto L_0x0037;
    L_0x0003:
        if (r4 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0037;
    L_0x0006:
        r1 = ANDROID_ATTR_TEXT_APPEARANCE;
        r4 = r3.obtainStyledAttributes(r4, r1);
        r1 = 0;
        r2 = -1;
        if (r4 == 0) goto L_0x0021;
    L_0x0010:
        r2 = r4.getResourceId(r1, r2);	 Catch:{ Exception -> 0x001d, all -> 0x0018 }
        r4.recycle();
        goto L_0x0021;
    L_0x0018:
        r3 = move-exception;
        r4.recycle();
        throw r3;
    L_0x001d:
        r4.recycle();
        return r0;
    L_0x0021:
        r3 = r3.obtainStyledAttributes(r2, r5);
        if (r3 == 0) goto L_0x0037;
    L_0x0027:
        r4 = r3.getString(r1);	 Catch:{ Exception -> 0x0034, all -> 0x002f }
        r3.recycle();
        return r4;
    L_0x002f:
        r4 = move-exception;
        r3.recycle();
        throw r4;
    L_0x0034:
        r3.recycle();
    L_0x0037:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.pullFontPathFromTextAppearance(android.content.Context, android.util.AttributeSet, int[]):java.lang.String");
    }

    static java.lang.String pullFontPathFromTheme(android.content.Context r5, int r6, int r7, int[] r8) {
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
        r0 = -1;
        r1 = 0;
        if (r6 == r0) goto L_0x0048;
    L_0x0004:
        if (r8 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x0048;
    L_0x0007:
        r2 = r5.getTheme();
        r3 = new android.util.TypedValue;
        r3.<init>();
        r4 = 1;
        r2.resolveAttribute(r6, r3, r4);
        r6 = r3.resourceId;
        r3 = new int[r4];
        r4 = 0;
        r3[r4] = r7;
        r6 = r2.obtainStyledAttributes(r6, r3);
        r7 = r6.getResourceId(r4, r0);	 Catch:{ Exception -> 0x0045, all -> 0x0040 }
        r6.recycle();
        if (r7 != r0) goto L_0x0029;
    L_0x0028:
        return r1;
    L_0x0029:
        r5 = r5.obtainStyledAttributes(r7, r8);
        if (r5 == 0) goto L_0x003f;
    L_0x002f:
        r6 = r5.getString(r4);	 Catch:{ Exception -> 0x003c, all -> 0x0037 }
        r5.recycle();
        return r6;
    L_0x0037:
        r6 = move-exception;
        r5.recycle();
        throw r6;
    L_0x003c:
        r5.recycle();
    L_0x003f:
        return r1;
    L_0x0040:
        r5 = move-exception;
        r6.recycle();
        throw r5;
    L_0x0045:
        r6.recycle();
    L_0x0048:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.pullFontPathFromTheme(android.content.Context, int, int, int[]):java.lang.String");
    }

    static java.lang.String pullFontPathFromTheme(android.content.Context r3, int r4, int[] r5) {
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
        r1 = -1;
        if (r4 == r1) goto L_0x002b;
    L_0x0004:
        if (r5 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x002b;
    L_0x0007:
        r3 = r3.getTheme();
        r1 = new android.util.TypedValue;
        r1.<init>();
        r2 = 1;
        r3.resolveAttribute(r4, r1, r2);
        r4 = r1.resourceId;
        r3 = r3.obtainStyledAttributes(r4, r5);
        r4 = 0;
        r4 = r3.getString(r4);	 Catch:{ Exception -> 0x0028, all -> 0x0023 }
        r3.recycle();
        return r4;
    L_0x0023:
        r4 = move-exception;
        r3.recycle();
        throw r4;
    L_0x0028:
        r3.recycle();
    L_0x002b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.pullFontPathFromTheme(android.content.Context, int, int[]):java.lang.String");
    }

    static java.lang.String pullFontPathFromView(android.content.Context r3, android.util.AttributeSet r4, int[] r5) {
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
        if (r5 == 0) goto L_0x0022;
    L_0x0003:
        if (r4 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0022;
    L_0x0006:
        r1 = r3.getResources();	 Catch:{ NotFoundException -> 0x0022 }
        r2 = 0;	 Catch:{ NotFoundException -> 0x0022 }
        r5 = r5[r2];	 Catch:{ NotFoundException -> 0x0022 }
        r5 = r1.getResourceEntryName(r5);	 Catch:{ NotFoundException -> 0x0022 }
        r1 = -1;
        r1 = r4.getAttributeResourceValue(r0, r5, r1);
        if (r1 <= 0) goto L_0x001d;
    L_0x0018:
        r3 = r3.getString(r1);
        return r3;
    L_0x001d:
        r3 = r4.getAttributeValue(r0, r5);
        return r3;
    L_0x0022:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.CalligraphyUtils.pullFontPathFromView(android.content.Context, android.util.AttributeSet, int[]):java.lang.String");
    }
}
