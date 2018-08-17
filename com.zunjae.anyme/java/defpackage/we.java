package defpackage;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class we {
    private static final abm<?> a = abm.a(Object.class);
    private final ThreadLocal<Map<abm<?>, wk<?>>> b;
    private final Map<abm<?>, wz<?>> c;
    private final List<xb> d;
    private final xm e;
    private final yb f;
    private final wd g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final zd m;

    public we() {
        this(yb.a, vx.IDENTITY, Collections.emptyMap(), ww.DEFAULT, Collections.emptyList());
    }

    private we(yb ybVar, wd wdVar, Map<Type, wl<?>> map, ww wwVar, List<xb> list) {
        this.b = new ThreadLocal();
        this.c = new ConcurrentHashMap();
        this.e = new xm(map);
        this.f = ybVar;
        this.g = wdVar;
        this.h = false;
        this.j = false;
        this.i = true;
        this.k = false;
        this.l = false;
        List arrayList = new ArrayList();
        arrayList.add(zy.Y);
        arrayList.add(zk.a);
        arrayList.add(ybVar);
        arrayList.addAll(list);
        arrayList.add(zy.D);
        arrayList.add(zy.m);
        arrayList.add(zy.g);
        arrayList.add(zy.i);
        arrayList.add(zy.k);
        wz whVar = wwVar == ww.DEFAULT ? zy.t : new wh();
        arrayList.add(zy.a(Long.TYPE, Long.class, whVar));
        arrayList.add(zy.a(Double.TYPE, Double.class, new wf(this)));
        arrayList.add(zy.a(Float.TYPE, Float.class, new wg(this)));
        arrayList.add(zy.x);
        arrayList.add(zy.o);
        arrayList.add(zy.q);
        arrayList.add(zy.a(AtomicLong.class, new wi(whVar).a()));
        arrayList.add(zy.a(AtomicLongArray.class, new wj(whVar).a()));
        arrayList.add(zy.s);
        arrayList.add(zy.z);
        arrayList.add(zy.F);
        arrayList.add(zy.H);
        arrayList.add(zy.a(BigDecimal.class, zy.B));
        arrayList.add(zy.a(BigInteger.class, zy.C));
        arrayList.add(zy.J);
        arrayList.add(zy.L);
        arrayList.add(zy.P);
        arrayList.add(zy.R);
        arrayList.add(zy.W);
        arrayList.add(zy.N);
        arrayList.add(zy.d);
        arrayList.add(zb.a);
        arrayList.add(zy.U);
        arrayList.add(zt.a);
        arrayList.add(zr.a);
        arrayList.add(zy.S);
        arrayList.add(yx.a);
        arrayList.add(zy.b);
        arrayList.add(new yz(this.e));
        arrayList.add(new zi(this.e));
        this.m = new zd(this.e);
        arrayList.add(this.m);
        arrayList.add(zy.Z);
        arrayList.add(new zn(this.e, wdVar, ybVar, this.m));
        this.d = Collections.unmodifiableList(arrayList);
    }

    private <T> T a(abn abn, Type type) {
        boolean q = abn.q();
        boolean z = true;
        abn.a(true);
        try {
            abn.f();
            z = false;
            T a = a(abm.a(type)).a(abn);
            abn.a(q);
            return a;
        } catch (Throwable e) {
            if (z) {
                abn.a(q);
                return null;
            }
            throw new wv(e);
        } catch (Throwable e2) {
            throw new wv(e2);
        } catch (Throwable e22) {
            throw new wv(e22);
        } catch (Throwable th) {
            abn.a(q);
        }
    }

    private <T> T a(Reader reader, Type type) {
        abn a = a(reader);
        Object a2 = a(a, type);
        we.a(a2, a);
        return a2;
    }

    static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d);
            stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static void a(Object obj, abn abn) {
        if (obj != null) {
            try {
                if (abn.f() != abp.END_DOCUMENT) {
                    throw new wp("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new wv(e);
            } catch (Throwable e2) {
                throw new wp(e2);
            }
        }
    }

    private void a(Object obj, Type type, abq abq) {
        wz a = a(abm.a(type));
        boolean g = abq.g();
        abq.b(true);
        boolean h = abq.h();
        abq.c(this.i);
        boolean i = abq.i();
        abq.d(this.h);
        try {
            a.a(abq, obj);
            abq.b(g);
            abq.c(h);
            abq.d(i);
        } catch (Throwable e) {
            throw new wp(e);
        } catch (Throwable th) {
            abq.b(g);
            abq.c(h);
            abq.d(i);
        }
    }

    private void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(yp.a(appendable)));
        } catch (Throwable e) {
            throw new wp(e);
        }
    }

    public final abn a(Reader reader) {
        abn abn = new abn(reader);
        abn.a(this.l);
        return abn;
    }

    public final abq a(Writer writer) {
        if (this.j) {
            writer.write(")]}'\n");
        }
        abq abq = new abq(writer);
        if (this.k) {
            abq.c("  ");
        }
        abq.d(this.h);
        return abq;
    }

    public final <T> T a(String str, Class<T> cls) {
        return yo.a((Class) cls).cast(a(str, (Type) cls));
    }

    public final <T> T a(String str, Type type) {
        return str == null ? null : a(new StringReader(str), type);
    }

    public final String a(Object obj) {
        if (obj != null) {
            return a(obj, obj.getClass());
        }
        wo woVar = wq.a;
        Appendable stringWriter = new StringWriter();
        abq a;
        boolean g;
        boolean h;
        boolean i;
        try {
            a = a(yp.a(stringWriter));
            g = a.g();
            a.b(true);
            h = a.h();
            a.c(this.i);
            i = a.i();
            a.d(this.h);
            yp.a(woVar, a);
            a.b(g);
            a.c(h);
            a.d(i);
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new wp(e);
        } catch (Throwable e2) {
            throw new wp(e2);
        } catch (Throwable th) {
            a.b(g);
            a.c(h);
            a.d(i);
        }
    }

    public final String a(Object obj, Type type) {
        Appendable stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public final <T> wz<T> a(abm<T> abm_T) {
        wz<T> wzVar = (wz) this.c.get(abm_T == null ? a : abm_T);
        if (wzVar != null) {
            return wzVar;
        }
        Map map = (Map) this.b.get();
        Object obj = null;
        if (map == null) {
            map = new HashMap();
            this.b.set(map);
            obj = 1;
        }
        wk wkVar = (wk) map.get(abm_T);
        if (wkVar != null) {
            return wkVar;
        }
        try {
            wz<T> hasNext;
            wkVar = new wk();
            map.put(abm_T, wkVar);
            Iterator it = this.d.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != null) {
                    hasNext = ((xb) it.next()).a(this, abm_T);
                    if (hasNext != null) {
                        break;
                    }
                }
                throw new IllegalArgumentException("GSON cannot handle ".concat(String.valueOf(abm_T)));
            }
            wkVar.a((wz) hasNext);
            this.c.put(abm_T, hasNext);
            return hasNext;
        } finally {
            map.remove(abm_T);
            if (obj != null) {
                this.b.remove();
            }
        }
    }

    public final <T> wz<T> a(Class<T> cls) {
        return a(abm.a((Class) cls));
    }

    public final <T> wz<T> a(xb xbVar, abm<T> abm_T) {
        if (!this.d.contains(xbVar)) {
            xbVar = this.m;
        }
        Object obj = null;
        for (xb xbVar2 : this.d) {
            if (obj != null) {
                wz<T> a = xbVar2.a(this, abm_T);
                if (a != null) {
                    return a;
                }
            } else if (xbVar2 == xbVar) {
                obj = 1;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(abm_T)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.h);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.d);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
