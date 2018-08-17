package defpackage;

import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

public final class bgj extends bgo {
    private bgj() {
    }

    public static defpackage.bgo a() {
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
        r0 = 0;
        r1 = "org.conscrypt.ConscryptEngineSocket";	 Catch:{ ClassNotFoundException -> 0x0013 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0013 }
        r1 = org.conscrypt.Conscrypt.isAvailable();	 Catch:{ ClassNotFoundException -> 0x0013 }
        if (r1 != 0) goto L_0x000d;	 Catch:{ ClassNotFoundException -> 0x0013 }
    L_0x000c:
        return r0;	 Catch:{ ClassNotFoundException -> 0x0013 }
    L_0x000d:
        r1 = new bgj;	 Catch:{ ClassNotFoundException -> 0x0013 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0013 }
        return r1;
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgj.a():bgo");
    }

    @Nullable
    public final String a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.a(sSLSocket);
    }

    public final void a(SSLSocket sSLSocket, String str, List<bck> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) bgo.a((List) list).toArray(new String[0]));
            return;
        }
        super.a(sSLSocket, str, (List) list);
    }

    public final void a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public final SSLContext b() {
        try {
            return SSLContext.getInstance("TLS", new OpenSSLProvider());
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
