package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class ail {
    private final ConcurrentMap<Class<?>, Set<aiq>> a;
    private final ConcurrentMap<Class<?>, air> b;
    private final String c;
    private final aiw d;
    private final ais e;
    private final ThreadLocal<ConcurrentLinkedQueue<aio>> f;
    private final ThreadLocal<Boolean> g;
    private final ConcurrentMap<Class<?>, Set<Class<?>>> h;

    public ail() {
        this("default");
    }

    private ail(aiw aiw, String str) {
        this(aiw, str, ais.a);
    }

    private ail(aiw aiw, String str, ais ais) {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.f = new aim(this);
        this.g = new ain(this);
        this.h = new ConcurrentHashMap();
        this.d = aiw;
        this.c = str;
        this.e = ais;
    }

    private ail(String str) {
        this(aiw.b, str);
    }

    private Set<aiq> a(Class<?> cls) {
        return (Set) this.a.get(cls);
    }

    private void a() {
        if (!((Boolean) this.g.get()).booleanValue()) {
            this.g.set(Boolean.TRUE);
            while (true) {
                try {
                    aio aio = (aio) ((ConcurrentLinkedQueue) this.f.get()).poll();
                    if (aio == null) {
                        break;
                    } else if (aio.b.a()) {
                        ail.a(aio.a, aio.b);
                    }
                } finally {
                    this.g.set(Boolean.FALSE);
                }
            }
        }
    }

    private static void a(aiq aiq, air air) {
        Object c;
        try {
            c = air.c();
        } catch (InvocationTargetException e) {
            StringBuilder stringBuilder = new StringBuilder("Producer ");
            stringBuilder.append(air);
            stringBuilder.append(" threw an exception.");
            ail.a(stringBuilder.toString(), e);
            c = null;
        }
        if (c != null) {
            ail.a(c, aiq);
        }
    }

    private static void a(Object obj, aiq aiq) {
        try {
            aiq.a(obj);
        } catch (InvocationTargetException e) {
            StringBuilder stringBuilder = new StringBuilder("Could not dispatch event: ");
            stringBuilder.append(obj.getClass());
            stringBuilder.append(" to handler ");
            stringBuilder.append(aiq);
            ail.a(stringBuilder.toString(), e);
        }
    }

    private static void a(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(cause.getMessage());
            throw new RuntimeException(stringBuilder.toString(), cause);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(invocationTargetException.getMessage());
        throw new RuntimeException(stringBuilder.toString(), invocationTargetException);
    }

    private static Set<Class<?>> b(Class<?> cls) {
        List linkedList = new LinkedList();
        Set<Class<?>> hashSet = new HashSet();
        while (true) {
            Object superclass;
            linkedList.add(superclass);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                superclass = cls2.getSuperclass();
                if (superclass != null) {
                }
            }
            return hashSet;
        }
    }

    public final void a(Object obj) {
        this.d.a(this);
        Map a = this.e.a(obj);
        for (Class cls : a.keySet()) {
            air air = (air) a.get(cls);
            air air2 = (air) this.b.putIfAbsent(cls, air);
            if (air2 == null) {
                Set<aiq> set = (Set) this.a.get(cls);
                if (!(set == null || set.isEmpty())) {
                    for (aiq a2 : set) {
                        ail.a(a2, air);
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder("Producer method for type ");
                stringBuilder.append(cls);
                stringBuilder.append(" found on type ");
                stringBuilder.append(air.a.getClass());
                stringBuilder.append(", but already registered by type ");
                stringBuilder.append(air2.a.getClass());
                stringBuilder.append(".");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        Map b = this.e.b(obj);
        for (Class cls2 : b.keySet()) {
            Set set2 = (Set) this.a.get(cls2);
            if (set2 == null) {
                set2 = new CopyOnWriteArraySet();
                Set set3 = (Set) this.a.putIfAbsent(cls2, set2);
                if (set3 != null) {
                    set2 = set3;
                }
            }
            if (!set2.addAll((Set) b.get(cls2))) {
                throw new IllegalArgumentException("Object already registered.");
            }
        }
        for (Entry entry : b.entrySet()) {
            air air3 = (air) this.b.get((Class) entry.getKey());
            if (air3 != null && air3.a()) {
                for (aiq aiq : (Set) entry.getValue()) {
                    if (!air3.a()) {
                        break;
                    } else if (aiq.a()) {
                        ail.a(aiq, air3);
                    }
                }
            }
        }
    }

    public final void b(Object obj) {
        this.d.a(this);
        for (Entry entry : this.e.a(obj).entrySet()) {
            Class cls = (Class) entry.getKey();
            air air = (air) this.b.get(cls);
            air air2 = (air) entry.getValue();
            if (air2 == null || !air2.equals(air)) {
                StringBuilder stringBuilder = new StringBuilder("Missing event producer for an annotated method. Is ");
                stringBuilder.append(obj.getClass());
                stringBuilder.append(" registered?");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            ((air) this.b.remove(cls)).b();
        }
        for (Entry entry2 : this.e.b(obj).entrySet()) {
            Set<aiq> a = a((Class) entry2.getKey());
            Collection collection = (Collection) entry2.getValue();
            if (a == null || !a.containsAll(collection)) {
                stringBuilder = new StringBuilder("Missing event handler for an annotated method. Is ");
                stringBuilder.append(obj.getClass());
                stringBuilder.append(" registered?");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            for (aiq aiq : a) {
                if (collection.contains(aiq)) {
                    aiq.b();
                }
            }
            a.removeAll(collection);
        }
    }

    public final void c(Object obj) {
        if (obj != null) {
            this.d.a(this);
            Class cls = obj.getClass();
            Set set = (Set) this.h.get(cls);
            if (set == null) {
                set = ail.b(cls);
                Set set2 = (Set) this.h.putIfAbsent(cls, set);
                if (set2 != null) {
                    set = set2;
                }
            }
            Object obj2 = null;
            for (Class a : r1) {
                Set<aiq> a2 = a(a);
                if (!(a2 == null || a2.isEmpty())) {
                    obj2 = 1;
                    for (aiq aio : a2) {
                        ((ConcurrentLinkedQueue) this.f.get()).offer(new aio(obj, aio));
                    }
                }
            }
            if (obj2 == null && !(obj instanceof aip)) {
                c(new aip(this, obj));
            }
            a();
            return;
        }
        throw new NullPointerException("Event to post must not be null.");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[Bus \"");
        stringBuilder.append(this.c);
        stringBuilder.append("\"]");
        return stringBuilder.toString();
    }
}
