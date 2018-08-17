package defpackage;

public final class wq extends wo {
    public static final wq a = new wq();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof wq)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return wq.class.hashCode();
    }
}
