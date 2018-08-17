package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class fl implements eg {
    private final String a;
    private final int b;
    private final int c;
    private final ei d;
    private final ei e;
    private final ek f;
    private final ej g;
    private final ld h;
    private final ef i;
    private final eg j;
    private String k;
    private int l;
    private eg m;

    public fl(String str, eg egVar, int i, int i2, ei eiVar, ei eiVar2, ek ekVar, ej ejVar, ld ldVar, ef efVar) {
        this.a = str;
        this.j = egVar;
        this.b = i;
        this.c = i2;
        this.d = eiVar;
        this.e = eiVar2;
        this.f = ekVar;
        this.g = ejVar;
        this.h = ldVar;
        this.i = efVar;
    }

    public final eg a() {
        if (this.m == null) {
            this.m = new fs(this.a, this.j);
        }
        return this.m;
    }

    public final void a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.b).putInt(this.c).array();
        this.j.a(messageDigest);
        messageDigest.update(this.a.getBytes("UTF-8"));
        messageDigest.update(array);
        ei eiVar = this.d;
        messageDigest.update((eiVar != null ? eiVar.a() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        eiVar = this.e;
        messageDigest.update((eiVar != null ? eiVar.a() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        ek ekVar = this.f;
        messageDigest.update((ekVar != null ? ekVar.a() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        ej ejVar = this.g;
        messageDigest.update((ejVar != null ? ejVar.a() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        ef efVar = this.i;
        messageDigest.update((efVar != null ? efVar.a() : BuildConfig.FLAVOR).getBytes("UTF-8"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                fl flVar = (fl) obj;
                if (!this.a.equals(flVar.a) || !this.j.equals(flVar.j) || this.c != flVar.c || this.b != flVar.b) {
                    return false;
                }
                if (((this.f == null ? 1 : 0) ^ (flVar.f == null ? 1 : 0)) != 0) {
                    return false;
                }
                ek ekVar = this.f;
                if (ekVar != null && !ekVar.a().equals(flVar.f.a())) {
                    return false;
                }
                if (((this.e == null ? 1 : 0) ^ (flVar.e == null ? 1 : 0)) != 0) {
                    return false;
                }
                ei eiVar = this.e;
                if (eiVar != null && !eiVar.a().equals(flVar.e.a())) {
                    return false;
                }
                if (((this.d == null ? 1 : 0) ^ (flVar.d == null ? 1 : 0)) != 0) {
                    return false;
                }
                eiVar = this.d;
                if (eiVar != null && !eiVar.a().equals(flVar.d.a())) {
                    return false;
                }
                if (((this.g == null ? 1 : 0) ^ (flVar.g == null ? 1 : 0)) != 0) {
                    return false;
                }
                ej ejVar = this.g;
                if (ejVar != null && !ejVar.a().equals(flVar.g.a())) {
                    return false;
                }
                if (((this.h == null ? 1 : 0) ^ (flVar.h == null ? 1 : 0)) != 0) {
                    return false;
                }
                ld ldVar = this.h;
                if (ldVar != null && !ldVar.a().equals(flVar.h.a())) {
                    return false;
                }
                if (((this.i == null ? 1 : 0) ^ (flVar.i == null ? 1 : 0)) != 0) {
                    return false;
                }
                ef efVar = this.i;
                return efVar == null || efVar.a().equals(flVar.i.a());
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.l == 0) {
            this.l = this.a.hashCode();
            this.l = (this.l * 31) + this.j.hashCode();
            this.l = (this.l * 31) + this.b;
            this.l = (this.l * 31) + this.c;
            int i = this.l * 31;
            ei eiVar = this.d;
            int i2 = 0;
            this.l = i + (eiVar != null ? eiVar.a().hashCode() : 0);
            i = this.l * 31;
            eiVar = this.e;
            this.l = i + (eiVar != null ? eiVar.a().hashCode() : 0);
            i = this.l * 31;
            ek ekVar = this.f;
            this.l = i + (ekVar != null ? ekVar.a().hashCode() : 0);
            i = this.l * 31;
            ej ejVar = this.g;
            this.l = i + (ejVar != null ? ejVar.a().hashCode() : 0);
            i = this.l * 31;
            ld ldVar = this.h;
            this.l = i + (ldVar != null ? ldVar.a().hashCode() : 0);
            i = this.l * 31;
            ef efVar = this.i;
            if (efVar != null) {
                i2 = efVar.a().hashCode();
            }
            this.l = i + i2;
        }
        return this.l;
    }

    public final String toString() {
        if (this.k == null) {
            StringBuilder stringBuilder = new StringBuilder("EngineKey{");
            stringBuilder.append(this.a);
            stringBuilder.append('+');
            stringBuilder.append(this.j);
            stringBuilder.append("+[");
            stringBuilder.append(this.b);
            stringBuilder.append('x');
            stringBuilder.append(this.c);
            stringBuilder.append("]+'");
            ei eiVar = this.d;
            stringBuilder.append(eiVar != null ? eiVar.a() : BuildConfig.FLAVOR);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ei eiVar2 = this.e;
            stringBuilder.append(eiVar2 != null ? eiVar2.a() : BuildConfig.FLAVOR);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ek ekVar = this.f;
            stringBuilder.append(ekVar != null ? ekVar.a() : BuildConfig.FLAVOR);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ej ejVar = this.g;
            stringBuilder.append(ejVar != null ? ejVar.a() : BuildConfig.FLAVOR);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ld ldVar = this.h;
            stringBuilder.append(ldVar != null ? ldVar.a() : BuildConfig.FLAVOR);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ef efVar = this.i;
            stringBuilder.append(efVar != null ? efVar.a() : BuildConfig.FLAVOR);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            this.k = stringBuilder.toString();
        }
        return this.k;
    }
}
