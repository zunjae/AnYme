package defpackage;

public final class bei {
    public final bck a;
    public final int b;
    public final String c;

    private bei(bck bck, int i, String str) {
        this.a = bck;
        this.b = i;
        this.c = str;
    }

    public static defpackage.bei a(java.lang.String r8) {
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
        r0 = "HTTP/1.";
        r0 = r8.startsWith(r0);
        r1 = 4;
        r2 = 32;
        r3 = 9;
        if (r0 == 0) goto L_0x004d;
    L_0x000d:
        r0 = r8.length();
        if (r0 < r3) goto L_0x003d;
    L_0x0013:
        r0 = 8;
        r0 = r8.charAt(r0);
        if (r0 != r2) goto L_0x003d;
    L_0x001b:
        r0 = 7;
        r0 = r8.charAt(r0);
        r0 = r0 + -48;
        if (r0 != 0) goto L_0x0027;
    L_0x0024:
        r0 = defpackage.bck.HTTP_1_0;
        goto L_0x0058;
    L_0x0027:
        r4 = 1;
        if (r0 != r4) goto L_0x002d;
    L_0x002a:
        r0 = defpackage.bck.HTTP_1_1;
        goto L_0x0058;
    L_0x002d:
        r0 = new java.net.ProtocolException;
        r8 = java.lang.String.valueOf(r8);
        r1 = "Unexpected status line: ";
        r8 = r1.concat(r8);
        r0.<init>(r8);
        throw r0;
    L_0x003d:
        r0 = new java.net.ProtocolException;
        r8 = java.lang.String.valueOf(r8);
        r1 = "Unexpected status line: ";
        r8 = r1.concat(r8);
        r0.<init>(r8);
        throw r0;
    L_0x004d:
        r0 = "ICY ";
        r0 = r8.startsWith(r0);
        if (r0 == 0) goto L_0x00b2;
    L_0x0055:
        r0 = defpackage.bck.HTTP_1_0;
        r3 = 4;
    L_0x0058:
        r4 = r8.length();
        r5 = r3 + 3;
        if (r4 < r5) goto L_0x00a2;
    L_0x0060:
        r4 = r8.substring(r3, r5);	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0092 }
        r6 = "";
        r7 = r8.length();
        if (r7 <= r5) goto L_0x008c;
    L_0x0070:
        r5 = r8.charAt(r5);
        if (r5 != r2) goto L_0x007c;
    L_0x0076:
        r3 = r3 + r1;
        r6 = r8.substring(r3);
        goto L_0x008c;
    L_0x007c:
        r0 = new java.net.ProtocolException;
        r8 = java.lang.String.valueOf(r8);
        r1 = "Unexpected status line: ";
        r8 = r1.concat(r8);
        r0.<init>(r8);
        throw r0;
    L_0x008c:
        r8 = new bei;
        r8.<init>(r0, r4, r6);
        return r8;
    L_0x0092:
        r0 = new java.net.ProtocolException;
        r8 = java.lang.String.valueOf(r8);
        r1 = "Unexpected status line: ";
        r8 = r1.concat(r8);
        r0.<init>(r8);
        throw r0;
    L_0x00a2:
        r0 = new java.net.ProtocolException;
        r8 = java.lang.String.valueOf(r8);
        r1 = "Unexpected status line: ";
        r8 = r1.concat(r8);
        r0.<init>(r8);
        throw r0;
    L_0x00b2:
        r0 = new java.net.ProtocolException;
        r8 = java.lang.String.valueOf(r8);
        r1 = "Unexpected status line: ";
        r8 = r1.concat(r8);
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bei.a(java.lang.String):bei");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a == bck.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        if (this.c != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.c);
        }
        return stringBuilder.toString();
    }
}
