package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.Nullable;
import ut.vf;

abstract class ut<K, V> implements Serializable, vt<K, V> {
    private transient Map<K, Collection<V>> a;
    private transient int b;
    private transient Set<K> c;
    private transient Collection<V> d;
    private transient Map<K, Collection<V>> e;

    protected ut(Map<K, Collection<V>> map) {
        uq.a(map.isEmpty());
        this.a = map;
    }

    private int a(java.lang.Object r3) {
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
        r0 = 0;
        r1 = r2.a;	 Catch:{ NullPointerException -> 0x0017, NullPointerException -> 0x0017 }
        r3 = r1.remove(r3);	 Catch:{ NullPointerException -> 0x0017, NullPointerException -> 0x0017 }
        r3 = (java.util.Collection) r3;	 Catch:{ NullPointerException -> 0x0017, NullPointerException -> 0x0017 }
        if (r3 == 0) goto L_0x0017;
    L_0x000b:
        r0 = r3.size();
        r3.clear();
        r3 = r2.b;
        r3 = r3 - r0;
        r2.b = r3;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.a(java.lang.Object):int");
    }

    static /* synthetic */ int a(ut utVar, int i) {
        int i2 = utVar.b + i;
        utVar.b = i2;
        return i2;
    }

    private Collection<V> a(@Nullable K k, Collection<V> collection) {
        return collection instanceof SortedSet ? new vk(this, k, (SortedSet) collection, null) : collection instanceof Set ? new vj(this, k, (Set) collection) : collection instanceof List ? a((Object) k, (List) collection, null) : new vf(this, k, collection, null);
    }

    static /* synthetic */ Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    private List<V> a(K k, List<V> list, @Nullable vf vfVar) {
        return list instanceof RandomAccess ? new va(this, k, list, vfVar) : new vh(this, k, list, vfVar);
    }

    static /* synthetic */ int b(ut utVar, int i) {
        int i2 = utVar.b - i;
        utVar.b = i2;
        return i2;
    }

    public boolean a(@Nullable K k, @Nullable V v) {
        Collection collection = (Collection) this.a.get(k);
        if (collection == null) {
            collection = b();
            this.a.put(k, collection);
        }
        if (!collection.add(v)) {
            return false;
        }
        this.b++;
        return true;
    }

    abstract Collection<V> b();

    public Collection<V> b(@Nullable K k) {
        Collection collection = (Collection) this.a.get(k);
        if (collection == null) {
            collection = b();
        }
        return a((Object) k, collection);
    }

    public boolean c() {
        return this.b == 0;
    }

    public boolean c(@Nullable Object obj) {
        for (Collection contains : this.a.values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        for (Collection clear : this.a.values()) {
            clear.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public Set<K> e() {
        Set<K> set = this.c;
        if (set != null) {
            return set;
        }
        Map map = this.a;
        Set<K> vcVar = map instanceof SortedMap ? new vc(this, (SortedMap) map) : new uy(this, map);
        this.c = vcVar;
        return vcVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vt)) {
            return false;
        }
        return this.a.equals(((vt) obj).g());
    }

    public Collection<V> f() {
        Collection<V> collection = this.d;
        if (collection != null) {
            return collection;
        }
        collection = new ve();
        this.d = collection;
        return collection;
    }

    public Map<K, Collection<V>> g() {
        Map<K, Collection<V>> map = this.e;
        if (map != null) {
            return map;
        }
        Map map2 = this.a;
        Map<K, Collection<V>> vbVar = map2 instanceof SortedMap ? new vb(this, (SortedMap) map2) : new uu(this, map2);
        this.e = vbVar;
        return vbVar;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
