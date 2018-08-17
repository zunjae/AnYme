package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

final class bbp implements bbo {
    bbp() {
    }

    public final List<InetAddress> a(String str) {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (Throwable e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(String.valueOf(str)));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
        throw new UnknownHostException("hostname == null");
    }
}
