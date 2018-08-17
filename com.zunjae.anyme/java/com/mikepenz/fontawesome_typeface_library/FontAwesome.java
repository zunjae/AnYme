package com.mikepenz.fontawesome_typeface_library;

import android.graphics.Typeface;
import defpackage.adl;
import defpackage.adm;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class FontAwesome implements adm {
    private static final String TTF_FILE = "fontawesome-font-v4.7.ttf";
    private static HashMap<String, Character> mChars;
    private static Typeface typeface;

    public String getAuthor() {
        return "Dave Gandy";
    }

    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap hashMap = new HashMap();
            for (a aVar : a.values()) {
                hashMap.put(aVar.name(), Character.valueOf(aVar.character));
            }
            mChars = hashMap;
        }
        return mChars;
    }

    public String getDescription() {
        return "Font Awesome is a full suite of 675 pictographic icons for easy scalable vector graphics on websites, created and maintained by Dave Gandy. Stay up to date @fontawesome.";
    }

    public String getFontName() {
        return "FontAwesome";
    }

    public adl getIcon(String str) {
        return a.valueOf(str);
    }

    public int getIconCount() {
        return mChars.size();
    }

    public Collection<String> getIcons() {
        Collection<String> linkedList = new LinkedList();
        for (a name : a.values()) {
            linkedList.add(name.name());
        }
        return linkedList;
    }

    public String getLicense() {
        return "SIL OFL 1.1";
    }

    public String getLicenseUrl() {
        return "http://scripts.sil.org/OFL";
    }

    public String getMappingPrefix() {
        return "faw";
    }

    public android.graphics.Typeface getTypeface(android.content.Context r2) {
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
        r1 = this;
        r0 = typeface;
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r2 = r2.getAssets();	 Catch:{ Exception -> 0x0011 }
        r0 = "fonts/fontawesome-font-v4.7.ttf";	 Catch:{ Exception -> 0x0011 }
        r2 = android.graphics.Typeface.createFromAsset(r2, r0);	 Catch:{ Exception -> 0x0011 }
        typeface = r2;	 Catch:{ Exception -> 0x0011 }
        goto L_0x0013;
    L_0x0011:
        r2 = 0;
        return r2;
    L_0x0013:
        r2 = typeface;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.fontawesome_typeface_library.FontAwesome.getTypeface(android.content.Context):android.graphics.Typeface");
    }

    public String getUrl() {
        return "https://github.com/FortAwesome/Font-Awesome";
    }

    public String getVersion() {
        return "4.7.0.0";
    }
}
