package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import java.util.List;

public final class adc {
    public static final String a = "adc";
    private static boolean b;
    private static HashMap<String, adm> c = new HashMap();

    private adc() {
    }

    public static adm a(Context context, String str) {
        adc.a(context);
        return (adm) c.get(str);
    }

    public static Spanned a(Context context, HashMap<String, adm> hashMap, Spanned spanned, List<CharacterStyle> list, HashMap<String, List<CharacterStyle>> hashMap2) {
        adr a = adp.a(spanned, adc.a(context, (HashMap) hashMap));
        spanned = SpannableString.valueOf(a.a);
        adp.a(context, spanned, a.b, list, hashMap2);
        return spanned;
    }

    private static HashMap<String, adm> a(Context context, HashMap<String, adm> hashMap) {
        adc.a(context);
        return (hashMap == null || hashMap.size() == 0) ? c : hashMap;
    }

    private static void a(android.content.Context r5) {
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
        r0 = b;
        if (r0 != 0) goto L_0x003b;
    L_0x0004:
        r5 = defpackage.adn.a(r5);
        r0 = r5.length;
        r1 = 0;
    L_0x000a:
        if (r1 >= r0) goto L_0x0038;
    L_0x000c:
        r2 = r5[r1];
        r2 = java.lang.Class.forName(r2);	 Catch:{ Exception -> 0x0035 }
        r2 = r2.newInstance();	 Catch:{ Exception -> 0x0035 }
        r2 = (defpackage.adm) r2;	 Catch:{ Exception -> 0x0035 }
        r3 = r2.getMappingPrefix();	 Catch:{ Exception -> 0x0035 }
        r3 = r3.length();	 Catch:{ Exception -> 0x0035 }
        r4 = 3;	 Catch:{ Exception -> 0x0035 }
        if (r3 != r4) goto L_0x002d;	 Catch:{ Exception -> 0x0035 }
    L_0x0023:
        r3 = c;	 Catch:{ Exception -> 0x0035 }
        r4 = r2.getMappingPrefix();	 Catch:{ Exception -> 0x0035 }
        r3.put(r4, r2);	 Catch:{ Exception -> 0x0035 }
        goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x002d:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x0035 }
        r3 = "The mapping prefix of a font must be three characters long.";	 Catch:{ Exception -> 0x0035 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0035 }
        throw r2;	 Catch:{ Exception -> 0x0035 }
    L_0x0035:
        r1 = r1 + 1;
        goto L_0x000a;
    L_0x0038:
        r5 = 1;
        b = r5;
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: adc.a(android.content.Context):void");
    }
}
