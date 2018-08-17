package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class zy {
    public static final wz<String> A = new aag();
    public static final wz<BigDecimal> B = new aah();
    public static final wz<BigInteger> C = new aai();
    public static final xb D = zy.a(String.class, A);
    public static final wz<StringBuilder> E = new aaj();
    public static final xb F = zy.a(StringBuilder.class, E);
    public static final wz<StringBuffer> G = new aal();
    public static final xb H = zy.a(StringBuffer.class, G);
    public static final wz<URL> I = new aam();
    public static final xb J = zy.a(URL.class, I);
    public static final wz<URI> K = new aan();
    public static final xb L = zy.a(URI.class, K);
    public static final wz<InetAddress> M = new aao();
    public static final xb N = zy.b(InetAddress.class, M);
    public static final wz<UUID> O = new aap();
    public static final xb P = zy.a(UUID.class, O);
    public static final wz<Currency> Q = new aaq().a();
    public static final xb R = zy.a(Currency.class, Q);
    public static final xb S = new aar();
    public static final wz<Calendar> T = new aat();
    public static final xb U = new aba(Calendar.class, GregorianCalendar.class, T);
    public static final wz<Locale> V = new aau();
    public static final xb W = zy.a(Locale.class, V);
    public static final wz<wo> X = new aav();
    public static final xb Y = zy.b(wo.class, X);
    public static final xb Z = new aax();
    public static final wz<Class> a = new zz().a();
    public static final xb b = zy.a(Class.class, a);
    public static final wz<BitSet> c = new aak().a();
    public static final xb d = zy.a(BitSet.class, c);
    public static final wz<Boolean> e = new aaw();
    public static final wz<Boolean> f = new abe();
    public static final xb g = zy.a(Boolean.TYPE, Boolean.class, e);
    public static final wz<Number> h = new abf();
    public static final xb i = zy.a(Byte.TYPE, Byte.class, h);
    public static final wz<Number> j = new abg();
    public static final xb k = zy.a(Short.TYPE, Short.class, j);
    public static final wz<Number> l = new abh();
    public static final xb m = zy.a(Integer.TYPE, Integer.class, l);
    public static final wz<AtomicInteger> n = new abi().a();
    public static final xb o = zy.a(AtomicInteger.class, n);
    public static final wz<AtomicBoolean> p = new abj().a();
    public static final xb q = zy.a(AtomicBoolean.class, p);
    public static final wz<AtomicIntegerArray> r = new aaa().a();
    public static final xb s = zy.a(AtomicIntegerArray.class, r);
    public static final wz<Number> t = new aab();
    public static final wz<Number> u = new aac();
    public static final wz<Number> v = new aad();
    public static final wz<Number> w = new aae();
    public static final xb x = zy.a(Number.class, w);
    public static final wz<Character> y = new aaf();
    public static final xb z = zy.a(Character.TYPE, Character.class, y);

    public static <TT> xb a(Class<TT> cls, Class<TT> cls2, wz<? super TT> wzVar) {
        return new aaz(cls, cls2, wzVar);
    }

    public static <TT> xb a(Class<TT> cls, wz<TT> wzVar) {
        return new aay(cls, wzVar);
    }

    private static <T1> xb b(Class<T1> cls, wz<T1> wzVar) {
        return new abb(cls, wzVar);
    }
}
