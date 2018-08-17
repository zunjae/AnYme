package org.jsoup.helper;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class c implements HostnameVerifier {
    c() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
