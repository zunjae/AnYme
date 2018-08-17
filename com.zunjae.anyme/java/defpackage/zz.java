package defpackage;

final class zz extends wz<Class> {
    zz() {
    }

    public final /* synthetic */ Object a(abn abn) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Class cls = (Class) obj;
        StringBuilder stringBuilder = new StringBuilder("Attempted to serialize java.lang.Class: ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(". Forgot to register a type adapter?");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
