package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class aik {
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Method>> a = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Set<Method>>> b = new ConcurrentHashMap();

    static Map<Class<?>, air> a(Object obj) {
        Class cls = obj.getClass();
        Map<Class<?>, air> hashMap = new HashMap();
        Map map = (Map) a.get(cls);
        if (map == null) {
            map = new HashMap();
            aik.a(cls, map, new HashMap());
        }
        if (!map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), new air(obj, (Method) entry.getValue()));
            }
        }
        return hashMap;
    }

    private static void a(Class<?> cls, Map<Class<?>, Method> map, Map<Class<?>, Set<Method>> map2) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge()) {
                Class[] parameterTypes;
                Class cls2;
                StringBuilder stringBuilder;
                if (method.isAnnotationPresent(aiv.class)) {
                    parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        cls2 = parameterTypes[0];
                        if (cls2.isInterface()) {
                            stringBuilder = new StringBuilder("Method ");
                            stringBuilder.append(method);
                            stringBuilder.append(" has @Subscribe annotation on ");
                            stringBuilder.append(cls2);
                            stringBuilder.append(" which is an interface.  Subscription must be on a concrete class type.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else if ((1 & method.getModifiers()) != 0) {
                            Set set = (Set) map2.get(cls2);
                            if (set == null) {
                                set = new HashSet();
                                map2.put(cls2, set);
                            }
                            set.add(method);
                        } else {
                            stringBuilder = new StringBuilder("Method ");
                            stringBuilder.append(method);
                            stringBuilder.append(" has @Subscribe annotation on ");
                            stringBuilder.append(cls2);
                            stringBuilder.append(" but is not 'public'.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    stringBuilder = new StringBuilder("Method ");
                    stringBuilder.append(method);
                    stringBuilder.append(" has @Subscribe annotation but requires ");
                    stringBuilder.append(parameterTypes.length);
                    stringBuilder.append(" arguments.  Methods must require a single argument.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (method.isAnnotationPresent(aiu.class)) {
                    parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != 0) {
                        stringBuilder = new StringBuilder("Method ");
                        stringBuilder.append(method);
                        stringBuilder.append("has @Produce annotation but requires ");
                        stringBuilder.append(parameterTypes.length);
                        stringBuilder.append(" arguments.  Methods must require zero arguments.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (method.getReturnType() != Void.class) {
                        cls2 = method.getReturnType();
                        if (cls2.isInterface()) {
                            stringBuilder = new StringBuilder("Method ");
                            stringBuilder.append(method);
                            stringBuilder.append(" has @Produce annotation on ");
                            stringBuilder.append(cls2);
                            stringBuilder.append(" which is an interface.  Producers must return a concrete class type.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else if (cls2.equals(Void.TYPE)) {
                            stringBuilder = new StringBuilder("Method ");
                            stringBuilder.append(method);
                            stringBuilder.append(" has @Produce annotation but has no return type.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else if ((1 & method.getModifiers()) == 0) {
                            stringBuilder = new StringBuilder("Method ");
                            stringBuilder.append(method);
                            stringBuilder.append(" has @Produce annotation on ");
                            stringBuilder.append(cls2);
                            stringBuilder.append(" but is not 'public'.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else if (map.containsKey(cls2)) {
                            stringBuilder = new StringBuilder("Producer for type ");
                            stringBuilder.append(cls2);
                            stringBuilder.append(" has already been registered.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            map.put(cls2, method);
                        }
                    } else {
                        stringBuilder = new StringBuilder("Method ");
                        stringBuilder.append(method);
                        stringBuilder.append(" has a return type of void.  Must declare a non-void type.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else {
                    continue;
                }
            }
        }
        a.put(cls, map);
        b.put(cls, map2);
    }

    static Map<Class<?>, Set<aiq>> b(Object obj) {
        Class cls = obj.getClass();
        Map<Class<?>, Set<aiq>> hashMap = new HashMap();
        Map map = (Map) b.get(cls);
        if (map == null) {
            map = new HashMap();
            aik.a(cls, new HashMap(), map);
        }
        if (!map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                Set hashSet = new HashSet();
                for (Method aiq : (Set) entry.getValue()) {
                    hashSet.add(new aiq(obj, aiq));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }
}
