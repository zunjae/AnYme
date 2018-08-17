package defpackage;

public final class nv {
    private Class<?> a;
    private Class<?> b;

    public nv(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public final void a(Class<?> cls, Class<?> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                nv nvVar = (nv) obj;
                return this.a.equals(nvVar.a) && this.b.equals(nvVar.b);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiClassKey{first=");
        stringBuilder.append(this.a);
        stringBuilder.append(", second=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
