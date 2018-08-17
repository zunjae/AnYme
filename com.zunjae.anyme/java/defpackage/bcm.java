package defpackage;

import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class bcm extends bda {
    final /* synthetic */ bcl a;

    final String a() {
        return this.a.c.a.b;
    }

    protected final void b() {
        try {
            this.a.c();
            if (this.a.b.b()) {
                IOException iOException = new IOException("Canceled");
            }
        } catch (Throwable e) {
            if (null != null) {
                bgo c = bgo.c();
                StringBuilder stringBuilder = new StringBuilder("Callback failure for ");
                bcl bcl = this.a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(bcl.b.b() ? "canceled " : BuildConfig.FLAVOR);
                stringBuilder2.append(bcl.d ? "web socket" : "call");
                stringBuilder2.append(" to ");
                bca d = bcl.c.a.d("/...");
                d.b = bbz.a(BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                d.c = bbz.a(BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                stringBuilder2.append(d.b().toString());
                stringBuilder.append(stringBuilder2.toString());
                c.a(4, stringBuilder.toString(), e);
            } else {
                this.a.e;
            }
        } catch (Throwable th) {
            this.a.a.c.a(this);
        }
        this.a.a.c.a(this);
    }
}
