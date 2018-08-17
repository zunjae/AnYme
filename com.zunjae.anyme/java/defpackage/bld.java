package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

final class bld {
    static final Type[] a = new Type[0];

    static bcu a(bcu bcu) {
        bhy bhd = new bhd();
        bcu.c().a(bhd);
        return bcu.a(bcu.a(), bcu.b(), bhd);
    }

    static Class<?> a(Type type) {
        Object obj;
        while (true) {
            bld.a(obj, "type == null");
            if (obj instanceof Class) {
                return (Class) obj;
            }
            if (obj instanceof ParameterizedType) {
                break;
            } else if (obj instanceof GenericArrayType) {
                return Array.newInstance(bld.a(((GenericArrayType) obj).getGenericComponentType()), 0).getClass();
            } else {
                if (obj instanceof TypeVariable) {
                    return Object.class;
                }
                if (obj instanceof WildcardType) {
                    obj = ((WildcardType) obj).getUpperBounds()[0];
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    stringBuilder.append(obj);
                    stringBuilder.append("> is of type ");
                    stringBuilder.append(obj.getClass().getName());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        type = ((ParameterizedType) obj).getRawType();
        if (type instanceof Class) {
            return (Class) type;
        }
        throw new IllegalArgumentException();
    }

    static <T> T a(@Nullable T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static Type a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder stringBuilder = new StringBuilder("Index ");
            stringBuilder.append(i);
            stringBuilder.append(" not in range [0,");
            stringBuilder.append(actualTypeArguments.length);
            stringBuilder.append(") for ");
            stringBuilder.append(parameterizedType);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return bld.a(type, (Class) cls, bld.b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    private static Type a(Type type, Class<?> cls, Type type2) {
        while (true) {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                break;
            }
            Type type3;
            type2 = (TypeVariable) type2;
            GenericDeclaration genericDeclaration = type2.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 != null) {
                Type b = bld.b(type, cls, cls2);
                if (b instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (type2.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) b).getActualTypeArguments()[i];
                            if (type3 == type2) {
                                return type3;
                            }
                            type2 = type3;
                        } else {
                            i++;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = type2;
            if (type3 == type2) {
                return type3;
            }
            type2 = type3;
        }
        if (type2 instanceof Class) {
            cls2 = (Class) type2;
            if (cls2.isArray()) {
                type2 = cls2.getComponentType();
                type = bld.a(type, (Class) cls, type2);
                return type2 == type ? cls2 : new ble(type);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            type3 = genericArrayType.getGenericComponentType();
            type = bld.a(type, (Class) cls, type3);
            return type3 == type ? genericArrayType : new ble(type);
        } else if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            type3 = parameterizedType.getOwnerType();
            Type a = bld.a(type, (Class) cls, type3);
            Object obj = a != type3 ? 1 : null;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type a2 = bld.a(type, (Class) cls, actualTypeArguments[i]);
                if (a2 != actualTypeArguments[i]) {
                    if (obj == null) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        obj = 1;
                    }
                    actualTypeArguments[i] = a2;
                }
                i++;
            }
            return obj != null ? new blf(a, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        } else {
            if (type2 instanceof WildcardType) {
                type2 = (WildcardType) type2;
                Type[] lowerBounds = type2.getLowerBounds();
                Type[] upperBounds = type2.getUpperBounds();
                if (lowerBounds.length == 1) {
                    if (bld.a(type, (Class) cls, lowerBounds[0]) != lowerBounds[0]) {
                        return new blg(new Type[]{Object.class}, new Type[]{bld.a(type, (Class) cls, lowerBounds[0])});
                    }
                } else if (upperBounds.length == 1 && bld.a(type, (Class) cls, upperBounds[0]) != upperBounds[0]) {
                    return new blg(new Type[]{bld.a(type, (Class) cls, upperBounds[0])}, a);
                }
            }
            return type2;
        }
    }

    static <T> void a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static boolean a(Type type, Type type2) {
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
                ParameterizedType parameterizedType = (ParameterizedType) genericComponentType;
                ParameterizedType parameterizedType2 = (ParameterizedType) genericComponentType2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Object isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
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

    static void c(Type type) {
        if (!(type instanceof Class)) {
            return;
        }
        if (((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean d(@Nullable Type type) {
        Object genericComponentType;
        while (!(genericComponentType instanceof Class)) {
            if (genericComponentType instanceof ParameterizedType) {
                for (Type d : ((ParameterizedType) genericComponentType).getActualTypeArguments()) {
                    if (bld.d(d)) {
                        return true;
                    }
                }
                return false;
            } else if (genericComponentType instanceof GenericArrayType) {
                genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            } else if ((genericComponentType instanceof TypeVariable) || (genericComponentType instanceof WildcardType)) {
                return true;
            } else {
                String name = genericComponentType == null ? "null" : genericComponentType.getClass().getName();
                StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                stringBuilder.append(genericComponentType);
                stringBuilder.append("> is of type ");
                stringBuilder.append(name);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return false;
    }

    static Type e(Type type) {
        if (type instanceof ParameterizedType) {
            return bld.a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
