package defpackage;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import com.zunjae.anyme.AppDatabase;
import java.util.List;

public final class asz {
    private static final String a = "asz";
    private final aqq b;

    public asz(Application application) {
        this.b = AppDatabase.a(application.getApplicationContext()).m();
    }

    public final void a(List<arh> list, long j) {
        if (list != null) {
            this.b.a(list, j);
        }
    }

    public final boolean a(long j) {
        return this.b.b(j).intValue() > 0;
    }

    public final List<arh> b(long j) {
        return this.b.a(j);
    }

    public final LiveData<List<arh>> c(long j) {
        return this.b.c(j);
    }
}
