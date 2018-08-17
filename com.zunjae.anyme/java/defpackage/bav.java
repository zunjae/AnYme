package defpackage;

import java.io.Closeable;
import java.io.Flushable;

public final class bav implements Closeable, Flushable {
    final bdm a;
    final bdj b;

    public final void close() {
        this.b.close();
    }

    public final void flush() {
        this.b.flush();
    }
}
