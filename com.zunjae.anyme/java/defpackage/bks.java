package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

final class bks extends bkr {
    bks() {
    }

    final bjp a(@Nullable Executor executor) {
        if (executor != null) {
            return new bju(executor);
        }
        throw new AssertionError();
    }

    public final Executor b() {
        return new bkt();
    }
}
