package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

public abstract class azi<V> implements Callable<V> {
    protected azi() {
    }

    protected abstract V a();

    protected abstract void b();

    public V call() {
        Throwable th;
        Object obj = 1;
        try {
            V a = a();
            try {
                b();
                return a;
            } catch (IOException e) {
                throw new azh(e);
            }
        } catch (azh e2) {
            throw e2;
        } catch (IOException e3) {
            throw new azh(e3);
        } catch (Throwable th2) {
            th = th2;
            b();
            throw th;
        }
    }
}
