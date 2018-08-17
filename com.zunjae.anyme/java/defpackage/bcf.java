package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public final class bcf {
    private final bhi a;
    private bcd b;
    private final List<bcg> c;

    public bcf() {
        this(UUID.randomUUID().toString());
    }

    private bcf(String str) {
        this.b = bce.a;
        this.c = new ArrayList();
        this.a = bhi.a(str);
    }

    public final bce a() {
        if (!this.c.isEmpty()) {
            return new bce(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }

    public final bcf a(@Nullable bbx bbx, bcp bcp) {
        return a(bcg.a(bbx, bcp));
    }

    public final bcf a(bcd bcd) {
        if (bcd == null) {
            throw new NullPointerException("type == null");
        } else if (bcd.a().equals("multipart")) {
            this.b = bcd;
            return this;
        } else {
            throw new IllegalArgumentException("multipart != ".concat(String.valueOf(bcd)));
        }
    }

    public final bcf a(bcg bcg) {
        if (bcg != null) {
            this.c.add(bcg);
            return this;
        }
        throw new NullPointerException("part == null");
    }
}
