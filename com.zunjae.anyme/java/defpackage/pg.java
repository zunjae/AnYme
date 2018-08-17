package defpackage;

import java.util.HashSet;

final class pg extends HashSet<po> {
    pg() {
        add(po.START);
        add(po.RESUME);
        add(po.PAUSE);
        add(po.STOP);
    }
}
