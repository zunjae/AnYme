package defpackage;

import com.mikepenz.fastadapter.q;
import java.util.concurrent.atomic.AtomicLong;

public final class act<Identifiable extends q> extends acs<Identifiable> {
    private final AtomicLong b = new AtomicLong(-2);

    public final long a() {
        return this.b.decrementAndGet();
    }
}
