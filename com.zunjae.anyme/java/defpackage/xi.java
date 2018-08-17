package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class xi {
    static final Type[] a = new Type[0];

    static int a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new xj(xi.a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new xk(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new xj(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new xl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Type a(Type type, Class<?> cls) {
        type = xi.b(type, cls, Collection.class);
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
    }

    private static Type a(Type type, Class<?> cls, Class<?> cls2) {
        Class cls3;
        while (cls2 != cls3) {
            if (cls2.isInterface()) {
                Class[] interfaces = cls3.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    if (interfaces[i] == cls2) {
                        return cls3.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(interfaces[i])) {
                        Type type2 = cls3.getGenericInterfaces()[i];
                        Class cls4 = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls3.isInterface()) {
                while (cls3 != Object.class) {
                    Class<?> superclass = cls3.getSuperclass();
                    if (superclass == cls2) {
                        return cls3.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        type2 = cls3.getGenericSuperclass();
                        Type type3 = type2;
                        cls3 = cls4;
                        type = type3;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return xi.a(type, cls, type2, new HashSet());
    }

    private static Type a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type type3;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                type3 = (TypeVariable) type2;
                if (collection.contains(type3)) {
                    return type2;
                }
                collection.add(type3);
                GenericDeclaration genericDeclaration = type3.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type a = xi.a(type, (Class) cls, cls2);
                    if (a instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (type3.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) a).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = type3;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        type2 = cls3.getComponentType();
                        type = xi.a(type, cls, type2, collection);
                        return type2 == type ? cls3 : xi.f(type);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    type3 = genericArrayType.getGenericComponentType();
                    type = xi.a(type, cls, type3, collection);
                    return type3 == type ? genericArrayType : xi.f(type);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    type3 = parameterizedType.getOwnerType();
                    Type a2 = xi.a(type, cls, type3, collection);
                    Object obj = a2 != type3 ? 1 : null;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type a3 = xi.a(type, cls, actualTypeArguments[i], collection);
                        if (a3 != actualTypeArguments[i]) {
                            if (obj == null) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                obj = 1;
                            }
                            actualTypeArguments[i] = a3;
                        }
                        i++;
                    }
                    return obj != null ? new xk(a2, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = (WildcardType) type2;
                        Type[] lowerBounds = type2.getLowerBounds();
                        Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            type = xi.a(type, cls, lowerBounds[0], collection);
                            if (type != lowerBounds[0]) {
                                return new xl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
                            }
                        } else if (upperBounds.length == 1) {
                            type = xi.a(type, cls, upperBounds[0], collection);
                            if (type != upperBounds[0]) {
                                return new xl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, a);
                            }
                        }
                    }
                    return type2;
                }
            }
        } while (type2 != type3);
        return type2;
    }

    public static boolean a(Type type, Type type2) {
        Object genericComponentType;
        Object genericComponentType2;
        while (genericComponentType != genericComponentType2) {
            if (genericComponentType instanceof Class) {
                return genericComponentType.equals(genericComponentType2);
            }
            if (genericComponentType instanceof ParameterizedType) {
                if (!(genericComponentType2 instanceof ParameterizedType)) {
                    return false;
                }
                Object obj;
                ParameterizedType parameterizedType = (ParameterizedType) genericComponentType;
                ParameterizedType parameterizedType2 = (ParameterizedType) genericComponentType2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (ownerType != ownerType2) {
                    if (ownerType == null || !ownerType.equals(ownerType2)) {
                        obj = null;
                        return obj == null && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                    }
                }
                obj = 1;
                if (obj == null) {
                }
            } else if (genericComponentType instanceof GenericArrayType) {
                if (!(genericComponentType2 instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) genericComponentType2;
                genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
                genericComponentType2 = genericArrayType.getGenericComponentType();
            } else if (genericComponentType instanceof WildcardType) {
                if (!(genericComponentType2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) genericComponentType;
                WildcardType wildcardType2 = (WildcardType) genericComponentType2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            } else if (!(genericComponentType instanceof TypeVariable) || !(genericComponentType2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) genericComponentType;
                TypeVariable typeVariable2 = (TypeVariable) genericComponentType2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    public static Class<?> b(Type type) {
        Object obj;
        while (!(obj instanceof Class)) {
            if (obj instanceof ParameterizedType) {
                type = ((ParameterizedType) obj).getRawType();
                xh.a(type instanceof Class);
                return (Class) type;
            } else if (obj instanceof GenericArrayType) {
                return Array.newInstance(xi.b(((GenericArrayType) obj).getGenericComponentType()), 0).getClass();
            } else {
                if (obj instanceof TypeVariable) {
                    return Object.class;
                }
                if (obj instanceof WildcardType) {
                    obj = ((WildcardType) obj).getUpperBounds()[0];
                } else {
                    String name = obj == null ? "null" : obj.getClass().getName();
                    StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    stringBuilder.append(obj);
                    stringBuilder.append("> is of type ");
                    stringBuilder.append(name);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return (Class) obj;
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        xh.a(cls2.isAssignableFrom(cls));
        return xi.a(type, (Class) cls, xi.a(type, (Class) cls, (Class) cls2));
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = xi.b(type, cls, Map.class);
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    static void e(Type type) {
        boolean z;
        if (type instanceof Class) {
            if (((Class) type).isPrimitive()) {
                z = false;
                xh.a(z);
            }
        }
        z = true;
        xh.a(z);
    }

    private static GenericArrayType f(Type type) {
        return new xj(type);
    }
}
