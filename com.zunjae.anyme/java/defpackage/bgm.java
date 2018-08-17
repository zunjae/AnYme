package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

final class bgm implements InvocationHandler {
    boolean a;
    String b;
    private final List<String> c;

    bgm(List<String> list) {
        this.c = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class returnType = method.getReturnType();
        if (objArr == null) {
            objArr = bdb.b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.a = true;
            return null;
        } else if (name.equals("protocols") && objArr.length == 0) {
            return this.c;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                List list = (List) objArr[0];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.c.contains(list.get(i))) {
                        obj = list.get(i);
                        break;
                    }
                }
                obj = this.c.get(0);
                name = (String) obj;
                this.b = name;
                return name;
            } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            } else {
                this.b = (String) objArr[0];
                return null;
            }
        }
    }
}
