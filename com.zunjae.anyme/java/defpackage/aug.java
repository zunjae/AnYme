package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public final class aug {
    public static java.lang.String a(android.content.Context r1) {
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
        r0 = "clipboard";	 Catch:{ Exception -> 0x001a }
        r1 = r1.getSystemService(r0);	 Catch:{ Exception -> 0x001a }
        r1 = (android.content.ClipboardManager) r1;	 Catch:{ Exception -> 0x001a }
        r1 = r1.getPrimaryClip();	 Catch:{ Exception -> 0x001a }
        r0 = 0;	 Catch:{ Exception -> 0x001a }
        r1 = r1.getItemAt(r0);	 Catch:{ Exception -> 0x001a }
        r1 = r1.getText();	 Catch:{ Exception -> 0x001a }
        r1 = r1.toString();	 Catch:{ Exception -> 0x001a }
        return r1;
    L_0x001a:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: aug.a(android.content.Context):java.lang.String");
    }

    public static void a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("AnYme", str));
    }
}
