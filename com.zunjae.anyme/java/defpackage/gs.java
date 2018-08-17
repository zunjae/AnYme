package defpackage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class gs {
    final Lock a;
    int b;

    private gs() {
        this.a = new ReentrantLock();
    }
}
