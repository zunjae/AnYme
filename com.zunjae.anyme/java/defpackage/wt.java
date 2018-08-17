package defpackage;

import java.math.BigInteger;

public final class wt extends wo {
    private static final Class<?>[] a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object b;

    public wt(Boolean bool) {
        a((Object) bool);
    }

    public wt(Number number) {
        a((Object) number);
    }

    public wt(String str) {
        a((Object) str);
    }

    private void a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            boolean z;
            if (!(obj instanceof Number)) {
                if (!wt.b(obj)) {
                    z = false;
                    xh.a(z);
                }
            }
            z = true;
            xh.a(z);
        }
        this.b = obj;
    }

    private static boolean a(wt wtVar) {
        Object obj = wtVar.b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short))) {
            if (!(number instanceof Byte)) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class isAssignableFrom : a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public final Number a() {
        Object obj = this.b;
        return obj instanceof String ? new ye((String) obj) : (Number) obj;
    }

    public final String b() {
        Object obj = this.b;
        return obj instanceof Number ? a().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public final double c() {
        return this.b instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    public final long d() {
        return this.b instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    public final int e() {
        return this.b instanceof Number ? a().intValue() : Integer.parseInt(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                wt wtVar = (wt) obj;
                if (this.b == null) {
                    return wtVar.b == null;
                } else {
                    if (wt.a(this) && wt.a(wtVar)) {
                        return a().longValue() == wtVar.a().longValue();
                    } else {
                        if (!(this.b instanceof Number) || !(wtVar.b instanceof Number)) {
                            return this.b.equals(wtVar.b);
                        }
                        double doubleValue = a().doubleValue();
                        double doubleValue2 = wtVar.a().doubleValue();
                        if (doubleValue != doubleValue2) {
                            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        Object obj = this.b;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(b());
    }

    public final boolean h() {
        return this.b instanceof Boolean;
    }

    public final int hashCode() {
        if (this.b == null) {
            return 31;
        }
        long longValue;
        if (wt.a(this)) {
            longValue = a().longValue();
        } else {
            Object obj = this.b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            longValue = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((longValue >>> 32) ^ longValue);
    }

    public final boolean i() {
        return this.b instanceof Number;
    }

    public final boolean j() {
        return this.b instanceof String;
    }
}
