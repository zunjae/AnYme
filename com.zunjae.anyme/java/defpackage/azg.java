package defpackage;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class azg implements azf {
    azg() {
    }

    public final HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final HttpURLConnection a(URL url, Proxy proxy) {
        return (HttpURLConnection) url.openConnection(proxy);
    }
}
