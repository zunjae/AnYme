package defpackage;

import android.content.Context;
import java.util.UUID;

final class pi extends ayo<pm> {
    private azt g;

    pi(Context context, pq pqVar, awo awo, ayr ayr) {
        super(context, pqVar, awo, ayr);
    }

    protected final String a() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder stringBuilder = new StringBuilder("sa_");
        stringBuilder.append(randomUUID.toString());
        stringBuilder.append("_");
        stringBuilder.append(this.c.a());
        stringBuilder.append(".tap");
        return stringBuilder.toString();
    }

    final void a(azt azt) {
        this.g = azt;
    }

    protected final int b() {
        azt azt = this.g;
        return azt == null ? super.b() : azt.e;
    }

    protected final int c() {
        azt azt = this.g;
        return azt == null ? super.c() : azt.c;
    }
}
