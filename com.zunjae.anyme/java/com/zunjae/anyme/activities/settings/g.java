package com.zunjae.anyme.activities.settings;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.zunjae.zasync.c;
import defpackage.aux;
import java.util.Map.Entry;

final class g extends c<Boolean> {
    final /* synthetic */ OptimizeActivity a;

    g(OptimizeActivity optimizeActivity, Activity activity) {
        this.a = optimizeActivity;
        super(activity);
    }

    protected final /* synthetic */ void a(Object obj) {
        super.a((Boolean) obj);
        Toast.makeText(this.a.b, "Database optimized", 0).show();
        this.a.finish();
    }

    public final /* synthetic */ Object b() {
        SharedPreferences b = aux.b();
        for (Entry key : b.getAll().entrySet()) {
            String str = (String) key.getKey();
            if (OptimizeActivity.a(this.a, str)) {
                b.edit().remove(str).apply();
            }
        }
        return Boolean.TRUE;
    }
}
