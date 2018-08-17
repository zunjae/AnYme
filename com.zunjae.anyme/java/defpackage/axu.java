package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import mehdi.sakout.fancybuttons.R;

public final class axu<E extends axt & ayg & ayc> extends PriorityBlockingQueue<E> {
    final Queue<E> a = new LinkedList();
    private final ReentrantLock b = new ReentrantLock();

    private E a(int i, Long l, TimeUnit timeUnit) {
        Object take;
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                take = super.take();
                break;
            case tw.a /*1*/:
                take = super.peek();
                break;
            case tw.b /*2*/:
                take = super.poll();
                break;
            case f.c /*3*/:
                take = super.poll(l.longValue(), timeUnit);
                break;
            default:
                return null;
        }
        return (axt) take;
    }

    private boolean a(int i, E e) {
        try {
            this.b.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.a.offer(e);
            return offer;
        } finally {
            this.b.unlock();
        }
    }

    private static <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, objArr, 0, length);
        System.arraycopy(tArr2, 0, objArr, length, length2);
        return objArr;
    }

    private E b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r2 = this;
        r0 = 1;
        r1 = 0;
        r0 = r2.b(r0, r1, r1);	 Catch:{ InterruptedException -> 0x0007 }
        return r0;
    L_0x0007:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: axu.b():E");
    }

    private E b(int i, Long l, TimeUnit timeUnit) {
        axt a;
        while (true) {
            a = a(i, l, timeUnit);
            if (a == null || a.g()) {
                return a;
            }
            a(i, a);
        }
        return a;
    }

    private E c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r2 = this;
        r0 = 2;
        r1 = 0;
        r0 = r2.b(r0, r1, r1);	 Catch:{ InterruptedException -> 0x0007 }
        return r0;
    L_0x0007:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: axu.c():E");
    }

    public final void a() {
        try {
            this.b.lock();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                axt axt = (axt) it.next();
                if (axt.g()) {
                    super.offer(axt);
                    it.remove();
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void clear() {
        try {
            this.b.lock();
            this.a.clear();
            super.clear();
        } finally {
            this.b.unlock();
        }
    }

    public final boolean contains(Object obj) {
        try {
            boolean z;
            this.b.lock();
            if (!super.contains(obj)) {
                if (!this.a.contains(obj)) {
                    z = false;
                    this.b.unlock();
                    return z;
                }
            }
            z = true;
            this.b.unlock();
            return z;
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    public final int drainTo(Collection<? super E> collection) {
        int drainTo;
        try {
            this.b.lock();
            drainTo = super.drainTo(collection) + this.a.size();
            while (!this.a.isEmpty()) {
                collection.add(this.a.poll());
            }
            return drainTo;
        } finally {
            drainTo = this.b;
            drainTo.unlock();
        }
    }

    public final int drainTo(Collection<? super E> collection, int i) {
        try {
            this.b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.a.isEmpty() && drainTo <= i) {
                collection.add(this.a.poll());
                drainTo++;
            }
            this.b.unlock();
            return drainTo;
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    public final /* synthetic */ Object peek() {
        return b();
    }

    public final /* synthetic */ Object poll() {
        return c();
    }

    public final /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return b(3, Long.valueOf(j), timeUnit);
    }

    public final boolean remove(Object obj) {
        try {
            boolean z;
            this.b.lock();
            if (!super.remove(obj)) {
                if (!this.a.remove(obj)) {
                    z = false;
                    this.b.unlock();
                    return z;
                }
            }
            z = true;
            this.b.unlock();
            return z;
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            this.b.lock();
            boolean removeAll = this.a.removeAll(collection) | super.removeAll(collection);
            return removeAll;
        } finally {
            this.b.unlock();
        }
    }

    public final int size() {
        try {
            this.b.lock();
            int size = this.a.size() + super.size();
            return size;
        } finally {
            this.b.unlock();
        }
    }

    public final /* synthetic */ Object take() {
        return b(0, null, null);
    }

    public final Object[] toArray() {
        try {
            this.b.lock();
            Object[] a = axu.a(super.toArray(), this.a.toArray());
            return a;
        } finally {
            this.b.unlock();
        }
    }

    public final <T> T[] toArray(T[] tArr) {
        try {
            this.b.lock();
            tArr = axu.a(super.toArray(tArr), this.a.toArray(tArr));
            return tArr;
        } finally {
            this.b.unlock();
        }
    }
}
