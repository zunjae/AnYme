package com.zunjae.anyme.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public abstract class b extends DialogFragment {
    protected Context a;
    private final String b = "AbstractDialog";

    protected final void b() {
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
        r3 = this;
        r0 = r3.getDialog();	 Catch:{ Exception -> 0x0015 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ Exception -> 0x0015 }
    L_0x0006:
        r1 = r0.getWindow();	 Catch:{ Exception -> 0x0015 }
        if (r1 == 0) goto L_0x0015;	 Catch:{ Exception -> 0x0015 }
    L_0x000c:
        r0 = r0.getWindow();	 Catch:{ Exception -> 0x0015 }
        r1 = -1;	 Catch:{ Exception -> 0x0015 }
        r2 = -2;	 Catch:{ Exception -> 0x0015 }
        r0.setLayout(r1, r2);	 Catch:{ Exception -> 0x0015 }
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.dialogs.b.b():void");
    }

    public void onActivityCreated(Bundle bundle) {
        getDialog().requestWindowFeature(1);
        this.a = getActivity();
        super.onActivityCreated(bundle);
    }
}
