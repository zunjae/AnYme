package defpackage;

import java.io.IOException;

final class qd extends IOException {
    qd() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
