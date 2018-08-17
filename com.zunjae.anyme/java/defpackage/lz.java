package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.List;

public final class lz {
    private final Context a;

    public lz(Context context) {
        this.a = context;
    }

    private static ly a(String str) {
        try {
            Class cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof ly) {
                    return (ly) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(newInstance)));
            } catch (Throwable e) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e);
            } catch (Throwable e2) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e2);
            }
        } catch (Throwable e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }

    public final List<ly> a() {
        List<ly> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(lz.a(str));
                    }
                }
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
