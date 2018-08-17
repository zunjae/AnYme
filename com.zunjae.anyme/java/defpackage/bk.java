package defpackage;

import java.util.Arrays;

public class bk extends be {
    protected be[] ac = new be[4];
    protected int ad = 0;

    public final void G() {
        this.ad = 0;
    }

    public final void a(be beVar) {
        int i = this.ad + 1;
        be[] beVarArr = this.ac;
        if (i > beVarArr.length) {
            this.ac = (be[]) Arrays.copyOf(beVarArr, beVarArr.length * 2);
        }
        be[] beVarArr2 = this.ac;
        int i2 = this.ad;
        beVarArr2[i2] = beVar;
        this.ad = i2 + 1;
    }
}
