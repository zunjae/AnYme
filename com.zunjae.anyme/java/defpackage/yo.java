package defpackage;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class yo {
    private static final Map<Class<?>, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;

    static {
        Map hashMap = new HashMap(16);
        Map hashMap2 = new HashMap(16);
        yo.a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        yo.a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        yo.a(hashMap, hashMap2, Character.TYPE, Character.class);
        yo.a(hashMap, hashMap2, Double.TYPE, Double.class);
        yo.a(hashMap, hashMap2, Float.TYPE, Float.class);
        yo.a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        yo.a(hashMap, hashMap2, Long.TYPE, Long.class);
        yo.a(hashMap, hashMap2, Short.TYPE, Short.class);
        yo.a(hashMap, hashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(hashMap);
        b = Collections.unmodifiableMap(hashMap2);
    }

    public static <T> Class<T> a(Class<T> cls) {
        Class<T> cls2 = (Class) a.get(xh.a((Object) cls));
        return cls2 == null ? cls : cls2;
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static boolean a(Type type) {
        return a.containsKey(type);
    }
}
