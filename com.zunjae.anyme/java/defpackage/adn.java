package defpackage;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class adn {
    private static java.lang.Class a(java.lang.String r2) {
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
    L_0x0000:
        r0 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0.append(r2);	 Catch:{ ClassNotFoundException -> 0x0016 }
        r1 = ".R$string";	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0.append(r1);	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0016 }
        return r0;
    L_0x0016:
        r0 = ".";
        r0 = r2.contains(r0);
        if (r0 == 0) goto L_0x002a;
    L_0x001e:
        r0 = 0;
        r1 = 46;
        r1 = r2.lastIndexOf(r1);
        r2 = r2.substring(r0, r1);
        goto L_0x002c;
    L_0x002a:
        r2 = "";
    L_0x002c:
        r0 = android.text.TextUtils.isEmpty(r2);
        if (r0 == 0) goto L_0x0000;
    L_0x0032:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: adn.a(java.lang.String):java.lang.Class");
    }

    public static String[] a(Context context) {
        Class a = adn.a(context.getPackageName());
        int i = 0;
        if (a == null) {
            return new String[0];
        }
        Field[] fields = a.getFields();
        ArrayList arrayList = new ArrayList();
        int length = fields.length;
        while (i < length) {
            Field field = fields[i];
            if (field.getName().contains("define_font_")) {
                int identifier = context.getResources().getIdentifier(field.getName(), "string", context.getPackageName());
                arrayList.add(identifier == 0 ? BuildConfig.FLAVOR : context.getString(identifier));
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
