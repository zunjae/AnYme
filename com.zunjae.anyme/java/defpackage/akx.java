package defpackage;

final class akx implements aka {
    final /* synthetic */ aks a;

    akx(aks aks) {
        this.a = aks;
    }

    public final void b(android.preference.Preference r3) {
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
        r2 = this;
        r3 = android.webkit.WebStorage.getInstance();	 Catch:{ Exception -> 0x001f }
        r3.deleteAllData();	 Catch:{ Exception -> 0x001f }
        r3 = r2.a;	 Catch:{ Exception -> 0x001f }
        r3 = r3.getActivity();	 Catch:{ Exception -> 0x001f }
        defpackage.alb.a(r3);	 Catch:{ Exception -> 0x001f }
        r3 = r2.a;	 Catch:{ Exception -> 0x001f }
        r3 = r3.b;	 Catch:{ Exception -> 0x001f }
        r0 = "Data cleared";	 Catch:{ Exception -> 0x001f }
        r1 = 0;	 Catch:{ Exception -> 0x001f }
        r3 = android.widget.Toast.makeText(r3, r0, r1);	 Catch:{ Exception -> 0x001f }
        r3.show();	 Catch:{ Exception -> 0x001f }
        return;
    L_0x001f:
        r3 = r2.a;
        r3 = r3.b;
        r0 = "Could not clear cache... Go to your Android settings, Application Manager and deleteAnime cache manually";
        r1 = 1;
        r3 = android.widget.Toast.makeText(r3, r0, r1);
        r3.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: akx.b(android.preference.Preference):void");
    }
}
