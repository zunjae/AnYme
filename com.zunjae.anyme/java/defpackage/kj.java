package defpackage;

import java.security.MessageDigest;
import java.util.UUID;

final class kj implements eg {
    private final UUID a;

    public kj() {
        this(UUID.randomUUID());
    }

    private kj(UUID uuid) {
        this.a = uuid;
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final boolean equals(Object obj) {
        return obj instanceof kj ? ((kj) obj).a.equals(this.a) : false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
