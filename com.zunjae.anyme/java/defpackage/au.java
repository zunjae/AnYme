package defpackage;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class au {
    private static int j = 1;
    private static int k = 1;
    private static int l = 1;
    private static int m = 1;
    private static int n = 1;
    public int a = -1;
    int b = -1;
    public int c = 0;
    public float d;
    float[] e = new float[7];
    int f;
    al[] g = new al[8];
    int h = 0;
    public int i = 0;
    private String o;

    public au(int i) {
        this.f = i;
    }

    static void a() {
        k++;
    }

    public final void a(al alVar) {
        int i;
        int i2 = 0;
        while (true) {
            i = this.h;
            if (i2 >= i) {
                break;
            } else if (this.g[i2] != alVar) {
                i2++;
            } else {
                return;
            }
        }
        al[] alVarArr = this.g;
        if (i >= alVarArr.length) {
            this.g = (al[]) Arrays.copyOf(alVarArr, alVarArr.length * 2);
        }
        alVarArr = this.g;
        i = this.h;
        alVarArr[i] = alVar;
        this.h = i + 1;
    }

    public final void b() {
        this.o = null;
        this.f = av.e;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
        this.i = 0;
    }

    public final void b(al alVar) {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.g[i2] == alVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    al[] alVarArr = this.g;
                    int i4 = i2 + i3;
                    alVarArr[i4] = alVarArr[i4 + 1];
                }
                this.h--;
                return;
            }
        }
    }

    public final void c(al alVar) {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            al[] alVarArr = this.g;
            alVarArr[i2].d.a(alVarArr[i2], alVar);
        }
        this.h = 0;
    }

    public final String toString() {
        String str = BuildConfig.FLAVOR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.o);
        return stringBuilder.toString();
    }
}
