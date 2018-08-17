package defpackage;

import java.security.MessageDigest;

final class fs implements eg {
    private final String a;
    private final eg b;

    public fs(String str, eg egVar) {
        this.a = str;
        this.b = egVar;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.a.getBytes("UTF-8"));
        this.b.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                fs fsVar = (fs) obj;
                return this.a.equals(fsVar.a) && this.b.equals(fsVar.b);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
