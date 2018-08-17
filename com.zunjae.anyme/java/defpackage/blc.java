package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Map;
import java.util.Set;

final class blc<T, R> {
    final bky a;
    final Method b;
    final Annotation[] c;
    final Annotation[][] d;
    final Type[] e;
    Type f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    String m;
    boolean n;
    boolean o;
    boolean p;
    String q;
    bbx r;
    bcd s;
    Set<String> t;
    bkb<?>[] u;
    bjq<bcu, T> v;
    bjo<T, R> w;

    blc(bky bky, Method method) {
        this.a = bky;
        this.b = method;
        this.c = method.getAnnotations();
        this.e = method.getGenericParameterTypes();
        this.d = method.getParameterAnnotations();
    }

    private bbx a(String[] strArr) {
        bby bby = new bby();
        for (String str : strArr) {
            String str2;
            int indexOf = str2.indexOf(58);
            if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                throw a(null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
            }
            String substring = str2.substring(0, indexOf);
            str2 = str2.substring(indexOf + 1).trim();
            if ("Content-Type".equalsIgnoreCase(substring)) {
                bcd b = bcd.b(str2);
                if (b != null) {
                    this.s = b;
                } else {
                    throw a(null, "Malformed content type: %s", str2);
                }
            }
            bby.a(substring, str2);
        }
        return bby.a();
    }

    private bkb<?> a(int i, Type type, Annotation[] annotationArr) {
        bkb<?> bkb_ = null;
        for (Annotation a : annotationArr) {
            bkb<?> a2 = a(i, type, annotationArr, a);
            if (a2 != null) {
                if (bkb_ == null) {
                    bkb_ = a2;
                } else {
                    throw a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                }
            }
        }
        if (bkb_ != null) {
            return bkb_;
        }
        throw a(i, "No Retrofit annotation found.", new Object[0]);
    }

    private bkb<?> a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
        StringBuilder stringBuilder;
        if (annotation instanceof bmh) {
            if (this.l) {
                throw a(i, "Multiple @Url method annotations found.", new Object[0]);
            } else if (this.j) {
                throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
            } else if (this.k) {
                throw a(i, "A @Url parameter must not come after a @Query", new Object[0]);
            } else if (this.q == null) {
                this.l = true;
                if (!(type == bbz.class || type == String.class || type == URI.class)) {
                    if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
                        throw a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                    }
                }
                return new bkq();
            } else {
                throw a(i, "@Url cannot be used with @%s URL", this.m);
            }
        } else if (annotation instanceof bmc) {
            if (this.k) {
                throw a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (this.l) {
                throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
            } else if (this.q != null) {
                this.j = true;
                bmc bmc = (bmc) annotation;
                Object a = bmc.a();
                if (!blb.b.matcher(a).matches()) {
                    throw a(i, "@Path parameter name must match %s. Found: %s", blb.a.pattern(), a);
                } else if (this.t.contains(a)) {
                    return new bkl(a, this.a.a(type, annotationArr), bmc.b());
                } else {
                    throw a(i, "URL \"%s\" does not contain \"{%s}\".", this.q, a);
                }
            } else {
                throw a(i, "@Path can only be used with relative url on @%s", this.m);
            }
        } else if (annotation instanceof bmd) {
            bmd bmd = (bmd) annotation;
            r0 = bmd.a();
            r12 = bmd.b();
            Class a2 = bld.a(type);
            this.k = true;
            if (Iterable.class.isAssignableFrom(a2)) {
                if (type instanceof ParameterizedType) {
                    return new bkm(r0, this.a.a(bld.a(0, (ParameterizedType) type), annotationArr), r12).a();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(a2.getSimpleName());
                stringBuilder.append(" must include generic type (e.g., ");
                stringBuilder.append(a2.getSimpleName());
                stringBuilder.append("<String>)");
                throw a(i, stringBuilder.toString(), new Object[0]);
            } else if (!a2.isArray()) {
                return new bkm(r0, this.a.a(type, annotationArr), r12);
            } else {
                return new bkm(r0, this.a.a(blb.a(a2.getComponentType()), annotationArr), r12).b();
            }
        } else if (annotation instanceof bmf) {
            r12 = ((bmf) annotation).a();
            r0 = bld.a(type);
            this.k = true;
            if (Iterable.class.isAssignableFrom(r0)) {
                if (type instanceof ParameterizedType) {
                    return new bko(this.a.a(bld.a(0, (ParameterizedType) type), annotationArr), r12).a();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(r0.getSimpleName());
                stringBuilder.append(" must include generic type (e.g., ");
                stringBuilder.append(r0.getSimpleName());
                stringBuilder.append("<String>)");
                throw a(i, stringBuilder.toString(), new Object[0]);
            } else if (!r0.isArray()) {
                return new bko(this.a.a(type, annotationArr), r12);
            } else {
                return new bko(this.a.a(blb.a(r0.getComponentType()), annotationArr), r12).b();
            }
        } else if (annotation instanceof bme) {
            r0 = bld.a(type);
            if (Map.class.isAssignableFrom(r0)) {
                type = bld.a(type, r0, Map.class);
                if (type instanceof ParameterizedType) {
                    r10 = (ParameterizedType) type;
                    r0 = bld.a(0, r10);
                    if (String.class == r0) {
                        return new bkn(this.a.a(bld.a(1, r10), annotationArr), ((bme) annotation).a());
                    }
                    throw a(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(r0)), new Object[0]);
                }
                throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
            }
            throw a(i, "@QueryMap parameter type must be Map.", new Object[0]);
        } else if (annotation instanceof bls) {
            String a3 = ((bls) annotation).a();
            r0 = bld.a(type);
            if (Iterable.class.isAssignableFrom(r0)) {
                if (type instanceof ParameterizedType) {
                    return new bkh(a3, this.a.a(bld.a(0, (ParameterizedType) type), annotationArr)).a();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(r0.getSimpleName());
                stringBuilder.append(" must include generic type (e.g., ");
                stringBuilder.append(r0.getSimpleName());
                stringBuilder.append("<String>)");
                throw a(i, stringBuilder.toString(), new Object[0]);
            } else if (!r0.isArray()) {
                return new bkh(a3, this.a.a(type, annotationArr));
            } else {
                return new bkh(a3, this.a.a(blb.a(r0.getComponentType()), annotationArr)).b();
            }
        } else if (annotation instanceof blt) {
            Class a4 = bld.a(type);
            if (Map.class.isAssignableFrom(a4)) {
                type = bld.a(type, a4, Map.class);
                if (type instanceof ParameterizedType) {
                    r10 = (ParameterizedType) type;
                    a4 = bld.a(0, r10);
                    if (String.class == a4) {
                        return new bki(this.a.a(bld.a(1, r10), annotationArr));
                    }
                    throw a(i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a4)), new Object[0]);
                }
                throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
            }
            throw a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
        } else if (annotation instanceof blm) {
            if (this.o) {
                blm blm = (blm) annotation;
                r0 = blm.a();
                r12 = blm.b();
                this.g = true;
                Class a5 = bld.a(type);
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new bkf(r0, this.a.a(bld.a(0, (ParameterizedType) type), annotationArr), r12).a();
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(a5.getSimpleName());
                    stringBuilder.append(" must include generic type (e.g., ");
                    stringBuilder.append(a5.getSimpleName());
                    stringBuilder.append("<String>)");
                    throw a(i, stringBuilder.toString(), new Object[0]);
                } else if (!a5.isArray()) {
                    return new bkf(r0, this.a.a(type, annotationArr), r12);
                } else {
                    return new bkf(r0, this.a.a(blb.a(a5.getComponentType()), annotationArr), r12).b();
                }
            }
            throw a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
        } else if (annotation instanceof bln) {
            if (this.o) {
                r0 = bld.a(type);
                if (Map.class.isAssignableFrom(r0)) {
                    type = bld.a(type, r0, Map.class);
                    if (type instanceof ParameterizedType) {
                        r10 = (ParameterizedType) type;
                        r0 = bld.a(0, r10);
                        if (String.class == r0) {
                            bjq a6 = this.a.a(bld.a(1, r10), annotationArr);
                            this.g = true;
                            return new bkg(a6, ((bln) annotation).a());
                        }
                        throw a(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(r0)), new Object[0]);
                    }
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i, "@FieldMap parameter type must be Map.", new Object[0]);
            }
            throw a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
        } else if (annotation instanceof bma) {
            if (this.p) {
                bma bma = (bma) annotation;
                this.h = true;
                r0 = bma.a();
                Class a7 = bld.a(type);
                if (!r0.isEmpty()) {
                    String[] strArr = new String[4];
                    strArr[0] = "Content-Disposition";
                    StringBuilder stringBuilder2 = new StringBuilder("form-data; name=\"");
                    stringBuilder2.append(r0);
                    stringBuilder2.append("\"");
                    strArr[1] = stringBuilder2.toString();
                    strArr[2] = "Content-Transfer-Encoding";
                    strArr[3] = bma.b();
                    bbx a8 = bbx.a(strArr);
                    if (Iterable.class.isAssignableFrom(a7)) {
                        if (type instanceof ParameterizedType) {
                            type = bld.a(0, (ParameterizedType) type);
                            if (!bcg.class.isAssignableFrom(bld.a(type))) {
                                return new bkj(a8, this.a.a(type, annotationArr, this.c)).a();
                            }
                            throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(a7.getSimpleName());
                        stringBuilder.append(" must include generic type (e.g., ");
                        stringBuilder.append(a7.getSimpleName());
                        stringBuilder.append("<String>)");
                        throw a(i, stringBuilder.toString(), new Object[0]);
                    } else if (a7.isArray()) {
                        type = blb.a(a7.getComponentType());
                        if (!bcg.class.isAssignableFrom(type)) {
                            return new bkj(a8, this.a.a(type, annotationArr, this.c)).b();
                        }
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!bcg.class.isAssignableFrom(a7)) {
                        return new bkj(a8, this.a.a(type, annotationArr, this.c));
                    } else {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                } else if (Iterable.class.isAssignableFrom(a7)) {
                    if (!(type instanceof ParameterizedType)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(a7.getSimpleName());
                        stringBuilder.append(" must include generic type (e.g., ");
                        stringBuilder.append(a7.getSimpleName());
                        stringBuilder.append("<String>)");
                        throw a(i, stringBuilder.toString(), new Object[0]);
                    } else if (bcg.class.isAssignableFrom(bld.a(bld.a(0, (ParameterizedType) type)))) {
                        return bkp.a.a();
                    } else {
                        throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else if (a7.isArray()) {
                    if (bcg.class.isAssignableFrom(a7.getComponentType())) {
                        return bkp.a.b();
                    }
                    throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                } else if (bcg.class.isAssignableFrom(a7)) {
                    return bkp.a;
                } else {
                    throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
            }
            throw a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
        } else if (annotation instanceof bmb) {
            if (this.p) {
                this.h = true;
                r0 = bld.a(type);
                if (Map.class.isAssignableFrom(r0)) {
                    type = bld.a(type, r0, Map.class);
                    if (type instanceof ParameterizedType) {
                        r10 = (ParameterizedType) type;
                        r0 = bld.a(0, r10);
                        if (String.class == r0) {
                            type = bld.a(1, r10);
                            if (!bcg.class.isAssignableFrom(bld.a(type))) {
                                return new bkk(this.a.a(type, annotationArr, this.c), ((bmb) annotation).a());
                            }
                            throw a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        throw a(i, "@PartMap keys must be of type String: ".concat(String.valueOf(r0)), new Object[0]);
                    }
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i, "@PartMap parameter type must be Map.", new Object[0]);
            }
            throw a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
        } else if (!(annotation instanceof blk)) {
            return null;
        } else {
            if (this.o || this.p) {
                throw a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else if (this.i) {
                throw a(i, "Multiple @Body method annotations found.", new Object[0]);
            } else {
                try {
                    bjq a9 = this.a.a(type, annotationArr, this.c);
                    this.i = true;
                    return new bke(a9);
                } catch (Throwable e) {
                    Object[] objArr = new Object[]{type};
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to create @Body converter for %s");
                    stringBuilder.append(" (parameter #");
                    stringBuilder.append(i + 1);
                    stringBuilder.append(")");
                    throw a(e, stringBuilder.toString(), objArr);
                }
            }
        }
    }

    private RuntimeException a(int i, String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" (parameter #");
        stringBuilder.append(i + 1);
        stringBuilder.append(")");
        return a(null, stringBuilder.toString(), objArr);
    }

    private RuntimeException a(Throwable th, String str, Object... objArr) {
        str = String.format(str, objArr);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("\n    for method ");
        stringBuilder.append(this.b.getDeclaringClass().getSimpleName());
        stringBuilder.append(".");
        stringBuilder.append(this.b.getName());
        return new IllegalArgumentException(stringBuilder.toString(), th);
    }

    private void a(String str, String str2, boolean z) {
        if (this.m == null) {
            this.m = str;
            this.n = z;
            if (!str2.isEmpty()) {
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    if (blb.a.matcher(str2.substring(indexOf + 1)).find()) {
                        throw a(null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", str2.substring(indexOf + 1));
                    }
                }
                this.q = str2;
                this.t = blb.a(str2);
                return;
            }
            return;
        }
        throw a(null, "Only one HTTP method is allowed. Found: %s and %s.", this.m, str);
    }

    private bjo<T, R> b() {
        Object genericReturnType = this.b.getGenericReturnType();
        if (bld.d(genericReturnType)) {
            throw a(null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            Object annotations = this.b.getAnnotations();
            try {
                int i;
                bky bky = this.a;
                bld.a(genericReturnType, "returnType == null");
                bld.a(annotations, "annotations == null");
                int indexOf = bky.d.indexOf(null) + 1;
                int size = bky.d.size();
                for (i = indexOf; i < size; i++) {
                    bjo<T, R> a = ((bjp) bky.d.get(i)).a(genericReturnType);
                    if (a != null) {
                        return a;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Could not locate call adapter for ");
                stringBuilder.append(genericReturnType);
                stringBuilder.append(".\n");
                stringBuilder.append("  Tried:");
                i = bky.d.size();
                while (indexOf < i) {
                    stringBuilder.append("\n   * ");
                    stringBuilder.append(((bjp) bky.d.get(indexOf)).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(stringBuilder.toString());
            } catch (Throwable e) {
                throw a(e, "Unable to create call adapter for %s", genericReturnType);
            }
        } else {
            throw a(null, "Service methods cannot return void.", new Object[0]);
        }
    }

    private bjq<bcu, T> c() {
        Object annotations = this.b.getAnnotations();
        try {
            bky bky = this.a;
            Object obj = this.f;
            bld.a(obj, "type == null");
            bld.a(annotations, "annotations == null");
            int indexOf = bky.c.indexOf(null) + 1;
            int size = bky.c.size();
            for (int i = indexOf; i < size; i++) {
                bjq<bcu, T> a = ((bjr) bky.c.get(i)).a(obj, annotations);
                if (a != null) {
                    return a;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Could not locate ResponseBody converter for ");
            stringBuilder.append(obj);
            stringBuilder.append(".\n");
            stringBuilder.append("  Tried:");
            int size2 = bky.c.size();
            while (indexOf < size2) {
                stringBuilder.append("\n   * ");
                stringBuilder.append(((bjr) bky.c.get(indexOf)).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(stringBuilder.toString());
        } catch (Throwable e) {
            throw a(e, "Unable to create converter for %s", this.f);
        }
    }

    public final blb a() {
        this.w = b();
        this.f = this.w.a();
        Type type = this.f;
        if (type == bkx.class || type == bcs.class) {
            StringBuilder stringBuilder = new StringBuilder("'");
            stringBuilder.append(bld.a(this.f).getName());
            stringBuilder.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw a(null, stringBuilder.toString(), new Object[0]);
        }
        int i;
        this.v = c();
        for (Annotation annotation : this.c) {
            String str;
            String a;
            if (annotation instanceof bll) {
                str = "DELETE";
                a = ((bll) annotation).a();
            } else if (annotation instanceof blp) {
                str = "GET";
                a = ((blp) annotation).a();
            } else {
                if (annotation instanceof blq) {
                    a("HEAD", ((blq) annotation).a(), false);
                    if (!Void.class.equals(this.f)) {
                        throw a(null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                } else {
                    String str2;
                    if (annotation instanceof blx) {
                        str2 = "PATCH";
                        a = ((blx) annotation).a();
                    } else if (annotation instanceof bly) {
                        str2 = "POST";
                        a = ((bly) annotation).a();
                    } else if (annotation instanceof blz) {
                        str2 = "PUT";
                        a = ((blz) annotation).a();
                    } else if (annotation instanceof blw) {
                        str = "OPTIONS";
                        a = ((blw) annotation).a();
                    } else if (annotation instanceof blr) {
                        blr blr = (blr) annotation;
                        a(blr.a(), blr.b(), blr.c());
                    } else if (annotation instanceof blu) {
                        String[] a2 = ((blu) annotation).a();
                        if (a2.length != 0) {
                            this.r = a(a2);
                        } else {
                            throw a(null, "@Headers annotation is empty.", new Object[0]);
                        }
                    } else if (annotation instanceof blv) {
                        if (this.o) {
                            throw a(null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        this.p = true;
                    } else if (!(annotation instanceof blo)) {
                        continue;
                    } else if (this.p) {
                        throw a(null, "Only one encoding annotation is allowed.", new Object[0]);
                    } else {
                        this.o = true;
                    }
                    a(str2, a, true);
                }
            }
            a(str, a, false);
        }
        if (this.m != null) {
            if (!this.n) {
                if (this.p) {
                    throw a(null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                } else if (this.o) {
                    throw a(null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.u = new bkb[length];
            i = 0;
            while (i < length) {
                Type type2 = this.e[i];
                if (bld.d(type2)) {
                    throw a(i, "Parameter type must not include a type variable or wildcard: %s", type2);
                }
                Annotation[] annotationArr = this.d[i];
                if (annotationArr != null) {
                    this.u[i] = a(i, type2, annotationArr);
                    i++;
                } else {
                    throw a(i, "No Retrofit annotation found.", new Object[0]);
                }
            }
            if (this.q == null) {
                if (!this.l) {
                    throw a(null, "Missing either @%s URL or @Url parameter.", this.m);
                }
            }
            if (!(this.o || this.p || this.n)) {
                if (this.i) {
                    throw a(null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
            }
            if (this.o) {
                if (!this.g) {
                    throw a(null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
            }
            if (this.p) {
                if (!this.h) {
                    throw a(null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            }
            return new blb(this);
        }
        throw a(null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
    }
}
