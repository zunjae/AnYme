package defpackage;

import android.content.Context;
import com.zunjae.anyme.R;
import java.util.ArrayList;
import java.util.Collections;

final class aje implements Runnable {
    final /* synthetic */ Context a;

    aje(Context context) {
        this.a = context;
    }

    public final void run() {
        Context context = this.a;
        ArrayList c = aux.c("@@AdBlocker_DAO", String.class);
        if (c.size() == 0) {
            String[] stringArray = context.getResources().getStringArray(R.array.default_ads);
            c = new ArrayList();
            Collections.addAll(c, stringArray);
        }
        ajd.a = c;
    }
}
