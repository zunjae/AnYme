package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

final class er implements es {
    private er() {
    }

    public final HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
