package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum bcy {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    private bcy(String str) {
        this.javaName = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bcy forJavaName(java.lang.String r2) {
        /*
        r0 = r2.hashCode();
        r1 = 79201641; // 0x4b88569 float:4.338071E-36 double:3.913081E-316;
        if (r0 == r1) goto L_0x003a;
    L_0x0009:
        r1 = 79923350; // 0x4c38896 float:4.5969714E-36 double:3.94873815E-316;
        if (r0 == r1) goto L_0x0030;
    L_0x000e:
        switch(r0) {
            case -503070503: goto L_0x0026;
            case -503070502: goto L_0x001c;
            case -503070501: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x0044;
    L_0x0012:
        r0 = "TLSv1.3";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x001a:
        r0 = 0;
        goto L_0x0045;
    L_0x001c:
        r0 = "TLSv1.2";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0024:
        r0 = 1;
        goto L_0x0045;
    L_0x0026:
        r0 = "TLSv1.1";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x002e:
        r0 = 2;
        goto L_0x0045;
    L_0x0030:
        r0 = "TLSv1";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0038:
        r0 = 3;
        goto L_0x0045;
    L_0x003a:
        r0 = "SSLv3";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0042:
        r0 = 4;
        goto L_0x0045;
    L_0x0044:
        r0 = -1;
    L_0x0045:
        switch(r0) {
            case 0: goto L_0x0064;
            case 1: goto L_0x0061;
            case 2: goto L_0x005e;
            case 3: goto L_0x005b;
            case 4: goto L_0x0058;
            default: goto L_0x0048;
        };
    L_0x0048:
        r0 = new java.lang.IllegalArgumentException;
        r2 = java.lang.String.valueOf(r2);
        r1 = "Unexpected TLS version: ";
        r2 = r1.concat(r2);
        r0.<init>(r2);
        throw r0;
    L_0x0058:
        r2 = SSL_3_0;
        return r2;
    L_0x005b:
        r2 = TLS_1_0;
        return r2;
    L_0x005e:
        r2 = TLS_1_1;
        return r2;
    L_0x0061:
        r2 = TLS_1_2;
        return r2;
    L_0x0064:
        r2 = TLS_1_3;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcy.forJavaName(java.lang.String):bcy");
    }

    static List<bcy> forJavaNames(String... strArr) {
        List arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(bcy.forJavaName(forJavaName));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String javaName() {
        return this.javaName;
    }
}
