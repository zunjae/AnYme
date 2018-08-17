package defpackage;

import java.util.BitSet;

final class aak extends wz<BitSet> {
    aak() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.BitSet b(defpackage.abn r6) {
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
        r0 = new java.util.BitSet;
        r0.<init>();
        r6.a();
        r1 = r6.f();
        r2 = 0;
        r3 = 0;
    L_0x000e:
        r4 = defpackage.abp.END_ARRAY;
        if (r1 == r4) goto L_0x0062;
    L_0x0012:
        r4 = defpackage.abd.a;
        r5 = r1.ordinal();
        r4 = r4[r5];
        r5 = 1;
        switch(r4) {
            case 1: goto L_0x0050;
            case 2: goto L_0x004b;
            case 3: goto L_0x002e;
            default: goto L_0x001e;
        };
    L_0x001e:
        r6 = new wv;
        r0 = java.lang.String.valueOf(r1);
        r1 = "Invalid bitset value type: ";
        r0 = r1.concat(r0);
        r6.<init>(r0);
        throw r6;
    L_0x002e:
        r1 = r6.h();
        r4 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x003b }
        if (r4 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x0056;
    L_0x0039:
        r5 = 0;
        goto L_0x0056;
    L_0x003b:
        r6 = new wv;
        r0 = java.lang.String.valueOf(r1);
        r1 = "Error: Expecting: bitset number value (1, 0), Found: ";
        r0 = r1.concat(r0);
        r6.<init>(r0);
        throw r6;
    L_0x004b:
        r5 = r6.i();
        goto L_0x0056;
    L_0x0050:
        r1 = r6.m();
        if (r1 == 0) goto L_0x0039;
    L_0x0056:
        if (r5 == 0) goto L_0x005b;
    L_0x0058:
        r0.set(r3);
    L_0x005b:
        r3 = r3 + 1;
        r1 = r6.f();
        goto L_0x000e;
    L_0x0062:
        r6.b();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: aak.b(abn):java.util.BitSet");
    }

    public final /* synthetic */ Object a(abn abn) {
        return aak.b(abn);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        BitSet bitSet = (BitSet) obj;
        abq.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            abq.a((long) bitSet.get(i));
        }
        abq.c();
    }
}
