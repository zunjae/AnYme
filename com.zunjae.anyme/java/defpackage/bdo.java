package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class bdo {
    private final List<bbi> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public bdo(List<bbi> list) {
        this.a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.a.size(); i++) {
            if (((bbi) this.a.get(i)).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final bbi a(SSLSocket sSLSocket) {
        bbi bbi;
        int size = this.a.size();
        for (int i = this.b; i < size; i++) {
            bbi = (bbi) this.a.get(i);
            if (bbi.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
        }
        bbi = null;
        if (bbi != null) {
            this.c = b(sSLSocket);
            bcz.a.a(bbi, sSLSocket, this.d);
            return bbi;
        }
        StringBuilder stringBuilder = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        stringBuilder.append(this.d);
        stringBuilder.append(", modes=");
        stringBuilder.append(this.a);
        stringBuilder.append(", supported protocols=");
        stringBuilder.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(stringBuilder.toString());
    }

    public final boolean a(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (!z) {
            if (!(iOException instanceof SSLProtocolException)) {
                return false;
            }
        }
        return true;
    }
}
