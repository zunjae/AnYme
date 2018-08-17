package io.github.inflationx.calligraphy3;

import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

public final class TypefaceUtils {
    private static final Map<String, Typeface> sCachedFonts = new HashMap();
    private static final Map<Typeface, CalligraphyTypefaceSpan> sCachedSpans = new HashMap();

    private TypefaceUtils() {
    }

    public static CalligraphyTypefaceSpan getSpan(Typeface typeface) {
        if (typeface == null) {
            return null;
        }
        synchronized (sCachedSpans) {
            if (sCachedSpans.containsKey(typeface)) {
                CalligraphyTypefaceSpan calligraphyTypefaceSpan = (CalligraphyTypefaceSpan) sCachedSpans.get(typeface);
                return calligraphyTypefaceSpan;
            }
            CalligraphyTypefaceSpan calligraphyTypefaceSpan2 = new CalligraphyTypefaceSpan(typeface);
            sCachedSpans.put(typeface, calligraphyTypefaceSpan2);
            return calligraphyTypefaceSpan2;
        }
    }

    public static boolean isLoaded(Typeface typeface) {
        return typeface != null && sCachedFonts.containsValue(typeface);
    }

    public static android.graphics.Typeface load(android.content.res.AssetManager r2, java.lang.String r3) {
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
        r0 = sCachedFonts;
        monitor-enter(r0);
        r1 = sCachedFonts;	 Catch:{ Exception -> 0x0022 }
        r1 = r1.containsKey(r3);	 Catch:{ Exception -> 0x0022 }
        if (r1 != 0) goto L_0x0016;	 Catch:{ Exception -> 0x0022 }
    L_0x000b:
        r2 = android.graphics.Typeface.createFromAsset(r2, r3);	 Catch:{ Exception -> 0x0022 }
        r1 = sCachedFonts;	 Catch:{ Exception -> 0x0022 }
        r1.put(r3, r2);	 Catch:{ Exception -> 0x0022 }
        monitor-exit(r0);	 Catch:{ all -> 0x0020 }
        return r2;	 Catch:{ all -> 0x0020 }
    L_0x0016:
        r2 = sCachedFonts;	 Catch:{ all -> 0x0020 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0020 }
        r2 = (android.graphics.Typeface) r2;	 Catch:{ all -> 0x0020 }
        monitor-exit(r0);	 Catch:{ all -> 0x0020 }
        return r2;	 Catch:{ all -> 0x0020 }
    L_0x0020:
        r2 = move-exception;	 Catch:{ all -> 0x0020 }
        goto L_0x0039;	 Catch:{ all -> 0x0020 }
    L_0x0022:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0020 }
        r1 = "Can't create asset from ";	 Catch:{ all -> 0x0020 }
        r2.<init>(r1);	 Catch:{ all -> 0x0020 }
        r2.append(r3);	 Catch:{ all -> 0x0020 }
        r1 = ". Make sure you have passed in the correct path and file name.";	 Catch:{ all -> 0x0020 }
        r2.append(r1);	 Catch:{ all -> 0x0020 }
        r2 = sCachedFonts;	 Catch:{ all -> 0x0020 }
        r1 = 0;	 Catch:{ all -> 0x0020 }
        r2.put(r3, r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r0);	 Catch:{ all -> 0x0020 }
        return r1;	 Catch:{ all -> 0x0020 }
    L_0x0039:
        monitor-exit(r0);	 Catch:{ all -> 0x0020 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.calligraphy3.TypefaceUtils.load(android.content.res.AssetManager, java.lang.String):android.graphics.Typeface");
    }
}
