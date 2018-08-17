package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import yf.yh;
import yf.yj;

public final class yf<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean f = true;
    private static final Comparator<Comparable> g = new yg();
    Comparator<? super K> a;
    ym<K, V> b;
    int c;
    int d;
    final ym<K, V> e;
    private yh h;
    private yj i;

    public yf() {
        this(g);
    }

    private yf(Comparator<? super K> comparator) {
        Comparator comparator2;
        this.c = 0;
        this.d = 0;
        this.e = new ym();
        if (comparator == null) {
            comparator2 = g;
        }
        this.a = comparator2;
    }

    private ym<K, V> a(K k, boolean z) {
        Comparator comparator = this.a;
        ym ymVar = this.b;
        int compareTo;
        if (ymVar != null) {
            Comparable comparable = comparator == g ? (Comparable) k : null;
            while (true) {
                compareTo = comparable != null ? comparable.compareTo(ymVar.f) : comparator.compare(k, ymVar.f);
                if (compareTo != 0) {
                    ym ymVar2 = compareTo < 0 ? ymVar.b : ymVar.c;
                    if (ymVar2 == null) {
                        break;
                    }
                    ymVar = ymVar2;
                } else {
                    return ymVar;
                }
            }
        }
        compareTo = 0;
        if (!z) {
            return null;
        }
        ym<K, V> ymVar3;
        ym ymVar4 = this.e;
        if (ymVar == null) {
            if (comparator == g) {
                if (!(k instanceof Comparable)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(k.getClass().getName());
                    stringBuilder.append(" is not Comparable");
                    throw new ClassCastException(stringBuilder.toString());
                }
            }
            ymVar3 = new ym(ymVar, k, ymVar4, ymVar4.e);
            this.b = ymVar3;
        } else {
            ymVar3 = new ym(ymVar, k, ymVar4, ymVar4.e);
            if (compareTo < 0) {
                ymVar.b = ymVar3;
            } else {
                ymVar.c = ymVar3;
            }
            b(ymVar, f);
        }
        this.c++;
        this.d++;
        return ymVar3;
    }

    private void a(ym<K, V> ymVar) {
        ym ymVar2 = ymVar.b;
        ym ymVar3 = ymVar.c;
        ym ymVar4 = ymVar3.b;
        ym ymVar5 = ymVar3.c;
        ymVar.c = ymVar4;
        if (ymVar4 != null) {
            ymVar4.a = ymVar;
        }
        a((ym) ymVar, ymVar3);
        ymVar3.b = ymVar;
        ymVar.a = ymVar3;
        int i = 0;
        ymVar.h = Math.max(ymVar2 != null ? ymVar2.h : 0, ymVar4 != null ? ymVar4.h : 0) + 1;
        int i2 = ymVar.h;
        if (ymVar5 != null) {
            i = ymVar5.h;
        }
        ymVar3.h = Math.max(i2, i) + 1;
    }

    private void a(ym<K, V> ymVar, ym<K, V> ymVar2) {
        ym ymVar3 = ymVar.a;
        ymVar.a = null;
        if (ymVar2 != null) {
            ymVar2.a = ymVar3;
        }
        if (ymVar3 == null) {
            this.b = ymVar2;
        } else if (ymVar3.b == ymVar) {
            ymVar3.b = ymVar2;
        } else {
            if (!f) {
                if (ymVar3.c != ymVar) {
                    throw new AssertionError();
                }
            }
            ymVar3.c = ymVar2;
        }
    }

    private defpackage.ym<K, V> b(java.lang.Object r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r2 = this;
        r0 = 0;
        if (r3 == 0) goto L_0x0009;
    L_0x0003:
        r1 = 0;
        r3 = r2.a(r3, r1);	 Catch:{ ClassCastException -> 0x0009 }
        return r3;
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.b(java.lang.Object):ym<K, V>");
    }

    private void b(ym<K, V> ymVar) {
        ym ymVar2 = ymVar.b;
        ym ymVar3 = ymVar.c;
        ym ymVar4 = ymVar2.b;
        ym ymVar5 = ymVar2.c;
        ymVar.b = ymVar5;
        if (ymVar5 != null) {
            ymVar5.a = ymVar;
        }
        a((ym) ymVar, ymVar2);
        ymVar2.c = ymVar;
        ymVar.a = ymVar2;
        int i = 0;
        ymVar.h = Math.max(ymVar3 != null ? ymVar3.h : 0, ymVar5 != null ? ymVar5.h : 0) + 1;
        int i2 = ymVar.h;
        if (ymVar4 != null) {
            i = ymVar4.h;
        }
        ymVar2.h = Math.max(i2, i) + 1;
    }

    private void b(ym<K, V> ymVar, boolean z) {
        ym ymVar2;
        while (ymVar2 != null) {
            ym ymVar3 = ymVar2.b;
            ym ymVar4 = ymVar2.c;
            int i = 0;
            int i2 = ymVar3 != null ? ymVar3.h : 0;
            int i3 = ymVar4 != null ? ymVar4.h : 0;
            int i4 = i2 - i3;
            ym ymVar5;
            if (i4 != -2) {
                if (i4 != 2) {
                    if (i4 != 0) {
                        if (!(f || i4 == -1)) {
                            if (i4 != 1) {
                                throw new AssertionError();
                            }
                        }
                        ymVar2.h = Math.max(i2, i3) + 1;
                        if (!z) {
                            break;
                        }
                    } else {
                        ymVar2.h = i2 + 1;
                        if (z) {
                            return;
                        }
                    }
                } else {
                    ymVar4 = ymVar3.b;
                    ymVar5 = ymVar3.c;
                    i2 = ymVar5 != null ? ymVar5.h : 0;
                    if (ymVar4 != null) {
                        i = ymVar4.h;
                    }
                    i -= i2;
                    if (i != 1) {
                        if (i != 0 || z) {
                            if (!f) {
                                if (i != -1) {
                                    throw new AssertionError();
                                }
                            }
                            a(ymVar3);
                        }
                    }
                    b(ymVar2);
                    if (z) {
                        break;
                    }
                }
            } else {
                ymVar3 = ymVar4.b;
                ymVar5 = ymVar4.c;
                i2 = ymVar5 != null ? ymVar5.h : 0;
                if (ymVar3 != null) {
                    i = ymVar3.h;
                }
                i -= i2;
                if (i != -1) {
                    if (i != 0 || z) {
                        if (!f) {
                            if (i != 1) {
                                throw new AssertionError();
                            }
                        }
                        b(ymVar4);
                    }
                }
                a(ymVar2);
                if (z) {
                    break;
                }
            }
            ymVar2 = ymVar2.a;
        }
    }

    final ym<K, V> a(Object obj) {
        ym b = b(obj);
        if (b != null) {
            a(b, (boolean) f);
        }
        return b;
    }

    final ym<K, V> a(Entry<?, ?> entry) {
        ym<K, V> b = b(entry.getKey());
        Object obj = 1;
        if (b != null) {
            Object obj2 = b.g;
            Object value = entry.getValue();
            if (obj2 != value) {
                if (obj2 == null || !obj2.equals(value)) {
                    value = null;
                    if (value != null) {
                        return obj != null ? b : null;
                    }
                }
            }
            value = 1;
            if (value != null) {
                if (obj != null) {
                }
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    final void a(ym<K, V> ymVar, boolean z) {
        ym ymVar2;
        if (z) {
            ymVar2 = ymVar.e;
            ymVar2.d = ymVar.d;
            ymVar.d.e = ymVar2;
        }
        ymVar2 = ymVar.b;
        ym ymVar3 = ymVar.c;
        ym ymVar4 = ymVar.a;
        int i = 0;
        if (ymVar2 == null || ymVar3 == null) {
            if (ymVar2 != null) {
                a((ym) ymVar, ymVar2);
                ymVar.b = null;
            } else if (ymVar3 != null) {
                a((ym) ymVar, ymVar3);
                ymVar.c = null;
            } else {
                a((ym) ymVar, null);
            }
            b(ymVar4, false);
            this.c--;
            this.d++;
            return;
        }
        int i2;
        if (ymVar2.h > ymVar3.h) {
            while (true) {
                ymVar3 = ymVar2;
                ymVar2 = ymVar2.c;
                if (ymVar2 == null) {
                    break;
                }
            }
        } else {
            while (true) {
                ymVar2 = ymVar3.b;
                if (ymVar2 == null) {
                    break;
                }
                ymVar3 = ymVar2;
            }
        }
        a(ymVar3, false);
        ymVar2 = ymVar.b;
        if (ymVar2 != null) {
            i2 = ymVar2.h;
            ymVar3.b = ymVar2;
            ymVar2.a = ymVar3;
            ymVar.b = null;
        } else {
            i2 = 0;
        }
        ymVar2 = ymVar.c;
        if (ymVar2 != null) {
            i = ymVar2.h;
            ymVar3.c = ymVar2;
            ymVar2.a = ymVar3;
            ymVar.c = null;
        }
        ymVar3.h = Math.max(i2, i) + 1;
        a((ym) ymVar, ymVar3);
    }

    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        ym ymVar = this.e;
        ymVar.e = ymVar;
        ymVar.d = ymVar;
    }

    public final boolean containsKey(Object obj) {
        return b(obj) != null ? f : false;
    }

    public final Set<Entry<K, V>> entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        set = new yh(this);
        this.h = set;
        return set;
    }

    public final V get(Object obj) {
        ym b = b(obj);
        return b != null ? b.g : null;
    }

    public final Set<K> keySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        set = new yj(this);
        this.i = set;
        return set;
    }

    public final V put(K k, V v) {
        if (k != null) {
            ym a = a((Object) k, (boolean) f);
            V v2 = a.g;
            a.g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public final V remove(Object obj) {
        ym a = a(obj);
        return a != null ? a.g : null;
    }

    public final int size() {
        return this.c;
    }
}
