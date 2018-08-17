package defpackage;

import java.io.IOException;

public enum bck {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String protocol;

    private bck(String str) {
        this.protocol = str;
    }

    public static bck get(String str) {
        if (str.equals(HTTP_1_0.protocol)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.protocol)) {
            return HTTP_1_1;
        }
        if (str.equals(H2_PRIOR_KNOWLEDGE.protocol)) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(HTTP_2.protocol)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.protocol)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.protocol)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    public final String toString() {
        return this.protocol;
    }
}
