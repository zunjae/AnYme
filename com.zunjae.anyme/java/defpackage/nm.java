package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class nm {
    private static final ConcurrentHashMap<String, eg> a = new ConcurrentHashMap();

    public static eg a(Context context) {
        String packageName = context.getPackageName();
        eg egVar = (eg) a.get(packageName);
        if (egVar != null) {
            return egVar;
        }
        egVar = nm.b(context);
        eg egVar2 = (eg) a.putIfAbsent(packageName, egVar);
        return egVar2 == null ? egVar : egVar2;
    }

    private static eg b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return new no(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
    }
}
