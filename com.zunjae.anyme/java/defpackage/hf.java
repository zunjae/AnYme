package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class hf {
    private final nt<eg, String> a = new nt(1000);

    hf() {
    }

    public final String a(eg egVar) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.b((Object) egVar);
        }
        if (str == null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                egVar.a(instance);
                str = nw.a(instance.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.a) {
                this.a.b(egVar, str);
            }
        }
        return str;
    }
}
