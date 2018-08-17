package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class sv implements InvocationHandler {
    final /* synthetic */ su a;

    sv(su suVar) {
        this.a = suVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr.length == 4) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            Bundle bundle = (Bundle) objArr[2];
            if (!(str == null || str.equals("crash"))) {
                su.a(this.a.a, str2, bundle);
            }
            return null;
        }
        throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
    }
}
