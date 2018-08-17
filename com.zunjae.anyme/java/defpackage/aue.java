package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import me.zhanghai.android.materialprogressbar.R;

public final class aue {
    private static final String a = "aue";

    public static int a(Context context) {
        return aue.a(context, R.attr.colorAccent, ContextCompat.getColor(context, com.zunjae.anyme.R.color.accent));
    }

    private static int a(android.content.Context r2, int r3, int r4) {
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
        r0 = new android.util.TypedValue;
        r0.<init>();
        r2 = r2.getTheme();	 Catch:{ Exception -> 0x0013 }
        r1 = 1;	 Catch:{ Exception -> 0x0013 }
        r2 = r2.resolveAttribute(r3, r0, r1);	 Catch:{ Exception -> 0x0013 }
        if (r2 == 0) goto L_0x0013;	 Catch:{ Exception -> 0x0013 }
    L_0x0010:
        r2 = r0.data;	 Catch:{ Exception -> 0x0013 }
        return r2;
    L_0x0013:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: aue.a(android.content.Context, int, int):int");
    }

    public static int a(Context context, int i, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList != null ? colorStateList.getDefaultColor() : ContextCompat.getColor(context, i3);
    }

    public static int b(Context context) {
        return aue.a(context, R.attr.colorPrimary, ContextCompat.getColor(context, com.zunjae.anyme.R.color.primary));
    }
}
