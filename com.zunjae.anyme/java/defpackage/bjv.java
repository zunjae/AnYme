package defpackage;

import java.lang.reflect.Type;

final class bjv implements bjo<Object, bjn<?>> {
    final /* synthetic */ Type a;
    final /* synthetic */ bju b;

    bjv(bju bju, Type type) {
        this.b = bju;
        this.a = type;
    }

    public final /* synthetic */ Object a(bjn bjn) {
        return new bjw(this.b.a, bjn);
    }

    public final Type a() {
        return this.a;
    }
}
