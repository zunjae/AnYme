package defpackage;

import android.content.Context;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class adp {
    public static char a = '{';
    public static char b = '}';

    private static defpackage.adq a(android.text.SpannableStringBuilder r5, android.text.SpannableStringBuilder r6, java.util.HashMap<java.lang.String, defpackage.adm> r7) {
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
        r0 = r6.length();
        r1 = 6;
        if (r0 < r1) goto L_0x0055;
    L_0x0007:
        r0 = r6.length();
        r1 = 1;
        r0 = r0 - r1;
        r0 = r6.subSequence(r1, r0);
        r0 = r0.toString();
        r2 = "-";
        r3 = "_";
        r0 = r0.replace(r2, r3);
        r2 = 4;
        r2 = r6.subSequence(r1, r2);
        r2 = r2.toString();
        r3 = r7.get(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r3 = (defpackage.adm) r3;	 Catch:{ IllegalArgumentException -> 0x0053 }
        if (r3 == 0) goto L_0x0050;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x002e:
        r3 = r3.getIcon(r0);	 Catch:{ IllegalArgumentException -> 0x0053 }
        if (r3 == 0) goto L_0x0050;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0034:
        r3 = r3.getCharacter();	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r3 = new adq;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r4 = r5.length();	 Catch:{ IllegalArgumentException -> 0x0053 }
        r4 = r4 - r1;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r1 = r5.length();	 Catch:{ IllegalArgumentException -> 0x0053 }
        r7 = r7.get(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r7 = (defpackage.adm) r7;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r3.<init>(r4, r1, r0, r7);	 Catch:{ IllegalArgumentException -> 0x0053 }
        return r3;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0050:
        r7 = defpackage.adc.a;	 Catch:{ IllegalArgumentException -> 0x0053 }
        goto L_0x0055;
    L_0x0053:
        r7 = defpackage.adc.a;
    L_0x0055:
        r5.append(r6);
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: adp.a(android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.util.HashMap):adq");
    }

    public static adr a(Spanned spanned, HashMap<String, adm> hashMap) {
        LinkedList linkedList = new LinkedList();
        Collection linkedList2 = new LinkedList();
        int i = 0;
        for (ParcelableSpan parcelableSpan : (ParcelableSpan[]) spanned.getSpans(0, spanned.length(), ParcelableSpan.class)) {
            linkedList2.add(new adq(spanned.getSpanStart(parcelableSpan), spanned.getSpanEnd(parcelableSpan), parcelableSpan, spanned.getSpanFlags(parcelableSpan)));
        }
        for (CharacterStyle characterStyle : (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class)) {
            linkedList2.add(new adq(spanned.getSpanStart(characterStyle), spanned.getSpanEnd(characterStyle), characterStyle, spanned.getSpanFlags(characterStyle)));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence spannableStringBuilder2 = new SpannableStringBuilder();
        int i2 = 0;
        while (i < spanned.length()) {
            Character valueOf = Character.valueOf(spanned.charAt(i));
            if (valueOf.charValue() == a) {
                spannableStringBuilder.append(spannableStringBuilder2);
                spannableStringBuilder2 = new SpannableStringBuilder();
            } else {
                if (valueOf.charValue() == b) {
                    spannableStringBuilder2.append(valueOf.charValue());
                    if (spannableStringBuilder2.length() > 5) {
                        adq a = adp.a(spannableStringBuilder, spannableStringBuilder2, hashMap);
                        if (a != null) {
                            linkedList.add(a);
                            Iterator it = linkedList2.iterator();
                            while (it.hasNext()) {
                                adq adq = (adq) it.next();
                                int i3 = adq.a;
                                int i4 = i - i2;
                                if (i3 > i4) {
                                    adq.a = (i3 - spannableStringBuilder2.length()) + 1;
                                }
                                i3 = adq.b;
                                if (i3 > i4) {
                                    adq.b = (i3 - spannableStringBuilder2.length()) + 1;
                                }
                            }
                            i2 += spannableStringBuilder2.length() - 1;
                        }
                    } else {
                        spannableStringBuilder.append(spannableStringBuilder2);
                    }
                    spannableStringBuilder2 = new SpannableStringBuilder();
                } else if (spannableStringBuilder2.length() == 0) {
                    spannableStringBuilder.append(valueOf.charValue());
                }
                i++;
            }
            spannableStringBuilder2.append(valueOf.charValue());
            i++;
        }
        spannableStringBuilder.append(spannableStringBuilder2);
        linkedList.addAll(linkedList2);
        return new adr(spannableStringBuilder, linkedList);
    }

    public static void a(Context context, Spannable spannable, List<adq> list, List<CharacterStyle> list2, HashMap<String, List<CharacterStyle>> hashMap) {
        for (adq adq : list) {
            int i;
            int i2;
            int i3;
            Object obj = adq.f;
            if (obj == null) {
                obj = adq.e;
                if (obj == null) {
                    obj = new ado("sans-serif", adq.d.getTypeface(context));
                    i = adq.a;
                    i2 = adq.b;
                    i3 = 33;
                    spannable.setSpan(obj, i, i2, i3);
                    if (hashMap == null && hashMap.containsKey(adq.c)) {
                        for (CharacterStyle wrap : (List) hashMap.get(adq.c)) {
                            spannable.setSpan(CharacterStyle.wrap(wrap), adq.a, adq.b, adq.g);
                        }
                    } else if (list2 != null) {
                        for (CharacterStyle wrap2 : list2) {
                            spannable.setSpan(CharacterStyle.wrap(wrap2), adq.a, adq.b, adq.g);
                        }
                    }
                }
            }
            i = adq.a;
            i2 = adq.b;
            i3 = adq.g;
            spannable.setSpan(obj, i, i2, i3);
            if (hashMap == null) {
            }
            if (list2 != null) {
                while (r1.hasNext()) {
                    spannable.setSpan(CharacterStyle.wrap(wrap2), adq.a, adq.b, adq.g);
                }
            }
        }
    }
}
