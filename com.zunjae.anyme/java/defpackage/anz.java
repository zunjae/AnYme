package defpackage;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public final class anz extends ant {
    public static int b(java.lang.String r2) {
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
        r2 = org.jsoup.Jsoup.parse(r2);
        r0 = "div[style='background-color: rgb(234, 234, 234);']";
        r2 = r2.select(r0);
        r2 = r2.text();
        r2 = r2.toLowerCase();
        r0 = "-";
        r0 = r2.contains(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0023;
    L_0x001b:
        r0 = "-";
        r2 = r2.split(r0);
        r2 = r2[r1];
    L_0x0023:
        r0 = "_";
        r0 = r2.contains(r0);
        if (r0 == 0) goto L_0x0033;
    L_0x002b:
        r0 = "-";
        r2 = r2.split(r0);
        r2 = r2[r1];
    L_0x0033:
        r0 = "\\D+";
        r1 = "";
        r2 = r2.replaceAll(r0, r1);
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ Exception -> 0x0040 }
        return r2;
    L_0x0040:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: anz.b(java.lang.String):int");
    }

    public static String b(String str, int i) {
        String str2;
        CharSequence valueOf;
        Iterator it;
        Element element;
        i++;
        String valueOf2 = String.valueOf(i);
        if (valueOf2.length() == 1) {
            str2 = "00";
        } else if (valueOf2.length() == 2) {
            str2 = "0";
        } else {
            valueOf = String.valueOf(i);
            it = Jsoup.parse(str).select("div[class=episode]").iterator();
            while (it.hasNext()) {
                element = (Element) it.next();
                if (element.text().contains(valueOf)) {
                    return element.attr("data-value");
                }
            }
            return null;
        }
        valueOf = str2.concat(String.valueOf(valueOf2));
        it = Jsoup.parse(str).select("div[class=episode]").iterator();
        while (it.hasNext()) {
            element = (Element) it.next();
            if (element.text().contains(valueOf)) {
                return element.attr("data-value");
            }
        }
        return null;
    }

    final String a() {
        return "KissAnimeRepository";
    }

    final String a(String str) {
        return String.format("http://kissanime.ru/M?key=%s&sort=search", new Object[]{str});
    }
}
