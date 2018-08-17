package defpackage;

import javax.annotation.Nullable;

public final class bcg {
    @Nullable
    final bbx a;
    final bcp b;

    private bcg(@Nullable bbx bbx, bcp bcp) {
        this.a = bbx;
        this.b = bcp;
    }

    public static bcg a(@Nullable bbx bbx, bcp bcp) {
        if (bcp != null) {
            if (bbx != null) {
                if (bbx.a("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
            }
            if (bbx != null) {
                if (bbx.a("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
            }
            return new bcg(bbx, bcp);
        }
        throw new NullPointerException("body == null");
    }
}
