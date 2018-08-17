package defpackage;

import java.io.IOException;

public final class bgc extends IOException {
    public final bes a;

    public bgc(bes bes) {
        super("stream was reset: ".concat(String.valueOf(bes)));
        this.a = bes;
    }
}
