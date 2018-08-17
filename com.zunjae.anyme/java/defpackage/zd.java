package defpackage;

public final class zd implements xb {
    private final xm a;

    public zd(xm xmVar) {
        this.a = xmVar;
    }

    static wz<?> a(xm xmVar, we weVar, abm<?> abm_, xd xdVar) {
        wz<?> wzVar;
        Object a = xmVar.a(abm.a(xdVar.a())).a();
        if (a instanceof wz) {
            wzVar = (wz) a;
        } else if (a instanceof xb) {
            wzVar = ((xb) a).a(weVar, abm_);
        } else {
            boolean z = a instanceof wu;
            if (!z) {
                if (!(a instanceof wn)) {
                    StringBuilder stringBuilder = new StringBuilder("Invalid attempt to bind an instance of ");
                    stringBuilder.append(a.getClass().getName());
                    stringBuilder.append(" as a @JsonAdapter for ");
                    stringBuilder.append(abm_.toString());
                    stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            wn wnVar = null;
            wu wuVar = z ? (wu) a : null;
            if (a instanceof wn) {
                wnVar = (wn) a;
            }
            wzVar = new zv(wuVar, wnVar, weVar, abm_);
        }
        return (wzVar == null || !xdVar.b()) ? wzVar : wzVar.a();
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        xd xdVar = (xd) abm_T.a().getAnnotation(xd.class);
        return xdVar == null ? null : zd.a(this.a, weVar, abm_T, xdVar);
    }
}
