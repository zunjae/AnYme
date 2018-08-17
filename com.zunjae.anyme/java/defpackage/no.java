package defpackage;

import java.security.MessageDigest;

public final class no implements eg {
    private final String a;

    public no(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Signature cannot be null!");
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.a.getBytes("UTF-8"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.a.equals(((no) obj).a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StringSignature{signature='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
