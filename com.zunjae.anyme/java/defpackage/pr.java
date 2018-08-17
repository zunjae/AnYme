package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.UUID;

final class pr {
    private final Context a;
    private final aww b;
    private final String c;
    private final String d;

    public pr(Context context, aww aww, String str, String str2) {
        this.a = context;
        this.b = aww;
        this.c = str;
        this.d = str2;
    }

    public final pp a() {
        Map g = this.b.g();
        String c = this.b.c();
        String b = this.b.b();
        Boolean i = this.b.i();
        String str = (String) g.get(awx.FONT_TOKEN);
        String m = awj.m(this.a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aww.d());
        stringBuilder.append("/");
        stringBuilder.append(aww.e());
        return new pp(c, UUID.randomUUID().toString(), b, i, str, m, stringBuilder.toString(), aww.f(), this.c, this.d);
    }
}
